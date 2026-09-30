package androidx.compose.foundation.layout;

/* renamed from: androidx.compose.foundation.layout.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0542h {
    public static final C0537c alpha = new C0537c(4);
    public static final C0537c bravo = new C0537c(3);
    public static final C0537c charlie = new C0537c(5);
    public static final C0537c delta = new C0537c(2);
    public static final J1.e echo = new J1.e(1);
    public static final J1.e foxtrot = new J1.e(4);
    public static final J1.e golf = new J1.e(3);
    public static final J1.e hotel = new J1.e(2);

    public static void alpha(int i4, int[] iArr, int[] iArr2, boolean z2) {
        int i5 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        float f5 = (i4 - i10) / 2;
        if (!z2) {
            int length = iArr.length;
            int i12 = 0;
            while (i5 < length) {
                int i13 = iArr[i5];
                iArr2[i12] = Math.round(f5);
                f5 += i13;
                i5++;
                i12++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f5);
                f5 += i14;
            } else {
                return;
            }
        }
    }

    public static void bravo(int[] iArr, int[] iArr2, boolean z2) {
        int i4 = 0;
        if (!z2) {
            int length = iArr.length;
            int i5 = 0;
            int i10 = 0;
            while (i4 < length) {
                int i11 = iArr[i4];
                iArr2[i5] = i10;
                i10 += i11;
                i4++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i12 = iArr[length2];
                iArr2[length2] = i4;
                i4 += i12;
            } else {
                return;
            }
        }
    }

    public static void charlie(int i4, int[] iArr, int[] iArr2, boolean z2) {
        int i5 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int i12 = i4 - i10;
        if (!z2) {
            int length = iArr.length;
            int i13 = 0;
            while (i5 < length) {
                int i14 = iArr[i5];
                iArr2[i13] = i12;
                i12 += i14;
                i5++;
                i13++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i15 = iArr[length2];
                iArr2[length2] = i12;
                i12 += i15;
            } else {
                return;
            }
        }
    }

    public static void delta(int i4, int[] iArr, int[] iArr2, boolean z2) {
        float length;
        int i5 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        if (iArr.length == 0) {
            length = 0.0f;
        } else {
            length = (i4 - i10) / iArr.length;
        }
        float f5 = length / 2;
        if (!z2) {
            int length2 = iArr.length;
            int i12 = 0;
            while (i5 < length2) {
                int i13 = iArr[i5];
                iArr2[i12] = Math.round(f5);
                f5 += i13 + length;
                i5++;
                i12++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 < length3) {
                int i14 = iArr[length3];
                iArr2[length3] = Math.round(f5);
                f5 += i14 + length;
            } else {
                return;
            }
        }
    }

    public static void echo(int i4, int[] iArr, int[] iArr2, boolean z2) {
        float f5;
        if (iArr.length != 0) {
            int i5 = 0;
            int i10 = 0;
            for (int i11 : iArr) {
                i10 += i11;
            }
            float max = (i4 - i10) / Math.max(iArr.length - 1, 1);
            if (z2 && iArr.length == 1) {
                f5 = max;
            } else {
                f5 = 0.0f;
            }
            if (!z2) {
                int length = iArr.length;
                int i12 = 0;
                while (i5 < length) {
                    int i13 = iArr[i5];
                    iArr2[i12] = Math.round(f5);
                    f5 += i13 + max;
                    i5++;
                    i12++;
                }
                return;
            }
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f5);
                f5 += i14 + max;
            }
        }
    }

    public static void foxtrot(int i4, int[] iArr, int[] iArr2, boolean z2) {
        int i5 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        float length = (i4 - i10) / (iArr.length + 1);
        if (!z2) {
            int length2 = iArr.length;
            float f5 = length;
            int i12 = 0;
            while (i5 < length2) {
                int i13 = iArr[i5];
                iArr2[i12] = Math.round(f5);
                f5 += i13 + length;
                i5++;
                i12++;
            }
            return;
        }
        float f10 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i14 = iArr[length3];
            iArr2[length3] = Math.round(f10);
            f10 += i14 + length;
        }
    }

    public static C0540f golf(float f5) {
        return new C0540f(f5, true, new S4.b(23));
    }

    public static C0540f hotel(float f5, T.i iVar) {
        return new C0540f(f5, true, new Ac.k(24, iVar));
    }

    public static C0540f india(float f5, T.j jVar) {
        return new C0540f(f5, false, new C0536b(jVar, 0));
    }
}
