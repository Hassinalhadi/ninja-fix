package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.widget.P0;
import androidx.customview.view.AbsSavedState;
import com.airbnb.lottie.compose.LottieConstants;
import d.S0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k2.AbstractC2001a;
import kotlin.collections.CollectionsKt;
import s1.C2584q;
import s1.InterfaceC2583p;
import s6.T7;
import t0.x0;
import t6.AbstractC2977c3;
import t6.AbstractC3091z3;

/* loaded from: classes3.dex */
public class RecyclerView extends ViewGroup implements InterfaceC2583p {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled;
    static final c0 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled;
    h0 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    az mAdapter;
    C0657b mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private C mChildDrawingOrderCallback;
    C0666k mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private D mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    ag mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private P mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    H mItemAnimator;
    private F mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<I> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    L mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final W mObserver;
    private List<N> mOnChildAttachStateListeners;
    private O mOnFlingListener;
    private final ArrayList<P> mOnItemTouchListeners;
    final List<f0> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    ae mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final U mRecycler;
    V mRecyclerListener;
    final List<V> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private Q mScrollListener;
    private List<Q> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C2584q mScrollingChildHelper;
    final b0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final e0 mViewFlinger;
    private final s0 mViewInfoProcessCallback;
    final t0 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public Parcelable red;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.red = parcel.readParcelable(classLoader == null ? L.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeParcelable(this.red, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.animation.Interpolator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.recyclerview.widget.c0] */
    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new Object();
        sDefaultEdgeEffectFactory = new Object();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, delivery.samurai.android.R.attr.recyclerViewStyle);
    }

    public static int charlie(int i4, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i5) {
        if (i4 > 0 && edgeEffect != null && AbstractC3091z3.charlie(edgeEffect) != DECELERATION_RATE) {
            int round = Math.round(AbstractC3091z3.golf(edgeEffect, ((-i4) * 4.0f) / i5, 0.5f) * ((-i5) / 4.0f));
            if (round != i4) {
                edgeEffect.finish();
            }
            return i4 - round;
        }
        if (i4 < 0 && edgeEffect2 != null && AbstractC3091z3.charlie(edgeEffect2) != DECELERATION_RATE) {
            float f5 = i5;
            int round2 = Math.round(AbstractC3091z3.golf(edgeEffect2, (i4 * 4.0f) / f5, 0.5f) * (f5 / 4.0f));
            if (round2 != i4) {
                edgeEffect2.finish();
            }
            return i4 - round2;
        }
        return i4;
    }

    public static void clearNestedRecyclerViewIfNotNested(f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView != f0Var.itemView) {
                    Object parent = recyclerView.getParent();
                    if (parent instanceof View) {
                        recyclerView = (View) parent;
                    } else {
                        recyclerView = null;
                    }
                } else {
                    return;
                }
            }
            f0Var.mNestedRecyclerView = null;
        }
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i4));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    public static f0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((M) view.getLayoutParams()).alpha;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        M m4 = (M) view.getLayoutParams();
        Rect rect2 = m4.purple;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) m4).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) m4).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) m4).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) m4).bottomMargin);
    }

    private C2584q getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C2584q(this);
        }
        return this.mScrollingChildHelper;
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        sDebugAssertionsEnabled = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        sVerboseLoggingEnabled = z2;
    }

    public void absorbGlows(int i4, int i5) {
        if (i4 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i4);
            }
        } else if (i4 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i4);
            }
        }
        if (i5 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i5);
            }
        } else if (i5 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i5);
            }
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        WeakHashMap weakHashMap = s1.au.alpha;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        L l10 = this.mLayout;
        if (l10 != null) {
            l10.getClass();
        }
        super.addFocusables(arrayList, i4, i5);
    }

    public void addItemDecoration(I i4, int i5) {
        L l10 = this.mLayout;
        if (l10 != null) {
            l10.charlie("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i5 < 0) {
            this.mItemDecorations.add(i4);
        } else {
            this.mItemDecorations.add(i5, i4);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(N n5) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(n5);
    }

    public void addOnItemTouchListener(P p4) {
        this.mOnItemTouchListeners.add(p4);
    }

    public void addOnScrollListener(Q q4) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(q4);
    }

    public void addRecyclerListener(V v4) {
        boolean z2;
        if (v4 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.bravo("'listener' arg cannot be null.", z2);
        this.mRecyclerListeners.add(v4);
    }

    public void animateAppearance(f0 f0Var, G g2, G g5) {
        f0Var.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(f0Var, g2, g5)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(f0 f0Var, G g2, G g5) {
        bravo(f0Var);
        f0Var.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(f0Var, g2, g5)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(P0.black(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(P0.black(this, Q0.c.tango(str)));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(P0.black(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(P0.black(this, new StringBuilder(""))));
        }
    }

    public final void bravo(f0 f0Var) {
        boolean z2;
        View view = f0Var.itemView;
        if (view.getParent() == this) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mRecycler.november(getChildViewHolder(view));
        if (f0Var.isTmpDetached()) {
            this.mChildHelper.bravo(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.mChildHelper.alpha(view, -1, true);
            return;
        }
        C0666k c0666k = this.mChildHelper;
        int indexOfChild = c0666k.alpha.alpha.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0666k.bravo.juliet(indexOfChild);
            c0666k.india(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public boolean canReuseUpdatedViewHolder(f0 f0Var) {
        H h4 = this.mItemAnimator;
        if (h4 != null && !h4.canReuseUpdatedViewHolder(f0Var, f0Var.getUnmodifiedPayloads())) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof M) && this.mLayout.golf((M) layoutParams)) {
            return true;
        }
        return false;
    }

    public void clearOldPositions() {
        int hotel = this.mChildHelper.hotel();
        for (int i4 = 0; i4 < hotel; i4++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.golf(i4));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        U u4 = this.mRecycler;
        ArrayList arrayList = u4.charlie;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((f0) arrayList.get(i5)).clearOldPosition();
        }
        ArrayList arrayList2 = u4.alpha;
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f0) arrayList2.get(i10)).clearOldPosition();
        }
        ArrayList arrayList3 = u4.bravo;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i11 = 0; i11 < size3; i11++) {
                ((f0) u4.bravo.get(i11)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<N> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<Q> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        L l10 = this.mLayout;
        if (l10 != null && l10.echo()) {
            return this.mLayout.kilo(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        L l10 = this.mLayout;
        if (l10 != null && l10.echo()) {
            return this.mLayout.lima(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        L l10 = this.mLayout;
        if (l10 != null && l10.echo()) {
            return this.mLayout.mike(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        L l10 = this.mLayout;
        if (l10 != null && l10.foxtrot()) {
            return this.mLayout.november(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        L l10 = this.mLayout;
        if (l10 != null && l10.foxtrot()) {
            return this.mLayout.oscar(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        L l10 = this.mLayout;
        if (l10 != null && l10.foxtrot()) {
            return this.mLayout.papa(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i4, int i5) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && !edgeEffect.isFinished() && i4 > 0) {
            this.mLeftGlow.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.mRightGlow.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.mTopGlow.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.mBottomGlow.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = s1.au.alpha;
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i4) {
        return charlie(i4, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i4) {
        return charlie(i4, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (this.mAdapterHelper.golf()) {
                C0657b c0657b = this.mAdapterHelper;
                int i4 = c0657b.foxtrot;
                if ((i4 & 4) != 0 && (i4 & 11) == 0) {
                    int i5 = o1.i.alpha;
                    Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.juliet();
                    if (!this.mLayoutWasDefered) {
                        int echo = this.mChildHelper.echo();
                        int i10 = 0;
                        while (true) {
                            if (i10 < echo) {
                                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.delta(i10));
                                if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                                    dispatchLayout();
                                    break;
                                }
                                i10++;
                            } else {
                                this.mAdapterHelper.bravo();
                                break;
                            }
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    Trace.endSection();
                    return;
                }
                if (c0657b.golf()) {
                    int i11 = o1.i.alpha;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            return;
        }
        int i12 = o1.i.alpha;
        Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
    }

    public void defaultOnMeasure(int i4, int i5) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = s1.au.alpha;
        setMeasuredDimension(L.hotel(i4, paddingRight, getMinimumWidth()), L.hotel(i5, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void delta() {
        View view;
        int absoluteAdapterPosition;
        r0 r0Var;
        boolean z2 = true;
        this.mState.alpha(1);
        fillRemainingScrollValues(this.mState);
        this.mState.india = false;
        startInterceptRequestLayout();
        t0 t0Var = this.mViewInfoStore;
        t0Var.alpha.clear();
        t0Var.bravo.bravo();
        onEnterLayoutOrScroll();
        juliet();
        f0 f0Var = null;
        if (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            f0Var = findContainingViewHolder(view);
        }
        long j5 = -1;
        if (f0Var == null) {
            b0 b0Var = this.mState;
            b0Var.mike = -1L;
            b0Var.lima = -1;
            b0Var.november = -1;
        } else {
            b0 b0Var2 = this.mState;
            if (this.mAdapter.hasStableIds()) {
                j5 = f0Var.getItemId();
            }
            b0Var2.mike = j5;
            b0 b0Var3 = this.mState;
            if (this.mDataSetHasChangedAfterLayout) {
                absoluteAdapterPosition = -1;
            } else if (f0Var.isRemoved()) {
                absoluteAdapterPosition = f0Var.mOldPosition;
            } else {
                absoluteAdapterPosition = f0Var.getAbsoluteAdapterPosition();
            }
            b0Var3.lima = absoluteAdapterPosition;
            b0 b0Var4 = this.mState;
            View view2 = f0Var.itemView;
            int id2 = view2.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                view2 = ((ViewGroup) view2).getFocusedChild();
                if (view2.getId() != -1) {
                    id2 = view2.getId();
                }
            }
            b0Var4.november = id2;
        }
        b0 b0Var5 = this.mState;
        if (!b0Var5.juliet || !this.mItemsChanged) {
            z2 = false;
        }
        b0Var5.hotel = z2;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        b0Var5.golf = b0Var5.kilo;
        b0Var5.echo = this.mAdapter.getItemCount();
        golf(this.mMinMaxLayoutPositions);
        if (this.mState.juliet) {
            int echo = this.mChildHelper.echo();
            for (int i4 = 0; i4 < echo; i4++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.delta(i4));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    G recordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, H.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads());
                    bv.aw awVar = this.mViewInfoStore.alpha;
                    r0 r0Var2 = (r0) awVar.get(childViewHolderInt);
                    if (r0Var2 == null) {
                        r0Var2 = r0.alpha();
                        awVar.put(childViewHolderInt, r0Var2);
                    }
                    r0Var2.bravo = recordPreLayoutInformation;
                    r0Var2.alpha |= 4;
                    if (this.mState.hotel && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.bravo.hotel(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.kilo) {
            saveOldPositions();
            b0 b0Var6 = this.mState;
            boolean z10 = b0Var6.foxtrot;
            b0Var6.foxtrot = false;
            this.mLayout.b(this.mRecycler, b0Var6);
            this.mState.foxtrot = z10;
            for (int i5 = 0; i5 < this.mChildHelper.echo(); i5++) {
                f0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.delta(i5));
                if (!childViewHolderInt2.shouldIgnore() && ((r0Var = (r0) this.mViewInfoStore.alpha.get(childViewHolderInt2)) == null || (r0Var.alpha & 4) == 0)) {
                    int buildAdapterChangeFlagsForAnimations = H.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    G recordPreLayoutInformation2 = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, buildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, recordPreLayoutInformation2);
                    } else {
                        bv.aw awVar2 = this.mViewInfoStore.alpha;
                        r0 r0Var3 = (r0) awVar2.get(childViewHolderInt2);
                        if (r0Var3 == null) {
                            r0Var3 = r0.alpha();
                            awVar2.put(childViewHolderInt2, r0Var3);
                        }
                        r0Var3.alpha |= 2;
                        r0Var3.bravo = recordPreLayoutInformation2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.delta = 2;
    }

    public void dispatchChildAttached(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        az azVar = this.mAdapter;
        if (azVar != null && childViewHolderInt != null) {
            azVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<N> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        az azVar = this.mAdapter;
        if (azVar != null && childViewHolderInt != null) {
            azVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<N> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0353, code lost:
    
        if (r15.mChildHelper.charlie.contains(r0) == false) goto L441;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchLayout() {
        boolean z2;
        f0 f0Var;
        View findViewById;
        boolean z10;
        boolean z11;
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        int i4 = 0;
        this.mState.india = false;
        if (this.mLastAutoMeasureSkippedDueToExact && (this.mLastAutoMeasureNonExactMeasuredWidth != getWidth() || this.mLastAutoMeasureNonExactMeasuredHeight != getHeight())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.delta == 1) {
            delta();
            this.mLayout.p(this);
            echo();
        } else {
            C0657b c0657b = this.mAdapterHelper;
            if ((c0657b.charlie.isEmpty() || c0657b.bravo.isEmpty()) && !z2 && this.mLayout.november == getWidth() && this.mLayout.oscar == getHeight()) {
                this.mLayout.p(this);
            } else {
                this.mLayout.p(this);
                echo();
            }
        }
        this.mState.alpha(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        b0 b0Var = this.mState;
        b0Var.delta = 1;
        View view = null;
        if (b0Var.juliet) {
            for (int echo = this.mChildHelper.echo() - 1; echo >= 0; echo--) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.delta(echo));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    G recordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    f0 f0Var2 = (f0) this.mViewInfoStore.bravo.delta(changedHolderKey);
                    if (f0Var2 != null && !f0Var2.shouldIgnore()) {
                        r0 r0Var = (r0) this.mViewInfoStore.alpha.get(f0Var2);
                        if (r0Var != null && (r0Var.alpha & 1) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        r0 r0Var2 = (r0) this.mViewInfoStore.alpha.get(childViewHolderInt);
                        if (r0Var2 != null && (r0Var2.alpha & 1) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 && f0Var2 == childViewHolderInt) {
                            this.mViewInfoStore.alpha(childViewHolderInt, recordPostLayoutInformation);
                        } else {
                            G bravo = this.mViewInfoStore.bravo(f0Var2, 4);
                            this.mViewInfoStore.alpha(childViewHolderInt, recordPostLayoutInformation);
                            G bravo2 = this.mViewInfoStore.bravo(childViewHolderInt, 8);
                            if (bravo == null) {
                                int echo2 = this.mChildHelper.echo();
                                for (int i5 = 0; i5 < echo2; i5++) {
                                    f0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.delta(i5));
                                    if (childViewHolderInt2 != childViewHolderInt && getChangedHolderKey(childViewHolderInt2) == changedHolderKey) {
                                        az azVar = this.mAdapter;
                                        if (azVar != null && azVar.hasStableIds()) {
                                            StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                            sb2.append(childViewHolderInt2);
                                            sb2.append(" \n View Holder 2:");
                                            sb2.append(childViewHolderInt);
                                            throw new IllegalStateException(P0.black(this, sb2));
                                        }
                                        StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                        sb3.append(childViewHolderInt2);
                                        sb3.append(" \n View Holder 2:");
                                        sb3.append(childViewHolderInt);
                                        throw new IllegalStateException(P0.black(this, sb3));
                                    }
                                }
                                Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f0Var2 + " cannot be found but it is necessary for " + childViewHolderInt + exceptionLabel());
                            } else {
                                f0Var2.setIsRecyclable(false);
                                if (z10) {
                                    bravo(f0Var2);
                                }
                                if (f0Var2 != childViewHolderInt) {
                                    if (z11) {
                                        bravo(childViewHolderInt);
                                    }
                                    f0Var2.mShadowedHolder = childViewHolderInt;
                                    bravo(f0Var2);
                                    this.mRecycler.november(f0Var2);
                                    childViewHolderInt.setIsRecyclable(false);
                                    childViewHolderInt.mShadowingHolder = f0Var2;
                                }
                                if (this.mItemAnimator.animateChange(f0Var2, childViewHolderInt, bravo, bravo2)) {
                                    postAnimationRunner();
                                }
                            }
                        }
                    } else {
                        this.mViewInfoStore.alpha(childViewHolderInt, recordPostLayoutInformation);
                    }
                }
            }
            t0 t0Var = this.mViewInfoStore;
            s0 s0Var = this.mViewInfoProcessCallback;
            bv.aw awVar = t0Var.alpha;
            for (int i10 = awVar.red - 1; i10 >= 0; i10--) {
                f0 f0Var3 = (f0) awVar.foxtrot(i10);
                r0 r0Var3 = (r0) awVar.hotel(i10);
                int i11 = r0Var3.alpha;
                if ((i11 & 3) == 3) {
                    RecyclerView recyclerView = ((ax) s0Var).alpha;
                    recyclerView.mLayout.j(f0Var3.itemView, recyclerView.mRecycler);
                } else if ((i11 & 1) != 0) {
                    G g2 = r0Var3.bravo;
                    if (g2 == null) {
                        RecyclerView recyclerView2 = ((ax) s0Var).alpha;
                        recyclerView2.mLayout.j(f0Var3.itemView, recyclerView2.mRecycler);
                    } else {
                        G g5 = r0Var3.charlie;
                        RecyclerView recyclerView3 = ((ax) s0Var).alpha;
                        recyclerView3.mRecycler.november(f0Var3);
                        recyclerView3.animateDisappearance(f0Var3, g2, g5);
                    }
                } else if ((i11 & 14) == 14) {
                    ((ax) s0Var).alpha.animateAppearance(f0Var3, r0Var3.bravo, r0Var3.charlie);
                } else if ((i11 & 12) == 12) {
                    G g10 = r0Var3.bravo;
                    G g11 = r0Var3.charlie;
                    ax axVar = (ax) s0Var;
                    axVar.getClass();
                    f0Var3.setIsRecyclable(false);
                    RecyclerView recyclerView4 = axVar.alpha;
                    if (recyclerView4.mDataSetHasChangedAfterLayout) {
                        if (recyclerView4.mItemAnimator.animateChange(f0Var3, f0Var3, g10, g11)) {
                            recyclerView4.postAnimationRunner();
                        }
                    } else if (recyclerView4.mItemAnimator.animatePersistence(f0Var3, g10, g11)) {
                        recyclerView4.postAnimationRunner();
                    }
                } else if ((i11 & 4) != 0) {
                    G g12 = r0Var3.bravo;
                    RecyclerView recyclerView5 = ((ax) s0Var).alpha;
                    recyclerView5.mRecycler.november(f0Var3);
                    recyclerView5.animateDisappearance(f0Var3, g12, null);
                } else if ((i11 & 8) != 0) {
                    ((ax) s0Var).alpha.animateAppearance(f0Var3, r0Var3.bravo, r0Var3.charlie);
                }
                r0Var3.alpha = 0;
                r0Var3.bravo = null;
                r0Var3.charlie = null;
                r0.delta.alpha(r0Var3);
            }
        }
        this.mLayout.i(this.mRecycler);
        b0 b0Var2 = this.mState;
        b0Var2.bravo = b0Var2.echo;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        b0Var2.juliet = false;
        b0Var2.kilo = false;
        this.mLayout.foxtrot = false;
        ArrayList arrayList = this.mRecycler.bravo;
        if (arrayList != null) {
            arrayList.clear();
        }
        L l10 = this.mLayout;
        if (l10.kilo) {
            l10.juliet = 0;
            l10.kilo = false;
            this.mRecycler.oscar();
        }
        this.mLayout.c(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        t0 t0Var2 = this.mViewInfoStore;
        t0Var2.alpha.clear();
        t0Var2.bravo.bravo();
        int[] iArr = this.mMinMaxLayoutPositions;
        int i12 = iArr[0];
        int i13 = iArr[1];
        golf(iArr);
        int[] iArr2 = this.mMinMaxLayoutPositions;
        if (iArr2[0] != i12 || iArr2[1] != i13) {
            dispatchOnScrolled(0, 0);
        }
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                View focusedChild = getFocusedChild();
                if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                    if (this.mChildHelper.echo() == 0) {
                        requestFocus();
                    }
                }
            }
            if (this.mState.mike != -1 && this.mAdapter.hasStableIds()) {
                f0Var = findViewHolderForItemId(this.mState.mike);
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                if (!this.mChildHelper.charlie.contains(f0Var.itemView) && f0Var.itemView.hasFocusable()) {
                    view = f0Var.itemView;
                    if (view != null) {
                        int i14 = this.mState.november;
                        if (i14 != -1 && (findViewById = view.findViewById(i14)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (this.mChildHelper.echo() > 0) {
                b0 b0Var3 = this.mState;
                int i15 = b0Var3.lima;
                if (i15 != -1) {
                    i4 = i15;
                }
                int bravo3 = b0Var3.bravo();
                for (int i16 = i4; i16 < bravo3; i16++) {
                    f0 findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i16);
                    if (findViewHolderForAdapterPosition == null) {
                        break;
                    }
                    if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                        view = findViewHolderForAdapterPosition.itemView;
                        break;
                    }
                }
                int min = Math.min(bravo3, i4) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    f0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(min);
                    if (findViewHolderForAdapterPosition2 == null) {
                        break;
                    }
                    if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                        view = findViewHolderForAdapterPosition2.itemView;
                        break;
                    }
                    min--;
                }
            }
            if (view != null) {
            }
        }
        b0 b0Var4 = this.mState;
        b0Var4.mike = -1L;
        b0Var4.lima = -1;
        b0Var4.november = -1;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f5, float f10, boolean z2) {
        return getScrollingChildHelper().alpha(f5, f10, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f5, float f10) {
        return getScrollingChildHelper().bravo(f5, f10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().charlie(i4, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i4, int i5, int i10, int i11, int[] iArr) {
        return getScrollingChildHelper().delta(i4, i5, i10, i11, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i4) {
        L l10 = this.mLayout;
        if (l10 != null) {
            l10.f(i4);
        }
        onScrollStateChanged(i4);
        Q q4 = this.mScrollListener;
        if (q4 != null) {
            q4.onScrollStateChanged(this, i4);
        }
        List<Q> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i4);
            }
        }
    }

    public void dispatchOnScrolled(int i4, int i5) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i4, scrollY - i5);
        onScrolled(i4, i5);
        Q q4 = this.mScrollListener;
        if (q4 != null) {
            q4.onScrolled(this, i4, i5);
        }
        List<Q> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i4, i5);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i4;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            f0 f0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (f0Var.itemView.getParent() == this && !f0Var.shouldIgnore() && (i4 = f0Var.mPendingAccessibilityState) != -1) {
                View view = f0Var.itemView;
                WeakHashMap weakHashMap = s1.au.alpha;
                view.setImportantForAccessibility(i4);
                f0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        int i4;
        boolean z10;
        boolean z11;
        int i5;
        boolean z12 = true;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z13 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.mClipToPadding) {
                i5 = getPaddingBottom();
            } else {
                i5 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i5, DECELERATION_RATE);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z2 |= z11;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                i4 = getPaddingTop();
            } else {
                i4 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i4, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            z2 |= z10;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z2 |= z13;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) {
            z12 = z2;
        }
        if (z12) {
            WeakHashMap weakHashMap = s1.au.alpha;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j5) {
        return super.drawChild(canvas, view, j5);
    }

    public final void echo() {
        boolean z2;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.alpha(6);
        this.mAdapterHelper.charlie();
        this.mState.echo = this.mAdapter.getItemCount();
        this.mState.charlie = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.red;
            if (parcelable != null) {
                this.mLayout.d(parcelable);
            }
            this.mPendingSavedState = null;
        }
        b0 b0Var = this.mState;
        b0Var.golf = false;
        this.mLayout.b(this.mRecycler, b0Var);
        b0 b0Var2 = this.mState;
        b0Var2.foxtrot = false;
        if (b0Var2.juliet && this.mItemAnimator != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        b0Var2.juliet = z2;
        b0Var2.delta = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((c0) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((c0) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((c0) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((c0) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(b0 b0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.red;
            overScroller.getFinalX();
            overScroller.getCurrX();
            b0Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        b0Var.getClass();
    }

    public View findChildViewUnder(float f5, float f10) {
        for (int echo = this.mChildHelper.echo() - 1; echo >= 0; echo--) {
            View delta = this.mChildHelper.delta(echo);
            float translationX = delta.getTranslationX();
            float translationY = delta.getTranslationY();
            if (f5 >= delta.getLeft() + translationX && f5 <= delta.getRight() + translationX && f10 >= delta.getTop() + translationY && f10 <= delta.getBottom() + translationY) {
                return delta;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public f0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public f0 findViewHolderForAdapterPosition(int i4) {
        f0 f0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int hotel = this.mChildHelper.hotel();
        for (int i5 = 0; i5 < hotel; i5++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.golf(i5));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i4) {
                C0666k c0666k = this.mChildHelper;
                if (c0666k.charlie.contains(childViewHolderInt.itemView)) {
                    f0Var = childViewHolderInt;
                } else {
                    return childViewHolderInt;
                }
            }
        }
        return f0Var;
    }

    public f0 findViewHolderForItemId(long j5) {
        az azVar = this.mAdapter;
        f0 f0Var = null;
        if (azVar != null && azVar.hasStableIds()) {
            int hotel = this.mChildHelper.hotel();
            for (int i4 = 0; i4 < hotel; i4++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.golf(i4));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j5) {
                    C0666k c0666k = this.mChildHelper;
                    if (c0666k.charlie.contains(childViewHolderInt.itemView)) {
                        f0Var = childViewHolderInt;
                    } else {
                        return childViewHolderInt;
                    }
                }
            }
        }
        return f0Var;
    }

    public f0 findViewHolderForLayoutPosition(int i4) {
        return findViewHolderForPosition(i4, false);
    }

    @Deprecated
    public f0 findViewHolderForPosition(int i4) {
        return findViewHolderForPosition(i4, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0212, code lost:
    
        if (r1 < r14) goto L283;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean fling(int i4, int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f5;
        float f10;
        boolean z2;
        int i14;
        boolean z10;
        boolean z11;
        int i15;
        int minFlingVelocity;
        boolean z12;
        at atVar;
        K1.g gVar;
        boolean z13;
        boolean z14;
        int i16;
        int i17;
        PointF alpha;
        int i18;
        L l10 = this.mLayout;
        if (l10 == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.mLayoutSuppressed) {
            boolean echo = l10.echo();
            boolean foxtrot = this.mLayout.foxtrot();
            if (echo && Math.abs(i4) >= this.mMinFlingVelocity) {
                i10 = i4;
            } else {
                i10 = 0;
            }
            if (foxtrot && Math.abs(i5) >= this.mMinFlingVelocity) {
                i11 = i5;
            } else {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (i10 != 0) {
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect != null && AbstractC3091z3.charlie(edgeEffect) != DECELERATION_RATE) {
                        int i19 = -i10;
                        if (papa(this.mLeftGlow, i19, getWidth())) {
                            this.mLeftGlow.onAbsorb(i19);
                            i10 = 0;
                        }
                        i12 = i10;
                        i10 = 0;
                    } else {
                        EdgeEffect edgeEffect2 = this.mRightGlow;
                        if (edgeEffect2 != null && AbstractC3091z3.charlie(edgeEffect2) != DECELERATION_RATE) {
                            if (papa(this.mRightGlow, i10, getWidth())) {
                                this.mRightGlow.onAbsorb(i10);
                                i10 = 0;
                            }
                            i12 = i10;
                            i10 = 0;
                        }
                    }
                    if (i11 != 0) {
                        EdgeEffect edgeEffect3 = this.mTopGlow;
                        if (edgeEffect3 != null && AbstractC3091z3.charlie(edgeEffect3) != DECELERATION_RATE) {
                            int i20 = -i11;
                            if (papa(this.mTopGlow, i20, getHeight())) {
                                this.mTopGlow.onAbsorb(i20);
                                i11 = 0;
                            }
                            i13 = 0;
                        } else {
                            EdgeEffect edgeEffect4 = this.mBottomGlow;
                            if (edgeEffect4 != null && AbstractC3091z3.charlie(edgeEffect4) != DECELERATION_RATE) {
                                if (papa(this.mBottomGlow, i11, getHeight())) {
                                    this.mBottomGlow.onAbsorb(i11);
                                    i11 = 0;
                                }
                                i13 = 0;
                            }
                        }
                        if (i12 == 0 || i11 != 0) {
                            int i21 = this.mMaxFlingVelocity;
                            i12 = Math.max(-i21, Math.min(i12, i21));
                            int i22 = this.mMaxFlingVelocity;
                            i11 = Math.max(-i22, Math.min(i11, i22));
                            this.mViewFlinger.alpha(i12, i11);
                        }
                        if (i10 != 0 && i13 == 0) {
                            if (i12 != 0 || i11 != 0) {
                                return true;
                            }
                        } else {
                            f5 = i10;
                            f10 = i13;
                            if (!dispatchNestedPreFling(f5, f10)) {
                                if (!echo && !foxtrot) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                dispatchNestedFling(f5, f10, z2);
                                O o5 = this.mOnFlingListener;
                                if (o5 != null) {
                                    au auVar = (au) o5;
                                    L layoutManager = auVar.alpha.getLayoutManager();
                                    if (layoutManager != 0 && auVar.alpha.getAdapter() != null && ((Math.abs(i13) > (minFlingVelocity = auVar.alpha.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && ((z12 = layoutManager instanceof Z)))) {
                                        View view = null;
                                        if (!z12) {
                                            atVar = null;
                                        } else {
                                            atVar = new at(auVar, auVar.alpha.getContext());
                                        }
                                        if (atVar != null) {
                                            int coral = layoutManager.coral();
                                            if (coral != 0) {
                                                if (layoutManager.foxtrot()) {
                                                    gVar = auVar.echo(layoutManager);
                                                } else if (layoutManager.echo()) {
                                                    gVar = auVar.delta(layoutManager);
                                                } else {
                                                    gVar = null;
                                                }
                                                if (gVar != null) {
                                                    z10 = false;
                                                    int whiskey = layoutManager.whiskey();
                                                    z11 = true;
                                                    int i23 = 0;
                                                    int i24 = Integer.MIN_VALUE;
                                                    int i25 = Integer.MAX_VALUE;
                                                    View view2 = null;
                                                    int i26 = echo;
                                                    while (i23 < whiskey) {
                                                        int i27 = i26;
                                                        View victor = layoutManager.victor(i23);
                                                        if (victor == null) {
                                                            i18 = whiskey;
                                                        } else {
                                                            i18 = whiskey;
                                                            int bravo = au.bravo(victor, gVar);
                                                            if (bravo <= 0 && bravo > i24) {
                                                                view2 = victor;
                                                                i24 = bravo;
                                                            }
                                                            if (bravo >= 0 && bravo < i25) {
                                                                view = victor;
                                                                i25 = bravo;
                                                            }
                                                        }
                                                        i23++;
                                                        i26 = i27;
                                                        whiskey = i18;
                                                    }
                                                    i14 = i26;
                                                    if (!layoutManager.echo() ? i13 > 0 : i10 > 0) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    if (z13 && view != null) {
                                                        i17 = L.gray(view);
                                                    } else if (!z13 && view2 != null) {
                                                        i17 = L.gray(view2);
                                                    } else {
                                                        if (z13) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            int gray = L.gray(view);
                                                            int coral2 = layoutManager.coral();
                                                            if (!z12 || (alpha = ((Z) layoutManager).alpha(coral2 - 1)) == null || (alpha.x >= DECELERATION_RATE && alpha.y >= DECELERATION_RATE)) {
                                                                z14 = false;
                                                            } else {
                                                                z14 = true;
                                                            }
                                                            if (z14 == z13) {
                                                                i16 = -1;
                                                            } else {
                                                                i16 = 1;
                                                            }
                                                            i17 = i16 + gray;
                                                            if (i17 >= 0) {
                                                            }
                                                        }
                                                        i17 = -1;
                                                    }
                                                    if (i17 != -1) {
                                                        atVar.setTargetPosition(i17);
                                                        layoutManager.y(atVar);
                                                        return z11;
                                                    }
                                                    if (z2) {
                                                        if (foxtrot) {
                                                            i15 = i14 | 2;
                                                        } else {
                                                            i15 = i14;
                                                        }
                                                        boolean z15 = z11;
                                                        startNestedScroll(i15, z15 ? 1 : 0);
                                                        int i28 = this.mMaxFlingVelocity;
                                                        int max = Math.max(-i28, Math.min(i10, i28));
                                                        int i29 = this.mMaxFlingVelocity;
                                                        this.mViewFlinger.alpha(max, Math.max(-i29, Math.min(i13, i29)));
                                                        return z15;
                                                    }
                                                    return z10;
                                                }
                                            }
                                            i14 = echo;
                                            z10 = false;
                                            z11 = true;
                                            i17 = -1;
                                            if (i17 != -1) {
                                            }
                                            if (z2) {
                                            }
                                        }
                                    }
                                }
                                i14 = echo;
                                z10 = false;
                                z11 = true;
                                if (z2) {
                                }
                            }
                        }
                    }
                    i13 = i11;
                    i11 = 0;
                    if (i12 == 0) {
                    }
                    int i212 = this.mMaxFlingVelocity;
                    i12 = Math.max(-i212, Math.min(i12, i212));
                    int i222 = this.mMaxFlingVelocity;
                    i11 = Math.max(-i222, Math.min(i11, i222));
                    this.mViewFlinger.alpha(i12, i11);
                    if (i10 != 0) {
                    }
                    f5 = i10;
                    f10 = i13;
                    if (!dispatchNestedPreFling(f5, f10)) {
                    }
                }
                i12 = 0;
                if (i11 != 0) {
                }
                i13 = i11;
                i11 = 0;
                if (i12 == 0) {
                }
                int i2122 = this.mMaxFlingVelocity;
                i12 = Math.max(-i2122, Math.min(i12, i2122));
                int i2222 = this.mMaxFlingVelocity;
                i11 = Math.max(-i2222, Math.min(i11, i2222));
                this.mViewFlinger.alpha(i12, i11);
                if (i10 != 0) {
                }
                f5 = i10;
                f10 = i13;
                if (!dispatchNestedPreFling(f5, f10)) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0194, code lost:
    
        if (r16 < 0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0197, code lost:
    
        if (r5 < 0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x019f, code lost:
    
        if ((r5 * r6) <= 0) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a7, code lost:
    
        if ((r5 * r6) >= 0) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017a, code lost:
    
        if (r16 > 0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0191, code lost:
    
        if (r5 > 0) goto L287;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View focusSearch(View view, int i4) {
        boolean z2;
        View view2;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c3;
        boolean z10;
        boolean z11;
        boolean z12;
        int i15;
        int i16;
        int i17 = i4;
        this.mLayout.getClass();
        if (this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed) {
            z2 = true;
        } else {
            z2 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i17 == 2 || i17 == 1)) {
            if (this.mLayout.foxtrot()) {
                if (i17 == 2) {
                    i16 = 130;
                } else {
                    i16 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i16) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i17 = i16;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.mLayout.echo()) {
                if (this.mLayout.crimson() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i17 == 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 ^ z12) {
                    i15 = 66;
                } else {
                    i15 = 17;
                }
                if (focusFinder.findNextFocus(this, view, i15) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i17 = i15;
                }
            }
            if (z10) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) != null) {
                    startInterceptRequestLayout();
                    this.mLayout.orange(view, i17, this.mRecycler, this.mState);
                    stopInterceptRequestLayout(false);
                }
                return null;
            }
            view2 = focusFinder.findNextFocus(this, view, i17);
            if (view2 == null) {
            }
            if (view2 != null) {
                if (view != null) {
                    this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
                    this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
                    offsetDescendantRectToMyCoords(view, this.mTempRect);
                    offsetDescendantRectToMyCoords(view2, this.mTempRect2);
                    if (this.mLayout.crimson() != 1) {
                    }
                    Rect rect = this.mTempRect;
                    i10 = rect.left;
                    Rect rect2 = this.mTempRect2;
                    i11 = rect2.left;
                    if (i10 >= i11) {
                    }
                    i12 = 1;
                    i13 = rect.top;
                    i14 = rect2.top;
                    if (i13 >= i14) {
                    }
                    c3 = 1;
                    if (i17 == 1) {
                    }
                }
                return view2;
            }
            return super.focusSearch(view, i17);
        }
        View findNextFocus = focusFinder.findNextFocus(this, view, i17);
        if (findNextFocus == null && z2) {
            consumePendingUpdateOperations();
            if (findContainingItemView(view) != null) {
                startInterceptRequestLayout();
                view2 = this.mLayout.orange(view, i17, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            return null;
        }
        view2 = findNextFocus;
        if (view2 == null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i17);
            }
            mike(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view && findContainingItemView(view2) != null) {
            if (view != null && findContainingItemView(view) != null) {
                this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
                this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
                offsetDescendantRectToMyCoords(view, this.mTempRect);
                offsetDescendantRectToMyCoords(view2, this.mTempRect2);
                if (this.mLayout.crimson() != 1) {
                    i5 = -1;
                } else {
                    i5 = 1;
                }
                Rect rect3 = this.mTempRect;
                i10 = rect3.left;
                Rect rect22 = this.mTempRect2;
                i11 = rect22.left;
                if ((i10 >= i11 || rect3.right <= i11) && rect3.right < rect22.right) {
                    i12 = 1;
                } else {
                    int i18 = rect3.right;
                    int i19 = rect22.right;
                    if ((i18 > i19 || i10 >= i19) && i10 > i11) {
                        i12 = -1;
                    } else {
                        i12 = 0;
                    }
                }
                i13 = rect3.top;
                i14 = rect22.top;
                if ((i13 >= i14 || rect3.bottom <= i14) && rect3.bottom < rect22.bottom) {
                    c3 = 1;
                } else {
                    int i20 = rect3.bottom;
                    int i21 = rect22.bottom;
                    if ((i20 > i21 || i13 >= i21) && i13 > i14) {
                        c3 = 65535;
                    } else {
                        c3 = 0;
                    }
                }
                if (i17 == 1) {
                    if (i17 != 2) {
                        if (i17 != 17) {
                            if (i17 != 33) {
                                if (i17 != 66) {
                                    if (i17 != 130) {
                                        StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                                        sb2.append(i17);
                                        throw new IllegalArgumentException(P0.black(this, sb2));
                                    }
                                }
                            }
                        }
                    } else if (c3 <= 0) {
                        if (c3 == 0) {
                        }
                    }
                } else if (c3 >= 0) {
                    if (c3 == 0) {
                    }
                }
            }
            return view2;
        }
        return super.focusSearch(view, i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean foxtrot(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i4 = 0; i4 < size; i4++) {
            P p4 = this.mOnItemTouchListeners.get(i4);
            ad adVar = (ad) p4;
            int i5 = adVar.victor;
            if (i5 == 1) {
                boolean bravo = adVar.bravo(motionEvent.getX(), motionEvent.getY());
                boolean alpha = adVar.alpha(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (bravo || alpha)) {
                    if (alpha) {
                        adVar.whiskey = 1;
                        adVar.papa = (int) motionEvent.getX();
                    } else if (bravo) {
                        adVar.whiskey = 2;
                        adVar.mike = (int) motionEvent.getY();
                    }
                    adVar.delta(2);
                    if (action == 3) {
                        this.mInterceptingOnItemTouchListener = p4;
                        return true;
                    }
                }
            } else {
                if (i5 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        L l10 = this.mLayout;
        if (l10 != null) {
            return l10.sierra();
        }
        throw new IllegalStateException(P0.black(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        L l10 = this.mLayout;
        if (l10 != null) {
            return l10.tango(getContext(), attributeSet);
        }
        throw new IllegalStateException(P0.black(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public az getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(f0 f0Var) {
        if (!f0Var.hasAnyOfTheFlags(524) && f0Var.isBound()) {
            C0657b c0657b = this.mAdapterHelper;
            int i4 = f0Var.mPosition;
            ArrayList arrayList = c0657b.bravo;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                C0656a c0656a = (C0656a) arrayList.get(i5);
                int i10 = c0656a.alpha;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 8) {
                            int i11 = c0656a.bravo;
                            if (i11 == i4) {
                                i4 = c0656a.delta;
                            } else {
                                if (i11 < i4) {
                                    i4--;
                                }
                                if (c0656a.delta <= i4) {
                                    i4++;
                                }
                            }
                        }
                    } else {
                        int i12 = c0656a.bravo;
                        if (i12 <= i4) {
                            int i13 = c0656a.delta;
                            if (i12 + i13 <= i4) {
                                i4 -= i13;
                            } else {
                                return -1;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (c0656a.bravo <= i4) {
                    i4 += c0656a.delta;
                }
            }
            return i4;
        }
        return -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        L l10 = this.mLayout;
        if (l10 != null) {
            l10.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    public long getChangedHolderKey(f0 f0Var) {
        if (this.mAdapter.hasStableIds()) {
            return f0Var.getItemId();
        }
        return f0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i4, int i5) {
        return super.getChildDrawingOrder(i4, i5);
    }

    public long getChildItemId(View view) {
        f0 childViewHolderInt;
        az azVar = this.mAdapter;
        if (azVar == null || !azVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public f0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public h0 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public D getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public H getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        M m4 = (M) view.getLayoutParams();
        boolean z2 = m4.red;
        Rect rect = m4.purple;
        if (!z2 || (this.mState.golf && (m4.alpha.isUpdated() || m4.alpha.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i4).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i5 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i5 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        m4.red = false;
        return rect;
    }

    public I getItemDecorationAt(int i4) {
        int itemDecorationCount = getItemDecorationCount();
        if (i4 >= 0 && i4 < itemDecorationCount) {
            return this.mItemDecorations.get(i4);
        }
        throw new IndexOutOfBoundsException(i4 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public L getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public O getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public T getRecycledViewPool() {
        return this.mRecycler.charlie();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public final void golf(int[] iArr) {
        int echo = this.mChildHelper.echo();
        if (echo == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i4 = LottieConstants.IterateForever;
        int i5 = UNDEFINED_DURATION;
        for (int i10 = 0; i10 < echo; i10++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.delta(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i4) {
                    i4 = layoutPosition;
                }
                if (layoutPosition > i5) {
                    i5 = layoutPosition;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().foxtrot(0);
    }

    public boolean hasPendingAdapterUpdates() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout && !this.mAdapterHelper.golf()) {
            return false;
        }
        return true;
    }

    public final void hotel(MotionEvent motionEvent, int i4, int i5) {
        int i10;
        float y10;
        float x4;
        int i11;
        int i12;
        int i13;
        L l10 = this.mLayout;
        if (l10 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        int i14 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean echo = l10.echo();
        boolean foxtrot = this.mLayout.foxtrot();
        if (foxtrot) {
            i10 = (echo ? 1 : 0) | 2;
        } else {
            i10 = echo ? 1 : 0;
        }
        if (motionEvent == null) {
            y10 = getHeight() / 2.0f;
        } else {
            y10 = motionEvent.getY();
        }
        if (motionEvent == null) {
            x4 = getWidth() / 2.0f;
        } else {
            x4 = motionEvent.getX();
        }
        int kilo = i4 - kilo(y10, i4);
        int lima = i5 - lima(x4, i5);
        startNestedScroll(i10, 1);
        if (echo) {
            i11 = kilo;
        } else {
            i11 = 0;
        }
        if (foxtrot) {
            i12 = lima;
        } else {
            i12 = 0;
        }
        if (dispatchNestedPreScroll(i11, i12, this.mReusableIntPair, this.mScrollOffset, 1)) {
            int[] iArr2 = this.mReusableIntPair;
            kilo -= iArr2[0];
            lima -= iArr2[1];
        }
        if (echo) {
            i13 = kilo;
        } else {
            i13 = 0;
        }
        if (foxtrot) {
            i14 = lima;
        }
        scrollByInternal(i13, i14, motionEvent, 1);
        ag agVar = this.mGapWorker;
        if (agVar != null && (kilo != 0 || lima != 0)) {
            agVar.alpha(this, kilo, lima);
        }
        stopNestedScroll(1);
    }

    public final void india(MotionEvent motionEvent) {
        int i4;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i4);
            int x4 = (int) (motionEvent.getX(i4) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y10 = (int) (motionEvent.getY(i4) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C0657b(new ax(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new ad(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(delivery.samurai.android.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(delivery.samurai.android.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(delivery.samurai.android.R.dimen.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException(P0.black(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        L l10 = this.mLayout;
        if (l10 != null) {
            l10.charlie("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isAnimating() {
        H h4 = this.mItemAnimator;
        if (h4 != null && h4.isRunning()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        if (this.mLayoutOrScrollCounter > 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().delta;
    }

    public final void juliet() {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            C0657b c0657b = this.mAdapterHelper;
            c0657b.kilo(c0657b.bravo);
            c0657b.kilo(c0657b.charlie);
            c0657b.foxtrot = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.silver();
            }
        }
        if (this.mItemAnimator != null && this.mLayout.z()) {
            this.mAdapterHelper.juliet();
        } else {
            this.mAdapterHelper.charlie();
        }
        if (!this.mItemsAddedOrRemoved && !this.mItemsChanged) {
            z2 = false;
        } else {
            z2 = true;
        }
        b0 b0Var = this.mState;
        if (this.mFirstLayoutComplete && this.mItemAnimator != null && (((z11 = this.mDataSetHasChangedAfterLayout) || z2 || this.mLayout.foxtrot) && (!z11 || this.mAdapter.hasStableIds()))) {
            z10 = true;
        } else {
            z10 = false;
        }
        b0Var.juliet = z10;
        b0 b0Var2 = this.mState;
        if (b0Var2.juliet && z2 && !this.mDataSetHasChangedAfterLayout && this.mItemAnimator != null && this.mLayout.z()) {
            z12 = true;
        }
        b0Var2.kilo = z12;
    }

    public void jumpToPositionForSmoothScroller(int i4) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.n(i4);
        awakenScrollBars();
    }

    public final int kilo(float f5, int i4) {
        float height = f5 / getHeight();
        float width = i4 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f10 = DECELERATION_RATE;
        if (edgeEffect != null && AbstractC3091z3.charlie(edgeEffect) != DECELERATION_RATE) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f11 = -AbstractC3091z3.golf(this.mLeftGlow, -width, 1.0f - height);
                if (AbstractC3091z3.charlie(this.mLeftGlow) == DECELERATION_RATE) {
                    this.mLeftGlow.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && AbstractC3091z3.charlie(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float golf = AbstractC3091z3.golf(this.mRightGlow, width, height);
                    if (AbstractC3091z3.charlie(this.mRightGlow) == DECELERATION_RATE) {
                        this.mRightGlow.onRelease();
                    }
                    f10 = golf;
                }
                invalidate();
            }
        }
        return Math.round(f10 * getWidth());
    }

    public final int lima(float f5, int i4) {
        float width = f5 / getWidth();
        float height = i4 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f10 = DECELERATION_RATE;
        if (edgeEffect != null && AbstractC3091z3.charlie(edgeEffect) != DECELERATION_RATE) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f11 = -AbstractC3091z3.golf(this.mTopGlow, -height, width);
                if (AbstractC3091z3.charlie(this.mTopGlow) == DECELERATION_RATE) {
                    this.mTopGlow.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && AbstractC3091z3.charlie(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float golf = AbstractC3091z3.golf(this.mBottomGlow, height, 1.0f - width);
                    if (AbstractC3091z3.charlie(this.mBottomGlow) == DECELERATION_RATE) {
                        this.mBottomGlow.onRelease();
                    }
                    f10 = golf;
                }
                invalidate();
            }
        }
        return Math.round(f10 * getHeight());
    }

    public void markItemDecorInsetsDirty() {
        int hotel = this.mChildHelper.hotel();
        for (int i4 = 0; i4 < hotel; i4++) {
            ((M) this.mChildHelper.golf(i4).getLayoutParams()).red = true;
        }
        ArrayList arrayList = this.mRecycler.charlie;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            M m4 = (M) ((f0) arrayList.get(i5)).itemView.getLayoutParams();
            if (m4 != null) {
                m4.red = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int hotel = this.mChildHelper.hotel();
        for (int i4 = 0; i4 < hotel; i4++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.golf(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        U u4 = this.mRecycler;
        ArrayList arrayList = u4.charlie;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            f0 f0Var = (f0) arrayList.get(i5);
            if (f0Var != null) {
                f0Var.addFlags(6);
                f0Var.addChangePayload(null);
            }
        }
        az azVar = u4.hotel.mAdapter;
        if (azVar != null && azVar.hasStableIds()) {
            return;
        }
        u4.hotel();
    }

    public final void mike(View view, View view2) {
        View view3;
        boolean z2;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof M) {
            M m4 = (M) layoutParams;
            if (!m4.red) {
                Rect rect = this.mTempRect;
                int i4 = rect.left;
                Rect rect2 = m4.purple;
                rect.left = i4 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        L l10 = this.mLayout;
        Rect rect3 = this.mTempRect;
        boolean z10 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        l10.k(this, view, rect3, z10, z2);
    }

    public void nestedScrollBy(int i4, int i5) {
        hotel(null, i4, i5);
    }

    public final void november() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        stopNestedScroll(0);
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = s1.au.alpha;
            postInvalidateOnAnimation();
        }
    }

    public void offsetChildrenHorizontal(int i4) {
        int echo = this.mChildHelper.echo();
        for (int i5 = 0; i5 < echo; i5++) {
            this.mChildHelper.delta(i5).offsetLeftAndRight(i4);
        }
    }

    public void offsetChildrenVertical(int i4) {
        int echo = this.mChildHelper.echo();
        for (int i5 = 0; i5 < echo; i5++) {
            this.mChildHelper.delta(i5).offsetTopAndBottom(i4);
        }
    }

    public void offsetPositionRecordsForInsert(int i4, int i5) {
        int hotel = this.mChildHelper.hotel();
        for (int i10 = 0; i10 < hotel; i10++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.golf(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i4) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i10 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i5));
                }
                childViewHolderInt.offsetPosition(i5, false);
                this.mState.foxtrot = true;
            }
        }
        ArrayList arrayList = this.mRecycler.charlie;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f0 f0Var = (f0) arrayList.get(i11);
            if (f0Var != null && f0Var.mPosition >= i4) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert cached " + i11 + " holder " + f0Var + " now at position " + (f0Var.mPosition + i5));
                }
                f0Var.offsetPosition(i5, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i4, int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int hotel = this.mChildHelper.hotel();
        int i17 = -1;
        if (i4 < i5) {
            i11 = i4;
            i10 = i5;
            i12 = -1;
        } else {
            i10 = i4;
            i11 = i5;
            i12 = 1;
        }
        for (int i18 = 0; i18 < hotel; i18++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.golf(i18));
            if (childViewHolderInt != null && (i16 = childViewHolderInt.mPosition) >= i11 && i16 <= i10) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i18 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i4) {
                    childViewHolderInt.offsetPosition(i5 - i4, false);
                } else {
                    childViewHolderInt.offsetPosition(i12, false);
                }
                this.mState.foxtrot = true;
            }
        }
        U u4 = this.mRecycler;
        u4.getClass();
        if (i4 < i5) {
            i14 = i4;
            i13 = i5;
        } else {
            i13 = i4;
            i17 = 1;
            i14 = i5;
        }
        ArrayList arrayList = u4.charlie;
        int size = arrayList.size();
        for (int i19 = 0; i19 < size; i19++) {
            f0 f0Var = (f0) arrayList.get(i19);
            if (f0Var != null && (i15 = f0Var.mPosition) >= i14 && i15 <= i13) {
                if (i15 == i4) {
                    f0Var.offsetPosition(i5 - i4, false);
                } else {
                    f0Var.offsetPosition(i17, false);
                }
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove cached child " + i19 + " holder " + f0Var);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i4, int i5, boolean z2) {
        int i10 = i4 + i5;
        int hotel = this.mChildHelper.hotel();
        for (int i11 = 0; i11 < hotel; i11++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.golf(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i12 = childViewHolderInt.mPosition;
                if (i12 >= i10) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i11 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i5));
                    }
                    childViewHolderInt.offsetPosition(-i5, z2);
                    this.mState.foxtrot = true;
                } else if (i12 >= i4) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i11 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i4 - 1, -i5, z2);
                    this.mState.foxtrot = true;
                }
            }
        }
        U u4 = this.mRecycler;
        ArrayList arrayList = u4.charlie;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f0 f0Var = (f0) arrayList.get(size);
            if (f0Var != null) {
                int i13 = f0Var.mPosition;
                if (i13 >= i10) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + f0Var + " now at position " + (f0Var.mPosition - i5));
                    }
                    f0Var.offsetPosition(-i5, z2);
                } else if (i13 >= i4) {
                    f0Var.addFlags(8);
                    u4.india(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r1 >= 30.0f) goto L55;
     */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.recyclerview.widget.ag, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        boolean z2;
        float f5;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        if (this.mFirstLayoutComplete && !isLayoutRequested()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mFirstLayoutComplete = z2;
        this.mRecycler.foxtrot();
        L l10 = this.mLayout;
        if (l10 != null) {
            l10.golf = true;
            l10.ochre(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = ag.teal;
            ag agVar = (ag) threadLocal.get();
            this.mGapWorker = agVar;
            if (agVar == null) {
                ?? obj = new Object();
                obj.alpha = new ArrayList();
                obj.silver = new ArrayList();
                this.mGapWorker = obj;
                WeakHashMap weakHashMap = s1.au.alpha;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f5 = display.getRefreshRate();
                }
                f5 = 60.0f;
                ag agVar2 = this.mGapWorker;
                agVar2.red = 1.0E9f / f5;
                threadLocal.set(agVar2);
            }
            ag agVar3 = this.mGapWorker;
            agVar3.getClass();
            boolean z10 = sDebugAssertionsEnabled;
            ArrayList arrayList = agVar3.alpha;
            if (z10 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ag agVar;
        super.onDetachedFromWindow();
        H h4 = this.mItemAnimator;
        if (h4 != null) {
            h4.endAnimations();
        }
        stopScroll();
        int i4 = 0;
        this.mIsAttached = false;
        L l10 = this.mLayout;
        if (l10 != null) {
            l10.golf = false;
            l10.olive(this);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        do {
        } while (r0.delta.charlie() != null);
        U u4 = this.mRecycler;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = u4.charlie;
            if (i5 >= arrayList.size()) {
                break;
            }
            AbstractC2977c3.alpha(((f0) arrayList.get(i5)).itemView);
            i5++;
        }
        u4.golf(u4.hotel.mAdapter, false);
        while (i4 < getChildCount()) {
            int i10 = i4 + 1;
            View childAt = getChildAt(i4);
            if (childAt != null) {
                ArrayList arrayList2 = AbstractC2977c3.charlie(childAt).alpha;
                for (int ivory = CollectionsKt.ivory(arrayList2); -1 < ivory; ivory--) {
                    ((x0) arrayList2.get(ivory)).alpha.delta();
                }
                i4 = i10;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if (ALLOW_THREAD_GAP_WORK && (agVar = this.mGapWorker) != null) {
            boolean remove = agVar.alpha.remove(this);
            if (sDebugAssertionsEnabled && !remove) {
                throw new IllegalStateException("RecyclerView removal failed!");
            }
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.mItemDecorations.get(i4).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f5;
        float f10;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.mLayout.foxtrot()) {
                    f5 = -motionEvent.getAxisValue(9);
                } else {
                    f5 = 0.0f;
                }
                if (this.mLayout.echo()) {
                    f10 = motionEvent.getAxisValue(10);
                    if (f5 == DECELERATION_RATE || f10 != DECELERATION_RATE) {
                        hotel(motionEvent, (int) (f10 * this.mScaledHorizontalScrollFactor), (int) (f5 * this.mScaledVerticalScrollFactor));
                    }
                }
                f10 = 0.0f;
                if (f5 == DECELERATION_RATE) {
                }
                hotel(motionEvent, (int) (f10 * this.mScaledHorizontalScrollFactor), (int) (f5 * this.mScaledVerticalScrollFactor));
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.foxtrot()) {
                        f5 = -axisValue;
                        f10 = 0.0f;
                        if (f5 == DECELERATION_RATE) {
                        }
                        hotel(motionEvent, (int) (f10 * this.mScaledHorizontalScrollFactor), (int) (f5 * this.mScaledVerticalScrollFactor));
                    } else if (this.mLayout.echo()) {
                        f10 = axisValue;
                        f5 = 0.0f;
                        if (f5 == DECELERATION_RATE) {
                        }
                        hotel(motionEvent, (int) (f10 * this.mScaledHorizontalScrollFactor), (int) (f5 * this.mScaledVerticalScrollFactor));
                    }
                }
                f5 = 0.0f;
                f10 = 0.0f;
                if (f5 == DECELERATION_RATE) {
                }
                hotel(motionEvent, (int) (f10 * this.mScaledHorizontalScrollFactor), (int) (f5 * this.mScaledVerticalScrollFactor));
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z10;
        if (!this.mLayoutSuppressed) {
            this.mInterceptingOnItemTouchListener = null;
            if (foxtrot(motionEvent)) {
                november();
                setScrollState(0);
                return true;
            }
            L l10 = this.mLayout;
            if (l10 != null) {
                boolean echo = l10.echo();
                boolean foxtrot = this.mLayout.foxtrot();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                this.mVelocityTracker.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        india(motionEvent);
                                    }
                                } else {
                                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.mLastTouchX = x4;
                                    this.mInitialTouchX = x4;
                                    int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.mLastTouchY = y10;
                                    this.mInitialTouchY = y10;
                                }
                            } else {
                                november();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                            if (findPointerIndex < 0) {
                                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x5 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            if (this.mScrollState != 1) {
                                int i4 = x5 - this.mInitialTouchX;
                                int i5 = y11 - this.mInitialTouchY;
                                if (echo != 0 && Math.abs(i4) > this.mTouchSlop) {
                                    this.mLastTouchX = x5;
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (foxtrot && Math.abs(i5) > this.mTouchSlop) {
                                    this.mLastTouchY = y11;
                                    z10 = true;
                                }
                                if (z10) {
                                    setScrollState(1);
                                }
                            }
                        }
                    } else {
                        this.mVelocityTracker.clear();
                        stopNestedScroll(0);
                    }
                } else {
                    if (this.mIgnoreMotionEventTillDown) {
                        this.mIgnoreMotionEventTillDown = false;
                    }
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x10;
                    this.mInitialTouchX = x10;
                    int y12 = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y12;
                    this.mInitialTouchY = y12;
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect != null && AbstractC3091z3.charlie(edgeEffect) != DECELERATION_RATE && !canScrollHorizontally(-1)) {
                        AbstractC3091z3.golf(this.mLeftGlow, DECELERATION_RATE, 1.0f - (motionEvent.getY() / getHeight()));
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    EdgeEffect edgeEffect2 = this.mRightGlow;
                    boolean z11 = z2;
                    if (edgeEffect2 != null) {
                        z11 = z2;
                        if (AbstractC3091z3.charlie(edgeEffect2) != DECELERATION_RATE) {
                            z11 = z2;
                            if (!canScrollHorizontally(1)) {
                                AbstractC3091z3.golf(this.mRightGlow, DECELERATION_RATE, motionEvent.getY() / getHeight());
                                z11 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.mTopGlow;
                    boolean z12 = z11;
                    if (edgeEffect3 != null) {
                        z12 = z11;
                        if (AbstractC3091z3.charlie(edgeEffect3) != DECELERATION_RATE) {
                            z12 = z11;
                            if (!canScrollVertically(-1)) {
                                AbstractC3091z3.golf(this.mTopGlow, DECELERATION_RATE, motionEvent.getX() / getWidth());
                                z12 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.mBottomGlow;
                    boolean z13 = z12;
                    if (edgeEffect4 != null) {
                        z13 = z12;
                        if (AbstractC3091z3.charlie(edgeEffect4) != DECELERATION_RATE) {
                            z13 = z12;
                            if (!canScrollVertically(1)) {
                                AbstractC3091z3.golf(this.mBottomGlow, DECELERATION_RATE, 1.0f - (motionEvent.getX() / getWidth()));
                                z13 = true;
                            }
                        }
                    }
                    if (z13 || this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        stopNestedScroll(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i10 = echo;
                    if (foxtrot) {
                        i10 = (echo ? 1 : 0) | 2;
                    }
                    startNestedScroll(i10, 0);
                }
                if (this.mScrollState == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        int i12 = o1.i.alpha;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        L l10 = this.mLayout;
        if (l10 == null) {
            defaultOnMeasure(i4, i5);
            return;
        }
        boolean z2 = false;
        if (l10.jade()) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.mLayout.bravo.defaultOnMeasure(i4, i5);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z2;
            if (!z2 && this.mAdapter != null) {
                if (this.mState.delta == 1) {
                    delta();
                }
                this.mLayout.q(i4, i5);
                this.mState.india = true;
                echo();
                this.mLayout.s(i4, i5);
                if (this.mLayout.v()) {
                    this.mLayout.q(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.india = true;
                    echo();
                    this.mLayout.s(i4, i5);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.bravo.defaultOnMeasure(i4, i5);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            juliet();
            onExitLayoutOrScroll();
            b0 b0Var = this.mState;
            if (b0Var.kilo) {
                b0Var.golf = true;
            } else {
                this.mAdapterHelper.charlie();
                this.mState.golf = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.kilo) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        az azVar = this.mAdapter;
        if (azVar != null) {
            this.mState.echo = azVar.getItemCount();
        } else {
            this.mState.echo = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.bravo.defaultOnMeasure(i4, i5);
        stopInterceptRequestLayout(false);
        this.mState.golf = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.alpha);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, androidx.recyclerview.widget.RecyclerView$SavedState, androidx.customview.view.AbsSavedState] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            absSavedState.red = savedState.red;
            return absSavedState;
        }
        L l10 = this.mLayout;
        if (l10 != null) {
            absSavedState.red = l10.e();
            return absSavedState;
        }
        absSavedState.red = null;
        return absSavedState;
    }

    public void onScrollStateChanged(int i4) {
    }

    public void onScrolled(int i4, int i5) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i10, int i11) {
        super.onSizeChanged(i4, i5, i10, i11);
        if (i4 == i10 && i5 == i11) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0214  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        float f5;
        float f10;
        int i4;
        int i5;
        int i10;
        int i11;
        boolean z10;
        if (!this.mLayoutSuppressed && !this.mIgnoreMotionEventTillDown) {
            P p4 = this.mInterceptingOnItemTouchListener;
            if (p4 == null) {
                if (motionEvent.getAction() == 0) {
                    z2 = false;
                } else {
                    z2 = foxtrot(motionEvent);
                }
            } else {
                ad adVar = (ad) p4;
                if (adVar.victor != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean bravo = adVar.bravo(motionEvent.getX(), motionEvent.getY());
                        boolean alpha = adVar.alpha(motionEvent.getX(), motionEvent.getY());
                        if (bravo || alpha) {
                            if (alpha) {
                                adVar.whiskey = 1;
                                adVar.papa = (int) motionEvent.getX();
                            } else if (bravo) {
                                adVar.whiskey = 2;
                                adVar.mike = (int) motionEvent.getY();
                            }
                            adVar.delta(2);
                        }
                    } else if (motionEvent.getAction() == 1 && adVar.victor == 2) {
                        adVar.mike = DECELERATION_RATE;
                        adVar.papa = DECELERATION_RATE;
                        adVar.delta(1);
                        adVar.whiskey = 0;
                    } else if (motionEvent.getAction() == 2 && adVar.victor == 2) {
                        adVar.echo();
                        int i12 = adVar.whiskey;
                        int i13 = adVar.bravo;
                        if (i12 == 1) {
                            float x4 = motionEvent.getX();
                            int[] iArr = adVar.yankee;
                            iArr[0] = i13;
                            int i14 = adVar.quebec - i13;
                            iArr[1] = i14;
                            float max = Math.max(i13, Math.min(i14, x4));
                            if (Math.abs(adVar.oscar - max) >= 2.0f) {
                                int charlie = ad.charlie(adVar.papa, max, iArr, adVar.sierra.computeHorizontalScrollRange(), adVar.sierra.computeHorizontalScrollOffset(), adVar.quebec);
                                if (charlie != 0) {
                                    adVar.sierra.scrollBy(charlie, 0);
                                }
                                adVar.papa = max;
                            }
                        }
                        if (adVar.whiskey == 2) {
                            float y10 = motionEvent.getY();
                            int[] iArr2 = adVar.xray;
                            iArr2[0] = i13;
                            int i15 = adVar.romeo - i13;
                            iArr2[1] = i15;
                            float max2 = Math.max(i13, Math.min(i15, y10));
                            if (Math.abs(adVar.lima - max2) >= 2.0f) {
                                int charlie2 = ad.charlie(adVar.mike, max2, iArr2, adVar.sierra.computeVerticalScrollRange(), adVar.sierra.computeVerticalScrollOffset(), adVar.romeo);
                                if (charlie2 != 0) {
                                    adVar.sierra.scrollBy(0, charlie2);
                                }
                                adVar.mike = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.mInterceptingOnItemTouchListener = null;
                }
                z2 = true;
            }
            if (z2) {
                november();
                setScrollState(0);
                return true;
            }
            L l10 = this.mLayout;
            if (l10 != null) {
                boolean echo = l10.echo();
                boolean foxtrot = this.mLayout.foxtrot();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    int[] iArr3 = this.mNestedOffsets;
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                int[] iArr4 = this.mNestedOffsets;
                obtain.offsetLocation(iArr4[0], iArr4[1]);
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        india(motionEvent);
                                    }
                                } else {
                                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                                    int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.mLastTouchX = x5;
                                    this.mInitialTouchX = x5;
                                    int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.mLastTouchY = y11;
                                    this.mInitialTouchY = y11;
                                }
                            } else {
                                november();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                            if (findPointerIndex < 0) {
                                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y12 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            int i16 = this.mLastTouchX - x10;
                            int i17 = this.mLastTouchY - y12;
                            if (this.mScrollState != 1) {
                                if (echo != 0) {
                                    if (i16 > 0) {
                                        i16 = Math.max(0, i16 - this.mTouchSlop);
                                    } else {
                                        i16 = Math.min(0, i16 + this.mTouchSlop);
                                    }
                                    if (i16 != 0) {
                                        z10 = true;
                                        if (foxtrot) {
                                            if (i17 > 0) {
                                                i17 = Math.max(0, i17 - this.mTouchSlop);
                                            } else {
                                                i17 = Math.min(0, i17 + this.mTouchSlop);
                                            }
                                            if (i17 != 0) {
                                                z10 = true;
                                            }
                                        }
                                        if (z10) {
                                            setScrollState(1);
                                        }
                                    }
                                }
                                z10 = false;
                                if (foxtrot) {
                                }
                                if (z10) {
                                }
                            }
                            if (this.mScrollState == 1) {
                                int[] iArr5 = this.mReusableIntPair;
                                iArr5[0] = 0;
                                iArr5[1] = 0;
                                int kilo = i16 - kilo(motionEvent.getY(), i16);
                                int lima = i17 - lima(motionEvent.getX(), i17);
                                if (echo != 0) {
                                    i4 = kilo;
                                } else {
                                    i4 = 0;
                                }
                                if (foxtrot) {
                                    i5 = lima;
                                } else {
                                    i5 = 0;
                                }
                                if (dispatchNestedPreScroll(i4, i5, this.mReusableIntPair, this.mScrollOffset, 0)) {
                                    int[] iArr6 = this.mReusableIntPair;
                                    kilo -= iArr6[0];
                                    lima -= iArr6[1];
                                    int[] iArr7 = this.mNestedOffsets;
                                    int i18 = iArr7[0];
                                    int[] iArr8 = this.mScrollOffset;
                                    iArr7[0] = i18 + iArr8[0];
                                    iArr7[1] = iArr7[1] + iArr8[1];
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                int[] iArr9 = this.mScrollOffset;
                                this.mLastTouchX = x10 - iArr9[0];
                                this.mLastTouchY = y12 - iArr9[1];
                                if (echo != 0) {
                                    i10 = kilo;
                                } else {
                                    i10 = 0;
                                }
                                if (foxtrot) {
                                    i11 = lima;
                                } else {
                                    i11 = 0;
                                }
                                if (scrollByInternal(i10, i11, motionEvent, 0)) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                ag agVar = this.mGapWorker;
                                if (agVar != null && (kilo != 0 || lima != 0)) {
                                    agVar.alpha(this, kilo, lima);
                                }
                            }
                        }
                    } else {
                        this.mVelocityTracker.addMovement(obtain);
                        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                        if (echo != 0) {
                            f5 = -this.mVelocityTracker.getXVelocity(this.mScrollPointerId);
                        } else {
                            f5 = 0.0f;
                        }
                        if (foxtrot) {
                            f10 = -this.mVelocityTracker.getYVelocity(this.mScrollPointerId);
                        } else {
                            f10 = 0.0f;
                        }
                        if ((f5 == DECELERATION_RATE && f10 == DECELERATION_RATE) || !fling((int) f5, (int) f10)) {
                            setScrollState(0);
                        }
                        november();
                        obtain.recycle();
                        return true;
                    }
                } else {
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x11 = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x11;
                    this.mInitialTouchX = x11;
                    int y13 = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y13;
                    this.mInitialTouchY = y13;
                    int i19 = echo;
                    if (foxtrot) {
                        i19 = (echo ? 1 : 0) | 2;
                    }
                    startNestedScroll(i19, 0);
                }
                this.mVelocityTracker.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void oscar(az azVar, boolean z2, boolean z10) {
        az azVar2 = this.mAdapter;
        if (azVar2 != null) {
            azVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z2 || z10) {
            removeAndRecycleViews();
        }
        C0657b c0657b = this.mAdapterHelper;
        c0657b.kilo(c0657b.bravo);
        c0657b.kilo(c0657b.charlie);
        int i4 = 0;
        c0657b.foxtrot = 0;
        az azVar3 = this.mAdapter;
        this.mAdapter = azVar;
        if (azVar != null) {
            azVar.registerAdapterDataObserver(this.mObserver);
            azVar.onAttachedToRecyclerView(this);
        }
        L l10 = this.mLayout;
        if (l10 != null) {
            l10.navy();
        }
        U u4 = this.mRecycler;
        az azVar4 = this.mAdapter;
        u4.alpha.clear();
        u4.hotel();
        u4.golf(azVar3, true);
        T charlie = u4.charlie();
        if (azVar3 != null) {
            charlie.bravo--;
        }
        if (!z2 && charlie.bravo == 0) {
            while (true) {
                SparseArray sparseArray = charlie.alpha;
                if (i4 >= sparseArray.size()) {
                    break;
                }
                S s3 = (S) sparseArray.valueAt(i4);
                Iterator it = s3.alpha.iterator();
                while (it.hasNext()) {
                    AbstractC2977c3.alpha(((f0) it.next()).itemView);
                }
                s3.alpha.clear();
                i4++;
            }
        }
        if (azVar4 != null) {
            charlie.bravo++;
        } else {
            charlie.getClass();
        }
        u4.foxtrot();
        this.mState.foxtrot = true;
    }

    public final boolean papa(EdgeEffect edgeEffect, int i4, int i5) {
        if (i4 > 0) {
            return true;
        }
        float charlie = AbstractC3091z3.charlie(edgeEffect) * i5;
        double log = Math.log((Math.abs(-i4) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        double d4 = DECELERATION_RATE;
        if (((float) (Math.exp((d4 / (d4 - 1.0d)) * log) * this.mPhysicalCoef * SCROLL_FRICTION)) < charlie) {
            return true;
        }
        return false;
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            Runnable runnable = this.mItemAnimatorRunner;
            WeakHashMap weakHashMap = s1.au.alpha;
            postOnAnimation(runnable);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(f0 f0Var, G g2) {
        f0Var.setFlags(0, 8192);
        if (this.mState.hotel && f0Var.isUpdated() && !f0Var.isRemoved() && !f0Var.shouldIgnore()) {
            this.mViewInfoStore.bravo.hotel(getChangedHolderKey(f0Var), f0Var);
        }
        bv.aw awVar = this.mViewInfoStore.alpha;
        r0 r0Var = (r0) awVar.get(f0Var);
        if (r0Var == null) {
            r0Var = r0.alpha();
            awVar.put(f0Var, r0Var);
        }
        r0Var.bravo = g2;
        r0Var.alpha |= 4;
    }

    public void removeAndRecycleViews() {
        H h4 = this.mItemAnimator;
        if (h4 != null) {
            h4.endAnimations();
        }
        L l10 = this.mLayout;
        if (l10 != null) {
            l10.h(this.mRecycler);
            this.mLayout.i(this.mRecycler);
        }
        U u4 = this.mRecycler;
        u4.alpha.clear();
        u4.hotel();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        C0666k c0666k = this.mChildHelper;
        C0665j c0665j = c0666k.bravo;
        ax axVar = c0666k.alpha;
        int i4 = c0666k.delta;
        boolean z2 = true;
        if (i4 == 1) {
            if (c0666k.echo != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
        } else {
            if (i4 != 2) {
                try {
                    c0666k.delta = 2;
                    int indexOfChild = axVar.alpha.indexOfChild(view);
                    if (indexOfChild == -1) {
                        c0666k.kilo(view);
                    } else if (c0665j.echo(indexOfChild)) {
                        c0665j.hotel(indexOfChild);
                        c0666k.kilo(view);
                        axVar.charlie(indexOfChild);
                    } else {
                        c0666k.delta = 0;
                    }
                    if (z2) {
                        f0 childViewHolderInt = getChildViewHolderInt(view);
                        this.mRecycler.november(childViewHolderInt);
                        this.mRecycler.kilo(childViewHolderInt);
                        if (sVerboseLoggingEnabled) {
                            Log.d(TAG, "after removing animated view: " + view + ", " + this);
                        }
                    }
                    stopInterceptRequestLayout(!z2);
                    return z2;
                } finally {
                    c0666k.delta = 0;
                }
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        z2 = false;
        if (z2) {
        }
        stopInterceptRequestLayout(!z2);
        return z2;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(P0.black(this, sb2));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(P0.black(this, sb3));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(I i4) {
        boolean z2;
        L l10 = this.mLayout;
        if (l10 != null) {
            l10.charlie("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(i4);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            setWillNotDraw(z2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i4) {
        int itemDecorationCount = getItemDecorationCount();
        if (i4 >= 0 && i4 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i4));
            return;
        }
        throw new IndexOutOfBoundsException(i4 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(N n5) {
        List<N> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(n5);
    }

    public void removeOnItemTouchListener(P p4) {
        this.mOnItemTouchListeners.remove(p4);
        if (this.mInterceptingOnItemTouchListener == p4) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(Q q4) {
        List<Q> list = this.mScrollListeners;
        if (list != null) {
            list.remove(q4);
        }
    }

    public void removeRecyclerListener(V v4) {
        this.mRecyclerListeners.remove(v4);
    }

    public void repositionShadowingViews() {
        f0 f0Var;
        int echo = this.mChildHelper.echo();
        for (int i4 = 0; i4 < echo; i4++) {
            View delta = this.mChildHelper.delta(i4);
            f0 childViewHolder = getChildViewHolder(delta);
            if (childViewHolder != null && (f0Var = childViewHolder.mShadowingHolder) != null) {
                View view = f0Var.itemView;
                int left = delta.getLeft();
                int top = delta.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        ao aoVar = this.mLayout.echo;
        if ((aoVar == null || !aoVar.isRunning()) && !isComputingLayout() && view2 != null) {
            mike(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.k(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.mOnItemTouchListeners.get(i4).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    public void saveOldPositions() {
        int hotel = this.mChildHelper.hotel();
        for (int i4 = 0; i4 < hotel; i4++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.golf(i4));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException(P0.black(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i4, int i5) {
        L l10 = this.mLayout;
        if (l10 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.mLayoutSuppressed) {
            boolean echo = l10.echo();
            boolean foxtrot = this.mLayout.foxtrot();
            if (!echo && !foxtrot) {
                return;
            }
            if (!echo) {
                i4 = 0;
            }
            if (!foxtrot) {
                i5 = 0;
            }
            scrollByInternal(i4, i5, null, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean scrollByInternal(int i4, int i5, MotionEvent motionEvent, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        boolean z10;
        boolean z11;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i4, i5, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i15 = iArr2[0];
            int i16 = iArr2[1];
            i13 = i4 - i15;
            i14 = i5 - i16;
            i12 = i16;
            i11 = i15;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i11, i12, i13, i14, this.mScrollOffset, i10, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i17 = iArr4[0];
        int i18 = i13 - i17;
        int i19 = iArr4[1];
        int i20 = i14 - i19;
        if (i17 == 0 && i19 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i21 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i22 = iArr5[0];
        this.mLastTouchX = i21 - i22;
        int i23 = this.mLastTouchY;
        int i24 = iArr5[1];
        this.mLastTouchY = i23 - i24;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i22;
        iArr6[1] = iArr6[1] + i24;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z10 = true;
            } else {
                float x4 = motionEvent.getX();
                float f5 = i18;
                float y10 = motionEvent.getY();
                float f10 = i20;
                if (f5 < DECELERATION_RATE) {
                    ensureLeftGlow();
                    z10 = true;
                    AbstractC3091z3.golf(this.mLeftGlow, (-f5) / getWidth(), 1.0f - (y10 / getHeight()));
                } else {
                    z10 = true;
                    if (f5 > DECELERATION_RATE) {
                        ensureRightGlow();
                        AbstractC3091z3.golf(this.mRightGlow, f5 / getWidth(), y10 / getHeight());
                    } else {
                        z11 = false;
                        if (f10 >= DECELERATION_RATE) {
                            ensureTopGlow();
                            AbstractC3091z3.golf(this.mTopGlow, (-f10) / getHeight(), x4 / getWidth());
                        } else {
                            if (f10 > DECELERATION_RATE) {
                                ensureBottomGlow();
                                AbstractC3091z3.golf(this.mBottomGlow, f10 / getHeight(), 1.0f - (x4 / getWidth()));
                            }
                            if (!z11 || f5 != DECELERATION_RATE || f10 != DECELERATION_RATE) {
                                WeakHashMap weakHashMap = s1.au.alpha;
                                postInvalidateOnAnimation();
                            }
                        }
                        z11 = z10;
                        if (!z11) {
                        }
                        WeakHashMap weakHashMap2 = s1.au.alpha;
                        postInvalidateOnAnimation();
                    }
                }
                z11 = z10;
                if (f10 >= DECELERATION_RATE) {
                }
                z11 = z10;
                if (!z11) {
                }
                WeakHashMap weakHashMap22 = s1.au.alpha;
                postInvalidateOnAnimation();
            }
            considerReleasingGlowsOnScroll(i4, i5);
        } else {
            z10 = true;
        }
        if (i11 != 0 || i12 != 0) {
            dispatchOnScrolled(i11, i12);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z2 && i11 == 0 && i12 == 0) {
            return false;
        }
        return z10;
    }

    public void scrollStep(int i4, int i5, int[] iArr) {
        int i10;
        int i11;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i12 = o1.i.alpha;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i4 != 0) {
            i10 = this.mLayout.m(i4, this.mRecycler, this.mState);
        } else {
            i10 = 0;
        }
        if (i5 != 0) {
            i11 = this.mLayout.o(i5, this.mRecycler, this.mState);
        } else {
            i11 = 0;
        }
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i10;
            iArr[1] = i11;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i4) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        L l10 = this.mLayout;
        if (l10 == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            l10.n(i4);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(h0 h0Var) {
        this.mAccessibilityDelegate = h0Var;
        s1.au.november(this, h0Var);
    }

    public void setAdapter(az azVar) {
        setLayoutFrozen(false);
        oscar(azVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C c3) {
        if (c3 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(f0 f0Var, int i4) {
        if (isComputingLayout()) {
            f0Var.mPendingAccessibilityState = i4;
            this.mPendingAccessibilityImportanceChange.add(f0Var);
            return false;
        }
        View view = f0Var.itemView;
        WeakHashMap weakHashMap = s1.au.alpha;
        view.setImportantForAccessibility(i4);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(D d4) {
        d4.getClass();
        this.mEdgeEffectFactory = d4;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(H h4) {
        H h10 = this.mItemAnimator;
        if (h10 != null) {
            h10.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = h4;
        if (h4 != null) {
            h4.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i4) {
        U u4 = this.mRecycler;
        u4.echo = i4;
        u4.oscar();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(L l10) {
        RecyclerView recyclerView;
        if (l10 == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            H h4 = this.mItemAnimator;
            if (h4 != null) {
                h4.endAnimations();
            }
            this.mLayout.h(this.mRecycler);
            this.mLayout.i(this.mRecycler);
            U u4 = this.mRecycler;
            u4.alpha.clear();
            u4.hotel();
            if (this.mIsAttached) {
                L l11 = this.mLayout;
                l11.golf = false;
                l11.olive(this);
            }
            this.mLayout.t(null);
            this.mLayout = null;
        } else {
            U u10 = this.mRecycler;
            u10.alpha.clear();
            u10.hotel();
        }
        C0666k c0666k = this.mChildHelper;
        c0666k.bravo.india();
        ArrayList arrayList = c0666k.charlie;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c0666k.alpha.alpha;
            if (size < 0) {
                break;
            }
            f0 childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = l10;
        if (l10 != null) {
            if (l10.bravo == null) {
                l10.t(this);
                if (this.mIsAttached) {
                    L l12 = this.mLayout;
                    l12.golf = true;
                    l12.ochre(this);
                }
            } else {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(l10);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(P0.black(l10.bravo, sb2));
            }
        }
        this.mRecycler.oscar();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C2584q scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.delta) {
            WeakHashMap weakHashMap = s1.au.alpha;
            s1.al.november(scrollingChildHelper.charlie);
        }
        scrollingChildHelper.delta = z2;
    }

    public void setOnFlingListener(O o5) {
        this.mOnFlingListener = o5;
    }

    @Deprecated
    public void setOnScrollListener(Q q4) {
        this.mScrollListener = q4;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(T t5) {
        U u4 = this.mRecycler;
        RecyclerView recyclerView = u4.hotel;
        u4.golf(recyclerView.mAdapter, false);
        if (u4.golf != null) {
            r2.bravo--;
        }
        u4.golf = t5;
        if (t5 != null && recyclerView.getAdapter() != null) {
            u4.golf.bravo++;
        }
        u4.foxtrot();
    }

    @Deprecated
    public void setRecyclerListener(V v4) {
    }

    public void setScrollState(int i4) {
        ao aoVar;
        if (i4 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            StringBuilder sierra = Q0.c.sierra(i4, "setting scroll state to ", " from ");
            sierra.append(this.mScrollState);
            Log.d(TAG, sierra.toString(), new Exception());
        }
        this.mScrollState = i4;
        if (i4 != 2) {
            e0 e0Var = this.mViewFlinger;
            e0Var.yellow.removeCallbacks(e0Var);
            e0Var.red.abortAnimation();
            L l10 = this.mLayout;
            if (l10 != null && (aoVar = l10.echo) != null) {
                aoVar.stop();
            }
        }
        dispatchOnScrollStateChanged(i4);
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(d0 d0Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i4;
        int i5 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i4 = accessibilityEvent.getContentChangeTypes();
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            i5 = i4;
        }
        this.mEatenAccessibilityChangeFlags |= i5;
        return true;
    }

    public void smoothScrollBy(int i4, int i5) {
        smoothScrollBy(i4, i5, null);
    }

    public void smoothScrollToPosition(int i4) {
        if (this.mLayoutSuppressed) {
            return;
        }
        L l10 = this.mLayout;
        if (l10 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            l10.x(this, i4);
        }
    }

    public void startInterceptRequestLayout() {
        int i4 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i4;
        if (i4 == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().golf(i4, 0);
    }

    public void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (!sDebugAssertionsEnabled) {
                this.mInterceptRequestLayoutDepth = 1;
            } else {
                throw new IllegalStateException(P0.black(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().hotel(0);
    }

    public void stopScroll() {
        ao aoVar;
        setScrollState(0);
        e0 e0Var = this.mViewFlinger;
        e0Var.yellow.removeCallbacks(e0Var);
        e0Var.red.abortAnimation();
        L l10 = this.mLayout;
        if (l10 != null && (aoVar = l10.echo) != null) {
            aoVar.stop();
        }
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, DECELERATION_RATE, DECELERATION_RATE, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(az azVar, boolean z2) {
        setLayoutFrozen(false);
        oscar(azVar, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i4, int i5, Object obj) {
        int i10;
        int i11;
        int hotel = this.mChildHelper.hotel();
        int i12 = i5 + i4;
        for (int i13 = 0; i13 < hotel; i13++) {
            View golf = this.mChildHelper.golf(i13);
            f0 childViewHolderInt = getChildViewHolderInt(golf);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i11 = childViewHolderInt.mPosition) >= i4 && i11 < i12) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((M) golf.getLayoutParams()).red = true;
            }
        }
        U u4 = this.mRecycler;
        ArrayList arrayList = u4.charlie;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f0 f0Var = (f0) arrayList.get(size);
            if (f0Var != null && (i10 = f0Var.mPosition) >= i4 && i10 < i12) {
                f0Var.addFlags(2);
                u4.india(size);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, androidx.recyclerview.widget.b0] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        float alpha;
        float alpha2;
        ClassLoader classLoader;
        Constructor constructor;
        this.mObserver = new W(this);
        this.mRecycler = new U(this);
        this.mViewInfoStore = new t0();
        this.mUpdateChildViewsRunnable = new av(this, 0);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new r();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new e0(this);
        Object[] objArr = null;
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new Object() : null;
        ?? obj = new Object();
        obj.alpha = -1;
        obj.bravo = 0;
        obj.charlie = 0;
        obj.delta = 1;
        obj.echo = 0;
        obj.foxtrot = false;
        obj.golf = false;
        obj.hotel = false;
        obj.india = false;
        obj.juliet = false;
        obj.kilo = false;
        this.mState = obj;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new ax(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new av(this, 1);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new ax(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = s1.av.alpha;
            alpha = S0.echo(viewConfiguration);
        } else {
            alpha = s1.av.alpha(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = alpha;
        if (i5 >= 26) {
            alpha2 = S0.foxtrot(viewConfiguration);
        } else {
            alpha2 = s1.av.alpha(viewConfiguration, context);
        }
        this.mScaledVerticalScrollFactor = alpha2;
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        this.mChildHelper = new C0666k(new ax(this));
        WeakHashMap weakHashMap = s1.au.alpha;
        if ((i5 >= 26 ? s1.ao.alpha(this) : 0) == 0 && i5 >= 26) {
            s1.ao.bravo(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new h0(this));
        int[] iArr = AbstractC2001a.alpha;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        s1.au.mike(this, context, iArr, attributeSet, obtainStyledAttributes, i4);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(1, true);
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(6), obtainStyledAttributes.getDrawable(7), (StateListDrawable) obtainStyledAttributes.getDrawable(4), obtainStyledAttributes.getDrawable(5));
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(L.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i4), 0};
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e4) {
                            e4.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e4);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((L) constructor.newInstance(objArr));
                } catch (ClassCastException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e5);
                } catch (ClassNotFoundException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e11);
                } catch (InstantiationException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e13);
                }
            }
        }
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        s1.au.mike(this, context, iArr2, attributeSet, obtainStyledAttributes2, i4);
        boolean z10 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        setTag(delivery.samurai.android.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f0 findViewHolderForPosition(int i4, boolean z2) {
        C0666k c0666k;
        int hotel = this.mChildHelper.hotel();
        f0 f0Var = null;
        for (int i5 = 0; i5 < hotel; i5++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.golf(i5));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z2) {
                    if (childViewHolderInt.mPosition != i4) {
                        continue;
                    }
                    c0666k = this.mChildHelper;
                    if (c0666k.charlie.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    f0Var = childViewHolderInt;
                } else {
                    if (childViewHolderInt.getLayoutPosition() != i4) {
                        continue;
                    }
                    c0666k = this.mChildHelper;
                    if (c0666k.charlie.contains(childViewHolderInt.itemView)) {
                    }
                }
            }
        }
        return f0Var;
    }

    public void onExitLayoutOrScroll(boolean z2) {
        int i4 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i4;
        if (i4 < 1) {
            if (sDebugAssertionsEnabled && i4 < 0) {
                throw new IllegalStateException(P0.black(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                int i5 = this.mEatenAccessibilityChangeFlags;
                this.mEatenAccessibilityChangeFlags = 0;
                if (i5 != 0 && isAccessibilityEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i5);
                    sendAccessibilityEventUnchecked(obtain);
                }
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i4, int i5, Interpolator interpolator) {
        smoothScrollBy(i4, i5, interpolator, UNDEFINED_DURATION);
    }

    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2, int i10) {
        return getScrollingChildHelper().charlie(i4, i5, iArr, iArr2, i10);
    }

    public boolean dispatchNestedScroll(int i4, int i5, int i10, int i11, int[] iArr, int i12) {
        return getScrollingChildHelper().delta(i4, i5, i10, i11, iArr, i12, null);
    }

    public boolean hasNestedScrollingParent(int i4) {
        return getScrollingChildHelper().foxtrot(i4);
    }

    public void smoothScrollBy(int i4, int i5, Interpolator interpolator, int i10) {
        smoothScrollBy(i4, i5, interpolator, i10, false);
    }

    public boolean startNestedScroll(int i4, int i5) {
        return getScrollingChildHelper().golf(i4, i5);
    }

    public void stopNestedScroll(int i4) {
        getScrollingChildHelper().hotel(i4);
    }

    public void smoothScrollBy(int i4, int i5, Interpolator interpolator, int i10, boolean z2) {
        L l10 = this.mLayout;
        if (l10 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!l10.echo()) {
            i4 = 0;
        }
        if (!this.mLayout.foxtrot()) {
            i5 = 0;
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        if (i10 != Integer.MIN_VALUE && i10 <= 0) {
            scrollBy(i4, i5);
            return;
        }
        if (z2) {
            int i11 = i4 != 0 ? 1 : 0;
            if (i5 != 0) {
                i11 |= 2;
            }
            startNestedScroll(i11, 1);
        }
        this.mViewFlinger.charlie(i4, i5, interpolator, i10);
    }

    public final void dispatchNestedScroll(int i4, int i5, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        getScrollingChildHelper().delta(i4, i5, i10, i11, iArr, i12, iArr2);
    }

    public void addItemDecoration(I i4) {
        addItemDecoration(i4, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        L l10 = this.mLayout;
        if (l10 != null) {
            return l10.uniform(layoutParams);
        }
        throw new IllegalStateException(P0.black(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
