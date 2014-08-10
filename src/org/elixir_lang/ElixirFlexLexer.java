/* The following code was generated by JFlex 1.4.3 on 8/10/14 10:04 AM */

package org.elixir_lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.elixir_lang.psi.ElixirTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 8/10/14 10:04 AM from the specification file
 * <tt>/Users/luke.imhoff/git/KronicDeth/intellij-elixir/src/org/elixir_lang/Elixir.flex</tt>
 */
class ElixirFlexLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int INTERPOLATED_STRING = 4;
  public static final int INTERPOLATION = 14;
  public static final int INTERPOLATED_HEREDOC_START = 12;
  public static final int BODY = 2;
  public static final int STRING = 16;
  public static final int INTERPOLATED_HEREDOC_LINE_START = 10;
  public static final int YYINITIAL = 0;
  public static final int INTERPOLATED_HEREDOC_END = 6;
  public static final int INTERPOLATED_HEREDOC_LINE_BODY = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8, 8
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\0\1\16"+
    "\1\4\3\0\1\14\10\0\1\5\1\7\6\13\2\11\7\0\1\11"+
    "\1\6\4\11\21\0\1\10\3\0\1\15\4\0\1\11\1\6\4\11"+
    "\10\0\1\12\10\0\1\10\2\0\1\17\1\0\1\20\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\11\0\1\1\1\2\3\1\1\3\1\4\1\5\1\6"+
    "\1\3\1\7\1\10\4\11\1\12\1\0\2\13\3\14"+
    "\2\15\1\16\2\17\1\20\1\17\2\1\4\0\2\6"+
    "\1\21\4\0\1\22\1\23\4\0\2\1\2\21\1\24"+
    "\1\25\1\0\1\26\1\27";

  private static int [] zzUnpackAction() {
    int [] result = new int[67];
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
    "\0\0\0\21\0\42\0\63\0\104\0\125\0\146\0\167"+
    "\0\210\0\231\0\252\0\273\0\314\0\335\0\231\0\356"+
    "\0\377\0\u0110\0\u0121\0\231\0\u0132\0\231\0\u0143\0\u0154"+
    "\0\u0165\0\231\0\u0176\0\231\0\u0187\0\231\0\u0198\0\u01a9"+
    "\0\231\0\u01ba\0\231\0\231\0\u01cb\0\231\0\u01dc\0\u01ed"+
    "\0\u01fe\0\u020f\0\u0220\0\u01fe\0\u0231\0\231\0\u0242\0\u0253"+
    "\0\u0264\0\u0275\0\u0253\0\u0286\0\231\0\231\0\u0297\0\u0198"+
    "\0\u02a8\0\u02b9\0\u020f\0\u0220\0\u0264\0\u0275\0\231\0\231"+
    "\0\u02ca\0\231\0\231";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[67];
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
    "\1\12\3\13\1\14\1\15\10\12\1\16\2\12\1\17"+
    "\2\20\1\21\1\22\1\23\6\17\1\24\1\17\1\25"+
    "\2\17\2\26\1\27\1\26\1\30\10\26\1\31\1\32"+
    "\2\26\16\0\1\33\2\0\1\26\1\34\1\35\1\26"+
    "\1\30\10\26\1\31\3\26\1\36\1\0\1\36\1\37"+
    "\12\36\1\40\2\36\1\17\1\41\1\42\17\17\2\20"+
    "\1\21\1\22\1\23\6\17\1\24\1\17\1\25\1\17"+
    "\1\43\2\44\1\45\11\44\1\46\1\47\3\44\22\0"+
    "\3\13\15\0\1\14\1\12\1\50\16\14\5\0\1\51"+
    "\1\52\1\51\1\53\1\0\1\54\1\51\23\0\1\55"+
    "\3\0\3\20\20\0\1\21\15\0\1\22\1\56\1\57"+
    "\16\22\5\0\1\60\1\61\1\60\1\62\1\0\1\63"+
    "\1\60\23\0\1\64\3\0\1\26\36\0\1\65\5\0"+
    "\1\66\11\0\1\66\20\0\1\67\3\0\1\34\22\0"+
    "\1\70\12\0\1\71\20\0\1\72\3\0\1\41\20\0"+
    "\1\44\33\0\1\66\5\0\1\12\24\0\1\51\1\0"+
    "\1\51\3\0\1\51\12\0\1\73\1\0\1\73\16\0"+
    "\3\74\1\0\1\74\1\0\1\74\23\0\1\12\3\0"+
    "\1\56\24\0\1\60\1\0\1\60\3\0\1\60\12\0"+
    "\1\75\1\0\1\75\16\0\3\76\1\0\1\76\1\0"+
    "\1\76\23\0\1\77\20\0\1\100\20\0\1\101\20\0"+
    "\1\102\20\0\1\103\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[731];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\11\0\1\11\4\1\1\11\4\1\1\11\1\1\1\11"+
    "\3\1\1\11\1\0\1\11\1\1\1\11\2\1\1\11"+
    "\1\1\2\11\1\1\1\11\3\1\4\0\1\11\2\1"+
    "\4\0\2\11\4\0\4\1\2\11\1\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[67];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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
  private java.util.Stack<Integer> lexicalStateStack = new java.util.Stack<Integer>();


  ElixirFlexLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  ElixirFlexLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 78) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
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
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 19: 
          { return ElixirTypes.VALID_ESCAPE_SEQUENCE;
          }
        case 24: break;
        case 6: 
          { return ElixirTypes.COMMENT;
          }
        case 25: break;
        case 3: 
          { return TokenType.BAD_CHARACTER;
          }
        case 26: break;
        case 16: 
          { int previousLexicalState = lexicalStateStack.pop();
                           yybegin(previousLexicalState);
                           return ElixirTypes.SINGLE_QUOTE;
          }
        case 27: break;
        case 12: 
          { yypushback(yylength()); yybegin(INTERPOLATED_HEREDOC_LINE_BODY);
          }
        case 28: break;
        case 1: 
          { yypushback(yylength()); yybegin(BODY);
          }
        case 29: break;
        case 18: 
          { lexicalStateStack.push(yystate());
                                     yybegin(INTERPOLATION);
                                     return ElixirTypes.INTERPOLATION_START;
          }
        case 30: break;
        case 11: 
          { yybegin(INTERPOLATED_HEREDOC_LINE_START); return ElixirTypes.INTERPOLATED_STRING_FRAGMENT;
          }
        case 31: break;
        case 5: 
          { return TokenType.WHITE_SPACE;
          }
        case 32: break;
        case 9: 
          { return ElixirTypes.INTERPOLATED_STRING_FRAGMENT;
          }
        case 33: break;
        case 8: 
          { lexicalStateStack.push(yystate());
                                yybegin(INTERPOLATED_STRING);
                                return ElixirTypes.DOUBLE_QUOTES;
          }
        case 34: break;
        case 2: 
          { yybegin(BODY); return TokenType.WHITE_SPACE;
          }
        case 35: break;
        case 4: 
          { return ElixirTypes.EOL;
          }
        case 36: break;
        case 7: 
          { lexicalStateStack.push(yystate());
                                yybegin(STRING);
                                return ElixirTypes.SINGLE_QUOTE;
          }
        case 37: break;
        case 20: 
          { lexicalStateStack.push(yystate());
                                yybegin(INTERPOLATED_HEREDOC_START);
                                return ElixirTypes.TRIPLE_DOUBLE_QUOTES;
          }
        case 38: break;
        case 10: 
          { int previousLexicalState = lexicalStateStack.pop();
                    yybegin(previousLexicalState);
                    return ElixirTypes.DOUBLE_QUOTES;
          }
        case 39: break;
        case 23: 
          // lookahead expression with fixed lookahead length
          yypushback(3);
          { yybegin(INTERPOLATED_HEREDOC_END); return TokenType.WHITE_SPACE;
          }
        case 40: break;
        case 22: 
          { yypushback(yylength()); yybegin(INTERPOLATED_HEREDOC_END);
          }
        case 41: break;
        case 14: 
          { int previousLexicalState = lexicalStateStack.pop();
                                yybegin(previousLexicalState);
                                return ElixirTypes.INTERPOLATION_END;
          }
        case 42: break;
        case 15: 
          { return ElixirTypes.STRING_FRAGMENT;
          }
        case 43: break;
        case 17: 
          { return ElixirTypes.NUMBER;
          }
        case 44: break;
        case 21: 
          { int previousLexicalState = lexicalStateStack.pop();
                           yybegin(previousLexicalState);
                           return ElixirTypes.TRIPLE_DOUBLE_QUOTES;
          }
        case 45: break;
        case 13: 
          { yybegin(INTERPOLATED_HEREDOC_LINE_START); return ElixirTypes.EOL;
          }
        case 46: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
