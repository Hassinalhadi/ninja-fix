package androidx.fragment.app;

import ae.C0423b;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0612g extends h0 {
    public final C0610e charlie;
    public AnimatorSet delta;

    public C0612g(C0610e c0610e) {
        this.charlie = c0610e;
    }

    @Override // androidx.fragment.app.h0
    public final void bravo(ViewGroup container) {
        String str;
        Intrinsics.echo(container, "container");
        AnimatorSet animatorSet = this.delta;
        C0610e c0610e = this.charlie;
        if (animatorSet == null) {
            c0610e.alpha.charlie(this);
            return;
        }
        i0 i0Var = c0610e.alpha;
        if (i0Var.golf) {
            if (Build.VERSION.SDK_INT >= 26) {
                C0614i.alpha.alpha(animatorSet);
            }
        } else {
            animatorSet.end();
        }
        if (L.gray(2)) {
            StringBuilder sb2 = new StringBuilder("Animator from operation ");
            sb2.append(i0Var);
            sb2.append(" has been canceled");
            if (i0Var.golf) {
                str = " with seeking.";
            } else {
                str = ".";
            }
            sb2.append(str);
            sb2.append(' ');
            Log.v("FragmentManager", sb2.toString());
        }
    }

    @Override // androidx.fragment.app.h0
    public final void charlie(ViewGroup container) {
        Intrinsics.echo(container, "container");
        i0 i0Var = this.charlie.alpha;
        AnimatorSet animatorSet = this.delta;
        if (animatorSet == null) {
            i0Var.charlie(this);
            return;
        }
        animatorSet.start();
        if (L.gray(2)) {
            Log.v("FragmentManager", "Animator from operation " + i0Var + " has started.");
        }
    }

    @Override // androidx.fragment.app.h0
    public final void delta(C0423b c0423b, ViewGroup container) {
        Intrinsics.echo(container, "container");
        C0610e c0610e = this.charlie;
        AnimatorSet animatorSet = this.delta;
        i0 i0Var = c0610e.alpha;
        if (animatorSet == null) {
            i0Var.charlie(this);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 && i0Var.charlie.mTransitioning) {
            if (L.gray(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + i0Var);
            }
            long alpha = C0613h.alpha.alpha(animatorSet);
            long j5 = c0423b.charlie * ((float) alpha);
            if (j5 == 0) {
                j5 = 1;
            }
            if (j5 == alpha) {
                j5 = alpha - 1;
            }
            if (L.gray(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j5 + " for Animator " + animatorSet + " on operation " + i0Var);
            }
            C0614i.alpha.bravo(animatorSet, j5);
        }
    }

    @Override // androidx.fragment.app.h0
    public final void echo(ViewGroup container) {
        AnimatorSet animatorSet;
        boolean z2;
        C0612g c0612g;
        Intrinsics.echo(container, "container");
        C0610e c0610e = this.charlie;
        if (!c0610e.alpha()) {
            Context context = container.getContext();
            Intrinsics.delta(context, "context");
            ao bravo = c0610e.bravo(context);
            if (bravo != null) {
                animatorSet = (AnimatorSet) bravo.bravo;
            } else {
                animatorSet = null;
            }
            this.delta = animatorSet;
            i0 i0Var = c0610e.alpha;
            ai aiVar = i0Var.charlie;
            if (i0Var.alpha == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z10 = z2;
            View view = aiVar.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet2 = this.delta;
            if (animatorSet2 != null) {
                c0612g = this;
                animatorSet2.addListener(new C0611f(container, view, z10, i0Var, c0612g));
            } else {
                c0612g = this;
            }
            AnimatorSet animatorSet3 = c0612g.delta;
            if (animatorSet3 != null) {
                animatorSet3.setTarget(view);
            }
        }
    }
}
