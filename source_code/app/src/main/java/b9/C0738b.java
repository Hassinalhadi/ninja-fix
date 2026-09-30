package b9;

import java.util.Arrays;

/* renamed from: b9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0738b implements Cloneable {
    public int alpha;
    public int purple;
    public int red;
    public int[] silver;

    public final boolean alpha(int i4, int i5) {
        if (((this.silver[(i4 / 32) + (i5 * this.red)] >>> (i4 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b9.b, java.lang.Object] */
    public final Object clone() {
        int[] iArr = (int[]) this.silver.clone();
        ?? obj = new Object();
        obj.alpha = this.alpha;
        obj.purple = this.purple;
        obj.red = this.red;
        obj.silver = iArr;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0738b)) {
            return false;
        }
        C0738b c0738b = (C0738b) obj;
        if (this.alpha != c0738b.alpha || this.purple != c0738b.purple || this.red != c0738b.red || !Arrays.equals(this.silver, c0738b.silver)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4 = this.alpha;
        return Arrays.hashCode(this.silver) + (((((((i4 * 31) + i4) * 31) + this.purple) * 31) + this.red) * 31);
    }

    public final String toString() {
        String str;
        int i4 = this.alpha;
        int i5 = this.purple;
        StringBuilder sb2 = new StringBuilder((i4 + 1) * i5);
        for (int i10 = 0; i10 < i5; i10++) {
            for (int i11 = 0; i11 < i4; i11++) {
                if (alpha(i11, i10)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb2.append(str);
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
