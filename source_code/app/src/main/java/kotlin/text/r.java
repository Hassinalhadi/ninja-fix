package kotlin.text;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Settings;
import pe.AbstractC2327c;
import s6.AbstractC2743p6;

/* loaded from: classes2.dex */
public abstract class r extends q {
    public static String echo(char[] cArr, int i4, int i5) {
        ab.charlie(i4, i5, cArr.length);
        return new String(cArr, i4, i5 - i4);
    }

    public static String foxtrot(byte[] bArr) {
        Intrinsics.echo(bArr, "<this>");
        return new String(bArr, a.alpha);
    }

    public static boolean golf(String str, String suffix, boolean z2) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(suffix, "suffix");
        if (!z2) {
            return str.endsWith(suffix);
        }
        return lima(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean hotel(String str, String str2, boolean z2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z2) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static void india() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.delta(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean juliet(String str) {
        char c3;
        boolean z2;
        boolean z10;
        int charAt;
        int i4;
        boolean z11;
        int i5;
        boolean z12;
        String str2;
        boolean z13;
        boolean z14;
        boolean z15 = true;
        int length = str.length() - 1;
        int i10 = 0;
        while (true) {
            c3 = ' ';
            if (i10 > length || str.charAt(i10) > ' ') {
                break;
            }
            i10++;
        }
        if (i10 > length) {
            return false;
        }
        while (length > i10 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i10) == '+' || str.charAt(i10) == '-') {
            i10++;
        }
        if (i10 > length) {
            return false;
        }
        if (str.charAt(i10) == '0') {
            int i11 = i10 + 1;
            if (i11 > length) {
                return true;
            }
            if ((str.charAt(i11) | ' ') == 120) {
                int i12 = i10 + 2;
                int i13 = i12;
                while (true) {
                    if (i13 <= length) {
                        z2 = z15;
                        if (((str.charAt(i13) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 10 && (((r15 | ' ') - 97) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 6) {
                            break;
                        }
                        i13++;
                        z15 = z2;
                    } else {
                        z2 = z15;
                        break;
                    }
                }
                if (i12 != i13) {
                    z13 = z2;
                } else {
                    z13 = false;
                }
                if (i13 <= length) {
                    if (str.charAt(i13) == '.') {
                        int i14 = i13 + 1;
                        int i15 = i14;
                        while (i15 <= length) {
                            char c4 = c3;
                            if (((str.charAt(i15) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 10 && (((r15 | ' ') - 97) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 6) {
                                break;
                            }
                            i15++;
                            c3 = c4;
                        }
                        if (i14 != i15) {
                            z14 = z2;
                        } else {
                            z14 = false;
                        }
                        i13 = i15;
                    } else {
                        z14 = false;
                    }
                    if (z13 || z14) {
                        i10 = i13;
                        if (i10 != -1 || i10 > length) {
                            return false;
                        }
                        z10 = z2;
                        if (!z10) {
                            int i16 = i10;
                            while (i16 <= length && ((str.charAt(i16) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
                                i16++;
                            }
                            if (i10 != i16) {
                                z11 = z2;
                            } else {
                                z11 = false;
                            }
                            if (i16 > length) {
                                i10 = i16;
                            } else {
                                if (str.charAt(i16) == '.') {
                                    int i17 = i16 + 1;
                                    i5 = i17;
                                    while (i5 <= length && ((str.charAt(i5) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
                                        i5++;
                                    }
                                    if (i17 != i5) {
                                        z12 = z2;
                                        if (z11 && !z12) {
                                            if (length == i5 + 2) {
                                                str2 = "NaN";
                                            } else if (length == i5 + 7) {
                                                str2 = "Infinity";
                                            } else {
                                                str2 = null;
                                            }
                                            if (str2 == null || StringsKt__StringsKt.victor(str, str2, i5, false) != i5) {
                                                i10 = -1;
                                            } else {
                                                i10 = length + 1;
                                            }
                                        } else {
                                            i10 = i5;
                                        }
                                    }
                                } else {
                                    i5 = i16;
                                }
                                z12 = false;
                                if (z11) {
                                }
                                i10 = i5;
                            }
                            if (i10 == -1) {
                                return false;
                            }
                            if (i10 > length) {
                                return z2;
                            }
                        }
                        int i18 = i10 + 1;
                        charAt = str.charAt(i10) | ' ';
                        if (!z10) {
                            i4 = 112;
                        } else {
                            i4 = 101;
                        }
                        if (charAt == i4) {
                            if (z10 || ((charAt != 102 && charAt != 100) || i18 <= length)) {
                                return false;
                            }
                            return z2;
                        }
                        if (i18 > length) {
                            return false;
                        }
                        if ((str.charAt(i18) == '+' || str.charAt(i18) == '-') && (i18 = i10 + 2) > length) {
                            return false;
                        }
                        while (i18 <= length && ((str.charAt(i18) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
                            i18++;
                        }
                        if (i18 > length) {
                            return z2;
                        }
                        if (i18 != length) {
                            return false;
                        }
                        int charAt2 = str.charAt(i18) | ' ';
                        if (charAt2 != 102 && charAt2 != 100) {
                            return false;
                        }
                        return z2;
                    }
                }
                i10 = -1;
                if (i10 != -1) {
                }
                return false;
            }
        }
        z2 = true;
        z10 = false;
        if (!z10) {
        }
        int i182 = i10 + 1;
        charAt = str.charAt(i10) | ' ';
        if (!z10) {
        }
        if (charAt == i4) {
        }
    }

    public static final void kilo(String str) {
        throw new NumberFormatException(AbstractC2327c.victor('\'', "Invalid number format: '", str));
    }

    public static boolean lima(int i4, int i5, int i10, String str, String other, boolean z2) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(other, "other");
        if (!z2) {
            return str.regionMatches(i4, other, i5, i10);
        }
        return str.regionMatches(z2, i4, other, i5, i10);
    }

    public static String mike(int i4, String str) {
        Intrinsics.echo(str, "<this>");
        if (i4 >= 0) {
            if (i4 != 0) {
                int i5 = 1;
                if (i4 != 1) {
                    int length = str.length();
                    if (length != 0) {
                        if (length != 1) {
                            StringBuilder sb2 = new StringBuilder(str.length() * i4);
                            if (1 <= i4) {
                                while (true) {
                                    sb2.append((CharSequence) str);
                                    if (i5 == i4) {
                                        break;
                                    }
                                    i5++;
                                }
                            }
                            String sb3 = sb2.toString();
                            Intrinsics.checkNotNull(sb3);
                            return sb3;
                        }
                        char charAt = str.charAt(0);
                        char[] cArr = new char[i4];
                        for (int i10 = 0; i10 < i4; i10++) {
                            cArr[i10] = charAt;
                        }
                        return new String(cArr);
                    }
                    return "";
                }
                return str.toString();
            }
            return "";
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i4 + '.').toString());
    }

    public static String november(String str, char c3, char c4) {
        Intrinsics.echo(str, "<this>");
        String replace = str.replace(c3, c4);
        Intrinsics.delta(replace, "replace(...)");
        return replace;
    }

    public static String oscar(String str, String oldValue, String newValue) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(oldValue, "oldValue");
        Intrinsics.echo(newValue, "newValue");
        int victor = StringsKt__StringsKt.victor(str, oldValue, 0, false);
        if (victor < 0) {
            return str;
        }
        int length = oldValue.length();
        int i4 = 1;
        if (length >= 1) {
            i4 = length;
        }
        int length2 = newValue.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            int i5 = 0;
            do {
                sb2.append((CharSequence) str, i5, victor);
                sb2.append(newValue);
                i5 = victor + length;
                if (victor >= str.length()) {
                    break;
                }
                victor = StringsKt__StringsKt.victor(str, oldValue, victor + i4, false);
            } while (victor > 0);
            sb2.append((CharSequence) str, i5, str.length());
            String sb3 = sb2.toString();
            Intrinsics.delta(sb3, "toString(...)");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    public static boolean papa(int i4, String str, String str2, boolean z2) {
        Intrinsics.echo(str, "<this>");
        if (!z2) {
            return str.startsWith(str2, i4);
        }
        return lima(i4, 0, str2.length(), str, str2, z2);
    }

    public static boolean quebec(String str, String prefix, boolean z2) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(prefix, "prefix");
        if (!z2) {
            return str.startsWith(prefix);
        }
        return lima(0, 0, prefix.length(), str, prefix, z2);
    }

    public static Double romeo(String str) {
        Intrinsics.echo(str, "<this>");
        try {
            if (juliet(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Float sierra(String str) {
        Intrinsics.echo(str, "<this>");
        try {
            if (juliet(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Integer tango(String str) {
        boolean z2;
        int i4;
        int i5;
        Intrinsics.echo(str, "<this>");
        AbstractC2743p6.alpha(10);
        int length = str.length();
        if (length != 0) {
            int i10 = 0;
            char charAt = str.charAt(0);
            int i11 = -2147483647;
            if (Intrinsics.golf(charAt, 48) < 0) {
                i4 = 1;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            i11 = RecyclerView.UNDEFINED_DURATION;
                            z2 = true;
                        } else {
                            return null;
                        }
                    } else {
                        z2 = false;
                    }
                } else {
                    return null;
                }
            } else {
                z2 = false;
                i4 = 0;
            }
            int i12 = -59652323;
            while (i4 < length) {
                int digit = Character.digit((int) str.charAt(i4), 10);
                if (digit >= 0) {
                    if ((i10 < i12 && (i12 != -59652323 || i10 < (i12 = i11 / 10))) || (i5 = i10 * 10) < i11 + digit) {
                        return null;
                    }
                    i10 = i5 - digit;
                    i4++;
                } else {
                    return null;
                }
            }
            if (z2) {
                return Integer.valueOf(i10);
            }
            return Integer.valueOf(-i10);
        }
        return null;
    }

    public static Long uniform(String str) {
        boolean z2;
        Intrinsics.echo(str, "<this>");
        AbstractC2743p6.alpha(10);
        int length = str.length();
        if (length != 0) {
            int i4 = 0;
            char charAt = str.charAt(0);
            long j5 = -9223372036854775807L;
            if (Intrinsics.golf(charAt, 48) < 0) {
                z2 = true;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            j5 = Long.MIN_VALUE;
                            i4 = 1;
                        } else {
                            return null;
                        }
                    } else {
                        z2 = false;
                        i4 = 1;
                    }
                } else {
                    return null;
                }
            } else {
                z2 = false;
            }
            long j6 = 0;
            long j7 = -256204778801521550L;
            while (i4 < length) {
                int digit = Character.digit((int) str.charAt(i4), 10);
                if (digit >= 0) {
                    if (j6 < j7) {
                        if (j7 == -256204778801521550L) {
                            j7 = j5 / 10;
                            if (j6 < j7) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    long j10 = j6 * 10;
                    long j11 = digit;
                    if (j10 < j5 + j11) {
                        return null;
                    }
                    j6 = j10 - j11;
                    i4++;
                } else {
                    return null;
                }
            }
            if (z2) {
                return Long.valueOf(j6);
            }
            return Long.valueOf(-j6);
        }
        return null;
    }
}
