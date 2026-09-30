package com.google.android.material.sidesheet;

import Jb.at;
import T5.o;
import a7.C0415j;
import a7.InterfaceC0407b;
import ae.C0423b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.P0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import androidx.coordinatorlayout.widget.f;
import androidx.customview.view.AbsSavedState;
import ao.ad;
import av.q;
import com.google.android.material.bottomsheet.b;
import com.google.android.material.sidesheet.SideSheetBehavior;
import delivery.samurai.android.R;
import g7.C1755a;
import g7.i;
import g7.l;
import g7.m;
import h7.C1816a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import s1.al;
import s1.au;
import s6.AbstractC2719n0;
import t1.C2951c;
import t1.n;
import y1.C3391d;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends c implements InterfaceC0407b {

    /* renamed from: a, reason: collision with root package name */
    public int f8104a;
    public C1816a alpha;

    /* renamed from: b, reason: collision with root package name */
    public C3391d f8105b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8106c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8107d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f8108f;

    /* renamed from: g, reason: collision with root package name */
    public int f8109g;

    /* renamed from: h, reason: collision with root package name */
    public int f8110h;

    /* renamed from: i, reason: collision with root package name */
    public WeakReference f8111i;

    /* renamed from: j, reason: collision with root package name */
    public WeakReference f8112j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8113k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f8114l;

    /* renamed from: m, reason: collision with root package name */
    public C0415j f8115m;

    /* renamed from: n, reason: collision with root package name */
    public int f8116n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f8117o;

    /* renamed from: p, reason: collision with root package name */
    public final b f8118p;
    public final i purple;
    public final ColorStateList red;
    public final m silver;
    public final o teal;
    public final float white;
    public final boolean yellow;

    public SideSheetBehavior() {
        this.teal = new o(this);
        this.yellow = true;
        this.f8104a = 5;
        this.f8107d = 0.1f;
        this.f8113k = -1;
        this.f8117o = new LinkedHashSet();
        this.f8118p = new b(this, 1);
    }

    @Override // a7.InterfaceC0407b
    public final void alpha(C0423b c0423b) {
        int i4;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z2;
        C0415j c0415j = this.f8115m;
        if (c0415j != null) {
            C1816a c1816a = this.alpha;
            if (c1816a != null && c1816a.delta() != 0) {
                i4 = 3;
            } else {
                i4 = 5;
            }
            if (c0415j.foxtrot == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
            }
            C0423b c0423b2 = c0415j.foxtrot;
            c0415j.foxtrot = c0423b;
            if (c0423b2 != null) {
                if (c0423b.delta == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c0415j.charlie(c0423b.charlie, z2, i4);
            }
            WeakReference weakReference = this.f8111i;
            if (weakReference != null && weakReference.get() != null) {
                View view2 = (View) this.f8111i.get();
                WeakReference weakReference2 = this.f8112j;
                if (weakReference2 != null) {
                    view = (View) weakReference2.get();
                } else {
                    view = null;
                }
                if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                    this.alpha.echo(marginLayoutParams, (int) ((view2.getScaleX() * this.e) + this.f8110h));
                    view.requestLayout();
                }
            }
        }
    }

    @Override // a7.InterfaceC0407b
    public final void bravo() {
        final View view;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i4;
        C0415j c0415j = this.f8115m;
        if (c0415j == null) {
            return;
        }
        C0423b c0423b = c0415j.foxtrot;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        c0415j.foxtrot = null;
        int i5 = 5;
        if (c0423b != null && Build.VERSION.SDK_INT >= 34) {
            C1816a c1816a = this.alpha;
            if (c1816a != null && c1816a.delta() != 0) {
                i5 = 3;
            }
            O6.b bVar = new O6.b(8, this);
            WeakReference weakReference = this.f8112j;
            if (weakReference != null) {
                view = (View) weakReference.get();
            } else {
                view = null;
            }
            if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                switch (this.alpha.alpha) {
                    case 0:
                        i4 = marginLayoutParams.leftMargin;
                        break;
                    default:
                        i4 = marginLayoutParams.rightMargin;
                        break;
                }
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: h7.c
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SideSheetBehavior.this.alpha.echo(marginLayoutParams, M6.a.charlie(i4, 0, valueAnimator.getAnimatedFraction()));
                        view.requestLayout();
                    }
                };
            }
            c0415j.bravo(c0423b, i5, bVar, animatorUpdateListener);
            return;
        }
        echo(5);
    }

    @Override // a7.InterfaceC0407b
    public final void charlie(C0423b c0423b) {
        C0415j c0415j = this.f8115m;
        if (c0415j == null) {
            return;
        }
        c0415j.foxtrot = c0423b;
    }

    @Override // a7.InterfaceC0407b
    public final void delta() {
        C0415j c0415j = this.f8115m;
        if (c0415j == null) {
            return;
        }
        c0415j.alpha();
    }

    public final void echo(int i4) {
        String str;
        if (i4 != 1 && i4 != 2) {
            WeakReference weakReference = this.f8111i;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f8111i.get();
                at atVar = new at(this, i4, 4);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                    view.post(atVar);
                    return;
                } else {
                    atVar.run();
                    return;
                }
            }
            foxtrot(i4);
            return;
        }
        StringBuilder sb2 = new StringBuilder("STATE_");
        if (i4 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(P0.gold(sb2, str, " should not be set externally."));
    }

    public final void foxtrot(int i4) {
        View view;
        int i5;
        if (this.f8104a != i4) {
            this.f8104a = i4;
            WeakReference weakReference = this.f8111i;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            if (this.f8104a == 5) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            Iterator it = this.f8117o.iterator();
            if (!it.hasNext()) {
                india();
                return;
            }
            throw ad.yankee(it);
        }
    }

    public final boolean golf() {
        if (this.f8105b != null) {
            if (this.yellow || this.f8104a == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void hotel(View view, int i4, boolean z2) {
        int alpha;
        if (i4 != 3) {
            if (i4 == 5) {
                alpha = this.alpha.bravo();
            } else {
                throw new IllegalArgumentException(ad.zulu(i4, "Invalid state to get outer edge offset: "));
            }
        } else {
            alpha = this.alpha.alpha();
        }
        C3391d c3391d = this.f8105b;
        if (c3391d != null && (!z2 ? c3391d.sierra(view, alpha, view.getTop()) : c3391d.quebec(alpha, view.getTop()))) {
            foxtrot(2);
            this.teal.charlie(i4);
        } else {
            foxtrot(i4);
        }
    }

    public final void india() {
        View view;
        WeakReference weakReference = this.f8111i;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            au.kilo(262144, view);
            au.hotel(0, view);
            au.kilo(1048576, view);
            au.hotel(0, view);
            final int i4 = 5;
            if (this.f8104a != 5) {
                au.lima(view, C2951c.november, new n() { // from class: h7.b
                    @Override // t1.n
                    public final boolean charlie(View view2) {
                        SideSheetBehavior.this.echo(i4);
                        return true;
                    }
                });
            }
            final int i5 = 3;
            if (this.f8104a != 3) {
                au.lima(view, C2951c.lima, new n() { // from class: h7.b
                    @Override // t1.n
                    public final boolean charlie(View view2) {
                        SideSheetBehavior.this.echo(i5);
                        return true;
                    }
                });
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final void onAttachedToLayoutParams(f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.f8111i = null;
        this.f8105b = null;
        this.f8115m = null;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f8111i = null;
        this.f8105b = null;
        this.f8115m = null;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C3391d c3391d;
        VelocityTracker velocityTracker;
        if ((view.isShown() || au.echo(view) != null) && this.yellow) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.f8114l) != null) {
                velocityTracker.recycle();
                this.f8114l = null;
            }
            if (this.f8114l == null) {
                this.f8114l = VelocityTracker.obtain();
            }
            this.f8114l.addMovement(motionEvent);
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.f8106c) {
                    this.f8106c = false;
                    return false;
                }
            } else {
                this.f8116n = (int) motionEvent.getX();
            }
            if (!this.f8106c && (c3391d = this.f8105b) != null && c3391d.romeo(motionEvent)) {
                return true;
            }
            return false;
        }
        this.f8106c = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
        int i5;
        View view2;
        View view3;
        int left;
        int i10;
        int i11;
        View findViewById;
        int i12;
        int i13 = 0;
        i iVar = this.purple;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f8111i == null) {
            this.f8111i = new WeakReference(view);
            this.f8115m = new C0415j(view);
            if (iVar != null) {
                view.setBackground(iVar);
                float f5 = this.white;
                if (f5 == -1.0f) {
                    f5 = view.getElevation();
                }
                iVar.papa(f5);
            } else {
                ColorStateList colorStateList = this.red;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = au.alpha;
                    al.india(view, colorStateList);
                }
            }
            if (this.f8104a == 5) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            if (view.getVisibility() != i12) {
                view.setVisibility(i12);
            }
            india();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (au.echo(view) == null) {
                au.oscar(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (Gravity.getAbsoluteGravity(((f) view.getLayoutParams()).charlie, i4) == 3) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        C1816a c1816a = this.alpha;
        if (c1816a == null || c1816a.delta() != i5) {
            m mVar = this.silver;
            f fVar = null;
            if (i5 == 0) {
                this.alpha = new C1816a(this, 1);
                if (mVar != null) {
                    WeakReference weakReference = this.f8111i;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof f)) {
                        fVar = (f) view3.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).rightMargin <= 0) {
                        l golf = mVar.golf();
                        golf.foxtrot = new C1755a(0.0f);
                        golf.golf = new C1755a(0.0f);
                        m alpha = golf.alpha();
                        if (iVar != null) {
                            iVar.setShapeAppearanceModel(alpha);
                        }
                    }
                }
            } else if (i5 == 1) {
                this.alpha = new C1816a(this, 0);
                if (mVar != null) {
                    WeakReference weakReference2 = this.f8111i;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof f)) {
                        fVar = (f) view2.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).leftMargin <= 0) {
                        l golf2 = mVar.golf();
                        golf2.echo = new C1755a(0.0f);
                        golf2.hotel = new C1755a(0.0f);
                        m alpha2 = golf2.alpha();
                        if (iVar != null) {
                            iVar.setShapeAppearanceModel(alpha2);
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException(q.delta(i5, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
            }
        }
        if (this.f8105b == null) {
            this.f8105b = new C3391d(coordinatorLayout.getContext(), coordinatorLayout, this.f8118p);
        }
        int charlie = this.alpha.charlie(view);
        coordinatorLayout.onLayoutChild(view, i4);
        this.f8108f = coordinatorLayout.getWidth();
        switch (this.alpha.alpha) {
            case 0:
                left = coordinatorLayout.getLeft();
                break;
            default:
                left = coordinatorLayout.getRight();
                break;
        }
        this.f8109g = left;
        this.e = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.alpha.alpha) {
                case 0:
                    i10 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i10 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i10 = 0;
        }
        this.f8110h = i10;
        int i14 = this.f8104a;
        if (i14 != 1 && i14 != 2) {
            if (i14 != 3) {
                if (i14 == 5) {
                    i13 = this.alpha.bravo();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f8104a);
                }
            }
        } else {
            i13 = charlie - this.alpha.charlie(view);
        }
        WeakHashMap weakHashMap2 = au.alpha;
        view.offsetLeftAndRight(i13);
        if (this.f8112j == null && (i11 = this.f8113k) != -1 && (findViewById = coordinatorLayout.findViewById(i11)) != null) {
            this.f8112j = new WeakReference(findViewById);
        }
        Iterator it = this.f8117o.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        Parcelable parcelable2 = savedState.alpha;
        if (parcelable2 != null) {
            super.onRestoreInstanceState(coordinatorLayout, view, parcelable2);
        }
        int i4 = savedState.red;
        if (i4 == 1 || i4 == 2) {
            i4 = 5;
        }
        this.f8104a = i4;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, view), this);
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f8104a == 1 && actionMasked == 0) {
            return true;
        }
        if (golf()) {
            this.f8105b.kilo(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f8114l) != null) {
            velocityTracker.recycle();
            this.f8114l = null;
        }
        if (this.f8114l == null) {
            this.f8114l = VelocityTracker.obtain();
        }
        this.f8114l.addMovement(motionEvent);
        if (golf() && actionMasked == 2 && !this.f8106c && golf()) {
            float abs = Math.abs(this.f8116n - motionEvent.getX());
            C3391d c3391d = this.f8105b;
            if (abs > c3391d.bravo) {
                c3391d.bravo(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f8106c;
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public final int red;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.red = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.red);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.red = sideSheetBehavior.f8104a;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.teal = new o(this);
        this.yellow = true;
        this.f8104a = 5;
        this.f8107d = 0.1f;
        this.f8113k = -1;
        this.f8117o = new LinkedHashSet();
        this.f8118p = new b(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.a.green);
        if (obtainStyledAttributes.hasValue(3)) {
            this.red = AbstractC2719n0.alpha(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.silver = m.charlie(context, attributeSet, 0, 2132083832).alpha();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f8113k = resourceId;
            WeakReference weakReference = this.f8112j;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f8112j = null;
            WeakReference weakReference2 = this.f8111i;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        m mVar = this.silver;
        if (mVar != null) {
            i iVar = new i(mVar);
            this.purple = iVar;
            iVar.mike(context);
            ColorStateList colorStateList = this.red;
            if (colorStateList != null) {
                this.purple.quebec(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.purple.setTint(typedValue.data);
            }
        }
        this.white = obtainStyledAttributes.getDimension(2, -1.0f);
        this.yellow = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
