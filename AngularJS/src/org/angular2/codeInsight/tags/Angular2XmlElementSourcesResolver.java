// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.angular2.codeInsight.tags;

import com.intellij.psi.PsiElement;
import com.intellij.psi.xml.XmlTag;
import com.intellij.util.containers.MultiMap;
import org.angular2.codeInsight.Angular2DeclarationsScope;
import org.angular2.entities.Angular2Declaration;
import org.angular2.entities.Angular2Directive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Function;

import static com.intellij.util.containers.ContainerUtil.filterIsInstance;
import static org.angular2.codeInsight.Angular2DeclarationsScope.DeclarationProximity.IN_SCOPE;
import static org.angular2.codeInsight.Angular2DeclarationsScope.DeclarationProximity.NOT_REACHABLE;

public class Angular2XmlElementSourcesResolver {
  private final XmlTag myScope;
  private final Collection<?> mySources;

  public Angular2XmlElementSourcesResolver(@Nullable XmlTag scope, @NotNull Collection<?> sources) {
    myScope = scope;
    mySources = new ArrayList<>(sources);
  }

  public XmlTag getScope() {
    return myScope;
  }

  public Collection<?> getSources() {
    return mySources;
  }

  @NotNull
  public List<Angular2Directive> getSourceDirectives() {
    return filterIsInstance(mySources, Angular2Directive.class);
  }

  @NotNull
  public Collection<PsiElement> getDeclarations(@NotNull Function<Angular2Directive, Collection<? extends PsiElement>> getProperties,
                                                @NotNull Function<Angular2Directive, Collection<? extends PsiElement>> getSelectors) {
    Set<PsiElement> result = new HashSet<>(getNonDirectiveElements());
    MultiMap<Angular2DeclarationsScope.DeclarationProximity, Angular2Directive> directivesByProximity = getDeclarationsByProximity();
    directivesByProximity.remove(NOT_REACHABLE);

    MultiMap<Angular2DeclarationsScope.DeclarationProximity, PsiElement> fieldsByProximity =
      mapValues(directivesByProximity, getProperties);
    if (!fieldsByProximity.get(IN_SCOPE).isEmpty()) {
      result.addAll(fieldsByProximity.get(IN_SCOPE));
      return result;
    }
    MultiMap<Angular2DeclarationsScope.DeclarationProximity, PsiElement> selectorsByProximity =
      mapValues(directivesByProximity, getSelectors);
    if (!selectorsByProximity.get(IN_SCOPE).isEmpty()) {
      result.addAll(selectorsByProximity.get(IN_SCOPE));
      return result;
    }

    if (!fieldsByProximity.isEmpty()) {
      result.addAll(fieldsByProximity.values());
    }
    else {
      result.addAll(selectorsByProximity.values());
    }
    return result;
  }


  @NotNull
  private List<PsiElement> getNonDirectiveElements() {
    List<PsiElement> result = new ArrayList<>(mySources.size());
    for (Object source : mySources) {
      if (source instanceof PsiElement && !(source instanceof Angular2Declaration)) {
        result.add((PsiElement)source);
      }
    }
    return result;
  }

  @NotNull
  private MultiMap<Angular2DeclarationsScope.DeclarationProximity, Angular2Directive> getDeclarationsByProximity() {
    MultiMap<Angular2DeclarationsScope.DeclarationProximity, Angular2Directive> result = new MultiMap<>();
    Angular2DeclarationsScope scope = myScope != null ? new Angular2DeclarationsScope(myScope)
                                                      : null;
    for (Object source : mySources) {
      if (source instanceof Angular2Directive) {
        Angular2Directive directive = (Angular2Directive)source;
        result.putValue(scope != null ? scope.getDeclarationProximity(directive) : IN_SCOPE, directive);
      }
    }
    return result;
  }

  private static <K, V, T> MultiMap<K, T> mapValues(@NotNull MultiMap<K, ? extends V> source,
                                                    @NotNull Function<? super V, Collection<? extends T>> mapper) {
    MultiMap<K, T> result = MultiMap.createSet();
    source.entrySet().forEach(entry -> entry.getValue().forEach(
      value -> result.putValues(entry.getKey(), mapper.apply(value))));
    return result;
  }
}
