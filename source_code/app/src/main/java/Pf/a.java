package Pf;

import com.google.maps.android.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a {
    public int alpha;
    public final B0.a bravo;
    public String charlie;
    public final StringBuilder delta;

    public a() {
        B0.a aVar = new B0.a((char) 0, 1);
        aVar.charlie = new Object[8];
        int[] iArr = new int[8];
        for (int i4 = 0; i4 < 8; i4++) {
            iArr[i4] = -1;
        }
        aVar.delta = iArr;
        aVar.bravo = -1;
        this.bravo = aVar;
        this.delta = new StringBuilder();
    }

    public static /* synthetic */ void romeo(a aVar, String str, int i4, String str2, int i5) {
        if ((i5 & 2) != 0) {
            i4 = aVar.alpha;
        }
        if ((i5 & 4) != 0) {
            str2 = "";
        }
        aVar.quebec(i4, str, str2);
        throw null;
    }

    public static boolean uniform(char c3) {
        if (c3 != ',' && c3 != ':' && c3 != ']' && c3 != '}') {
            return true;
        }
        return false;
    }

    public final int alpha(CharSequence charSequence, int i4) {
        int i5 = i4 + 4;
        if (i5 >= charSequence.length()) {
            this.alpha = i4;
            oscar();
            if (this.alpha + 4 < charSequence.length()) {
                return alpha(charSequence, this.alpha);
            }
            romeo(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        this.delta.append((char) (sierra(charSequence, i4 + 3) + (sierra(charSequence, i4) << 12) + (sierra(charSequence, i4 + 1) << 8) + (sierra(charSequence, i4 + 2) << 4)));
        return i5;
    }

    public String amber(int i4, int i5) {
        return tango().subSequence(i4, i5).toString();
    }

    public final boolean azure() {
        int zulu = zulu();
        CharSequence tango = tango();
        if (zulu < tango.length() && zulu != -1 && tango.charAt(zulu) == ',') {
            this.alpha++;
            return true;
        }
        return false;
    }

    public final void beige(char c3) {
        String str;
        int i4 = this.alpha;
        if (i4 > 0 && c3 == '\"') {
            try {
                this.alpha = i4 - 1;
                String lima = lima();
                this.alpha = i4;
                if (Intrinsics.areEqual(lima, BuildConfig.TRAVIS)) {
                    quebec(this.alpha - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.alpha = i4;
                throw th;
            }
        }
        String romeo = r.romeo(r.golf(c3));
        int i5 = this.alpha;
        int i10 = i5 - 1;
        if (i5 != tango().length() && i10 >= 0) {
            str = String.valueOf(tango().charAt(i10));
        } else {
            str = "EOF";
        }
        romeo(this, av.q.golf("Expected ", romeo, ", but had '", str, "' instead"), i10, null, 4);
        throw null;
    }

    public void bravo(int i4, int i5) {
        this.delta.append(tango(), i4, i5);
    }

    public abstract boolean charlie();

    public final void delta(int i4, String str) {
        if (tango().length() - i4 >= str.length()) {
            int length = str.length();
            for (int i5 = 0; i5 < length; i5++) {
                if (str.charAt(i5) != (tango().charAt(i4 + i5) | ' ')) {
                    romeo(this, "Expected valid boolean literal prefix, but had '" + lima() + '\'', 0, null, 6);
                    throw null;
                }
            }
            this.alpha = str.length() + i4;
            return;
        }
        romeo(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }

    public abstract String echo();

    public abstract byte foxtrot();

    public final byte golf(byte b2) {
        String str;
        byte foxtrot = foxtrot();
        if (foxtrot != b2) {
            String romeo = r.romeo(b2);
            int i4 = this.alpha;
            int i5 = i4 - 1;
            if (i4 != tango().length() && i5 >= 0) {
                str = String.valueOf(tango().charAt(i5));
            } else {
                str = "EOF";
            }
            romeo(this, av.q.golf("Expected ", romeo, ", but had '", str, "' instead"), i5, null, 4);
            throw null;
        }
        return foxtrot;
    }

    public abstract void hotel(char c3);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b4, code lost:
    
        romeo(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ba, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x017c, code lost:
    
        if (r20 != true) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x017e, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c0, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c1, code lost:
    
        if (r13 == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c3, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c8, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01cb, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01cc, code lost:
    
        romeo(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d3, code lost:
    
        romeo(r22, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0137, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
    
        r12 = r6;
        romeo(r22, "Unexpected symbol '" + r8 + "' in numeric literal", 0, r12, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012a, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0133, code lost:
    
        if (r11 == r1) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0135, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0138, code lost:
    
        if (r1 == r11) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013a, code lost:
    
        if (r13 == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013e, code lost:
    
        if (r1 == (r11 - 1)) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0146, code lost:
    
        if (r19 == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0148, code lost:
    
        if (r2 == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0154, code lost:
    
        if (tango().charAt(r11) != '\"') goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0156, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0159, code lost:
    
        romeo(r22, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0162, code lost:
    
        romeo(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0168, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0169, code lost:
    
        r22.alpha = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016b, code lost:
    
        if (r21 == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016d, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0170, code lost:
    
        if (r20 != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0172, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0183, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0188, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018e, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0196, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0198, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x019a, code lost:
    
        romeo(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long india() {
        boolean z2;
        boolean z10;
        boolean z11;
        int yankee = yankee(zulu());
        ?? r62 = 0;
        if (yankee < tango().length() && yankee != -1) {
            if (tango().charAt(yankee) == '\"') {
                yankee++;
                if (yankee != tango().length()) {
                    z2 = true;
                } else {
                    romeo(this, "EOF", 0, null, 6);
                    throw null;
                }
            } else {
                z2 = false;
            }
            int i4 = yankee;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            long j5 = 0;
            long j6 = 0;
            while (true) {
                if (i4 != tango().length()) {
                    char charAt = tango().charAt(i4);
                    if ((charAt != 'e' && charAt != 'E') || z13) {
                        z10 = z2;
                        if (charAt == '-' && z13) {
                            if (i4 != yankee) {
                                i4++;
                                z2 = z10;
                                z12 = false;
                                r62 = r62;
                            } else {
                                romeo(this, "Unexpected symbol '-' in numeric literal", 0, r62, 6);
                                throw r62;
                            }
                        } else if (charAt == '+' && z13) {
                            if (i4 != yankee) {
                                i4++;
                                z2 = z10;
                                z12 = true;
                                r62 = r62;
                            } else {
                                romeo(this, "Unexpected symbol '+' in numeric literal", 0, r62, 6);
                                throw r62;
                            }
                        } else {
                            z11 = z13;
                            if (charAt == '-') {
                                if (i4 == yankee) {
                                    i4++;
                                    z2 = z10;
                                    z13 = z11;
                                    z14 = true;
                                } else {
                                    romeo(this, "Unexpected symbol '-' in numeric literal", 0, r62, 6);
                                    throw r62;
                                }
                            } else {
                                if (r.golf(charAt) != 0) {
                                    break;
                                }
                                i4++;
                                int i5 = charAt - '0';
                                if (i5 < 0 || i5 >= 10) {
                                    break;
                                }
                                if (z11) {
                                    j5 = (j5 * 10) + i5;
                                    z2 = z10;
                                    z13 = z11;
                                    r62 = r62;
                                } else {
                                    boolean z15 = z12;
                                    j6 = (j6 * 10) - i5;
                                    if (j6 <= 0) {
                                        z2 = z10;
                                        z12 = z15;
                                        z13 = z11;
                                        r62 = 0;
                                    } else {
                                        romeo(this, "Numeric value overflow", 0, null, 6);
                                        throw null;
                                    }
                                }
                            }
                        }
                    } else if (i4 != yankee) {
                        i4++;
                        z12 = true;
                        z13 = true;
                    } else {
                        romeo(this, "Unexpected symbol " + charAt + " in numeric literal", 0, r62, 6);
                        throw r62;
                    }
                } else {
                    z10 = z2;
                    z11 = z13;
                    break;
                }
            }
        } else {
            romeo(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public final String juliet() {
        String str = this.charlie;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            this.charlie = null;
            return str;
        }
        return echo();
    }

    public final String kilo(CharSequence source, int i4, int i5) {
        String november;
        char c3;
        Intrinsics.echo(source, "source");
        char charAt = source.charAt(i5);
        boolean z2 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                bravo(i4, i5);
                int yankee = yankee(i5 + 1);
                if (yankee != -1) {
                    int i10 = yankee + 1;
                    char charAt2 = tango().charAt(yankee);
                    if (charAt2 == 'u') {
                        i10 = alpha(tango(), i10);
                    } else {
                        if (charAt2 < 'u') {
                            c3 = h.alpha[charAt2];
                        } else {
                            c3 = 0;
                        }
                        if (c3 != 0) {
                            this.delta.append(c3);
                        } else {
                            romeo(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                            throw null;
                        }
                    }
                    i4 = yankee(i10);
                    if (i4 == -1) {
                        romeo(this, "Unexpected EOF", i4, null, 4);
                        throw null;
                    }
                } else {
                    romeo(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
            } else {
                i5++;
                if (i5 >= source.length()) {
                    bravo(i4, i5);
                    i4 = yankee(i5);
                    if (i4 == -1) {
                        romeo(this, "Unexpected EOF", i4, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    charAt = source.charAt(i5);
                }
            }
            i5 = i4;
            z2 = true;
            charAt = source.charAt(i5);
        }
        if (!z2) {
            november = amber(i4, i5);
        } else {
            november = november(i4, i5);
        }
        this.alpha = i5 + 1;
        return november;
    }

    public final String lima() {
        String november;
        String str = this.charlie;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            this.charlie = null;
            return str;
        }
        int zulu = zulu();
        if (zulu < tango().length() && zulu != -1) {
            byte golf = r.golf(tango().charAt(zulu));
            if (golf == 1) {
                return juliet();
            }
            if (golf == 0) {
                boolean z2 = false;
                while (r.golf(tango().charAt(zulu)) == 0) {
                    zulu++;
                    if (zulu >= tango().length()) {
                        bravo(this.alpha, zulu);
                        int yankee = yankee(zulu);
                        if (yankee == -1) {
                            this.alpha = zulu;
                            return november(0, 0);
                        }
                        zulu = yankee;
                        z2 = true;
                    }
                }
                if (!z2) {
                    november = amber(this.alpha, zulu);
                } else {
                    november = november(this.alpha, zulu);
                }
                this.alpha = zulu;
                return november;
            }
            romeo(this, "Expected beginning of the string, but got " + tango().charAt(zulu), 0, null, 6);
            throw null;
        }
        romeo(this, "EOF", zulu, null, 4);
        throw null;
    }

    public final String mike() {
        String lima = lima();
        if (Intrinsics.areEqual(lima, BuildConfig.TRAVIS) && tango().charAt(this.alpha - 1) != '\"') {
            romeo(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
            throw null;
        }
        return lima;
    }

    public final String november(int i4, int i5) {
        bravo(i4, i5);
        StringBuilder sb2 = this.delta;
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        sb2.setLength(0);
        return sb3;
    }

    public void oscar() {
    }

    public final void papa() {
        if (foxtrot() == 10) {
            return;
        }
        romeo(this, "Expected EOF after parsing, but had " + tango().charAt(this.alpha - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final void quebec(int i4, String message, String hint) {
        String concat;
        Intrinsics.echo(message, "message");
        Intrinsics.echo(hint, "hint");
        if (hint.length() == 0) {
            concat = "";
        } else {
            concat = "\n".concat(hint);
        }
        StringBuilder beige = ao.ad.beige(message, " at path: ");
        beige.append(this.bravo.echo());
        beige.append(concat);
        throw r.delta(i4, tango(), beige.toString());
    }

    public final int sierra(CharSequence charSequence, int i4) {
        char charAt = charSequence.charAt(i4);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        romeo(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence tango();

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsonReader(source='");
        sb2.append((Object) tango());
        sb2.append("', currentPosition=");
        return Q0.c.quebec(sb2, this.alpha, ')');
    }

    public abstract String victor(String str, boolean z2);

    public byte whiskey() {
        CharSequence tango = tango();
        int i4 = this.alpha;
        while (true) {
            int yankee = yankee(i4);
            if (yankee != -1) {
                char charAt = tango.charAt(yankee);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    this.alpha = yankee;
                    return r.golf(charAt);
                }
                i4 = yankee + 1;
            } else {
                this.alpha = yankee;
                return (byte) 10;
            }
        }
    }

    public final String xray(boolean z2) {
        String juliet;
        byte whiskey = whiskey();
        if (z2) {
            if (whiskey == 1 || whiskey == 0) {
                juliet = lima();
            } else {
                return null;
            }
        } else {
            if (whiskey != 1) {
                return null;
            }
            juliet = juliet();
        }
        this.charlie = juliet;
        return juliet;
    }

    public abstract int yankee(int i4);

    public abstract int zulu();
}
