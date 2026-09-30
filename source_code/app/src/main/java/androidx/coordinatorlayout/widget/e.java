package androidx.coordinatorlayout.widget;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class e implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ CoordinatorLayout alpha;

    public e(CoordinatorLayout coordinatorLayout) {
        this.alpha = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.alpha.mOnHierarchyChangeListener;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.alpha;
        coordinatorLayout.onChildViewsChanged(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.mOnHierarchyChangeListener;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
