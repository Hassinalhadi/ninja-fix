package t6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class ae {
    public static String alpha(int[] iArr) {
        StringBuilder sb2 = new StringBuilder(iArr.length);
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            sb2.append((char) (iArr[i4] ^ ((i4 % 7) + 90)));
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }

    public static void bravo(int i4, int i5) {
        String bravo;
        if (i4 >= 0 && i4 < i5) {
            return;
        }
        if (i4 >= 0) {
            if (i5 < 0) {
                throw new IllegalArgumentException(ao.ad.zulu(i5, "negative size: "));
            }
            bravo = af.bravo("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
        } else {
            bravo = af.bravo("%s (%s) must not be negative", "index", Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(bravo);
    }

    public static void charlie(int i4, int i5, int i10) {
        String echo;
        if (i4 >= 0 && i5 >= i4 && i5 <= i10) {
            return;
        }
        if (i4 >= 0 && i4 <= i10) {
            if (i5 >= 0 && i5 <= i10) {
                echo = af.bravo("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
            } else {
                echo = echo(i5, i10, "end index");
            }
        } else {
            echo = echo(i4, i10, "start index");
        }
        throw new IndexOutOfBoundsException(echo);
    }

    public static void delta(String str, boolean z2) {
        if (z2) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static String echo(int i4, int i5, String str) {
        if (i4 < 0) {
            return af.bravo("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return af.bravo("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(ao.ad.zulu(i5, "negative size: "));
    }
}
