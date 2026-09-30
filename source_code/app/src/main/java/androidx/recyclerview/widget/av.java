package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public final class av implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ RecyclerView purple;

    public /* synthetic */ av(RecyclerView recyclerView, int i4) {
        this.alpha = i4;
        this.purple = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                RecyclerView recyclerView = this.purple;
                if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.mIsAttached) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.mLayoutSuppressed) {
                        recyclerView.mLayoutWasDefered = true;
                        return;
                    } else {
                        recyclerView.consumePendingUpdateOperations();
                        return;
                    }
                }
                return;
            default:
                RecyclerView recyclerView2 = this.purple;
                H h4 = recyclerView2.mItemAnimator;
                if (h4 != null) {
                    h4.runPendingAnimations();
                }
                recyclerView2.mPostedAnimatorRunner = false;
                return;
        }
    }
}
