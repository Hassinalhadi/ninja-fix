package com.google.android.material.transformation;

import W6.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import m7.ViewTreeObserverOnPreDrawListenerC2106a;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends c {
    public int alpha = 0;

    public ExpandableBehavior() {
    }

    public abstract void echo(View view, View view2, boolean z2, boolean z10);

    @Override // androidx.coordinatorlayout.widget.c
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (a) view2;
        boolean z2 = ((FloatingActionButton) obj).f8029h.alpha;
        int i4 = 2;
        if (z2) {
            int i5 = this.alpha;
            if (i5 != 0 && i5 != 2) {
                return false;
            }
        } else if (this.alpha != 1) {
            return false;
        }
        if (z2) {
            i4 = 1;
        }
        this.alpha = i4;
        echo((View) obj, view, z2, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
        a aVar;
        int i5;
        if (!view.isLaidOut()) {
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    View view2 = dependencies.get(i10);
                    if (layoutDependsOn(coordinatorLayout, view, view2)) {
                        aVar = (a) view2;
                        break;
                    }
                    i10++;
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                boolean z2 = ((FloatingActionButton) aVar).f8029h.alpha;
                int i11 = 2;
                if (!z2 ? this.alpha == 1 : !((i5 = this.alpha) != 0 && i5 != 2)) {
                    if (z2) {
                        i11 = 1;
                    }
                    this.alpha = i11;
                    view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2106a(this, view, i11, aVar));
                }
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
