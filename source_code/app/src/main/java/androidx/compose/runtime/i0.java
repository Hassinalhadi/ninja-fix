package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class i0 {
    public static final int alpha(int i4, int[] iArr) {
        return iArr[(i4 * 5) + 3];
    }

    public static final int bravo(ArrayList arrayList, int i4, int i5) {
        int echo = echo(arrayList, i4, i5);
        if (echo >= 0) {
            return echo;
        }
        return -(echo + 1);
    }

    public static final int charlie(int i4, int[] iArr) {
        int i5 = i4 * 5;
        return Integer.bitCount(iArr[i5 + 1] >> 28) + iArr[i5 + 4];
    }

    public static final void delta(int i4, int i5, int[] iArr) {
        if (i5 >= 0) {
        }
        int i10 = (i4 * 5) + 1;
        iArr[i10] = i5 | (iArr[i10] & (-67108864));
    }

    public static final int echo(ArrayList arrayList, int i4, int i5) {
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int i12 = ((C0562a) arrayList.get(i11)).alpha;
            if (i12 < 0) {
                i12 += i5;
            }
            int golf = Intrinsics.golf(i12, i4);
            if (golf < 0) {
                i10 = i11 + 1;
            } else if (golf > 0) {
                size = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public static final void foxtrot() {
        throw new ConcurrentModificationException();
    }
}
