package s1;

import android.view.WindowInsetsAnimation;

/* loaded from: classes3.dex */
public final class G extends H {
    public final WindowInsetsAnimation echo;

    public G(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.echo = windowInsetsAnimation;
    }

    @Override // s1.H
    public final float alpha() {
        float alpha;
        alpha = this.echo.getAlpha();
        return alpha;
    }

    @Override // s1.H
    public final long bravo() {
        long durationMillis;
        durationMillis = this.echo.getDurationMillis();
        return durationMillis;
    }

    @Override // s1.H
    public final float charlie() {
        float interpolatedFraction;
        interpolatedFraction = this.echo.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // s1.H
    public final int delta() {
        int typeMask;
        typeMask = this.echo.getTypeMask();
        return typeMask;
    }

    @Override // s1.H
    public final void echo(float f5) {
        this.echo.setFraction(f5);
    }
}
