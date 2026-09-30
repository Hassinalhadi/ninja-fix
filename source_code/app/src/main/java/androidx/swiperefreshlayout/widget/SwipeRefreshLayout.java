package androidx.swiperefreshlayout.widget;

import J2.t;
import Jb.C0208p;
import Jb.Q;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.fragment.app.L;
import androidx.fragment.app.ai;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import s1.C2584q;
import s1.C2586t;
import s1.InterfaceC2583p;
import s1.al;
import s1.au;
import v2.AnimationAnimationListenerC3170f;
import v2.C3165a;
import v2.C3168d;
import v2.C3169e;
import v2.g;
import v2.h;
import v2.i;
import v2.j;

/* loaded from: classes3.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC2583p {
    public static final int[] C = {R.attr.enabled};
    public final g A;
    public final g B;

    /* renamed from: a, reason: collision with root package name */
    public final C2584q f3134a;
    public View alpha;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3135b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f3136c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3137d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public int f3138f;

    /* renamed from: g, reason: collision with root package name */
    public float f3139g;

    /* renamed from: h, reason: collision with root package name */
    public float f3140h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3141i;

    /* renamed from: j, reason: collision with root package name */
    public int f3142j;

    /* renamed from: k, reason: collision with root package name */
    public final DecelerateInterpolator f3143k;

    /* renamed from: l, reason: collision with root package name */
    public final C3165a f3144l;

    /* renamed from: m, reason: collision with root package name */
    public int f3145m;

    /* renamed from: n, reason: collision with root package name */
    public int f3146n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3147o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3148p;
    public j purple;

    /* renamed from: q, reason: collision with root package name */
    public int f3149q;

    /* renamed from: r, reason: collision with root package name */
    public final C3169e f3150r;
    public boolean red;

    /* renamed from: s, reason: collision with root package name */
    public g f3151s;
    public final int silver;

    /* renamed from: t, reason: collision with root package name */
    public g f3152t;
    public float teal;

    /* renamed from: u, reason: collision with root package name */
    public h f3153u;

    /* renamed from: v, reason: collision with root package name */
    public h f3154v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3155w;
    public float white;

    /* renamed from: x, reason: collision with root package name */
    public int f3156x;

    /* renamed from: y, reason: collision with root package name */
    public i f3157y;
    public final C2586t yellow;

    /* renamed from: z, reason: collision with root package name */
    public final AnimationAnimationListenerC3170f f3158z;

    /* JADX WARN: Type inference failed for: r1v14, types: [s1.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.widget.ImageView, android.view.View, v2.a] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.red = false;
        this.teal = -1.0f;
        this.f3135b = new int[2];
        this.f3136c = new int[2];
        this.f3142j = -1;
        this.f3145m = -1;
        this.f3158z = new AnimationAnimationListenerC3170f(this, 0);
        this.A = new g(this, 2);
        this.B = new g(this, 3);
        this.silver = ViewConfiguration.get(context).getScaledTouchSlop();
        this.e = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f3143k = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f3156x = (int) (displayMetrics.density * 40.0f);
        ?? imageView = new ImageView(getContext());
        float f5 = imageView.getContext().getResources().getDisplayMetrics().density;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = au.alpha;
        al.kilo(imageView, f5 * 4.0f);
        shapeDrawable.getPaint().setColor(-328966);
        imageView.setBackground(shapeDrawable);
        this.f3144l = imageView;
        C3169e c3169e = new C3169e(getContext());
        this.f3150r = c3169e;
        c3169e.charlie(1);
        this.f3144l.setImageDrawable(this.f3150r);
        this.f3144l.setVisibility(8);
        addView(this.f3144l);
        setChildrenDrawingOrderEnabled(true);
        int i4 = (int) (displayMetrics.density * 64.0f);
        this.f3148p = i4;
        this.teal = i4;
        this.yellow = new Object();
        this.f3134a = new C2584q(this);
        setNestedScrollingEnabled(true);
        int i5 = -this.f3156x;
        this.f3138f = i5;
        this.f3147o = i5;
        echo(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i4) {
        this.f3144l.getBackground().setAlpha(i4);
        this.f3150r.setAlpha(i4);
    }

    public final boolean alpha() {
        C0208p c0208p;
        i iVar = this.f3157y;
        if (iVar != null) {
            OrdersFragmentV2 ordersFragmentV2 = ((Q) iVar).alpha;
            L childFragmentManager = ordersFragmentV2.getChildFragmentManager();
            t tVar = ordersFragmentV2.f12302j;
            if (tVar != null) {
                ai black = childFragmentManager.black(((FrameLayout) tVar.alpha).getId());
                if (black instanceof C0208p) {
                    c0208p = (C0208p) black;
                } else {
                    c0208p = null;
                }
                if (c0208p != null) {
                    return c0208p.f1655i;
                }
                t tVar2 = ordersFragmentV2.f12302j;
                if (tVar2 != null) {
                    return ((FrameLayout) tVar2.alpha).canScrollVertically(-1);
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        View view = this.alpha;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    public final void bravo() {
        if (this.alpha == null) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (!childAt.equals(this.f3144l)) {
                    this.alpha = childAt;
                    return;
                }
            }
        }
    }

    public final void charlie(float f5) {
        if (f5 > this.teal) {
            golf(true, true);
            return;
        }
        this.red = false;
        C3169e c3169e = this.f3150r;
        C3168d c3168d = c3169e.alpha;
        c3168d.echo = 0.0f;
        c3168d.foxtrot = 0.0f;
        c3169e.invalidateSelf();
        AnimationAnimationListenerC3170f animationAnimationListenerC3170f = new AnimationAnimationListenerC3170f(this, 1);
        this.f3146n = this.f3138f;
        g gVar = this.B;
        gVar.reset();
        gVar.setDuration(200L);
        gVar.setInterpolator(this.f3143k);
        C3165a c3165a = this.f3144l;
        c3165a.alpha = animationAnimationListenerC3170f;
        c3165a.clearAnimation();
        this.f3144l.startAnimation(gVar);
        C3169e c3169e2 = this.f3150r;
        C3168d c3168d2 = c3169e2.alpha;
        if (c3168d2.november) {
            c3168d2.november = false;
        }
        c3169e2.invalidateSelf();
    }

    public final void delta(float f5) {
        h hVar;
        h hVar2;
        C3169e c3169e = this.f3150r;
        C3168d c3168d = c3169e.alpha;
        if (!c3168d.november) {
            c3168d.november = true;
        }
        c3169e.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f5 / this.teal));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f5) - this.teal;
        int i4 = this.f3149q;
        if (i4 <= 0) {
            i4 = this.f3148p;
        }
        float f10 = i4;
        double max2 = Math.max(0.0f, Math.min(abs, f10 * 2.0f) / f10) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i5 = this.f3147o + ((int) ((f10 * min) + (f10 * pow * 2.0f)));
        if (this.f3144l.getVisibility() != 0) {
            this.f3144l.setVisibility(0);
        }
        this.f3144l.setScaleX(1.0f);
        this.f3144l.setScaleY(1.0f);
        if (f5 < this.teal) {
            if (this.f3150r.alpha.tango > 76 && ((hVar2 = this.f3153u) == null || !hVar2.hasStarted() || hVar2.hasEnded())) {
                h hVar3 = new h(this, this.f3150r.alpha.tango, 76);
                hVar3.setDuration(300L);
                C3165a c3165a = this.f3144l;
                c3165a.alpha = null;
                c3165a.clearAnimation();
                this.f3144l.startAnimation(hVar3);
                this.f3153u = hVar3;
            }
        } else if (this.f3150r.alpha.tango < 255 && ((hVar = this.f3154v) == null || !hVar.hasStarted() || hVar.hasEnded())) {
            h hVar4 = new h(this, this.f3150r.alpha.tango, 255);
            hVar4.setDuration(300L);
            C3165a c3165a2 = this.f3144l;
            c3165a2.alpha = null;
            c3165a2.clearAnimation();
            this.f3144l.startAnimation(hVar4);
            this.f3154v = hVar4;
        }
        C3169e c3169e2 = this.f3150r;
        float min2 = Math.min(0.8f, max * 0.8f);
        C3168d c3168d2 = c3169e2.alpha;
        c3168d2.echo = 0.0f;
        c3168d2.foxtrot = min2;
        c3169e2.invalidateSelf();
        C3169e c3169e3 = this.f3150r;
        float min3 = Math.min(1.0f, max);
        C3168d c3168d3 = c3169e3.alpha;
        if (min3 != c3168d3.papa) {
            c3168d3.papa = min3;
        }
        c3169e3.invalidateSelf();
        C3169e c3169e4 = this.f3150r;
        c3169e4.alpha.golf = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        c3169e4.invalidateSelf();
        setTargetOffsetTopAndBottom(i5 - this.f3138f);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f5, float f10, boolean z2) {
        return this.f3134a.alpha(f5, f10, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f5, float f10) {
        return this.f3134a.bravo(f5, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f3134a.charlie(i4, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i10, int i11, int[] iArr) {
        return this.f3134a.delta(i4, i5, i10, i11, iArr, 0, null);
    }

    public final void echo(float f5) {
        setTargetOffsetTopAndBottom((this.f3146n + ((int) ((this.f3147o - r0) * f5))) - this.f3144l.getTop());
    }

    public final void foxtrot() {
        this.f3144l.clearAnimation();
        this.f3150r.stop();
        this.f3144l.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f3147o - this.f3138f);
        this.f3138f = this.f3144l.getTop();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i5) {
        int i10 = this.f3145m;
        if (i10 >= 0) {
            if (i5 == i4 - 1) {
                return i10;
            }
            if (i5 >= i10) {
                return i5 + 1;
            }
            return i5;
        }
        return i5;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C2586t c2586t = this.yellow;
        return c2586t.bravo | c2586t.alpha;
    }

    public int getProgressCircleDiameter() {
        return this.f3156x;
    }

    public int getProgressViewEndOffset() {
        return this.f3148p;
    }

    public int getProgressViewStartOffset() {
        return this.f3147o;
    }

    public final void golf(boolean z2, boolean z10) {
        if (this.red != z2) {
            this.f3155w = z10;
            bravo();
            this.red = z2;
            AnimationAnimationListenerC3170f animationAnimationListenerC3170f = this.f3158z;
            if (z2) {
                this.f3146n = this.f3138f;
                g gVar = this.A;
                gVar.reset();
                gVar.setDuration(200L);
                gVar.setInterpolator(this.f3143k);
                if (animationAnimationListenerC3170f != null) {
                    this.f3144l.alpha = animationAnimationListenerC3170f;
                }
                this.f3144l.clearAnimation();
                this.f3144l.startAnimation(gVar);
                return;
            }
            g gVar2 = new g(this, 1);
            this.f3152t = gVar2;
            gVar2.setDuration(150L);
            C3165a c3165a = this.f3144l;
            c3165a.alpha = animationAnimationListenerC3170f;
            c3165a.clearAnimation();
            this.f3144l.startAnimation(this.f3152t);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f3134a.foxtrot(0);
    }

    public final void hotel(float f5) {
        float f10 = this.f3140h;
        float f11 = f5 - f10;
        float f12 = this.silver;
        if (f11 > f12 && !this.f3141i) {
            this.f3139g = f10 + f12;
            this.f3141i = true;
            this.f3150r.setAlpha(76);
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f3134a.delta;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        foxtrot();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bravo();
        int actionMasked = motionEvent.getActionMasked();
        int i4 = 0;
        if (isEnabled() && !alpha() && !this.red && !this.f3137d) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.f3142j) {
                                    if (actionIndex == 0) {
                                        i4 = 1;
                                    }
                                    this.f3142j = motionEvent.getPointerId(i4);
                                }
                            }
                        }
                    } else {
                        int i5 = this.f3142j;
                        if (i5 == -1) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex >= 0) {
                            hotel(motionEvent.getY(findPointerIndex));
                        }
                    }
                    return this.f3141i;
                }
                this.f3141i = false;
                this.f3142j = -1;
                return this.f3141i;
            }
            setTargetOffsetTopAndBottom(this.f3147o - this.f3144l.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f3142j = pointerId;
            this.f3141i = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.f3140h = motionEvent.getY(findPointerIndex2);
                return this.f3141i;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.alpha == null) {
                bravo();
            }
            View view = this.alpha;
            if (view == null) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.f3144l.getMeasuredWidth();
            int measuredHeight2 = this.f3144l.getMeasuredHeight();
            int i12 = measuredWidth / 2;
            int i13 = measuredWidth2 / 2;
            int i14 = this.f3138f;
            this.f3144l.layout(i12 - i13, i14, i12 + i13, measuredHeight2 + i14);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.alpha == null) {
            bravo();
        }
        View view = this.alpha;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f3144l.measure(View.MeasureSpec.makeMeasureSpec(this.f3156x, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f3156x, 1073741824));
            this.f3145m = -1;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (getChildAt(i10) == this.f3144l) {
                    this.f3145m = i10;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f10, boolean z2) {
        return this.f3134a.alpha(f5, f10, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f10) {
        return this.f3134a.bravo(f5, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        if (i5 > 0) {
            float f5 = this.white;
            if (f5 > 0.0f) {
                float f10 = i5;
                if (f10 > f5) {
                    iArr[1] = i5 - ((int) f5);
                    this.white = 0.0f;
                } else {
                    this.white = f5 - f10;
                    iArr[1] = i5;
                }
                delta(this.white);
            }
        }
        int i10 = i4 - iArr[0];
        int i11 = i5 - iArr[1];
        int[] iArr2 = this.f3135b;
        if (dispatchNestedPreScroll(i10, i11, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i10, int i11) {
        dispatchNestedScroll(i4, i5, i10, i11, this.f3136c);
        if (i11 + this.f3136c[1] < 0 && !alpha()) {
            float abs = this.white + Math.abs(r11);
            this.white = abs;
            delta(abs);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        this.yellow.alpha = i4;
        startNestedScroll(i4 & 2);
        this.white = 0.0f;
        this.f3137d = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        if (isEnabled() && !this.red && (i4 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.yellow.alpha = 0;
        this.f3137d = false;
        float f5 = this.white;
        if (f5 > 0.0f) {
            charlie(f5);
            this.white = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i4 = 0;
        if (isEnabled() && !alpha() && !this.red && !this.f3137d) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == this.f3142j) {
                                        if (actionIndex == 0) {
                                            i4 = 1;
                                        }
                                        this.f3142j = motionEvent.getPointerId(i4);
                                        return true;
                                    }
                                }
                                return true;
                            }
                            int actionIndex2 = motionEvent.getActionIndex();
                            if (actionIndex2 < 0) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            this.f3142j = motionEvent.getPointerId(actionIndex2);
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f3142j);
                        if (findPointerIndex < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        float y10 = motionEvent.getY(findPointerIndex);
                        hotel(y10);
                        if (this.f3141i) {
                            float f5 = (y10 - this.f3139g) * 0.5f;
                            if (f5 > 0.0f) {
                                delta(f5);
                            }
                        }
                        return true;
                    }
                } else {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.f3142j);
                    if (findPointerIndex2 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    if (this.f3141i) {
                        float y11 = (motionEvent.getY(findPointerIndex2) - this.f3139g) * 0.5f;
                        this.f3141i = false;
                        charlie(y11);
                    }
                    this.f3142j = -1;
                    return false;
                }
            } else {
                this.f3142j = motionEvent.getPointerId(0);
                this.f3141i = false;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        View view = this.alpha;
        if (view != null) {
            WeakHashMap weakHashMap = au.alpha;
            if (!al.hotel(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void setAnimationProgress(float f5) {
        this.f3144l.setScaleX(f5);
        this.f3144l.setScaleY(f5);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        bravo();
        C3169e c3169e = this.f3150r;
        C3168d c3168d = c3169e.alpha;
        c3168d.india = iArr;
        c3168d.alpha(0);
        c3168d.alpha(0);
        c3169e.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr2[i4] = context.getColor(iArr[i4]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i4) {
        this.teal = i4;
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            foxtrot();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C2584q c2584q = this.f3134a;
        if (c2584q.delta) {
            WeakHashMap weakHashMap = au.alpha;
            al.november(c2584q.charlie);
        }
        c2584q.delta = z2;
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.f3157y = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.purple = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i4) {
        setProgressBackgroundColorSchemeResource(i4);
    }

    public void setProgressBackgroundColorSchemeColor(int i4) {
        this.f3144l.setBackgroundColor(i4);
    }

    public void setProgressBackgroundColorSchemeResource(int i4) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i4));
    }

    public void setRefreshing(boolean z2) {
        if (z2 && this.red != z2) {
            this.red = z2;
            setTargetOffsetTopAndBottom((this.f3148p + this.f3147o) - this.f3138f);
            this.f3155w = false;
            AnimationAnimationListenerC3170f animationAnimationListenerC3170f = this.f3158z;
            this.f3144l.setVisibility(0);
            this.f3150r.setAlpha(255);
            g gVar = new g(this, 0);
            this.f3151s = gVar;
            gVar.setDuration(this.e);
            if (animationAnimationListenerC3170f != null) {
                this.f3144l.alpha = animationAnimationListenerC3170f;
            }
            this.f3144l.clearAnimation();
            this.f3144l.startAnimation(this.f3151s);
            return;
        }
        golf(z2, false);
    }

    public void setSize(int i4) {
        if (i4 != 0 && i4 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i4 == 0) {
            this.f3156x = (int) (displayMetrics.density * 56.0f);
        } else {
            this.f3156x = (int) (displayMetrics.density * 40.0f);
        }
        this.f3144l.setImageDrawable(null);
        this.f3150r.charlie(i4);
        this.f3144l.setImageDrawable(this.f3150r);
    }

    public void setSlingshotDistance(int i4) {
        this.f3149q = i4;
    }

    public void setTargetOffsetTopAndBottom(int i4) {
        C3165a c3165a = this.f3144l;
        c3165a.bringToFront();
        WeakHashMap weakHashMap = au.alpha;
        c3165a.offsetTopAndBottom(i4);
        this.f3138f = c3165a.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return this.f3134a.golf(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f3134a.hotel(0);
    }
}
