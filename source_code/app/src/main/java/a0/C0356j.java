package a0;

import android.graphics.PathMeasure;

/* renamed from: a0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0356j {
    public final PathMeasure alpha;

    public C0356j(PathMeasure pathMeasure) {
        this.alpha = pathMeasure;
    }

    public final void alpha(float f5, float f10, C0354h c0354h) {
        if (av.q.kilo(c0354h)) {
            this.alpha.getSegment(f5, f10, c0354h.alpha, true);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
