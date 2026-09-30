package com.google.android.material.tabs;

import Qc.i;
import W0.d;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0460i0;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.a;
import androidx.viewpager.widget.c;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.gms.measurement.internal.C1469t;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import g.C1718a;
import g1.AbstractC1735d;
import java.util.ArrayList;
import java.util.Iterator;
import k7.C2016a;
import k7.C2017b;
import k7.InterfaceC2018c;
import k7.f;
import k7.g;
import k7.h;
import k7.j;
import l7.AbstractC2059a;
import r1.C2486e;
import s6.AbstractC2710m0;
import s6.AbstractC2719n0;
import s6.G7;
import s6.R4;
import t6.AbstractC3032n3;
import x2.q;

@c
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: P, reason: collision with root package name */
    public static final C2486e f8120P = new C2486e(16);
    public boolean A;
    public C1469t B;
    public final TimeInterpolator C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC2018c f8121D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f8122E;

    /* renamed from: F, reason: collision with root package name */
    public i f8123F;

    /* renamed from: G, reason: collision with root package name */
    public ValueAnimator f8124G;

    /* renamed from: H, reason: collision with root package name */
    public ViewPager f8125H;

    /* renamed from: I, reason: collision with root package name */
    public a f8126I;

    /* renamed from: J, reason: collision with root package name */
    public C0460i0 f8127J;

    /* renamed from: K, reason: collision with root package name */
    public h f8128K;

    /* renamed from: L, reason: collision with root package name */
    public C2017b f8129L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f8130M;

    /* renamed from: N, reason: collision with root package name */
    public int f8131N;

    /* renamed from: O, reason: collision with root package name */
    public final d f8132O;

    /* renamed from: a, reason: collision with root package name */
    public final int f8133a;
    public int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final int f8134b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8135c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8136d;
    public ColorStateList e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f8137f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f8138g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f8139h;

    /* renamed from: i, reason: collision with root package name */
    public int f8140i;

    /* renamed from: j, reason: collision with root package name */
    public final float f8141j;

    /* renamed from: k, reason: collision with root package name */
    public final float f8142k;

    /* renamed from: l, reason: collision with root package name */
    public final float f8143l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8144m;

    /* renamed from: n, reason: collision with root package name */
    public int f8145n;

    /* renamed from: o, reason: collision with root package name */
    public final int f8146o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8147p;
    public final ArrayList purple;

    /* renamed from: q, reason: collision with root package name */
    public final int f8148q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8149r;
    public g red;

    /* renamed from: s, reason: collision with root package name */
    public int f8150s;
    public final f silver;

    /* renamed from: t, reason: collision with root package name */
    public final int f8151t;
    public final int teal;

    /* renamed from: u, reason: collision with root package name */
    public int f8152u;

    /* renamed from: v, reason: collision with root package name */
    public int f8153v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8154w;
    public final int white;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8155x;

    /* renamed from: y, reason: collision with root package name */
    public int f8156y;
    public final int yellow;

    /* renamed from: z, reason: collision with root package name */
    public int f8157z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, R.attr.tabStyle, 2132083663), attributeSet, R.attr.tabStyle);
        this.alpha = -1;
        this.purple = new ArrayList();
        this.f8136d = -1;
        this.f8140i = 0;
        this.f8145n = LottieConstants.IterateForever;
        this.f8156y = -1;
        this.f8122E = new ArrayList();
        this.f8132O = new d(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(this, context2);
        this.silver = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray golf = z.golf(context2, attributeSet, L6.a.jade, R.attr.tabStyle, 2132083663, 24);
        ColorStateList bravo = G7.bravo(getBackground());
        if (bravo != null) {
            g7.i iVar = new g7.i();
            iVar.quebec(bravo);
            iVar.mike(context2);
            iVar.papa(getElevation());
            setBackground(iVar);
        }
        setSelectedTabIndicator(AbstractC2719n0.delta(context2, golf, 5));
        setSelectedTabIndicatorColor(golf.getColor(8, 0));
        fVar.bravo(golf.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(golf.getInt(10, 0));
        setTabIndicatorAnimationMode(golf.getInt(7, 0));
        setTabIndicatorFullWidth(golf.getBoolean(9, true));
        int dimensionPixelSize = golf.getDimensionPixelSize(16, 0);
        this.f8133a = dimensionPixelSize;
        this.yellow = dimensionPixelSize;
        this.white = dimensionPixelSize;
        this.teal = dimensionPixelSize;
        this.teal = golf.getDimensionPixelSize(19, dimensionPixelSize);
        this.white = golf.getDimensionPixelSize(20, dimensionPixelSize);
        this.yellow = golf.getDimensionPixelSize(18, dimensionPixelSize);
        this.f8133a = golf.getDimensionPixelSize(17, dimensionPixelSize);
        if (AbstractC2710m0.charlie(context2, R.attr.isMaterial3Theme, false)) {
            this.f8134b = R.attr.textAppearanceTitleSmall;
        } else {
            this.f8134b = R.attr.textAppearanceButton;
        }
        int resourceId = golf.getResourceId(24, 2132083257);
        this.f8135c = resourceId;
        int[] iArr = aj.a.xray;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            this.f8141j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.e = AbstractC2719n0.alpha(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (golf.hasValue(22)) {
                this.f8136d = golf.getResourceId(22, resourceId);
            }
            int i4 = this.f8136d;
            if (i4 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i4, iArr);
                try {
                    this.f8142k = obtainStyledAttributes.getDimensionPixelSize(0, (int) r5);
                    ColorStateList alpha = AbstractC2719n0.alpha(context2, obtainStyledAttributes, 3);
                    if (alpha != null) {
                        this.e = foxtrot(this.e.getDefaultColor(), alpha.getColorForState(new int[]{android.R.attr.state_selected}, alpha.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (golf.hasValue(25)) {
                this.e = AbstractC2719n0.alpha(context2, golf, 25);
            }
            if (golf.hasValue(23)) {
                this.e = foxtrot(this.e.getDefaultColor(), golf.getColor(23, 0));
            }
            this.f8137f = AbstractC2719n0.alpha(context2, golf, 3);
            z.hotel(golf.getInt(4, -1), null);
            this.f8138g = AbstractC2719n0.alpha(context2, golf, 21);
            this.f8151t = golf.getInt(6, 300);
            this.C = q.foxtrot(context2, R.attr.motionEasingEmphasizedInterpolator, M6.a.bravo);
            this.f8146o = golf.getDimensionPixelSize(14, -1);
            this.f8147p = golf.getDimensionPixelSize(13, -1);
            this.f8144m = golf.getResourceId(0, 0);
            this.f8149r = golf.getDimensionPixelSize(1, 0);
            this.f8153v = golf.getInt(15, 1);
            this.f8150s = golf.getInt(2, 0);
            this.f8154w = golf.getBoolean(12, false);
            this.A = golf.getBoolean(26, false);
            golf.recycle();
            Resources resources = getResources();
            this.f8143l = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f8148q = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            delta();
        } finally {
        }
    }

    public static ColorStateList foxtrot(int i4, int i5) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i5, i4});
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.purple;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i4 = this.f8146o;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f8153v;
        if (i5 != 0 && i5 != 2) {
            return 0;
        }
        return this.f8148q;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.silver.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i4) {
        boolean z2;
        boolean z10;
        f fVar = this.silver;
        int childCount = fVar.getChildCount();
        if (i4 < childCount) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = fVar.getChildAt(i5);
                boolean z11 = true;
                if ((i5 == i4 && !childAt.isSelected()) || (i5 != i4 && childAt.isSelected())) {
                    if (i5 == i4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                    if (i5 != i4) {
                        z11 = false;
                    }
                    childAt.setActivated(z11);
                    if (childAt instanceof j) {
                        ((j) childAt).foxtrot();
                    }
                } else {
                    if (i5 == i4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    childAt.setSelected(z2);
                    if (i5 != i4) {
                        z11 = false;
                    }
                    childAt.setActivated(z11);
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void alpha(InterfaceC2018c interfaceC2018c) {
        ArrayList arrayList = this.f8122E;
        if (!arrayList.contains(interfaceC2018c)) {
            arrayList.add(interfaceC2018c);
        }
    }

    public final void bravo(g gVar, boolean z2) {
        ArrayList arrayList = this.purple;
        int size = arrayList.size();
        if (gVar.delta == this) {
            gVar.bravo = size;
            arrayList.add(size, gVar);
            int size2 = arrayList.size();
            int i4 = -1;
            for (int i5 = size + 1; i5 < size2; i5++) {
                if (((g) arrayList.get(i5)).bravo == this.alpha) {
                    i4 = i5;
                }
                ((g) arrayList.get(i5)).bravo = i5;
            }
            this.alpha = i4;
            j jVar = gVar.echo;
            jVar.setSelected(false);
            jVar.setActivated(false);
            int i10 = gVar.bravo;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.f8153v == 1 && this.f8150s == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            this.silver.addView(jVar, i10, layoutParams);
            if (z2) {
                gVar.alpha();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void charlie(int i4) {
        if (i4 == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            f fVar = this.silver;
            int childCount = fVar.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                if (fVar.getChildAt(i5).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int echo = echo(0.0f, i4);
            if (scrollX != echo) {
                golf();
                this.f8124G.setIntValues(scrollX, echo);
                this.f8124G.start();
            }
            ValueAnimator valueAnimator = fVar.alpha;
            if (valueAnimator != null && valueAnimator.isRunning() && fVar.purple.alpha != i4) {
                fVar.alpha.cancel();
            }
            fVar.delta(i4, this.f8151t, true);
            return;
        }
        november(i4, 0.0f, true, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void delta() {
        int max;
        int i4 = this.f8153v;
        if (i4 != 0 && i4 != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.f8149r - this.teal);
        }
        f fVar = this.silver;
        fVar.setPaddingRelative(max, 0, 0, 0);
        int i5 = this.f8153v;
        if (i5 != 0) {
            if (i5 == 1 || i5 == 2) {
                if (this.f8150s == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                fVar.setGravity(1);
            }
        } else {
            int i10 = this.f8150s;
            if (i10 != 0) {
                if (i10 == 1) {
                    fVar.setGravity(1);
                }
            } else {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            }
            fVar.setGravity(8388611);
        }
        papa(true);
    }

    public final int echo(float f5, int i4) {
        f fVar;
        View childAt;
        View view;
        int i5 = this.f8153v;
        int i10 = 0;
        if ((i5 != 0 && i5 != 2) || (childAt = (fVar = this.silver).getChildAt(i4)) == null) {
            return 0;
        }
        int i11 = i4 + 1;
        if (i11 < fVar.getChildCount()) {
            view = fVar.getChildAt(i11);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i10 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i12 = (int) ((width + i10) * 0.5f * f5);
        if (getLayoutDirection() == 0) {
            return left + i12;
        }
        return left - i12;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.red;
        if (gVar != null) {
            return gVar.bravo;
        }
        return -1;
    }

    public int getTabCount() {
        return this.purple.size();
    }

    public int getTabGravity() {
        return this.f8150s;
    }

    public ColorStateList getTabIconTint() {
        return this.f8137f;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f8157z;
    }

    public int getTabIndicatorGravity() {
        return this.f8152u;
    }

    public int getTabMaxWidth() {
        return this.f8145n;
    }

    public int getTabMode() {
        return this.f8153v;
    }

    public ColorStateList getTabRippleColor() {
        return this.f8138g;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f8139h;
    }

    public ColorStateList getTabTextColors() {
        return this.e;
    }

    public final void golf() {
        if (this.f8124G == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f8124G = valueAnimator;
            valueAnimator.setInterpolator(this.C);
            this.f8124G.setDuration(this.f8151t);
            this.f8124G.addUpdateListener(new com.google.android.material.appbar.f(2, this));
        }
    }

    public final g hotel(int i4) {
        if (i4 >= 0 && i4 < getTabCount()) {
            return (g) this.purple.get(i4);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [k7.g, java.lang.Object] */
    public final g india() {
        j jVar;
        g gVar = (g) f8120P.charlie();
        g gVar2 = gVar;
        if (gVar == null) {
            ?? obj = new Object();
            obj.bravo = -1;
            gVar2 = obj;
        }
        gVar2.delta = this;
        d dVar = this.f8132O;
        if (dVar != null) {
            jVar = (j) dVar.charlie();
        } else {
            jVar = null;
        }
        if (jVar == null) {
            jVar = new j(this, getContext());
        }
        jVar.setTab(gVar2);
        jVar.setFocusable(true);
        jVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            jVar.setContentDescription(gVar2.alpha);
        } else {
            jVar.setContentDescription(null);
        }
        gVar2.echo = jVar;
        return gVar2;
    }

    public final void juliet() {
        int currentItem;
        kilo();
        a aVar = this.f8126I;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i4 = 0; i4 < count; i4++) {
                g india = india();
                CharSequence pageTitle = this.f8126I.getPageTitle(i4);
                if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(pageTitle)) {
                    india.echo.setContentDescription(pageTitle);
                }
                india.alpha = pageTitle;
                j jVar = india.echo;
                if (jVar != null) {
                    jVar.delta();
                }
                bravo(india, false);
            }
            ViewPager viewPager = this.f8125H;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                lima(hotel(currentItem), true);
            }
        }
    }

    public final void kilo() {
        f fVar = this.silver;
        int childCount = fVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            j jVar = (j) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (jVar != null) {
                jVar.setTab(null);
                jVar.setSelected(false);
                this.f8132O.alpha(jVar);
            }
            requestLayout();
        }
        Iterator it = this.purple.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            gVar.delta = null;
            gVar.echo = null;
            gVar.alpha = null;
            gVar.bravo = -1;
            gVar.charlie = null;
            f8120P.alpha(gVar);
        }
        this.red = null;
    }

    public final void lima(g gVar, boolean z2) {
        int i4;
        TabLayout tabLayout;
        g gVar2 = this.red;
        ArrayList arrayList = this.f8122E;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((InterfaceC2018c) arrayList.get(size)).alpha(gVar);
                }
                charlie(gVar.bravo);
                return;
            }
            return;
        }
        if (gVar != null) {
            i4 = gVar.bravo;
        } else {
            i4 = -1;
        }
        if (z2) {
            if ((gVar2 != null && gVar2.bravo != -1) || i4 == -1) {
                tabLayout = this;
                charlie(i4);
            } else {
                tabLayout = this;
                tabLayout.november(i4, 0.0f, true, true, true);
            }
            if (i4 != -1) {
                setSelectedTabView(i4);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.red = gVar;
        if (gVar2 != null && gVar2.delta != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC2018c) arrayList.get(size2)).charlie(gVar2);
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC2018c) arrayList.get(size3)).bravo(gVar);
            }
        }
    }

    public final void mike(a aVar, boolean z2) {
        C0460i0 c0460i0;
        a aVar2 = this.f8126I;
        if (aVar2 != null && (c0460i0 = this.f8127J) != null) {
            aVar2.unregisterDataSetObserver(c0460i0);
        }
        this.f8126I = aVar;
        if (z2 && aVar != null) {
            if (this.f8127J == null) {
                this.f8127J = new C0460i0(1, this);
            }
            aVar.registerDataSetObserver(this.f8127J);
        }
        juliet();
    }

    public final void november(int i4, float f5, boolean z2, boolean z10, boolean z11) {
        boolean z12;
        float f10 = i4 + f5;
        int round = Math.round(f10);
        if (round >= 0) {
            f fVar = this.silver;
            if (round < fVar.getChildCount()) {
                if (z10) {
                    fVar.purple.alpha = Math.round(f10);
                    ValueAnimator valueAnimator = fVar.alpha;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        fVar.alpha.cancel();
                    }
                    fVar.charlie(fVar.getChildAt(i4), fVar.getChildAt(i4 + 1), f5);
                }
                ValueAnimator valueAnimator2 = this.f8124G;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.f8124G.cancel();
                }
                int echo = echo(f5, i4);
                int scrollX = getScrollX();
                if ((i4 < getSelectedTabPosition() && echo >= scrollX) || ((i4 > getSelectedTabPosition() && echo <= scrollX) || i4 == getSelectedTabPosition())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (getLayoutDirection() == 1) {
                    if ((i4 < getSelectedTabPosition() && echo <= scrollX) || ((i4 > getSelectedTabPosition() && echo >= scrollX) || i4 == getSelectedTabPosition())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (z12 || this.f8131N == 1 || z11) {
                    if (i4 < 0) {
                        echo = 0;
                    }
                    scrollTo(echo, 0);
                }
                if (z2) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        R4.echo(this);
        if (this.f8125H == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                oscar((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f8130M) {
            setupWithViewPager(null);
            this.f8130M = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j jVar;
        Drawable drawable;
        int i4 = 0;
        while (true) {
            f fVar = this.silver;
            if (i4 < fVar.getChildCount()) {
                View childAt = fVar.getChildAt(i4);
                if ((childAt instanceof j) && (drawable = (jVar = (j) childAt).f12924b) != null) {
                    drawable.setBounds(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
                    jVar.f12924b.draw(canvas);
                }
                i4++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1718a.zulu(1, getTabCount(), 1).purple);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int round = Math.round(z.delta(getDefaultHeight(), getContext()));
        int mode = View.MeasureSpec.getMode(i5);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i5 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i5) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i4);
        if (View.MeasureSpec.getMode(i4) != 0) {
            int i10 = this.f8147p;
            if (i10 <= 0) {
                i10 = (int) (size - z.delta(56, getContext()));
            }
            this.f8145n = i10;
        }
        super.onMeasure(i4, i5);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i11 = this.f8153v;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void oscar(ViewPager viewPager, boolean z2) {
        TabLayout tabLayout;
        ViewPager viewPager2 = this.f8125H;
        if (viewPager2 != null) {
            h hVar = this.f8128K;
            if (hVar != null) {
                viewPager2.removeOnPageChangeListener(hVar);
            }
            C2017b c2017b = this.f8129L;
            if (c2017b != null) {
                this.f8125H.removeOnAdapterChangeListener(c2017b);
            }
        }
        i iVar = this.f8123F;
        if (iVar != null) {
            this.f8122E.remove(iVar);
            this.f8123F = null;
        }
        if (viewPager != null) {
            this.f8125H = viewPager;
            if (this.f8128K == null) {
                this.f8128K = new h(this);
            }
            h hVar2 = this.f8128K;
            hVar2.charlie = 0;
            hVar2.bravo = 0;
            viewPager.addOnPageChangeListener(hVar2);
            i iVar2 = new i(1, viewPager);
            this.f8123F = iVar2;
            alpha(iVar2);
            a adapter = viewPager.getAdapter();
            if (adapter != null) {
                mike(adapter, true);
            }
            if (this.f8129L == null) {
                this.f8129L = new C2017b(this);
            }
            C2017b c2017b2 = this.f8129L;
            c2017b2.alpha = true;
            viewPager.addOnAdapterChangeListener(c2017b2);
            tabLayout = this;
            tabLayout.november(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            tabLayout = this;
            tabLayout.f8125H = null;
            mike(null, false);
        }
        tabLayout.f8130M = z2;
    }

    public final void papa(boolean z2) {
        int i4 = 0;
        while (true) {
            f fVar = this.silver;
            if (i4 < fVar.getChildCount()) {
                View childAt = fVar.getChildAt(i4);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.f8153v == 1 && this.f8150s == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                if (z2) {
                    childAt.requestLayout();
                }
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        R4.charlie(this, f5);
    }

    public void setInlineLabel(boolean z2) {
        if (this.f8154w != z2) {
            this.f8154w = z2;
            int i4 = 0;
            while (true) {
                f fVar = this.silver;
                if (i4 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i4);
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        jVar.setOrientation(!jVar.f12926d.f8154w ? 1 : 0);
                        TextView textView = jVar.yellow;
                        if (textView == null && jVar.f12923a == null) {
                            jVar.golf(jVar.purple, jVar.red, true);
                        } else {
                            jVar.golf(textView, jVar.f12923a, false);
                        }
                    }
                    i4++;
                } else {
                    delta();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i4) {
        setInlineLabel(getResources().getBoolean(i4));
    }

    @Deprecated
    public void setOnTabSelectedListener(k7.d dVar) {
        setOnTabSelectedListener((InterfaceC2018c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        golf();
        this.f8124G.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.f8139h = mutate;
        int i4 = this.f8140i;
        if (i4 != 0) {
            mutate.setTint(i4);
        } else {
            mutate.setTintList(null);
        }
        int i5 = this.f8156y;
        if (i5 == -1) {
            i5 = this.f8139h.getIntrinsicHeight();
        }
        this.silver.bravo(i5);
    }

    public void setSelectedTabIndicatorColor(int i4) {
        this.f8140i = i4;
        Drawable drawable = this.f8139h;
        if (i4 != 0) {
            drawable.setTint(i4);
        } else {
            drawable.setTintList(null);
        }
        papa(false);
    }

    public void setSelectedTabIndicatorGravity(int i4) {
        if (this.f8152u != i4) {
            this.f8152u = i4;
            this.silver.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i4) {
        this.f8156y = i4;
        this.silver.bravo(i4);
    }

    public void setTabGravity(int i4) {
        if (this.f8150s != i4) {
            this.f8150s = i4;
            delta();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f8137f != colorStateList) {
            this.f8137f = colorStateList;
            ArrayList arrayList = this.purple;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar = ((g) arrayList.get(i4)).echo;
                if (jVar != null) {
                    jVar.delta();
                }
            }
        }
    }

    public void setTabIconTintResource(int i4) {
        setTabIconTint(AbstractC1735d.charlie(i4, getContext()));
    }

    public void setTabIndicatorAnimationMode(int i4) {
        this.f8157z = i4;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    this.B = new C2016a(1);
                    return;
                }
                throw new IllegalArgumentException(i4 + " is not a valid TabIndicatorAnimationMode");
            }
            this.B = new C2016a(0);
            return;
        }
        this.B = new C1469t(11);
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.f8155x = z2;
        int i4 = f.red;
        f fVar = this.silver;
        fVar.alpha(fVar.purple.getSelectedTabPosition());
        fVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i4) {
        if (i4 != this.f8153v) {
            this.f8153v = i4;
            delta();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f8138g != colorStateList) {
            this.f8138g = colorStateList;
            int i4 = 0;
            while (true) {
                f fVar = this.silver;
                if (i4 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i4);
                    if (childAt instanceof j) {
                        Context context = getContext();
                        int i5 = j.e;
                        ((j) childAt).echo(context);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i4) {
        setTabRippleColor(AbstractC1735d.charlie(i4, getContext()));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            ArrayList arrayList = this.purple;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar = ((g) arrayList.get(i4)).echo;
                if (jVar != null) {
                    jVar.delta();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(a aVar) {
        mike(aVar, false);
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.A != z2) {
            this.A = z2;
            int i4 = 0;
            while (true) {
                f fVar = this.silver;
                if (i4 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i4);
                    if (childAt instanceof j) {
                        Context context = getContext();
                        int i5 = j.e;
                        ((j) childAt).echo(context);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i4) {
        setUnboundedRipple(getResources().getBoolean(i4));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        oscar(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i4) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC2018c interfaceC2018c) {
        InterfaceC2018c interfaceC2018c2 = this.f8121D;
        if (interfaceC2018c2 != null) {
            this.f8122E.remove(interfaceC2018c2);
        }
        this.f8121D = interfaceC2018c;
        if (interfaceC2018c != null) {
            alpha(interfaceC2018c);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i4) {
        if (i4 != 0) {
            setSelectedTabIndicator(AbstractC3032n3.echo(i4, getContext()));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
