package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import g.C1718a;
import java.util.WeakHashMap;
import s1.C2569b;
import t1.C2952d;

/* loaded from: classes3.dex */
public final class g0 extends C2569b {
    public final h0 delta;
    public final WeakHashMap echo = new WeakHashMap();

    public g0(h0 h0Var) {
        this.delta = h0Var;
    }

    @Override // s1.C2569b
    public final boolean alpha(View view, AccessibilityEvent accessibilityEvent) {
        C2569b c2569b = (C2569b) this.echo.get(view);
        if (c2569b != null) {
            return c2569b.alpha(view, accessibilityEvent);
        }
        return this.alpha.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // s1.C2569b
    public final C1718a bravo(View view) {
        C2569b c2569b = (C2569b) this.echo.get(view);
        if (c2569b != null) {
            return c2569b.bravo(view);
        }
        return super.bravo(view);
    }

    @Override // s1.C2569b
    public final void charlie(View view, AccessibilityEvent accessibilityEvent) {
        C2569b c2569b = (C2569b) this.echo.get(view);
        if (c2569b != null) {
            c2569b.charlie(view, accessibilityEvent);
        } else {
            super.charlie(view, accessibilityEvent);
        }
    }

    @Override // s1.C2569b
    public final void delta(View view, C2952d c2952d) {
        h0 h0Var = this.delta;
        boolean hasPendingAdapterUpdates = h0Var.delta.hasPendingAdapterUpdates();
        View.AccessibilityDelegate accessibilityDelegate = this.alpha;
        AccessibilityNodeInfo accessibilityNodeInfo = c2952d.alpha;
        if (!hasPendingAdapterUpdates) {
            RecyclerView recyclerView = h0Var.delta;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().plum(view, c2952d);
                C2569b c2569b = (C2569b) this.echo.get(view);
                if (c2569b != null) {
                    c2569b.delta(view, c2952d);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // s1.C2569b
    public final void echo(View view, AccessibilityEvent accessibilityEvent) {
        C2569b c2569b = (C2569b) this.echo.get(view);
        if (c2569b != null) {
            c2569b.echo(view, accessibilityEvent);
        } else {
            super.echo(view, accessibilityEvent);
        }
    }

    @Override // s1.C2569b
    public final boolean foxtrot(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C2569b c2569b = (C2569b) this.echo.get(viewGroup);
        if (c2569b != null) {
            return c2569b.foxtrot(viewGroup, view, accessibilityEvent);
        }
        return this.alpha.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // s1.C2569b
    public final boolean golf(View view, int i4, Bundle bundle) {
        h0 h0Var = this.delta;
        if (!h0Var.delta.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = h0Var.delta;
            if (recyclerView.getLayoutManager() != null) {
                C2569b c2569b = (C2569b) this.echo.get(view);
                if (c2569b != null) {
                    if (c2569b.golf(view, i4, bundle)) {
                        return true;
                    }
                } else if (super.golf(view, i4, bundle)) {
                    return true;
                }
                U u4 = recyclerView.getLayoutManager().bravo.mRecycler;
                return false;
            }
        }
        return super.golf(view, i4, bundle);
    }

    @Override // s1.C2569b
    public final void hotel(View view, int i4) {
        C2569b c2569b = (C2569b) this.echo.get(view);
        if (c2569b != null) {
            c2569b.hotel(view, i4);
        } else {
            super.hotel(view, i4);
        }
    }

    @Override // s1.C2569b
    public final void india(View view, AccessibilityEvent accessibilityEvent) {
        C2569b c2569b = (C2569b) this.echo.get(view);
        if (c2569b != null) {
            c2569b.india(view, accessibilityEvent);
        } else {
            super.india(view, accessibilityEvent);
        }
    }
}
