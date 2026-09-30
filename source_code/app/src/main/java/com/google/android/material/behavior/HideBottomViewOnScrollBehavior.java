package com.google.android.material.behavior;

import O6.a;
import O6.b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import ao.ad;
import delivery.samurai.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x2.q;

@Deprecated
/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends c {

    /* renamed from: a, reason: collision with root package name */
    public a f7845a;

    /* renamed from: d, reason: collision with root package name */
    public ViewPropertyAnimator f7848d;
    public int purple;
    public int red;
    public TimeInterpolator silver;
    public TimeInterpolator teal;
    public AccessibilityManager yellow;
    public final LinkedHashSet alpha = new LinkedHashSet();
    public int white = 0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7846b = true;

    /* renamed from: c, reason: collision with root package name */
    public int f7847c = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    public final void echo(View view) {
        if (this.f7847c == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7848d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f7847c = 2;
        Iterator it = this.alpha.iterator();
        if (!it.hasNext()) {
            this.f7848d = view.animate().translationY(0).setInterpolator(this.silver).setDuration(this.purple).setListener(new b(0, this));
            return;
        }
        throw ad.yankee(it);
    }

    @Override // androidx.coordinatorlayout.widget.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
        this.white = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.purple = q.echo(view.getContext(), R.attr.motionDurationLong2, 225);
        this.red = q.echo(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.silver = q.foxtrot(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, M6.a.delta);
        this.teal = q.foxtrot(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, M6.a.charlie);
        if (this.yellow == null) {
            this.yellow = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.yellow;
        if (accessibilityManager != null && this.f7845a == null) {
            a aVar = new a(this, view, 0);
            this.f7845a = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new B8.b(1, this));
            return false;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i10, int i11, int i12, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i5 > 0) {
            if (this.f7847c != 1) {
                if (!this.f7846b || (accessibilityManager = this.yellow) == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f7848d;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.f7847c = 1;
                    Iterator it = this.alpha.iterator();
                    if (!it.hasNext()) {
                        this.f7848d = view.animate().translationY(this.white).setInterpolator(this.teal).setDuration(this.red).setListener(new b(0, this));
                        return;
                    }
                    throw ad.yankee(it);
                }
                return;
            }
            return;
        }
        if (i5 < 0) {
            echo(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
        return i4 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
