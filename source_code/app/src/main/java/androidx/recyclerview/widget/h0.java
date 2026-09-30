package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import s1.C2569b;
import t1.C2952d;

/* loaded from: classes3.dex */
public class h0 extends C2569b {
    public final RecyclerView delta;
    public final g0 echo;

    public h0(RecyclerView recyclerView) {
        this.delta = recyclerView;
        g0 g0Var = this.echo;
        if (g0Var != null) {
            this.echo = g0Var;
        } else {
            this.echo = new g0(this);
        }
    }

    @Override // s1.C2569b
    public final void charlie(View view, AccessibilityEvent accessibilityEvent) {
        super.charlie(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.delta.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().peach(accessibilityEvent);
            }
        }
    }

    @Override // s1.C2569b
    public void delta(View view, C2952d c2952d) {
        this.alpha.onInitializeAccessibilityNodeInfo(view, c2952d.alpha);
        RecyclerView recyclerView = this.delta;
        if (!recyclerView.hasPendingAdapterUpdates() && recyclerView.getLayoutManager() != null) {
            L layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.bravo;
            layoutManager.pink(recyclerView2.mRecycler, recyclerView2.mState, c2952d);
        }
    }

    @Override // s1.C2569b
    public final boolean golf(View view, int i4, Bundle bundle) {
        int i5;
        int emerald;
        int i10;
        int i11;
        if (super.golf(view, i4, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.delta;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        L layoutManager = recyclerView.getLayoutManager();
        U u4 = layoutManager.bravo.mRecycler;
        int i12 = layoutManager.oscar;
        int i13 = layoutManager.november;
        Rect rect = new Rect();
        if (layoutManager.bravo.getMatrix().isIdentity() && layoutManager.bravo.getGlobalVisibleRect(rect)) {
            i12 = rect.height();
            i13 = rect.width();
        }
        if (i4 != 4096) {
            if (i4 != 8192) {
                i11 = 0;
                i10 = 0;
            } else {
                if (layoutManager.bravo.canScrollVertically(-1)) {
                    i5 = -((i12 - layoutManager.gold()) - layoutManager.cyan());
                } else {
                    i5 = 0;
                }
                if (layoutManager.bravo.canScrollHorizontally(-1)) {
                    emerald = -((i13 - layoutManager.emerald()) - layoutManager.fuchsia());
                    i10 = i5;
                    i11 = emerald;
                }
                i10 = i5;
                i11 = 0;
            }
        } else {
            if (layoutManager.bravo.canScrollVertically(1)) {
                i5 = (i12 - layoutManager.gold()) - layoutManager.cyan();
            } else {
                i5 = 0;
            }
            if (layoutManager.bravo.canScrollHorizontally(1)) {
                emerald = (i13 - layoutManager.emerald()) - layoutManager.fuchsia();
                i10 = i5;
                i11 = emerald;
            }
            i10 = i5;
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        layoutManager.bravo.smoothScrollBy(i11, i10, null, RecyclerView.UNDEFINED_DURATION, true);
        return true;
    }
}
