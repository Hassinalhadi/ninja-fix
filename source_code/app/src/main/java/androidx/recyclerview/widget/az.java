package androidx.recyclerview.widget;

import android.database.Observable;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class az {
    private final A mObservable = new Observable();
    private boolean mHasStableIds = false;
    private ay mStateRestorationPolicy = ay.alpha;

    public final void bindViewHolder(f0 f0Var, int i4) {
        boolean z2;
        if (f0Var.mBindingAdapter == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f0Var.mPosition = i4;
            if (hasStableIds()) {
                f0Var.mItemId = getItemId(i4);
            }
            f0Var.setFlags(1, 519);
            int i5 = o1.i.alpha;
            Trace.beginSection("RV OnBindView");
        }
        f0Var.mBindingAdapter = this;
        if (RecyclerView.sDebugAssertionsEnabled) {
            if (f0Var.itemView.getParent() == null) {
                View view = f0Var.itemView;
                WeakHashMap weakHashMap = s1.au.alpha;
                if (view.isAttachedToWindow() != f0Var.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + f0Var.isTmpDetached() + ", attached to window: " + f0Var.itemView.isAttachedToWindow() + ", holder: " + f0Var);
                }
            }
            if (f0Var.itemView.getParent() == null) {
                View view2 = f0Var.itemView;
                WeakHashMap weakHashMap2 = s1.au.alpha;
                if (view2.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + f0Var);
                }
            }
        }
        onBindViewHolder(f0Var, i4, f0Var.getUnmodifiedPayloads());
        if (z2) {
            f0Var.clearPayload();
            ViewGroup.LayoutParams layoutParams = f0Var.itemView.getLayoutParams();
            if (layoutParams instanceof M) {
                ((M) layoutParams).red = true;
            }
            int i10 = o1.i.alpha;
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int ordinal = this.mStateRestorationPolicy.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
        } else if (getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    public final f0 createViewHolder(ViewGroup viewGroup, int i4) {
        try {
            int i5 = o1.i.alpha;
            Trace.beginSection("RV CreateView");
            f0 onCreateViewHolder = onCreateViewHolder(viewGroup, i4);
            if (onCreateViewHolder.itemView.getParent() == null) {
                onCreateViewHolder.mItemViewType = i4;
                Trace.endSection();
                return onCreateViewHolder;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th) {
            int i10 = o1.i.alpha;
            Trace.endSection();
            throw th;
        }
    }

    public int findRelativeAdapterPositionIn(az azVar, f0 f0Var, int i4) {
        if (azVar == this) {
            return i4;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i4) {
        return -1L;
    }

    public int getItemViewType(int i4) {
        return 0;
    }

    public final ay getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.alpha();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.bravo();
    }

    public final void notifyItemChanged(int i4) {
        this.mObservable.delta(i4, 1, null);
    }

    public final void notifyItemInserted(int i4) {
        this.mObservable.echo(i4, 1);
    }

    public final void notifyItemMoved(int i4, int i5) {
        this.mObservable.charlie(i4, i5);
    }

    public final void notifyItemRangeChanged(int i4, int i5) {
        this.mObservable.delta(i4, i5, null);
    }

    public final void notifyItemRangeInserted(int i4, int i5) {
        this.mObservable.echo(i4, i5);
    }

    public final void notifyItemRangeRemoved(int i4, int i5) {
        this.mObservable.foxtrot(i4, i5);
    }

    public final void notifyItemRemoved(int i4) {
        this.mObservable.foxtrot(i4, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(f0 f0Var, int i4);

    public void onBindViewHolder(f0 f0Var, int i4, List<Object> list) {
        onBindViewHolder(f0Var, i4);
    }

    public abstract f0 onCreateViewHolder(ViewGroup viewGroup, int i4);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(f0 f0Var) {
        return false;
    }

    public void onViewAttachedToWindow(f0 f0Var) {
    }

    public void onViewDetachedFromWindow(f0 f0Var) {
    }

    public void onViewRecycled(f0 f0Var) {
    }

    public void registerAdapterDataObserver(B b2) {
        this.mObservable.registerObserver(b2);
    }

    public void setHasStableIds(boolean z2) {
        if (!hasObservers()) {
            this.mHasStableIds = z2;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void setStateRestorationPolicy(ay ayVar) {
        this.mStateRestorationPolicy = ayVar;
        this.mObservable.golf();
    }

    public void unregisterAdapterDataObserver(B b2) {
        this.mObservable.unregisterObserver(b2);
    }

    public final void notifyItemChanged(int i4, Object obj) {
        this.mObservable.delta(i4, 1, obj);
    }

    public final void notifyItemRangeChanged(int i4, int i5, Object obj) {
        this.mObservable.delta(i4, i5, obj);
    }
}
