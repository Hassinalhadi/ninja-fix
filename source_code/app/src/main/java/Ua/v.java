package Ua;

import android.animation.Animator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v implements Animator.AnimatorListener {
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.echo(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.echo(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.echo(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.echo(animation, "animation");
    }
}
