package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import j1.C1929c;
import java.util.WeakHashMap;
import s1.C2586t;
import s1.InterfaceC2585s;
import t6.AbstractC3032n3;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes3.dex */
public class ActionBarOverlayLayout extends ViewGroup implements P, s1.r, InterfaceC2585s {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f2780v = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: w, reason: collision with root package name */
    public static final s1.a0 f2781w;

    /* renamed from: x, reason: collision with root package name */
    public static final Rect f2782x;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2783a;
    public int alpha;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2784b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2785c;

    /* renamed from: d, reason: collision with root package name */
    public int f2786d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f2787f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f2788g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f2789h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f2790i;

    /* renamed from: j, reason: collision with root package name */
    public s1.a0 f2791j;

    /* renamed from: k, reason: collision with root package name */
    public s1.a0 f2792k;

    /* renamed from: l, reason: collision with root package name */
    public s1.a0 f2793l;

    /* renamed from: m, reason: collision with root package name */
    public s1.a0 f2794m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0449d f2795n;

    /* renamed from: o, reason: collision with root package name */
    public OverScroller f2796o;

    /* renamed from: p, reason: collision with root package name */
    public ViewPropertyAnimator f2797p;
    public int purple;

    /* renamed from: q, reason: collision with root package name */
    public final O6.b f2798q;

    /* renamed from: r, reason: collision with root package name */
    public final RunnableC0447c f2799r;
    public ContentFrameLayout red;

    /* renamed from: s, reason: collision with root package name */
    public final RunnableC0447c f2800s;
    public ActionBarContainer silver;

    /* renamed from: t, reason: collision with root package name */
    public final C2586t f2801t;
    public Q teal;

    /* renamed from: u, reason: collision with root package name */
    public final C0453f f2802u;
    public Drawable white;
    public boolean yellow;

    static {
        s1.O j5;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            j5 = new s1.N();
        } else if (i4 >= 31) {
            j5 = new s1.M();
        } else if (i4 >= 30) {
            j5 = new s1.L();
        } else if (i4 >= 29) {
            j5 = new s1.K();
        } else {
            j5 = new s1.J();
        }
        j5.golf(C1929c.bravo(0, 1, 0, 1));
        f2781w = j5.bravo();
        f2782x = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [s1.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.View, androidx.appcompat.widget.f] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.purple = 0;
        this.f2787f = new Rect();
        this.f2788g = new Rect();
        this.f2789h = new Rect();
        this.f2790i = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        s1.a0 a0Var = s1.a0.bravo;
        this.f2791j = a0Var;
        this.f2792k = a0Var;
        this.f2793l = a0Var;
        this.f2794m = a0Var;
        this.f2798q = new O6.b(3, this);
        this.f2799r = new RunnableC0447c(this, 0);
        this.f2800s = new RunnableC0447c(this, 1);
        charlie(context);
        this.f2801t = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.f2802u = view;
        addView(view);
    }

    public static boolean alpha(View view, Rect rect, boolean z2) {
        boolean z10;
        C0451e c0451e = (C0451e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c0451e).leftMargin;
        int i5 = rect.left;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0451e).leftMargin = i5;
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = ((ViewGroup.MarginLayoutParams) c0451e).topMargin;
        int i11 = rect.top;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) c0451e).topMargin = i11;
            z10 = true;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) c0451e).rightMargin;
        int i13 = rect.right;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) c0451e).rightMargin = i13;
            z10 = true;
        }
        if (z2) {
            int i14 = ((ViewGroup.MarginLayoutParams) c0451e).bottomMargin;
            int i15 = rect.bottom;
            if (i14 != i15) {
                ((ViewGroup.MarginLayoutParams) c0451e).bottomMargin = i15;
                return true;
            }
        }
        return z10;
    }

    public final void bravo() {
        removeCallbacks(this.f2799r);
        removeCallbacks(this.f2800s);
        ViewPropertyAnimator viewPropertyAnimator = this.f2797p;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void charlie(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2780v);
        boolean z2 = false;
        this.alpha = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.white = drawable;
        if (drawable == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        obtainStyledAttributes.recycle();
        this.f2796o = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0451e;
    }

    public final void delta(int i4) {
        echo();
        if (i4 != 2) {
            if (i4 != 5) {
                if (i4 != 109) {
                    return;
                }
                setOverlayMode(true);
                return;
            } else {
                ((e1) this.teal).getClass();
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            }
        }
        ((e1) this.teal).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        if (this.white != null) {
            if (this.silver.getVisibility() == 0) {
                i4 = (int) (this.silver.getTranslationY() + this.silver.getBottom() + 0.5f);
            } else {
                i4 = 0;
            }
            this.white.setBounds(0, i4, getWidth(), this.white.getIntrinsicHeight() + i4);
            this.white.draw(canvas);
        }
    }

    public final void echo() {
        Q wrapper;
        if (this.red == null) {
            this.red = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.silver = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof Q) {
                wrapper = (Q) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.teal = wrapper;
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void foxtrot(ao.l lVar, ao.w wVar) {
        echo();
        e1 e1Var = (e1) this.teal;
        C0469n c0469n = e1Var.mike;
        Toolbar toolbar = e1Var.alpha;
        if (c0469n == null) {
            C0469n c0469n2 = new C0469n(toolbar.getContext());
            e1Var.mike = c0469n2;
            c0469n2.f2902b = R.id.action_menu_presenter;
        }
        C0469n c0469n3 = e1Var.mike;
        c0469n3.teal = wVar;
        if (lVar != null || toolbar.alpha != null) {
            toolbar.foxtrot();
            ao.l lVar2 = toolbar.alpha.alpha;
            if (lVar2 == lVar) {
                return;
            }
            if (lVar2 != null) {
                lVar2.romeo(toolbar.f2826E);
                lVar2.romeo(toolbar.f2827F);
            }
            if (toolbar.f2827F == null) {
                toolbar.f2827F = new Z0(toolbar);
            }
            c0469n3.f2910k = true;
            if (lVar != null) {
                lVar.bravo(c0469n3, toolbar.f2837c);
                lVar.bravo(toolbar.f2827F, toolbar.f2837c);
            } else {
                c0469n3.charlie(toolbar.f2837c, null);
                toolbar.f2827F.charlie(toolbar.f2837c, null);
                c0469n3.india();
                toolbar.f2827F.india();
            }
            toolbar.alpha.setPopupTheme(toolbar.f2838d);
            toolbar.alpha.setPresenter(c0469n3);
            toolbar.f2826E = c0469n3;
            toolbar.victor();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.silver;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C2586t c2586t = this.f2801t;
        return c2586t.bravo | c2586t.alpha;
    }

    public CharSequence getTitle() {
        echo();
        return ((e1) this.teal).alpha.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        echo();
        s1.a0 hotel = s1.a0.hotel(this, windowInsets);
        boolean alpha = alpha(this.silver, new Rect(hotel.bravo(), hotel.delta(), hotel.charlie(), hotel.alpha()), false);
        WeakHashMap weakHashMap = s1.au.alpha;
        Rect rect = this.f2787f;
        s1.al.bravo(this, hotel, rect);
        int i4 = rect.left;
        int i5 = rect.top;
        int i10 = rect.right;
        int i11 = rect.bottom;
        s1.X x4 = hotel.alpha;
        s1.a0 november = x4.november(i4, i5, i10, i11);
        this.f2791j = november;
        boolean z2 = true;
        if (!this.f2792k.equals(november)) {
            this.f2792k = this.f2791j;
            alpha = true;
        }
        Rect rect2 = this.f2788g;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z2 = alpha;
        }
        if (z2) {
            requestLayout();
        }
        return x4.alpha().alpha.charlie().alpha.bravo().golf();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        charlie(getContext());
        WeakHashMap weakHashMap = s1.au.alpha;
        s1.aj.charlie(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bravo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0451e c0451e = (C0451e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = ((ViewGroup.MarginLayoutParams) c0451e).leftMargin + paddingLeft;
                int i14 = ((ViewGroup.MarginLayoutParams) c0451e).topMargin + paddingTop;
                childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0110  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i4, int i5) {
        boolean z2;
        int measuredHeight;
        s1.O j5;
        echo();
        measureChildWithMargins(this.silver, i4, 0, i5, 0);
        C0451e c0451e = (C0451e) this.silver.getLayoutParams();
        int max = Math.max(0, this.silver.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0451e).leftMargin + ((ViewGroup.MarginLayoutParams) c0451e).rightMargin);
        int max2 = Math.max(0, this.silver.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0451e).topMargin + ((ViewGroup.MarginLayoutParams) c0451e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.silver.getMeasuredState());
        WeakHashMap weakHashMap = s1.au.alpha;
        if ((getWindowSystemUiVisibility() & Barcode.FORMAT_QR_CODE) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            measuredHeight = this.alpha;
            if (this.f2783a && this.silver.getTabContainer() != null) {
                measuredHeight += this.alpha;
            }
        } else {
            measuredHeight = this.silver.getVisibility() != 8 ? this.silver.getMeasuredHeight() : 0;
        }
        Rect rect = this.f2787f;
        Rect rect2 = this.f2789h;
        rect2.set(rect);
        this.f2793l = this.f2791j;
        if (!this.yellow && !z2) {
            C0453f c0453f = this.f2802u;
            s1.a0 a0Var = f2781w;
            Rect rect3 = this.f2790i;
            s1.al.bravo(c0453f, a0Var, rect3);
            if (!rect3.equals(f2782x)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f2793l = this.f2793l.alpha.november(0, measuredHeight, 0, 0);
                alpha(this.red, rect2, true);
                if (!this.f2794m.equals(this.f2793l)) {
                    s1.a0 a0Var2 = this.f2793l;
                    this.f2794m = a0Var2;
                    s1.au.bravo(this.red, a0Var2);
                }
                measureChildWithMargins(this.red, i4, 0, i5, 0);
                C0451e c0451e2 = (C0451e) this.red.getLayoutParams();
                int max3 = Math.max(max, this.red.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0451e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0451e2).rightMargin);
                int max4 = Math.max(max2, this.red.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0451e2).topMargin + ((ViewGroup.MarginLayoutParams) c0451e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.red.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i4, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
            }
        }
        C1929c bravo = C1929c.bravo(this.f2793l.bravo(), this.f2793l.delta() + measuredHeight, this.f2793l.charlie(), this.f2793l.alpha());
        s1.a0 a0Var3 = this.f2793l;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            j5 = new s1.N(a0Var3);
        } else if (i10 >= 31) {
            j5 = new s1.M(a0Var3);
        } else if (i10 >= 30) {
            j5 = new s1.L(a0Var3);
        } else if (i10 >= 29) {
            j5 = new s1.K(a0Var3);
        } else {
            j5 = new s1.J(a0Var3);
        }
        j5.golf(bravo);
        this.f2793l = j5.bravo();
        alpha(this.red, rect2, true);
        if (!this.f2794m.equals(this.f2793l)) {
        }
        measureChildWithMargins(this.red, i4, 0, i5, 0);
        C0451e c0451e22 = (C0451e) this.red.getLayoutParams();
        int max32 = Math.max(max, this.red.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0451e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0451e22).rightMargin);
        int max42 = Math.max(max2, this.red.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0451e22).topMargin + ((ViewGroup.MarginLayoutParams) c0451e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.red.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i4, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i5, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f10, boolean z2) {
        if (this.f2784b && z2) {
            this.f2796o.fling(0, 0, 0, (int) f10, 0, 0, RecyclerView.UNDEFINED_DURATION, LottieConstants.IterateForever);
            if (this.f2796o.getFinalY() > this.silver.getHeight()) {
                bravo();
                this.f2800s.run();
            } else {
                bravo();
                this.f2799r.run();
            }
            this.f2785c = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    @Override // s1.InterfaceC2585s
    public final void onNestedScroll(View view, int i4, int i5, int i10, int i11, int i12, int[] iArr) {
        onNestedScroll(view, i4, i5, i10, i11, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        androidx.appcompat.app.ap apVar;
        an.k kVar;
        this.f2801t.alpha = i4;
        this.f2786d = getActionBarHideOffset();
        bravo();
        InterfaceC0449d interfaceC0449d = this.f2795n;
        if (interfaceC0449d == null || (kVar = (apVar = (androidx.appcompat.app.ap) interfaceC0449d).tango) == null) {
            return;
        }
        kVar.alpha();
        apVar.tango = null;
    }

    @Override // s1.r
    public final boolean onStartNestedScroll(View view, View view2, int i4, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i4);
    }

    @Override // s1.r
    public final void onStopNestedScroll(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i4) {
        boolean z2;
        boolean z10;
        super.onWindowSystemUiVisibilityChanged(i4);
        echo();
        int i5 = this.e ^ i4;
        this.e = i4;
        if ((i4 & 4) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        InterfaceC0449d interfaceC0449d = this.f2795n;
        if (interfaceC0449d != null) {
            androidx.appcompat.app.ap apVar = (androidx.appcompat.app.ap) interfaceC0449d;
            apVar.oscar = !z10;
            if (!z2 && z10) {
                if (!apVar.quebec) {
                    apVar.quebec = true;
                    apVar.amber(true);
                }
            } else if (apVar.quebec) {
                apVar.quebec = false;
                apVar.amber(true);
            }
        }
        if ((i5 & Barcode.FORMAT_QR_CODE) != 0 && this.f2795n != null) {
            WeakHashMap weakHashMap = s1.au.alpha;
            s1.aj.charlie(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.purple = i4;
        InterfaceC0449d interfaceC0449d = this.f2795n;
        if (interfaceC0449d != null) {
            ((androidx.appcompat.app.ap) interfaceC0449d).november = i4;
        }
    }

    public void setActionBarHideOffset(int i4) {
        bravo();
        this.silver.setTranslationY(-Math.max(0, Math.min(i4, this.silver.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0449d interfaceC0449d) {
        this.f2795n = interfaceC0449d;
        if (getWindowToken() != null) {
            ((androidx.appcompat.app.ap) this.f2795n).november = this.purple;
            int i4 = this.e;
            if (i4 != 0) {
                onWindowSystemUiVisibilityChanged(i4);
                WeakHashMap weakHashMap = s1.au.alpha;
                s1.aj.charlie(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f2783a = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f2784b) {
            this.f2784b = z2;
            if (!z2) {
                bravo();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i4) {
        echo();
        e1 e1Var = (e1) this.teal;
        e1Var.delta = i4 != 0 ? AbstractC3032n3.echo(i4, e1Var.alpha.getContext()) : null;
        e1Var.delta();
    }

    public void setLogo(int i4) {
        Drawable drawable;
        echo();
        e1 e1Var = (e1) this.teal;
        if (i4 != 0) {
            drawable = AbstractC3032n3.echo(i4, e1Var.alpha.getContext());
        } else {
            drawable = null;
        }
        e1Var.echo = drawable;
        e1Var.delta();
    }

    public void setOverlayMode(boolean z2) {
        this.yellow = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i4) {
    }

    @Override // androidx.appcompat.widget.P
    public void setWindowCallback(Window.Callback callback) {
        echo();
        ((e1) this.teal).kilo = callback;
    }

    @Override // androidx.appcompat.widget.P
    public void setWindowTitle(CharSequence charSequence) {
        echo();
        e1 e1Var = (e1) this.teal;
        if (!e1Var.golf) {
            e1Var.hotel = charSequence;
            if ((e1Var.bravo & 8) != 0) {
                Toolbar toolbar = e1Var.alpha;
                toolbar.setTitle(charSequence);
                if (e1Var.golf) {
                    s1.au.oscar(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // s1.r
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr, int i10) {
    }

    @Override // s1.r
    public final void onNestedScroll(View view, int i4, int i5, int i10, int i11, int i12) {
        if (i12 == 0) {
            onNestedScroll(view, i4, i5, i10, i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.silver.getVisibility() != 0) {
            return false;
        }
        return this.f2784b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f2784b || this.f2785c) {
            return;
        }
        if (this.f2786d <= this.silver.getHeight()) {
            bravo();
            postDelayed(this.f2799r, 600L);
        } else {
            bravo();
            postDelayed(this.f2800s, 600L);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i10, int i11) {
        int i12 = this.f2786d + i5;
        this.f2786d = i12;
        setActionBarHideOffset(i12);
    }

    public void setIcon(Drawable drawable) {
        echo();
        e1 e1Var = (e1) this.teal;
        e1Var.delta = drawable;
        e1Var.delta();
    }

    @Override // s1.r
    public final void onNestedScrollAccepted(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }
}
