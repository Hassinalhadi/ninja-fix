package androidx.drawerlayout.widget;

import I1.b;
import I1.c;
import I1.d;
import I1.e;
import I1.f;
import a7.C0409d;
import a7.C0412g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.appcompat.widget.P0;
import androidx.camera.core.impl.ai;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.navigation.NavigationView;
import j1.C1929c;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import s1.a0;
import s1.al;
import s1.au;
import t1.C2951c;
import y1.C3391d;
import y1.InterfaceC3390c;

/* loaded from: classes3.dex */
public class DrawerLayout extends ViewGroup implements InterfaceC3390c {
    public static final boolean A;

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f3081w = {R.attr.colorPrimaryDark};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3082x = {R.attr.layout_gravity};

    /* renamed from: y, reason: collision with root package name */
    public static final boolean f3083y;

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f3084z;

    /* renamed from: a, reason: collision with root package name */
    public final C3391d f3085a;
    public final c alpha;

    /* renamed from: b, reason: collision with root package name */
    public final f f3086b;

    /* renamed from: c, reason: collision with root package name */
    public final f f3087c;

    /* renamed from: d, reason: collision with root package name */
    public int f3088d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3089f;

    /* renamed from: g, reason: collision with root package name */
    public int f3090g;

    /* renamed from: h, reason: collision with root package name */
    public int f3091h;

    /* renamed from: i, reason: collision with root package name */
    public int f3092i;

    /* renamed from: j, reason: collision with root package name */
    public int f3093j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3094k;

    /* renamed from: l, reason: collision with root package name */
    public d f3095l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3096m;

    /* renamed from: n, reason: collision with root package name */
    public float f3097n;

    /* renamed from: o, reason: collision with root package name */
    public float f3098o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f3099p;
    public float purple;

    /* renamed from: q, reason: collision with root package name */
    public WindowInsets f3100q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3101r;
    public final int red;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f3102s;
    public int silver;

    /* renamed from: t, reason: collision with root package name */
    public Rect f3103t;
    public float teal;

    /* renamed from: u, reason: collision with root package name */
    public Matrix f3104u;

    /* renamed from: v, reason: collision with root package name */
    public final D8.c f3105v;
    public final Paint white;
    public final C3391d yellow;

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public int red;
        public int silver;
        public int teal;
        public int white;
        public int yellow;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.red = 0;
            this.red = parcel.readInt();
            this.silver = parcel.readInt();
            this.teal = parcel.readInt();
            this.white = parcel.readInt();
            this.yellow = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.red);
            parcel.writeInt(this.silver);
            parcel.writeInt(this.teal);
            parcel.writeInt(this.white);
            parcel.writeInt(this.yellow);
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        boolean z2 = true;
        f3083y = true;
        f3084z = true;
        if (i4 < 29) {
            z2 = false;
        }
        A = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, android.view.View$OnApplyWindowInsetsListener] */
    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, delivery.samurai.android.R.attr.drawerLayoutStyle);
        this.alpha = new c(0);
        this.silver = -1728053248;
        this.white = new Paint();
        this.f3089f = true;
        this.f3090g = 3;
        this.f3091h = 3;
        this.f3092i = 3;
        this.f3093j = 3;
        this.f3105v = new D8.c(16, this);
        setDescendantFocusability(262144);
        float f5 = getResources().getDisplayMetrics().density;
        this.red = (int) ((64.0f * f5) + 0.5f);
        float f10 = f5 * 400.0f;
        f fVar = new f(this, 3);
        this.f3086b = fVar;
        f fVar2 = new f(this, 5);
        this.f3087c = fVar2;
        C3391d c3391d = new C3391d(getContext(), this, fVar);
        c3391d.bravo = (int) (c3391d.bravo * 1.0f);
        this.yellow = c3391d;
        c3391d.quebec = 1;
        c3391d.november = f10;
        fVar.bravo = c3391d;
        C3391d c3391d2 = new C3391d(getContext(), this, fVar2);
        c3391d2.bravo = (int) (1.0f * c3391d2.bravo);
        this.f3085a = c3391d2;
        c3391d2.quebec = 2;
        c3391d2.november = f10;
        fVar2.bravo = c3391d2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = au.alpha;
        setImportantForAccessibility(1);
        au.november(this, new b(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new Object());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3081w);
            try {
                this.f3099p = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, H1.a.alpha, delivery.samurai.android.R.attr.drawerLayoutStyle, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.purple = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.purple = getResources().getDimension(delivery.samurai.android.R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f3102s = new ArrayList();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static boolean india(View view) {
        WeakHashMap weakHashMap = au.alpha;
        if (view.getImportantForAccessibility() != 4 && view.getImportantForAccessibility() != 2) {
            return true;
        }
        return false;
    }

    public static boolean juliet(View view) {
        if (((e) view.getLayoutParams()).alpha == 0) {
            return true;
        }
        return false;
    }

    public static boolean kilo(View view) {
        if (lima(view)) {
            if ((((e) view.getLayoutParams()).delta & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean lima(View view) {
        int i4 = ((e) view.getLayoutParams()).alpha;
        WeakHashMap weakHashMap = au.alpha;
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, view.getLayoutDirection());
        if ((absoluteGravity & 3) != 0 || (absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i4, int i5) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        boolean z2 = false;
        while (true) {
            arrayList2 = this.f3102s;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (lima(childAt)) {
                if (kilo(childAt)) {
                    childAt.addFocusables(arrayList, i4, i5);
                    z2 = true;
                }
            } else {
                arrayList2.add(childAt);
            }
            i10++;
        }
        if (!z2) {
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) arrayList2.get(i11);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i4, i5);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (echo() == null && !lima(view)) {
            WeakHashMap weakHashMap = au.alpha;
            view.setImportantForAccessibility(1);
        } else {
            WeakHashMap weakHashMap2 = au.alpha;
            view.setImportantForAccessibility(4);
        }
        if (!f3083y) {
            au.november(view, this.alpha);
        }
    }

    public final boolean alpha(int i4, View view) {
        if ((hotel(view) & i4) == i4) {
            return true;
        }
        return false;
    }

    public final void bravo(View view, boolean z2) {
        if (lima(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.f3089f) {
                eVar.bravo = 0.0f;
                eVar.delta = 0;
            } else if (z2) {
                eVar.delta |= 4;
                if (alpha(3, view)) {
                    this.yellow.sierra(view, -view.getWidth(), view.getTop());
                } else {
                    this.f3085a.sierra(view, getWidth(), view.getTop());
                }
            } else {
                float f5 = ((e) view.getLayoutParams()).bravo;
                float width = view.getWidth();
                int i4 = ((int) (width * 0.0f)) - ((int) (f5 * width));
                if (!alpha(3, view)) {
                    i4 = -i4;
                }
                view.offsetLeftAndRight(i4);
                oscar(view, 0.0f);
                romeo(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void charlie(boolean z2) {
        boolean sierra;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            e eVar = (e) childAt.getLayoutParams();
            if (lima(childAt) && (!z2 || eVar.charlie)) {
                int width = childAt.getWidth();
                if (alpha(3, childAt)) {
                    sierra = this.yellow.sierra(childAt, -width, childAt.getTop());
                } else {
                    sierra = this.f3085a.sierra(childAt, getWidth(), childAt.getTop());
                }
                z10 |= sierra;
                eVar.charlie = false;
            }
        }
        f fVar = this.f3086b;
        fVar.delta.removeCallbacks(fVar.charlie);
        f fVar2 = this.f3087c;
        fVar2.delta.removeCallbacks(fVar2.charlie);
        if (z10) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof e) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f5 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            f5 = Math.max(f5, ((e) getChildAt(i4).getLayoutParams()).bravo);
        }
        this.teal = f5;
        boolean golf = this.yellow.golf();
        boolean golf2 = this.f3085a.golf();
        if (!golf && !golf2) {
            return;
        }
        WeakHashMap weakHashMap = au.alpha;
        postInvalidateOnAnimation();
    }

    public final View delta(int i4) {
        WeakHashMap weakHashMap = au.alpha;
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((hotel(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.teal > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x4 = motionEvent.getX();
                float y10 = motionEvent.getY();
                for (int i4 = childCount - 1; i4 >= 0; i4--) {
                    View childAt = getChildAt(i4);
                    if (this.f3103t == null) {
                        this.f3103t = new Rect();
                    }
                    childAt.getHitRect(this.f3103t);
                    if (this.f3103t.contains((int) x4, (int) y10) && !juliet(childAt)) {
                        if (!childAt.getMatrix().isIdentity()) {
                            float scrollX = getScrollX() - childAt.getLeft();
                            float scrollY = getScrollY() - childAt.getTop();
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.offsetLocation(scrollX, scrollY);
                            Matrix matrix = childAt.getMatrix();
                            if (!matrix.isIdentity()) {
                                if (this.f3104u == null) {
                                    this.f3104u = new Matrix();
                                }
                                matrix.invert(this.f3104u);
                                obtain.transform(this.f3104u);
                            }
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                            obtain.recycle();
                        } else {
                            float scrollX2 = getScrollX() - childAt.getLeft();
                            float scrollY2 = getScrollY() - childAt.getTop();
                            motionEvent.offsetLocation(scrollX2, scrollY2);
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                            motionEvent.offsetLocation(-scrollX2, -scrollY2);
                        }
                        if (dispatchGenericMotionEvent) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j5) {
        Drawable background;
        int height = getHeight();
        boolean juliet = juliet(view);
        int width = getWidth();
        int save = canvas.save();
        int i4 = 0;
        if (juliet) {
            int childCount = getChildCount();
            int i5 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && lima(childAt) && childAt.getHeight() >= height) {
                    if (alpha(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i5) {
                            i5 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i5, 0, width, getHeight());
            i4 = i5;
        }
        boolean drawChild = super.drawChild(canvas, view, j5);
        canvas.restoreToCount(save);
        float f5 = this.teal;
        if (f5 > 0.0f && juliet) {
            int i11 = this.silver;
            Paint paint = this.white;
            paint.setColor((((int) ((((-16777216) & i11) >>> 24) * f5)) << 24) | (i11 & 16777215));
            canvas.drawRect(i4, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    public final View echo() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((((e) childAt.getLayoutParams()).delta & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View foxtrot() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (lima(childAt)) {
                if (lima(childAt)) {
                    if (((e) childAt.getLayoutParams()).bravo > 0.0f) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, I1.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.alpha = 0;
        return marginLayoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, I1.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, I1.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, I1.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            e eVar = (e) layoutParams;
            ?? marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) eVar);
            marginLayoutParams.alpha = 0;
            marginLayoutParams.alpha = eVar.alpha;
            return marginLayoutParams;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? marginLayoutParams2 = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            marginLayoutParams2.alpha = 0;
            return marginLayoutParams2;
        }
        ?? marginLayoutParams3 = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams3.alpha = 0;
        return marginLayoutParams3;
    }

    public float getDrawerElevation() {
        if (f3084z) {
            return this.purple;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f3099p;
    }

    public final int golf(View view) {
        int i4;
        int i5;
        int i10;
        int i11;
        if (lima(view)) {
            int i12 = ((e) view.getLayoutParams()).alpha;
            WeakHashMap weakHashMap = au.alpha;
            int layoutDirection = getLayoutDirection();
            if (i12 != 3) {
                if (i12 != 5) {
                    if (i12 != 8388611) {
                        if (i12 == 8388613) {
                            int i13 = this.f3093j;
                            if (i13 != 3) {
                                return i13;
                            }
                            if (layoutDirection == 0) {
                                i11 = this.f3091h;
                            } else {
                                i11 = this.f3090g;
                            }
                            if (i11 != 3) {
                                return i11;
                            }
                            return 0;
                        }
                        return 0;
                    }
                    int i14 = this.f3092i;
                    if (i14 != 3) {
                        return i14;
                    }
                    if (layoutDirection == 0) {
                        i10 = this.f3090g;
                    } else {
                        i10 = this.f3091h;
                    }
                    if (i10 != 3) {
                        return i10;
                    }
                    return 0;
                }
                int i15 = this.f3091h;
                if (i15 != 3) {
                    return i15;
                }
                if (layoutDirection == 0) {
                    i5 = this.f3093j;
                } else {
                    i5 = this.f3092i;
                }
                if (i5 != 3) {
                    return i5;
                }
                return 0;
            }
            int i16 = this.f3090g;
            if (i16 != 3) {
                return i16;
            }
            if (layoutDirection == 0) {
                i4 = this.f3092i;
            } else {
                i4 = this.f3093j;
            }
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int hotel(View view) {
        int i4 = ((e) view.getLayoutParams()).alpha;
        WeakHashMap weakHashMap = au.alpha;
        return Gravity.getAbsoluteGravity(i4, getLayoutDirection());
    }

    public final void mike(View view) {
        if (lima(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.f3089f) {
                eVar.bravo = 1.0f;
                eVar.delta = 1;
                quebec(view, true);
                papa(view);
            } else {
                eVar.delta |= 2;
                if (alpha(3, view)) {
                    this.yellow.sierra(view, 0, view.getTop());
                } else {
                    this.f3085a.sierra(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void november(int i4, int i5) {
        View delta;
        C3391d c3391d;
        WeakHashMap weakHashMap = au.alpha;
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, getLayoutDirection());
        if (i5 != 3) {
            if (i5 != 5) {
                if (i5 != 8388611) {
                    if (i5 == 8388613) {
                        this.f3093j = i4;
                    }
                } else {
                    this.f3092i = i4;
                }
            } else {
                this.f3091h = i4;
            }
        } else {
            this.f3090g = i4;
        }
        if (i4 != 0) {
            if (absoluteGravity == 3) {
                c3391d = this.yellow;
            } else {
                c3391d = this.f3085a;
            }
            c3391d.alpha();
        }
        if (i4 != 1) {
            if (i4 == 2 && (delta = delta(absoluteGravity)) != null) {
                mike(delta);
                return;
            }
            return;
        }
        View delta2 = delta(absoluteGravity);
        if (delta2 != null) {
            bravo(delta2, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3089f = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3089f = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i4;
        super.onDraw(canvas);
        if (this.f3101r && this.f3099p != null) {
            WindowInsets windowInsets = this.f3100q;
            if (windowInsets != null) {
                i4 = windowInsets.getSystemWindowInsetTop();
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                this.f3099p.setBounds(0, 0, getWidth(), i4);
                this.f3099p.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != 3) goto L19;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        View hotel;
        int actionMasked = motionEvent.getActionMasked();
        C3391d c3391d = this.yellow;
        boolean romeo = c3391d.romeo(motionEvent) | this.f3085a.romeo(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int length = c3391d.delta.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        if ((c3391d.kilo & (1 << i4)) != 0) {
                            float f5 = c3391d.foxtrot[i4] - c3391d.delta[i4];
                            float f10 = c3391d.golf[i4] - c3391d.echo[i4];
                            float f11 = (f10 * f10) + (f5 * f5);
                            int i5 = c3391d.bravo;
                            if (f11 > i5 * i5) {
                                f fVar = this.f3086b;
                                fVar.delta.removeCallbacks(fVar.charlie);
                                f fVar2 = this.f3087c;
                                fVar2.delta.removeCallbacks(fVar2.charlie);
                                break;
                            }
                        }
                        i4++;
                    }
                }
                z2 = false;
            }
            charlie(true);
            this.f3094k = false;
            z2 = false;
        } else {
            float x4 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f3097n = x4;
            this.f3098o = y10;
            if (this.teal > 0.0f && (hotel = c3391d.hotel((int) x4, (int) y10)) != null && juliet(hotel)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f3094k = false;
        }
        if (!romeo && !z2) {
            int childCount = getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    if (((e) getChildAt(i10).getLayoutParams()).charlie) {
                        break;
                    }
                    i10++;
                } else {
                    if (this.f3094k) {
                        break;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && foxtrot() != null) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            View foxtrot = foxtrot();
            if (foxtrot != null && golf(foxtrot) == 0) {
                charlie(false);
            }
            if (foxtrot == null) {
                return false;
            }
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        WindowInsets rootWindowInsets;
        float f5;
        int i12;
        boolean z10;
        int i13;
        boolean z11 = true;
        this.e = true;
        int i14 = i10 - i4;
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (juliet(childAt)) {
                    int i16 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i16, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (alpha(3, childAt)) {
                        float f10 = measuredWidth;
                        i12 = (-measuredWidth) + ((int) (eVar.bravo * f10));
                        f5 = (measuredWidth + i12) / f10;
                    } else {
                        float f11 = measuredWidth;
                        f5 = (i14 - r11) / f11;
                        i12 = i14 - ((int) (eVar.bravo * f11));
                    }
                    if (f5 != eVar.bravo) {
                        z10 = z11;
                    } else {
                        z10 = false;
                    }
                    int i17 = eVar.alpha & 112;
                    if (i17 != 16) {
                        if (i17 != 80) {
                            int i18 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                            childAt.layout(i12, i18, measuredWidth + i12, measuredHeight + i18);
                        } else {
                            int i19 = i11 - i5;
                            childAt.layout(i12, (i19 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i12, i19 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                        }
                    } else {
                        int i20 = i11 - i5;
                        int i21 = (i20 - measuredHeight) / 2;
                        int i22 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i21 < i22) {
                            i21 = i22;
                        } else {
                            int i23 = i21 + measuredHeight;
                            int i24 = i20 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i23 > i24) {
                                i21 = i24 - measuredHeight;
                            }
                        }
                        childAt.layout(i12, i21, measuredWidth + i12, measuredHeight + i21);
                    }
                    if (z10) {
                        oscar(childAt, f5);
                    }
                    if (eVar.bravo > 0.0f) {
                        i13 = 0;
                    } else {
                        i13 = 4;
                    }
                    if (childAt.getVisibility() != i13) {
                        childAt.setVisibility(i13);
                    }
                }
            }
            i15++;
            z11 = true;
        }
        if (A && (rootWindowInsets = getRootWindowInsets()) != null) {
            C1929c kilo = a0.hotel(null, rootWindowInsets).alpha.kilo();
            C3391d c3391d = this.yellow;
            c3391d.oscar = Math.max(c3391d.papa, kilo.alpha);
            C3391d c3391d2 = this.f3085a;
            c3391d2.oscar = Math.max(c3391d2.papa, kilo.charlie);
        }
        this.e = false;
        this.f3089f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i4, int i5) {
        boolean z2;
        int childCount;
        int i10;
        boolean z10;
        int i11;
        String str;
        int i12 = 3;
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        char c3 = 0;
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f3100q != null) {
            WeakHashMap weakHashMap = au.alpha;
            if (getFitsSystemWindows()) {
                z2 = true;
                WeakHashMap weakHashMap2 = au.alpha;
                int layoutDirection = getLayoutDirection();
                childCount = getChildCount();
                i10 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (i10 < childCount) {
                    View childAt = getChildAt(i10);
                    if (childAt.getVisibility() != 8) {
                        e eVar = (e) childAt.getLayoutParams();
                        if (z2) {
                            int absoluteGravity = Gravity.getAbsoluteGravity(eVar.alpha, layoutDirection);
                            if (childAt.getFitsSystemWindows()) {
                                WindowInsets windowInsets = this.f3100q;
                                if (absoluteGravity == i12) {
                                    windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                                } else if (absoluteGravity == 5) {
                                    windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                                }
                                childAt.dispatchApplyWindowInsets(windowInsets);
                            } else {
                                WindowInsets windowInsets2 = this.f3100q;
                                if (absoluteGravity == 3) {
                                    windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                                } else if (absoluteGravity == 5) {
                                    windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                                }
                                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                                ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                            }
                        }
                        if (juliet(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                        } else if (lima(childAt)) {
                            if (f3084z) {
                                float echo = al.echo(childAt);
                                float f5 = this.purple;
                                if (echo != f5) {
                                    al.kilo(childAt, f5);
                                }
                            }
                            int hotel = hotel(childAt);
                            int i13 = hotel & 7;
                            if (i13 == 3) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if ((!z10 || !z11) && (z10 || !z12)) {
                                i11 = 3;
                                if (z10) {
                                    z11 = true;
                                } else {
                                    z12 = true;
                                }
                                childAt.measure(ViewGroup.getChildMeasureSpec(i4, this.red + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i5, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                                i10++;
                                i12 = i11;
                                c3 = 0;
                            } else {
                                StringBuilder sb2 = new StringBuilder("Child drawer has absolute gravity ");
                                if ((hotel & 3) != 3) {
                                    if ((hotel & 5) == 5) {
                                        str = "RIGHT";
                                    } else {
                                        str = Integer.toHexString(i13);
                                    }
                                } else {
                                    str = "LEFT";
                                }
                                throw new IllegalStateException(P0.gold(sb2, str, " but this DrawerLayout already has a drawer view along that edge"));
                            }
                        } else {
                            throw new IllegalStateException("Child " + childAt + " at index " + i10 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                        }
                    }
                    i11 = 3;
                    i10++;
                    i12 = i11;
                    c3 = 0;
                }
            }
        }
        z2 = false;
        WeakHashMap weakHashMap22 = au.alpha;
        int layoutDirection2 = getLayoutDirection();
        childCount = getChildCount();
        i10 = 0;
        boolean z112 = false;
        boolean z122 = false;
        while (i10 < childCount) {
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View delta;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.alpha);
        int i4 = savedState.red;
        if (i4 != 0 && (delta = delta(i4)) != null) {
            mike(delta);
        }
        int i5 = savedState.silver;
        if (i5 != 3) {
            november(i5, 3);
        }
        int i10 = savedState.teal;
        if (i10 != 3) {
            november(i10, 5);
        }
        int i11 = savedState.white;
        if (i11 != 3) {
            november(i11, 8388611);
        }
        int i12 = savedState.yellow;
        if (i12 != 3) {
            november(i12, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        if (f3084z) {
            return;
        }
        WeakHashMap weakHashMap = au.alpha;
        getLayoutDirection();
        getLayoutDirection();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.drawerlayout.widget.DrawerLayout$SavedState, android.os.Parcelable, androidx.customview.view.AbsSavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.red = 0;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            e eVar = (e) getChildAt(i4).getLayoutParams();
            int i5 = eVar.delta;
            boolean z10 = true;
            if (i5 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i5 != 2) {
                z10 = false;
            }
            if (z2 || z10) {
                absSavedState.red = eVar.alpha;
                break;
            }
        }
        absSavedState.silver = this.f3090g;
        absSavedState.teal = this.f3091h;
        absSavedState.white = this.f3092i;
        absSavedState.yellow = this.f3093j;
        return absSavedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (golf(r7) != 2) goto L21;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3391d c3391d = this.yellow;
        c3391d.kilo(motionEvent);
        this.f3085a.kilo(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z2 = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 3) {
                    return true;
                }
                charlie(true);
                this.f3094k = false;
                return true;
            }
            float x4 = motionEvent.getX();
            float y10 = motionEvent.getY();
            View hotel = c3391d.hotel((int) x4, (int) y10);
            if (hotel != null && juliet(hotel)) {
                float f5 = x4 - this.f3097n;
                float f10 = y10 - this.f3098o;
                int i4 = c3391d.bravo;
                if ((f10 * f10) + (f5 * f5) < i4 * i4) {
                    View echo = echo();
                    if (echo != null) {
                    }
                }
            }
            z2 = true;
            charlie(z2);
            return true;
        }
        float x5 = motionEvent.getX();
        float y11 = motionEvent.getY();
        this.f3097n = x5;
        this.f3098o = y11;
        this.f3094k = false;
        return true;
    }

    public final void oscar(View view, float f5) {
        e eVar = (e) view.getLayoutParams();
        if (f5 != eVar.bravo) {
            eVar.bravo = f5;
            ArrayList arrayList = this.f3096m;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((d) this.f3096m.get(size)).getClass();
                }
            }
        }
    }

    public final void papa(View view) {
        C2951c c2951c = C2951c.november;
        au.kilo(c2951c.alpha(), view);
        au.hotel(0, view);
        if (kilo(view) && golf(view) != 2) {
            au.lima(view, c2951c, this.f3105v);
        }
    }

    public final void quebec(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((!z2 && !lima(childAt)) || (z2 && childAt == view)) {
                WeakHashMap weakHashMap = au.alpha;
                childAt.setImportantForAccessibility(1);
            } else {
                WeakHashMap weakHashMap2 = au.alpha;
                childAt.setImportantForAccessibility(4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            charlie(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (!this.e) {
            super.requestLayout();
        }
    }

    public final void romeo(int i4, View view) {
        int i5;
        View rootView;
        int i10 = this.yellow.alpha;
        int i11 = this.f3085a.alpha;
        if (i10 != 1 && i11 != 1) {
            i5 = 2;
            if (i10 != 2 && i11 != 2) {
                i5 = 0;
            }
        } else {
            i5 = 1;
        }
        if (view != null && i4 == 0) {
            float f5 = ((e) view.getLayoutParams()).bravo;
            if (f5 == 0.0f) {
                e eVar = (e) view.getLayoutParams();
                if ((eVar.delta & 1) == 1) {
                    eVar.delta = 0;
                    ArrayList arrayList = this.f3096m;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            NavigationView navigationView = ((com.google.android.material.navigation.e) ((d) this.f3096m.get(size))).alpha;
                            if (view == navigationView) {
                                C0412g c0412g = navigationView.f8102q;
                                C0409d c0409d = c0412g.alpha;
                                if (c0409d != null) {
                                    c0409d.charlie(c0412g.charlie);
                                }
                                if (navigationView.f8098m && navigationView.f8097l != 0) {
                                    navigationView.f8097l = 0;
                                    navigationView.golf(navigationView.getWidth(), navigationView.getHeight());
                                }
                            }
                        }
                    }
                    quebec(view, false);
                    papa(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f5 == 1.0f) {
                e eVar2 = (e) view.getLayoutParams();
                if ((eVar2.delta & 1) == 0) {
                    eVar2.delta = 1;
                    ArrayList arrayList2 = this.f3096m;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            NavigationView navigationView2 = ((com.google.android.material.navigation.e) ((d) this.f3096m.get(size2))).alpha;
                            if (view == navigationView2) {
                                C0412g c0412g2 = navigationView2.f8102q;
                                Objects.requireNonNull(c0412g2);
                                view.post(new ai(23, c0412g2));
                            }
                        }
                    }
                    quebec(view, true);
                    papa(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i5 != this.f3088d) {
            this.f3088d = i5;
            ArrayList arrayList3 = this.f3096m;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((d) this.f3096m.get(size3)).getClass();
                }
            }
        }
    }

    public void setDrawerElevation(float f5) {
        this.purple = f5;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (lima(childAt)) {
                float f10 = this.purple;
                WeakHashMap weakHashMap = au.alpha;
                al.kilo(childAt, f10);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        ArrayList arrayList;
        d dVar2 = this.f3095l;
        if (dVar2 != null && (arrayList = this.f3096m) != null) {
            arrayList.remove(dVar2);
        }
        if (dVar != null) {
            if (this.f3096m == null) {
                this.f3096m = new ArrayList();
            }
            this.f3096m.add(dVar);
        }
        this.f3095l = dVar;
    }

    public void setDrawerLockMode(int i4) {
        november(i4, 3);
        november(i4, 5);
    }

    public void setScrimColor(int i4) {
        this.silver = i4;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f3099p = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i4) {
        this.f3099p = new ColorDrawable(i4);
        invalidate();
    }

    public void setStatusBarBackground(int i4) {
        this.f3099p = i4 != 0 ? getContext().getDrawable(i4) : null;
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, I1.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.alpha = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3082x);
        marginLayoutParams.alpha = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return marginLayoutParams;
    }
}
