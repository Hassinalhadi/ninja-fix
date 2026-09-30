package s6;

import kotlin.collections.ArraysKt;

/* renamed from: s6.n6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2725n6 {
    public static final Object[] alpha(Object[] objArr, int i4, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ArraysKt.beige(0, i4, 6, objArr, objArr2);
        ArraysKt.yankee(i4 + 2, i4, objArr.length, objArr, objArr2);
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] bravo(int i4, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ArraysKt.beige(0, i4, 6, objArr, objArr2);
        ArraysKt.yankee(i4, i4 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] charlie(int i4, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt.beige(0, i4, 6, objArr, objArr2);
        ArraysKt.yankee(i4, i4 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final int delta(int i4, int i5) {
        return (i4 >> i5) & 31;
    }
}
