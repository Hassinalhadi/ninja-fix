package bv;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class v {
    public static final Object alpha = new Object();
    public static final long[] bravo = new long[0];
    public static final Object charlie = new Object();

    public static final void alpha(ax axVar) {
        int i4 = axVar.silver;
        int[] iArr = axVar.purple;
        Object[] objArr = axVar.red;
        int i5 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj = objArr[i10];
            if (obj != charlie) {
                if (i10 != i5) {
                    iArr[i5] = iArr[i10];
                    objArr[i5] = obj;
                    objArr[i10] = null;
                }
                i5++;
            }
        }
        axVar.alpha = false;
        axVar.silver = i5;
    }

    public static final void bravo(f fVar, int i4) {
        Intrinsics.echo(fVar, "<this>");
        fVar.alpha = new int[i4];
        fVar.purple = new Object[i4];
    }

    public static final int charlie(f fVar, Object obj, int i4) {
        Intrinsics.echo(fVar, "<this>");
        int i5 = fVar.red;
        if (i5 == 0) {
            return -1;
        }
        try {
            int alpha2 = bw.a.alpha(fVar.red, i4, fVar.alpha);
            if (alpha2 < 0 || Intrinsics.areEqual(obj, fVar.purple[alpha2])) {
                return alpha2;
            }
            int i10 = alpha2 + 1;
            while (i10 < i5 && fVar.alpha[i10] == i4) {
                if (Intrinsics.areEqual(obj, fVar.purple[i10])) {
                    return i10;
                }
                i10++;
            }
            for (int i11 = alpha2 - 1; i11 >= 0 && fVar.alpha[i11] == i4; i11--) {
                if (Intrinsics.areEqual(obj, fVar.purple[i11])) {
                    return i11;
                }
            }
            return ~i10;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
