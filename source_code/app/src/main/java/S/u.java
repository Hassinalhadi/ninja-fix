package S;

/* loaded from: classes3.dex */
public abstract class u {
    public static final Object alpha = new Object();

    public static final int alpha(long[] jArr, long j5) {
        int length = jArr.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i5 = (i4 + length) >>> 1;
            long j6 = jArr[i5];
            if (j5 > j6) {
                i4 = i5 + 1;
            } else if (j5 < j6) {
                length = i5 - 1;
            } else {
                return i5;
            }
        }
        return -(i4 + 1);
    }

    public static final void charlie() {
        throw new UnsupportedOperationException();
    }

    public abstract void bravo();
}
