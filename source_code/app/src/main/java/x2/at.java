package x2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import t6.AbstractC2987e3;

/* loaded from: classes3.dex */
public final class at extends AnimatorListenerAdapter implements x {
    public final View alpha;
    public final int bravo;
    public final ViewGroup charlie;
    public boolean echo;
    public boolean foxtrot = false;
    public final boolean delta = true;

    public at(int i4, View view) {
        this.alpha = view;
        this.bravo = i4;
        this.charlie = (ViewGroup) view.getParent();
        alpha(true);
    }

    public final void alpha(boolean z2) {
        ViewGroup viewGroup;
        if (this.delta && this.echo != z2 && (viewGroup = this.charlie) != null) {
            this.echo = z2;
            AbstractC2987e3.bravo(viewGroup, z2);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.foxtrot = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.foxtrot) {
            al.bravo(this.alpha, this.bravo);
            ViewGroup viewGroup = this.charlie;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        alpha(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // x2.x
    public final void onTransitionCancel(z zVar) {
    }

    @Override // x2.x
    public final void onTransitionEnd(z zVar) {
        zVar.azure(this);
    }

    @Override // x2.x
    public final void onTransitionPause(z zVar) {
        alpha(false);
        if (!this.foxtrot) {
            al.bravo(this.alpha, this.bravo);
        }
    }

    @Override // x2.x
    public final void onTransitionResume(z zVar) {
        alpha(true);
        if (!this.foxtrot) {
            al.bravo(this.alpha, 0);
        }
    }

    @Override // x2.x
    public final void onTransitionStart(z zVar) {
        throw null;
    }

    @Override // x2.x
    public final void onTransitionStart(z zVar, boolean z2) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            al.bravo(this.alpha, 0);
            ViewGroup viewGroup = this.charlie;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // x2.x
    public final void onTransitionEnd(z zVar, boolean z2) {
        onTransitionEnd(zVar);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        if (!this.foxtrot) {
            al.bravo(this.alpha, this.bravo);
            ViewGroup viewGroup = this.charlie;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        alpha(false);
    }
}
