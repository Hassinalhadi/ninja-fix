package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;

/* loaded from: classes3.dex */
public final class ax implements s0, F {
    public final /* synthetic */ RecyclerView alpha;

    public /* synthetic */ ax(RecyclerView recyclerView) {
        this.alpha = recyclerView;
    }

    public void alpha(C0656a c0656a) {
        int i4 = c0656a.alpha;
        RecyclerView recyclerView = this.alpha;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 != 8) {
                        return;
                    }
                    recyclerView.mLayout.teal(c0656a.bravo, c0656a.delta);
                    return;
                }
                recyclerView.mLayout.a(recyclerView, c0656a.bravo, c0656a.delta);
                return;
            }
            recyclerView.mLayout.white(c0656a.bravo, c0656a.delta);
            return;
        }
        recyclerView.mLayout.red(c0656a.bravo, c0656a.delta);
    }

    public f0 bravo(int i4) {
        RecyclerView recyclerView = this.alpha;
        f0 findViewHolderForPosition = recyclerView.findViewHolderForPosition(i4, true);
        if (findViewHolderForPosition != null) {
            C0666k c0666k = recyclerView.mChildHelper;
            if (c0666k.charlie.contains(findViewHolderForPosition.itemView)) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
                }
            } else {
                return findViewHolderForPosition;
            }
        }
        return null;
    }

    public void charlie(int i4) {
        RecyclerView recyclerView = this.alpha;
        View childAt = recyclerView.getChildAt(i4);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i4);
    }
}
