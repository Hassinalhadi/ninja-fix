package b7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: b7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0728j extends AnimatorListenerAdapter {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0729k bravo;

    public /* synthetic */ C0728j(C0729k c0729k, int i4) {
        this.alpha = i4;
        this.bravo = c0729k;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.alpha) {
            case 1:
                super.onAnimationEnd(animator);
                C0729k c0729k = this.bravo;
                c0729k.charlie();
                C0721c c0721c = c0729k.f3343d;
                if (c0721c != null) {
                    c0721c.onAnimationEnd((u) c0729k.purple);
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
                C0729k c0729k = this.bravo;
                c0729k.f3340a = (c0729k.f3340a + C0729k.f3336f.length) % c0729k.yellow.echo.length;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
