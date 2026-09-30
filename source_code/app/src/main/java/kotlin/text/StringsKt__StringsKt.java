package kotlin.text;

import ao.ad;
import fe.C1713e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf.AbstractC2360j;
import s6.AbstractC2743p6;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "", "", "lines", "(Ljava/lang/CharSequence;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes2.dex */
public class StringsKt__StringsKt extends r {
    public static final List amber(int i4, CharSequence charSequence, String str) {
        boolean z2;
        zulu(i4);
        int victor = victor(charSequence, str, 0, false);
        if (victor != -1 && i4 != 1) {
            if (i4 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i5 = 10;
            if (z2 && i4 <= 10) {
                i5 = i4;
            }
            ArrayList arrayList = new ArrayList(i5);
            int i10 = 0;
            do {
                arrayList.add(charSequence.subSequence(i10, victor).toString());
                i10 = str.length() + victor;
                if (z2 && arrayList.size() == i4 - 1) {
                    break;
                }
                victor = victor(charSequence, str, i10, false);
            } while (victor != -1);
            arrayList.add(charSequence.subSequence(i10, charSequence.length()).toString());
            return arrayList;
        }
        return ab.juliet(charSequence.toString());
    }

    @NotNull
    public static List<String> lines(@NotNull CharSequence charSequence) {
        Intrinsics.echo(charSequence, "<this>");
        return AbstractC2360j.quebec(new kotlin.collections.o(3, charSequence));
    }

    public static final int victor(CharSequence charSequence, String string, int i4, boolean z2) {
        Intrinsics.echo(charSequence, "<this>");
        Intrinsics.echo(string, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i4);
        }
        return whiskey(charSequence, string, i4, charSequence.length(), z2, false);
    }

    public static final int whiskey(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z2, boolean z10) {
        C1713e c1713e;
        if (!z10) {
            if (i4 < 0) {
                i4 = 0;
            }
            int length = charSequence.length();
            if (i5 > length) {
                i5 = length;
            }
            c1713e = new C1713e(i4, i5, 1);
        } else {
            int cyan = StringsKt.cyan(charSequence);
            if (i4 > cyan) {
                i4 = cyan;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            c1713e = new C1713e(i4, i5, -1);
        }
        boolean z11 = charSequence instanceof String;
        int i10 = c1713e.red;
        int i11 = c1713e.purple;
        int i12 = c1713e.alpha;
        if (z11 && (charSequence2 instanceof String)) {
            if ((i10 > 0 && i12 <= i11) || (i10 < 0 && i11 <= i12)) {
                int i13 = i12;
                while (true) {
                    String str = (String) charSequence2;
                    boolean z12 = z2;
                    if (r.lima(0, i13, str.length(), str, (String) charSequence, z12)) {
                        return i13;
                    }
                    if (i13 == i11) {
                        break;
                    }
                    i13 += i10;
                    z2 = z12;
                }
            }
        } else {
            boolean z13 = z2;
            if ((i10 > 0 && i12 <= i11) || (i10 < 0 && i11 <= i12)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z14 = z13;
                    z13 = z14;
                    if (yankee(charSequence4, 0, charSequence3, i12, charSequence2.length(), z14)) {
                        return i12;
                    }
                    if (i12 == i11) {
                        break;
                    }
                    i12 += i10;
                    charSequence2 = charSequence4;
                    charSequence = charSequence3;
                }
            }
        }
        return -1;
    }

    public static final int xray(CharSequence charSequence, char[] cArr, int i4, boolean z2) {
        Intrinsics.echo(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt.olive(cArr), i4);
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int cyan = StringsKt.cyan(charSequence);
        if (i4 > cyan) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i4);
            for (char c3 : cArr) {
                if (AbstractC2743p6.charlie(c3, charAt, z2)) {
                    return i4;
                }
            }
            if (i4 != cyan) {
                i4++;
            } else {
                return -1;
            }
        }
    }

    public static final boolean yankee(CharSequence charSequence, int i4, CharSequence other, int i5, int i10, boolean z2) {
        Intrinsics.echo(charSequence, "<this>");
        Intrinsics.echo(other, "other");
        if (i5 < 0 || i4 < 0 || i4 > charSequence.length() - i10 || i5 > other.length() - i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!AbstractC2743p6.charlie(charSequence.charAt(i4 + i11), other.charAt(i5 + i11), z2)) {
                return false;
            }
        }
        return true;
    }

    public static final void zulu(int i4) {
        if (i4 >= 0) {
        } else {
            throw new IllegalArgumentException(ad.zulu(i4, "Limit must be non-negative, but was ").toString());
        }
    }
}
