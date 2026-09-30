package androidx.core.widget;

import ae.AbstractC0422a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.widget.P0;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import s1.C2574g;
import s1.C2584q;
import s1.C2586t;
import s1.C2592z;
import s1.InterfaceC2583p;
import s1.InterfaceC2585s;
import s1.ad;
import s1.ae;
import s1.al;
import s1.au;
import s1.av;
import t6.AbstractC3091z3;

/* loaded from: classes3.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC2585s, InterfaceC2583p {

    /* renamed from: v, reason: collision with root package name */
    public static final float f3037v = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: w, reason: collision with root package name */
    public static final I1.c f3038w = new I1.c(1);

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3039x = {R.attr.fillViewport};

    /* renamed from: a, reason: collision with root package name */
    public int f3040a;
    public final float alpha;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3041b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3042c;

    /* renamed from: d, reason: collision with root package name */
    public View f3043d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f3044f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3045g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3046h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3047i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3048j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3049k;

    /* renamed from: l, reason: collision with root package name */
    public int f3050l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f3051m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f3052n;

    /* renamed from: o, reason: collision with root package name */
    public int f3053o;

    /* renamed from: p, reason: collision with root package name */
    public int f3054p;
    public long purple;

    /* renamed from: q, reason: collision with root package name */
    public SavedState f3055q;

    /* renamed from: r, reason: collision with root package name */
    public final C2586t f3056r;
    public final Rect red;

    /* renamed from: s, reason: collision with root package name */
    public final C2584q f3057s;
    public final OverScroller silver;

    /* renamed from: t, reason: collision with root package name */
    public float f3058t;
    public final EdgeEffect teal;

    /* renamed from: u, reason: collision with root package name */
    public final C2574g f3059u;
    public final EdgeEffect white;
    public C2592z yellow;

    /* loaded from: classes3.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public int alpha;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" scrollPosition=");
            return P0.cyan(sb2, this.alpha, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.alpha);
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [s1.t, java.lang.Object] */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, delivery.samurai.android.R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.red = new Rect();
        this.f3041b = true;
        this.f3042c = false;
        this.f3043d = null;
        this.e = false;
        this.f3046h = true;
        this.f3050l = -1;
        this.f3051m = new int[2];
        this.f3052n = new int[2];
        this.f3059u = new C2574g(getContext(), new f(0, this));
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            edgeEffect = c.alpha(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.teal = edgeEffect;
        if (i4 >= 31) {
            edgeEffect2 = c.alpha(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.white = edgeEffect2;
        this.alpha = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.silver = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3047i = viewConfiguration.getScaledTouchSlop();
        this.f3048j = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3049k = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3039x, delivery.samurai.android.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3056r = new Object();
        this.f3057s = new C2584q(this);
        setNestedScrollingEnabled(true);
        au.november(this, f3038w);
    }

    private C2592z getScrollFeedbackProvider() {
        if (this.yellow == null) {
            this.yellow = new C2592z(this);
        }
        return this.yellow;
    }

    public static boolean golf(View view, NestedScrollView nestedScrollView) {
        if (view != nestedScrollView) {
            Object parent = view.getParent();
            if ((parent instanceof ViewGroup) && golf((View) parent, nestedScrollView)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final boolean alpha(int i4) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && hotel(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.red;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            november(bravo(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i4);
        } else {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            november(maxScrollAmount, -1, null, 0, 1, true);
        }
        if (view != null && view.isFocused() && !hotel(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final int bravo(Rect rect) {
        int i4;
        int i5;
        int i10;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i4 = i11 - verticalFadingEdgeLength;
        } else {
            i4 = i11;
        }
        int i12 = rect.bottom;
        if (i12 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i10 = rect.top - scrollY;
            } else {
                i10 = rect.bottom - i4;
            }
            return Math.min(i10, (childAt.getBottom() + layoutParams.bottomMargin) - i11);
        }
        if (rect.top >= scrollY || i12 >= i4) {
            return 0;
        }
        if (rect.height() > height) {
            i5 = 0 - (i4 - rect.bottom);
        } else {
            i5 = 0 - (scrollY - rect.top);
        }
        return Math.max(i5, -getScrollY());
    }

    public final boolean charlie(int i4, int i5, int[] iArr, int[] iArr2, int i10) {
        return this.f3057s.charlie(i4, i5, iArr, null, i10);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i4;
        int i5;
        if (this.silver.isFinished()) {
            return;
        }
        this.silver.computeScrollOffset();
        int currY = this.silver.getCurrY();
        int i10 = currY - this.f3054p;
        int height = getHeight();
        EdgeEffect edgeEffect = this.white;
        EdgeEffect edgeEffect2 = this.teal;
        if (i10 > 0 && AbstractC3091z3.charlie(edgeEffect2) != 0.0f) {
            round = Math.round(AbstractC3091z3.golf(edgeEffect2, ((-i10) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
            if (round != i10) {
                edgeEffect2.finish();
            }
        } else {
            if (i10 < 0 && AbstractC3091z3.charlie(edgeEffect) != 0.0f) {
                float f5 = height;
                round = Math.round(AbstractC3091z3.golf(edgeEffect, (i10 * 4.0f) / f5, 0.5f) * (f5 / 4.0f));
                if (round != i10) {
                    edgeEffect.finish();
                }
            }
            this.f3054p = currY;
            int[] iArr = this.f3052n;
            iArr[1] = 0;
            charlie(0, i10, iArr, null, 1);
            i4 = i10 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                e.alpha(this, Math.abs(this.silver.getCurrVelocity()));
            }
            if (i4 == 0) {
                int scrollY = getScrollY();
                kilo(i4, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i11 = i4 - scrollY2;
                iArr[1] = 0;
                i5 = 1;
                this.f3057s.delta(0, scrollY2, 0, i11, this.f3051m, 1, iArr);
                i4 = i11 - iArr[1];
            } else {
                i5 = 1;
            }
            if (i4 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == i5 && scrollRange > 0)) {
                    if (i4 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.silver.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.silver.getCurrVelocity());
                    }
                }
                this.silver.abortAnimation();
                sierra(i5);
            }
            if (this.silver.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                sierra(i5);
                return;
            }
        }
        i10 -= round;
        this.f3054p = currY;
        int[] iArr2 = this.f3052n;
        iArr2[1] = 0;
        charlie(0, i10, iArr2, null, 1);
        i4 = i10 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i4 == 0) {
        }
        if (i4 != 0) {
        }
        if (this.silver.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return (scrollY - max) + bottom;
        }
        return bottom;
    }

    public final boolean delta(KeyEvent keyEvent) {
        this.red.setEmpty();
        int i4 = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            if (keyCode != 62) {
                                if (keyCode != 92) {
                                    if (keyCode != 93) {
                                        if (keyCode != 122) {
                                            if (keyCode == 123) {
                                                lima(130);
                                                return false;
                                            }
                                        } else {
                                            lima(33);
                                            return false;
                                        }
                                    } else {
                                        return foxtrot(130);
                                    }
                                } else {
                                    return foxtrot(33);
                                }
                            } else {
                                if (keyEvent.isShiftPressed()) {
                                    i4 = 33;
                                }
                                lima(i4);
                                return false;
                            }
                        } else {
                            if (keyEvent.isAltPressed()) {
                                return foxtrot(130);
                            }
                            return alpha(130);
                        }
                    } else {
                        if (keyEvent.isAltPressed()) {
                            return foxtrot(33);
                        }
                        return alpha(33);
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !delta(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f5, float f10, boolean z2) {
        return this.f3057s.alpha(f5, f10, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f5, float f10) {
        return this.f3057s.bravo(f5, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f3057s.charlie(i4, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i10, int i11, int[] iArr) {
        return this.f3057s.delta(i4, i5, i10, i11, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.teal;
        int i5 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i4 = getPaddingLeft();
            } else {
                i4 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i4, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.white;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i5 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i5 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void echo(int i4) {
        if (getChildCount() > 0) {
            this.silver.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, RecyclerView.UNDEFINED_DURATION, LottieConstants.IterateForever, 0, 0);
            quebec(2, 1);
            this.f3054p = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                e.alpha(this, Math.abs(this.silver.getCurrVelocity()));
            }
        }
    }

    public final boolean foxtrot(int i4) {
        boolean z2;
        int childCount;
        if (i4 == 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = getHeight();
        Rect rect = this.red;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return mike(i4, rect.top, rect.bottom);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C2586t c2586t = this.f3056r;
        return c2586t.bravo | c2586t.alpha;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f3058t == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.f3058t = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f3058t;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f3057s.foxtrot(0);
    }

    public final boolean hotel(View view, int i4, int i5) {
        Rect rect = this.red;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i4 >= getScrollY() && rect.top - i4 <= getScrollY() + i5) {
            return true;
        }
        return false;
    }

    public final void india(int i4, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3057s.delta(0, scrollY2, 0, i4 - scrollY2, null, i5, iArr);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f3057s.delta;
    }

    public final void juliet(MotionEvent motionEvent) {
        int i4;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3050l) {
            if (actionIndex == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            this.f3040a = (int) motionEvent.getY(i4);
            this.f3050l = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f3044f;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean kilo(int i4, int i5, int i10, int i11) {
        int i12;
        boolean z2;
        int i13;
        boolean z10;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i14 = i10 + i4;
        if (i5 > 0 || i5 < 0) {
            i12 = 0;
            z2 = true;
        } else {
            i12 = i5;
            z2 = false;
        }
        if (i14 > i11) {
            i13 = i11;
        } else if (i14 < 0) {
            i13 = 0;
        } else {
            i13 = i14;
            z10 = false;
            if (z10 && !this.f3057s.foxtrot(1)) {
                this.silver.springBack(i12, i13, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i12, i13);
            if (!z2 || z10) {
                return true;
            }
            return false;
        }
        z10 = true;
        if (z10) {
            this.silver.springBack(i12, i13, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i12, i13);
        if (!z2) {
        }
        return true;
    }

    public final void lima(int i4) {
        boolean z2;
        if (i4 == 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = getHeight();
        Rect rect = this.red;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i5 = rect.top;
        int i10 = height + i5;
        rect.bottom = i10;
        mike(i4, i5, i10);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i4, int i5, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean mike(int i4, int i5, int i10) {
        boolean z2;
        View view;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = height + scrollY;
        if (i4 == 33) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view2 = null;
        boolean z13 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view3 = focusables.get(i13);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i5 < bottom && top < i10) {
                if (i5 < top && bottom < i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (view2 == null) {
                    view2 = view3;
                    z13 = z11;
                } else {
                    if ((z2 && top < view2.getTop()) || (!z2 && bottom > view2.getBottom())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z13) {
                        if (z11) {
                            if (!z12) {
                            }
                            view2 = view3;
                        }
                    } else if (z11) {
                        view2 = view3;
                        z13 = true;
                    } else {
                        if (!z12) {
                        }
                        view2 = view3;
                    }
                }
            }
        }
        if (view2 == null) {
            view = this;
        } else {
            view = view2;
        }
        if (i5 >= scrollY && i10 <= i12) {
            z10 = false;
        } else {
            if (z2) {
                i11 = i5 - scrollY;
            } else {
                i11 = i10 - i12;
            }
            november(i11, -1, null, 0, 1, true);
            z10 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int november(int i4, int i5, MotionEvent motionEvent, int i10, int i11, boolean z2) {
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        VelocityTracker velocityTracker;
        if (i11 == 1) {
            quebec(2, i11);
        }
        boolean charlie = this.f3057s.charlie(0, i4, this.f3052n, this.f3051m, i11);
        int[] iArr = this.f3052n;
        int[] iArr2 = this.f3051m;
        if (charlie) {
            i12 = i4 - iArr[1];
            i13 = iArr2[1];
        } else {
            i12 = i4;
            i13 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (kilo(i12, 0, scrollY, scrollRange) && !this.f3057s.foxtrot(i11)) {
            z11 = true;
        } else {
            z11 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().alpha.bravo(motionEvent.getDeviceId(), motionEvent.getSource(), i5, scrollY2);
        }
        iArr[1] = 0;
        this.f3057s.delta(0, scrollY2, 0, i12 - scrollY2, this.f3051m, i11, iArr);
        int i14 = i13 + iArr2[1];
        int i15 = i12 - iArr[1];
        int i16 = scrollY + i15;
        EdgeEffect edgeEffect = this.white;
        EdgeEffect edgeEffect2 = this.teal;
        if (i16 < 0) {
            if (z10) {
                AbstractC3091z3.golf(edgeEffect2, (-i15) / getHeight(), i10 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().alpha.alpha(motionEvent.getDeviceId(), motionEvent.getSource(), i5, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i16 > scrollRange && z10) {
            AbstractC3091z3.golf(edgeEffect, i15 / getHeight(), 1.0f - (i10 / getWidth()));
            if (motionEvent != null) {
                z12 = false;
                getScrollFeedbackProvider().alpha.alpha(motionEvent.getDeviceId(), motionEvent.getSource(), i5, false);
            } else {
                z12 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (!edgeEffect2.isFinished() && edgeEffect.isFinished()) {
                z13 = z11;
            } else {
                postInvalidateOnAnimation();
                z13 = z12;
            }
            if (z13 && i11 == 0 && (velocityTracker = this.f3044f) != null) {
                velocityTracker.clear();
            }
            if (i11 == 1) {
                sierra(i11);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i14;
        }
        z12 = false;
        if (!edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z13 = z12;
        if (z13) {
            velocityTracker.clear();
        }
        if (i11 == 1) {
        }
        return i14;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3042c = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0131, code lost:
    
        if (r6 >= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00dd, code lost:
    
        if (r7 >= 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02cb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z2;
        float f5;
        int i4;
        int i5;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int scaledMaximumFlingVelocity;
        boolean z12;
        VelocityTracker velocityTracker;
        float f10;
        float f11;
        long j5;
        float f12;
        float f13;
        float sqrt;
        int i15;
        float f14;
        VelocityTracker velocityTracker2;
        int i16;
        float f15;
        if (motionEvent.getAction() == 8 && !this.e) {
            if ((motionEvent.getSource() & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                float axisValue = motionEvent.getAxisValue(9);
                i5 = (int) motionEvent.getX();
                i4 = 9;
                f5 = axisValue;
            } else if ((motionEvent.getSource() & 4194304) == 4194304) {
                float axisValue2 = motionEvent.getAxisValue(26);
                i5 = getWidth() / 2;
                f5 = axisValue2;
                i4 = 26;
            } else {
                f5 = 0.0f;
                i4 = 0;
                i5 = 0;
            }
            if (f5 != 0.0f) {
                int verticalScrollFactorCompat = (int) (getVerticalScrollFactorCompat() * f5);
                if ((motionEvent.getSource() & 8194) == 8194) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                november(-verticalScrollFactorCompat, i4, motionEvent, i5, 1, z10);
                if (i4 != 0) {
                    C2574g c2574g = this.f3059u;
                    c2574g.getClass();
                    int source = motionEvent.getSource();
                    int deviceId = motionEvent.getDeviceId();
                    int i17 = c2574g.foxtrot;
                    int[] iArr = c2574g.hotel;
                    int i18 = 1;
                    if (i17 == source && c2574g.golf == deviceId && c2574g.echo == i4) {
                        z12 = false;
                        i10 = 20;
                        i11 = 0;
                    } else {
                        Context context = c2574g.alpha;
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                        i10 = 20;
                        int deviceId2 = motionEvent.getDeviceId();
                        int source2 = motionEvent.getSource();
                        i11 = 0;
                        int i19 = Build.VERSION.SDK_INT;
                        if (i19 >= 34) {
                            Method method = av.alpha;
                            i12 = AbstractC0422a.india(viewConfiguration, deviceId2, i4, source2);
                        } else {
                            Method method2 = av.alpha;
                            InputDevice device = InputDevice.getDevice(deviceId2);
                            if (device != null && device.getMotionRange(i4, source2) != null) {
                                Resources resources = context.getResources();
                                if (source2 == 4194304 && i4 == 26) {
                                    i13 = resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
                                } else {
                                    i13 = -1;
                                }
                                Objects.requireNonNull(viewConfiguration);
                                if (i13 != -1) {
                                    if (i13 != 0) {
                                        i12 = resources.getDimensionPixelSize(i13);
                                    }
                                } else {
                                    i12 = viewConfiguration.getScaledMinimumFlingVelocity();
                                }
                            }
                            i12 = LottieConstants.IterateForever;
                        }
                        iArr[0] = i12;
                        int deviceId3 = motionEvent.getDeviceId();
                        int source3 = motionEvent.getSource();
                        if (i19 >= 34) {
                            scaledMaximumFlingVelocity = AbstractC0422a.hotel(viewConfiguration, deviceId3, i4, source3);
                        } else {
                            InputDevice device2 = InputDevice.getDevice(deviceId3);
                            if (device2 != null && device2.getMotionRange(i4, source3) != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                Resources resources2 = context.getResources();
                                if (source3 == 4194304 && i4 == 26) {
                                    i14 = resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                                } else {
                                    i14 = -1;
                                }
                                Objects.requireNonNull(viewConfiguration);
                                if (i14 != -1) {
                                    if (i14 != 0) {
                                        scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(i14);
                                    }
                                } else {
                                    scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                                }
                            }
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                        iArr[1] = scaledMaximumFlingVelocity;
                        c2574g.foxtrot = source;
                        c2574g.golf = deviceId;
                        c2574g.echo = i4;
                        z12 = true;
                    }
                    if (iArr[i11] == Integer.MAX_VALUE) {
                        VelocityTracker velocityTracker3 = c2574g.charlie;
                        if (velocityTracker3 == null) {
                            return true;
                        }
                        velocityTracker3.recycle();
                        c2574g.charlie = null;
                        return true;
                    }
                    if (c2574g.charlie == null) {
                        c2574g.charlie = VelocityTracker.obtain();
                    }
                    VelocityTracker velocityTracker4 = c2574g.charlie;
                    Map map = ad.alpha;
                    velocityTracker4.addMovement(motionEvent);
                    if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                        Map map2 = ad.alpha;
                        if (!map2.containsKey(velocityTracker4)) {
                            map2.put(velocityTracker4, new ae());
                        }
                        ae aeVar = (ae) map2.get(velocityTracker4);
                        aeVar.getClass();
                        long eventTime = motionEvent.getEventTime();
                        int i20 = aeVar.delta;
                        long[] jArr = aeVar.bravo;
                        if (i20 != 0 && eventTime - jArr[aeVar.echo] > 40) {
                            aeVar.delta = i11;
                            aeVar.charlie = 0.0f;
                        }
                        int i21 = (aeVar.echo + 1) % 20;
                        aeVar.echo = i21;
                        int i22 = aeVar.delta;
                        if (i22 != i10) {
                            aeVar.delta = i22 + 1;
                        }
                        aeVar.alpha[i21] = motionEvent.getAxisValue(26);
                        jArr[aeVar.echo] = eventTime;
                    }
                    float f16 = Float.MAX_VALUE;
                    velocityTracker4.computeCurrentVelocity(1000, Float.MAX_VALUE);
                    ae aeVar2 = (ae) ad.alpha.get(velocityTracker4);
                    if (aeVar2 != null) {
                        int i23 = aeVar2.delta;
                        if (i23 >= 2) {
                            int i24 = aeVar2.echo;
                            int i25 = ((i24 + 20) - (i23 - 1)) % 20;
                            long[] jArr2 = aeVar2.bravo;
                            long j6 = jArr2[i24];
                            while (true) {
                                j5 = jArr2[i25];
                                if (j6 - j5 <= 100) {
                                    break;
                                }
                                aeVar2.delta--;
                                i25 = (i25 + 1) % 20;
                            }
                            int i26 = aeVar2.delta;
                            if (i26 >= 2) {
                                float[] fArr = aeVar2.alpha;
                                if (i26 == 2) {
                                    int i27 = (i25 + 1) % 20;
                                    long j7 = jArr2[i27];
                                    if (j5 != j7) {
                                        velocityTracker = velocityTracker4;
                                        f13 = Float.MAX_VALUE;
                                        i15 = 1000;
                                        sqrt = fArr[i27] / ((float) (j7 - j5));
                                    }
                                } else {
                                    float f17 = 0.0f;
                                    int i28 = 0;
                                    int i29 = 0;
                                    while (true) {
                                        f12 = 1.0f;
                                        if (i28 >= aeVar2.delta - 1) {
                                            break;
                                        }
                                        int i30 = i28 + i25;
                                        long j10 = jArr2[i30 % 20];
                                        int i31 = (i30 + 1) % 20;
                                        if (jArr2[i31] == j10) {
                                            velocityTracker2 = velocityTracker4;
                                            f14 = f16;
                                            i16 = i18;
                                        } else {
                                            i29++;
                                            if (f17 < 0.0f) {
                                                f12 = -1.0f;
                                            }
                                            f14 = f16;
                                            velocityTracker2 = velocityTracker4;
                                            float sqrt2 = f12 * ((float) Math.sqrt(Math.abs(f17) * 2.0f));
                                            float f18 = fArr[i31] / ((float) (jArr2[i31] - j10));
                                            float abs = (Math.abs(f18) * (f18 - sqrt2)) + f17;
                                            i16 = i18;
                                            if (i29 == i16) {
                                                abs *= 0.5f;
                                            }
                                            f17 = abs;
                                        }
                                        i28 += i16;
                                        f16 = f14;
                                        i18 = i16;
                                        velocityTracker4 = velocityTracker2;
                                    }
                                    velocityTracker = velocityTracker4;
                                    f13 = f16;
                                    if (f17 < 0.0f) {
                                        f12 = -1.0f;
                                    }
                                    sqrt = ((float) Math.sqrt(Math.abs(f17) * 2.0f)) * f12;
                                    i15 = 1000;
                                }
                                f15 = sqrt * i15;
                                aeVar2.charlie = f15;
                                if (f15 >= (-Math.abs(f13))) {
                                    aeVar2.charlie = -Math.abs(f13);
                                } else if (aeVar2.charlie > Math.abs(f13)) {
                                    aeVar2.charlie = Math.abs(f13);
                                }
                            }
                        }
                        velocityTracker = velocityTracker4;
                        f13 = Float.MAX_VALUE;
                        i15 = 1000;
                        sqrt = 0.0f;
                        f15 = sqrt * i15;
                        aeVar2.charlie = f15;
                        if (f15 >= (-Math.abs(f13))) {
                        }
                    } else {
                        velocityTracker = velocityTracker4;
                    }
                    if (Build.VERSION.SDK_INT >= 34) {
                        f10 = AbstractC0422a.charlie(velocityTracker, i4);
                    } else {
                        VelocityTracker velocityTracker5 = velocityTracker;
                        if (i4 == 0) {
                            f10 = velocityTracker5.getXVelocity();
                        } else if (i4 == 1) {
                            f10 = velocityTracker5.getYVelocity();
                        } else {
                            ae aeVar3 = (ae) ad.alpha.get(velocityTracker5);
                            if (aeVar3 != null && i4 == 26) {
                                f10 = aeVar3.charlie;
                            } else {
                                f10 = 0.0f;
                            }
                        }
                    }
                    NestedScrollView nestedScrollView = (NestedScrollView) c2574g.bravo.purple;
                    float f19 = f10 * (-nestedScrollView.getVerticalScrollFactorCompat());
                    float signum = Math.signum(f19);
                    if (z12 || (signum != Math.signum(c2574g.delta) && signum != 0.0f)) {
                        nestedScrollView.silver.abortAnimation();
                    }
                    if (Math.abs(f19) >= iArr[0]) {
                        float max = Math.max(-r4, Math.min(f19, iArr[1]));
                        if (max == 0.0f) {
                            f11 = 0.0f;
                        } else {
                            nestedScrollView.silver.abortAnimation();
                            nestedScrollView.echo((int) max);
                            f11 = max;
                        }
                        c2574g.delta = f11;
                        return true;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.e) {
            return true;
        }
        int i4 = action & 255;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 6) {
                            juliet(motionEvent);
                        }
                    }
                } else {
                    int i5 = this.f3050l;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f3040a) > this.f3047i && (2 & getNestedScrollAxes()) == 0) {
                                this.e = true;
                                this.f3040a = y10;
                                if (this.f3044f == null) {
                                    this.f3044f = VelocityTracker.obtain();
                                }
                                this.f3044f.addMovement(motionEvent);
                                this.f3053o = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.e = false;
            this.f3050l = -1;
            VelocityTracker velocityTracker = this.f3044f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3044f = null;
            }
            if (this.silver.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            sierra(0);
        } else {
            int y11 = (int) motionEvent.getY();
            int x4 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y11 >= childAt.getTop() - scrollY && y11 < childAt.getBottom() - scrollY && x4 >= childAt.getLeft() && x4 < childAt.getRight()) {
                    this.f3040a = y11;
                    this.f3050l = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f3044f;
                    if (velocityTracker2 == null) {
                        this.f3044f = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f3044f.addMovement(motionEvent);
                    this.silver.computeScrollOffset();
                    if (!romeo(motionEvent) && this.silver.isFinished()) {
                        z2 = false;
                    }
                    this.e = z2;
                    quebec(2, 0);
                }
            }
            if (!romeo(motionEvent) && this.silver.isFinished()) {
                z2 = false;
            }
            this.e = z2;
            VelocityTracker velocityTracker3 = this.f3044f;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f3044f = null;
            }
        }
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        int i12;
        super.onLayout(z2, i4, i5, i10, i11);
        int i13 = 0;
        this.f3041b = false;
        View view = this.f3043d;
        if (view != null && golf(view, this)) {
            View view2 = this.f3043d;
            Rect rect = this.red;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int bravo = bravo(rect);
            if (bravo != 0) {
                scrollBy(0, bravo);
            }
        }
        this.f3043d = null;
        if (!this.f3042c) {
            if (this.f3055q != null) {
                scrollTo(getScrollX(), this.f3055q.alpha);
                this.f3055q = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i12 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i12 = 0;
            }
            int paddingTop = ((i11 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i12 && scrollY >= 0) {
                i13 = paddingTop + scrollY > i12 ? i12 - paddingTop : scrollY;
            }
            if (i13 != scrollY) {
                scrollTo(getScrollX(), i13);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3042c = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f3045g && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f10, boolean z2) {
        if (!z2) {
            dispatchNestedFling(0.0f, f10, true);
            echo((int) f10);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f10) {
        return this.f3057s.bravo(f5, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        charlie(i4, i5, iArr, null, 0);
    }

    @Override // s1.InterfaceC2585s
    public final void onNestedScroll(View view, int i4, int i5, int i10, int i11, int i12, int[] iArr) {
        india(i11, i12, iArr);
    }

    @Override // s1.r
    public final void onNestedScrollAccepted(View view, View view2, int i4, int i5) {
        C2586t c2586t = this.f3056r;
        if (i5 == 1) {
            c2586t.bravo = i4;
        } else {
            c2586t.alpha = i4;
        }
        quebec(2, i5);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i4, int i5, boolean z2, boolean z10) {
        super.scrollTo(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        View findNextFocusFromRect;
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i4);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        }
        if (findNextFocusFromRect == null || !hotel(findNextFocusFromRect, 0, getHeight())) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i4, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3055q = savedState;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, androidx.core.widget.NestedScrollView$SavedState, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.alpha = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i4, int i5, int i10, int i11) {
        super.onScrollChanged(i4, i5, i10, i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i10, int i11) {
        super.onSizeChanged(i4, i5, i10, i11);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && hotel(findFocus, 0, i11)) {
            Rect rect = this.red;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int bravo = bravo(rect);
            if (bravo != 0) {
                if (this.f3046h) {
                    papa(0, bravo, false);
                } else {
                    scrollBy(0, bravo);
                }
            }
        }
    }

    @Override // s1.r
    public final boolean onStartNestedScroll(View view, View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    @Override // s1.r
    public final void onStopNestedScroll(View view, int i4) {
        C2586t c2586t = this.f3056r;
        if (i4 == 1) {
            c2586t.bravo = 0;
        } else {
            c2586t.alpha = 0;
        }
        sierra(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float golf;
        int round;
        int i4;
        ViewParent parent2;
        if (this.f3044f == null) {
            this.f3044f = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3053o = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f5 = 0.0f;
        obtain.offsetLocation(0.0f, this.f3053o);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.white;
            EdgeEffect edgeEffect2 = this.teal;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                juliet(motionEvent);
                                this.f3040a = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3050l));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f3040a = (int) motionEvent.getY(actionIndex);
                            this.f3050l = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.e && getChildCount() > 0 && this.silver.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                        this.f3050l = -1;
                        this.e = false;
                        VelocityTracker velocityTracker = this.f3044f;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f3044f = null;
                        }
                        sierra(0);
                        this.teal.onRelease();
                        this.white.onRelease();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3050l);
                    if (findPointerIndex == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + this.f3050l + " in onTouchEvent");
                    } else {
                        int y10 = (int) motionEvent.getY(findPointerIndex);
                        int i5 = this.f3040a - y10;
                        float x4 = motionEvent.getX(findPointerIndex) / getWidth();
                        float height = i5 / getHeight();
                        if (AbstractC3091z3.charlie(edgeEffect2) != 0.0f) {
                            golf = -AbstractC3091z3.golf(edgeEffect2, -height, x4);
                            if (AbstractC3091z3.charlie(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        } else {
                            if (AbstractC3091z3.charlie(edgeEffect) != 0.0f) {
                                golf = AbstractC3091z3.golf(edgeEffect, height, 1.0f - x4);
                                if (AbstractC3091z3.charlie(edgeEffect) == 0.0f) {
                                    edgeEffect.onRelease();
                                }
                            }
                            round = Math.round(f5 * getHeight());
                            if (round != 0) {
                                invalidate();
                            }
                            i4 = i5 - round;
                            if (!this.e && Math.abs(i4) > this.f3047i) {
                                parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.e = true;
                                i4 = i4 <= 0 ? i4 - this.f3047i : i4 + this.f3047i;
                            }
                            if (this.e) {
                                int november = november(i4, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                                this.f3040a = y10 - november;
                                this.f3053o += november;
                            }
                        }
                        f5 = golf;
                        round = Math.round(f5 * getHeight());
                        if (round != 0) {
                        }
                        i4 = i5 - round;
                        if (!this.e) {
                            parent2 = getParent();
                            if (parent2 != null) {
                            }
                            this.e = true;
                            if (i4 <= 0) {
                            }
                        }
                        if (this.e) {
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.f3044f;
                velocityTracker2.computeCurrentVelocity(1000, this.f3049k);
                int yVelocity = (int) velocityTracker2.getYVelocity(this.f3050l);
                if (Math.abs(yVelocity) >= this.f3048j) {
                    if (AbstractC3091z3.charlie(edgeEffect2) != 0.0f) {
                        if (oscar(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            echo(-yVelocity);
                        }
                    } else if (AbstractC3091z3.charlie(edgeEffect) != 0.0f) {
                        int i10 = -yVelocity;
                        if (oscar(edgeEffect, i10)) {
                            edgeEffect.onAbsorb(i10);
                        } else {
                            echo(i10);
                        }
                    } else {
                        int i11 = -yVelocity;
                        float f10 = i11;
                        if (!this.f3057s.bravo(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            echo(i11);
                        }
                    }
                } else if (this.silver.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f3050l = -1;
                this.e = false;
                VelocityTracker velocityTracker3 = this.f3044f;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f3044f = null;
                }
                sierra(0);
                this.teal.onRelease();
                this.white.onRelease();
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.e && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.silver.isFinished()) {
                this.silver.abortAnimation();
                sierra(1);
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f3040a = y11;
            this.f3050l = pointerId;
            quebec(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f3044f;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean oscar(EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        float charlie = AbstractC3091z3.charlie(edgeEffect) * getHeight();
        float abs = Math.abs(-i4) * 0.35f;
        float f5 = this.alpha * 0.015f;
        double log = Math.log(abs / f5);
        double d4 = f3037v;
        if (((float) (Math.exp((d4 / (d4 - 1.0d)) * log) * f5)) < charlie) {
            return true;
        }
        return false;
    }

    public final void papa(int i4, int i5, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.purple > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.silver.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                quebec(2, 1);
            } else {
                sierra(1);
            }
            this.f3054p = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.silver.isFinished()) {
                this.silver.abortAnimation();
                sierra(1);
            }
            scrollBy(i4, i5);
        }
        this.purple = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean quebec(int i4, int i5) {
        return this.f3057s.golf(2, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f3041b) {
            Rect rect = this.red;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int bravo = bravo(rect);
            if (bravo != 0) {
                scrollBy(0, bravo);
            }
        } else {
            this.f3043d = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        boolean z10;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int bravo = bravo(rect);
        if (bravo != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (z2) {
                scrollBy(0, bravo);
                return z10;
            }
            papa(0, bravo, false);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f3044f) != null) {
            velocityTracker.recycle();
            this.f3044f = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3041b = true;
        super.requestLayout();
    }

    public final boolean romeo(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.teal;
        if (AbstractC3091z3.charlie(edgeEffect) != 0.0f) {
            AbstractC3091z3.golf(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.white;
        if (AbstractC3091z3.charlie(edgeEffect2) != 0.0f) {
            AbstractC3091z3.golf(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z2;
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i4 >= 0) {
                if (width + i4 > width2) {
                    i4 = width2 - width;
                }
            } else {
                i4 = 0;
            }
            if (height < height2 && i5 >= 0) {
                if (height + i5 > height2) {
                    i5 = height2 - height;
                }
            } else {
                i5 = 0;
            }
            if (i4 != getScrollX() || i5 != getScrollY()) {
                super.scrollTo(i4, i5);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f3045g) {
            this.f3045g = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C2584q c2584q = this.f3057s;
        if (c2584q.delta) {
            WeakHashMap weakHashMap = au.alpha;
            al.november(c2584q.charlie);
        }
        c2584q.delta = z2;
    }

    public void setOnScrollChangeListener(g gVar) {
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f3046h = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void sierra(int i4) {
        this.f3057s.hotel(i4);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return this.f3057s.golf(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        sierra(0);
    }

    @Override // s1.r
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr, int i10) {
        charlie(i4, i5, iArr, null, i10);
    }

    @Override // s1.r
    public final void onNestedScroll(View view, int i4, int i5, int i10, int i11, int i12) {
        india(i11, i12, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return onStartNestedScroll(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i10, int i11) {
        india(i11, 0, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4) {
        if (getChildCount() <= 0) {
            super.addView(view, i4);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        onNestedScrollAccepted(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
