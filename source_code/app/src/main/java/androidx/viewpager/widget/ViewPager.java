package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.appcompat.widget.P0;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import k7.C2017b;
import s1.al;
import s1.au;

/* loaded from: classes3.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    a mAdapter;
    private List<g> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private h mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<d> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private j mObserver;
    private int mOffscreenPageLimit;
    private h mOnPageChangeListener;
    private List<h> mOnPageChangeListeners;
    private int mPageMargin;
    private i mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final d mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<d> COMPARATOR = new Sb.k(12);
    private static final Interpolator sInterpolator = new b(0);
    private static final l sPositionComparator = new Object();

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public int red;
        public Parcelable silver;
        public final ClassLoader teal;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.red = parcel.readInt();
            this.silver = parcel.readParcelable(classLoader);
            this.teal = classLoader;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return P0.cyan(sb2, this.red, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.red);
            parcel.writeParcelable(this.silver, i4);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.viewpager.widget.d, java.lang.Object] */
    public ViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new Object();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new F6.b(12, this);
        this.mScrollState = 0;
        initViewPager();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.mScrollingCacheEnabled != z2) {
            this.mScrollingCacheEnabled = z2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        d infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.bravo == this.mCurItem) {
                    childAt.addFocusables(arrayList, i4, i5);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i5 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.viewpager.widget.d, java.lang.Object] */
    public d addNewItem(int i4, int i5) {
        ?? obj = new Object();
        obj.bravo = i4;
        obj.alpha = this.mAdapter.instantiateItem((ViewGroup) this, i4);
        obj.delta = this.mAdapter.getPageWidth(i4);
        if (i5 >= 0 && i5 < this.mItems.size()) {
            this.mItems.add(i5, obj);
            return obj;
        }
        this.mItems.add(obj);
        return obj;
    }

    public void addOnAdapterChangeListener(g gVar) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(gVar);
    }

    public void addOnPageChangeListener(h hVar) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(hVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        d infoForChild;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.bravo == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        boolean z2;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        e eVar = (e) layoutParams;
        boolean z10 = eVar.alpha;
        if (view.getClass().getAnnotation(c.class) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z11 = z10 | z2;
        eVar.alpha = z11;
        if (this.mInLayout) {
            if (!z11) {
                eVar.delta = true;
                addViewInLayout(view, i4, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i4, layoutParams);
    }

    public final void alpha(boolean z2) {
        boolean z10;
        if (this.mScrollState == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        golf(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i4 = 0; i4 < this.mItems.size(); i4++) {
            d dVar = this.mItems.get(i4);
            if (dVar.charlie) {
                dVar.charlie = false;
                z10 = true;
            }
        }
        if (z10) {
            if (z2) {
                Runnable runnable = this.mEndScrollRunnable;
                WeakHashMap weakHashMap = au.alpha;
                postOnAnimation(runnable);
                return;
            }
            this.mEndScrollRunnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean arrowScroll(int i4) {
        View findNextFocus;
        boolean pageLeft;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                Log.e(TAG, "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i4);
            if (findNextFocus == null && findNextFocus != findFocus) {
                if (i4 == 17) {
                    int i5 = delta(findNextFocus, this.mTempRect).left;
                    int i10 = delta(findFocus, this.mTempRect).left;
                    if (findFocus != null && i5 >= i10) {
                        pageLeft = pageLeft();
                    } else {
                        pageLeft = findNextFocus.requestFocus();
                    }
                } else {
                    if (i4 == 66) {
                        int i11 = delta(findNextFocus, this.mTempRect).left;
                        int i12 = delta(findFocus, this.mTempRect).left;
                        if (findFocus != null && i11 <= i12) {
                            pageLeft = pageRight();
                        } else {
                            pageLeft = findNextFocus.requestFocus();
                        }
                    }
                    pageLeft = false;
                }
            } else if (i4 == 17 && i4 != 1) {
                if (i4 == 66 || i4 == 2) {
                    pageLeft = pageRight();
                }
                pageLeft = false;
            } else {
                pageLeft = pageLeft();
            }
            if (pageLeft) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i4));
            }
            return pageLeft;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i4);
        if (findNextFocus == null) {
        }
        if (i4 == 17) {
        }
        pageLeft = pageLeft();
        if (pageLeft) {
        }
        return pageLeft;
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public final int bravo(float f5, int i4, int i5, int i10) {
        float f10;
        if (Math.abs(i10) > this.mFlingDistance && Math.abs(i5) > this.mMinimumVelocity) {
            if (i5 <= 0) {
                i4++;
            }
        } else {
            if (i4 >= this.mCurItem) {
                f10 = 0.4f;
            } else {
                f10 = 0.6f;
            }
            i4 += (int) (f5 + f10);
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).bravo, Math.min(i4, ((d) P0.amber(1, this.mItems)).bravo));
        }
        return i4;
    }

    public boolean canScroll(View view, boolean z2, int i4, int i5, int i10) {
        int i11;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i12 = i5 + scrollX;
                if (i12 >= childAt.getLeft() && i12 < childAt.getRight() && (i11 = i10 + scrollY) >= childAt.getTop() && i11 < childAt.getBottom() && canScroll(childAt, true, i4, i12 - childAt.getLeft(), i11 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z2 && view.canScrollHorizontally(-i4)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i4 < 0) {
            if (scrollX <= ((int) (clientWidth * this.mFirstOffset))) {
                return false;
            }
            return true;
        }
        if (i4 <= 0 || scrollX >= ((int) (clientWidth * this.mLastOffset))) {
            return false;
        }
        return true;
    }

    public final void charlie(int i4) {
        h hVar = this.mOnPageChangeListener;
        if (hVar != null) {
            hVar.onPageSelected(i4);
        }
        List<h> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                h hVar2 = this.mOnPageChangeListeners.get(i5);
                if (hVar2 != null) {
                    hVar2.onPageSelected(i4);
                }
            }
        }
        h hVar3 = this.mInternalPageChangeListener;
        if (hVar3 != null) {
            hVar3.onPageSelected(i4);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof e) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    public void clearOnPageChangeListeners() {
        List<h> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!golf(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap weakHashMap = au.alpha;
            postInvalidateOnAnimation();
            return;
        }
        alpha(true);
    }

    public void dataSetChanged() {
        boolean z2;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        if (this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = this.mCurItem;
        int i5 = 0;
        boolean z10 = false;
        while (i5 < this.mItems.size()) {
            d dVar = this.mItems.get(i5);
            int itemPosition = this.mAdapter.getItemPosition(dVar.alpha);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i5);
                    i5--;
                    if (!z10) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z10 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, dVar.bravo, dVar.alpha);
                    int i10 = this.mCurItem;
                    if (i10 == dVar.bravo) {
                        i4 = Math.max(0, Math.min(i10, count - 1));
                    }
                } else {
                    int i11 = dVar.bravo;
                    if (i11 != itemPosition) {
                        if (i11 == this.mCurItem) {
                            i4 = itemPosition;
                        }
                        dVar.bravo = itemPosition;
                    }
                }
                z2 = true;
            }
            i5++;
        }
        if (z10) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z2) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                e eVar = (e) getChildAt(i12).getLayoutParams();
                if (!eVar.alpha) {
                    eVar.charlie = 0.0f;
                }
            }
            setCurrentItemInternal(i4, false, true);
            requestLayout();
        }
    }

    public final Rect delta(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        d infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.bravo == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f5) {
        return (float) Math.sin((f5 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.mAdapter) == null || aVar.getCount() <= 1)) {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        } else {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z2 = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z2 |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z2) {
            WeakHashMap weakHashMap = au.alpha;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final d echo() {
        float f5;
        float f10;
        int i4;
        int clientWidth = getClientWidth();
        float f11 = 0.0f;
        if (clientWidth > 0) {
            f5 = getScrollX() / clientWidth;
        } else {
            f5 = 0.0f;
        }
        if (clientWidth > 0) {
            f10 = this.mPageMargin / clientWidth;
        } else {
            f10 = 0.0f;
        }
        int i5 = 0;
        boolean z2 = true;
        d dVar = null;
        int i10 = -1;
        float f12 = 0.0f;
        while (i5 < this.mItems.size()) {
            d dVar2 = this.mItems.get(i5);
            if (!z2 && dVar2.bravo != (i4 = i10 + 1)) {
                dVar2 = this.mTempItem;
                dVar2.echo = f11 + f12 + f10;
                dVar2.bravo = i4;
                dVar2.delta = this.mAdapter.getPageWidth(i4);
                i5--;
            }
            d dVar3 = dVar2;
            f11 = dVar3.echo;
            float f13 = dVar3.delta + f11 + f10;
            if (!z2 && f5 < f11) {
                break;
            }
            if (f5 >= f13 && i5 != this.mItems.size() - 1) {
                int i11 = dVar3.bravo;
                float f14 = dVar3.delta;
                i5++;
                i10 = i11;
                f12 = f14;
                dVar = dVar3;
                z2 = false;
            } else {
                return dVar3;
            }
        }
        return dVar;
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                d echo = echo();
                setCurrentItemInternal(bravo(((scrollX / clientWidth) - echo.echo) / echo.delta, echo.bravo, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            this.mIsBeingDragged = false;
            this.mIsUnableToDrag = false;
            VelocityTracker velocityTracker2 = this.mVelocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.mVelocityTracker = null;
            }
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                        return false;
                    }
                    return false;
                }
                if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                }
                return arrowScroll(66);
            }
            if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            }
            return arrowScroll(17);
        }
        return false;
    }

    public void fakeDragBy(float f5) {
        if (this.mFakeDragging) {
            if (this.mAdapter == null) {
                return;
            }
            this.mLastMotionX += f5;
            float scrollX = getScrollX() - f5;
            float clientWidth = getClientWidth();
            float f10 = this.mFirstOffset * clientWidth;
            float f11 = this.mLastOffset * clientWidth;
            d dVar = this.mItems.get(0);
            d dVar2 = (d) P0.amber(1, this.mItems);
            if (dVar.bravo != 0) {
                f10 = dVar.echo * clientWidth;
            }
            if (dVar2.bravo != this.mAdapter.getCount() - 1) {
                f11 = dVar2.echo * clientWidth;
            }
            if (scrollX < f10) {
                scrollX = f10;
            } else if (scrollX > f11) {
                scrollX = f11;
            }
            int i4 = (int) scrollX;
            this.mLastMotionX = (scrollX - i4) + this.mLastMotionX;
            scrollTo(i4, getScrollY());
            golf(i4);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public final void foxtrot(MotionEvent motionEvent) {
        int i4;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            this.mLastMotionX = motionEvent.getX(i4);
            this.mActivePointerId = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, androidx.viewpager.widget.e] */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.charlie = 0.0f;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i4, int i5) {
        if (this.mDrawingOrder == 2) {
            i5 = (i4 - 1) - i5;
        }
        return ((e) this.mDrawingOrderedChildren.get(i5).getLayoutParams()).foxtrot;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public final boolean golf(int i4) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        d echo = echo();
        int clientWidth = getClientWidth();
        int i5 = this.mPageMargin;
        int i10 = clientWidth + i5;
        float f5 = clientWidth;
        int i11 = echo.bravo;
        float f10 = ((i4 / f5) - echo.echo) / (echo.delta + (i5 / f5));
        this.mCalledSuper = false;
        onPageScrolled(i11, f10, (int) (i10 * f10));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean hotel(float f5) {
        boolean z2;
        boolean z10;
        float f10 = this.mLastMotionX - f5;
        this.mLastMotionX = f5;
        float scrollX = getScrollX() + f10;
        float clientWidth = getClientWidth();
        float f11 = this.mFirstOffset * clientWidth;
        float f12 = this.mLastOffset * clientWidth;
        boolean z11 = false;
        d dVar = this.mItems.get(0);
        d dVar2 = (d) P0.amber(1, this.mItems);
        if (dVar.bravo != 0) {
            f11 = dVar.echo * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (dVar2.bravo != this.mAdapter.getCount() - 1) {
            f12 = dVar2.echo * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f11) {
            if (z2) {
                this.mLeftEdge.onPull(Math.abs(f11 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f11;
        } else if (scrollX > f12) {
            if (z10) {
                this.mRightEdge.onPull(Math.abs(scrollX - f12) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        }
        int i4 = (int) scrollX;
        this.mLastMotionX = (scrollX - i4) + this.mLastMotionX;
        scrollTo(i4, getScrollY());
        golf(i4);
        return z11;
    }

    public final void india(int i4, int i5, int i10, int i11) {
        float f5;
        if (i5 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i5 - getPaddingLeft()) - getPaddingRight()) + i11)) * (((i4 - getPaddingLeft()) - getPaddingRight()) + i10)), getScrollY());
            return;
        }
        d infoForPosition = infoForPosition(this.mCurItem);
        if (infoForPosition != null) {
            f5 = Math.min(infoForPosition.echo, this.mLastOffset);
        } else {
            f5 = 0.0f;
        }
        int paddingLeft = (int) (f5 * ((i4 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            alpha(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    public d infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return infoForChild(view);
            }
        }
    }

    public d infoForChild(View view) {
        for (int i4 = 0; i4 < this.mItems.size(); i4++) {
            d dVar = this.mItems.get(i4);
            if (this.mAdapter.isViewFromObject(view, dVar.alpha)) {
                return dVar;
            }
        }
        return null;
    }

    public d infoForPosition(int i4) {
        for (int i5 = 0; i5 < this.mItems.size(); i5++) {
            d dVar = this.mItems.get(i5);
            if (dVar.bravo == i4) {
                return dVar;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f5);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f5);
        this.mCloseEnough = (int) (2.0f * f5);
        this.mDefaultGutterSize = (int) (f5 * 16.0f);
        au.november(this, new f(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        al.lima(this, new J2.c(this));
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public final boolean juliet() {
        this.mActivePointerId = -1;
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (!this.mLeftEdge.isFinished() && !this.mRightEdge.isFinished()) {
            return false;
        }
        return true;
    }

    public final void kilo(int i4, int i5, boolean z2, boolean z10) {
        int i10;
        d infoForPosition = infoForPosition(i4);
        if (infoForPosition != null) {
            i10 = (int) (Math.max(this.mFirstOffset, Math.min(infoForPosition.echo, this.mLastOffset)) * getClientWidth());
        } else {
            i10 = 0;
        }
        if (z2) {
            smoothScrollTo(i10, 0, i5);
            if (z10) {
                charlie(i4);
                return;
            }
            return;
        }
        if (z10) {
            charlie(i4);
        }
        alpha(false);
        scrollTo(i10, 0);
        golf(i10);
    }

    public final void lima() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                this.mDrawingOrderedChildren.add(getChildAt(i4));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i4;
        float f5;
        int i5;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            float width = getWidth();
            float f10 = this.mPageMargin / width;
            int i10 = 0;
            d dVar = this.mItems.get(0);
            float f11 = dVar.echo;
            int size = this.mItems.size();
            int i11 = dVar.bravo;
            int i12 = this.mItems.get(size - 1).bravo;
            while (i11 < i12) {
                while (true) {
                    i4 = dVar.bravo;
                    if (i11 <= i4 || i10 >= size) {
                        break;
                    }
                    i10++;
                    dVar = this.mItems.get(i10);
                }
                if (i11 == i4) {
                    float f12 = dVar.echo;
                    float f13 = dVar.delta;
                    f5 = (f12 + f13) * width;
                    f11 = f12 + f13 + f10;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i11);
                    f5 = (f11 + pageWidth) * width;
                    f11 = pageWidth + f10 + f11;
                }
                if (this.mPageMargin + f5 > scrollX) {
                    i5 = scrollX;
                    this.mMarginDrawable.setBounds(Math.round(f5), this.mTopPageBounds, Math.round(this.mPageMargin + f5), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                } else {
                    i5 = scrollX;
                }
                if (f5 <= i5 + r2) {
                    i11++;
                    scrollX = i5;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f5;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        foxtrot(motionEvent);
                    }
                } else {
                    int i4 = this.mActivePointerId;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        float x4 = motionEvent.getX(findPointerIndex);
                        float f10 = x4 - this.mLastMotionX;
                        float abs = Math.abs(f10);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.mInitialMotionY);
                        if (f10 != 0.0f) {
                            float f11 = this.mLastMotionX;
                            if ((f11 >= this.mGutterSize || f10 <= 0.0f) && ((f11 <= getWidth() - this.mGutterSize || f10 >= 0.0f) && canScroll(this, false, (int) f10, (int) x4, (int) y10))) {
                                this.mLastMotionX = x4;
                                this.mLastMotionY = y10;
                                this.mIsUnableToDrag = true;
                                return false;
                            }
                        }
                        float f12 = this.mTouchSlop;
                        if (abs > f12 && abs * 0.5f > abs2) {
                            this.mIsBeingDragged = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f13 = this.mInitialMotionX;
                            float f14 = this.mTouchSlop;
                            if (f10 > 0.0f) {
                                f5 = f13 + f14;
                            } else {
                                f5 = f13 - f14;
                            }
                            this.mLastMotionX = f5;
                            this.mLastMotionY = y10;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f12) {
                            this.mIsUnableToDrag = true;
                        }
                        if (this.mIsBeingDragged && hotel(x4)) {
                            WeakHashMap weakHashMap = au.alpha;
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x5 = motionEvent.getX();
                this.mInitialMotionX = x5;
                this.mLastMotionX = x5;
                float y11 = motionEvent.getY();
                this.mInitialMotionY = y11;
                this.mLastMotionY = y11;
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    alpha(false);
                    this.mIsBeingDragged = false;
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        juliet();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        boolean z10;
        d infoForChild;
        int max;
        int i12;
        int max2;
        int i13;
        int childCount = getChildCount();
        int i14 = i10 - i4;
        int i15 = i11 - i5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.alpha) {
                    int i18 = eVar.bravo;
                    int i19 = i18 & 7;
                    int i20 = i18 & 112;
                    if (i19 != 1) {
                        if (i19 != 3) {
                            if (i19 != 5) {
                                i12 = paddingLeft;
                            } else {
                                max = (i14 - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i12 = childAt.getMeasuredWidth() + paddingLeft;
                        }
                        if (i20 == 16) {
                            if (i20 != 48) {
                                if (i20 != 80) {
                                    i13 = paddingTop;
                                } else {
                                    max2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                    paddingBottom += childAt.getMeasuredHeight();
                                }
                            } else {
                                i13 = childAt.getMeasuredHeight() + paddingTop;
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, childAt.getMeasuredHeight() + paddingTop);
                            i16++;
                            paddingTop = i13;
                            paddingLeft = i12;
                        } else {
                            max2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = max2;
                        i13 = paddingTop;
                        paddingTop = i22;
                        int i212 = paddingLeft + scrollX;
                        childAt.layout(i212, paddingTop, childAt.getMeasuredWidth() + i212, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = i13;
                        paddingLeft = i12;
                    } else {
                        max = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i23 = max;
                    i12 = paddingLeft;
                    paddingLeft = i23;
                    if (i20 == 16) {
                    }
                    int i222 = max2;
                    i13 = paddingTop;
                    paddingTop = i222;
                    int i2122 = paddingLeft + scrollX;
                    childAt.layout(i2122, paddingTop, childAt.getMeasuredWidth() + i2122, childAt.getMeasuredHeight() + paddingTop);
                    i16++;
                    paddingTop = i13;
                    paddingLeft = i12;
                }
            }
        }
        int i24 = (i14 - paddingLeft) - paddingRight;
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt2 = getChildAt(i25);
            if (childAt2.getVisibility() != 8) {
                e eVar2 = (e) childAt2.getLayoutParams();
                if (!eVar2.alpha && (infoForChild = infoForChild(childAt2)) != null) {
                    float f5 = i24;
                    int i26 = ((int) (infoForChild.echo * f5)) + paddingLeft;
                    if (eVar2.delta) {
                        eVar2.delta = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f5 * eVar2.charlie), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i26, paddingTop, childAt2.getMeasuredWidth() + i26, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i15 - paddingBottom;
        this.mDecorChildCount = i16;
        if (this.mFirstLayout) {
            z10 = false;
            kilo(this.mCurItem, 0, false, false);
        } else {
            z10 = false;
        }
        this.mFirstLayout = z10;
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        e eVar;
        e eVar2;
        boolean z2;
        int i10;
        setMeasuredDimension(View.getDefaultSize(0, i4), View.getDefaultSize(0, i5));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            int i12 = 1073741824;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && (eVar2 = (e) childAt.getLayoutParams()) != null && eVar2.alpha) {
                int i13 = eVar2.bravo;
                int i14 = i13 & 7;
                int i15 = i13 & 112;
                if (i15 != 48 && i15 != 80) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i14 != 3 && i14 != 5) {
                    z10 = false;
                }
                int i16 = RecyclerView.UNDEFINED_DURATION;
                if (z2) {
                    i10 = Integer.MIN_VALUE;
                    i16 = 1073741824;
                } else if (z10) {
                    i10 = 1073741824;
                } else {
                    i10 = Integer.MIN_VALUE;
                }
                int i17 = ((ViewGroup.LayoutParams) eVar2).width;
                if (i17 != -2) {
                    if (i17 == -1) {
                        i17 = paddingLeft;
                    }
                    i16 = 1073741824;
                } else {
                    i17 = paddingLeft;
                }
                int i18 = ((ViewGroup.LayoutParams) eVar2).height;
                if (i18 != -2) {
                    if (i18 == -1) {
                        i18 = measuredHeight;
                    }
                } else {
                    i18 = measuredHeight;
                    i12 = i10;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, i16), View.MeasureSpec.makeMeasureSpec(i18, i12));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i11++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8 && ((eVar = (e) childAt2.getLayoutParams()) == null || !eVar.alpha)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * eVar.charlie), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPageScrolled(int i4, float f5, int i5) {
        int max;
        int i10;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.alpha) {
                    int i12 = eVar.bravo & 7;
                    if (i12 != 1) {
                        if (i12 != 3) {
                            if (i12 != 5) {
                                i10 = paddingLeft;
                            } else {
                                max = (width - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i10 = childAt.getWidth() + paddingLeft;
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i10;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i13 = max;
                    i10 = paddingLeft;
                    paddingLeft = i13;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i10;
                }
            }
        }
        h hVar = this.mOnPageChangeListener;
        if (hVar != null) {
            hVar.onPageScrolled(i4, f5, i5);
        }
        List<h> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                h hVar2 = this.mOnPageChangeListeners.get(i14);
                if (hVar2 != null) {
                    hVar2.onPageScrolled(i4, f5, i5);
                }
            }
        }
        h hVar3 = this.mInternalPageChangeListener;
        if (hVar3 != null) {
            hVar3.onPageScrolled(i4, f5, i5);
        }
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i4, Rect rect) {
        int i5;
        int i10;
        int i11;
        d infoForChild;
        int childCount = getChildCount();
        if ((i4 & 2) != 0) {
            i10 = childCount;
            i5 = 0;
            i11 = 1;
        } else {
            i5 = childCount - 1;
            i10 = -1;
            i11 = -1;
        }
        while (i5 != i10) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.bravo == this.mCurItem && childAt.requestFocus(i4, rect)) {
                return true;
            }
            i5 += i11;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.alpha);
        a aVar = this.mAdapter;
        ClassLoader classLoader = savedState.teal;
        if (aVar != null) {
            aVar.restoreState(savedState.silver, classLoader);
            setCurrentItemInternal(savedState.red, false, true);
        } else {
            this.mRestoredCurItem = savedState.red;
            this.mRestoredAdapterState = savedState.silver;
            this.mRestoredClassLoader = classLoader;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.viewpager.widget.ViewPager$SavedState, android.os.Parcelable, androidx.customview.view.AbsSavedState] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.red = this.mCurItem;
        a aVar = this.mAdapter;
        if (aVar != null) {
            absSavedState.silver = aVar.saveState();
        }
        return absSavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i10, int i11) {
        super.onSizeChanged(i4, i5, i10, i11);
        if (i4 != i10) {
            int i12 = this.mPageMargin;
            india(i4, i10, i12, i12);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        float f5;
        if (!this.mFakeDragging) {
            boolean z2 = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.mAdapter) == null || aVar.getCount() == 0) {
                return false;
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action != 5) {
                                if (action == 6) {
                                    foxtrot(motionEvent);
                                    this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                                }
                            } else {
                                int actionIndex = motionEvent.getActionIndex();
                                this.mLastMotionX = motionEvent.getX(actionIndex);
                                this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                            }
                        } else if (this.mIsBeingDragged) {
                            kilo(this.mCurItem, 0, true, false);
                            z2 = juliet();
                        }
                    } else {
                        if (!this.mIsBeingDragged) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                            if (findPointerIndex == -1) {
                                z2 = juliet();
                            } else {
                                float x4 = motionEvent.getX(findPointerIndex);
                                float abs = Math.abs(x4 - this.mLastMotionX);
                                float y10 = motionEvent.getY(findPointerIndex);
                                float abs2 = Math.abs(y10 - this.mLastMotionY);
                                if (abs > this.mTouchSlop && abs > abs2) {
                                    this.mIsBeingDragged = true;
                                    ViewParent parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    float f10 = this.mInitialMotionX;
                                    if (x4 - f10 > 0.0f) {
                                        f5 = f10 + this.mTouchSlop;
                                    } else {
                                        f5 = f10 - this.mTouchSlop;
                                    }
                                    this.mLastMotionX = f5;
                                    this.mLastMotionY = y10;
                                    setScrollState(1);
                                    setScrollingCacheEnabled(true);
                                    ViewParent parent2 = getParent();
                                    if (parent2 != null) {
                                        parent2.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                        }
                        if (this.mIsBeingDragged) {
                            z2 = hotel(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                        }
                    }
                } else if (this.mIsBeingDragged) {
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                    this.mPopulatePending = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    d echo = echo();
                    float f11 = clientWidth;
                    setCurrentItemInternal(bravo(((scrollX / f11) - echo.echo) / (echo.delta + (this.mPageMargin / f11)), echo.bravo, xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                    z2 = juliet();
                }
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                float x5 = motionEvent.getX();
                this.mInitialMotionX = x5;
                this.mLastMotionX = x5;
                float y11 = motionEvent.getY();
                this.mInitialMotionY = y11;
                this.mLastMotionY = y11;
                this.mActivePointerId = motionEvent.getPointerId(0);
            }
            if (z2) {
                WeakHashMap weakHashMap = au.alpha;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public boolean pageLeft() {
        int i4 = this.mCurItem;
        if (i4 > 0) {
            setCurrentItem(i4 - 1, true);
            return true;
        }
        return false;
    }

    public boolean pageRight() {
        a aVar = this.mAdapter;
        if (aVar != null && this.mCurItem < aVar.getCount() - 1) {
            setCurrentItem(this.mCurItem + 1, true);
            return true;
        }
        return false;
    }

    public void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(g gVar) {
        List<g> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(gVar);
        }
    }

    public void removeOnPageChangeListener(h hVar) {
        List<h> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(hVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(a aVar) {
        a aVar2 = this.mAdapter;
        if (aVar2 != null) {
            aVar2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i4 = 0; i4 < this.mItems.size(); i4++) {
                d dVar = this.mItems.get(i4);
                this.mAdapter.destroyItem((ViewGroup) this, dVar.bravo, dVar.alpha);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            int i5 = 0;
            while (i5 < getChildCount()) {
                if (!((e) getChildAt(i5).getLayoutParams()).alpha) {
                    removeViewAt(i5);
                    i5--;
                }
                i5++;
            }
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = aVar;
        this.mExpectedAdapterCount = 0;
        if (aVar != null) {
            if (this.mObserver == null) {
                this.mObserver = new j(this);
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z2 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z2) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<g> list = this.mAdapterChangeListeners;
        if (list != null && !list.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            for (int i10 = 0; i10 < size; i10++) {
                C2017b c2017b = (C2017b) this.mAdapterChangeListeners.get(i10);
                TabLayout tabLayout = c2017b.bravo;
                if (tabLayout.f8125H == this) {
                    tabLayout.mike(aVar, c2017b.alpha);
                }
            }
        }
    }

    public void setCurrentItem(int i4) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i4, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i4, boolean z2, boolean z10) {
        setCurrentItemInternal(i4, z2, z10, 0);
    }

    public h setInternalPageChangeListener(h hVar) {
        h hVar2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = hVar;
        return hVar2;
    }

    public void setOffscreenPageLimit(int i4) {
        if (i4 < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i4 + " too small; defaulting to 1");
            i4 = 1;
        }
        if (i4 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i4;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.mOnPageChangeListener = hVar;
    }

    public void setPageMargin(int i4) {
        int i5 = this.mPageMargin;
        this.mPageMargin = i4;
        int width = getWidth();
        india(width, width, i4, i5);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z2, i iVar) {
        setPageTransformer(z2, iVar, 2);
    }

    public void setScrollState(int i4) {
        if (this.mScrollState != i4) {
            this.mScrollState = i4;
            h hVar = this.mOnPageChangeListener;
            if (hVar != null) {
                hVar.onPageScrollStateChanged(i4);
            }
            List<h> list = this.mOnPageChangeListeners;
            if (list != null) {
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    h hVar2 = this.mOnPageChangeListeners.get(i5);
                    if (hVar2 != null) {
                        hVar2.onPageScrollStateChanged(i4);
                    }
                }
            }
            h hVar3 = this.mInternalPageChangeListener;
            if (hVar3 != null) {
                hVar3.onPageScrollStateChanged(i4);
            }
        }
    }

    public void smoothScrollTo(int i4, int i5) {
        smoothScrollTo(i4, i5, 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.mMarginDrawable) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, androidx.viewpager.widget.e] */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.charlie = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        layoutParams.bravo = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void populate(int i4) {
        d dVar;
        String hexString;
        d dVar2;
        float f5;
        d infoForChild;
        int i5;
        int i10;
        d dVar3;
        d dVar4;
        d dVar5;
        int i11 = this.mCurItem;
        if (i11 != i4) {
            dVar = infoForPosition(i11);
            this.mCurItem = i4;
        } else {
            dVar = null;
        }
        if (this.mAdapter == null) {
            lima();
            return;
        }
        if (this.mPopulatePending) {
            lima();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.mAdapter.startUpdate((ViewGroup) this);
        int i12 = this.mOffscreenPageLimit;
        int max = Math.max(0, this.mCurItem - i12);
        int count = this.mAdapter.getCount();
        int min = Math.min(count - 1, this.mCurItem + i12);
        if (count == this.mExpectedAdapterCount) {
            int i13 = 0;
            while (true) {
                if (i13 >= this.mItems.size()) {
                    break;
                }
                dVar2 = this.mItems.get(i13);
                int i14 = dVar2.bravo;
                int i15 = this.mCurItem;
                if (i14 < i15) {
                    i13++;
                }
            }
            if (dVar2 == null && count > 0) {
                dVar2 = addNewItem(this.mCurItem, i13);
            }
            if (dVar2 != null) {
                int i16 = i13 - 1;
                d dVar6 = i16 >= 0 ? this.mItems.get(i16) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - dVar2.delta);
                float f10 = 0.0f;
                for (int i17 = this.mCurItem - 1; i17 >= 0; i17--) {
                    if (f10 >= paddingLeft && i17 < max) {
                        if (dVar6 == null) {
                            break;
                        }
                        if (i17 == dVar6.bravo && !dVar6.charlie) {
                            this.mItems.remove(i16);
                            this.mAdapter.destroyItem((ViewGroup) this, i17, dVar6.alpha);
                            i16--;
                            i13--;
                            if (i16 >= 0) {
                                dVar5 = this.mItems.get(i16);
                                dVar6 = dVar5;
                            }
                            dVar5 = null;
                            dVar6 = dVar5;
                        }
                    } else if (dVar6 != null && i17 == dVar6.bravo) {
                        f10 += dVar6.delta;
                        i16--;
                        if (i16 >= 0) {
                            dVar5 = this.mItems.get(i16);
                            dVar6 = dVar5;
                        }
                        dVar5 = null;
                        dVar6 = dVar5;
                    } else {
                        f10 += addNewItem(i17, i16 + 1).delta;
                        i13++;
                        if (i16 >= 0) {
                            dVar5 = this.mItems.get(i16);
                            dVar6 = dVar5;
                        }
                        dVar5 = null;
                        dVar6 = dVar5;
                    }
                }
                f5 = 0.0f;
                float f11 = dVar2.delta;
                int i18 = i13 + 1;
                if (f11 < 2.0f) {
                    d dVar7 = i18 < this.mItems.size() ? this.mItems.get(i18) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    int i19 = i18;
                    for (int i20 = this.mCurItem + 1; i20 < count; i20++) {
                        if (f11 >= paddingRight && i20 > min) {
                            if (dVar7 == null) {
                                break;
                            }
                            if (i20 == dVar7.bravo && !dVar7.charlie) {
                                this.mItems.remove(i19);
                                this.mAdapter.destroyItem((ViewGroup) this, i20, dVar7.alpha);
                                if (i19 < this.mItems.size()) {
                                    dVar7 = this.mItems.get(i19);
                                }
                                dVar7 = null;
                            }
                        } else if (dVar7 != null && i20 == dVar7.bravo) {
                            f11 += dVar7.delta;
                            i19++;
                            if (i19 < this.mItems.size()) {
                                dVar7 = this.mItems.get(i19);
                            }
                            dVar7 = null;
                        } else {
                            d addNewItem = addNewItem(i20, i19);
                            i19++;
                            f11 += addNewItem.delta;
                            if (i19 < this.mItems.size()) {
                                dVar7 = this.mItems.get(i19);
                            }
                            dVar7 = null;
                        }
                    }
                }
                int count2 = this.mAdapter.getCount();
                int clientWidth2 = getClientWidth();
                float f12 = clientWidth2 > 0 ? this.mPageMargin / clientWidth2 : 0.0f;
                if (dVar != null) {
                    int i21 = dVar.bravo;
                    int i22 = dVar2.bravo;
                    if (i21 < i22) {
                        float f13 = dVar.echo + dVar.delta + f12;
                        int i23 = i21 + 1;
                        int i24 = 0;
                        while (i23 <= dVar2.bravo && i24 < this.mItems.size()) {
                            d dVar8 = this.mItems.get(i24);
                            while (true) {
                                dVar4 = dVar8;
                                if (i23 <= dVar4.bravo || i24 >= this.mItems.size() - 1) {
                                    break;
                                }
                                i24++;
                                dVar8 = this.mItems.get(i24);
                            }
                            while (i23 < dVar4.bravo) {
                                f13 += this.mAdapter.getPageWidth(i23) + f12;
                                i23++;
                            }
                            dVar4.echo = f13;
                            f13 += dVar4.delta + f12;
                            i23++;
                        }
                    } else if (i21 > i22) {
                        int size = this.mItems.size() - 1;
                        float f14 = dVar.echo;
                        while (true) {
                            i21--;
                            if (i21 < dVar2.bravo || size < 0) {
                                break;
                            }
                            d dVar9 = this.mItems.get(size);
                            while (true) {
                                dVar3 = dVar9;
                                if (i21 >= dVar3.bravo || size <= 0) {
                                    break;
                                }
                                size--;
                                dVar9 = this.mItems.get(size);
                            }
                            while (i21 > dVar3.bravo) {
                                f14 -= this.mAdapter.getPageWidth(i21) + f12;
                                i21--;
                            }
                            f14 -= dVar3.delta + f12;
                            dVar3.echo = f14;
                        }
                    }
                }
                int size2 = this.mItems.size();
                float f15 = dVar2.echo;
                int i25 = dVar2.bravo;
                int i26 = i25 - 1;
                this.mFirstOffset = i25 == 0 ? f15 : -3.4028235E38f;
                int i27 = count2 - 1;
                this.mLastOffset = i25 == i27 ? (dVar2.delta + f15) - 1.0f : Float.MAX_VALUE;
                int i28 = i13 - 1;
                while (i28 >= 0) {
                    d dVar10 = this.mItems.get(i28);
                    while (true) {
                        i10 = dVar10.bravo;
                        if (i26 <= i10) {
                            break;
                        }
                        f15 -= this.mAdapter.getPageWidth(i26) + f12;
                        i26--;
                    }
                    f15 -= dVar10.delta + f12;
                    dVar10.echo = f15;
                    if (i10 == 0) {
                        this.mFirstOffset = f15;
                    }
                    i28--;
                    i26--;
                }
                float f16 = dVar2.echo + dVar2.delta + f12;
                int i29 = dVar2.bravo;
                while (true) {
                    i29++;
                    if (i18 >= size2) {
                        break;
                    }
                    d dVar11 = this.mItems.get(i18);
                    while (true) {
                        i5 = dVar11.bravo;
                        if (i29 >= i5) {
                            break;
                        }
                        f16 += this.mAdapter.getPageWidth(i29) + f12;
                        i29++;
                    }
                    if (i5 == i27) {
                        this.mLastOffset = (dVar11.delta + f16) - 1.0f;
                    }
                    dVar11.echo = f16;
                    f16 += dVar11.delta + f12;
                    i18++;
                }
                this.mNeedCalculatePageOffsets = false;
                this.mAdapter.setPrimaryItem((ViewGroup) this, this.mCurItem, dVar2.alpha);
            } else {
                f5 = 0.0f;
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            int childCount = getChildCount();
            for (int i30 = 0; i30 < childCount; i30++) {
                View childAt = getChildAt(i30);
                e eVar = (e) childAt.getLayoutParams();
                eVar.foxtrot = i30;
                if (!eVar.alpha && eVar.charlie == f5 && (infoForChild = infoForChild(childAt)) != null) {
                    eVar.charlie = infoForChild.delta;
                    eVar.echo = infoForChild.bravo;
                }
            }
            lima();
            if (hasFocus()) {
                View findFocus = findFocus();
                d infoForAnyChild = findFocus != null ? infoForAnyChild(findFocus) : null;
                if (infoForAnyChild == null || infoForAnyChild.bravo != this.mCurItem) {
                    for (int i31 = 0; i31 < getChildCount(); i31++) {
                        View childAt2 = getChildAt(i31);
                        d infoForChild2 = infoForChild(childAt2);
                        if (infoForChild2 != null && infoForChild2.bravo == this.mCurItem && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        try {
            hexString = getResources().getResourceName(getId());
        } catch (Resources.NotFoundException unused) {
            hexString = Integer.toHexString(getId());
        }
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.mExpectedAdapterCount + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.mAdapter.getClass());
    }

    public void setCurrentItemInternal(int i4, boolean z2, boolean z10, int i5) {
        a aVar = this.mAdapter;
        if (aVar != null && aVar.getCount() > 0) {
            if (!z10 && this.mCurItem == i4 && this.mItems.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i4 < 0) {
                i4 = 0;
            } else if (i4 >= this.mAdapter.getCount()) {
                i4 = this.mAdapter.getCount() - 1;
            }
            int i10 = this.mOffscreenPageLimit;
            int i11 = this.mCurItem;
            if (i4 > i11 + i10 || i4 < i11 - i10) {
                for (int i12 = 0; i12 < this.mItems.size(); i12++) {
                    this.mItems.get(i12).charlie = true;
                }
            }
            boolean z11 = this.mCurItem != i4;
            if (this.mFirstLayout) {
                this.mCurItem = i4;
                if (z11) {
                    charlie(i4);
                }
                requestLayout();
                return;
            }
            populate(i4);
            kilo(i4, i5, z2, z11);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public void setPageTransformer(boolean z2, i iVar, int i4) {
        boolean z10 = iVar != null;
        setChildrenDrawingOrderEnabled(z10);
        if (z10) {
            this.mDrawingOrder = z2 ? 2 : 1;
            this.mPageTransformerLayerType = i4;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z10) {
            populate();
        }
    }

    public void smoothScrollTo(int i4, int i5, int i10) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i11 = scrollX;
        int scrollY = getScrollY();
        int i12 = i4 - i11;
        int i13 = i5 - scrollY;
        if (i12 == 0 && i13 == 0) {
            alpha(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i14 = clientWidth / 2;
        float f5 = clientWidth;
        float f10 = i14;
        float distanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i12) * 1.0f) / f5)) * f10) + f10;
        int abs2 = Math.abs(i10);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i12) / ((this.mAdapter.getPageWidth(this.mCurItem) * f5) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, MAX_SETTLE_DURATION);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i11, scrollY, i12, i13, min);
        WeakHashMap weakHashMap = au.alpha;
        postInvalidateOnAnimation();
    }

    public void setCurrentItem(int i4, boolean z2) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i4, z2, false);
    }

    public void setPageMarginDrawable(int i4) {
        setPageMarginDrawable(getContext().getDrawable(i4));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.viewpager.widget.d, java.lang.Object] */
    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new Object();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new F6.b(12, this);
        this.mScrollState = 0;
        initViewPager();
    }
}
