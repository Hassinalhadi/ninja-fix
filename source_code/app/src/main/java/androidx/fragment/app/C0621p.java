package androidx.fragment.app;

import android.transition.Transition;

/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0621p extends AbstractC0615j {
    public final Object bravo;
    public final boolean charlie;
    public final Object delta;

    public C0621p(i0 i0Var, boolean z2, boolean z10) {
        super(i0Var);
        Object exitTransition;
        boolean z11;
        Object obj;
        int i4 = i0Var.alpha;
        ai aiVar = i0Var.charlie;
        if (i4 == 2) {
            if (z2) {
                exitTransition = aiVar.getReenterTransition();
            } else {
                exitTransition = aiVar.getEnterTransition();
            }
        } else if (z2) {
            exitTransition = aiVar.getReturnTransition();
        } else {
            exitTransition = aiVar.getExitTransition();
        }
        this.bravo = exitTransition;
        if (i0Var.alpha == 2) {
            if (z2) {
                z11 = aiVar.getAllowReturnTransitionOverlap();
            } else {
                z11 = aiVar.getAllowEnterTransitionOverlap();
            }
        } else {
            z11 = true;
        }
        this.charlie = z11;
        if (z10) {
            if (z2) {
                obj = aiVar.getSharedElementReturnTransition();
            } else {
                obj = aiVar.getSharedElementEnterTransition();
            }
        } else {
            obj = null;
        }
        this.delta = obj;
    }

    public final d0 bravo() {
        Object obj = this.bravo;
        d0 charlie = charlie(obj);
        Object obj2 = this.delta;
        d0 charlie2 = charlie(obj2);
        if (charlie != null && charlie2 != null && charlie != charlie2) {
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.alpha.charlie + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }
        if (charlie == null) {
            return charlie2;
        }
        return charlie;
    }

    public final d0 charlie(Object obj) {
        if (obj == null) {
            return null;
        }
        b0 b0Var = W.alpha;
        if (obj instanceof Transition) {
            return b0Var;
        }
        d0 d0Var = W.bravo;
        if (d0Var != null && d0Var.golf(obj)) {
            return d0Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.alpha.charlie + " is not a valid framework Transition or AndroidX Transition");
    }
}
