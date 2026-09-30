package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0609d extends h0 {
    public final C0610e charlie;

    public C0609d(C0610e c0610e) {
        this.charlie = c0610e;
    }

    @Override // androidx.fragment.app.h0
    public final void bravo(ViewGroup container) {
        Intrinsics.echo(container, "container");
        C0610e c0610e = this.charlie;
        i0 i0Var = c0610e.alpha;
        View view = i0Var.charlie.mView;
        view.clearAnimation();
        container.endViewTransition(view);
        c0610e.alpha.charlie(this);
        if (L.gray(2)) {
            Log.v("FragmentManager", "Animation from operation " + i0Var + " has been cancelled.");
        }
    }

    @Override // androidx.fragment.app.h0
    public final void charlie(ViewGroup container) {
        Intrinsics.echo(container, "container");
        C0610e c0610e = this.charlie;
        boolean alpha = c0610e.alpha();
        i0 i0Var = c0610e.alpha;
        if (alpha) {
            i0Var.charlie(this);
            return;
        }
        Context context = container.getContext();
        View view = i0Var.charlie.mView;
        Intrinsics.delta(context, "context");
        ao bravo = c0610e.bravo(context);
        if (bravo != null) {
            Animation animation = (Animation) bravo.alpha;
            if (animation != null) {
                if (i0Var.alpha != 1) {
                    view.startAnimation(animation);
                    i0Var.charlie(this);
                    return;
                }
                container.startViewTransition(view);
                ap apVar = new ap(animation, container, view);
                apVar.setAnimationListener(new AnimationAnimationListenerC0608c(i0Var, container, view, this));
                view.startAnimation(apVar);
                if (L.gray(2)) {
                    Log.v("FragmentManager", "Animation from operation " + i0Var + " has started.");
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
