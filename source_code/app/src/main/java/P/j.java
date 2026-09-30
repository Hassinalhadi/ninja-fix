package P;

/* loaded from: classes3.dex */
public final class j {
    public final int alpha;
    public final long[] bravo;
    public final Object[] charlie;

    public j(int i4, long[] jArr, Object[] objArr) {
        this.alpha = i4;
        this.bravo = jArr;
        this.charlie = objArr;
    }

    public final int alpha(long j5) {
        int i4 = this.alpha - 1;
        if (i4 != -1) {
            long[] jArr = this.bravo;
            int i5 = 0;
            if (i4 != 0) {
                while (i5 <= i4) {
                    int i10 = (i5 + i4) >>> 1;
                    long j6 = jArr[i10] - j5;
                    if (j6 < 0) {
                        i5 = i10 + 1;
                    } else if (j6 > 0) {
                        i4 = i10 - 1;
                    } else {
                        return i10;
                    }
                }
                return -(i5 + 1);
            }
            long j7 = jArr[0];
            if (j7 == j5) {
                return 0;
            }
            if (j7 > j5) {
                return -2;
            }
        }
        return -1;
    }

    public final j bravo(long j5, Object obj) {
        long[] jArr;
        int i4;
        Object[] objArr = this.charlie;
        int i5 = 0;
        int i10 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i10++;
            }
        }
        int i11 = i10 + 1;
        long[] jArr2 = new long[i11];
        Object[] objArr2 = new Object[i11];
        if (i11 > 1) {
            int i12 = 0;
            while (true) {
                jArr = this.bravo;
                i4 = this.alpha;
                if (i5 >= i11 || i12 >= i4) {
                    break;
                }
                long j6 = jArr[i12];
                Object obj3 = objArr[i12];
                if (j6 > j5) {
                    jArr2[i5] = j5;
                    objArr2[i5] = obj;
                    i5++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i5] = j6;
                    objArr2[i5] = obj3;
                    i5++;
                }
                i12++;
            }
            if (i12 == i4) {
                jArr2[i10] = j5;
                objArr2[i10] = obj;
            } else {
                while (i5 < i11) {
                    long j7 = jArr[i12];
                    Object obj4 = objArr[i12];
                    if (obj4 != null) {
                        jArr2[i5] = j7;
                        objArr2[i5] = obj4;
                        i5++;
                    }
                    i12++;
                }
            }
        } else {
            jArr2[0] = j5;
            objArr2[0] = obj;
        }
        return new j(i11, jArr2, objArr2);
    }
}
