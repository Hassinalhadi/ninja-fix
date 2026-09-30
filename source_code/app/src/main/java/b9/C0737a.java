package b9;

import java.util.Arrays;

/* renamed from: b9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0737a implements Cloneable {
    public static final int[] red = new int[0];
    public int purple = 0;
    public int[] alpha = red;

    public final void alpha(boolean z2) {
        charlie(this.purple + 1);
        if (z2) {
            int[] iArr = this.alpha;
            int i4 = this.purple;
            int i5 = i4 / 32;
            iArr[i5] = (1 << (i4 & 31)) | iArr[i5];
        }
        this.purple++;
    }

    public final void bravo(int i4, int i5) {
        if (i5 >= 0 && i5 <= 32) {
            int i10 = this.purple;
            charlie(i10 + i5);
            for (int i11 = i5 - 1; i11 >= 0; i11--) {
                if (((1 << i11) & i4) != 0) {
                    int[] iArr = this.alpha;
                    int i12 = i10 / 32;
                    iArr[i12] = iArr[i12] | (1 << (i10 & 31));
                }
                i10++;
            }
            this.purple = i10;
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public final void charlie(int i4) {
        if (i4 > this.alpha.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i4 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.alpha;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.alpha = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b9.a, java.lang.Object] */
    public final Object clone() {
        int[] iArr = (int[]) this.alpha.clone();
        int i4 = this.purple;
        ?? obj = new Object();
        obj.alpha = iArr;
        obj.purple = i4;
        return obj;
    }

    public final boolean delta(int i4) {
        if (((1 << (i4 & 31)) & this.alpha[i4 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final int echo() {
        return (this.purple + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0737a)) {
            return false;
        }
        C0737a c0737a = (C0737a) obj;
        if (this.purple != c0737a.purple || !Arrays.equals(this.alpha, c0737a.alpha)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.alpha) + (this.purple * 31);
    }

    public final String toString() {
        char c3;
        int i4 = this.purple;
        StringBuilder sb2 = new StringBuilder((i4 / 8) + i4 + 1);
        for (int i5 = 0; i5 < this.purple; i5++) {
            if ((i5 & 7) == 0) {
                sb2.append(' ');
            }
            if (delta(i5)) {
                c3 = 'X';
            } else {
                c3 = '.';
            }
            sb2.append(c3);
        }
        return sb2.toString();
    }
}
