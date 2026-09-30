package com.airbnb.lottie.parser.moshi;

import Tf.k;
import Tf.m;
import Tf.n;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.maps.android.BuildConfig;
import g8.d;
import java.io.EOFException;
import java.io.IOException;
import kotlin.text.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class JsonUtf8Reader extends JsonReader {
    private static final n CLOSING_BLOCK_COMMENT;
    private static final n DOUBLE_QUOTE_OR_SLASH;
    private static final n LINEFEED_OR_CARRIAGE_RETURN;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_BUFFERED_NAME = 15;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 18;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 16;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 17;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private static final n SINGLE_QUOTE_OR_SLASH;
    private static final n UNQUOTED_STRING_TERMINALS;
    private final k buffer;
    private int peeked = 0;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private final m source;

    static {
        n nVar = n.silver;
        SINGLE_QUOTE_OR_SLASH = d.oscar("'\\");
        DOUBLE_QUOTE_OR_SLASH = d.oscar("\"\\");
        UNQUOTED_STRING_TERMINALS = d.oscar("{}[]:, \n\t\r\f/\\;#=");
        LINEFEED_OR_CARRIAGE_RETURN = d.oscar("\n\r");
        CLOSING_BLOCK_COMMENT = d.oscar("*/");
    }

    public JsonUtf8Reader(m mVar) {
        if (mVar != null) {
            this.source = mVar;
            this.buffer = mVar.mike();
            pushScope(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    private void checkLenient() throws IOException {
        if (this.lenient) {
        } else {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int doPeek() throws IOException {
        int[] iArr = this.scopes;
        int i4 = this.stackSize;
        int i5 = iArr[i4 - 1];
        if (i5 == 1) {
            iArr[i4 - 1] = 2;
        } else if (i5 == 2) {
            int nextNonWhitespace = nextNonWhitespace(true);
            this.buffer.readByte();
            if (nextNonWhitespace != 44) {
                if (nextNonWhitespace != 59) {
                    if (nextNonWhitespace == 93) {
                        this.peeked = 4;
                        return 4;
                    }
                    throw syntaxError("Unterminated array");
                }
                checkLenient();
            }
        } else if (i5 != 3 && i5 != 5) {
            if (i5 == 4) {
                iArr[i4 - 1] = 5;
                int nextNonWhitespace2 = nextNonWhitespace(true);
                this.buffer.readByte();
                if (nextNonWhitespace2 != 58) {
                    if (nextNonWhitespace2 == 61) {
                        checkLenient();
                        if (this.source.request(1L) && this.buffer.juliet(0L) == 62) {
                            this.buffer.readByte();
                        }
                    } else {
                        throw syntaxError("Expected ':'");
                    }
                }
            } else if (i5 == 6) {
                iArr[i4 - 1] = 7;
            } else if (i5 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 18;
                    return 18;
                }
                checkLenient();
            } else if (i5 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i4 - 1] = 4;
            if (i5 == 5) {
                int nextNonWhitespace3 = nextNonWhitespace(true);
                this.buffer.readByte();
                if (nextNonWhitespace3 != 44) {
                    if (nextNonWhitespace3 != 59) {
                        if (nextNonWhitespace3 == 125) {
                            this.peeked = 2;
                            return 2;
                        }
                        throw syntaxError("Unterminated object");
                    }
                    checkLenient();
                }
            }
            int nextNonWhitespace4 = nextNonWhitespace(true);
            if (nextNonWhitespace4 != 34) {
                if (nextNonWhitespace4 != 39) {
                    if (nextNonWhitespace4 != 125) {
                        checkLenient();
                        if (isLiteral((char) nextNonWhitespace4)) {
                            this.peeked = 14;
                            return 14;
                        }
                        throw syntaxError("Expected name");
                    }
                    if (i5 != 5) {
                        this.buffer.readByte();
                        this.peeked = 2;
                        return 2;
                    }
                    throw syntaxError("Expected name");
                }
                this.buffer.readByte();
                checkLenient();
                this.peeked = 12;
                return 12;
            }
            this.buffer.readByte();
            this.peeked = 13;
            return 13;
        }
        int nextNonWhitespace5 = nextNonWhitespace(true);
        if (nextNonWhitespace5 != 34) {
            if (nextNonWhitespace5 != 39) {
                if (nextNonWhitespace5 != 44 && nextNonWhitespace5 != 59) {
                    if (nextNonWhitespace5 != 91) {
                        if (nextNonWhitespace5 != 93) {
                            if (nextNonWhitespace5 != 123) {
                                int peekKeyword = peekKeyword();
                                if (peekKeyword != 0) {
                                    return peekKeyword;
                                }
                                int peekNumber = peekNumber();
                                if (peekNumber != 0) {
                                    return peekNumber;
                                }
                                if (isLiteral(this.buffer.juliet(0L))) {
                                    checkLenient();
                                    this.peeked = 10;
                                    return 10;
                                }
                                throw syntaxError("Expected value");
                            }
                            this.buffer.readByte();
                            this.peeked = 1;
                            return 1;
                        }
                        if (i5 == 1) {
                            this.buffer.readByte();
                            this.peeked = 4;
                            return 4;
                        }
                    } else {
                        this.buffer.readByte();
                        this.peeked = 3;
                        return 3;
                    }
                }
                if (i5 != 1 && i5 != 2) {
                    throw syntaxError("Unexpected value");
                }
                checkLenient();
                this.peeked = 7;
                return 7;
            }
            checkLenient();
            this.buffer.readByte();
            this.peeked = 8;
            return 8;
        }
        this.buffer.readByte();
        this.peeked = 9;
        return 9;
    }

    private int findName(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(options.strings[i4])) {
                this.peeked = 0;
                this.pathNames[this.stackSize - 1] = str;
                return i4;
            }
        }
        return -1;
    }

    private boolean isLiteral(int i4) throws IOException {
        if (i4 != 9 && i4 != 10 && i4 != 12 && i4 != 13 && i4 != 32) {
            if (i4 != 35) {
                if (i4 != 44) {
                    if (i4 != 47 && i4 != 61) {
                        if (i4 != 123 && i4 != 125 && i4 != 58) {
                            if (i4 != 59) {
                                switch (i4) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            checkLenient();
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.buffer.india(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        checkLenient();
        skipToEndOfLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r6.source.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        checkLenient();
        r3 = r6.buffer.juliet(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r6.buffer.readByte();
        r6.buffer.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (skipToEndOfBlockComment() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw syntaxError("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r6.buffer.readByte();
        r6.buffer.readByte();
        skipToEndOfLine();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int nextNonWhitespace(boolean z2) throws IOException {
        byte juliet;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (this.source.request(i5)) {
                    juliet = this.buffer.juliet(i4);
                    if (juliet != 10 && juliet != 32 && juliet != 13 && juliet != 9) {
                        break;
                    }
                    i4 = i5;
                } else {
                    if (!z2) {
                        return -1;
                    }
                    throw new EOFException("End of input");
                }
            }
        }
        return juliet;
    }

    private String nextQuotedValue(n nVar) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long i4 = this.source.i(nVar);
            if (i4 != -1) {
                if (this.buffer.juliet(i4) == 92) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    k kVar = this.buffer;
                    kVar.getClass();
                    sb2.append(kVar.gray(i4, a.alpha));
                    this.buffer.readByte();
                    sb2.append(readEscapeCharacter());
                } else {
                    if (sb2 == null) {
                        k kVar2 = this.buffer;
                        kVar2.getClass();
                        String gray = kVar2.gray(i4, a.alpha);
                        this.buffer.readByte();
                        return gray;
                    }
                    k kVar3 = this.buffer;
                    kVar3.getClass();
                    sb2.append(kVar3.gray(i4, a.alpha));
                    this.buffer.readByte();
                    return sb2.toString();
                }
            } else {
                throw syntaxError("Unterminated string");
            }
        }
    }

    private String nextUnquotedValue() throws IOException {
        long i4 = this.source.i(UNQUOTED_STRING_TERMINALS);
        if (i4 != -1) {
            k kVar = this.buffer;
            kVar.getClass();
            return kVar.gray(i4, a.alpha);
        }
        return this.buffer.green();
    }

    private int peekKeyword() throws IOException {
        String str;
        String str2;
        int i4;
        byte juliet = this.buffer.juliet(0L);
        if (juliet != 116 && juliet != 84) {
            if (juliet != 102 && juliet != 70) {
                if (juliet != 110 && juliet != 78) {
                    return 0;
                }
                str = BuildConfig.TRAVIS;
                str2 = "NULL";
                i4 = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i4 = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i4 = 5;
        }
        int length = str.length();
        int i5 = 1;
        while (i5 < length) {
            int i10 = i5 + 1;
            if (!this.source.request(i10)) {
                return 0;
            }
            byte juliet2 = this.buffer.juliet(i5);
            if (juliet2 != str.charAt(i5) && juliet2 != str2.charAt(i5)) {
                return 0;
            }
            i5 = i10;
        }
        if (this.source.request(length + 1) && isLiteral(this.buffer.juliet(length))) {
            return 0;
        }
        this.buffer.india(length);
        this.peeked = i4;
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        if (isLiteral(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
    
        if (r6 != 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
    
        if (r7 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r8 != r16) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        if (r10 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009d, code lost:
    
        if (r10 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:
    
        r19.peekedLong = r8;
        r19.buffer.india(r5);
        r19.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ad, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        if (r6 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        if (r6 == 4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b3, code lost:
    
        if (r6 != 7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        r19.peekedNumberLength = r5;
        r19.peeked = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bd, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00be, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int peekNumber() throws IOException {
        long j5;
        int i4;
        boolean z2;
        boolean z10 = true;
        int i5 = 0;
        char c3 = 0;
        long j6 = 0;
        boolean z11 = false;
        while (true) {
            int i10 = i5 + 1;
            if (!this.source.request(i10)) {
                j5 = 0;
                i4 = 0;
                break;
            }
            j5 = 0;
            byte juliet = this.buffer.juliet(i5);
            i4 = 0;
            if (juliet != 43) {
                if (juliet != 69 && juliet != 101) {
                    if (juliet != 45) {
                        if (juliet != 46) {
                            if (juliet < 48 || juliet > 57) {
                                break;
                            }
                            if (c3 != 1 && c3 != 0) {
                                if (c3 == 2) {
                                    if (j6 == 0) {
                                        return 0;
                                    }
                                    long j7 = (10 * j6) - (juliet - 48);
                                    if (j6 <= MIN_INCOMPLETE_INTEGER && (j6 != MIN_INCOMPLETE_INTEGER || j7 >= j6)) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    z10 &= z2;
                                    j6 = j7;
                                } else if (c3 == 3) {
                                    c3 = 4;
                                } else if (c3 == 5 || c3 == 6) {
                                    c3 = 7;
                                }
                            } else {
                                j6 = -(juliet - 48);
                                c3 = 2;
                            }
                        } else {
                            if (c3 != 2) {
                                return 0;
                            }
                            c3 = 3;
                        }
                    } else if (c3 == 0) {
                        c3 = 1;
                        z11 = true;
                    } else if (c3 != 5) {
                        return 0;
                    }
                } else {
                    if (c3 != 2 && c3 != 4) {
                        return 0;
                    }
                    c3 = 5;
                }
                i5 = i10;
            } else if (c3 != 5) {
                return 0;
            }
            c3 = 6;
            i5 = i10;
        }
    }

    private char readEscapeCharacter() throws IOException {
        int i4;
        if (this.source.request(1L)) {
            byte readByte = this.buffer.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.lenient) {
                                        return (char) readByte;
                                    }
                                    throw syntaxError("Invalid escape sequence: \\" + ((char) readByte));
                                }
                                if (this.source.request(4L)) {
                                    char c3 = 0;
                                    for (int i5 = 0; i5 < 4; i5++) {
                                        byte juliet = this.buffer.juliet(i5);
                                        char c4 = (char) (c3 << 4);
                                        if (juliet >= 48 && juliet <= 57) {
                                            i4 = juliet - 48;
                                        } else if (juliet >= 97 && juliet <= 102) {
                                            i4 = juliet - 87;
                                        } else {
                                            if (juliet < 65 || juliet > 70) {
                                                k kVar = this.buffer;
                                                kVar.getClass();
                                                throw syntaxError("\\u".concat(kVar.gray(4L, a.alpha)));
                                            }
                                            i4 = juliet - 55;
                                        }
                                        c3 = (char) (i4 + c4);
                                    }
                                    this.buffer.india(4L);
                                    return c3;
                                }
                                throw new EOFException("Unterminated escape sequence at path " + getPath());
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        throw syntaxError("Unterminated escape sequence");
    }

    private void skipQuotedValue(n nVar) throws IOException {
        while (true) {
            long i4 = this.source.i(nVar);
            if (i4 != -1) {
                if (this.buffer.juliet(i4) == 92) {
                    this.buffer.india(i4 + 1);
                    readEscapeCharacter();
                } else {
                    this.buffer.india(i4 + 1);
                    return;
                }
            } else {
                throw syntaxError("Unterminated string");
            }
        }
    }

    private boolean skipToEndOfBlockComment() throws IOException {
        boolean z2;
        long j5;
        long victor = this.source.victor(CLOSING_BLOCK_COMMENT);
        if (victor != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        k kVar = this.buffer;
        if (z2) {
            j5 = victor + r1.delta();
        } else {
            j5 = kVar.purple;
        }
        kVar.india(j5);
        return z2;
    }

    private void skipToEndOfLine() throws IOException {
        long j5;
        long i4 = this.source.i(LINEFEED_OR_CARRIAGE_RETURN);
        k kVar = this.buffer;
        if (i4 != -1) {
            j5 = i4 + 1;
        } else {
            j5 = kVar.purple;
        }
        kVar.india(j5);
    }

    private void skipUnquotedValue() throws IOException {
        long i4 = this.source.i(UNQUOTED_STRING_TERMINALS);
        k kVar = this.buffer;
        if (i4 == -1) {
            i4 = kVar.purple;
        }
        kVar.india(i4);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginArray() throws IOException {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 3) {
            pushScope(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginObject() throws IOException {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 1) {
            pushScope(3);
            this.peeked = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.scopes[0] = 8;
        this.stackSize = 1;
        this.buffer.charlie();
        this.source.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endArray() throws IOException {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 4) {
            int i5 = this.stackSize;
            this.stackSize = i5 - 1;
            int[] iArr = this.pathIndices;
            int i10 = i5 - 2;
            iArr[i10] = iArr[i10] + 1;
            this.peeked = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endObject() throws IOException {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 2) {
            int i5 = this.stackSize;
            int i10 = i5 - 1;
            this.stackSize = i10;
            this.pathNames[i10] = null;
            int[] iArr = this.pathIndices;
            int i11 = i5 - 2;
            iArr[i11] = iArr[i11] + 1;
            this.peeked = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean hasNext() throws IOException {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 != 2 && i4 != 4 && i4 != 18) {
            return true;
        }
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean nextBoolean() throws IOException {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i5 = this.stackSize - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        }
        if (i4 == 6) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i10 = this.stackSize - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double nextDouble() throws IOException {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 16) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i5 = this.stackSize - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.peekedLong;
        }
        if (i4 == 17) {
            k kVar = this.buffer;
            long j5 = this.peekedNumberLength;
            kVar.getClass();
            this.peekedString = kVar.gray(j5, a.alpha);
        } else if (i4 == 9) {
            this.peekedString = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i4 == 8) {
            this.peekedString = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i4 == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (i4 != 11) {
            throw new JsonDataException("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            if (!this.lenient && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i10 = this.stackSize - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.peekedString + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int nextInt() throws IOException {
        String nextQuotedValue;
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 16) {
            long j5 = this.peekedLong;
            int i5 = (int) j5;
            if (j5 == i5) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i10 = this.stackSize - 1;
                iArr[i10] = iArr[i10] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.peekedLong + " at path " + getPath());
        }
        if (i4 == 17) {
            k kVar = this.buffer;
            long j6 = this.peekedNumberLength;
            kVar.getClass();
            this.peekedString = kVar.gray(j6, a.alpha);
        } else if (i4 != 9 && i4 != 8) {
            if (i4 != 11) {
                throw new JsonDataException("Expected an int but was " + peek() + " at path " + getPath());
            }
        } else {
            if (i4 == 9) {
                nextQuotedValue = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
            } else {
                nextQuotedValue = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
            }
            this.peekedString = nextQuotedValue;
            try {
                int parseInt = Integer.parseInt(nextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i11 = this.stackSize - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            int i12 = (int) parseDouble;
            if (i12 == parseDouble) {
                this.peekedString = null;
                this.peeked = 0;
                int[] iArr3 = this.pathIndices;
                int i13 = this.stackSize - 1;
                iArr3[i13] = iArr3[i13] + 1;
                return i12;
            }
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextName() throws IOException {
        String str;
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 14) {
            str = nextUnquotedValue();
        } else if (i4 == 13) {
            str = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i4 == 12) {
            str = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i4 == 15) {
            str = this.peekedString;
        } else {
            throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextString() throws IOException {
        String gray;
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 == 10) {
            gray = nextUnquotedValue();
        } else if (i4 == 9) {
            gray = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i4 == 8) {
            gray = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i4 == 11) {
            gray = this.peekedString;
            this.peekedString = null;
        } else if (i4 == 16) {
            gray = Long.toString(this.peekedLong);
        } else if (i4 == 17) {
            k kVar = this.buffer;
            long j5 = this.peekedNumberLength;
            kVar.getClass();
            gray = kVar.gray(j5, a.alpha);
        } else {
            throw new JsonDataException("Expected a string but was " + peek() + " at path " + getPath());
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i5 = this.stackSize - 1;
        iArr[i5] = iArr[i5] + 1;
        return gray;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token peek() throws IOException {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        switch (i4) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int selectName(JsonReader.Options options) throws IOException {
        int i4 = this.peeked;
        if (i4 == 0) {
            i4 = doPeek();
        }
        if (i4 < 12 || i4 > 15) {
            return -1;
        }
        if (i4 == 15) {
            return findName(this.peekedString, options);
        }
        int c3 = this.source.c(options.doubleQuoteSuffix);
        if (c3 != -1) {
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = options.strings[c3];
            return c3;
        }
        String str = this.pathNames[this.stackSize - 1];
        String nextName = nextName();
        int findName = findName(nextName, options);
        if (findName == -1) {
            this.peeked = 15;
            this.peekedString = nextName;
            this.pathNames[this.stackSize - 1] = str;
        }
        return findName;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipName() throws IOException {
        if (!this.failOnUnknown) {
            int i4 = this.peeked;
            if (i4 == 0) {
                i4 = doPeek();
            }
            if (i4 == 14) {
                skipUnquotedValue();
            } else if (i4 == 13) {
                skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
            } else if (i4 == 12) {
                skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
            } else if (i4 != 15) {
                throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
            }
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = BuildConfig.TRAVIS;
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipValue() throws IOException {
        if (!this.failOnUnknown) {
            int i4 = 0;
            do {
                int i5 = this.peeked;
                if (i5 == 0) {
                    i5 = doPeek();
                }
                if (i5 == 3) {
                    pushScope(1);
                } else if (i5 == 1) {
                    pushScope(3);
                } else {
                    if (i5 == 4) {
                        i4--;
                        if (i4 >= 0) {
                            this.stackSize--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                        }
                    } else if (i5 == 2) {
                        i4--;
                        if (i4 >= 0) {
                            this.stackSize--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                        }
                    } else if (i5 != 14 && i5 != 10) {
                        if (i5 != 9 && i5 != 13) {
                            if (i5 != 8 && i5 != 12) {
                                if (i5 == 17) {
                                    this.buffer.india(this.peekedNumberLength);
                                } else if (i5 == 18) {
                                    throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                                }
                            } else {
                                skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
                            }
                        } else {
                            skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                        }
                    } else {
                        skipUnquotedValue();
                    }
                    this.peeked = 0;
                }
                i4++;
                this.peeked = 0;
            } while (i4 != 0);
            int[] iArr = this.pathIndices;
            int i10 = this.stackSize;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            this.pathNames[i10 - 1] = BuildConfig.TRAVIS;
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
    }

    public String toString() {
        return "JsonReader(" + this.source + ")";
    }
}
