package T0;

import B2.ap;
import C1.av;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.C0584p;
import androidx.compose.runtime.InterfaceC0578j;
import androidx.lifecycle.T;
import androidx.lifecycle.al;
import androidx.recyclerview.widget.RecyclerView;
import delivery.samurai.android.R;
import j1.C1929c;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l0.C2047d;
import l0.C2050g;
import m0.x;
import o2.InterfaceC2196f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.AbstractC2264a;
import q0.AbstractC2375K;
import s0.AbstractC2557q;
import s0.C2563x;
import s0.W;
import s0.X;
import s0.Y;
import s1.C2586t;
import s1.InterfaceC2585s;
import s1.InterfaceC2587u;
import s1.a0;
import s1.au;
import s6.AbstractC2609a7;
import s6.AbstractC2645e7;
import s6.J4;
import s6.Y6;
import t0.C2946x;
import t0.P0;
import vf.ad;

/* loaded from: classes3.dex */
public abstract class j extends ViewGroup implements InterfaceC2585s, InterfaceC0578j, X, InterfaceC2587u {

    /* renamed from: s, reason: collision with root package name */
    public static final b f2066s = b.purple;

    /* renamed from: a, reason: collision with root package name */
    public T.s f2067a;
    public final C2047d alpha;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f2068b;

    /* renamed from: c, reason: collision with root package name */
    public Q0.d f2069c;

    /* renamed from: d, reason: collision with root package name */
    public Function1 f2070d;
    public al e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2196f f2071f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2072g;

    /* renamed from: h, reason: collision with root package name */
    public long f2073h;

    /* renamed from: i, reason: collision with root package name */
    public a0 f2074i;

    /* renamed from: j, reason: collision with root package name */
    public final i f2075j;

    /* renamed from: k, reason: collision with root package name */
    public final i f2076k;

    /* renamed from: l, reason: collision with root package name */
    public Function1 f2077l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f2078m;

    /* renamed from: n, reason: collision with root package name */
    public int f2079n;

    /* renamed from: o, reason: collision with root package name */
    public int f2080o;

    /* renamed from: p, reason: collision with root package name */
    public final C2586t f2081p;
    public final View purple;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2082q;

    /* renamed from: r, reason: collision with root package name */
    public final s0.al f2083r;
    public final W red;
    public Function0 silver;
    public boolean teal;
    public Function0 white;
    public Function0 yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v8, types: [s1.t, java.lang.Object] */
    public j(Context context, C0584p c0584p, int i4, C2047d c2047d, View view, W w4) {
        super(context);
        int i5 = 3;
        int i10 = 2;
        int i11 = 0;
        this.alpha = c2047d;
        this.purple = view;
        this.red = w4;
        LinkedHashMap linkedHashMap = P0.alpha;
        setTag(R.id.androidx_compose_ui_view_composition_context, c0584p);
        setSaveFromParentEnabled(false);
        addView(view);
        t tVar = (t) this;
        au.papa(this, new a(tVar, i11));
        s1.al.lima(this, this);
        this.silver = h.silver;
        this.white = h.red;
        this.yellow = h.purple;
        T.p pVar = T.p.alpha;
        this.f2067a = pVar;
        this.f2069c = Y6.alpha();
        this.f2072g = new int[2];
        this.f2073h = 0L;
        this.f2075j = new i(tVar, 1);
        this.f2076k = new i(tVar, i11);
        this.f2078m = new int[2];
        this.f2079n = RecyclerView.UNDEFINED_DURATION;
        this.f2080o = RecyclerView.UNDEFINED_DURATION;
        this.f2081p = new Object();
        s0.al alVar = new s0.al(3);
        alVar.f13288g = tVar;
        T.s bravo = A0.o.bravo(androidx.compose.ui.input.nestedscroll.a.alpha(pVar, l.alpha, c2047d), true, b.silver);
        x xVar = new x();
        xVar.alpha = new d(tVar, 1);
        Lb.W w10 = new Lb.W();
        Lb.W w11 = xVar.purple;
        if (w11 != null) {
            w11.purple = null;
        }
        xVar.purple = w10;
        w10.purple = xVar;
        setOnRequestDisallowInterceptTouchEvent$ui_release(w10);
        T.s delta = androidx.compose.ui.layout.a.delta(androidx.compose.ui.draw.a.alpha(bravo.then(xVar), new av(tVar, alVar, tVar, i5)), new c(tVar, alVar, i10));
        alVar.teal(this.f2067a.then(delta));
        this.f2068b = new ap(12, alVar, delta);
        alVar.plum(this.f2069c);
        this.f2070d = new A0.p(18, alVar);
        alVar.f13278E = new c(tVar, alVar, i11);
        alVar.f13279F = new d(tVar, 0);
        alVar.silver(new e(i11, tVar, alVar));
        this.f2083r = alVar;
    }

    public static final int delta(t tVar, int i4, int i5, int i10) {
        if (i10 < 0 && i4 != i5) {
            if (i10 == -2 && i5 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i5, RecyclerView.UNDEFINED_DURATION);
            }
            if (i10 == -1 && i5 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(J4.delta(i10, i4, i5), 1073741824);
    }

    public static C1929c echo(C1929c c1929c, int i4, int i5, int i10, int i11) {
        int i12 = c1929c.alpha - i4;
        int i13 = 0;
        if (i12 < 0) {
            i12 = 0;
        }
        int i14 = c1929c.bravo - i5;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = c1929c.charlie - i10;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = c1929c.delta - i11;
        if (i16 >= 0) {
            i13 = i16;
        }
        return C1929c.bravo(i12, i14, i15, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC2264a.bravo("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((C2946x) this.red).getSnapshotObserver();
    }

    @Override // androidx.compose.runtime.InterfaceC0578j
    public final void alpha() {
        this.yellow.invoke();
    }

    @Override // androidx.compose.runtime.InterfaceC0578j
    public final void bravo() {
        this.white.invoke();
        removeAllViewsInLayout();
    }

    public final a0 foxtrot(a0 a0Var) {
        s1.X x4 = a0Var.alpha;
        C1929c golf = x4.golf(-1);
        C1929c c1929c = C1929c.echo;
        if (golf.equals(c1929c) && x4.hotel(-9).equals(c1929c) && x4.foxtrot() == null) {
            return a0Var;
        }
        C2563x c2563x = (C2563x) this.f2083r.f13305x.echo;
        if (c2563x.india()) {
            long charlie = AbstractC2609a7.charlie(c2563x.gray(0L));
            int i4 = (int) (charlie >> 32);
            int i5 = 0;
            if (i4 < 0) {
                i4 = 0;
            }
            int i10 = (int) (charlie & 4294967295L);
            if (i10 < 0) {
                i10 = 0;
            }
            long kilo = AbstractC2375K.hotel(c2563x).kilo();
            int i11 = (int) (kilo >> 32);
            int i12 = (int) (kilo & 4294967295L);
            long j5 = c2563x.red;
            long charlie2 = AbstractC2609a7.charlie(c2563x.gray((Float.floatToRawIntBits((int) (j5 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j5 & 4294967295L)) & 4294967295L)));
            int i13 = i11 - ((int) (charlie2 >> 32));
            if (i13 < 0) {
                i13 = 0;
            }
            int i14 = i12 - ((int) (4294967295L & charlie2));
            if (i14 >= 0) {
                i5 = i14;
            }
            if (i4 != 0 || i10 != 0 || i13 != 0 || i5 != 0) {
                return a0Var.alpha.november(i4, i10, i13, i5);
            }
        }
        return a0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f2078m;
        getLocationInWindow(iArr);
        int i4 = iArr[0];
        region.op(i4, iArr[1], getWidth() + i4, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @NotNull
    public final Q0.d getDensity() {
        return this.f2069c;
    }

    @Nullable
    public final View getInteropView() {
        return this.purple;
    }

    @NotNull
    public final s0.al getLayoutNode() {
        return this.f2083r;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.purple.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    @Nullable
    public final al getLifecycleOwner() {
        return this.e;
    }

    @NotNull
    public final T.s getModifier() {
        return this.f2067a;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C2586t c2586t = this.f2081p;
        return c2586t.bravo | c2586t.alpha;
    }

    @Nullable
    public final Function1<Q0.d, Unit> getOnDensityChanged$ui_release() {
        return this.f2070d;
    }

    @Nullable
    public final Function1<T.s, Unit> getOnModifierChanged$ui_release() {
        return this.f2068b;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f2077l;
    }

    @NotNull
    public final Function0<Unit> getRelease() {
        return this.yellow;
    }

    @NotNull
    public final Function0<Unit> getReset() {
        return this.white;
    }

    @Nullable
    public final InterfaceC2196f getSavedStateRegistryOwner() {
        return this.f2071f;
    }

    @NotNull
    public final Function0<Unit> getUpdate() {
        return this.silver;
    }

    @NotNull
    public final View getView() {
        return this.purple;
    }

    @Override // s1.InterfaceC2587u
    public final a0 gold(View view, a0 a0Var) {
        this.f2074i = new a0(a0Var);
        return foxtrot(a0Var);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (this.f2082q) {
            this.purple.postOnAnimation(new A2.q(18, this.f2076k));
            return null;
        }
        this.f2083r.beige();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.purple.isNestedScrollingEnabled();
    }

    @Override // s0.X
    public final boolean november() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2075j.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (this.f2082q) {
            this.purple.postOnAnimation(new A2.q(18, this.f2076k));
            return;
        }
        this.f2083r.beige();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().alpha.bravo(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        this.purple.layout(0, 0, i10 - i4, i11 - i5);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        View view = this.purple;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i4), View.MeasureSpec.getSize(i5));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i4, i5);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f2079n = i4;
        this.f2080o = i5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f10, boolean z2) {
        if (!this.purple.isNestedScrollingEnabled()) {
            return false;
        }
        ad.zulu(this.alpha.charlie(), null, null, new f(z2, this, AbstractC2645e7.alpha(f5 * (-1.0f), f10 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f10) {
        if (!this.purple.isNestedScrollingEnabled()) {
            return false;
        }
        ad.zulu(this.alpha.charlie(), null, null, new g(this, AbstractC2645e7.alpha(f5 * (-1.0f), f10 * (-1.0f)), null), 3);
        return false;
    }

    @Override // s1.r
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr, int i10) {
        int i11;
        long j5;
        if (!this.purple.isNestedScrollingEnabled()) {
            return;
        }
        float f5 = i4;
        float f10 = -1;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5 * f10) << 32) | (Float.floatToRawIntBits(i5 * f10) & 4294967295L);
        if (i10 == 0) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        C2050g c2050g = this.alpha.alpha;
        C2050g c2050g2 = null;
        if (c2050g != null && c2050g.isAttached()) {
            c2050g2 = (C2050g) AbstractC2557q.foxtrot(c2050g);
        }
        if (c2050g2 != null) {
            j5 = c2050g2.black(i11, floatToRawIntBits);
        } else {
            j5 = 0;
        }
        iArr[0] = t0.W.foxtrot(Float.intBitsToFloat((int) (j5 >> 32)));
        iArr[1] = t0.W.foxtrot(Float.intBitsToFloat((int) (j5 & 4294967295L)));
    }

    @Override // s1.r
    public final void onNestedScroll(View view, int i4, int i5, int i10, int i11, int i12) {
        if (this.purple.isNestedScrollingEnabled()) {
            float f5 = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i4 * f5) << 32) | (Float.floatToRawIntBits(i5 * f5) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i10 * f5) << 32) | (Float.floatToRawIntBits(i11 * f5) & 4294967295L);
            int i13 = i12 == 0 ? 1 : 2;
            C2050g c2050g = this.alpha.alpha;
            C2050g c2050g2 = null;
            if (c2050g != null && c2050g.isAttached()) {
                c2050g2 = (C2050g) AbstractC2557q.foxtrot(c2050g);
            }
            if (c2050g2 != null) {
                c2050g2.maroon(i13, floatToRawIntBits, floatToRawIntBits2);
            }
        }
    }

    @Override // s1.r
    public final void onNestedScrollAccepted(View view, View view2, int i4, int i5) {
        C2586t c2586t = this.f2081p;
        if (i5 == 1) {
            c2586t.bravo = i4;
        } else {
            c2586t.alpha = i4;
        }
    }

    @Override // s1.r
    public final boolean onStartNestedScroll(View view, View view2, int i4, int i5) {
        if ((i4 & 2) != 0 || (i4 & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // s1.r
    public final void onStopNestedScroll(View view, int i4) {
        C2586t c2586t = this.f2081p;
        if (i4 == 1) {
            c2586t.bravo = 0;
        } else {
            c2586t.alpha = 0;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        Function1 function1 = this.f2077l;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z2));
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void setDensity(@NotNull Q0.d dVar) {
        if (dVar != this.f2069c) {
            this.f2069c = dVar;
            Function1 function1 = this.f2070d;
            if (function1 != null) {
                function1.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(@Nullable al alVar) {
        if (alVar != this.e) {
            this.e = alVar;
            T.juliet(this, alVar);
        }
    }

    public final void setModifier(@NotNull T.s sVar) {
        if (sVar != this.f2067a) {
            this.f2067a = sVar;
            Function1 function1 = this.f2068b;
            if (function1 != null) {
                function1.invoke(sVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@Nullable Function1<? super Q0.d, Unit> function1) {
        this.f2070d = function1;
    }

    public final void setOnModifierChanged$ui_release(@Nullable Function1<? super T.s, Unit> function1) {
        this.f2068b = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Nullable Function1<? super Boolean, Unit> function1) {
        this.f2077l = function1;
    }

    public final void setRelease(@NotNull Function0<Unit> function0) {
        this.yellow = function0;
    }

    public final void setReset(@NotNull Function0<Unit> function0) {
        this.white = function0;
    }

    public final void setSavedStateRegistryOwner(@Nullable InterfaceC2196f interfaceC2196f) {
        if (interfaceC2196f != this.f2071f) {
            this.f2071f = interfaceC2196f;
            AbstractC2609a7.delta(this, interfaceC2196f);
        }
    }

    public final void setUpdate(@NotNull Function0<Unit> function0) {
        this.silver = function0;
        this.teal = true;
        this.f2075j.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // s1.InterfaceC2585s
    public final void onNestedScroll(View view, int i4, int i5, int i10, int i11, int i12, int[] iArr) {
        if (this.purple.isNestedScrollingEnabled()) {
            float f5 = i4;
            float f10 = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(f5 * f10) << 32) | (Float.floatToRawIntBits(i5 * f10) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i10 * f10) << 32) | (Float.floatToRawIntBits(i11 * f10) & 4294967295L);
            int i13 = i12 == 0 ? 1 : 2;
            C2050g c2050g = this.alpha.alpha;
            C2050g c2050g2 = null;
            if (c2050g != null && c2050g.isAttached()) {
                c2050g2 = (C2050g) AbstractC2557q.foxtrot(c2050g);
            }
            C2050g c2050g3 = c2050g2;
            long maroon = c2050g3 != null ? c2050g3.maroon(i13, floatToRawIntBits, floatToRawIntBits2) : 0L;
            iArr[0] = t0.W.foxtrot(Float.intBitsToFloat((int) (maroon >> 32)));
            iArr[1] = t0.W.foxtrot(Float.intBitsToFloat((int) (maroon & 4294967295L)));
        }
    }
}
