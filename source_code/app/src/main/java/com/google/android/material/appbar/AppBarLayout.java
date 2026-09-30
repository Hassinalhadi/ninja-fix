package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import ao.ad;
import av.ah;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import l7.AbstractC2059a;
import s1.InterfaceC2583p;
import s1.a0;
import s1.al;
import s1.au;
import s6.AbstractC2719n0;
import s6.AbstractC2815x7;
import s6.G7;
import s6.R4;
import t6.AbstractC3032n3;
import x2.q;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements androidx.coordinatorlayout.widget.b {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f7767u = 0;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f7768a;
    public int alpha;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7769b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7770c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7771d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f7772f;

    /* renamed from: g, reason: collision with root package name */
    public int f7773g;

    /* renamed from: h, reason: collision with root package name */
    public WeakReference f7774h;

    /* renamed from: i, reason: collision with root package name */
    public ValueAnimator f7775i;

    /* renamed from: j, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f7776j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f7777k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f7778l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7779m;

    /* renamed from: n, reason: collision with root package name */
    public final TimeInterpolator f7780n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f7781o;

    /* renamed from: p, reason: collision with root package name */
    public int f7782p;
    public int purple;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f7783q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f7784r;
    public int red;

    /* renamed from: s, reason: collision with root package name */
    public final float f7785s;
    public int silver;

    /* renamed from: t, reason: collision with root package name */
    public Behavior f7786t;
    public boolean teal;
    public int white;
    public a0 yellow;

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends k {
        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.k
        public /* bridge */ /* synthetic */ View findFirstDependency(List list) {
            return findFirstDependency((List<View>) list);
        }

        @Override // com.google.android.material.appbar.l
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.k
        public float getOverlapRatioForOffset(View view) {
            int i4;
            int i5;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                androidx.coordinatorlayout.widget.c cVar = ((androidx.coordinatorlayout.widget.f) appBarLayout.getLayoutParams()).alpha;
                if (cVar instanceof BaseBehavior) {
                    i4 = ((BaseBehavior) cVar).echo();
                } else {
                    i4 = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i4 > downNestedPreScrollRange) && (i5 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (i4 / i5) + 1.0f;
                }
            }
            return 0.0f;
        }

        public int getScrollRange(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return view.getMeasuredHeight();
        }

        @Override // com.google.android.material.appbar.l
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.l
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.l
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.c
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            androidx.coordinatorlayout.widget.c cVar = ((androidx.coordinatorlayout.widget.f) view2.getLayoutParams()).alpha;
            if (cVar instanceof BaseBehavior) {
                int verticalLayoutGap = (getVerticalLayoutGap() + ((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f7787a)) - getOverlapPixelsForOffset(view2);
                WeakHashMap weakHashMap = au.alpha;
                view.offsetTopAndBottom(verticalLayoutGap);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.e) {
                    appBarLayout.foxtrot(appBarLayout.golf(view));
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.c
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                au.november(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.l, androidx.coordinatorlayout.widget.c
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
            super.onLayoutChild(coordinatorLayout, view, i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.c
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i10, int i11) {
            View findFirstDependency;
            int i12;
            a0 lastWindowInsets;
            int i13 = view.getLayoutParams().height;
            if ((i13 == -1 || i13 == -2) && (findFirstDependency = findFirstDependency((List) coordinatorLayout.getDependencies(view))) != null) {
                int size = View.MeasureSpec.getSize(i10);
                if (size > 0) {
                    if (findFirstDependency.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                        size += lastWindowInsets.alpha() + lastWindowInsets.delta();
                    }
                } else {
                    size = coordinatorLayout.getHeight();
                }
                int scrollRange = getScrollRange(findFirstDependency) + size;
                int measuredHeight = findFirstDependency.getMeasuredHeight();
                if (shouldHeaderOverlapScrollingChild()) {
                    view.setTranslationY(-measuredHeight);
                } else {
                    view.setTranslationY(0.0f);
                    scrollRange -= measuredHeight;
                }
                if (i13 == -1) {
                    i12 = 1073741824;
                } else {
                    i12 = RecyclerView.UNDEFINED_DURATION;
                }
                coordinatorLayout.onMeasureChild(view, i4, i5, View.MeasureSpec.makeMeasureSpec(scrollRange, i12), i11);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.c
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z2) {
            AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
            if (findFirstDependency != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.tempRect1;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    findFirstDependency.echo(false, !z2, true);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.l
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z2) {
            super.setHorizontalOffsetEnabled(z2);
        }

        @Override // com.google.android.material.appbar.l
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i4) {
            return super.setLeftAndRightOffset(i4);
        }

        @Override // com.google.android.material.appbar.l
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i4) {
            return super.setTopAndBottomOffset(i4);
        }

        @Override // com.google.android.material.appbar.l
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z2) {
            super.setVerticalOffsetEnabled(z2);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.a.fuchsia);
            setOverlayTop(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.material.appbar.k
        public AppBarLayout findFirstDependency(List<View> list) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = list.get(i4);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, R.attr.appBarLayoutStyle, 2132083655), attributeSet, R.attr.appBarLayoutStyle);
        this.purple = -1;
        this.red = -1;
        this.silver = -1;
        this.white = 0;
        this.f7777k = new ArrayList();
        this.f7778l = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray golf = z.golf(context3, attributeSet, n.alpha, R.attr.appBarLayoutStyle, 2132083655, new int[0]);
        try {
            if (golf.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, golf.getResourceId(0, 0)));
            }
            golf.recycle();
            TypedArray golf2 = z.golf(context2, attributeSet, L6.a.alpha, R.attr.appBarLayoutStyle, 2132083655, new int[0]);
            this.f7772f = AbstractC2719n0.alpha(context2, golf2, 6);
            this.f7779m = q.echo(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f7780n = q.foxtrot(context2, R.attr.motionEasingStandardInterpolator, M6.a.alpha);
            if (golf2.hasValue(4)) {
                echo(golf2.getBoolean(4, false), false, false);
            }
            if (golf2.hasValue(3)) {
                n.alpha(this, golf2.getDimensionPixelSize(3, 0));
            }
            setBackground(golf2.getDrawable(0));
            if (Build.VERSION.SDK_INT >= 26) {
                if (golf2.hasValue(2)) {
                    setKeyboardNavigationCluster(golf2.getBoolean(2, false));
                }
                if (golf2.hasValue(1)) {
                    setTouchscreenBlocksFocus(golf2.getBoolean(1, false));
                }
            }
            this.f7785s = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.e = golf2.getBoolean(5, false);
            this.f7773g = golf2.getResourceId(7, -1);
            setStatusBarForeground(golf2.getDrawable(8));
            golf2.recycle();
            ah ahVar = new ah(22, this);
            WeakHashMap weakHashMap = au.alpha;
            al.lima(this, ahVar);
        } catch (Throwable th) {
            golf.recycle();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.appbar.e, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.material.appbar.e, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.material.appbar.e, android.widget.LinearLayout$LayoutParams] */
    public static e bravo(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ?? layoutParams2 = new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.alpha = 1;
            return layoutParams2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? layoutParams3 = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.alpha = 1;
            return layoutParams3;
        }
        ?? layoutParams4 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams4.alpha = 1;
        return layoutParams4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.appbar.e, android.widget.LinearLayout$LayoutParams] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final e generateLayoutParams(AttributeSet attributeSet) {
        J2.c cVar;
        Context context = getContext();
        ?? layoutParams = new LinearLayout.LayoutParams(context, attributeSet);
        layoutParams.alpha = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.a.bravo);
        layoutParams.alpha = obtainStyledAttributes.getInt(1, 0);
        if (obtainStyledAttributes.getInt(0, 0) != 1) {
            cVar = null;
        } else {
            cVar = new J2.c(28);
        }
        layoutParams.bravo = cVar;
        if (obtainStyledAttributes.hasValue(2)) {
            layoutParams.charlie = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public final void charlie() {
        BaseBehavior.SavedState savedState;
        Behavior behavior = this.f7786t;
        if (behavior != null && this.purple != -1 && this.white == 0) {
            savedState = behavior.lima(AbsSavedState.purple, this);
        } else {
            savedState = null;
        }
        this.purple = -1;
        this.red = -1;
        this.silver = -1;
        if (savedState != null) {
            Behavior behavior2 = this.f7786t;
            if (behavior2.f7790d == null) {
                behavior2.f7790d = savedState;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final void delta(int i4) {
        int i5;
        this.alpha = i4;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.f7768a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = (h) this.f7768a.get(i10);
                if (hVar != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = hVar.alpha;
                    collapsingToolbarLayout.f7811u = i4;
                    a0 a0Var = collapsingToolbarLayout.f7814x;
                    if (a0Var != null) {
                        i5 = a0Var.delta();
                    } else {
                        i5 = 0;
                    }
                    int childCount = collapsingToolbarLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = collapsingToolbarLayout.getChildAt(i11);
                        g gVar = (g) childAt.getLayoutParams();
                        m bravo = CollapsingToolbarLayout.bravo(childAt);
                        int i12 = gVar.alpha;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                bravo.bravo(Math.round((-i4) * gVar.bravo));
                            }
                        } else {
                            bravo.bravo(O6.c.bravo(-i4, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.bravo(childAt).bravo) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((g) childAt.getLayoutParams())).bottomMargin));
                        }
                    }
                    collapsingToolbarLayout.delta();
                    if (collapsingToolbarLayout.f7802l != null && i5 > 0) {
                        collapsingToolbarLayout.postInvalidateOnAnimation();
                    }
                    int height = collapsingToolbarLayout.getHeight();
                    int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - i5;
                    int scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
                    int i13 = collapsingToolbarLayout.f7811u + minimumHeight;
                    float f5 = minimumHeight;
                    float abs = Math.abs(i4) / f5;
                    float f10 = scrimVisibleHeightTrigger / f5;
                    float min = Math.min(1.0f, f10);
                    com.google.android.material.internal.b bVar = collapsingToolbarLayout.e;
                    bVar.delta = min;
                    bVar.echo = Q0.c.lima(1.0f, min, 0.5f, min);
                    bVar.foxtrot = i13;
                    bVar.amber(abs);
                    float min2 = Math.min(1.0f, f10);
                    com.google.android.material.internal.b bVar2 = collapsingToolbarLayout.f7796f;
                    bVar2.delta = min2;
                    bVar2.echo = Q0.c.lima(1.0f, min2, 0.5f, min2);
                    bVar2.foxtrot = i13;
                    bVar2.amber(abs);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f7783q != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.alpha);
            this.f7783q.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7783q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void echo(boolean z2, boolean z10, boolean z11) {
        int i4;
        int i5;
        if (z2) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        int i10 = 0;
        if (z10) {
            i5 = 4;
        } else {
            i5 = 0;
        }
        int i11 = i4 | i5;
        if (z11) {
            i10 = 8;
        }
        this.white = i11 | i10;
        requestLayout();
    }

    public final boolean foxtrot(boolean z2) {
        float f5;
        float f10;
        if (!this.f7769b && this.f7771d != z2) {
            this.f7771d = z2;
            refreshDrawableState();
            if (getBackground() instanceof g7.i) {
                float f11 = 0.0f;
                if (this.f7772f != null) {
                    if (z2) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    if (z2) {
                        f11 = 1.0f;
                    }
                    hotel(f10, f11);
                    return true;
                }
                if (this.e) {
                    float f12 = this.f7785s;
                    if (z2) {
                        f5 = 0.0f;
                    } else {
                        f5 = f12;
                    }
                    if (z2) {
                        f11 = f12;
                    }
                    hotel(f5, f11);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, com.google.android.material.appbar.e, android.widget.LinearLayout$LayoutParams] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.alpha = 1;
        return layoutParams;
    }

    @Override // androidx.coordinatorlayout.widget.b
    public androidx.coordinatorlayout.widget.c getBehavior() {
        Behavior behavior = new Behavior();
        this.f7786t = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i4;
        int minimumHeight;
        int i5 = this.red;
        if (i5 != -1) {
            return i5;
        }
        int i10 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = eVar.alpha;
                if ((i11 & 5) == 5) {
                    int i12 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    if ((i11 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i11 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i4 = i12 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i4 = Math.min(i4, measuredHeight - getTopInset());
                        }
                        i10 += i4;
                    }
                    i4 = minimumHeight + i12;
                    if (childCount == 0) {
                        i4 = Math.min(i4, measuredHeight - getTopInset());
                    }
                    i10 += i4;
                } else if (i10 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i10);
        this.red = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i4 = this.silver;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int i5 = 0;
        int i10 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin + childAt.getMeasuredHeight();
                int i11 = eVar.alpha;
                if ((i11 & 1) == 0) {
                    break;
                }
                i10 += measuredHeight;
                if ((i11 & 2) != 0) {
                    i10 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i5++;
        }
        int max = Math.max(0, i10);
        this.silver = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f7773g;
    }

    public g7.i getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof g7.i) {
            return (g7.i) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int i4;
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i5 = (minimumHeight * 2) + topInset;
            if (i5 < getHeight()) {
                return i5;
            }
            return minimumHeight + topInset;
        }
        int childCount = getChildCount();
        if (childCount >= 1) {
            i4 = getChildAt(childCount - 1).getMinimumHeight();
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            int i10 = (i4 * 2) + topInset;
            if (i10 < getHeight()) {
                return i10;
            }
            return i4 + topInset;
        }
        return getHeight() / 3;
    }

    public int getPendingAction() {
        return this.white;
    }

    public Drawable getStatusBarForeground() {
        return this.f7783q;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        a0 a0Var = this.yellow;
        if (a0Var != null) {
            return a0Var.delta();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i4 = this.purple;
        if (i4 != -1) {
            return i4;
        }
        int childCount = getChildCount();
        int i5 = 0;
        int i10 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = eVar.alpha;
                if ((i11 & 1) == 0) {
                    break;
                }
                int i12 = measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin + i10;
                if (i5 == 0 && childAt.getFitsSystemWindows()) {
                    i12 -= getTopInset();
                }
                i10 = i12;
                if ((i11 & 2) != 0) {
                    i10 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i5++;
        }
        int max = Math.max(0, i10);
        this.purple = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean golf(View view) {
        int i4;
        View view2;
        View view3 = null;
        if (this.f7774h == null && (i4 = this.f7773g) != -1) {
            if (view != null) {
                view2 = view.findViewById(i4);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f7773g);
            }
            if (view2 != null) {
                this.f7774h = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.f7774h;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null) {
            if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void hotel(float f5, float f10) {
        ValueAnimator valueAnimator = this.f7775i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f10);
        this.f7775i = ofFloat;
        ofFloat.setDuration(this.f7779m);
        this.f7775i.setInterpolator(this.f7780n);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f7776j;
        if (animatorUpdateListener != null) {
            this.f7775i.addUpdateListener(animatorUpdateListener);
        }
        this.f7775i.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        R4.echo(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        if (this.f7781o == null) {
            this.f7781o = new int[4];
        }
        int[] iArr = this.f7781o;
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + iArr.length);
        boolean z2 = this.f7770c;
        if (z2) {
            i5 = R.attr.state_liftable;
        } else {
            i5 = -2130969907;
        }
        iArr[0] = i5;
        if (z2 && this.f7771d) {
            i10 = R.attr.state_lifted;
        } else {
            i10 = -2130969908;
        }
        iArr[1] = i10;
        if (z2) {
            i11 = R.attr.state_collapsible;
        } else {
            i11 = -2130969903;
        }
        iArr[2] = i11;
        if (z2 && this.f7771d) {
            i12 = R.attr.state_collapsed;
        } else {
            i12 = -2130969902;
        }
        iArr[3] = i12;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f7774h;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f7774h = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        boolean z10 = false;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = au.alpha;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        charlie();
        this.teal = false;
        int childCount2 = getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount2) {
                break;
            }
            if (((e) getChildAt(i12).getLayoutParams()).charlie != null) {
                this.teal = true;
                break;
            }
            i12++;
        }
        Drawable drawable = this.f7783q;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f7769b) {
            if (!this.e) {
                int childCount3 = getChildCount();
                for (int i13 = 0; i13 < childCount3; i13++) {
                    int i14 = ((e) getChildAt(i13).getLayoutParams()).alpha;
                    if ((i14 & 1) != 1 || (i14 & 10) == 0) {
                    }
                }
                if (this.f7770c == z10) {
                    this.f7770c = z10;
                    refreshDrawableState();
                    return;
                }
                return;
            }
            z10 = true;
            if (this.f7770c == z10) {
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i5);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = O6.c.bravo(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i5));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        charlie();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final g7.i iVar;
        ColorStateList colorStateList;
        Context context = getContext();
        if (drawable instanceof g7.i) {
            iVar = (g7.i) drawable;
        } else {
            ColorStateList bravo = G7.bravo(drawable);
            if (bravo == null) {
                iVar = null;
            } else {
                g7.i iVar2 = new g7.i();
                iVar2.quebec(bravo);
                iVar = iVar2;
            }
        }
        if (iVar != null && (colorStateList = iVar.purple.delta) != null) {
            this.f7782p = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.f7772f;
            if (colorStateList2 != null) {
                final Integer echo = AbstractC2815x7.echo(R.attr.colorSurface, getContext());
                this.f7776j = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        int i4 = AppBarLayout.f7767u;
                        AppBarLayout appBarLayout = AppBarLayout.this;
                        int golf = AbstractC2815x7.golf(((Float) valueAnimator.getAnimatedValue()).floatValue(), appBarLayout.f7782p, colorStateList2.getDefaultColor());
                        ColorStateList valueOf = ColorStateList.valueOf(golf);
                        g7.i iVar3 = iVar;
                        iVar3.quebec(valueOf);
                        if (appBarLayout.f7783q != null && (num = appBarLayout.f7784r) != null && num.equals(echo)) {
                            appBarLayout.f7783q.setTint(golf);
                        }
                        ArrayList arrayList = appBarLayout.f7777k;
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() == null) {
                                    if (iVar3.purple.delta != null) {
                                        throw null;
                                    }
                                } else {
                                    throw new ClassCastException();
                                }
                            }
                        }
                        LinkedHashSet linkedHashSet = appBarLayout.f7778l;
                        if (!linkedHashSet.isEmpty()) {
                            Iterator it2 = linkedHashSet.iterator();
                            if (it2.hasNext()) {
                                throw ad.yankee(it2);
                            }
                        }
                    }
                };
            } else {
                iVar.mike(context);
                this.f7776j = new b7.m(1, this, iVar);
            }
            drawable = iVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        R4.charlie(this, f5);
    }

    public void setExpanded(boolean z2) {
        echo(z2, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z2) {
        this.e = z2;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f7772f != colorStateList) {
            this.f7772f = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f7773g = -1;
        if (view == null) {
            WeakReference weakReference = this.f7774h;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f7774h = null;
            return;
        }
        this.f7774h = new WeakReference(view);
    }

    public void setLiftOnScrollTargetViewId(int i4) {
        this.f7773g = i4;
        WeakReference weakReference = this.f7774h;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f7774h = null;
    }

    public void setLiftableOverrideEnabled(boolean z2) {
        this.f7769b = z2;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i4) {
        if (i4 == 1) {
            super.setOrientation(i4);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setPendingAction(int i4) {
        this.white = i4;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2;
        boolean z2;
        Drawable drawable3 = this.f7783q;
        if (drawable3 != drawable) {
            Integer num = null;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            } else {
                drawable2 = null;
            }
            this.f7783q = drawable2;
            if (drawable2 instanceof g7.i) {
                num = Integer.valueOf(((g7.i) drawable2).f12663o);
            } else {
                ColorStateList bravo = G7.bravo(drawable2);
                if (bravo != null) {
                    num = Integer.valueOf(bravo.getDefaultColor());
                }
            }
            this.f7784r = num;
            Drawable drawable4 = this.f7783q;
            boolean z10 = false;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f7783q.setState(getDrawableState());
                }
                this.f7783q.setLayoutDirection(getLayoutDirection());
                Drawable drawable5 = this.f7783q;
                if (getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawable5.setVisible(z2, false);
                this.f7783q.setCallback(this);
            }
            if (this.f7783q != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i4) {
        setStatusBarForeground(new ColorDrawable(i4));
    }

    public void setStatusBarForegroundResource(int i4) {
        setStatusBarForeground(AbstractC3032n3.echo(i4, getContext()));
    }

    @Deprecated
    public void setTargetElevation(float f5) {
        n.alpha(this, f5);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        boolean z2;
        super.setVisibility(i4);
        if (i4 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.f7783q;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f7783q) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return bravo(layoutParams);
    }

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends j {

        /* renamed from: a, reason: collision with root package name */
        public int f7787a;

        /* renamed from: b, reason: collision with root package name */
        public int f7788b;

        /* renamed from: c, reason: collision with root package name */
        public ValueAnimator f7789c;

        /* renamed from: d, reason: collision with root package name */
        public SavedState f7790d;
        public WeakReference e;

        /* loaded from: classes2.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Object();
            public boolean red;
            public boolean silver;
            public int teal;
            public float white;
            public boolean yellow;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z2;
                boolean z10;
                if (parcel.readByte() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.red = z2;
                if (parcel.readByte() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.silver = z10;
                this.teal = parcel.readInt();
                this.white = parcel.readFloat();
                this.yellow = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i4) {
                super.writeToParcel(parcel, i4);
                parcel.writeByte(this.red ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.silver ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.teal);
                parcel.writeFloat(this.white);
                parcel.writeByte(this.yellow ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.silver = -1;
            this.white = -1;
        }

        public static View hotel(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            baseBehavior.getClass();
            int childCount = coordinatorLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if (((androidx.coordinatorlayout.widget.f) childAt.getLayoutParams()).alpha instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View juliet(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if ((childAt instanceof InterfaceC2583p) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void november(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4, int i5, boolean z2) {
            View view;
            boolean z10;
            int abs = Math.abs(i4);
            int childCount = appBarLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    view = appBarLayout.getChildAt(i10);
                    if (abs >= view.getTop() && abs <= view.getBottom()) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                int i11 = ((e) view.getLayoutParams()).alpha;
                if ((i11 & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    z10 = true;
                    if (i5 > 0) {
                    }
                }
            }
            z10 = false;
            if (appBarLayout.e) {
                z10 = appBarLayout.golf(juliet(coordinatorLayout));
            }
            boolean foxtrot = appBarLayout.foxtrot(z10);
            if (!z2) {
                if (foxtrot) {
                    List<View> dependents = coordinatorLayout.getDependents(appBarLayout);
                    int size = dependents.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        androidx.coordinatorlayout.widget.c cVar = ((androidx.coordinatorlayout.widget.f) dependents.get(i12).getLayoutParams()).alpha;
                        if (cVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) cVar).getOverlayTop() == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.j
        public final int echo() {
            return getTopAndBottomOffset() + this.f7787a;
        }

        @Override // com.google.android.material.appbar.j
        public final int foxtrot(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i10) {
            int i11;
            int i12;
            int i13;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int echo = echo();
            int i14 = 0;
            if (i5 != 0 && echo >= i5 && echo <= i10) {
                int bravo = O6.c.bravo(i4, i5, i10);
                if (echo != bravo) {
                    if (appBarLayout.teal) {
                        int abs = Math.abs(bravo);
                        int childCount = appBarLayout.getChildCount();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i15);
                            e eVar = (e) childAt.getLayoutParams();
                            Interpolator interpolator = eVar.charlie;
                            if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i16 = eVar.alpha;
                                    if ((i16 & 1) != 0) {
                                        i13 = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                                        if ((i16 & 2) != 0) {
                                            i13 -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        i13 = 0;
                                    }
                                    if (childAt.getFitsSystemWindows()) {
                                        i13 -= appBarLayout.getTopInset();
                                    }
                                    if (i13 > 0) {
                                        float f5 = i13;
                                        i11 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f5) * f5)) * Integer.signum(bravo);
                                    }
                                }
                            } else {
                                i15++;
                            }
                        }
                    }
                    i11 = bravo;
                    boolean topAndBottomOffset = setTopAndBottomOffset(i11);
                    int i17 = echo - bravo;
                    this.f7787a = bravo - i11;
                    int i18 = 1;
                    if (topAndBottomOffset) {
                        int i19 = 0;
                        while (i19 < appBarLayout.getChildCount()) {
                            e eVar2 = (e) appBarLayout.getChildAt(i19).getLayoutParams();
                            J2.c cVar = eVar2.bravo;
                            if (cVar != null && (eVar2.alpha & i18) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i19);
                                float topAndBottomOffset2 = getTopAndBottomOffset();
                                Rect rect = (Rect) cVar.purple;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = rect.top - Math.abs(topAndBottomOffset2);
                                if (abs2 <= 0.0f) {
                                    float alpha = 1.0f - O6.c.alpha(Math.abs(abs2 / rect.height()), 0.0f, 1.0f);
                                    float height = (-abs2) - ((rect.height() * 0.3f) * (1.0f - (alpha * alpha)));
                                    childAt2.setTranslationY(height);
                                    Rect rect2 = (Rect) cVar.red;
                                    childAt2.getDrawingRect(rect2);
                                    rect2.offset(0, (int) (-height));
                                    if (height >= rect2.height()) {
                                        childAt2.setAlpha(0.0f);
                                    } else {
                                        childAt2.setAlpha(1.0f);
                                    }
                                    childAt2.setClipBounds(rect2);
                                } else {
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setAlpha(1.0f);
                                }
                            }
                            i19++;
                            i18 = 1;
                        }
                    }
                    if (!topAndBottomOffset && appBarLayout.teal) {
                        coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.delta(getTopAndBottomOffset());
                    if (bravo < echo) {
                        i12 = -1;
                    } else {
                        i12 = 1;
                    }
                    november(coordinatorLayout, appBarLayout, bravo, i12, false);
                    i14 = i17;
                }
            } else {
                this.f7787a = 0;
            }
            if (au.delta(coordinatorLayout) != null) {
                return i14;
            }
            au.november(coordinatorLayout, new c(coordinatorLayout, this, appBarLayout));
            return i14;
        }

        public final void india(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4) {
            int height;
            int abs = Math.abs(echo() - i4);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int echo = echo();
            if (echo == i4) {
                ValueAnimator valueAnimator = this.f7789c;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f7789c.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f7789c;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f7789c = valueAnimator3;
                valueAnimator3.setInterpolator(M6.a.echo);
                this.f7789c.addUpdateListener(new b(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f7789c.setDuration(Math.min(height, 600));
            this.f7789c.setIntValues(echo, i4);
            this.f7789c.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void kilo(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i5;
            int i10;
            if (i4 != 0) {
                if (i4 < 0) {
                    i5 = -appBarLayout.getTotalScrollRange();
                    i10 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i5 = -appBarLayout.getUpNestedPreScrollRange();
                    i10 = 0;
                }
                int i11 = i5;
                int i12 = i10;
                if (i11 != i12) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = foxtrot(coordinatorLayout, appBarLayout2, echo() - i4, i11, i12);
                    if (!appBarLayout2.e) {
                        appBarLayout2.foxtrot(appBarLayout2.golf(view));
                        return;
                    }
                    return;
                }
            }
            appBarLayout2 = appBarLayout;
            if (!appBarLayout2.e) {
            }
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState, androidx.customview.view.AbsSavedState] */
        public final SavedState lima(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z2;
            boolean z10;
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = appBarLayout.getChildCount();
            boolean z11 = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = appBarLayout.getChildAt(i4);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.purple;
                    }
                    ?? absSavedState = new AbsSavedState(parcelable);
                    if (topAndBottomOffset == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    absSavedState.silver = z2;
                    if (!z2 && (-topAndBottomOffset) >= appBarLayout.getTotalScrollRange()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    absSavedState.red = z10;
                    absSavedState.teal = i4;
                    if (bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight()) {
                        z11 = true;
                    }
                    absSavedState.yellow = z11;
                    absSavedState.white = bottom / childAt.getHeight();
                    return absSavedState;
                }
            }
            return null;
        }

        public final void mike(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int echo = echo() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 < childCount) {
                    View childAt = appBarLayout.getChildAt(i4);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    e eVar = (e) childAt.getLayoutParams();
                    if ((eVar.alpha & 32) == 32) {
                        top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                        bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    int i5 = -echo;
                    if (top <= i5 && bottom >= i5) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i4);
                e eVar2 = (e) childAt2.getLayoutParams();
                int i10 = eVar2.alpha;
                if ((i10 & 17) == 17) {
                    int i11 = -childAt2.getTop();
                    int i12 = -childAt2.getBottom();
                    if (i4 == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        i11 -= appBarLayout.getTopInset();
                    }
                    if ((i10 & 2) == 2) {
                        i12 += childAt2.getMinimumHeight();
                    } else if ((i10 & 5) == 5) {
                        int minimumHeight = childAt2.getMinimumHeight() + i12;
                        if (echo < minimumHeight) {
                            i11 = minimumHeight;
                        } else {
                            i12 = minimumHeight;
                        }
                    }
                    if ((i10 & 32) == 32) {
                        i11 += ((LinearLayout.LayoutParams) eVar2).topMargin;
                        i12 -= ((LinearLayout.LayoutParams) eVar2).bottomMargin;
                    }
                    if (echo < (i12 + i11) / 2) {
                        i11 = i12;
                    }
                    india(coordinatorLayout, appBarLayout, O6.c.bravo(i11 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // com.google.android.material.appbar.l, androidx.coordinatorlayout.widget.c
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
            boolean z2;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i4);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f7790d;
            if (savedState != null && (pendingAction & 8) == 0) {
                if (savedState.red) {
                    golf(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
                } else if (savedState.silver) {
                    golf(coordinatorLayout, appBarLayout, 0);
                } else {
                    View childAt = appBarLayout.getChildAt(savedState.teal);
                    int i5 = -childAt.getBottom();
                    if (this.f7790d.yellow) {
                        round = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i5;
                    } else {
                        round = Math.round(childAt.getHeight() * this.f7790d.white) + i5;
                    }
                    golf(coordinatorLayout, appBarLayout, round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i10 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z2) {
                        india(coordinatorLayout, appBarLayout, i10);
                    } else {
                        golf(coordinatorLayout, appBarLayout, i10);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z2) {
                        india(coordinatorLayout, appBarLayout, 0);
                    } else {
                        golf(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.white = 0;
            this.f7790d = null;
            setTopAndBottomOffset(O6.c.bravo(getTopAndBottomOffset(), -appBarLayout.getTotalScrollRange(), 0));
            november(coordinatorLayout, appBarLayout, getTopAndBottomOffset(), 0, true);
            appBarLayout.delta(getTopAndBottomOffset());
            if (au.delta(coordinatorLayout) != null) {
                return true;
            }
            au.november(coordinatorLayout, new c(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.c
        public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i10, int i11) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((androidx.coordinatorlayout.widget.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.onMeasureChild(appBarLayout, i4, i5, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.c
        public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i10) {
            kilo(coordinatorLayout, (AppBarLayout) view, view2, i5, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.c
        public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i10, int i11, int i12, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i11 < 0) {
                int i13 = -appBarLayout.getDownNestedScrollRange();
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = foxtrot(coordinatorLayout2, appBarLayout, echo() - i11, i13, 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i11 == 0 && au.delta(coordinatorLayout2) == null) {
                au.november(coordinatorLayout2, new c(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // androidx.coordinatorlayout.widget.c
        public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                this.f7790d = savedState;
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, savedState.alpha);
            } else {
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
                this.f7790d = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.c
        public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            SavedState lima = lima(onSaveInstanceState, appBarLayout);
            if (lima == null) {
                return onSaveInstanceState;
            }
            return lima;
        }

        @Override // androidx.coordinatorlayout.widget.c
        public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
            boolean z2;
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i4 & 2) != 0 && (appBarLayout.e || appBarLayout.f7771d || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (valueAnimator = this.f7789c) != null) {
                valueAnimator.cancel();
            }
            this.e = null;
            this.f7788b = i5;
            return z2;
        }

        @Override // androidx.coordinatorlayout.widget.c
        public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f7788b == 0 || i4 == 1) {
                mike(coordinatorLayout, appBarLayout);
                if (appBarLayout.e) {
                    appBarLayout.foxtrot(appBarLayout.golf(view2));
                }
            }
            this.e = new WeakReference(view2);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.silver = -1;
            this.white = -1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.appbar.e, android.widget.LinearLayout$LayoutParams] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.alpha = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return bravo(layoutParams);
    }
}
