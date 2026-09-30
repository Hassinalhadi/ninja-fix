package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0611f extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup alpha;
    public final /* synthetic */ View bravo;
    public final /* synthetic */ boolean charlie;
    public final /* synthetic */ i0 delta;
    public final /* synthetic */ C0612g echo;

    public C0611f(ViewGroup viewGroup, View view, boolean z2, i0 i0Var, C0612g c0612g) {
        this.alpha = viewGroup;
        this.bravo = view;
        this.charlie = z2;
        this.delta = i0Var;
        this.echo = c0612g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        Intrinsics.echo(anim, "anim");
        ViewGroup viewGroup = this.alpha;
        View viewToAnimate = this.bravo;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z2 = this.charlie;
        i0 i0Var = this.delta;
        if (z2 || i0Var.alpha == 3) {
            int i4 = i0Var.alpha;
            Intrinsics.delta(viewToAnimate, "viewToAnimate");
            P0.yankee(i4, viewToAnimate, viewGroup);
        }
        C0612g c0612g = this.echo;
        c0612g.charlie.alpha.charlie(c0612g);
        if (L.gray(2)) {
            Log.v("FragmentManager", "Animator from operation " + i0Var + " has ended.");
        }
    }
}
