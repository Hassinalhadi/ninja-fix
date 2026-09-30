package b7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class x extends AnimatorListenerAdapter {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ y bravo;

    public /* synthetic */ x(y yVar, int i4) {
        this.alpha = i4;
        this.bravo = yVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.alpha) {
            case 1:
                super.onAnimationEnd(animator);
                y yVar = this.bravo;
                yVar.charlie();
                C0721c c0721c = yVar.f3372d;
                if (c0721c != null) {
                    c0721c.onAnimationEnd((u) yVar.purple);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.alpha) {
            case 0:
                super.onAnimationRepeat(animator);
                y yVar = this.bravo;
                yVar.f3369a = (yVar.f3369a + 1) % yVar.yellow.echo.length;
                yVar.f3370b = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
