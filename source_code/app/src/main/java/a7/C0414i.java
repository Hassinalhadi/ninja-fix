package a7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: a7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0414i extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ int bravo;
    public final /* synthetic */ C0415j charlie;

    public C0414i(C0415j c0415j, boolean z2, int i4) {
        this.charlie = c0415j;
        this.alpha = z2;
        this.bravo = i4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0415j c0415j = this.charlie;
        c0415j.bravo.setTranslationX(0.0f);
        c0415j.charlie(0.0f, this.alpha, this.bravo);
    }
}
