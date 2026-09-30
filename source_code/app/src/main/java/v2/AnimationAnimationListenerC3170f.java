package v2;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: v2.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class AnimationAnimationListenerC3170f implements Animation.AnimationListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SwipeRefreshLayout purple;

    public /* synthetic */ AnimationAnimationListenerC3170f(SwipeRefreshLayout swipeRefreshLayout, int i4) {
        this.alpha = i4;
        this.purple = swipeRefreshLayout;
    }

    private final void alpha(Animation animation) {
    }

    private final void bravo(Animation animation) {
    }

    private final void charlie(Animation animation) {
    }

    private final void delta(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        j jVar;
        switch (this.alpha) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = this.purple;
                if (swipeRefreshLayout.red) {
                    swipeRefreshLayout.f3150r.setAlpha(255);
                    swipeRefreshLayout.f3150r.start();
                    if (swipeRefreshLayout.f3155w && (jVar = swipeRefreshLayout.purple) != null) {
                        jVar.onRefresh();
                    }
                    swipeRefreshLayout.f3138f = swipeRefreshLayout.f3144l.getTop();
                    return;
                }
                swipeRefreshLayout.foxtrot();
                return;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.purple;
                swipeRefreshLayout2.getClass();
                g gVar = new g(swipeRefreshLayout2, 1);
                swipeRefreshLayout2.f3152t = gVar;
                gVar.setDuration(150L);
                C3165a c3165a = swipeRefreshLayout2.f3144l;
                c3165a.alpha = null;
                c3165a.clearAnimation();
                swipeRefreshLayout2.f3144l.startAnimation(swipeRefreshLayout2.f3152t);
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i4 = this.alpha;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i4 = this.alpha;
    }
}
