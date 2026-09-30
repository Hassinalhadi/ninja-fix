package t6;

/* loaded from: classes2.dex */
public abstract class ag {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        delta(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int alpha(Object obj, Object obj2, int i4, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int alpha2 = ah.alpha(obj);
        int i5 = alpha2 & i4;
        int bravo = bravo(i5, obj3);
        if (bravo != 0) {
            int i10 = ~i4;
            int i11 = alpha2 & i10;
            int i12 = -1;
            while (true) {
                int i13 = bravo - 1;
                int i14 = iArr[i13];
                int i15 = i14 & i4;
                if ((i14 & i10) != i11 || !ad.bravo(obj, objArr[i13]) || (objArr2 != null && !ad.bravo(obj2, objArr2[i13]))) {
                    if (i15 == 0) {
                        break;
                    }
                    i12 = i13;
                    bravo = i15;
                }
            }
        }
        return -1;
    }

    public static int bravo(int i4, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i4] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i4];
        }
        return ((int[]) obj)[i4];
    }

    public static Object charlie(int i4) {
        if (i4 >= 2 && i4 <= 1073741824 && Integer.highestOneBit(i4) == i4) {
            if (i4 <= 256) {
                return new byte[i4];
            }
            if (i4 <= 65536) {
                return new short[i4];
            }
            return new int[i4];
        }
        throw new IllegalArgumentException(ao.ad.zulu(i4, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static void delta(int i4, int i5, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i4] = (byte) i5;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i4] = (short) i5;
        } else {
            ((int[]) obj)[i4] = i5;
        }
    }
}
