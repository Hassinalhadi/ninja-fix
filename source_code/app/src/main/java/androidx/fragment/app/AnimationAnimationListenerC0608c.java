package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class AnimationAnimationListenerC0608c implements Animation.AnimationListener {
    public final /* synthetic */ i0 alpha;
    public final /* synthetic */ ViewGroup purple;
    public final /* synthetic */ View red;
    public final /* synthetic */ C0609d silver;

    public AnimationAnimationListenerC0608c(i0 i0Var, ViewGroup viewGroup, View view, C0609d c0609d) {
        this.alpha = i0Var;
        this.purple = viewGroup;
        this.red = view;
        this.silver = c0609d;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.echo(animation, "animation");
        View view = this.red;
        C0609d c0609d = this.silver;
        ViewGroup viewGroup = this.purple;
        viewGroup.post(new A2.s(viewGroup, view, c0609d, 14));
        if (L.gray(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.alpha + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.echo(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.echo(animation, "animation");
        if (L.gray(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.alpha + " has reached onAnimationStart.");
        }
    }
}
