package s6;

/* renamed from: s6.c7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2627c7 {
    public static final long alpha(int i4, int i5) {
        return (i5 & 4294967295L) | (i4 << 32);
    }

    public static final long bravo(long j5) {
        return (Float.floatToRawIntBits((int) (j5 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j5 >> 32)) << 32);
    }

    public static Object charlie(Class cls, String str, com.google.android.play.core.integrity.c... cVarArr) {
        int length = cVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i4 = 0; i4 < cVarArr.length; i4++) {
            com.google.android.play.core.integrity.c cVar = cVarArr[i4];
            cVar.getClass();
            clsArr[i4] = (Class) cVar.purple;
            objArr[i4] = cVarArr[i4].red;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
