package b7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: b7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0725g extends AnimatorListenerAdapter {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0727i bravo;

    public /* synthetic */ C0725g(C0727i c0727i, int i4) {
        this.alpha = i4;
        this.bravo = c0727i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.alpha) {
            case 1:
                super.onAnimationEnd(animator);
                C0727i c0727i = this.bravo;
                c0727i.charlie();
                C0721c c0721c = c0727i.f3335d;
                if (c0721c != null) {
                    c0721c.onAnimationEnd((u) c0727i.purple);
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
                C0727i c0727i = this.bravo;
                c0727i.f3332a = (c0727i.f3332a + 4) % c0727i.yellow.echo.length;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
