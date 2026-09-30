package com.google.android.material.floatingactionbutton;

import L6.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import androidx.coordinatorlayout.widget.f;

/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends c {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        if (view == null) {
            return super.getInsetDodgeRect(coordinatorLayout, null, rect);
        }
        throw new ClassCastException();
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final void onAttachedToLayoutParams(f fVar) {
        if (fVar.hotel == 0) {
            fVar.hotel = 80;
        }
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
        throw new ClassCastException();
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.mike);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
