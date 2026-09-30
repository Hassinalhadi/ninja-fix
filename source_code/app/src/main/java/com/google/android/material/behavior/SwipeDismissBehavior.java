package com.google.android.material.behavior;

import Aa.m;
import O6.d;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import g.C1718a;
import s1.au;
import t1.C2951c;
import y1.C3391d;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends c {
    public C3391d alpha;
    public C1718a purple;
    public boolean red;
    public boolean silver;
    public int teal = 2;
    public float white = 0.0f;
    public float yellow = 0.5f;

    /* renamed from: a, reason: collision with root package name */
    public final d f7853a = new d(this);

    public boolean echo(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.red;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.red = false;
            }
        } else {
            z2 = coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.red = z2;
        }
        if (z2) {
            if (this.alpha == null) {
                this.alpha = new C3391d(coordinatorLayout.getContext(), coordinatorLayout, this.f7853a);
            }
            if (!this.silver && this.alpha.romeo(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            au.kilo(1048576, view);
            au.hotel(0, view);
            if (echo(view)) {
                au.lima(view, C2951c.november, new m(29, this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.alpha != null) {
            if (!this.silver || motionEvent.getActionMasked() != 3) {
                this.alpha.kilo(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }
}
