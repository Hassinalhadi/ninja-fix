package S8;

import ao.ad;
import av.q;
import com.google.gson.stream.MalformedJsonException;
import com.google.maps.android.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public long f2041a;
    public final Reader alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f2042b;

    /* renamed from: c, reason: collision with root package name */
    public String f2043c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f2044d;

    /* renamed from: f, reason: collision with root package name */
    public String[] f2045f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f2046g;

    /* renamed from: h, reason: collision with root package name */
    public int f2047h = 2;
    public final char[] purple = new char[Barcode.FORMAT_UPC_E];
    public int red = 0;
    public int silver = 0;
    public int teal = 0;
    public int white = 0;
    public int yellow = 0;
    public int e = 1;

    static {
        u8.b.red = new u8.b(8);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f2044d = iArr;
        iArr[0] = 6;
        this.f2045f = new String[32];
        this.f2046g = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.alpha = reader;
    }

    public final String azure(boolean z2) {
        StringBuilder sb2 = new StringBuilder("$");
        int i4 = 0;
        while (true) {
            int i5 = this.e;
            if (i4 < i5) {
                int i10 = this.f2044d[i4];
                switch (i10) {
                    case 1:
                    case 2:
                        int i11 = this.f2046g[i4];
                        if (z2 && i11 > 0 && i4 == i5 - 1) {
                            i11--;
                        }
                        sb2.append('[');
                        sb2.append(i11);
                        sb2.append(']');
                        break;
                    case 3:
                    case 4:
                    case 5:
                        sb2.append('.');
                        String str = this.f2045f[i4];
                        if (str == null) {
                            break;
                        } else {
                            sb2.append(str);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError(ad.zulu(i10, "Unknown scope value: "));
                }
                i4++;
            } else {
                return sb2.toString();
            }
        }
    }

    public String beige() {
        return azure(true);
    }

    public boolean blue() {
        int i4 = this.yellow;
        if (i4 == 0) {
            i4 = golf();
        }
        if (i4 != 2 && i4 != 4 && i4 != 17) {
            return true;
        }
        return false;
    }

    public void charlie() {
        int i4 = this.yellow;
        if (i4 == 0) {
            i4 = golf();
        }
        if (i4 == 3) {
            yellow(1);
            this.f2046g[this.e - 1] = 0;
            this.yellow = 0;
            return;
        }
        throw r("BEGIN_ARRAY");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.yellow = 0;
        this.f2044d[0] = 8;
        this.e = 1;
        this.alpha.close();
    }

    public final boolean crimson(char c3) {
        if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
            if (c3 != '#') {
                if (c3 != ',') {
                    if (c3 != '/' && c3 != '=') {
                        if (c3 != '{' && c3 != '}' && c3 != ':') {
                            if (c3 != ';') {
                                switch (c3) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
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
            foxtrot();
            return false;
        }
        return false;
    }

    public final char d() {
        int i4;
        if (this.red == this.silver && !quebec(1)) {
            q("Unterminated escape sequence");
            throw null;
        }
        int i5 = this.red;
        int i10 = i5 + 1;
        this.red = i10;
        char[] cArr = this.purple;
        char c3 = cArr[i5];
        if (c3 != '\n') {
            if (c3 != '\"') {
                if (c3 != '\'') {
                    if (c3 != '/' && c3 != '\\') {
                        if (c3 != 'b') {
                            if (c3 != 'f') {
                                if (c3 == 'n') {
                                    return '\n';
                                }
                                if (c3 != 'r') {
                                    if (c3 != 't') {
                                        if (c3 == 'u') {
                                            if (i5 + 5 > this.silver && !quebec(4)) {
                                                q("Unterminated escape sequence");
                                                throw null;
                                            }
                                            int i11 = this.red;
                                            int i12 = i11 + 4;
                                            int i13 = 0;
                                            while (i11 < i12) {
                                                char c4 = cArr[i11];
                                                int i14 = i13 << 4;
                                                if (c4 >= '0' && c4 <= '9') {
                                                    i4 = c4 - '0';
                                                } else if (c4 >= 'a' && c4 <= 'f') {
                                                    i4 = c4 - 'W';
                                                } else if (c4 >= 'A' && c4 <= 'F') {
                                                    i4 = c4 - '7';
                                                } else {
                                                    q("Malformed Unicode escape \\u".concat(new String(cArr, this.red, 4)));
                                                    throw null;
                                                }
                                                i13 = i4 + i14;
                                                i11++;
                                            }
                                            this.red += 4;
                                            return (char) i13;
                                        }
                                        q("Invalid escape sequence");
                                        throw null;
                                    }
                                    return '\t';
                                }
                                return '\r';
                            }
                            return '\f';
                        }
                        return '\b';
                    }
                }
            }
            return c3;
        }
        if (this.f2047h != 3) {
            this.teal++;
            this.white = i10;
        } else {
            q("Cannot escape a newline character in strict mode");
            throw null;
        }
        if (this.f2047h == 3) {
            q("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c3;
    }

    public void echo() {
        int i4 = this.yellow;
        if (i4 == 0) {
            i4 = golf();
        }
        if (i4 == 1) {
            yellow(3);
            this.yellow = 0;
            return;
        }
        throw r("BEGIN_OBJECT");
    }

    public final void foxtrot() {
        if (this.f2047h == 1) {
            return;
        }
        q("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0218, code lost:
    
        if (crimson(r7) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a9, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x021b, code lost:
    
        if (r11 != 2) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021d, code lost:
    
        if (r14 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0223, code lost:
    
        if (r1 != Long.MIN_VALUE) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0225, code lost:
    
        if (r17 == 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022c, code lost:
    
        if (r1 != 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022e, code lost:
    
        if (r17 != 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0230, code lost:
    
        if (r17 == 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0233, code lost:
    
        r1 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0234, code lost:
    
        r24.f2041a = r1;
        r24.red += r13;
        r10 = 15;
        r24.yellow = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0228, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0240, code lost:
    
        if (r11 == r8) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0243, code lost:
    
        if (r11 == 4) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0246, code lost:
    
        if (r11 != 7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0248, code lost:
    
        r24.f2042b = r13;
        r10 = 16;
        r24.yellow = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int golf() {
        int olive;
        int i4;
        int olive2;
        String str;
        String str2;
        int i5;
        int i10;
        char c3;
        boolean z2;
        int i11;
        int[] iArr = this.f2044d;
        int i12 = this.e - 1;
        int i13 = iArr[i12];
        char[] cArr = this.purple;
        if (i13 == 1) {
            iArr[i12] = 2;
        } else if (i13 == 2) {
            int olive3 = olive(true);
            if (olive3 != 44) {
                if (olive3 != 59) {
                    if (olive3 == 93) {
                        this.yellow = 4;
                        return 4;
                    }
                    q("Unterminated array");
                    throw null;
                }
                foxtrot();
            }
        } else if (i13 != 3 && i13 != 5) {
            if (i13 == 4) {
                iArr[i12] = 5;
                int olive4 = olive(true);
                if (olive4 != 58) {
                    if (olive4 == 61) {
                        foxtrot();
                        if (this.red < this.silver || quebec(1)) {
                            int i14 = this.red;
                            if (cArr[i14] == '>') {
                                this.red = i14 + 1;
                            }
                        }
                    } else {
                        q("Expected ':'");
                        throw null;
                    }
                }
            } else if (i13 == 6) {
                if (this.f2047h == 1) {
                    olive(true);
                    int i15 = this.red;
                    this.red = i15 - 1;
                    if (i15 + 4 <= this.silver || quebec(5)) {
                        int i16 = this.red;
                        if (cArr[i16] == ')' && cArr[i16 + 1] == ']' && cArr[i16 + 2] == '}' && cArr[i16 + 3] == '\'' && cArr[i16 + 4] == '\n') {
                            this.red = i16 + 5;
                        }
                    }
                }
                this.f2044d[this.e - 1] = 7;
            } else {
                if (i13 == 7) {
                    i4 = 0;
                    if (olive(false) == -1) {
                        this.yellow = 17;
                        return 17;
                    }
                    foxtrot();
                    this.red--;
                } else {
                    i4 = 0;
                    if (i13 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                olive2 = olive(true);
                if (olive2 == 34) {
                    if (olive2 != 39) {
                        if (olive2 != 44 && olive2 != 59) {
                            if (olive2 != 91) {
                                if (olive2 != 93) {
                                    if (olive2 != 123) {
                                        int i17 = this.red - 1;
                                        this.red = i17;
                                        char c4 = cArr[i17];
                                        if (c4 != 't' && c4 != 'T') {
                                            if (c4 != 'f' && c4 != 'F') {
                                                if (c4 == 'n' || c4 == 'N') {
                                                    str = BuildConfig.TRAVIS;
                                                    str2 = "NULL";
                                                    i5 = 7;
                                                }
                                                i5 = i4;
                                                if (i5 == 0) {
                                                    return i5;
                                                }
                                                int i18 = this.red;
                                                int i19 = this.silver;
                                                int i20 = i4;
                                                int i21 = i20;
                                                int i22 = i21;
                                                int i23 = i18;
                                                boolean z10 = true;
                                                long j5 = 0;
                                                while (true) {
                                                    if (i23 + i21 == i19) {
                                                        if (i21 == cArr.length) {
                                                            break;
                                                        }
                                                        if (!quebec(i21 + 1)) {
                                                            break;
                                                        }
                                                        i23 = this.red;
                                                        i19 = this.silver;
                                                    }
                                                    char c10 = cArr[i23 + i21];
                                                    if (c10 != '+') {
                                                        if (c10 != 'E' && c10 != 'e') {
                                                            if (c10 != '-') {
                                                                if (c10 != '.') {
                                                                    if (c10 < '0' || c10 > '9') {
                                                                        break;
                                                                    }
                                                                    if (i20 != 1 && i20 != 0) {
                                                                        if (i20 == 2) {
                                                                            if (j5 == 0) {
                                                                                break;
                                                                            }
                                                                            long j6 = (10 * j5) - (c10 - '0');
                                                                            if (j5 <= -922337203685477580L && (j5 != -922337203685477580L || j6 >= j5)) {
                                                                                z2 = false;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            z10 &= z2;
                                                                            j5 = j6;
                                                                        } else if (i20 == 3) {
                                                                            i20 = 4;
                                                                        } else if (i20 == 5 || i20 == 6) {
                                                                            i20 = 7;
                                                                        }
                                                                    } else {
                                                                        j5 = -(c10 - '0');
                                                                        i20 = 2;
                                                                    }
                                                                    i21++;
                                                                } else {
                                                                    if (i20 != 2) {
                                                                        break;
                                                                    }
                                                                    i20 = 3;
                                                                    i21++;
                                                                }
                                                            } else if (i20 == 0) {
                                                                i20 = 1;
                                                                i22 = 1;
                                                                i21++;
                                                            } else {
                                                                if (i20 != 5) {
                                                                    break;
                                                                }
                                                                i20 = 6;
                                                                i21++;
                                                            }
                                                        } else {
                                                            if (i20 != 2 && i20 != 4) {
                                                                break;
                                                            }
                                                            i20 = 5;
                                                            i21++;
                                                        }
                                                        if (i11 == 0) {
                                                            return i11;
                                                        }
                                                        if (crimson(cArr[this.red])) {
                                                            foxtrot();
                                                            this.yellow = 10;
                                                            return 10;
                                                        }
                                                        q("Expected value");
                                                        throw null;
                                                    }
                                                    if (i20 != 5) {
                                                        break;
                                                    }
                                                    i20 = 6;
                                                    i21++;
                                                }
                                                i11 = 0;
                                                if (i11 == 0) {
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
                                        if (this.f2047h != 3) {
                                            i10 = 1;
                                        } else {
                                            i10 = i4;
                                        }
                                        int length = str.length();
                                        int i24 = i4;
                                        while (true) {
                                            if (i24 < length) {
                                                if ((this.red + i24 >= this.silver && !quebec(i24 + 1)) || ((c3 = cArr[this.red + i24]) != str.charAt(i24) && (i10 == 0 || c3 != str2.charAt(i24)))) {
                                                    break;
                                                }
                                                i24++;
                                            } else if ((this.red + length >= this.silver && !quebec(length + 1)) || !crimson(cArr[this.red + length])) {
                                                this.red += length;
                                                this.yellow = i5;
                                            }
                                        }
                                        i5 = i4;
                                        if (i5 == 0) {
                                        }
                                    } else {
                                        this.yellow = 1;
                                        return 1;
                                    }
                                } else if (i13 == 1) {
                                    this.yellow = 4;
                                    return 4;
                                }
                            } else {
                                this.yellow = 3;
                                return 3;
                            }
                        }
                        if (i13 != 1 && i13 != 2) {
                            q("Unexpected value");
                            throw null;
                        }
                        foxtrot();
                        this.red--;
                        this.yellow = 7;
                        return 7;
                    }
                    foxtrot();
                    this.yellow = 8;
                    return 8;
                }
                this.yellow = 9;
                return 9;
            }
        } else {
            iArr[i12] = 4;
            if (i13 == 5 && (olive = olive(true)) != 44) {
                if (olive != 59) {
                    if (olive == 125) {
                        this.yellow = 2;
                        return 2;
                    }
                    q("Unterminated object");
                    throw null;
                }
                foxtrot();
            }
            int olive5 = olive(true);
            if (olive5 != 34) {
                if (olive5 != 39) {
                    if (olive5 != 125) {
                        foxtrot();
                        this.red--;
                        if (crimson((char) olive5)) {
                            this.yellow = 14;
                            return 14;
                        }
                        q("Expected name");
                        throw null;
                    }
                    if (i13 != 5) {
                        this.yellow = 2;
                        return 2;
                    }
                    q("Expected name");
                    throw null;
                }
                foxtrot();
                this.yellow = 12;
                return 12;
            }
            this.yellow = 13;
            return 13;
        }
        i4 = 0;
        olive2 = olive(true);
        if (olive2 == 34) {
        }
    }

    final String gray() {
        StringBuilder hotel = q.hotel(this.teal + 1, (this.red - this.white) + 1, " at line ", " column ", " path ");
        hotel.append(uniform());
        return hotel.toString();
    }

    public boolean green() {
        int i4 = this.yellow;
        if (i4 == 0) {
            i4 = golf();
        }
        if (i4 == 5) {
            this.yellow = 0;
            int[] iArr = this.f2046g;
            int i5 = this.e - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        }
        if (i4 == 6) {
            this.yellow = 0;
            int[] iArr2 = this.f2046g;
            int i10 = this.e - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        throw r("a boolean");
    }

    public double indigo() {
        char c3;
        int i4 = this.yellow;
        if (i4 == 0) {
            i4 = golf();
        }
        if (i4 == 15) {
            this.yellow = 0;
            int[] iArr = this.f2046g;
            int i5 = this.e - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f2041a;
        }
        if (i4 == 16) {
            this.f2043c = new String(this.purple, this.red, this.f2042b);
            this.red += this.f2042b;
        } else if (i4 != 8 && i4 != 9) {
            if (i4 == 10) {
                this.f2043c = silver();
            } else if (i4 != 11) {
                throw r("a double");
            }
        } else {
            if (i4 == 8) {
                c3 = '\'';
            } else {
                c3 = '\"';
            }
            this.f2043c = pink(c3);
        }
        this.yellow = 11;
        double parseDouble = Double.parseDouble(this.f2043c);
        if (this.f2047h != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            q("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.f2043c = null;
        this.yellow = 0;
        int[] iArr2 = this.f2046g;
        int i10 = this.e - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return parseDouble;
    }

    public final void j(int i4) {
        if (i4 != 0) {
            this.f2047h = i4;
            return;
        }
        throw null;
    }

    public int jade() {
        char c3;
        int i4 = this.yellow;
        if (i4 == 0) {
            i4 = golf();
        }
        if (i4 == 15) {
            long j5 = this.f2041a;
            int i5 = (int) j5;
            if (j5 == i5) {
                this.yellow = 0;
                int[] iArr = this.f2046g;
                int i10 = this.e - 1;
                iArr[i10] = iArr[i10] + 1;
                return i5;
            }
            throw new NumberFormatException("Expected an int but was " + this.f2041a + gray());
        }
        if (i4 == 16) {
            this.f2043c = new String(this.purple, this.red, this.f2042b);
            this.red += this.f2042b;
        } else {
            if (i4 != 8 && i4 != 9 && i4 != 10) {
                throw r("an int");
            }
            if (i4 == 10) {
                this.f2043c = silver();
            } else {
                if (i4 == 8) {
                    c3 = '\'';
                } else {
                    c3 = '\"';
                }
                this.f2043c = pink(c3);
            }
            try {
                int parseInt = Integer.parseInt(this.f2043c);
                this.yellow = 0;
                int[] iArr2 = this.f2046g;
                int i11 = this.e - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.yellow = 11;
        double parseDouble = Double.parseDouble(this.f2043c);
        int i12 = (int) parseDouble;
        if (i12 == parseDouble) {
            this.f2043c = null;
            this.yellow = 0;
            int[] iArr3 = this.f2046g;
            int i13 = this.e - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return i12;
        }
        throw new NumberFormatException("Expected an int but was " + this.f2043c + gray());
    }

    public void juliet() {
        int i4 = this.yellow;
        if (i4 == 0) {
            i4 = golf();
        }
        if (i4 == 4) {
            int i5 = this.e;
            this.e = i5 - 1;
            int[] iArr = this.f2046g;
            int i10 = i5 - 2;
            iArr[i10] = iArr[i10] + 1;
            this.yellow = 0;
            return;
        }
        throw r("END_ARRAY");
    }

    public final void l(char c3) {
        do {
            int i4 = this.red;
            int i5 = this.silver;
            while (i4 < i5) {
                int i10 = i4 + 1;
                char c4 = this.purple[i4];
                if (c4 == c3) {
                    this.red = i10;
                    return;
                }
                if (c4 == '\\') {
                    this.red = i10;
                    d();
                    i4 = this.red;
                    i5 = this.silver;
                } else {
                    if (c4 == '\n') {
                        this.teal++;
                        this.white = i10;
                    }
                    i4 = i10;
                }
            }
            this.red = i4;
        } while (quebec(1));
        q("Unterminated string");
        throw null;
    }

    public long magenta() {
        char c3;
        int i4 = this.yellow;
        if (i4 == 0) {
            i4 = golf();
        }
        if (i4 == 15) {
            this.yellow = 0;
            int[] iArr = this.f2046g;
            int i5 = this.e - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f2041a;
        }
        if (i4 == 16) {
            this.f2043c = new String(this.purple, this.red, this.f2042b);
            this.red += this.f2042b;
        } else {
            if (i4 != 8 && i4 != 9 && i4 != 10) {
                throw r("a long");
            }
            if (i4 == 10) {
                this.f2043c = silver();
            } else {
                if (i4 == 8) {
                    c3 = '\'';
                } else {
                    c3 = '\"';
                }
                this.f2043c = pink(c3);
            }
            try {
                long parseLong = Long.parseLong(this.f2043c);
                this.yellow = 0;
                int[] iArr2 = this.f2046g;
                int i10 = this.e - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.yellow = 11;
        double parseDouble = Double.parseDouble(this.f2043c);
        long j5 = (long) parseDouble;
        if (j5 == parseDouble) {
            this.f2043c = null;
            this.yellow = 0;
            int[] iArr3 = this.f2046g;
            int i11 = this.e - 1;
            iArr3[i11] = iArr3[i11] + 1;
            return j5;
        }
        throw new NumberFormatException("Expected a long but was " + this.f2043c + gray());
    }

    public final void n() {
        char c3;
        do {
            if (this.red < this.silver || quebec(1)) {
                int i4 = this.red;
                int i5 = i4 + 1;
                this.red = i5;
                c3 = this.purple[i4];
                if (c3 == '\n') {
                    this.teal++;
                    this.white = i5;
                    return;
                }
            } else {
                return;
            }
        } while (c3 != '\r');
    }

    public String navy() {
        String pink;
        int i4 = this.yellow;
        if (i4 == 0) {
            i4 = golf();
        }
        if (i4 == 14) {
            pink = silver();
        } else if (i4 == 12) {
            pink = pink('\'');
        } else if (i4 == 13) {
            pink = pink('\"');
        } else {
            throw r("a name");
        }
        this.yellow = 0;
        this.f2045f[this.e - 1] = pink;
        return pink;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void o() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.red
            int r2 = r1 + r0
            int r3 = r4.silver
            if (r2 >= r3) goto L51
            char[] r2 = r4.purple
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.foxtrot()
        L4b:
            int r1 = r4.red
            int r1 = r1 + r0
            r4.red = r1
            return
        L51:
            int r1 = r1 + r0
            r4.red = r1
            r0 = 1
            boolean r0 = r4.quebec(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S8.a.o():void");
    }

    public final int olive(boolean z2) {
        char c3;
        int i4 = this.red;
        int i5 = this.silver;
        while (true) {
            if (i4 == i5) {
                this.red = i4;
                if (!quebec(1)) {
                    if (!z2) {
                        return -1;
                    }
                    throw new EOFException("End of input" + gray());
                }
                i4 = this.red;
                i5 = this.silver;
            }
            int i10 = i4 + 1;
            char[] cArr = this.purple;
            c3 = cArr[i4];
            if (c3 == '\n') {
                this.teal++;
                this.white = i10;
            } else if (c3 != ' ' && c3 != '\r' && c3 != '\t') {
                if (c3 == '/') {
                    this.red = i10;
                    if (i10 == i5) {
                        this.red = i4;
                        boolean quebec = quebec(2);
                        this.red++;
                        if (!quebec) {
                            break;
                        }
                    }
                    foxtrot();
                    int i11 = this.red;
                    char c4 = cArr[i11];
                    if (c4 != '*') {
                        if (c4 != '/') {
                            break;
                        }
                        this.red = i11 + 1;
                        n();
                        i4 = this.red;
                        i5 = this.silver;
                    } else {
                        this.red = i11 + 1;
                        while (true) {
                            if (this.red + 2 > this.silver && !quebec(2)) {
                                q("Unterminated comment");
                                throw null;
                            }
                            int i12 = this.red;
                            if (cArr[i12] == '\n') {
                                this.teal++;
                                this.white = i12 + 1;
                            } else {
                                for (int i13 = 0; i13 < 2; i13++) {
                                    if (cArr[this.red + i13] != "*/".charAt(i13)) {
                                        break;
                                    }
                                }
                                i4 = this.red + 2;
                                i5 = this.silver;
                                break;
                            }
                            this.red++;
                        }
                    }
                } else if (c3 == '#') {
                    this.red = i10;
                    foxtrot();
                    n();
                    i4 = this.red;
                    i5 = this.silver;
                } else {
                    this.red = i10;
                    return c3;
                }
            }
            i4 = i10;
        }
        return c3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    public void p() {
        int i4 = 0;
        do {
            int i5 = this.yellow;
            if (i5 == 0) {
                i5 = golf();
            }
            switch (i5) {
                case 1:
                    yellow(3);
                    i4++;
                    this.yellow = 0;
                    break;
                case 2:
                    if (i4 == 0) {
                        this.f2045f[this.e - 1] = null;
                    }
                    this.e--;
                    i4--;
                    this.yellow = 0;
                    break;
                case 3:
                    yellow(1);
                    i4++;
                    this.yellow = 0;
                    break;
                case 4:
                    this.e--;
                    i4--;
                    this.yellow = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.yellow = 0;
                    break;
                case 8:
                    l('\'');
                    this.yellow = 0;
                    break;
                case 9:
                    l('\"');
                    this.yellow = 0;
                    break;
                case 10:
                    o();
                    this.yellow = 0;
                    break;
                case 12:
                    l('\'');
                    if (i4 == 0) {
                        this.f2045f[this.e - 1] = "<skipped>";
                    }
                    this.yellow = 0;
                    break;
                case 13:
                    l('\"');
                    if (i4 == 0) {
                        this.f2045f[this.e - 1] = "<skipped>";
                    }
                    this.yellow = 0;
                    break;
                case 14:
                    o();
                    if (i4 == 0) {
                        this.f2045f[this.e - 1] = "<skipped>";
                    }
                    this.yellow = 0;
                    break;
                case 16:
                    this.red += this.f2042b;
                    this.yellow = 0;
                    break;
                case 17:
                    return;
            }
        } while (i4 > 0);
        int[] iArr = this.f2046g;
        int i10 = this.e - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public void papa() {
        int i4 = this.yellow;
        if (i4 == 0) {
            i4 = golf();
        }
        if (i4 == 2) {
            int i5 = this.e;
            int i10 = i5 - 1;
            this.e = i10;
            this.f2045f[i10] = null;
            int[] iArr = this.f2046g;
            int i11 = i5 - 2;
            iArr[i11] = iArr[i11] + 1;
            this.yellow = 0;
            return;
        }
        throw r("END_OBJECT");
    }

    public void peach() {
        int i4 = this.yellow;
        if (i4 == 0) {
            i4 = golf();
        }
        if (i4 == 7) {
            this.yellow = 0;
            int[] iArr = this.f2046g;
            int i5 = this.e - 1;
            iArr[i5] = iArr[i5] + 1;
            return;
        }
        throw r(BuildConfig.TRAVIS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r11.red = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r11.red = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String pink(char c3) {
        char[] cArr;
        int i4;
        StringBuilder sb2 = null;
        do {
            int i5 = this.red;
            int i10 = this.silver;
            while (true) {
                int i11 = i10;
                int i12 = i5;
                while (true) {
                    cArr = this.purple;
                    if (i5 >= i11) {
                        break;
                    }
                    int i13 = i5 + 1;
                    char c4 = cArr[i5];
                    if (this.f2047h == 3 && c4 < ' ') {
                        q("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    }
                    if (c4 == c3) {
                        this.red = i13;
                        int i14 = (i13 - i12) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i12, i14);
                        }
                        sb2.append(cArr, i12, i14);
                        return sb2.toString();
                    }
                    if (c4 == '\\') {
                        break;
                    }
                    if (c4 == '\n') {
                        this.teal++;
                        this.white = i13;
                    }
                    i5 = i13;
                }
                sb2.append(cArr, i12, i4);
                sb2.append(d());
                i5 = this.red;
                i10 = this.silver;
            }
        } while (quebec(1));
        q("Unterminated string");
        throw null;
    }

    public String purple() {
        String str;
        int i4 = this.yellow;
        if (i4 == 0) {
            i4 = golf();
        }
        if (i4 == 10) {
            str = silver();
        } else if (i4 == 8) {
            str = pink('\'');
        } else if (i4 == 9) {
            str = pink('\"');
        } else if (i4 == 11) {
            str = this.f2043c;
            this.f2043c = null;
        } else if (i4 == 15) {
            str = Long.toString(this.f2041a);
        } else if (i4 == 16) {
            str = new String(this.purple, this.red, this.f2042b);
            this.red += this.f2042b;
        } else {
            throw r("a string");
        }
        this.yellow = 0;
        int[] iArr = this.f2046g;
        int i5 = this.e - 1;
        iArr[i5] = iArr[i5] + 1;
        return str;
    }

    public final void q(String str) {
        StringBuilder tango = Q0.c.tango(str);
        tango.append(gray());
        tango.append("\nSee ");
        tango.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(tango.toString());
    }

    public final boolean quebec(int i4) {
        int i5;
        int i10;
        int i11 = this.white;
        int i12 = this.red;
        this.white = i11 - i12;
        int i13 = this.silver;
        char[] cArr = this.purple;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.silver = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.silver = 0;
        }
        this.red = 0;
        do {
            int i15 = this.silver;
            int read = this.alpha.read(cArr, i15, cArr.length - i15);
            if (read == -1) {
                return false;
            }
            i5 = this.silver + read;
            this.silver = i5;
            if (this.teal == 0 && (i10 = this.white) == 0 && i5 > 0 && cArr[0] == 65279) {
                this.red++;
                this.white = i10 + 1;
                i4++;
            }
        } while (i5 < i4);
        return true;
    }

    public final IllegalStateException r(String str) {
        String str2;
        if (white() == b.f2049b) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        StringBuilder victor = Q0.c.victor("Expected ", str, " but was ");
        victor.append(white());
        victor.append(gray());
        victor.append("\nSee ");
        victor.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(victor.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        foxtrot();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String silver() {
        char[] cArr;
        String sb2;
        StringBuilder sb3 = null;
        int i4 = 0;
        do {
            int i5 = 0;
            while (true) {
                int i10 = this.red;
                int i11 = i10 + i5;
                int i12 = this.silver;
                cArr = this.purple;
                if (i11 < i12) {
                    char c3 = cArr[i10 + i5];
                    if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                        if (c3 != '#') {
                            if (c3 != ',') {
                                if (c3 != '/' && c3 != '=') {
                                    if (c3 != '{' && c3 != '}' && c3 != ':') {
                                        if (c3 != ';') {
                                            switch (c3) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i5++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i5 < cArr.length) {
                    if (quebec(i5 + 1)) {
                    }
                } else {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i5, 16));
                    }
                    sb3.append(cArr, this.red, i5);
                    this.red += i5;
                }
            }
            i4 = i5;
            if (sb3 != null) {
                sb2 = new String(cArr, this.red, i4);
            } else {
                sb3.append(cArr, this.red, i4);
                sb2 = sb3.toString();
            }
            this.red += i4;
            return sb2;
        } while (quebec(1));
        if (sb3 != null) {
        }
        this.red += i4;
        return sb2;
    }

    public String toString() {
        return getClass().getSimpleName() + gray();
    }

    public String uniform() {
        return azure(false);
    }

    public b white() {
        int i4 = this.yellow;
        if (i4 == 0) {
            i4 = golf();
        }
        switch (i4) {
            case 1:
                return b.red;
            case 2:
                return b.silver;
            case 3:
                return b.alpha;
            case 4:
                return b.purple;
            case 5:
            case 6:
                return b.f2048a;
            case 7:
                return b.f2049b;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.white;
            case 12:
            case 13:
            case 14:
                return b.teal;
            case 15:
            case 16:
                return b.yellow;
            case 17:
                return b.f2050c;
            default:
                throw new AssertionError();
        }
    }

    public final void yellow(int i4) {
        int i5 = this.e;
        if (i5 - 1 < 255) {
            int[] iArr = this.f2044d;
            if (i5 == iArr.length) {
                int i10 = i5 * 2;
                this.f2044d = Arrays.copyOf(iArr, i10);
                this.f2046g = Arrays.copyOf(this.f2046g, i10);
                this.f2045f = (String[]) Arrays.copyOf(this.f2045f, i10);
            }
            int[] iArr2 = this.f2044d;
            int i11 = this.e;
            this.e = i11 + 1;
            iArr2[i11] = i4;
            return;
        }
        throw new MalformedJsonException("Nesting limit 255 reached" + gray());
    }
}
