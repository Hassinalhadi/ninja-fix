package androidx.coordinatorlayout.widget;

import Sb.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.customview.view.AbsSavedState;
import av.q;
import bv.aw;
import delivery.samurai.android.R;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import r1.C2486e;
import r1.InterfaceC2485d;
import s1.C2586t;
import s1.InterfaceC2585s;
import s1.InterfaceC2587u;
import s1.a0;
import s1.aj;
import s1.al;
import s1.au;
import s1.r;

/* loaded from: classes3.dex */
public class CoordinatorLayout extends ViewGroup implements r, InterfaceC2585s {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<c>>> sConstructors;
    private static final InterfaceC2485d sRectPool;
    private InterfaceC2587u mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final i mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private a0 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final C2586t mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private g mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public SparseArray red;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.red = new SparseArray(readInt);
            for (int i4 = 0; i4 < readInt; i4++) {
                this.red.append(iArr[i4], readParcelableArray[i4]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            int i5;
            super.writeToParcel(parcel, i4);
            SparseArray sparseArray = this.red;
            if (sparseArray != null) {
                i5 = sparseArray.size();
            } else {
                i5 = 0;
            }
            parcel.writeInt(i5);
            int[] iArr = new int[i5];
            Parcelable[] parcelableArr = new Parcelable[i5];
            for (int i10 = 0; i10 < i5; i10++) {
                iArr[i10] = this.red.keyAt(i10);
                parcelableArr[i10] = (Parcelable) this.red.valueAt(i10);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i4);
        }
    }

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        WIDGET_PACKAGE_NAME = str;
        TOP_SORTED_CHILDREN_COMPARATOR = new k(11);
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new C2486e(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public static Rect alpha() {
        Rect rect = (Rect) sRectPool.charlie();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void charlie(int i4, Rect rect, Rect rect2, f fVar, int i5, int i10) {
        int width;
        int height;
        int i11 = fVar.charlie;
        if (i11 == 0) {
            i11 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, i4);
        int i12 = fVar.delta;
        if ((i12 & 7) == 0) {
            i12 |= 8388611;
        }
        if ((i12 & 112) == 0) {
            i12 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, i4);
        int i13 = absoluteGravity & 7;
        int i14 = absoluteGravity & 112;
        int i15 = absoluteGravity2 & 7;
        int i16 = absoluteGravity2 & 112;
        if (i15 != 1) {
            if (i15 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i16 != 16) {
            if (i16 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i13 != 1) {
            if (i13 != 5) {
                width -= i5;
            }
        } else {
            width -= i5 / 2;
        }
        if (i14 != 16) {
            if (i14 != 80) {
                height -= i10;
            }
        } else {
            height -= i10 / 2;
        }
        rect2.set(width, height, i5 + width, i10 + height);
    }

    public static void hotel(int i4, View view) {
        f fVar = (f) view.getLayoutParams();
        int i5 = fVar.india;
        if (i5 != i4) {
            WeakHashMap weakHashMap = au.alpha;
            view.offsetLeftAndRight(i4 - i5);
            fVar.india = i4;
        }
    }

    public static void india(int i4, View view) {
        f fVar = (f) view.getLayoutParams();
        int i5 = fVar.juliet;
        if (i5 != i4) {
            WeakHashMap weakHashMap = au.alpha;
            view.offsetTopAndBottom(i4 - i5);
            fVar.juliet = i4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = sConstructors;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException(q.echo("Could not inflate Behavior subclass ", str), e);
        }
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    public final void bravo(f fVar, Rect rect, int i4, int i5) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i4) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i5) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i4 + max, i5 + max2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    public final int delta(int i4) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i4);
            return 0;
        }
        if (i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        }
        Log.e(TAG, "Keyline index " + i4 + " out of range for " + this);
        return 0;
    }

    public void dispatchDependentViewsChanged(View view) {
        List list = (List) this.mChildDag.bravo.get(view);
        if (list != null && !list.isEmpty()) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                View view2 = (View) list.get(i4);
                c cVar = ((f) view2.getLayoutParams()).alpha;
                if (cVar != null) {
                    cVar.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    public boolean doViewsOverlap(View view, View view2) {
        boolean z2;
        boolean z10;
        boolean z11 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect alpha = alpha();
        if (view.getParent() != this) {
            z2 = true;
        } else {
            z2 = false;
        }
        getChildRect(view, z2, alpha);
        Rect alpha2 = alpha();
        if (view2.getParent() != this) {
            z10 = true;
        } else {
            z10 = false;
        }
        getChildRect(view2, z10, alpha2);
        try {
            if (alpha.left <= alpha2.right && alpha.top <= alpha2.bottom && alpha.right >= alpha2.left) {
                if (alpha.bottom >= alpha2.top) {
                    z11 = true;
                }
            }
            return z11;
        } finally {
            alpha.setEmpty();
            InterfaceC2485d interfaceC2485d = sRectPool;
            interfaceC2485d.alpha(alpha);
            alpha2.setEmpty();
            interfaceC2485d.alpha(alpha2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j5) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.alpha;
        if (cVar != null) {
            float scrimOpacity = cVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(fVar.alpha.getScrimColor(this, view));
                Paint paint = this.mScrimPaint;
                int round = Math.round(scrimOpacity * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(save);
                return super.drawChild(canvas, view, j5);
            }
        }
        return super.drawChild(canvas, view, j5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z2;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if (drawable != null && drawable.isStateful()) {
            z2 = drawable.setState(drawableState);
        } else {
            z2 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    public final boolean echo(MotionEvent motionEvent, int i4) {
        boolean z2;
        boolean z10;
        int i5;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            if (isChildrenDrawingOrderEnabled) {
                i5 = getChildDrawingOrder(childCount, i10);
            } else {
                i5 = i10;
            }
            list.add(getChildAt(i5));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.alpha;
            boolean z13 = true;
            if ((z11 || z12) && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i4 != 0) {
                        if (i4 == 1) {
                            cVar.onTouchEvent(this, view, motionEvent2);
                        }
                    } else {
                        cVar.onInterceptTouchEvent(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z11 && cVar != null) {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            z11 = cVar.onTouchEvent(this, view, motionEvent);
                        }
                    } else {
                        z11 = cVar.onInterceptTouchEvent(this, view, motionEvent);
                    }
                    if (z11) {
                        this.mBehaviorTouchView = view;
                    }
                }
                c cVar2 = fVar.alpha;
                if (cVar2 == null) {
                    fVar.mike = false;
                }
                boolean z14 = fVar.mike;
                if (z14) {
                    z10 = true;
                } else {
                    if (cVar2 != null) {
                        z2 = cVar2.blocksInteractionBelow(this, view);
                    } else {
                        z2 = false;
                    }
                    z10 = z2 | z14;
                    fVar.mike = z10;
                }
                if (!z10 || z14) {
                    z13 = false;
                }
                if (z10 && !z13) {
                    break;
                }
                z12 = z13;
            }
        }
        list.clear();
        return z11;
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        loop0: while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            aw awVar = this.mChildDag.bravo;
            int i5 = awVar.red;
            for (int i10 = 0; i10 < i5; i10++) {
                ArrayList arrayList = (ArrayList) awVar.juliet(i10);
                if (arrayList != null && arrayList.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i4++;
        }
        if (z2 != this.mNeedsPreDrawListener) {
            if (z2) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f6, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r4.hotel, r8) & r9) == r9) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void foxtrot() {
        this.mDependencySortedChildren.clear();
        i iVar = this.mChildDag;
        aw awVar = iVar.bravo;
        int i4 = awVar.red;
        for (int i5 = 0; i5 < i4; i5++) {
            ArrayList arrayList = (ArrayList) awVar.juliet(i5);
            if (arrayList != null) {
                arrayList.clear();
                iVar.alpha.alpha(arrayList);
            }
        }
        awVar.clear();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f resolvedLayoutParams = getResolvedLayoutParams(childAt);
            int i11 = resolvedLayoutParams.foxtrot;
            if (i11 == -1) {
                resolvedLayoutParams.lima = null;
                resolvedLayoutParams.kilo = null;
            } else {
                View view = resolvedLayoutParams.kilo;
                if (view != null && view.getId() == i11) {
                    View view2 = resolvedLayoutParams.kilo;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent != null && parent != childAt) {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        } else {
                            resolvedLayoutParams.lima = null;
                            resolvedLayoutParams.kilo = null;
                        }
                    }
                    resolvedLayoutParams.lima = view2;
                }
                View findViewById = findViewById(i11);
                resolvedLayoutParams.kilo = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (isInEditMode()) {
                            resolvedLayoutParams.lima = null;
                            resolvedLayoutParams.kilo = null;
                        } else {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt) {
                                if (isInEditMode()) {
                                    resolvedLayoutParams.lima = null;
                                    resolvedLayoutParams.kilo = null;
                                } else {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            } else {
                                if (parent2 instanceof View) {
                                    findViewById = parent2;
                                }
                            }
                        }
                        resolvedLayoutParams.lima = findViewById;
                    }
                } else if (isInEditMode()) {
                    resolvedLayoutParams.lima = null;
                    resolvedLayoutParams.kilo = null;
                } else {
                    throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i11) + " to anchor view " + childAt);
                }
            }
            aw awVar2 = this.mChildDag.bravo;
            if (!awVar2.containsKey(childAt)) {
                awVar2.put(childAt, null);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                if (i12 != i10) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 != resolvedLayoutParams.lima) {
                        WeakHashMap weakHashMap = au.alpha;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((f) childAt2.getLayoutParams()).golf, layoutDirection);
                        if (absoluteGravity != 0) {
                        }
                        c cVar = resolvedLayoutParams.alpha;
                        if (cVar == null) {
                            continue;
                        } else if (!cVar.layoutDependsOn(this, childAt, childAt2)) {
                            continue;
                        }
                    }
                    if (!this.mChildDag.bravo.containsKey(childAt2)) {
                        aw awVar3 = this.mChildDag.bravo;
                        if (!awVar3.containsKey(childAt2)) {
                            awVar3.put(childAt2, null);
                        }
                    }
                    i iVar2 = this.mChildDag;
                    aw awVar4 = iVar2.bravo;
                    if (awVar4.containsKey(childAt2) && awVar4.containsKey(childAt)) {
                        ArrayList arrayList2 = (ArrayList) awVar4.get(childAt2);
                        if (arrayList2 == null) {
                            ArrayList arrayList3 = (ArrayList) iVar2.alpha.charlie();
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList2 = arrayList3;
                            awVar4.put(childAt2, arrayList2);
                        }
                        arrayList2.add(childAt);
                    } else {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                }
            }
        }
        List<View> list = this.mDependencySortedChildren;
        i iVar3 = this.mChildDag;
        ArrayList arrayList4 = iVar3.charlie;
        arrayList4.clear();
        HashSet hashSet = iVar3.delta;
        hashSet.clear();
        aw awVar5 = iVar3.bravo;
        int i13 = awVar5.red;
        for (int i14 = 0; i14 < i13; i14++) {
            iVar3.alpha(awVar5.foxtrot(i14), arrayList4, hashSet);
        }
        list.addAll(arrayList4);
        Collections.reverse(this.mDependencySortedChildren);
    }

    public void getChildRect(View view, boolean z2, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z2) {
                getDescendantRect(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public List<View> getDependencies(View view) {
        aw awVar = this.mChildDag.bravo;
        int i4 = awVar.red;
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < i4; i5++) {
            ArrayList arrayList2 = (ArrayList) awVar.juliet(i5);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(awVar.foxtrot(i5));
            }
        }
        this.mTempDependenciesList.clear();
        if (arrayList != null) {
            this.mTempDependenciesList.addAll(arrayList);
        }
        return this.mTempDependenciesList;
    }

    public final List<View> getDependencySortedChildren() {
        foxtrot();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    public List<View> getDependents(View view) {
        List list = (List) this.mChildDag.bravo.get(view);
        this.mTempDependenciesList.clear();
        if (list != null) {
            this.mTempDependenciesList.addAll(list);
        }
        return this.mTempDependenciesList;
    }

    public void getDescendantRect(View view, Rect rect) {
        ThreadLocal threadLocal = j.alpha;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = j.alpha;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        j.alpha(this, view, matrix);
        ThreadLocal threadLocal3 = j.bravo;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public void getDesiredAnchoredChildRect(View view, int i4, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        charlie(i4, rect, rect2, fVar, measuredWidth, measuredHeight);
        bravo(fVar, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).quebec);
    }

    public final a0 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C2586t c2586t = this.mNestedScrollingParentHelper;
        return c2586t.bravo | c2586t.alpha;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f getResolvedLayoutParams(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.bravo) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e(TAG, "Attached behavior class is null");
                }
                fVar.bravo(behavior);
                fVar.bravo = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (d) cls.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.bravo((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e(TAG, "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            fVar.bravo = true;
        }
        return fVar;
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void golf(boolean z2) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            c cVar = ((f) childAt.getLayoutParams()).alpha;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    cVar.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    cVar.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            ((f) getChildAt(i5).getLayoutParams()).mike = false;
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    public boolean isPointInChildBounds(View view, int i4, int i5) {
        Rect alpha = alpha();
        getDescendantRect(view, alpha);
        try {
            return alpha.contains(i4, i5);
        } finally {
            alpha.setEmpty();
            sRectPool.alpha(alpha);
        }
    }

    public final void juliet() {
        WeakHashMap weakHashMap = au.alpha;
        if (getFitsSystemWindows()) {
            if (this.mApplyWindowInsetsListener == null) {
                this.mApplyWindowInsetsListener = new a(this);
            }
            al.lima(this, this.mApplyWindowInsetsListener);
            setSystemUiVisibility(1280);
            return;
        }
        al.lima(this, null);
    }

    public void offsetChildToAnchor(View view, int i4) {
        c cVar;
        f fVar = (f) view.getLayoutParams();
        if (fVar.kilo != null) {
            Rect alpha = alpha();
            Rect alpha2 = alpha();
            Rect alpha3 = alpha();
            getDescendantRect(fVar.kilo, alpha);
            boolean z2 = false;
            getChildRect(view, false, alpha2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            charlie(i4, alpha, alpha3, fVar, measuredWidth, measuredHeight);
            if (alpha3.left != alpha2.left || alpha3.top != alpha2.top) {
                z2 = true;
            }
            bravo(fVar, alpha3, measuredWidth, measuredHeight);
            int i5 = alpha3.left - alpha2.left;
            int i10 = alpha3.top - alpha2.top;
            if (i5 != 0) {
                WeakHashMap weakHashMap = au.alpha;
                view.offsetLeftAndRight(i5);
            }
            if (i10 != 0) {
                WeakHashMap weakHashMap2 = au.alpha;
                view.offsetTopAndBottom(i10);
            }
            if (z2 && (cVar = fVar.alpha) != null) {
                cVar.onDependentViewChanged(this, view, fVar.kilo);
            }
            alpha.setEmpty();
            InterfaceC2485d interfaceC2485d = sRectPool;
            interfaceC2485d.alpha(alpha);
            alpha2.setEmpty();
            interfaceC2485d.alpha(alpha2);
            alpha3.setEmpty();
            interfaceC2485d.alpha(alpha3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        golf(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            WeakHashMap weakHashMap = au.alpha;
            if (getFitsSystemWindows()) {
                aj.charlie(this);
            }
        }
        this.mIsAttachedToWindow = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f0  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onChildViewsChanged(int i4) {
        boolean z2;
        int i5;
        int i10;
        int i11;
        ?? r62;
        boolean z10;
        ?? r5;
        ?? r12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 80;
        int i17 = 48;
        boolean z11 = true;
        WeakHashMap weakHashMap = au.alpha;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        Rect alpha = alpha();
        Rect alpha2 = alpha();
        Rect alpha3 = alpha();
        int i18 = 0;
        while (i18 < size) {
            View view = this.mDependencySortedChildren.get(i18);
            f fVar = (f) view.getLayoutParams();
            if (i4 == 0 && view.getVisibility() == 8) {
                i5 = i16;
                i10 = i18;
            } else {
                for (int i19 = 0; i19 < i18; i19 += z11 ? 1 : 0) {
                    if (fVar.lima == this.mDependencySortedChildren.get(i19)) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                getChildRect(view, z11, alpha2);
                if (fVar.golf != 0 && !alpha2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar.golf, layoutDirection);
                    int i20 = absoluteGravity & 112;
                    if (i20 != i17) {
                        if (i20 != i16) {
                            z2 = z11 ? 1 : 0;
                        } else {
                            int i21 = alpha.bottom;
                            int height = getHeight();
                            z2 = z11 ? 1 : 0;
                            alpha.bottom = Math.max(i21, height - alpha2.top);
                        }
                    } else {
                        z2 = z11 ? 1 : 0;
                        alpha.top = Math.max(alpha.top, alpha2.bottom);
                    }
                    int i22 = absoluteGravity & 7;
                    if (i22 != 3) {
                        if (i22 == 5) {
                            alpha.right = Math.max(alpha.right, getWidth() - alpha2.left);
                        }
                    } else {
                        alpha.left = Math.max(alpha.left, alpha2.right);
                    }
                } else {
                    z2 = z11 ? 1 : 0;
                }
                if (fVar.hotel != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap2 = au.alpha;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar2 = (f) view.getLayoutParams();
                        c cVar = fVar2.alpha;
                        Rect alpha4 = alpha();
                        Rect alpha5 = alpha();
                        int i23 = i16;
                        int i24 = i17;
                        i10 = i18;
                        alpha5.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar != null && cVar.getInsetDodgeRect(this, view, alpha4)) {
                            if (!alpha5.contains(alpha4)) {
                                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + alpha4.toShortString() + " | Bounds:" + alpha5.toShortString());
                            }
                        } else {
                            alpha4.set(alpha5);
                        }
                        alpha5.setEmpty();
                        InterfaceC2485d interfaceC2485d = sRectPool;
                        interfaceC2485d.alpha(alpha5);
                        if (alpha4.isEmpty()) {
                            alpha4.setEmpty();
                            interfaceC2485d.alpha(alpha4);
                            i5 = i23;
                            if (i4 != 2) {
                                getLastChildRect(view, alpha3);
                                if (!alpha3.equals(alpha2)) {
                                    recordLastChildRect(view, alpha2);
                                }
                                z11 = z2;
                            }
                            i11 = i10 + 1;
                            while (i11 < size) {
                                View view2 = this.mDependencySortedChildren.get(i11);
                                f fVar3 = (f) view2.getLayoutParams();
                                c cVar2 = fVar3.alpha;
                                if (cVar2 != null && cVar2.layoutDependsOn(this, view2, view)) {
                                    if (i4 == 0 && fVar3.papa) {
                                        fVar3.papa = false;
                                        r62 = z2;
                                    } else {
                                        if (i4 != 2) {
                                            z10 = cVar2.onDependentViewChanged(this, view2, view);
                                            r62 = z2;
                                        } else {
                                            cVar2.onDependentViewRemoved(this, view2, view);
                                            z10 = z2;
                                            r62 = z10 ? 1 : 0;
                                        }
                                        if (i4 == r62) {
                                            fVar3.papa = z10;
                                        }
                                    }
                                } else {
                                    r62 = z2;
                                }
                                i11 += r62;
                                z2 = r62;
                            }
                            z11 = z2;
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar2.hotel, layoutDirection);
                            if ((absoluteGravity2 & 48) == i24 && (i14 = (alpha4.top - ((ViewGroup.MarginLayoutParams) fVar2).topMargin) - fVar2.juliet) < (i15 = alpha.top)) {
                                india(i15 - i14, view);
                                r5 = z2;
                            } else {
                                r5 = 0;
                            }
                            i5 = i23;
                            boolean z12 = r5;
                            if ((absoluteGravity2 & 80) == i5) {
                                int height2 = ((getHeight() - alpha4.bottom) - ((ViewGroup.MarginLayoutParams) fVar2).bottomMargin) + fVar2.juliet;
                                int i25 = alpha.bottom;
                                z12 = r5;
                                if (height2 < i25) {
                                    india(height2 - i25, view);
                                    z12 = z2;
                                }
                            }
                            if (z12 == 0) {
                                india(0, view);
                            }
                            if ((absoluteGravity2 & 3) == 3 && (i12 = (alpha4.left - ((ViewGroup.MarginLayoutParams) fVar2).leftMargin) - fVar2.india) < (i13 = alpha.left)) {
                                hotel(i13 - i12, view);
                                r12 = z2;
                            } else {
                                r12 = 0;
                            }
                            boolean z13 = r12;
                            if ((absoluteGravity2 & 5) == 5) {
                                int width = ((getWidth() - alpha4.right) - ((ViewGroup.MarginLayoutParams) fVar2).rightMargin) + fVar2.india;
                                int i26 = alpha.right;
                                z13 = r12;
                                if (width < i26) {
                                    hotel(width - i26, view);
                                    z13 = z2;
                                }
                            }
                            if (z13 == 0) {
                                hotel(0, view);
                            }
                            alpha4.setEmpty();
                            interfaceC2485d.alpha(alpha4);
                            if (i4 != 2) {
                            }
                            i11 = i10 + 1;
                            while (i11 < size) {
                            }
                            z11 = z2;
                        }
                    }
                }
                i5 = i16;
                i10 = i18;
                if (i4 != 2) {
                }
                i11 = i10 + 1;
                while (i11 < size) {
                }
                z11 = z2;
            }
            i18 = i10 + 1;
            i16 = i5;
            i17 = 48;
        }
        alpha.setEmpty();
        InterfaceC2485d interfaceC2485d2 = sRectPool;
        interfaceC2485d2.alpha(alpha);
        alpha2.setEmpty();
        interfaceC2485d2.alpha(alpha2);
        alpha3.setEmpty();
        interfaceC2485d2.alpha(alpha3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        golf(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i4;
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null) {
            a0 a0Var = this.mLastInsets;
            if (a0Var != null) {
                i4 = a0Var.delta();
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                this.mStatusBarBackground.setBounds(0, 0, getWidth(), i4);
                this.mStatusBarBackground.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            golf(true);
        }
        boolean echo = echo(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return echo;
        }
        golf(true);
        return echo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        c cVar;
        WeakHashMap weakHashMap = au.alpha;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.mDependencySortedChildren.get(i12);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).alpha) == null || !cVar.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public void onLayoutChild(View view, int i4) {
        Rect alpha;
        Rect alpha2;
        InterfaceC2485d interfaceC2485d;
        int i5;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.kilo;
        if (view2 == null && fVar.foxtrot != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            alpha = alpha();
            alpha2 = alpha();
            try {
                getDescendantRect(view2, alpha);
                getDesiredAnchoredChildRect(view, i4, alpha, alpha2);
                view.layout(alpha2.left, alpha2.top, alpha2.right, alpha2.bottom);
                return;
            } finally {
                alpha.setEmpty();
                interfaceC2485d = sRectPool;
                interfaceC2485d.alpha(alpha);
                alpha2.setEmpty();
                interfaceC2485d.alpha(alpha2);
            }
        }
        int i10 = fVar.echo;
        if (i10 >= 0) {
            f fVar2 = (f) view.getLayoutParams();
            int i11 = fVar2.charlie;
            if (i11 == 0) {
                i11 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i11, i4);
            int i12 = absoluteGravity & 7;
            int i13 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (i4 == 1) {
                i10 = width - i10;
            }
            int delta = delta(i10) - measuredWidth;
            if (i12 != 1) {
                if (i12 == 5) {
                    delta += measuredWidth;
                }
            } else {
                delta += measuredWidth / 2;
            }
            if (i13 != 16) {
                if (i13 != 80) {
                    i5 = 0;
                } else {
                    i5 = measuredHeight;
                }
            } else {
                i5 = measuredHeight / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar2).leftMargin, Math.min(delta, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar2).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar2).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar2).bottomMargin));
            view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
            return;
        }
        f fVar3 = (f) view.getLayoutParams();
        alpha = alpha();
        alpha.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
        if (this.mLastInsets != null) {
            WeakHashMap weakHashMap = au.alpha;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                alpha.left = this.mLastInsets.bravo() + alpha.left;
                alpha.top = this.mLastInsets.delta() + alpha.top;
                alpha.right -= this.mLastInsets.charlie();
                alpha.bottom -= this.mLastInsets.alpha();
            }
        }
        alpha2 = alpha();
        int i14 = fVar3.charlie;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        Gravity.apply(i14, view.getMeasuredWidth(), view.getMeasuredHeight(), alpha, alpha2, i4);
        view.layout(alpha2.left, alpha2.top, alpha2.right, alpha2.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i4, int i5) {
        boolean z2;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        c cVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        View view;
        View view2;
        CoordinatorLayout coordinatorLayout = this;
        boolean z11 = true;
        coordinatorLayout.foxtrot();
        coordinatorLayout.ensurePreDrawListener();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = au.alpha;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        if (layoutDirection == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        int i26 = paddingLeft + paddingRight;
        int i27 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        if (coordinatorLayout.mLastInsets != null && coordinatorLayout.getFitsSystemWindows()) {
            z10 = true;
        } else {
            z10 = false;
        }
        int size3 = coordinatorLayout.mDependencySortedChildren.size();
        int i28 = 0;
        int i29 = 0;
        while (i28 < size3) {
            View view3 = coordinatorLayout.mDependencySortedChildren.get(i28);
            boolean z12 = z11;
            if (view3.getVisibility() == 8) {
                i15 = size3;
                i18 = i28;
                i16 = paddingLeft;
                i21 = paddingRight;
                i19 = layoutDirection;
            } else {
                f fVar = (f) view3.getLayoutParams();
                int i30 = fVar.echo;
                if (i30 >= 0 && mode != 0) {
                    int delta = coordinatorLayout.delta(i30);
                    i10 = suggestedMinimumWidth;
                    int i31 = fVar.charlie;
                    if (i31 == 0) {
                        i31 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i31, layoutDirection) & 7;
                    i11 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z2) || (absoluteGravity == 5 && z2)) {
                        i12 = Math.max(0, (size - paddingRight) - delta);
                    } else if ((absoluteGravity == 5 && !z2) || (absoluteGravity == 3 && z2)) {
                        i12 = Math.max(0, delta - paddingLeft);
                    }
                    if (!z10 && !view3.getFitsSystemWindows()) {
                        int charlie = coordinatorLayout.mLastInsets.charlie() + coordinatorLayout.mLastInsets.bravo();
                        int alpha = coordinatorLayout.mLastInsets.alpha() + coordinatorLayout.mLastInsets.delta();
                        i13 = View.MeasureSpec.makeMeasureSpec(size - charlie, mode);
                        i14 = View.MeasureSpec.makeMeasureSpec(size2 - alpha, mode2);
                    } else {
                        i13 = i4;
                        i14 = i5;
                    }
                    cVar = fVar.alpha;
                    if (cVar == null) {
                        i18 = i28;
                        int i32 = i12;
                        view2 = view3;
                        int i33 = i13;
                        i15 = size3;
                        int i34 = i10;
                        i16 = paddingLeft;
                        i17 = i34;
                        i19 = layoutDirection;
                        i20 = i11;
                        i21 = paddingRight;
                        i22 = i29;
                        int i35 = i14;
                        if (!cVar.onMeasureChild(this, view2, i33, i32, i35, 0)) {
                            view = view2;
                            i24 = i33;
                            i23 = i32;
                            i25 = i35;
                        } else {
                            coordinatorLayout = this;
                            suggestedMinimumWidth = Math.max(i17, view2.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int max = Math.max(i20, view2.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            i29 = View.combineMeasuredStates(i22, view2.getMeasuredState());
                            suggestedMinimumHeight = max;
                        }
                    } else {
                        int i36 = i13;
                        i15 = size3;
                        int i37 = i10;
                        i16 = paddingLeft;
                        i17 = i37;
                        i18 = i28;
                        i19 = layoutDirection;
                        i20 = i11;
                        i21 = paddingRight;
                        i22 = i29;
                        i23 = i12;
                        i24 = i36;
                        i25 = i14;
                        view = view3;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.onMeasureChild(view, i24, i23, i25, 0);
                    view2 = view;
                    suggestedMinimumWidth = Math.max(i17, view2.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int max2 = Math.max(i20, view2.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i29 = View.combineMeasuredStates(i22, view2.getMeasuredState());
                    suggestedMinimumHeight = max2;
                } else {
                    i10 = suggestedMinimumWidth;
                    i11 = suggestedMinimumHeight;
                }
                i12 = 0;
                if (!z10) {
                }
                i13 = i4;
                i14 = i5;
                cVar = fVar.alpha;
                if (cVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.onMeasureChild(view, i24, i23, i25, 0);
                view2 = view;
                suggestedMinimumWidth = Math.max(i17, view2.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int max22 = Math.max(i20, view2.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i29 = View.combineMeasuredStates(i22, view2.getMeasuredState());
                suggestedMinimumHeight = max22;
            }
            i28 = i18 + 1;
            size3 = i15;
            z11 = z12;
            paddingLeft = i16;
            paddingRight = i21;
            layoutDirection = i19;
        }
        int i38 = i29;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i4, (-16777216) & i38), View.resolveSizeAndState(suggestedMinimumHeight, i5, i38 << 16));
    }

    public void onMeasureChild(View view, int i4, int i5, int i10, int i11) {
        measureChildWithMargins(view, i4, i5, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f5, float f10, boolean z2) {
        c cVar;
        View view2;
        float f11;
        float f12;
        boolean z10;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z11 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.alpha(0) && (cVar = fVar.alpha) != null) {
                    view2 = view;
                    f11 = f5;
                    f12 = f10;
                    z10 = z2;
                    z11 |= cVar.onNestedFling(this, childAt, view2, f11, f12, z10);
                    i4++;
                    view = view2;
                    f5 = f11;
                    f10 = f12;
                    z2 = z10;
                }
            }
            view2 = view;
            f11 = f5;
            f12 = f10;
            z10 = z2;
            i4++;
            view = view2;
            f5 = f11;
            f10 = f12;
            z2 = z10;
        }
        if (z11) {
            onChildViewsChanged(1);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f5, float f10) {
        c cVar;
        View view2;
        float f11;
        float f12;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.alpha(0) && (cVar = fVar.alpha) != null) {
                    view2 = view;
                    f11 = f5;
                    f12 = f10;
                    z2 |= cVar.onNestedPreFling(this, childAt, view2, f11, f12);
                    i4++;
                    view = view2;
                    f5 = f11;
                    f10 = f12;
                }
            }
            view2 = view;
            f11 = f5;
            f12 = f10;
            i4++;
            view = view2;
            f5 = f11;
            f10 = f12;
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        onNestedPreScroll(view, i4, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i4, int i5, int i10, int i11) {
        onNestedScroll(view, i4, i5, i10, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        onNestedScrollAccepted(view, view2, i4, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.alpha);
        SparseArray sparseArray = savedState.red;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id2 = childAt.getId();
            c cVar = getResolvedLayoutParams(childAt).alpha;
            if (id2 != -1 && cVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                cVar.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id2 = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).alpha;
            if (id2 != -1 && cVar != null && (onSaveInstanceState = cVar.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id2, onSaveInstanceState);
            }
        }
        absSavedState.red = sparseArray;
        return absSavedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return onStartNestedScroll(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean onTouchEvent;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            z2 = echo(motionEvent, 1);
        } else {
            z2 = false;
        }
        c cVar = ((f) this.mBehaviorTouchView.getLayoutParams()).alpha;
        if (cVar != null) {
            onTouchEvent = cVar.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
            motionEvent2 = null;
            if (this.mBehaviorTouchView != null) {
                onTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return onTouchEvent;
            }
            golf(false);
            return onTouchEvent;
        }
        onTouchEvent = false;
        motionEvent2 = null;
        if (this.mBehaviorTouchView != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        golf(false);
        return onTouchEvent;
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((f) view.getLayoutParams()).quebec.set(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        c cVar = ((f) view.getLayoutParams()).alpha;
        if (cVar != null && cVar.onRequestChildRectangleOnScreen(this, view, rect, z2)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.mDisallowInterceptReset) {
            golf(false);
            this.mDisallowInterceptReset = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        juliet();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z2;
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.mStatusBarBackground = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                Drawable drawable4 = this.mStatusBarBackground;
                WeakHashMap weakHashMap = au.alpha;
                drawable4.setLayoutDirection(getLayoutDirection());
                Drawable drawable5 = this.mStatusBarBackground;
                if (getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawable5.setVisible(z2, false);
                this.mStatusBarBackground.setCallback(this);
            }
            WeakHashMap weakHashMap2 = au.alpha;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i4) {
        setStatusBarBackground(new ColorDrawable(i4));
    }

    public void setStatusBarBackgroundResource(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = getContext().getDrawable(i4);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
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
        Drawable drawable = this.mStatusBarBackground;
        if (drawable != null && drawable.isVisible() != z2) {
            this.mStatusBarBackground.setVisible(z2, false);
        }
    }

    public final a0 setWindowInsets(a0 a0Var) {
        boolean z2;
        boolean z10;
        c cVar;
        if (!Objects.equals(this.mLastInsets, a0Var)) {
            this.mLastInsets = a0Var;
            if (a0Var != null && a0Var.delta() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.mDrawStatusBarBackground = z2;
            if (!z2 && getBackground() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            setWillNotDraw(z10);
            if (!a0Var.alpha.oscar()) {
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    WeakHashMap weakHashMap = au.alpha;
                    if (childAt.getFitsSystemWindows() && (cVar = ((f) childAt.getLayoutParams()).alpha) != null) {
                        a0Var = cVar.onApplyWindowInsets(this, childAt, a0Var);
                        if (a0Var.alpha.oscar()) {
                            break;
                        }
                    }
                }
            }
            requestLayout();
        }
        return a0Var;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.mStatusBarBackground) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v6, types: [s1.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedArray obtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        int resourceId;
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new i();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new Object();
        int[] iArr = d1.a.alpha;
        if (i4 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 2132083992);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        }
        TypedArray typedArray = obtainStyledAttributes;
        if (Build.VERSION.SDK_INT >= 29) {
            if (i4 == 0) {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, 0, 2132083992);
            } else {
                coordinatorLayout = this;
                context2 = context;
                coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArray, i4, 0);
                resourceId = typedArray.getResourceId(0, 0);
                if (resourceId != 0) {
                    Resources resources = context2.getResources();
                    coordinatorLayout.mKeylines = resources.getIntArray(resourceId);
                    float f5 = resources.getDisplayMetrics().density;
                    int length = coordinatorLayout.mKeylines.length;
                    for (int i5 = 0; i5 < length; i5++) {
                        coordinatorLayout.mKeylines[i5] = (int) (r11[i5] * f5);
                    }
                }
                coordinatorLayout.mStatusBarBackground = typedArray.getDrawable(1);
                typedArray.recycle();
                juliet();
                super.setOnHierarchyChangeListener(new e(this));
                WeakHashMap weakHashMap = au.alpha;
                if (getImportantForAccessibility() != 0) {
                    setImportantForAccessibility(1);
                    return;
                }
                return;
            }
        }
        coordinatorLayout = this;
        context2 = context;
        resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
        }
        coordinatorLayout.mStatusBarBackground = typedArray.getDrawable(1);
        typedArray.recycle();
        juliet();
        super.setOnHierarchyChangeListener(new e(this));
        WeakHashMap weakHashMap2 = au.alpha;
        if (getImportantForAccessibility() != 0) {
        }
    }

    @Override // android.view.ViewGroup
    public f generateDefaultLayoutParams() {
        return new f();
    }

    @Override // s1.r
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr, int i10) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.alpha(i10) && (cVar = fVar.alpha) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.onNestedPreScroll(this, childAt, view, i4, i5, iArr2, i10);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i11 = i4 > 0 ? Math.max(i11, iArr3[0]) : Math.min(i11, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i12 = i5 > 0 ? Math.max(i12, iArr4[1]) : Math.min(i12, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i11;
        iArr[1] = i12;
        if (z2) {
            onChildViewsChanged(1);
        }
    }

    @Override // s1.r
    public void onNestedScroll(View view, int i4, int i5, int i10, int i11, int i12) {
        onNestedScroll(view, i4, i5, i10, i11, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // s1.r
    public void onNestedScrollAccepted(View view, View view2, int i4, int i5) {
        c cVar;
        View view3;
        View view4;
        int i10;
        int i11;
        C2586t c2586t = this.mNestedScrollingParentHelper;
        if (i5 == 1) {
            c2586t.bravo = i4;
        } else {
            c2586t.alpha = i4;
        }
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.alpha(i5) && (cVar = fVar.alpha) != null) {
                view3 = view;
                view4 = view2;
                i10 = i4;
                i11 = i5;
                cVar.onNestedScrollAccepted(this, childAt, view3, view4, i10, i11);
            } else {
                view3 = view;
                view4 = view2;
                i10 = i4;
                i11 = i5;
            }
            i12++;
            view = view3;
            view2 = view4;
            i4 = i10;
            i5 = i11;
        }
    }

    @Override // s1.r
    public boolean onStartNestedScroll(View view, View view2, int i4, int i5) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.alpha;
                if (cVar != null) {
                    boolean onStartNestedScroll = cVar.onStartNestedScroll(this, childAt, view, view2, i4, i5);
                    z2 |= onStartNestedScroll;
                    if (i5 == 0) {
                        fVar.november = onStartNestedScroll;
                    } else if (i5 == 1) {
                        fVar.oscar = onStartNestedScroll;
                    }
                } else if (i5 == 0) {
                    fVar.november = false;
                } else if (i5 == 1) {
                    fVar.oscar = false;
                }
            }
        }
        return z2;
    }

    @Override // s1.r
    public void onStopNestedScroll(View view, int i4) {
        C2586t c2586t = this.mNestedScrollingParentHelper;
        if (i4 == 1) {
            c2586t.bravo = 0;
        } else {
            c2586t.alpha = 0;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.alpha(i4)) {
                c cVar = fVar.alpha;
                if (cVar != null) {
                    cVar.onStopNestedScroll(this, childAt, view, i4);
                }
                if (i4 == 0) {
                    fVar.november = false;
                } else if (i4 == 1) {
                    fVar.oscar = false;
                }
                fVar.papa = false;
            }
        }
        this.mNestedScrollingTarget = null;
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // s1.InterfaceC2585s
    public void onNestedScroll(View view, int i4, int i5, int i10, int i11, int i12, int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.alpha(i12) && (cVar = fVar.alpha) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.onNestedScroll(this, childAt, view, i4, i5, i10, i11, i12, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i13 = i10 > 0 ? Math.max(i13, iArr3[0]) : Math.min(i13, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i14 = i11 > 0 ? Math.max(i14, iArr4[1]) : Math.min(i14, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i13;
        iArr[1] = iArr[1] + i14;
        if (z2) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }
}
