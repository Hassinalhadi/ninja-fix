package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class H {
    public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    public static final int FLAG_CHANGED = 2;
    public static final int FLAG_INVALIDATED = 4;
    public static final int FLAG_MOVED = 2048;
    public static final int FLAG_REMOVED = 8;
    private F mListener = null;
    private ArrayList<E> mFinishedListeners = new ArrayList<>();
    private long mAddDuration = 120;
    private long mRemoveDuration = 120;
    private long mMoveDuration = 250;
    private long mChangeDuration = 250;

    public static int buildAdapterChangeFlagsForAnimations(f0 f0Var) {
        int i4 = f0Var.mFlags;
        int i5 = i4 & 14;
        if (f0Var.isInvalid()) {
            return 4;
        }
        if ((i4 & 4) == 0) {
            int oldPosition = f0Var.getOldPosition();
            int absoluteAdapterPosition = f0Var.getAbsoluteAdapterPosition();
            if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                return i5 | 2048;
            }
        }
        return i5;
    }

    public abstract boolean animateAppearance(f0 f0Var, G g2, G g5);

    public abstract boolean animateChange(f0 f0Var, f0 f0Var2, G g2, G g5);

    public abstract boolean animateDisappearance(f0 f0Var, G g2, G g5);

    public abstract boolean animatePersistence(f0 f0Var, G g2, G g5);

    public abstract boolean canReuseUpdatedViewHolder(f0 f0Var, List list);

    public final void dispatchAnimationFinished(f0 f0Var) {
        onAnimationFinished(f0Var);
        F f5 = this.mListener;
        if (f5 != null) {
            ax axVar = (ax) f5;
            axVar.getClass();
            f0Var.setIsRecyclable(true);
            if (f0Var.mShadowedHolder != null && f0Var.mShadowingHolder == null) {
                f0Var.mShadowedHolder = null;
            }
            f0Var.mShadowingHolder = null;
            if (!f0Var.shouldBeKeptAsChild()) {
                View view = f0Var.itemView;
                RecyclerView recyclerView = axVar.alpha;
                if (!recyclerView.removeAnimatingView(view) && f0Var.isTmpDetached()) {
                    recyclerView.removeDetachedView(f0Var.itemView, false);
                }
            }
        }
    }

    public final void dispatchAnimationStarted(f0 f0Var) {
        onAnimationStarted(f0Var);
    }

    public final void dispatchAnimationsFinished() {
        if (this.mFinishedListeners.size() <= 0) {
            this.mFinishedListeners.clear();
        } else {
            this.mFinishedListeners.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public abstract void endAnimation(f0 f0Var);

    public abstract void endAnimations();

    public long getAddDuration() {
        return this.mAddDuration;
    }

    public long getChangeDuration() {
        return this.mChangeDuration;
    }

    public long getMoveDuration() {
        return this.mMoveDuration;
    }

    public long getRemoveDuration() {
        return this.mRemoveDuration;
    }

    public abstract boolean isRunning();

    public final boolean isRunning(E e) {
        boolean isRunning = isRunning();
        if (e != null) {
            if (!isRunning) {
                e.alpha();
                return isRunning;
            }
            this.mFinishedListeners.add(e);
        }
        return isRunning;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.G, java.lang.Object] */
    public G obtainHolderInfo() {
        return new Object();
    }

    public void onAnimationFinished(f0 f0Var) {
    }

    public void onAnimationStarted(f0 f0Var) {
    }

    public G recordPostLayoutInformation(b0 b0Var, f0 f0Var) {
        G obtainHolderInfo = obtainHolderInfo();
        obtainHolderInfo.getClass();
        View view = f0Var.itemView;
        obtainHolderInfo.alpha = view.getLeft();
        obtainHolderInfo.bravo = view.getTop();
        view.getRight();
        view.getBottom();
        return obtainHolderInfo;
    }

    public G recordPreLayoutInformation(b0 b0Var, f0 f0Var, int i4, List<Object> list) {
        G obtainHolderInfo = obtainHolderInfo();
        obtainHolderInfo.getClass();
        View view = f0Var.itemView;
        obtainHolderInfo.alpha = view.getLeft();
        obtainHolderInfo.bravo = view.getTop();
        view.getRight();
        view.getBottom();
        return obtainHolderInfo;
    }

    public abstract void runPendingAnimations();

    public void setAddDuration(long j5) {
        this.mAddDuration = j5;
    }

    public void setChangeDuration(long j5) {
        this.mChangeDuration = j5;
    }

    public void setListener(F f5) {
        this.mListener = f5;
    }

    public void setMoveDuration(long j5) {
        this.mMoveDuration = j5;
    }

    public void setRemoveDuration(long j5) {
        this.mRemoveDuration = j5;
    }
}
