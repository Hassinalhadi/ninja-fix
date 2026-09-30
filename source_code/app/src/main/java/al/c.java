package al;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import t6.AbstractC3037o3;

/* loaded from: classes3.dex */
public final class c extends AbstractC3037o3 {
    public final ObjectAnimator delta;
    public final boolean echo;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.animation.TimeInterpolator, java.lang.Object, al.d] */
    public c(AnimationDrawable animationDrawable, boolean z2, boolean z10) {
        int i4;
        int i5;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i10 = z2 ? numberOfFrames - 1 : 0;
        if (z2) {
            i4 = 0;
        } else {
            i4 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.bravo = numberOfFrames2;
        int[] iArr = obj.alpha;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.alpha = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.alpha;
        int i11 = 0;
        for (int i12 = 0; i12 < numberOfFrames2; i12++) {
            if (z2) {
                i5 = (numberOfFrames2 - i12) - 1;
            } else {
                i5 = i12;
            }
            int duration = animationDrawable.getDuration(i5);
            iArr2[i12] = duration;
            i11 += duration;
        }
        obj.charlie = i11;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i4);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(obj.charlie);
        ofInt.setInterpolator(obj);
        this.echo = z10;
        this.delta = ofInt;
    }

    @Override // t6.AbstractC3037o3
    public final boolean alpha() {
        return this.echo;
    }

    @Override // t6.AbstractC3037o3
    public final void bravo() {
        this.delta.reverse();
    }

    @Override // t6.AbstractC3037o3
    public final void charlie() {
        this.delta.start();
    }

    @Override // t6.AbstractC3037o3
    public final void delta() {
        this.delta.cancel();
    }
}
