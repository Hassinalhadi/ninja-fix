package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class i0 extends H {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations;

    public abstract boolean animateAdd(f0 f0Var);

    @Override // androidx.recyclerview.widget.H
    public boolean animateAppearance(f0 f0Var, G g2, G g5) {
        int i4;
        int i5;
        if (g2 != null && ((i4 = g2.alpha) != (i5 = g5.alpha) || g2.bravo != g5.bravo)) {
            return animateMove(f0Var, i4, g2.bravo, i5, g5.bravo);
        }
        return animateAdd(f0Var);
    }

    public abstract boolean animateChange(f0 f0Var, f0 f0Var2, int i4, int i5, int i10, int i11);

    @Override // androidx.recyclerview.widget.H
    public boolean animateChange(f0 f0Var, f0 f0Var2, G g2, G g5) {
        int i4;
        int i5;
        int i10 = g2.alpha;
        int i11 = g2.bravo;
        if (f0Var2.shouldIgnore()) {
            int i12 = g2.alpha;
            i5 = g2.bravo;
            i4 = i12;
        } else {
            i4 = g5.alpha;
            i5 = g5.bravo;
        }
        return animateChange(f0Var, f0Var2, i10, i11, i4, i5);
    }

    @Override // androidx.recyclerview.widget.H
    public boolean animateDisappearance(f0 f0Var, G g2, G g5) {
        int i4;
        int i5;
        int i10 = g2.alpha;
        int i11 = g2.bravo;
        View view = f0Var.itemView;
        if (g5 == null) {
            i4 = view.getLeft();
        } else {
            i4 = g5.alpha;
        }
        int i12 = i4;
        if (g5 == null) {
            i5 = view.getTop();
        } else {
            i5 = g5.bravo;
        }
        int i13 = i5;
        if (!f0Var.isRemoved() && (i10 != i12 || i11 != i13)) {
            view.layout(i12, i13, view.getWidth() + i12, view.getHeight() + i13);
            return animateMove(f0Var, i10, i11, i12, i13);
        }
        return animateRemove(f0Var);
    }

    public abstract boolean animateMove(f0 f0Var, int i4, int i5, int i10, int i11);

    @Override // androidx.recyclerview.widget.H
    public boolean animatePersistence(f0 f0Var, G g2, G g5) {
        int i4 = g2.alpha;
        int i5 = g5.alpha;
        if (i4 == i5 && g2.bravo == g5.bravo) {
            dispatchMoveFinished(f0Var);
            return false;
        }
        return animateMove(f0Var, i4, g2.bravo, i5, g5.bravo);
    }

    public abstract boolean animateRemove(f0 f0Var);

    public boolean canReuseUpdatedViewHolder(f0 f0Var) {
        if (this.mSupportsChangeAnimations && !f0Var.isInvalid()) {
            return false;
        }
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddFinished(f0 f0Var) {
        onAddFinished(f0Var);
        dispatchAnimationFinished(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddStarting(f0 f0Var) {
        onAddStarting(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeFinished(f0 f0Var, boolean z2) {
        onChangeFinished(f0Var, z2);
        dispatchAnimationFinished(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeStarting(f0 f0Var, boolean z2) {
        onChangeStarting(f0Var, z2);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveFinished(f0 f0Var) {
        onMoveFinished(f0Var);
        dispatchAnimationFinished(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveStarting(f0 f0Var) {
        onMoveStarting(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveFinished(f0 f0Var) {
        onRemoveFinished(f0Var);
        dispatchAnimationFinished(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveStarting(f0 f0Var) {
        onRemoveStarting(f0Var);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddFinished(f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddStarting(f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeFinished(f0 f0Var, boolean z2) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeStarting(f0 f0Var, boolean z2) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveFinished(f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveStarting(f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveFinished(f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveStarting(f0 f0Var) {
    }

    public void setSupportsChangeAnimations(boolean z2) {
        this.mSupportsChangeAnimations = z2;
    }
}
