package v2;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class h extends Animation {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ SwipeRefreshLayout red;

    public h(SwipeRefreshLayout swipeRefreshLayout, int i4, int i5) {
        this.red = swipeRefreshLayout;
        this.alpha = i4;
        this.purple = i5;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f5, Transformation transformation) {
        this.red.f3150r.setAlpha((int) (((this.purple - r0) * f5) + this.alpha));
    }
}
