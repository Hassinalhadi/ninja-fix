package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class al {
    public int[] alpha;
    public int bravo;

    public al() {
        this.alpha = new int[10];
    }

    public int alpha(int i4) {
        int i5 = this.bravo - 1;
        if (i5 >= 0) {
            return this.alpha[i5];
        }
        return i4;
    }

    public int bravo() {
        int[] iArr = this.alpha;
        int i4 = this.bravo - 1;
        this.bravo = i4;
        return iArr[i4];
    }

    public void charlie(int i4) {
        int[] iArr = this.alpha;
        if (this.bravo >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.delta(iArr, "copyOf(...)");
            this.alpha = iArr;
        }
        int i5 = this.bravo;
        this.bravo = i5 + 1;
        iArr[i5] = i4;
    }

    public void delta(int i4, int i5, int i10) {
        int i11 = this.bravo;
        int[] iArr = this.alpha;
        int i12 = i11 + 3;
        if (i12 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.delta(iArr, "copyOf(...)");
            this.alpha = iArr;
        }
        iArr[i11] = i4 + i10;
        iArr[i11 + 1] = i5 + i10;
        iArr[i11 + 2] = i10;
        this.bravo = i12;
    }

    public void echo(int i4, int i5, int i10, int i11) {
        int i12 = this.bravo;
        int[] iArr = this.alpha;
        int i13 = i12 + 4;
        if (i13 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.delta(iArr, "copyOf(...)");
            this.alpha = iArr;
        }
        iArr[i12] = i4;
        iArr[i12 + 1] = i5;
        iArr[i12 + 2] = i10;
        iArr[i12 + 3] = i11;
        this.bravo = i13;
    }

    public void foxtrot(int i4, int i5) {
        if (i4 < i5) {
            int i10 = i4 - 3;
            for (int i11 = i4; i11 < i5; i11 += 3) {
                int[] iArr = this.alpha;
                int i12 = iArr[i11];
                int i13 = iArr[i5];
                if (i12 < i13 || (i12 == i13 && iArr[i11 + 1] <= iArr[i5 + 1])) {
                    i10 += 3;
                    golf(i10, i11);
                }
            }
            golf(i10 + 3, i5);
            foxtrot(i4, i10);
            foxtrot(i10 + 6, i5);
        }
    }

    public void golf(int i4, int i5) {
        int[] iArr = this.alpha;
        int i10 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i10;
        int i11 = i4 + 1;
        int i12 = i5 + 1;
        int i13 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = i13;
        int i14 = i4 + 2;
        int i15 = i5 + 2;
        int i16 = iArr[i14];
        iArr[i14] = iArr[i15];
        iArr[i15] = i16;
    }

    public al(int i4) {
        this.alpha = new int[i4];
    }
}
