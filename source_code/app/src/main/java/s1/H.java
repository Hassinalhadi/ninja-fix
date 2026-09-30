package s1;

import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public abstract class H {
    public final int alpha;
    public float bravo;
    public final Interpolator charlie;
    public final long delta;

    public H(int i4, Interpolator interpolator, long j5) {
        this.alpha = i4;
        this.charlie = interpolator;
        this.delta = j5;
    }

    public float alpha() {
        return 1.0f;
    }

    public long bravo() {
        return this.delta;
    }

    public float charlie() {
        Interpolator interpolator = this.charlie;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.bravo);
        }
        return this.bravo;
    }

    public int delta() {
        return this.alpha;
    }

    public void echo(float f5) {
        this.bravo = f5;
    }
}
