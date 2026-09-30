package v2;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class g extends Animation {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SwipeRefreshLayout purple;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i4) {
        this.alpha = i4;
        this.purple = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f5, Transformation transformation) {
        switch (this.alpha) {
            case 0:
                this.purple.setAnimationProgress(f5);
                return;
            case 1:
                this.purple.setAnimationProgress(1.0f - f5);
                return;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.purple;
                int abs = swipeRefreshLayout.f3148p - Math.abs(swipeRefreshLayout.f3147o);
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.f3146n + ((int) ((abs - r1) * f5))) - swipeRefreshLayout.f3144l.getTop());
                C3169e c3169e = swipeRefreshLayout.f3150r;
                float f10 = 1.0f - f5;
                C3168d c3168d = c3169e.alpha;
                if (f10 != c3168d.papa) {
                    c3168d.papa = f10;
                }
                c3169e.invalidateSelf();
                return;
            default:
                this.purple.echo(f5);
                return;
        }
    }
}
