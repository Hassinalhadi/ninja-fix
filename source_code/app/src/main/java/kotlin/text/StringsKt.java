package kotlin.text;

import fe.C1715g;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2743p6;

@Metadata(d1 = {"kotlin/text/n", "kotlin/text/n", "kotlin/text/o", "kotlin/text/p", "kotlin/text/q", "kotlin/text/r", "kotlin/text/r", "kotlin/text/r", "kotlin/text/r", "kotlin/text/StringsKt__StringsKt", "kotlin/text/StringsKt", "kotlin/text/StringsKt"}, d2 = {}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes2.dex */
public final class StringsKt extends StringsKt__StringsKt {
    private StringsKt() {
    }

    public static String a(int i4, String str) {
        Intrinsics.echo(str, "<this>");
        if (i4 >= 0) {
            int length = str.length();
            if (i4 > length) {
                i4 = length;
            }
            String substring = str.substring(length - i4);
            Intrinsics.delta(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(av.q.delta(i4, "Requested character count ", " is less than zero.").toString());
    }

    public static ArrayList azure(String str) {
        int i4;
        int i5;
        Intrinsics.echo(str, "<this>");
        ab.echo(2);
        int length = str.length();
        int i10 = length / 2;
        int i11 = 0;
        if (length % 2 == 0) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        ArrayList arrayList = new ArrayList(i10 + i4);
        while (i11 >= 0 && i11 < length) {
            int i12 = i11 + 2;
            if (i12 >= 0 && i12 <= length) {
                i5 = i12;
            } else {
                i5 = length;
            }
            CharSequence it = str.subSequence(i11, i5);
            Intrinsics.echo(it, "it");
            arrayList.add(it.toString());
            i11 = i12;
        }
        return arrayList;
    }

    public static CharSequence b(CharSequence charSequence) {
        int i4;
        Intrinsics.echo(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i5 = 0;
        boolean z2 = false;
        while (i5 <= length) {
            if (!z2) {
                i4 = i5;
            } else {
                i4 = length;
            }
            boolean delta = AbstractC2743p6.delta(charSequence.charAt(i4));
            if (!z2) {
                if (!delta) {
                    z2 = true;
                } else {
                    i5++;
                }
            } else {
                if (!delta) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i5, length + 1);
    }

    public static boolean beige(CharSequence charSequence, CharSequence other, boolean z2) {
        Intrinsics.echo(charSequence, "<this>");
        Intrinsics.echo(other, "other");
        if (other instanceof String) {
            if (fuchsia(charSequence, (String) other, 0, z2, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.whiskey(charSequence, other, 0, charSequence.length(), z2, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean black(CharSequence charSequence, char c3) {
        Intrinsics.echo(charSequence, "<this>");
        if (emerald(charSequence, c3, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static String blue(int i4, String str) {
        Intrinsics.echo(str, "<this>");
        if (i4 >= 0) {
            int length = str.length();
            if (i4 > length) {
                i4 = length;
            }
            String substring = str.substring(i4);
            Intrinsics.delta(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(av.q.delta(i4, "Requested character count ", " is less than zero.").toString());
    }

    public static boolean bronze(CharSequence charSequence, String suffix) {
        Intrinsics.echo(charSequence, "<this>");
        Intrinsics.echo(suffix, "suffix");
        if (charSequence instanceof String) {
            return r.golf((String) charSequence, suffix, false);
        }
        return StringsKt__StringsKt.yankee(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), false);
    }

    public static String c(String str, char... cArr) {
        int i4;
        int length = str.length() - 1;
        int i5 = 0;
        boolean z2 = false;
        while (i5 <= length) {
            if (!z2) {
                i4 = i5;
            } else {
                i4 = length;
            }
            boolean victor = ArraysKt.victor(cArr, str.charAt(i4));
            if (!z2) {
                if (!victor) {
                    z2 = true;
                } else {
                    i5++;
                }
            } else {
                if (!victor) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i5, length + 1).toString();
    }

    public static boolean coral(String str, char c3) {
        Intrinsics.echo(str, "<this>");
        if (str.length() <= 0 || !AbstractC2743p6.charlie(str.charAt(cyan(str)), c3, false)) {
            return false;
        }
        return true;
    }

    public static char crimson(String str) {
        Intrinsics.echo(str, "<this>");
        if (str.length() != 0) {
            return str.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int cyan(CharSequence charSequence) {
        Intrinsics.echo(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static CharSequence d(String str) {
        Intrinsics.echo(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i4 = length - 1;
            if (!AbstractC2743p6.delta(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i4 >= 0) {
                length = i4;
            } else {
                return "";
            }
        }
    }

    public static String e(String str, char... cArr) {
        CharSequence charSequence;
        Intrinsics.echo(str, "<this>");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (!ArraysKt.victor(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static int emerald(CharSequence charSequence, char c3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        Intrinsics.echo(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            return StringsKt__StringsKt.xray(charSequence, new char[]{c3}, i4, false);
        }
        return ((String) charSequence).indexOf(c3, i4);
    }

    public static String f(String str, char... cArr) {
        CharSequence charSequence;
        Intrinsics.echo(str, "<this>");
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                if (!ArraysKt.victor(cArr, str.charAt(i4))) {
                    charSequence = str.subSequence(i4, str.length());
                    break;
                }
                i4++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    public static /* synthetic */ int fuchsia(CharSequence charSequence, String str, int i4, boolean z2, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z2 = false;
        }
        return StringsKt__StringsKt.victor(charSequence, str, i4, z2);
    }

    public static boolean gray(CharSequence charSequence) {
        Intrinsics.echo(charSequence, "<this>");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (!AbstractC2743p6.delta(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static char green(CharSequence charSequence) {
        Intrinsics.echo(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(cyan(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int indigo(int i4, String str, String string) {
        int i5;
        if ((i4 & 2) != 0) {
            i5 = cyan(str);
        } else {
            i5 = 0;
        }
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(string, "string");
        return str.lastIndexOf(string, i5);
    }

    public static int ivory(CharSequence charSequence, char c3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = cyan(charSequence);
        }
        Intrinsics.echo(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c3};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(ArraysKt.olive(cArr), i4);
            }
            int cyan = cyan(charSequence);
            if (i4 > cyan) {
                i4 = cyan;
            }
            while (-1 < i4) {
                if (AbstractC2743p6.charlie(cArr[0], charSequence.charAt(i4), false)) {
                    return i4;
                }
                i4--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c3, i4);
    }

    public static String lavender(int i4, String str) {
        CharSequence charSequence;
        Intrinsics.echo(str, "<this>");
        if (i4 >= 0) {
            if (i4 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i4);
                int length = i4 - str.length();
                int i5 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                    }
                }
                sb2.append((CharSequence) str);
                charSequence = sb2;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(av.q.delta(i4, "Desired length ", " is less than zero."));
    }

    public static String lime(String str, String prefix) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(prefix, "prefix");
        if (olive(str, prefix, false)) {
            String substring = str.substring(prefix.length());
            Intrinsics.delta(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String magenta(String str, String suffix) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(suffix, "suffix");
        if (bronze(str, suffix)) {
            String substring = str.substring(0, str.length() - suffix.length());
            Intrinsics.delta(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static List maroon(CharSequence charSequence, String[] strArr, int i4) {
        int i5;
        int collectionSizeOrDefault;
        if ((i4 & 4) != 0) {
            i5 = 0;
        } else {
            i5 = 2;
        }
        Intrinsics.echo(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return StringsKt__StringsKt.amber(i5, charSequence, str);
            }
        }
        StringsKt__StringsKt.zulu(i5);
        c<C1715g> cVar = new c(charSequence, i5, new s(1, ArraysKt.sierra(strArr)));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(new Lf.i(3, cVar), 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (C1715g range : cVar) {
            Intrinsics.echo(range, "range");
            arrayList.add(charSequence.subSequence(range.alpha, range.purple + 1).toString());
        }
        return arrayList;
    }

    public static List navy(String str, char[] cArr) {
        int collectionSizeOrDefault;
        Intrinsics.echo(str, "<this>");
        if (cArr.length == 1) {
            return StringsKt__StringsKt.amber(0, str, String.valueOf(cArr[0]));
        }
        StringsKt__StringsKt.zulu(0);
        c<C1715g> cVar = new c(str, 0, new s(0, cArr));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(new Lf.i(3, cVar), 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (C1715g range : cVar) {
            Intrinsics.echo(range, "range");
            arrayList.add(str.subSequence(range.alpha, range.purple + 1).toString());
        }
        return arrayList;
    }

    public static boolean ochre(int i4, String str) {
        return StringsKt__StringsKt.yankee(str, i4, "boundary=", 0, 9, true);
    }

    public static boolean olive(String str, String prefix, boolean z2) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(prefix, "prefix");
        if (!z2) {
            return r.quebec(str, prefix, false);
        }
        return StringsKt__StringsKt.yankee(str, 0, prefix, 0, prefix.length(), z2);
    }

    public static boolean orange(String str, char c3) {
        Intrinsics.echo(str, "<this>");
        if (str.length() <= 0 || !AbstractC2743p6.charlie(str.charAt(0), c3, false)) {
            return false;
        }
        return true;
    }

    public static String peach(C1715g c1715g, String str) {
        Intrinsics.echo(str, "<this>");
        String substring = str.substring(c1715g.alpha, c1715g.purple + 1);
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    public static String pink(char c3, String str, String str2) {
        Intrinsics.echo(str, "<this>");
        int emerald = emerald(str, c3, 0, 6);
        if (emerald == -1) {
            return str2;
        }
        String substring = str.substring(emerald + 1, str.length());
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    public static String plum(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(delimiter, "delimiter");
        Intrinsics.echo(missingDelimiterValue, "missingDelimiterValue");
        int fuchsia = fuchsia(str, delimiter, 0, false, 6);
        if (fuchsia == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(delimiter.length() + fuchsia, str.length());
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    public static String purple(char c3, String str, String missingDelimiterValue) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(missingDelimiterValue, "missingDelimiterValue");
        int ivory = ivory(str, c3, 0, 6);
        if (ivory == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(ivory + 1, str.length());
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    public static String red(String missingDelimiterValue, char c3) {
        Intrinsics.echo(missingDelimiterValue, "<this>");
        Intrinsics.echo(missingDelimiterValue, "missingDelimiterValue");
        int emerald = emerald(missingDelimiterValue, c3, 0, 6);
        if (emerald == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, emerald);
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    public static String silver(String missingDelimiterValue, String str) {
        Intrinsics.echo(missingDelimiterValue, "<this>");
        Intrinsics.echo(missingDelimiterValue, "missingDelimiterValue");
        int fuchsia = fuchsia(missingDelimiterValue, str, 0, false, 6);
        if (fuchsia == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, fuchsia);
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    public static String teal(String str, String str2) {
        Intrinsics.echo(str, "<this>");
        int indigo = indigo(6, str, ".");
        if (indigo == -1) {
            return str2;
        }
        String substring = str.substring(0, indigo);
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    public static String white(String missingDelimiterValue, char c3) {
        Intrinsics.echo(missingDelimiterValue, "<this>");
        Intrinsics.echo(missingDelimiterValue, "missingDelimiterValue");
        int ivory = ivory(missingDelimiterValue, c3, 0, 6);
        if (ivory == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, ivory);
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    public static String yellow(int i4, String str) {
        Intrinsics.echo(str, "<this>");
        if (i4 >= 0) {
            int length = str.length();
            if (i4 > length) {
                i4 = length;
            }
            String substring = str.substring(0, i4);
            Intrinsics.delta(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(av.q.delta(i4, "Requested character count ", " is less than zero.").toString());
    }
}
