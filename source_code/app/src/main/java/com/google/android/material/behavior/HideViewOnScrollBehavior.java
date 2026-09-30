package com.google.android.material.behavior;

import O6.a;
import O6.b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import androidx.coordinatorlayout.widget.f;
import ao.ad;
import av.q;
import delivery.samurai.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class HideViewOnScrollBehavior<V extends View> extends c {

    /* renamed from: a, reason: collision with root package name */
    public TimeInterpolator f7849a;
    public O6.c alpha;

    /* renamed from: d, reason: collision with root package name */
    public ViewPropertyAnimator f7852d;
    public AccessibilityManager purple;
    public a red;
    public int teal;
    public int white;
    public TimeInterpolator yellow;
    public final LinkedHashSet silver = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public int f7850b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f7851c = 2;

    public HideViewOnScrollBehavior() {
    }

    public final void echo(int i4) {
        int i5;
        O6.c cVar = this.alpha;
        if (cVar != null) {
            switch (cVar.alpha) {
                case 0:
                    i5 = 1;
                    break;
                case 1:
                    i5 = 2;
                    break;
                default:
                    i5 = 0;
                    break;
            }
            if (i5 == i4) {
                return;
            }
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    this.alpha = new O6.c(1);
                    return;
                }
                throw new IllegalArgumentException(q.delta(i4, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
            }
            this.alpha = new O6.c(0);
            return;
        }
        this.alpha = new O6.c(2);
    }

    public final void foxtrot(View view) {
        if (this.f7851c == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7852d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f7851c = 2;
        Iterator it = this.silver.iterator();
        if (!it.hasNext()) {
            this.alpha.getClass();
            this.f7852d = this.alpha.charlie(0, view).setInterpolator(this.yellow).setDuration(this.teal).setListener(new b(1, this));
            return;
        }
        throw ad.yankee(it);
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
        int measuredHeight;
        int i5;
        int i10;
        if (this.purple == null) {
            this.purple = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.purple;
        if (accessibilityManager != null && this.red == null) {
            a aVar = new a(this, view, 1);
            this.red = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new B8.b(2, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = ((f) view.getLayoutParams()).charlie;
        if (i11 != 80 && i11 != 81) {
            int absoluteGravity = Gravity.getAbsoluteGravity(i11, i4);
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            echo(i10);
        } else {
            echo(1);
        }
        switch (this.alpha.alpha) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i5 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i5 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i5 = marginLayoutParams.rightMargin;
                break;
        }
        this.f7850b = measuredHeight + i5;
        this.teal = x2.q.echo(view.getContext(), R.attr.motionDurationLong2, 225);
        this.white = x2.q.echo(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.yellow = x2.q.foxtrot(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, M6.a.delta);
        this.f7849a = x2.q.foxtrot(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, M6.a.charlie);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i10, int i11, int i12, int[] iArr) {
        if (i5 > 0) {
            if (this.f7851c != 1) {
                AccessibilityManager accessibilityManager = this.purple;
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f7852d;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.f7851c = 1;
                    Iterator it = this.silver.iterator();
                    if (!it.hasNext()) {
                        this.f7852d = this.alpha.charlie(this.f7850b, view).setInterpolator(this.f7849a).setDuration(this.white).setListener(new b(1, this));
                        return;
                    }
                    throw ad.yankee(it);
                }
                return;
            }
            return;
        }
        if (i5 < 0) {
            foxtrot(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
        return i4 == 2;
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
