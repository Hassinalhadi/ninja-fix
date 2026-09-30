package al;

import android.animation.TimeInterpolator;

/* loaded from: classes3.dex */
public final class d implements TimeInterpolator {
    public int[] alpha;
    public int bravo;
    public int charlie;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        float f10;
        int i4 = (int) ((f5 * this.charlie) + 0.5f);
        int i5 = this.bravo;
        int[] iArr = this.alpha;
        int i10 = 0;
        while (i10 < i5) {
            int i11 = iArr[i10];
            if (i4 < i11) {
                break;
            }
            i4 -= i11;
            i10++;
        }
        if (i10 < i5) {
            f10 = i4 / this.charlie;
        } else {
            f10 = 0.0f;
        }
        return (i10 / i5) + f10;
    }
}
