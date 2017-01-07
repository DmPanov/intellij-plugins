/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package name.kropp.intellij.makefile;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static name.kropp.intellij.makefile.psi.MakefileTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>MakefileLexer.flex</tt>
 */
public class _MakefileLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int PREREQUISITES = 2;
  public static final int INCLUDES = 4;
  public static final int SOURCE = 6;
  public static final int DEFINE = 8;
  public static final int DEFINEBODY = 10;
  public static final int CONDITIONALS = 12;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6, 6
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1040 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\177\200");

  /* The ZZ_CMAP_A table has 256 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\5\1\1\2\0\1\4\22\0\1\2\1\13\1\0\1\6\7\0\1\13\1\0\1\23\14\0\1\7\1\10"+
    "\1\0\1\12\1\0\1\13\34\0\1\3\4\0\1\27\1\0\1\16\1\21\1\22\1\32\1\0\1\31\1\14"+
    "\2\0\1\17\1\0\1\15\1\34\1\26\1\33\1\35\1\24\1\30\1\20\1\25\1\0\1\36\3\0\1"+
    "\11\203\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\7\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\10\1\1\10\1\7\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\7\1\17\1\7\2\20\1\21\1\0\13\1"+
    "\2\15\1\0\1\20\13\1\1\20\3\1\1\22\3\1"+
    "\1\23\4\1\1\20\2\1\1\24\2\1\1\25\1\1"+
    "\1\26\2\1\1\27\1\1\1\30\1\1\1\31\1\32"+
    "\2\1\1\33\1\1\1\34\1\1\1\35\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[102];
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
    "\0\0\0\37\0\76\0\135\0\174\0\233\0\272\0\331"+
    "\0\370\0\u0117\0\u0136\0\u0155\0\u0174\0\u0193\0\u01b2\0\u01d1"+
    "\0\u01f0\0\u020f\0\u022e\0\u024d\0\u026c\0\u028b\0\u02aa\0\u02c9"+
    "\0\u0193\0\331\0\331\0\u02e8\0\u0307\0\u0326\0\u0345\0\u0364"+
    "\0\u0193\0\u0383\0\u03a2\0\u03c1\0\u03e0\0\u01b2\0\u03ff\0\u041e"+
    "\0\u043d\0\u045c\0\u047b\0\u049a\0\u04b9\0\u04d8\0\u04f7\0\u0516"+
    "\0\u0535\0\u0193\0\u0554\0\u0383\0\u0573\0\u0592\0\u05b1\0\u05d0"+
    "\0\u05ef\0\u060e\0\u062d\0\u064c\0\u066b\0\u068a\0\u06a9\0\u06c8"+
    "\0\u06e7\0\u0706\0\u0725\0\u0744\0\331\0\u0763\0\u0782\0\u07a1"+
    "\0\331\0\u07c0\0\u07df\0\u07fe\0\u081d\0\u083c\0\u085b\0\u087a"+
    "\0\331\0\u0899\0\u08b8\0\331\0\u08d7\0\331\0\u08f6\0\u0915"+
    "\0\u03a2\0\u0934\0\331\0\u0953\0\331\0\331\0\u0972\0\u0991"+
    "\0\331\0\u09b0\0\331\0\u09cf\0\331\0\331";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[102];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\10\1\11\1\12\1\10\1\11\1\13\1\14\1\15"+
    "\2\10\1\16\1\17\1\20\3\10\1\21\1\22\1\23"+
    "\2\24\1\25\1\26\5\10\1\27\3\10\1\30\1\12"+
    "\1\10\1\30\1\12\1\14\1\31\1\32\1\33\2\31"+
    "\24\10\1\30\1\12\1\10\1\30\1\12\1\14\1\31"+
    "\2\10\2\31\23\10\1\34\1\35\1\34\1\36\1\35"+
    "\1\34\1\14\30\34\1\10\1\37\1\12\1\10\1\37"+
    "\1\12\1\14\1\40\2\10\1\41\1\42\23\10\1\43"+
    "\1\11\1\43\1\31\1\11\1\43\1\14\13\43\1\44"+
    "\14\43\1\45\1\35\1\12\1\45\1\35\1\12\1\14"+
    "\1\31\2\45\2\31\23\45\1\10\2\0\1\10\2\0"+
    "\1\10\1\0\2\10\2\0\23\10\1\0\1\11\2\0"+
    "\1\11\34\0\1\12\2\0\1\12\33\0\1\12\2\0"+
    "\1\13\31\0\1\14\1\0\2\14\1\0\32\14\7\0"+
    "\1\46\2\0\1\16\75\0\1\16\24\0\1\10\2\0"+
    "\1\10\2\0\1\10\1\0\2\10\2\0\1\10\1\47"+
    "\14\10\1\50\5\10\2\0\1\10\2\0\1\10\1\0"+
    "\2\10\2\0\1\10\1\51\22\10\2\0\1\10\2\0"+
    "\1\10\1\0\2\10\2\0\6\10\1\52\15\10\2\0"+
    "\1\10\2\0\1\10\1\0\2\10\2\0\1\10\1\53"+
    "\1\10\1\54\16\10\1\55\1\10\2\0\1\10\2\0"+
    "\1\10\1\0\2\10\2\0\1\56\23\10\2\0\1\10"+
    "\2\0\1\10\1\0\2\10\2\0\12\10\1\57\11\10"+
    "\2\0\1\10\2\0\1\10\1\0\2\10\2\0\21\10"+
    "\1\60\2\10\2\0\1\10\2\0\1\10\1\0\2\10"+
    "\2\0\11\10\1\61\11\10\1\0\1\30\2\0\1\30"+
    "\32\0\1\34\1\0\1\34\2\0\32\34\1\0\1\35"+
    "\2\0\1\35\33\0\1\62\2\0\1\63\33\0\1\37"+
    "\2\0\1\37\41\0\1\64\2\0\1\41\36\0\1\41"+
    "\24\0\1\43\1\0\1\43\2\0\33\43\1\0\1\43"+
    "\2\0\10\43\1\65\21\43\1\45\2\0\1\45\2\0"+
    "\1\45\1\0\2\45\2\0\23\45\1\10\2\0\1\10"+
    "\2\0\1\10\1\0\2\10\2\0\2\10\1\66\21\10"+
    "\2\0\1\10\2\0\1\10\1\0\2\10\2\0\1\10"+
    "\1\67\4\10\1\70\15\10\2\0\1\10\2\0\1\10"+
    "\1\0\2\10\2\0\5\10\1\71\16\10\2\0\1\10"+
    "\2\0\1\10\1\0\2\10\2\0\16\10\1\72\5\10"+
    "\2\0\1\10\2\0\1\10\1\0\2\10\2\0\5\10"+
    "\1\73\16\10\2\0\1\10\2\0\1\10\1\0\2\10"+
    "\2\0\10\10\1\74\13\10\2\0\1\10\2\0\1\10"+
    "\1\0\2\10\2\0\12\10\1\75\11\10\2\0\1\10"+
    "\2\0\1\10\1\0\2\10\2\0\1\10\1\47\22\10"+
    "\2\0\1\10\2\0\1\10\1\0\2\10\2\0\13\10"+
    "\1\76\10\10\2\0\1\10\2\0\1\10\1\0\2\10"+
    "\2\0\1\77\23\10\2\0\1\10\2\0\1\10\1\0"+
    "\2\10\2\0\6\10\1\100\14\10\1\0\1\62\35\0"+
    "\1\43\1\0\1\43\2\0\14\43\1\101\15\43\1\10"+
    "\2\0\1\10\2\0\1\10\1\0\2\10\2\0\3\10"+
    "\1\102\20\10\2\0\1\10\2\0\1\10\1\0\2\10"+
    "\2\0\5\10\1\103\1\104\15\10\2\0\1\10\2\0"+
    "\1\10\1\0\2\10\2\0\17\10\1\105\4\10\2\0"+
    "\1\10\2\0\1\10\1\0\2\10\2\0\6\10\1\106"+
    "\15\10\2\0\1\10\2\0\1\10\1\0\2\10\2\0"+
    "\1\107\23\10\2\0\1\10\2\0\1\10\1\0\2\10"+
    "\2\0\1\110\23\10\2\0\1\10\2\0\1\10\1\0"+
    "\2\10\2\0\6\10\1\111\15\10\2\0\1\10\2\0"+
    "\1\10\1\0\2\10\2\0\20\10\1\112\3\10\2\0"+
    "\1\10\2\0\1\10\1\0\2\10\2\0\14\10\1\113"+
    "\7\10\2\0\1\10\2\0\1\10\1\0\2\10\2\0"+
    "\11\10\1\114\12\10\2\0\1\10\2\0\1\10\1\0"+
    "\2\10\2\0\21\10\1\115\1\10\1\43\1\0\1\43"+
    "\2\0\15\43\1\116\14\43\1\10\2\0\1\10\2\0"+
    "\1\10\1\0\2\10\2\0\4\10\1\117\17\10\2\0"+
    "\1\10\2\0\1\10\1\0\2\10\2\0\6\10\1\120"+
    "\15\10\2\0\1\10\2\0\1\10\1\0\2\10\2\0"+
    "\17\10\1\121\4\10\2\0\1\10\2\0\1\10\1\0"+
    "\2\10\2\0\16\10\1\122\5\10\2\0\1\10\2\0"+
    "\1\10\1\0\2\10\2\0\1\10\1\123\22\10\2\0"+
    "\1\10\2\0\1\10\1\0\2\10\2\0\16\10\1\124"+
    "\5\10\2\0\1\10\2\0\1\10\1\0\2\10\2\0"+
    "\21\10\1\125\2\10\2\0\1\10\2\0\1\10\1\0"+
    "\2\10\2\0\15\10\1\126\6\10\2\0\1\10\2\0"+
    "\1\10\1\0\2\10\2\0\13\10\1\127\10\10\2\0"+
    "\1\10\2\0\1\10\1\0\2\10\2\0\21\10\1\130"+
    "\1\10\1\43\1\0\1\43\2\0\25\43\1\131\4\43"+
    "\1\10\2\0\1\10\2\0\1\10\1\0\2\10\2\0"+
    "\5\10\1\132\16\10\2\0\1\10\2\0\1\10\1\0"+
    "\2\10\2\0\16\10\1\133\5\10\2\0\1\10\2\0"+
    "\1\10\1\0\2\10\2\0\1\134\23\10\2\0\1\10"+
    "\2\0\1\10\1\0\2\10\2\0\6\10\1\135\15\10"+
    "\2\0\1\10\2\0\1\10\1\0\2\10\2\0\14\10"+
    "\1\136\7\10\2\0\1\10\2\0\1\10\1\0\2\10"+
    "\2\0\14\10\1\137\7\10\2\0\1\10\2\0\1\10"+
    "\1\0\2\10\2\0\1\140\23\10\2\0\1\10\2\0"+
    "\1\10\1\0\2\10\2\0\6\10\1\141\15\10\2\0"+
    "\1\10\2\0\1\10\1\0\2\10\2\0\1\10\1\142"+
    "\22\10\2\0\1\10\2\0\1\10\1\0\2\10\2\0"+
    "\6\10\1\143\15\10\2\0\1\10\2\0\1\10\1\0"+
    "\2\10\2\0\5\10\1\144\16\10\2\0\1\10\2\0"+
    "\1\10\1\0\2\10\2\0\6\10\1\145\15\10\2\0"+
    "\1\10\2\0\1\10\1\0\2\10\2\0\6\10\1\146"+
    "\14\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2542];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\7\0\6\1\1\11\12\1\1\11\7\1\1\11\4\1"+
    "\1\0\13\1\1\11\1\1\1\0\62\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[102];
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

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _MakefileLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MakefileLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * @return      <code>false</code>, iff there was new input.
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
   * Returns the character at position <tt>pos</tt> from the
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
   * Reports an error that occured while scanning.
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
  public IElementType advance() throws java.io.IOException {
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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        switch (zzLexicalState) {
            case PREREQUISITES: {
              yypushback(yylength()); yybegin(YYINITIAL); return EOL;
            }
            case 103: break;
            case INCLUDES: {
              yypushback(yylength()); yybegin(YYINITIAL); return EOL;
            }
            case 104: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return IDENTIFIER;
            }
          case 31: break;
          case 2: 
            { return WHITE_SPACE;
            }
          case 32: break;
          case 3: 
            { yybegin(SOURCE); return WHITE_SPACE;
            }
          case 33: break;
          case 4: 
            { return COMMENT;
            }
          case 34: break;
          case 5: 
            { yybegin(PREREQUISITES); return COLON;
            }
          case 35: break;
          case 6: 
            { yybegin(SOURCE); return ASSIGN;
            }
          case 36: break;
          case 7: 
            { return BAD_CHARACTER;
            }
          case 37: break;
          case 8: 
            { yybegin(YYINITIAL); return EOL;
            }
          case 38: break;
          case 9: 
            { yybegin(SOURCE); return SEMICOLON;
            }
          case 39: break;
          case 10: 
            { return PIPE;
            }
          case 40: break;
          case 11: 
            { return LINE;
            }
          case 41: break;
          case 12: 
            { yybegin(YYINITIAL); return WHITE_SPACE;
            }
          case 42: break;
          case 13: 
            { return SPLIT;
            }
          case 43: break;
          case 14: 
            { yybegin(DEFINEBODY); return WHITE_SPACE;
            }
          case 44: break;
          case 15: 
            { return ASSIGN;
            }
          case 45: break;
          case 16: 
            { return VARIABLE_VALUE_LINE;
            }
          case 46: break;
          case 17: 
            { yybegin(YYINITIAL); return CONDITION;
            }
          case 47: break;
          case 18: 
            { yybegin(CONDITIONALS); return KEYWORD_IFEQ;
            }
          case 48: break;
          case 19: 
            { return KEYWORD_ELSE;
            }
          case 49: break;
          case 20: 
            { yybegin(CONDITIONALS); return KEYWORD_IFNEQ;
            }
          case 50: break;
          case 21: 
            { return KEYWORD_ENDIF;
            }
          case 51: break;
          case 22: 
            { yybegin(INCLUDES); return KEYWORD_VPATH;
            }
          case 52: break;
          case 23: 
            { yybegin(YYINITIAL); return KEYWORD_ENDEF;
            }
          case 53: break;
          case 24: 
            { yybegin(CONDITIONALS); return KEYWORD_IFNDEF;
            }
          case 54: break;
          case 25: 
            { yybegin(DEFINE); return KEYWORD_DEFINE;
            }
          case 55: break;
          case 26: 
            { return KEYWORD_EXPORT;
            }
          case 56: break;
          case 27: 
            { yybegin(INCLUDES); return KEYWORD_INCLUDE;
            }
          case 57: break;
          case 28: 
            { return KEYWORD_PRIVATE;
            }
          case 58: break;
          case 29: 
            { yybegin(INCLUDES); return KEYWORD_UNDEFINE;
            }
          case 59: break;
          case 30: 
            { return KEYWORD_OVERRIDE;
            }
          case 60: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}