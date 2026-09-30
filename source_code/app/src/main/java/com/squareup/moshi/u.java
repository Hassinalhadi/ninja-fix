package com.squareup.moshi;

import com.clevertap.android.sdk.Constants;
import com.google.maps.android.BuildConfig;
import com.squareup.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class u extends JsonReader {

    /* renamed from: a, reason: collision with root package name */
    public static final Tf.n f11962a;

    /* renamed from: b, reason: collision with root package name */
    public static final Tf.n f11963b;

    /* renamed from: c, reason: collision with root package name */
    public static final Tf.n f11964c;

    /* renamed from: d, reason: collision with root package name */
    public static final Tf.n f11965d;
    public static final Tf.n e;
    public final Tf.m alpha;
    public final Tf.k purple;
    public int red;
    public long silver;
    public int teal;
    public String white;
    public z yellow;

    static {
        Tf.n nVar = Tf.n.silver;
        f11962a = g8.d.oscar("'\\");
        f11963b = g8.d.oscar("\"\\");
        f11964c = g8.d.oscar("{}[]:, \n\t\r\f/\\;#=");
        f11965d = g8.d.oscar("\n\r");
        e = g8.d.oscar("*/");
    }

    public u(Tf.m mVar) {
        this.red = 0;
        if (mVar != null) {
            this.alpha = mVar;
            this.purple = mVar.delta();
            pushScope(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    public final char azure() {
        int i4;
        Tf.m mVar = this.alpha;
        if (mVar.request(1L)) {
            Tf.k kVar = this.purple;
            byte readByte = kVar.readByte();
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
                                if (mVar.request(4L)) {
                                    char c3 = 0;
                                    for (int i5 = 0; i5 < 4; i5++) {
                                        byte juliet = kVar.juliet(i5);
                                        char c4 = (char) (c3 << 4);
                                        if (juliet >= 48 && juliet <= 57) {
                                            i4 = juliet - 48;
                                        } else if (juliet >= 97 && juliet <= 102) {
                                            i4 = juliet - 87;
                                        } else {
                                            if (juliet < 65 || juliet > 70) {
                                                kVar.getClass();
                                                throw syntaxError("\\u".concat(kVar.gray(4L, kotlin.text.a.alpha)));
                                            }
                                            i4 = juliet - 55;
                                        }
                                        c3 = (char) (i4 + c4);
                                    }
                                    kVar.india(4L);
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

    @Override // com.squareup.moshi.JsonReader
    public final void beginArray() {
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 == 3) {
            pushScope(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.red = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginObject() {
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 == 1) {
            pushScope(3);
            this.red = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
        }
    }

    public final void beige(Tf.n nVar) {
        while (true) {
            long i4 = this.alpha.i(nVar);
            if (i4 != -1) {
                Tf.k kVar = this.purple;
                if (kVar.juliet(i4) == 92) {
                    kVar.india(i4 + 1);
                    azure();
                } else {
                    kVar.india(i4 + 1);
                    return;
                }
            } else {
                throw syntaxError("Unterminated string");
            }
        }
    }

    public final void charlie() {
        if (this.lenient) {
        } else {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.red = 0;
        this.scopes[0] = 8;
        this.stackSize = 1;
        this.purple.charlie();
        this.alpha.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d8, code lost:
    
        if (juliet(r7) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int echo() {
        int i4;
        int papa;
        String str;
        String str2;
        int i5;
        long j5;
        byte juliet;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.scopes;
        int i14 = this.stackSize;
        int i15 = iArr[i14 - 1];
        Tf.m mVar = this.alpha;
        long j6 = 0;
        Tf.k kVar = this.purple;
        if (i15 == 1) {
            iArr[i14 - 1] = 2;
        } else if (i15 == 2) {
            int papa2 = papa(true);
            kVar.readByte();
            if (papa2 != 44) {
                if (papa2 != 59) {
                    if (papa2 == 93) {
                        this.red = 4;
                        return 4;
                    }
                    throw syntaxError("Unterminated array");
                }
                charlie();
            }
        } else if (i15 != 3 && i15 != 5) {
            if (i15 == 4) {
                iArr[i14 - 1] = 5;
                int papa3 = papa(true);
                kVar.readByte();
                if (papa3 != 58) {
                    if (papa3 == 61) {
                        charlie();
                        if (mVar.request(1L) && kVar.juliet(0L) == 62) {
                            kVar.readByte();
                        }
                    } else {
                        throw syntaxError("Expected ':'");
                    }
                }
            } else if (i15 == 6) {
                iArr[i14 - 1] = 7;
            } else {
                if (i15 == 7) {
                    i4 = 0;
                    if (papa(false) == -1) {
                        this.red = 18;
                        return 18;
                    }
                    charlie();
                } else {
                    i4 = 0;
                    if (i15 == 9) {
                        z zVar = this.yellow;
                        zVar.yellow = true;
                        while (zVar.silver != z.f11970f) {
                            zVar.charlie(8192L);
                            zVar.alpha.india(zVar.white);
                        }
                        this.yellow = null;
                        this.stackSize--;
                        return echo();
                    }
                    if (i15 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                papa = papa(true);
                if (papa == 34) {
                    if (papa != 39) {
                        if (papa != 44 && papa != 59) {
                            if (papa != 91) {
                                if (papa != 93) {
                                    if (papa != 123) {
                                        byte juliet2 = kVar.juliet(0L);
                                        if (juliet2 != 116 && juliet2 != 84) {
                                            if (juliet2 != 102 && juliet2 != 70) {
                                                if (juliet2 != 110 && juliet2 != 78) {
                                                    i5 = i4;
                                                    j5 = 0;
                                                    if (i5 == 0) {
                                                        return i5;
                                                    }
                                                    int i16 = i4;
                                                    int i17 = i16;
                                                    int i18 = i17;
                                                    int i19 = 1;
                                                    long j7 = j5;
                                                    while (true) {
                                                        int i20 = i17 + 1;
                                                        i10 = i18;
                                                        if (!mVar.request(i20)) {
                                                            break;
                                                        }
                                                        byte juliet3 = kVar.juliet(i17);
                                                        if (juliet3 != 43) {
                                                            if (juliet3 != 69 && juliet3 != 101) {
                                                                if (juliet3 != 45) {
                                                                    if (juliet3 != 46) {
                                                                        if (juliet3 < 48 || juliet3 > 57) {
                                                                            break;
                                                                        }
                                                                        if (i16 != 1 && i16 != 0) {
                                                                            if (i16 == 2) {
                                                                                if (j7 == j5) {
                                                                                    break;
                                                                                }
                                                                                long j10 = (10 * j7) - (juliet3 - 48);
                                                                                if (j7 <= -922337203685477580L && (j7 != -922337203685477580L || j10 >= j7)) {
                                                                                    i13 = i4;
                                                                                } else {
                                                                                    i13 = 1;
                                                                                }
                                                                                i19 &= i13;
                                                                                j7 = j10;
                                                                            } else if (i16 == 3) {
                                                                                i16 = 4;
                                                                            } else if (i16 == 5 || i16 == 6) {
                                                                                i16 = 7;
                                                                            }
                                                                        } else {
                                                                            j7 = -(juliet3 - 48);
                                                                            i16 = 2;
                                                                        }
                                                                        i17 = i20;
                                                                        i18 = i10;
                                                                    } else {
                                                                        if (i16 != 2) {
                                                                            break;
                                                                        }
                                                                        i16 = 3;
                                                                        i17 = i20;
                                                                        i18 = i10;
                                                                    }
                                                                } else {
                                                                    i12 = 6;
                                                                    if (i16 == 0) {
                                                                        i16 = 1;
                                                                        i10 = 1;
                                                                        i17 = i20;
                                                                        i18 = i10;
                                                                    } else {
                                                                        if (i16 != 5) {
                                                                            break;
                                                                        }
                                                                        i16 = i12;
                                                                        i17 = i20;
                                                                        i18 = i10;
                                                                    }
                                                                }
                                                            } else {
                                                                if (i16 != 2 && i16 != 4) {
                                                                    break;
                                                                }
                                                                i16 = 5;
                                                                i17 = i20;
                                                                i18 = i10;
                                                            }
                                                            if (i11 == 0) {
                                                                return i11;
                                                            }
                                                            if (juliet(kVar.juliet(j5))) {
                                                                charlie();
                                                                this.red = 10;
                                                                return 10;
                                                            }
                                                            throw syntaxError("Expected value");
                                                        }
                                                        i12 = 6;
                                                        if (i16 != 5) {
                                                            break;
                                                        }
                                                        i16 = i12;
                                                        i17 = i20;
                                                        i18 = i10;
                                                    }
                                                    if (i16 == 2 && i19 != 0 && ((j7 != Long.MIN_VALUE || i10 != 0) && (j7 != j5 || i10 == 0))) {
                                                        if (i10 == 0) {
                                                            j7 = -j7;
                                                        }
                                                        this.silver = j7;
                                                        kVar.india(i17);
                                                        i11 = 16;
                                                        this.red = 16;
                                                    } else {
                                                        if (i16 == 2 || i16 == 4 || i16 == 7) {
                                                            this.teal = i17;
                                                            i11 = 17;
                                                            this.red = 17;
                                                        }
                                                        i11 = i4;
                                                    }
                                                    if (i11 == 0) {
                                                    }
                                                } else {
                                                    str = BuildConfig.TRAVIS;
                                                    str2 = "NULL";
                                                    i5 = 7;
                                                }
                                            } else {
                                                str = "false";
                                                str2 = "FALSE";
                                                i5 = 6;
                                            }
                                        } else {
                                            str = "true";
                                            str2 = "TRUE";
                                            i5 = 5;
                                        }
                                        int length = str.length();
                                        int i21 = 1;
                                        while (true) {
                                            if (i21 < length) {
                                                int i22 = i21 + 1;
                                                j5 = j6;
                                                if (!mVar.request(i22) || ((juliet = kVar.juliet(i21)) != str.charAt(i21) && juliet != str2.charAt(i21))) {
                                                    break;
                                                }
                                                i21 = i22;
                                                j6 = j5;
                                            } else {
                                                j5 = j6;
                                                if (!mVar.request(length + 1) || !juliet(kVar.juliet(length))) {
                                                    kVar.india(length);
                                                    this.red = i5;
                                                }
                                            }
                                        }
                                        i5 = i4;
                                        if (i5 == 0) {
                                        }
                                    } else {
                                        kVar.readByte();
                                        this.red = 1;
                                        return 1;
                                    }
                                } else if (i15 == 1) {
                                    kVar.readByte();
                                    this.red = 4;
                                    return 4;
                                }
                            } else {
                                kVar.readByte();
                                this.red = 3;
                                return 3;
                            }
                        }
                        if (i15 != 1 && i15 != 2) {
                            throw syntaxError("Unexpected value");
                        }
                        charlie();
                        this.red = 7;
                        return 7;
                    }
                    charlie();
                    kVar.readByte();
                    this.red = 8;
                    return 8;
                }
                kVar.readByte();
                this.red = 9;
                return 9;
            }
        } else {
            iArr[i14 - 1] = 4;
            if (i15 == 5) {
                int papa4 = papa(true);
                kVar.readByte();
                if (papa4 != 44) {
                    if (papa4 != 59) {
                        if (papa4 == 125) {
                            this.red = 2;
                            return 2;
                        }
                        throw syntaxError("Unterminated object");
                    }
                    charlie();
                }
            }
            int papa5 = papa(true);
            if (papa5 != 34) {
                if (papa5 != 39) {
                    if (papa5 != 125) {
                        charlie();
                        if (juliet((char) papa5)) {
                            this.red = 14;
                            return 14;
                        }
                        throw syntaxError("Expected name");
                    }
                    if (i15 != 5) {
                        kVar.readByte();
                        this.red = 2;
                        return 2;
                    }
                    throw syntaxError("Expected name");
                }
                kVar.readByte();
                charlie();
                this.red = 12;
                return 12;
            }
            kVar.readByte();
            this.red = 13;
            return 13;
        }
        i4 = 0;
        papa = papa(true);
        if (papa == 34) {
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endArray() {
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 == 4) {
            int i5 = this.stackSize;
            this.stackSize = i5 - 1;
            int[] iArr = this.pathIndices;
            int i10 = i5 - 2;
            iArr[i10] = iArr[i10] + 1;
            this.red = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endObject() {
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 == 2) {
            int i5 = this.stackSize;
            int i10 = i5 - 1;
            this.stackSize = i10;
            this.pathNames[i10] = null;
            int[] iArr = this.pathIndices;
            int i11 = i5 - 2;
            iArr[i11] = iArr[i11] + 1;
            this.red = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + peek() + " at path " + getPath());
    }

    public final int foxtrot(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(options.strings[i4])) {
                this.red = 0;
                this.pathNames[this.stackSize - 1] = str;
                return i4;
            }
        }
        return -1;
    }

    public final int golf(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(options.strings[i4])) {
                this.red = 0;
                int[] iArr = this.pathIndices;
                int i5 = this.stackSize - 1;
                iArr[i5] = iArr[i5] + 1;
                return i4;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean hasNext() {
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 != 2 && i4 != 4 && i4 != 18) {
            return true;
        }
        return false;
    }

    public final boolean juliet(int i4) {
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
            charlie();
            return false;
        }
        return false;
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean nextBoolean() {
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 == 5) {
            this.red = 0;
            int[] iArr = this.pathIndices;
            int i5 = this.stackSize - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        }
        if (i4 == 6) {
            this.red = 0;
            int[] iArr2 = this.pathIndices;
            int i10 = this.stackSize - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + peek() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    public final double nextDouble() {
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 == 16) {
            this.red = 0;
            int[] iArr = this.pathIndices;
            int i5 = this.stackSize - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.silver;
        }
        if (i4 == 17) {
            long j5 = this.teal;
            Tf.k kVar = this.purple;
            kVar.getClass();
            this.white = kVar.gray(j5, kotlin.text.a.alpha);
        } else if (i4 == 9) {
            this.white = quebec(f11963b);
        } else if (i4 == 8) {
            this.white = quebec(f11962a);
        } else if (i4 == 10) {
            this.white = uniform();
        } else if (i4 != 11) {
            throw new JsonDataException("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.red = 11;
        try {
            double parseDouble = Double.parseDouble(this.white);
            if (!this.lenient && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.white = null;
            this.red = 0;
            int[] iArr2 = this.pathIndices;
            int i10 = this.stackSize - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.white + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final int nextInt() {
        String quebec;
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 == 16) {
            long j5 = this.silver;
            int i5 = (int) j5;
            if (j5 == i5) {
                this.red = 0;
                int[] iArr = this.pathIndices;
                int i10 = this.stackSize - 1;
                iArr[i10] = iArr[i10] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.silver + " at path " + getPath());
        }
        if (i4 == 17) {
            long j6 = this.teal;
            Tf.k kVar = this.purple;
            kVar.getClass();
            this.white = kVar.gray(j6, kotlin.text.a.alpha);
        } else if (i4 != 9 && i4 != 8) {
            if (i4 != 11) {
                throw new JsonDataException("Expected an int but was " + peek() + " at path " + getPath());
            }
        } else {
            if (i4 == 9) {
                quebec = quebec(f11963b);
            } else {
                quebec = quebec(f11962a);
            }
            this.white = quebec;
            try {
                int parseInt = Integer.parseInt(quebec);
                this.red = 0;
                int[] iArr2 = this.pathIndices;
                int i11 = this.stackSize - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.red = 11;
        try {
            double parseDouble = Double.parseDouble(this.white);
            int i12 = (int) parseDouble;
            if (i12 == parseDouble) {
                this.white = null;
                this.red = 0;
                int[] iArr3 = this.pathIndices;
                int i13 = this.stackSize - 1;
                iArr3[i13] = iArr3[i13] + 1;
                return i12;
            }
            throw new JsonDataException("Expected an int but was " + this.white + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.white + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final long nextLong() {
        String quebec;
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 == 16) {
            this.red = 0;
            int[] iArr = this.pathIndices;
            int i5 = this.stackSize - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.silver;
        }
        if (i4 == 17) {
            long j5 = this.teal;
            Tf.k kVar = this.purple;
            kVar.getClass();
            this.white = kVar.gray(j5, kotlin.text.a.alpha);
        } else if (i4 != 9 && i4 != 8) {
            if (i4 != 11) {
                throw new JsonDataException("Expected a long but was " + peek() + " at path " + getPath());
            }
        } else {
            if (i4 == 9) {
                quebec = quebec(f11963b);
            } else {
                quebec = quebec(f11962a);
            }
            this.white = quebec;
            try {
                long parseLong = Long.parseLong(quebec);
                this.red = 0;
                int[] iArr2 = this.pathIndices;
                int i10 = this.stackSize - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.red = 11;
        try {
            long longValueExact = new BigDecimal(this.white).longValueExact();
            this.white = null;
            this.red = 0;
            int[] iArr3 = this.pathIndices;
            int i11 = this.stackSize - 1;
            iArr3[i11] = iArr3[i11] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.white + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final String nextName() {
        String str;
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 == 14) {
            str = uniform();
        } else if (i4 == 13) {
            str = quebec(f11963b);
        } else if (i4 == 12) {
            str = quebec(f11962a);
        } else if (i4 == 15) {
            str = this.white;
            this.white = null;
        } else {
            throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.red = 0;
        this.pathNames[this.stackSize - 1] = str;
        return str;
    }

    @Override // com.squareup.moshi.JsonReader
    public final Object nextNull() {
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 == 7) {
            this.red = 0;
            int[] iArr = this.pathIndices;
            int i5 = this.stackSize - 1;
            iArr[i5] = iArr[i5] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + peek() + " at path " + getPath());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ba  */
    /* JADX WARN: Type inference failed for: r1v0, types: [Tf.l, Tf.k, java.lang.Object] */
    @Override // com.squareup.moshi.JsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Tf.m nextSource() {
        int i4;
        int i5 = this.red;
        if (i5 == 0) {
            i5 = echo();
        }
        ?? obj = new Object();
        Tf.n nVar = z.f11970f;
        if (i5 == 3) {
            obj.n(Constants.AES_PREFIX);
            nVar = z.f11966a;
        } else if (i5 == 1) {
            obj.n("{");
            nVar = z.f11966a;
        } else {
            if (i5 == 9) {
                obj.n("\"");
                nVar = z.f11968c;
            } else if (i5 == 8) {
                obj.n("'");
                nVar = z.f11967b;
            } else if (i5 != 17 && i5 != 16 && i5 != 10) {
                if (i5 == 5) {
                    obj.n("true");
                } else if (i5 == 6) {
                    obj.n("false");
                } else if (i5 == 7) {
                    obj.n(BuildConfig.TRAVIS);
                } else if (i5 == 11) {
                    String nextString = nextString();
                    JsonWriter of2 = JsonWriter.of(obj);
                    try {
                        of2.value(nextString);
                        of2.close();
                    } catch (Throwable th) {
                        if (of2 != null) {
                            try {
                                of2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } else {
                    throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                }
            } else {
                obj.n(nextString());
            }
            i4 = 0;
            if (this.red != 0) {
                int[] iArr = this.pathIndices;
                int i10 = this.stackSize - 1;
                iArr[i10] = iArr[i10] + 1;
                this.red = 0;
            }
            this.yellow = new z(this.alpha, obj, nVar, i4);
            pushScope(9);
            return Tf.b.charlie(this.yellow);
        }
        i4 = 1;
        if (this.red != 0) {
        }
        this.yellow = new z(this.alpha, obj, nVar, i4);
        pushScope(9);
        return Tf.b.charlie(this.yellow);
    }

    @Override // com.squareup.moshi.JsonReader
    public final String nextString() {
        String gray;
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 == 10) {
            gray = uniform();
        } else if (i4 == 9) {
            gray = quebec(f11963b);
        } else if (i4 == 8) {
            gray = quebec(f11962a);
        } else if (i4 == 11) {
            gray = this.white;
            this.white = null;
        } else if (i4 == 16) {
            gray = Long.toString(this.silver);
        } else if (i4 == 17) {
            long j5 = this.teal;
            Tf.k kVar = this.purple;
            kVar.getClass();
            gray = kVar.gray(j5, kotlin.text.a.alpha);
        } else {
            throw new JsonDataException("Expected a string but was " + peek() + " at path " + getPath());
        }
        this.red = 0;
        int[] iArr = this.pathIndices;
        int i5 = this.stackSize - 1;
        iArr[i5] = iArr[i5] + 1;
        return gray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r1.india(r3);
        r2 = com.squareup.moshi.u.f11965d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r6 != 47) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r6 != 35) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        charlie();
        r5 = r5.i(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r5 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        r1.india(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        r5 = r1.purple;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
    
        if (r5.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        charlie();
        r10 = r1.juliet(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if (r10 == 42) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.victor(com.squareup.moshi.u.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        if (r5 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r3 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        r5 = r5 + r2.alpha.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        r1.india(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r3 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        throw syntaxError("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007c, code lost:
    
        r5 = r1.purple;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0048, code lost:
    
        if (r10 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x004b, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.i(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0057, code lost:
    
        if (r5 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0059, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005d, code lost:
    
        r1.india(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005b, code lost:
    
        r5 = r1.purple;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int papa(boolean z2) {
        byte juliet;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                Tf.m mVar = this.alpha;
                if (mVar.request(i5)) {
                    long j5 = i4;
                    Tf.k kVar = this.purple;
                    juliet = kVar.juliet(j5);
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

    @Override // com.squareup.moshi.JsonReader
    public final JsonReader.Token peek() {
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
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

    @Override // com.squareup.moshi.JsonReader
    public final JsonReader peekJson() {
        return new u(this);
    }

    @Override // com.squareup.moshi.JsonReader
    public final void promoteNameToValue() {
        if (hasNext()) {
            this.white = nextName();
            this.red = 11;
        }
    }

    public final String quebec(Tf.n nVar) {
        StringBuilder sb2 = null;
        while (true) {
            long i4 = this.alpha.i(nVar);
            if (i4 != -1) {
                Tf.k kVar = this.purple;
                if (kVar.juliet(i4) == 92) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(kVar.gray(i4, kotlin.text.a.alpha));
                    kVar.readByte();
                    sb2.append(azure());
                } else {
                    if (sb2 == null) {
                        String gray = kVar.gray(i4, kotlin.text.a.alpha);
                        kVar.readByte();
                        return gray;
                    }
                    sb2.append(kVar.gray(i4, kotlin.text.a.alpha));
                    kVar.readByte();
                    return sb2.toString();
                }
            } else {
                throw syntaxError("Unterminated string");
            }
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final int selectName(JsonReader.Options options) {
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 < 12 || i4 > 15) {
            return -1;
        }
        if (i4 == 15) {
            return foxtrot(this.white, options);
        }
        int c3 = this.alpha.c(options.doubleQuoteSuffix);
        if (c3 != -1) {
            this.red = 0;
            this.pathNames[this.stackSize - 1] = options.strings[c3];
            return c3;
        }
        String str = this.pathNames[this.stackSize - 1];
        String nextName = nextName();
        int foxtrot = foxtrot(nextName, options);
        if (foxtrot == -1) {
            this.red = 15;
            this.white = nextName;
            this.pathNames[this.stackSize - 1] = str;
        }
        return foxtrot;
    }

    @Override // com.squareup.moshi.JsonReader
    public final int selectString(JsonReader.Options options) {
        int i4 = this.red;
        if (i4 == 0) {
            i4 = echo();
        }
        if (i4 < 8 || i4 > 11) {
            return -1;
        }
        if (i4 == 11) {
            return golf(this.white, options);
        }
        int c3 = this.alpha.c(options.doubleQuoteSuffix);
        if (c3 != -1) {
            this.red = 0;
            int[] iArr = this.pathIndices;
            int i5 = this.stackSize - 1;
            iArr[i5] = iArr[i5] + 1;
            return c3;
        }
        String nextString = nextString();
        int golf = golf(nextString, options);
        if (golf == -1) {
            this.red = 11;
            this.white = nextString;
            this.pathIndices[this.stackSize - 1] = r0[r1] - 1;
        }
        return golf;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void skipName() {
        if (!this.failOnUnknown) {
            int i4 = this.red;
            if (i4 == 0) {
                i4 = echo();
            }
            if (i4 == 14) {
                long i5 = this.alpha.i(f11964c);
                Tf.k kVar = this.purple;
                if (i5 == -1) {
                    i5 = kVar.purple;
                }
                kVar.india(i5);
            } else if (i4 == 13) {
                beige(f11963b);
            } else if (i4 == 12) {
                beige(f11962a);
            } else if (i4 != 15) {
                throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
            }
            this.red = 0;
            this.pathNames[this.stackSize - 1] = BuildConfig.TRAVIS;
            return;
        }
        JsonReader.Token peek = peek();
        nextName();
        throw new JsonDataException("Cannot skip unexpected " + peek + " at " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    public final void skipValue() {
        if (!this.failOnUnknown) {
            int i4 = 0;
            do {
                int i5 = this.red;
                if (i5 == 0) {
                    i5 = echo();
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
                    } else {
                        Tf.k kVar = this.purple;
                        if (i5 != 14 && i5 != 10) {
                            if (i5 != 9 && i5 != 13) {
                                if (i5 != 8 && i5 != 12) {
                                    if (i5 == 17) {
                                        kVar.india(this.teal);
                                    } else if (i5 == 18) {
                                        throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                                    }
                                } else {
                                    beige(f11962a);
                                }
                            } else {
                                beige(f11963b);
                            }
                        } else {
                            long i10 = this.alpha.i(f11964c);
                            if (i10 == -1) {
                                i10 = kVar.purple;
                            }
                            kVar.india(i10);
                        }
                    }
                    this.red = 0;
                }
                i4++;
                this.red = 0;
            } while (i4 != 0);
            int[] iArr = this.pathIndices;
            int i11 = this.stackSize - 1;
            iArr[i11] = iArr[i11] + 1;
            this.pathNames[i11] = BuildConfig.TRAVIS;
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
    }

    public final String toString() {
        return "JsonReader(" + this.alpha + ")";
    }

    public final String uniform() {
        long i4 = this.alpha.i(f11964c);
        Tf.k kVar = this.purple;
        if (i4 != -1) {
            kVar.getClass();
            return kVar.gray(i4, kotlin.text.a.alpha);
        }
        return kVar.green();
    }

    public u(u uVar) {
        super(uVar);
        this.red = 0;
        Tf.ak peek = uVar.alpha.peek();
        this.alpha = peek;
        this.purple = peek.purple;
        this.red = uVar.red;
        this.silver = uVar.silver;
        this.teal = uVar.teal;
        this.white = uVar.white;
        try {
            peek.kilo(uVar.purple.purple);
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
