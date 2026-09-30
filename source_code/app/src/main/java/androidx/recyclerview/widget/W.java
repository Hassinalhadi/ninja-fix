package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class W extends B {
    public final /* synthetic */ RecyclerView alpha;

    public W(RecyclerView recyclerView) {
        this.alpha = recyclerView;
    }

    public final void alpha() {
        boolean z2 = RecyclerView.POST_UPDATES_ON_ANIMATION;
        RecyclerView recyclerView = this.alpha;
        if (z2 && recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
            Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
            WeakHashMap weakHashMap = s1.au.alpha;
            recyclerView.postOnAnimation(runnable);
        } else {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final void onChanged() {
        RecyclerView recyclerView = this.alpha;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.foxtrot = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (!recyclerView.mAdapterHelper.golf()) {
            recyclerView.requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final void onItemRangeChanged(int i4, int i5, Object obj) {
        RecyclerView recyclerView = this.alpha;
        recyclerView.assertNotInLayoutOrScroll(null);
        C0657b c0657b = recyclerView.mAdapterHelper;
        if (i5 < 1) {
            c0657b.getClass();
            return;
        }
        ArrayList arrayList = c0657b.bravo;
        arrayList.add(c0657b.hotel(obj, 4, i4, i5));
        c0657b.foxtrot |= 4;
        if (arrayList.size() == 1) {
            alpha();
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final void onItemRangeInserted(int i4, int i5) {
        RecyclerView recyclerView = this.alpha;
        recyclerView.assertNotInLayoutOrScroll(null);
        C0657b c0657b = recyclerView.mAdapterHelper;
        if (i5 < 1) {
            c0657b.getClass();
            return;
        }
        ArrayList arrayList = c0657b.bravo;
        arrayList.add(c0657b.hotel(null, 1, i4, i5));
        c0657b.foxtrot |= 1;
        if (arrayList.size() == 1) {
            alpha();
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final void onItemRangeMoved(int i4, int i5, int i10) {
        RecyclerView recyclerView = this.alpha;
        recyclerView.assertNotInLayoutOrScroll(null);
        C0657b c0657b = recyclerView.mAdapterHelper;
        c0657b.getClass();
        if (i4 != i5) {
            if (i10 == 1) {
                ArrayList arrayList = c0657b.bravo;
                arrayList.add(c0657b.hotel(null, 8, i4, i5));
                c0657b.foxtrot |= 8;
                if (arrayList.size() == 1) {
                    alpha();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final void onItemRangeRemoved(int i4, int i5) {
        RecyclerView recyclerView = this.alpha;
        recyclerView.assertNotInLayoutOrScroll(null);
        C0657b c0657b = recyclerView.mAdapterHelper;
        if (i5 < 1) {
            c0657b.getClass();
            return;
        }
        ArrayList arrayList = c0657b.bravo;
        arrayList.add(c0657b.hotel(null, 2, i4, i5));
        c0657b.foxtrot |= 2;
        if (arrayList.size() == 1) {
            alpha();
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final void onStateRestorationPolicyChanged() {
        az azVar;
        RecyclerView recyclerView = this.alpha;
        if (recyclerView.mPendingSavedState != null && (azVar = recyclerView.mAdapter) != null && azVar.canRestoreState()) {
            recyclerView.requestLayout();
        }
    }
}
