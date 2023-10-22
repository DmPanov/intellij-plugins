// Generated by JFlex 1.9.2 http://jflex.de/  (tweaked for IntelliJ platform)
// source: Angular2.flex

package org.angular2.lang.expr.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.lexer.FlexLexer;

import static org.angular2.lang.expr.lexer.Angular2TokenTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;


class _Angular2Lexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int YYSTRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\1\u2200\1\u1f00\1\u2300"+
    "\1\u2400\2\u1f00\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700"+
    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100"+
    "\1\u2e00\41\u1f00\1\u0100\1\u2f00\1\u3000\1\u0100\1\u3100\1\u3200"+
    "\1\u3300\1\u3400\1\u1f00\1\u3500\1\u3600\1\u3700\1\u3800\1\u0100"+
    "\1\u3900\1\u3a00\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u1f00"+
    "\1\u4000\1\u4100\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700"+
    "\1\u4800\1\u4900\1\u4a00\1\u4b00\1\u1f00\1\u4c00\1\u4d00\1\u4e00"+
    "\1\u1f00\3\u0100\1\u4f00\1\u5000\1\u5100\12\u1f00\4\u0100\1\u5200"+
    "\17\u1f00\2\u0100\1\u5300\41\u1f00\2\u0100\1\u5400\1\u5500\2\u1f00"+
    "\1\u5600\1\u5700\27\u0100\1\u5800\2\u0100\1\u5900\45\u1f00\1\u0100"+
    "\1\u5a00\1\u5b00\11\u1f00\1\u5c00\27\u1f00\1\u5d00\1\u5e00\1\u5f00"+
    "\1\u6000\11\u1f00\1\u6100\1\u6200\5\u1f00\1\u6300\1\u6400\4\u1f00"+
    "\1\u6500\21\u1f00\246\u0100\1\u6600\20\u0100\1\u6700\1\u6800\25\u0100"+
    "\1\u6900\34\u0100\1\u6a00\14\u1f00\2\u0100\1\u6b00\u0e05\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\1\1\0\1\3\22\0\1\1"+
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\12\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\0\4\32"+
    "\1\33\1\32\21\34\1\35\2\34\1\36\1\37\1\40"+
    "\1\41\1\34\1\0\1\42\2\32\1\43\1\44\1\45"+
    "\1\34\1\46\1\47\2\34\1\50\1\34\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\34"+
    "\1\35\2\34\1\62\1\63\1\64\42\0\1\1\11\0"+
    "\1\65\12\0\1\65\4\0\1\65\5\0\27\65\1\0"+
    "\37\65\1\0\u01ca\65\4\0\14\65\16\0\5\65\7\0"+
    "\1\65\1\0\1\65\201\0\5\65\1\0\2\65\2\0"+
    "\4\65\1\0\1\65\6\0\1\65\1\0\3\65\1\0"+
    "\1\65\1\0\24\65\1\0\123\65\1\0\213\65\10\0"+
    "\246\65\1\0\46\65\2\0\1\65\6\0\51\65\107\0"+
    "\33\65\4\0\4\65\55\0\53\65\43\0\2\65\1\0"+
    "\143\65\1\0\1\65\17\0\2\65\7\0\2\65\12\0"+
    "\3\65\2\0\1\65\20\0\1\65\1\0\36\65\35\0"+
    "\131\65\13\0\1\65\30\0\41\65\11\0\2\65\4\0"+
    "\1\65\5\0\26\65\4\0\1\65\11\0\1\65\3\0"+
    "\1\65\27\0\31\65\7\0\13\65\65\0\25\65\1\0"+
    "\10\65\106\0\66\65\3\0\1\65\22\0\1\65\7\0"+
    "\12\65\17\0\20\65\4\0\10\65\2\0\2\65\2\0"+
    "\26\65\1\0\7\65\1\0\1\65\3\0\4\65\3\0"+
    "\1\65\20\0\1\65\15\0\2\65\1\0\3\65\16\0"+
    "\2\65\12\0\1\65\10\0\6\65\4\0\2\65\2\0"+
    "\26\65\1\0\7\65\1\0\2\65\1\0\2\65\1\0"+
    "\2\65\37\0\4\65\1\0\1\65\23\0\3\65\20\0"+
    "\11\65\1\0\3\65\1\0\26\65\1\0\7\65\1\0"+
    "\2\65\1\0\5\65\3\0\1\65\22\0\1\65\17\0"+
    "\2\65\27\0\1\65\13\0\10\65\2\0\2\65\2\0"+
    "\26\65\1\0\7\65\1\0\2\65\1\0\5\65\3\0"+
    "\1\65\36\0\2\65\1\0\3\65\17\0\1\65\21\0"+
    "\1\65\1\0\6\65\3\0\3\65\1\0\4\65\3\0"+
    "\2\65\1\0\1\65\1\0\2\65\3\0\2\65\3\0"+
    "\3\65\3\0\14\65\26\0\1\65\64\0\10\65\1\0"+
    "\3\65\1\0\27\65\1\0\20\65\3\0\1\65\32\0"+
    "\3\65\5\0\2\65\36\0\1\65\4\0\10\65\1\0"+
    "\3\65\1\0\27\65\1\0\12\65\1\0\5\65\3\0"+
    "\1\65\40\0\1\65\1\0\2\65\17\0\2\65\22\0"+
    "\10\65\1\0\3\65\1\0\51\65\2\0\1\65\20\0"+
    "\1\65\5\0\3\65\10\0\3\65\30\0\6\65\5\0"+
    "\22\65\3\0\30\65\1\0\11\65\1\0\1\65\2\0"+
    "\7\65\72\0\60\65\1\0\2\65\14\0\7\65\72\0"+
    "\2\65\1\0\1\65\1\0\5\65\1\0\30\65\1\0"+
    "\1\65\1\0\12\65\1\0\2\65\11\0\1\65\2\0"+
    "\5\65\1\0\1\65\25\0\4\65\40\0\1\65\77\0"+
    "\10\65\1\0\44\65\33\0\5\65\163\0\53\65\24\0"+
    "\1\65\20\0\6\65\4\0\4\65\3\0\1\65\3\0"+
    "\2\65\7\0\3\65\4\0\15\65\14\0\1\65\21\0"+
    "\46\65\1\0\1\65\5\0\1\65\2\0\53\65\1\0"+
    "\115\65\1\0\4\65\2\0\7\65\1\0\1\65\1\0"+
    "\4\65\2\0\51\65\1\0\4\65\2\0\41\65\1\0"+
    "\4\65\2\0\7\65\1\0\1\65\1\0\4\65\2\0"+
    "\17\65\1\0\71\65\1\0\4\65\2\0\103\65\45\0"+
    "\20\65\20\0\126\65\2\0\6\65\3\0\u016c\65\2\0"+
    "\21\65\1\0\32\65\5\0\113\65\6\0\10\65\7\0"+
    "\15\65\1\0\4\65\16\0\22\65\16\0\22\65\16\0"+
    "\15\65\1\0\3\65\17\0\64\65\43\0\1\65\4\0"+
    "\1\65\103\0\131\65\7\0\5\65\2\0\42\65\1\0"+
    "\1\65\5\0\106\65\12\0\37\65\61\0\36\65\2\0"+
    "\5\65\13\0\54\65\4\0\32\65\66\0\27\65\11\0"+
    "\65\65\122\0\1\65\135\0\57\65\21\0\7\65\67\0"+
    "\36\65\15\0\2\65\12\0\54\65\32\0\44\65\51\0"+
    "\3\65\12\0\44\65\2\0\11\65\7\0\53\65\2\0"+
    "\3\65\51\0\4\65\1\0\6\65\1\0\2\65\3\0"+
    "\1\65\5\0\300\65\100\0\26\65\2\0\6\65\2\0"+
    "\46\65\2\0\6\65\2\0\10\65\1\0\1\65\1\0"+
    "\1\65\1\0\1\65\1\0\37\65\2\0\65\65\1\0"+
    "\7\65\1\0\1\65\3\0\3\65\1\0\7\65\3\0"+
    "\4\65\2\0\6\65\4\0\15\65\5\0\3\65\1\0"+
    "\7\65\164\0\1\65\15\0\1\65\20\0\15\65\145\0"+
    "\1\65\4\0\1\65\2\0\12\65\1\0\1\65\3\0"+
    "\5\65\6\0\1\65\1\0\1\65\1\0\1\65\1\0"+
    "\4\65\1\0\13\65\2\0\4\65\5\0\5\65\4\0"+
    "\1\65\64\0\2\65\u017b\0\57\65\1\0\57\65\1\0"+
    "\205\65\6\0\4\65\3\0\2\65\14\0\46\65\1\0"+
    "\1\65\5\0\1\65\2\0\70\65\7\0\1\65\20\0"+
    "\27\65\11\0\7\65\1\0\7\65\1\0\7\65\1\0"+
    "\7\65\1\0\7\65\1\0\7\65\1\0\7\65\1\0"+
    "\7\65\120\0\1\65\325\0\2\65\52\0\5\65\5\0"+
    "\2\65\4\0\126\65\6\0\3\65\1\0\132\65\1\0"+
    "\4\65\5\0\53\65\1\0\136\65\21\0\33\65\65\0"+
    "\306\65\112\0\360\65\20\0\215\65\103\0\56\65\2\0"+
    "\15\65\3\0\20\65\12\0\2\65\24\0\57\65\20\0"+
    "\37\65\2\0\106\65\61\0\11\65\2\0\147\65\2\0"+
    "\65\65\2\0\5\65\60\0\13\65\1\0\3\65\1\0"+
    "\4\65\1\0\27\65\35\0\64\65\16\0\62\65\76\0"+
    "\6\65\3\0\1\65\1\0\2\65\13\0\34\65\12\0"+
    "\27\65\31\0\35\65\7\0\57\65\34\0\1\65\20\0"+
    "\5\65\1\0\12\65\12\0\5\65\1\0\51\65\27\0"+
    "\3\65\1\0\10\65\24\0\27\65\3\0\1\65\3\0"+
    "\62\65\1\0\1\65\3\0\2\65\2\0\5\65\2\0"+
    "\1\65\1\0\1\65\30\0\3\65\2\0\13\65\7\0"+
    "\3\65\14\0\6\65\2\0\6\65\2\0\6\65\11\0"+
    "\7\65\1\0\7\65\1\0\53\65\1\0\14\65\10\0"+
    "\163\65\35\0\244\65\14\0\27\65\4\0\61\65\4\0"+
    "\156\65\2\0\152\65\46\0\7\65\14\0\5\65\5\0"+
    "\1\65\1\0\12\65\1\0\15\65\1\0\5\65\1\0"+
    "\1\65\1\0\2\65\1\0\2\65\1\0\154\65\41\0"+
    "\153\65\22\0\100\65\2\0\66\65\50\0\14\65\164\0"+
    "\5\65\1\0\207\65\44\0\32\65\6\0\32\65\13\0"+
    "\131\65\3\0\6\65\2\0\6\65\2\0\6\65\2\0"+
    "\3\65\43\0\14\65\1\0\32\65\1\0\23\65\1\0"+
    "\2\65\1\0\17\65\2\0\16\65\42\0\173\65\205\0"+
    "\35\65\3\0\61\65\57\0\40\65\15\0\24\65\1\0"+
    "\10\65\6\0\46\65\12\0\36\65\2\0\44\65\4\0"+
    "\10\65\60\0\236\65\22\0\44\65\4\0\44\65\4\0"+
    "\50\65\10\0\64\65\234\0\67\65\11\0\26\65\12\0"+
    "\10\65\230\0\6\65\2\0\1\65\1\0\54\65\1\0"+
    "\2\65\3\0\1\65\2\0\27\65\12\0\27\65\11\0"+
    "\37\65\101\0\23\65\1\0\2\65\12\0\26\65\12\0"+
    "\32\65\106\0\70\65\6\0\2\65\100\0\1\65\17\0"+
    "\4\65\1\0\3\65\1\0\35\65\52\0\35\65\3\0"+
    "\35\65\43\0\10\65\1\0\34\65\33\0\66\65\12\0"+
    "\26\65\12\0\23\65\15\0\22\65\156\0\111\65\67\0"+
    "\63\65\15\0\63\65\15\0\44\65\334\0\35\65\12\0"+
    "\1\65\10\0\26\65\232\0\27\65\14\0\65\65\113\0"+
    "\55\65\40\0\31\65\32\0\44\65\35\0\1\65\13\0"+
    "\43\65\3\0\1\65\14\0\60\65\16\0\4\65\25\0"+
    "\1\65\1\0\1\65\43\0\22\65\1\0\31\65\124\0"+
    "\7\65\1\0\1\65\1\0\4\65\1\0\17\65\1\0"+
    "\12\65\7\0\57\65\46\0\10\65\2\0\2\65\2\0"+
    "\26\65\1\0\7\65\1\0\2\65\1\0\5\65\3\0"+
    "\1\65\22\0\1\65\14\0\5\65\236\0\65\65\22\0"+
    "\4\65\24\0\1\65\40\0\60\65\24\0\2\65\1\0"+
    "\1\65\270\0\57\65\51\0\4\65\44\0\60\65\24\0"+
    "\1\65\73\0\53\65\15\0\1\65\107\0\33\65\345\0"+
    "\54\65\164\0\100\65\37\0\1\65\240\0\10\65\2\0"+
    "\47\65\20\0\1\65\1\0\1\65\34\0\1\65\12\0"+
    "\50\65\7\0\1\65\25\0\1\65\13\0\56\65\23\0"+
    "\1\65\42\0\71\65\7\0\11\65\1\0\45\65\21\0"+
    "\1\65\61\0\36\65\160\0\7\65\1\0\2\65\1\0"+
    "\46\65\25\0\1\65\31\0\6\65\1\0\2\65\1\0"+
    "\40\65\16\0\1\65\u0147\0\23\65\15\0\232\65\346\0"+
    "\304\65\274\0\57\65\321\0\107\65\271\0\71\65\7\0"+
    "\37\65\161\0\36\65\22\0\60\65\20\0\4\65\37\0"+
    "\25\65\5\0\23\65\260\0\100\65\200\0\113\65\5\0"+
    "\1\65\102\0\15\65\100\0\2\65\1\0\1\65\34\0"+
    "\370\65\10\0\363\65\15\0\37\65\61\0\3\65\21\0"+
    "\4\65\10\0\u018c\65\4\0\153\65\5\0\15\65\3\0"+
    "\11\65\7\0\12\65\146\0\125\65\1\0\107\65\1\0"+
    "\2\65\2\0\1\65\2\0\2\65\2\0\4\65\1\0"+
    "\14\65\1\0\1\65\1\0\7\65\1\0\101\65\1\0"+
    "\4\65\2\0\10\65\1\0\7\65\1\0\34\65\1\0"+
    "\4\65\1\0\5\65\1\0\1\65\3\0\7\65\1\0"+
    "\u0154\65\2\0\31\65\1\0\31\65\1\0\37\65\1\0"+
    "\31\65\1\0\37\65\1\0\31\65\1\0\37\65\1\0"+
    "\31\65\1\0\37\65\1\0\31\65\1\0\10\65\64\0"+
    "\55\65\12\0\7\65\20\0\1\65\u0171\0\54\65\24\0"+
    "\305\65\73\0\104\65\7\0\1\65\264\0\4\65\1\0"+
    "\33\65\1\0\2\65\1\0\1\65\2\0\1\65\1\0"+
    "\12\65\1\0\4\65\1\0\1\65\1\0\1\65\6\0"+
    "\1\65\4\0\1\65\1\0\1\65\1\0\1\65\1\0"+
    "\3\65\1\0\2\65\1\0\1\65\2\0\1\65\1\0"+
    "\1\65\1\0\1\65\1\0\1\65\1\0\1\65\1\0"+
    "\2\65\1\0\1\65\2\0\4\65\1\0\7\65\1\0"+
    "\4\65\1\0\4\65\1\0\1\65\1\0\12\65\1\0"+
    "\21\65\5\0\3\65\1\0\5\65\1\0\21\65\104\0"+
    "\327\65\51\0\65\65\13\0\336\65\2\0\u0182\65\16\0"+
    "\u0131\65\37\0\36\65\342\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[27648];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\1\1\32\1\33\11\6\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\37\1\42\1\40\1\0"+
    "\1\43\1\44\2\0\1\22\1\45\1\22\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\2\6\1\54\6\6\1\55"+
    "\4\0\2\56\1\0\1\57\2\0\1\22\1\60\1\61"+
    "\2\6\1\62\4\6\1\63\2\0\1\64\4\0\1\65"+
    "\1\66\2\0\1\67\1\6\1\70\1\71\1\72\1\6"+
    "\5\0\1\66\2\0\1\73\1\6\3\0\1\66\1\74"+
    "\1\75\1\6\1\76\1\77\2\6\1\100";

  private static int [] zzUnpackAction() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\330\0\154\0\154\0\u010e"+
    "\0\154\0\u0144\0\154\0\154\0\154\0\154\0\154\0\154"+
    "\0\154\0\u017a\0\u01b0\0\u01e6\0\154\0\154\0\u021c\0\u0252"+
    "\0\u0288\0\u02be\0\154\0\u02f4\0\154\0\154\0\u032a\0\u0360"+
    "\0\u0396\0\u03cc\0\u0402\0\u0438\0\u046e\0\u04a4\0\u04da\0\154"+
    "\0\u0510\0\154\0\u0546\0\154\0\154\0\u057c\0\154\0\u05b2"+
    "\0\u02f4\0\u05e8\0\154\0\u061e\0\u0654\0\u068a\0\u06c0\0\u06f6"+
    "\0\154\0\u072c\0\154\0\154\0\154\0\u0762\0\u0798\0\u07ce"+
    "\0\u010e\0\u0804\0\u083a\0\u0870\0\u08a6\0\u08dc\0\u0912\0\154"+
    "\0\u0948\0\u097e\0\u09b4\0\u09ea\0\154\0\u0a20\0\u0a56\0\154"+
    "\0\u0a8c\0\u0ac2\0\u0af8\0\154\0\154\0\u0b2e\0\u0b64\0\u010e"+
    "\0\u0b9a\0\u0bd0\0\u0c06\0\u0c3c\0\u010e\0\u0c72\0\u0ca8\0\154"+
    "\0\u0cde\0\u0d14\0\u0d4a\0\u0d80\0\154\0\u0db6\0\u0dec\0\u0e22"+
    "\0\u010e\0\u0e58\0\u010e\0\u010e\0\u010e\0\u0e8e\0\u0ec4\0\u0efa"+
    "\0\u0f30\0\u0f66\0\u0f9c\0\u0fd2\0\u1008\0\u103e\0\u010e\0\u1074"+
    "\0\u10aa\0\u10e0\0\u1116\0\u114c\0\154\0\154\0\u1182\0\154"+
    "\0\154\0\u11b8\0\u11ee\0\u010e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\3\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\4\10\1\33\1\34\1\35\1\36\1\37\1\10\1\40"+
    "\1\41\1\10\1\42\1\43\1\44\5\10\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\3\2\53\2\54\1\53"+
    "\1\55\3\53\1\56\1\57\24\53\1\60\26\53\67\0"+
    "\3\4\33\0\1\61\55\0\1\62\45\0\1\10\13\0"+
    "\1\10\6\0\4\10\4\0\20\10\15\0\1\63\30\0"+
    "\1\64\11\0\1\65\34\0\1\66\64\0\1\67\64\0"+
    "\1\66\1\0\1\24\7\0\1\70\10\0\1\70\50\0"+
    "\1\71\65\0\1\72\65\0\1\73\57\0\1\74\7\0"+
    "\1\75\36\0\1\4\72\0\1\10\13\0\1\10\6\0"+
    "\4\10\4\0\14\10\1\76\3\10\13\0\1\10\13\0"+
    "\1\10\6\0\4\10\4\0\6\10\1\77\11\10\13\0"+
    "\1\10\13\0\1\10\6\0\4\10\4\0\1\100\17\10"+
    "\13\0\1\10\13\0\1\10\6\0\4\10\4\0\3\10"+
    "\1\101\14\10\13\0\1\10\13\0\1\10\6\0\4\10"+
    "\4\0\2\10\1\102\15\10\13\0\1\10\13\0\1\10"+
    "\6\0\4\10\4\0\16\10\1\103\1\10\13\0\1\10"+
    "\13\0\1\10\6\0\4\10\4\0\4\10\1\104\6\10"+
    "\1\105\4\10\13\0\1\10\13\0\1\10\6\0\4\10"+
    "\4\0\7\10\1\106\10\10\13\0\1\10\13\0\1\10"+
    "\6\0\4\10\4\0\1\107\17\10\67\0\1\110\2\0"+
    "\2\53\2\0\1\53\1\0\3\53\2\0\24\53\1\0"+
    "\26\53\6\0\1\111\15\0\1\112\5\0\4\112\4\0"+
    "\1\113\11\112\1\114\5\112\3\0\1\112\2\115\2\0"+
    "\5\115\1\116\46\115\1\117\5\115\27\0\1\120\111\0"+
    "\1\121\72\0\1\122\30\0\1\66\7\0\1\70\10\0"+
    "\1\70\21\0\66\67\16\0\1\123\1\0\1\123\2\0"+
    "\1\123\71\0\1\124\45\0\1\10\11\0\1\125\1\0"+
    "\1\10\6\0\4\10\4\0\20\10\13\0\1\10\13\0"+
    "\1\10\6\0\4\10\4\0\14\10\1\126\3\10\13\0"+
    "\1\10\13\0\1\10\6\0\4\10\4\0\6\10\1\127"+
    "\11\10\13\0\1\10\13\0\1\10\6\0\4\10\4\0"+
    "\15\10\1\130\2\10\13\0\1\10\13\0\1\10\6\0"+
    "\4\10\4\0\6\10\1\131\11\10\13\0\1\10\13\0"+
    "\1\10\6\0\4\10\4\0\5\10\1\132\12\10\13\0"+
    "\1\10\13\0\1\10\6\0\4\10\4\0\16\10\1\133"+
    "\1\10\13\0\1\10\13\0\1\10\6\0\4\10\4\0"+
    "\1\10\1\134\16\10\13\0\1\10\13\0\1\10\6\0"+
    "\4\10\4\0\13\10\1\135\4\10\27\0\1\136\11\0"+
    "\1\137\50\0\2\112\1\0\2\112\1\140\4\0\4\112"+
    "\4\0\20\112\3\0\1\112\20\0\2\112\1\0\2\112"+
    "\1\140\4\0\4\112\4\0\11\112\1\141\6\112\3\0"+
    "\1\112\20\0\2\112\1\0\2\112\1\140\4\0\4\112"+
    "\4\0\16\112\1\142\1\112\3\0\1\112\6\0\1\143"+
    "\15\0\1\144\5\0\4\144\4\0\20\144\3\0\1\144"+
    "\23\145\1\146\6\145\2\146\6\145\4\146\20\145\52\0"+
    "\1\147\65\0\1\150\36\0\1\123\51\0\1\10\13\0"+
    "\1\10\6\0\4\10\4\0\2\10\1\151\15\10\13\0"+
    "\1\10\13\0\1\10\6\0\4\10\4\0\14\10\1\152"+
    "\3\10\13\0\1\10\13\0\1\10\6\0\4\10\4\0"+
    "\6\10\1\153\11\10\13\0\1\10\13\0\1\10\6\0"+
    "\4\10\4\0\14\10\1\154\3\10\13\0\1\10\13\0"+
    "\1\10\6\0\4\10\4\0\2\10\1\155\15\10\13\0"+
    "\1\10\13\0\1\10\6\0\4\10\4\0\2\10\1\156"+
    "\15\10\27\0\1\136\1\0\1\140\63\0\1\157\6\0"+
    "\2\157\6\0\4\157\40\0\2\112\1\0\2\112\1\140"+
    "\4\0\4\112\4\0\10\112\1\160\7\112\3\0\1\112"+
    "\20\0\2\112\1\0\2\112\1\140\4\0\4\112\4\0"+
    "\10\112\1\161\7\112\3\0\1\112\23\0\1\162\11\0"+
    "\1\163\50\0\2\144\1\0\2\144\1\115\4\0\4\144"+
    "\4\0\20\144\3\0\1\144\23\0\1\164\6\0\2\164"+
    "\6\0\4\164\76\0\1\165\66\0\1\166\15\0\1\10"+
    "\13\0\1\10\6\0\4\10\4\0\2\10\1\167\15\10"+
    "\13\0\1\10\13\0\1\10\6\0\4\10\4\0\3\10"+
    "\1\170\14\10\27\0\1\157\1\0\1\140\4\0\2\157"+
    "\6\0\4\157\40\0\2\112\1\0\2\112\1\140\4\0"+
    "\4\112\4\0\14\112\1\171\3\112\3\0\1\112\20\0"+
    "\2\112\1\0\2\112\1\140\4\0\4\112\4\0\15\112"+
    "\1\172\2\112\3\0\1\112\23\0\1\162\1\0\1\115"+
    "\63\0\1\173\6\0\2\173\6\0\4\173\43\0\1\174"+
    "\6\0\2\174\6\0\4\174\45\0\1\175\65\0\1\176"+
    "\47\0\1\10\13\0\1\10\6\0\4\10\4\0\5\10"+
    "\1\177\12\10\24\0\2\112\1\0\2\112\1\200\4\0"+
    "\4\112\4\0\20\112\3\0\1\112\20\0\2\112\1\0"+
    "\2\112\1\201\4\0\4\112\4\0\20\112\3\0\1\112"+
    "\23\0\1\173\1\0\1\115\4\0\2\173\6\0\4\173"+
    "\43\0\1\115\6\0\2\115\6\0\4\115\27\0\1\10"+
    "\13\0\1\10\6\0\4\10\4\0\7\10\1\202\10\10"+
    "\13\0\1\10\13\0\1\10\6\0\4\10\4\0\2\10"+
    "\1\203\15\10\13\0\1\10\13\0\1\10\6\0\4\10"+
    "\4\0\1\10\1\204\16\10\4\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[4644];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\2\1\2\11\1\1\1\11\1\1\7\11"+
    "\3\1\2\11\4\1\1\11\1\1\2\11\11\1\1\11"+
    "\1\1\1\11\1\1\2\11\1\1\1\11\1\1\1\0"+
    "\1\1\1\11\2\0\3\1\1\11\1\1\3\11\12\1"+
    "\1\11\4\0\1\11\1\1\1\0\1\11\2\0\1\1"+
    "\2\11\10\1\2\0\1\11\4\0\1\11\1\1\2\0"+
    "\6\1\5\0\1\1\2\0\2\1\3\0\1\1\2\11"+
    "\1\1\2\11\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  private char quote;

  private String blockName;
  private int blockParamIndex;

  public _Angular2Lexer(Angular2Lexer.Config config) {
    this((java.io.Reader)null);
    if (config instanceof Angular2Lexer.BlockParameter blockParameter) {
      blockName = blockParameter.getName();
      blockParamIndex = blockParameter.getIndex();
    }
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _Angular2Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return BAD_CHARACTER;
            }
          // fall through
          case 65: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 66: break;
          case 3:
            { return EXCL;
            }
          // fall through
          case 67: break;
          case 4:
            { yybegin(YYSTRING); quote = '"'; return STRING_LITERAL_PART;
            }
          // fall through
          case 68: break;
          case 5:
            { return SHARP;
            }
          // fall through
          case 69: break;
          case 6:
            { return IDENTIFIER;
            }
          // fall through
          case 70: break;
          case 7:
            { return PERC;
            }
          // fall through
          case 71: break;
          case 8:
            { return AND;
            }
          // fall through
          case 72: break;
          case 9:
            { yybegin(YYSTRING); quote = '\''; return STRING_LITERAL_PART;
            }
          // fall through
          case 73: break;
          case 10:
            { return LPAR;
            }
          // fall through
          case 74: break;
          case 11:
            { return RPAR;
            }
          // fall through
          case 75: break;
          case 12:
            { return MULT;
            }
          // fall through
          case 76: break;
          case 13:
            { return PLUS;
            }
          // fall through
          case 77: break;
          case 14:
            { return COMMA;
            }
          // fall through
          case 78: break;
          case 15:
            { return MINUS;
            }
          // fall through
          case 79: break;
          case 16:
            { return DOT;
            }
          // fall through
          case 80: break;
          case 17:
            { return DIV;
            }
          // fall through
          case 81: break;
          case 18:
            { return NUMERIC_LITERAL;
            }
          // fall through
          case 82: break;
          case 19:
            { return COLON;
            }
          // fall through
          case 83: break;
          case 20:
            { return SEMICOLON;
            }
          // fall through
          case 84: break;
          case 21:
            { return LT;
            }
          // fall through
          case 85: break;
          case 22:
            { return EQ;
            }
          // fall through
          case 86: break;
          case 23:
            { return GT;
            }
          // fall through
          case 87: break;
          case 24:
            { return QUEST;
            }
          // fall through
          case 88: break;
          case 25:
            { return LBRACKET;
            }
          // fall through
          case 89: break;
          case 26:
            { return RBRACKET;
            }
          // fall through
          case 90: break;
          case 27:
            { return XOR;
            }
          // fall through
          case 91: break;
          case 28:
            { return LBRACE;
            }
          // fall through
          case 92: break;
          case 29:
            { return OR;
            }
          // fall through
          case 93: break;
          case 30:
            { return RBRACE;
            }
          // fall through
          case 94: break;
          case 31:
            { return STRING_LITERAL_PART;
            }
          // fall through
          case 95: break;
          case 32:
            { yypushback(yytext().length()); yybegin(YYINITIAL);
            }
          // fall through
          case 96: break;
          case 33:
            { if (quote == '"') yybegin(YYINITIAL); return STRING_LITERAL_PART;
            }
          // fall through
          case 97: break;
          case 34:
            { if (quote == '\'') yybegin(YYINITIAL); return STRING_LITERAL_PART;
            }
          // fall through
          case 98: break;
          case 35:
            { return NE;
            }
          // fall through
          case 99: break;
          case 36:
            { return ANDAND;
            }
          // fall through
          case 100: break;
          case 37:
            { return C_STYLE_COMMENT;
            }
          // fall through
          case 101: break;
          case 38:
            { return LE;
            }
          // fall through
          case 102: break;
          case 39:
            { return EQEQ;
            }
          // fall through
          case 103: break;
          case 40:
            { return GE;
            }
          // fall through
          case 104: break;
          case 41:
            { return ELVIS;
            }
          // fall through
          case 105: break;
          case 42:
            { return QUEST_QUEST;
            }
          // fall through
          case 106: break;
          case 43:
            { return AS_KEYWORD;
            }
          // fall through
          case 107: break;
          case 44:
            { return IF_KEYWORD;
            }
          // fall through
          case 108: break;
          case 45:
            { return OROR;
            }
          // fall through
          case 109: break;
          case 46:
            { return ESCAPE_SEQUENCE;
            }
          // fall through
          case 110: break;
          case 47:
            { return NEQEQ;
            }
          // fall through
          case 111: break;
          case 48:
            { return EQEQEQ;
            }
          // fall through
          case 112: break;
          case 49:
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, 2);
            { return IDENTIFIER;
            }
          // fall through
          case 113: break;
          case 50:
            { return LET_KEYWORD;
            }
          // fall through
          case 114: break;
          case 51:
            { return VAR_KEYWORD;
            }
          // fall through
          case 115: break;
          case 52:
            { return XML_CHAR_ENTITY_REF;
            }
          // fall through
          case 116: break;
          case 53:
            { yypushback(1); return INVALID_ESCAPE_SEQUENCE;
            }
          // fall through
          case 117: break;
          case 54:
            { return INVALID_ESCAPE_SEQUENCE;
            }
          // fall through
          case 118: break;
          case 55:
            { return ELSE_KEYWORD;
            }
          // fall through
          case 119: break;
          case 56:
            { return NULL_KEYWORD;
            }
          // fall through
          case 120: break;
          case 57:
            { return THIS_KEYWORD;
            }
          // fall through
          case 121: break;
          case 58:
            { return TRUE_KEYWORD;
            }
          // fall through
          case 122: break;
          case 59:
            { return FALSE_KEYWORD;
            }
          // fall through
          case 123: break;
          case 60:
            { yybegin(YYSTRING); quote = '\''; return XML_CHAR_ENTITY_REF;
            }
          // fall through
          case 124: break;
          case 61:
            { yybegin(YYSTRING); quote = '"'; return XML_CHAR_ENTITY_REF;
            }
          // fall through
          case 125: break;
          case 62:
            { if (quote == '\'') yybegin(YYINITIAL); return XML_CHAR_ENTITY_REF;
            }
          // fall through
          case 126: break;
          case 63:
            { if (quote == '"') yybegin(YYINITIAL); return XML_CHAR_ENTITY_REF;
            }
          // fall through
          case 127: break;
          case 64:
            { return UNDEFINED_KEYWORD;
            }
          // fall through
          case 128: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
