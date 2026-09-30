package com.google.android.material.bottomsheet;

import T5.o;
import a7.C0413h;
import a7.InterfaceC0407b;
import ae.C0423b;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.P0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import ao.ad;
import com.google.android.material.internal.ab;
import com.google.android.material.internal.ac;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import s1.C2568a;
import s1.C2569b;
import s1.al;
import s1.au;
import s6.AbstractC2719n0;
import t1.C2951c;
import y1.C3391d;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends androidx.coordinatorlayout.widget.c implements InterfaceC0407b {
    public final float A;
    public boolean B;
    public boolean C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f7854D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f7855E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f7856F;

    /* renamed from: G, reason: collision with root package name */
    public int f7857G;

    /* renamed from: H, reason: collision with root package name */
    public C3391d f7858H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f7859I;

    /* renamed from: J, reason: collision with root package name */
    public int f7860J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f7861K;

    /* renamed from: L, reason: collision with root package name */
    public final float f7862L;

    /* renamed from: M, reason: collision with root package name */
    public int f7863M;

    /* renamed from: N, reason: collision with root package name */
    public int f7864N;

    /* renamed from: O, reason: collision with root package name */
    public int f7865O;

    /* renamed from: P, reason: collision with root package name */
    public WeakReference f7866P;
    public WeakReference Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f7867R;

    /* renamed from: S, reason: collision with root package name */
    public VelocityTracker f7868S;

    /* renamed from: T, reason: collision with root package name */
    public C0413h f7869T;

    /* renamed from: U, reason: collision with root package name */
    public int f7870U;

    /* renamed from: V, reason: collision with root package name */
    public int f7871V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f7872W;

    /* renamed from: X, reason: collision with root package name */
    public HashMap f7873X;

    /* renamed from: Y, reason: collision with root package name */
    public final SparseIntArray f7874Y;

    /* renamed from: Z, reason: collision with root package name */
    public final b f7875Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f7876a;
    public final int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final g7.i f7877b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f7878c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7879d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public int f7880f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7881g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7882h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7883i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7884j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7885k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7886l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7887m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f7888n;

    /* renamed from: o, reason: collision with root package name */
    public int f7889o;

    /* renamed from: p, reason: collision with root package name */
    public int f7890p;
    public boolean purple;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7891q;

    /* renamed from: r, reason: collision with root package name */
    public final g7.m f7892r;
    public final float red;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7893s;
    public final int silver;

    /* renamed from: t, reason: collision with root package name */
    public final o f7894t;
    public int teal;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f7895u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7896v;

    /* renamed from: w, reason: collision with root package name */
    public int f7897w;
    public boolean white;

    /* renamed from: x, reason: collision with root package name */
    public int f7898x;

    /* renamed from: y, reason: collision with root package name */
    public final float f7899y;
    public int yellow;

    /* renamed from: z, reason: collision with root package name */
    public int f7900z;

    public BottomSheetBehavior() {
        this.alpha = 0;
        this.purple = true;
        this.f7879d = -1;
        this.e = -1;
        this.f7894t = new o(this);
        this.f7899y = 0.5f;
        this.A = -1.0f;
        this.f7854D = true;
        this.f7855E = true;
        this.f7857G = 4;
        this.f7862L = 0.1f;
        this.f7867R = new ArrayList();
        this.f7871V = -1;
        this.f7874Y = new SparseIntArray();
        this.f7875Z = new b(this, 0);
    }

    public static View india(View view) {
        if (view.getVisibility() == 0) {
            if (view.isNestedScrollingEnabled()) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View india = india(viewGroup.getChildAt(i4));
                    if (india != null) {
                        return india;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static BottomSheetBehavior juliet(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof androidx.coordinatorlayout.widget.f) {
            androidx.coordinatorlayout.widget.c cVar = ((androidx.coordinatorlayout.widget.f) layoutParams).alpha;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public static int kilo(int i4, int i5, int i10, int i11) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, i5, i11);
        if (i10 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i10 = Math.min(size, i10);
            }
            return View.MeasureSpec.makeMeasureSpec(i10, RecyclerView.UNDEFINED_DURATION);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i10), 1073741824);
    }

    @Override // a7.InterfaceC0407b
    public final void alpha(C0423b c0423b) {
        C0413h c0413h = this.f7869T;
        if (c0413h != null) {
            if (c0413h.foxtrot == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
            }
            C0423b c0423b2 = c0413h.foxtrot;
            c0413h.foxtrot = c0423b;
            if (c0423b2 == null) {
                return;
            }
            c0413h.bravo(c0423b.charlie);
        }
    }

    @Override // a7.InterfaceC0407b
    public final void bravo() {
        C0413h c0413h = this.f7869T;
        if (c0413h == null) {
            return;
        }
        C0423b c0423b = c0413h.foxtrot;
        c0413h.foxtrot = null;
        int i4 = 4;
        if (c0423b != null && Build.VERSION.SDK_INT >= 34) {
            boolean z2 = this.B;
            int i5 = c0413h.delta;
            int i10 = c0413h.charlie;
            float f5 = c0423b.charlie;
            if (z2) {
                O6.b bVar = new O6.b(6, this);
                View view = c0413h.bravo;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                ofFloat.setInterpolator(new P1.a(1));
                ofFloat.setDuration(M6.a.charlie(i10, i5, f5));
                ofFloat.addListener(new O6.b(2, c0413h));
                ofFloat.addListener(bVar);
                ofFloat.start();
                return;
            }
            AnimatorSet alpha = c0413h.alpha();
            alpha.setDuration(M6.a.charlie(i10, i5, f5));
            alpha.start();
            sierra(4);
            return;
        }
        if (this.B) {
            i4 = 5;
        }
        sierra(i4);
    }

    @Override // a7.InterfaceC0407b
    public final void charlie(C0423b c0423b) {
        C0413h c0413h = this.f7869T;
        if (c0413h == null) {
            return;
        }
        c0413h.foxtrot = c0423b;
    }

    @Override // a7.InterfaceC0407b
    public final void delta() {
        C0413h c0413h = this.f7869T;
        if (c0413h != null) {
            if (c0413h.foxtrot == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
            }
            C0423b c0423b = c0413h.foxtrot;
            c0413h.foxtrot = null;
            if (c0423b == null) {
                return;
            }
            AnimatorSet alpha = c0413h.alpha();
            alpha.setDuration(c0413h.echo);
            alpha.start();
        }
    }

    public final void echo() {
        int golf = golf();
        if (this.purple) {
            this.f7900z = Math.max(this.f7865O - golf, this.f7897w);
        } else {
            this.f7900z = this.f7865O - golf;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float foxtrot() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f5;
        float[] fArr;
        float alpha;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f10 = 0.0f;
        if (this.f7877b != null && (weakReference = this.f7866P) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f7866P.get();
            if (november() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float kilo = this.f7877b.kilo();
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f11 = radius2;
                    if (f11 > 0.0f && kilo > 0.0f) {
                        f5 = f11 / kilo;
                        g7.i iVar = this.f7877b;
                        fArr = iVar.f12670v;
                        if (fArr == null) {
                            alpha = fArr[0];
                        } else {
                            alpha = iVar.purple.alpha.foxtrot.alpha(iVar.hotel());
                        }
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f12 = radius;
                            if (f12 > 0.0f && alpha > 0.0f) {
                                f10 = f12 / alpha;
                            }
                        }
                        return Math.max(f5, f10);
                    }
                }
                f5 = 0.0f;
                g7.i iVar2 = this.f7877b;
                fArr = iVar2.f12670v;
                if (fArr == null) {
                }
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f5, f10);
            }
        }
        return 0.0f;
    }

    public final int golf() {
        int i4;
        if (this.white) {
            return Math.min(Math.max(this.yellow, this.f7865O - ((this.f7864N * 9) / 16)), this.f7863M) + this.f7889o;
        }
        if (!this.f7881g && !this.f7882h && (i4 = this.f7880f) > 0) {
            return Math.max(this.teal, i4 + this.f7876a);
        }
        return this.teal + this.f7889o;
    }

    public final void hotel(int i4) {
        View view = (View) this.f7866P.get();
        if (view != null) {
            ArrayList arrayList = this.f7867R;
            if (!arrayList.isEmpty()) {
                int i5 = this.f7900z;
                if (i4 <= i5 && i5 != lima()) {
                    lima();
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((c) arrayList.get(i10)).bravo(view);
                }
            }
        }
    }

    public final int lima() {
        int i4;
        if (this.purple) {
            return this.f7897w;
        }
        int i5 = this.f7896v;
        if (this.f7885k) {
            i4 = 0;
        } else {
            i4 = this.f7890p;
        }
        return Math.max(i5, i4);
    }

    public final int mike(int i4) {
        if (i4 != 3) {
            if (i4 != 4) {
                if (i4 != 5) {
                    if (i4 == 6) {
                        return this.f7898x;
                    }
                    throw new IllegalArgumentException(ad.zulu(i4, "Invalid state to get top offset: "));
                }
                return this.f7865O;
            }
            return this.f7900z;
        }
        return lima();
    }

    public final boolean november() {
        WeakReference weakReference = this.f7866P;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f7866P.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.f7866P = null;
        this.f7858H = null;
        this.f7869T = null;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f7866P = null;
        this.f7858H = null;
        this.f7869T = null;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2;
        View view2;
        int i4;
        C3391d c3391d;
        if (view.isShown() && this.f7854D) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                oscar();
            }
            if (this.f7868S == null) {
                this.f7868S = VelocityTracker.obtain();
            }
            this.f7868S.addMovement(motionEvent);
            View view3 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f7872W = false;
                    this.f7870U = -1;
                    if (this.f7859I) {
                        this.f7859I = false;
                        return false;
                    }
                }
            } else {
                int x4 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f7871V = y10;
                if (this.f7857G != 2) {
                    WeakReference weakReference = this.Q;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, x4, y10)) {
                        this.f7870U = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f7872W = true;
                    }
                }
                if (this.f7870U == -1 && !coordinatorLayout.isPointInChildBounds(view, x4, this.f7871V)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f7859I = z2;
            }
            if (this.f7859I || (c3391d = this.f7858H) == null || !c3391d.romeo(motionEvent)) {
                WeakReference weakReference2 = this.Q;
                if (weakReference2 != null) {
                    view3 = (View) weakReference2.get();
                }
                if (actionMasked != 2 || view3 == null || this.f7859I || this.f7857G == 1 || coordinatorLayout.isPointInChildBounds(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f7858H == null || (i4 = this.f7871V) == -1 || Math.abs(i4 - motionEvent.getY()) <= this.f7858H.bravo) {
                    return false;
                }
            }
            return true;
        }
        this.f7859I = true;
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [H3.e, java.lang.Object] */
    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
        boolean z2;
        int i5 = this.e;
        g7.i iVar = this.f7877b;
        int i10 = 0;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f7866P == null) {
            this.yellow = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f7881g && !this.white) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f7882h || this.f7883i || this.f7884j || this.f7886l || this.f7887m || this.f7888n || z2) {
                Pf.j jVar = new Pf.j(this, z2, 7);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ?? obj = new Object();
                obj.alpha = paddingStart;
                obj.bravo = paddingEnd;
                obj.charlie = paddingBottom;
                ab abVar = new ab(i10, jVar, (Object) obj);
                WeakHashMap weakHashMap = au.alpha;
                al.lima(view, abVar);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new ac(0));
                }
            }
            au.papa(view, new n(view));
            this.f7866P = new WeakReference(view);
            this.f7869T = new C0413h(view);
            if (iVar != null) {
                view.setBackground(iVar);
                float f5 = this.A;
                if (f5 == -1.0f) {
                    f5 = view.getElevation();
                }
                iVar.papa(f5);
            } else {
                ColorStateList colorStateList = this.f7878c;
                if (colorStateList != null) {
                    al.india(view, colorStateList);
                }
            }
            whiskey();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f7858H == null) {
            this.f7858H = new C3391d(coordinatorLayout.getContext(), coordinatorLayout, this.f7875Z);
        }
        int top = view.getTop();
        coordinatorLayout.onLayoutChild(view, i4);
        this.f7864N = coordinatorLayout.getWidth();
        this.f7865O = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f7863M = height;
        int i11 = this.f7865O;
        int i12 = i11 - height;
        int i13 = this.f7890p;
        if (i12 < i13) {
            if (this.f7885k) {
                if (i5 != -1) {
                    i11 = Math.min(i11, i5);
                }
                this.f7863M = i11;
            } else {
                int i14 = i11 - i13;
                if (i5 != -1) {
                    i14 = Math.min(i14, i5);
                }
                this.f7863M = i14;
            }
        }
        this.f7897w = Math.max(0, this.f7865O - this.f7863M);
        this.f7898x = (int) ((1.0f - this.f7899y) * this.f7865O);
        echo();
        int i15 = this.f7857G;
        if (i15 == 3) {
            int lima = lima();
            WeakHashMap weakHashMap2 = au.alpha;
            view.offsetTopAndBottom(lima);
        } else if (i15 == 6) {
            int i16 = this.f7898x;
            WeakHashMap weakHashMap3 = au.alpha;
            view.offsetTopAndBottom(i16);
        } else if (this.B && i15 == 5) {
            int i17 = this.f7865O;
            WeakHashMap weakHashMap4 = au.alpha;
            view.offsetTopAndBottom(i17);
        } else if (i15 == 4) {
            int i18 = this.f7900z;
            WeakHashMap weakHashMap5 = au.alpha;
            view.offsetTopAndBottom(i18);
        } else if (i15 == 1 || i15 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = au.alpha;
            view.offsetTopAndBottom(top2);
        }
        xray(this.f7857G, false);
        this.Q = new WeakReference(india(view));
        while (true) {
            ArrayList arrayList = this.f7867R;
            if (i10 >= arrayList.size()) {
                return true;
            }
            ((c) arrayList.get(i10)).alpha(view);
            i10++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(kilo(i4, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, this.f7879d, marginLayoutParams.width), kilo(i10, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.e, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f5, float f10) {
        WeakReference weakReference = this.Q;
        if (weakReference != null && view2 == weakReference.get()) {
            if ((this.f7857G != 3 && !this.f7856F) || super.onNestedPreFling(coordinatorLayout, view, view2, f5, f10)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i10) {
        View view3;
        boolean z2 = this.f7855E;
        if (i10 != 1) {
            WeakReference weakReference = this.Q;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i11 = top - i5;
                if (i5 > 0) {
                    if (!this.f7861K && !z2 && view2 == view3 && view2.canScrollVertically(1)) {
                        this.f7856F = true;
                        return;
                    }
                    if (i11 < lima()) {
                        int lima = top - lima();
                        iArr[1] = lima;
                        WeakHashMap weakHashMap = au.alpha;
                        view.offsetTopAndBottom(-lima);
                        tango(3);
                    } else if (this.f7854D) {
                        iArr[1] = i5;
                        WeakHashMap weakHashMap2 = au.alpha;
                        view.offsetTopAndBottom(-i5);
                        tango(1);
                    } else {
                        return;
                    }
                } else if (i5 < 0) {
                    boolean canScrollVertically = view2.canScrollVertically(-1);
                    if (!this.f7861K && !z2 && view2 == view3 && canScrollVertically) {
                        this.f7856F = true;
                        return;
                    }
                    if (!canScrollVertically) {
                        int i12 = this.f7900z;
                        if (i11 > i12 && !this.B) {
                            int i13 = top - i12;
                            iArr[1] = i13;
                            WeakHashMap weakHashMap3 = au.alpha;
                            view.offsetTopAndBottom(-i13);
                            tango(4);
                        } else {
                            if (!this.f7854D) {
                                return;
                            }
                            iArr[1] = i5;
                            WeakHashMap weakHashMap4 = au.alpha;
                            view.offsetTopAndBottom(-i5);
                            tango(1);
                        }
                    }
                }
                hotel(view.getTop());
                this.f7860J = i5;
                this.f7861K = true;
                this.f7856F = false;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i10, int i11, int i12, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, view, savedState.alpha);
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == -1 || (i4 & 1) == 1) {
                this.teal = savedState.silver;
            }
            if (i4 == -1 || (i4 & 2) == 2) {
                this.purple = savedState.teal;
            }
            if (i4 == -1 || (i4 & 4) == 4) {
                this.B = savedState.white;
            }
            if (i4 == -1 || (i4 & 8) == 8) {
                this.C = savedState.yellow;
            }
        }
        int i5 = savedState.red;
        if (i5 != 1 && i5 != 2) {
            this.f7857G = i5;
        } else {
            this.f7857G = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, view), this);
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
        this.f7860J = 0;
        this.f7861K = false;
        if ((i4 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r2.f7898x) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f7897w) < java.lang.Math.abs(r3 - r2.f7900z)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.f7900z)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f7900z)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f7898x) < java.lang.Math.abs(r3 - r2.f7900z)) goto L50;
     */
    @Override // androidx.coordinatorlayout.widget.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
        float yVelocity;
        int i5 = 3;
        if (view.getTop() == lima()) {
            tango(3);
            return;
        }
        WeakReference weakReference = this.Q;
        if (weakReference != null && view2 == weakReference.get() && this.f7861K) {
            if (this.f7860J > 0) {
                if (!this.purple) {
                }
                victor(view, i5, false);
                this.f7861K = false;
            }
            if (this.B) {
                VelocityTracker velocityTracker = this.f7868S;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.red);
                    yVelocity = this.f7868S.getYVelocity(this.f7870U);
                }
                if (uniform(view, yVelocity)) {
                    i5 = 5;
                    victor(view, i5, false);
                    this.f7861K = false;
                }
            }
            if (this.f7860J == 0) {
                int top = view.getTop();
                if (!this.purple) {
                    int i10 = this.f7898x;
                    if (top < i10) {
                    }
                    i5 = 6;
                }
            } else {
                if (!this.purple) {
                    int top2 = view.getTop();
                }
                i5 = 4;
            }
            victor(view, i5, false);
            this.f7861K = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i4 = this.f7857G;
        if (i4 == 1 && actionMasked == 0) {
            return true;
        }
        C3391d c3391d = this.f7858H;
        if (c3391d != null && (this.f7854D || i4 == 1)) {
            c3391d.kilo(motionEvent);
        }
        if (actionMasked == 0) {
            oscar();
        }
        if (this.f7868S == null) {
            this.f7868S = VelocityTracker.obtain();
        }
        this.f7868S.addMovement(motionEvent);
        if (this.f7858H != null && ((this.f7854D || this.f7857G == 1) && actionMasked == 2 && !this.f7859I)) {
            float abs = Math.abs(this.f7871V - motionEvent.getY());
            C3391d c3391d2 = this.f7858H;
            if (abs > c3391d2.bravo) {
                c3391d2.bravo(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f7859I;
    }

    public final void oscar() {
        this.f7870U = -1;
        this.f7871V = -1;
        VelocityTracker velocityTracker = this.f7868S;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7868S = null;
        }
    }

    public final void papa(boolean z2) {
        int i4;
        if (this.purple == z2) {
            return;
        }
        this.purple = z2;
        if (this.f7866P != null) {
            echo();
        }
        if (this.purple && this.f7857G == 6) {
            i4 = 3;
        } else {
            i4 = this.f7857G;
        }
        tango(i4);
        xray(this.f7857G, true);
        whiskey();
    }

    public final void quebec(boolean z2) {
        if (this.B != z2) {
            this.B = z2;
            if (!z2 && this.f7857G == 5) {
                sierra(4);
            }
            whiskey();
        }
    }

    public final void romeo(int i4) {
        if (i4 == -1) {
            if (!this.white) {
                this.white = true;
            } else {
                return;
            }
        } else {
            if (!this.white && this.teal == i4) {
                return;
            }
            this.white = false;
            this.teal = Math.max(0, i4);
        }
        zulu();
    }

    public final void sierra(int i4) {
        String str;
        int i5;
        if (i4 != 1 && i4 != 2) {
            if (!this.B && i4 == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i4);
                return;
            }
            if (i4 == 6 && this.purple && mike(i4) <= this.f7897w) {
                i5 = 3;
            } else {
                i5 = i4;
            }
            WeakReference weakReference = this.f7866P;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f7866P.get();
                D2.i iVar = new D2.i(this, view, i5);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                    view.post(iVar);
                    return;
                } else {
                    iVar.run();
                    return;
                }
            }
            tango(i4);
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

    public final void tango(int i4) {
        View view;
        if (this.f7857G != i4) {
            this.f7857G = i4;
            if (i4 != 4 && i4 != 3 && i4 != 6) {
                boolean z2 = this.B;
            }
            WeakReference weakReference = this.f7866P;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            int i5 = 0;
            if (i4 == 3) {
                yankee(true);
            } else if (i4 == 6 || i4 == 5 || i4 == 4) {
                yankee(false);
            }
            xray(i4, true);
            while (true) {
                ArrayList arrayList = this.f7867R;
                if (i5 < arrayList.size()) {
                    ((c) arrayList.get(i5)).charlie(i4, view);
                    i5++;
                } else {
                    whiskey();
                    return;
                }
            }
        }
    }

    public final boolean uniform(View view, float f5) {
        if (this.C) {
            return true;
        }
        if (view.getTop() < this.f7900z) {
            return false;
        }
        if (Math.abs(((f5 * this.f7862L) + view.getTop()) - this.f7900z) / golf() > 0.5f) {
            return true;
        }
        return false;
    }

    public final void victor(View view, int i4, boolean z2) {
        int mike = mike(i4);
        C3391d c3391d = this.f7858H;
        if (c3391d != null && (!z2 ? c3391d.sierra(view, view.getLeft(), mike) : c3391d.quebec(view.getLeft(), mike))) {
            tango(2);
            xray(i4, true);
            this.f7894t.charlie(i4);
            return;
        }
        tango(i4);
    }

    public final void whiskey() {
        View view;
        int i4;
        boolean z2;
        C2569b c2569b;
        WeakReference weakReference = this.f7866P;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            au.kilo(524288, view);
            au.hotel(0, view);
            au.kilo(262144, view);
            au.hotel(0, view);
            au.kilo(1048576, view);
            au.hotel(0, view);
            SparseIntArray sparseIntArray = this.f7874Y;
            int i5 = sparseIntArray.get(0, -1);
            if (i5 != -1) {
                au.kilo(i5, view);
                au.hotel(0, view);
                sparseIntArray.delete(0);
            }
            int i10 = 6;
            if (!this.purple && this.f7857G != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                Fe.c cVar = new Fe.c(this, i10, 10);
                ArrayList foxtrot = au.foxtrot(view);
                int i11 = 0;
                while (true) {
                    if (i11 < foxtrot.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C2951c) foxtrot.get(i11)).alpha).getLabel())) {
                            i4 = ((C2951c) foxtrot.get(i11)).alpha();
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = -1;
                        for (int i13 = 0; i13 < 32 && i12 == -1; i13++) {
                            int i14 = au.delta[i13];
                            boolean z10 = true;
                            for (int i15 = 0; i15 < foxtrot.size(); i15++) {
                                if (((C2951c) foxtrot.get(i15)).alpha() != i14) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                z10 &= z2;
                            }
                            if (z10) {
                                i12 = i14;
                            }
                        }
                        i4 = i12;
                    }
                }
                if (i4 != -1) {
                    C2951c c2951c = new C2951c(null, i4, string, cVar, null);
                    View.AccessibilityDelegate delta = au.delta(view);
                    if (delta == null) {
                        c2569b = null;
                    } else if (delta instanceof C2568a) {
                        c2569b = ((C2568a) delta).alpha;
                    } else {
                        c2569b = new C2569b(delta);
                    }
                    if (c2569b == null) {
                        c2569b = new C2569b();
                    }
                    au.november(view, c2569b);
                    au.kilo(c2951c.alpha(), view);
                    au.foxtrot(view).add(c2951c);
                    au.hotel(0, view);
                }
                sparseIntArray.put(0, i4);
            }
            if (this.B) {
                int i16 = 5;
                if (this.f7857G != 5) {
                    au.lima(view, C2951c.november, new Fe.c(this, i16, 10));
                }
            }
            int i17 = this.f7857G;
            int i18 = 4;
            int i19 = 3;
            if (i17 != 3) {
                if (i17 != 4) {
                    if (i17 == 6) {
                        au.lima(view, C2951c.mike, new Fe.c(this, i18, 10));
                        au.lima(view, C2951c.lima, new Fe.c(this, i19, 10));
                        return;
                    }
                    return;
                }
                if (this.purple) {
                    i10 = 3;
                }
                au.lima(view, C2951c.lima, new Fe.c(this, i10, 10));
                return;
            }
            if (this.purple) {
                i10 = 4;
            }
            au.lima(view, C2951c.mike, new Fe.c(this, i10, 10));
        }
    }

    public final void xray(int i4, boolean z2) {
        boolean z10;
        g7.i iVar = this.f7877b;
        ValueAnimator valueAnimator = this.f7895u;
        if (i4 != 2) {
            if (this.f7857G == 3 && (this.f7891q || november())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f7893s != z10 && iVar != null) {
                this.f7893s = z10;
                float f5 = 1.0f;
                if (z2 && valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.reverse();
                        return;
                    }
                    float f10 = iVar.purple.juliet;
                    if (z10) {
                        f5 = foxtrot();
                    }
                    valueAnimator.setFloatValues(f10, f5);
                    valueAnimator.start();
                    return;
                }
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                if (this.f7893s) {
                    f5 = foxtrot();
                }
                iVar.romeo(f5);
            }
        }
    }

    public final void yankee(boolean z2) {
        WeakReference weakReference = this.f7866P;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z2) {
                    if (this.f7873X == null) {
                        this.f7873X = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = coordinatorLayout.getChildAt(i4);
                    if (childAt != this.f7866P.get() && z2) {
                        this.f7873X.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z2) {
                    this.f7873X = null;
                }
            }
        }
    }

    public final void zulu() {
        View view;
        if (this.f7866P != null) {
            echo();
            if (this.f7857G == 4 && (view = (View) this.f7866P.get()) != null) {
                view.requestLayout();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public final int red;
        public final int silver;
        public final boolean teal;
        public final boolean white;
        public final boolean yellow;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.red = parcel.readInt();
            this.silver = parcel.readInt();
            this.teal = parcel.readInt() == 1;
            this.white = parcel.readInt() == 1;
            this.yellow = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.red);
            parcel.writeInt(this.silver);
            parcel.writeInt(this.teal ? 1 : 0);
            parcel.writeInt(this.white ? 1 : 0);
            parcel.writeInt(this.yellow ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.red = bottomSheetBehavior.f7857G;
            this.silver = bottomSheetBehavior.teal;
            this.teal = bottomSheetBehavior.purple;
            this.white = bottomSheetBehavior.B;
            this.yellow = bottomSheetBehavior.C;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i4;
        this.alpha = 0;
        this.purple = true;
        this.f7879d = -1;
        this.e = -1;
        this.f7894t = new o(this);
        this.f7899y = 0.5f;
        this.A = -1.0f;
        this.f7854D = true;
        this.f7855E = true;
        this.f7857G = 4;
        this.f7862L = 0.1f;
        this.f7867R = new ArrayList();
        this.f7871V = -1;
        this.f7874Y = new SparseIntArray();
        this.f7875Z = new b(this, 0);
        this.f7876a = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.a.echo);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f7878c = AbstractC2719n0.alpha(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.f7892r = g7.m.charlie(context, attributeSet, R.attr.bottomSheetStyle, 2132083657).alpha();
        }
        g7.m mVar = this.f7892r;
        if (mVar != null) {
            g7.i iVar = new g7.i(mVar);
            this.f7877b = iVar;
            iVar.mike(context);
            ColorStateList colorStateList = this.f7878c;
            if (colorStateList != null) {
                this.f7877b.quebec(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f7877b.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(foxtrot(), 1.0f);
        this.f7895u = ofFloat;
        ofFloat.setDuration(500L);
        this.f7895u.addUpdateListener(new a(this));
        this.A = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f7879d = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.e = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && (i4 = peekValue.data) == -1) {
            romeo(i4);
        } else {
            romeo(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        quebec(obtainStyledAttributes.getBoolean(9, false));
        this.f7881g = obtainStyledAttributes.getBoolean(14, false);
        papa(obtainStyledAttributes.getBoolean(7, true));
        this.C = obtainStyledAttributes.getBoolean(13, false);
        this.f7854D = obtainStyledAttributes.getBoolean(4, true);
        this.f7855E = obtainStyledAttributes.getBoolean(5, true);
        this.alpha = obtainStyledAttributes.getInt(11, 0);
        float f5 = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f5 > 0.0f && f5 < 1.0f) {
            this.f7899y = f5;
            if (this.f7866P != null) {
                this.f7898x = (int) ((1.0f - f5) * this.f7865O);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i5 = peekValue2.data;
                if (i5 >= 0) {
                    this.f7896v = i5;
                    xray(this.f7857G, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f7896v = dimensionPixelOffset;
                    xray(this.f7857G, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.silver = obtainStyledAttributes.getInt(12, HttpConstants.HTTP_INTERNAL_ERROR);
            this.f7882h = obtainStyledAttributes.getBoolean(18, false);
            this.f7883i = obtainStyledAttributes.getBoolean(19, false);
            this.f7884j = obtainStyledAttributes.getBoolean(20, false);
            this.f7885k = obtainStyledAttributes.getBoolean(21, true);
            this.f7886l = obtainStyledAttributes.getBoolean(15, false);
            this.f7887m = obtainStyledAttributes.getBoolean(16, false);
            this.f7888n = obtainStyledAttributes.getBoolean(17, false);
            this.f7891q = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.red = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
