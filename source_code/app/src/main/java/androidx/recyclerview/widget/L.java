package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.P0;
import g.C1718a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k2.AbstractC2001a;
import t1.C2952d;

/* loaded from: classes3.dex */
public abstract class L {
    public C0666k alpha;
    public RecyclerView bravo;
    public final n0 charlie;
    public final n0 delta;
    public ao echo;
    public boolean foxtrot;
    public boolean golf;
    public final boolean hotel;
    public final boolean india;
    public int juliet;
    public boolean kilo;
    public int lima;
    public int mike;
    public int november;
    public int oscar;

    public L() {
        J j5 = new J(this, 0);
        J j6 = new J(this, 1);
        this.charlie = new n0(j5);
        this.delta = new n0(j6);
        this.foxtrot = false;
        this.golf = false;
        this.hotel = true;
        this.india = true;
    }

    public static int azure(View view) {
        return view.getLeft() - ((M) view.getLayoutParams()).purple.left;
    }

    public static int beige(View view) {
        Rect rect = ((M) view.getLayoutParams()).purple;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int black(View view) {
        Rect rect = ((M) view.getLayoutParams()).purple;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int blue(View view) {
        return view.getRight() + ((M) view.getLayoutParams()).purple.right;
    }

    public static int bronze(View view) {
        return view.getTop() - ((M) view.getLayoutParams()).purple.top;
    }

    public static int gray(View view) {
        return ((M) view.getLayoutParams()).alpha.getLayoutPosition();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.K, java.lang.Object] */
    public static K green(Context context, AttributeSet attributeSet, int i4, int i5) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2001a.alpha, i4, i5);
        obj.alpha = obtainStyledAttributes.getInt(0, 1);
        obj.bravo = obtainStyledAttributes.getInt(10, 1);
        obj.charlie = obtainStyledAttributes.getBoolean(9, false);
        obj.delta = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static int hotel(int i4, int i5, int i10) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i5, i10);
            }
            return size;
        }
        return Math.min(size, Math.max(i5, i10));
    }

    public static boolean lavender(int i4, int i5, int i10) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (i10 > 0 && i4 != i10) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i4) {
                return false;
            }
            return true;
        }
        if (size < i4) {
            return false;
        }
        return true;
    }

    public static void lime(View view, int i4, int i5, int i10, int i11) {
        M m4 = (M) view.getLayoutParams();
        Rect rect = m4.purple;
        view.layout(i4 + rect.left + ((ViewGroup.MarginLayoutParams) m4).leftMargin, i5 + rect.top + ((ViewGroup.MarginLayoutParams) m4).topMargin, (i10 - rect.right) - ((ViewGroup.MarginLayoutParams) m4).rightMargin, (i11 - rect.bottom) - ((ViewGroup.MarginLayoutParams) m4).bottomMargin);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int xray(boolean z2, int i4, int i5, int i10, int i11) {
        int max = Math.max(0, i4 - i10);
        if (z2) {
            if (i11 < 0) {
                if (i11 == -1) {
                    if (i5 != Integer.MIN_VALUE) {
                        if (i5 != 0) {
                        }
                    }
                    i11 = max;
                }
                i5 = 0;
                i11 = 0;
            }
            i5 = 1073741824;
        } else {
            if (i11 < 0) {
                if (i11 != -1) {
                    if (i11 == -2) {
                        if (i5 != Integer.MIN_VALUE && i5 != 1073741824) {
                            i11 = max;
                            i5 = 0;
                        } else {
                            i11 = max;
                            i5 = Integer.MIN_VALUE;
                        }
                    }
                    i5 = 0;
                    i11 = 0;
                }
                i11 = max;
            }
            i5 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i11, i5);
    }

    public static int zulu(View view) {
        return view.getBottom() + ((M) view.getLayoutParams()).purple.bottom;
    }

    public void a(RecyclerView recyclerView, int i4, int i5) {
        yellow(i4);
    }

    public void amber(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public abstract void b(U u4, b0 b0Var);

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bravo(View view, int i4, boolean z2) {
        int charlie;
        f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (!z2 && !childViewHolderInt.isRemoved()) {
            this.bravo.mViewInfoStore.charlie(childViewHolderInt);
        } else {
            bv.aw awVar = this.bravo.mViewInfoStore.alpha;
            r0 r0Var = (r0) awVar.get(childViewHolderInt);
            if (r0Var == null) {
                r0Var = r0.alpha();
                awVar.put(childViewHolderInt, r0Var);
            }
            r0Var.alpha |= 1;
        }
        M m4 = (M) view.getLayoutParams();
        if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
            if (view.getParent() == this.bravo) {
                C0666k c0666k = this.alpha;
                int indexOfChild = c0666k.alpha.alpha.indexOfChild(view);
                if (indexOfChild != -1) {
                    C0665j c0665j = c0666k.bravo;
                    if (!c0665j.echo(indexOfChild)) {
                        charlie = indexOfChild - c0665j.charlie(indexOfChild);
                        if (i4 == -1) {
                            i4 = this.alpha.echo();
                        }
                        if (charlie == -1) {
                            if (charlie != i4) {
                                L l10 = this.bravo.mLayout;
                                View victor = l10.victor(charlie);
                                if (victor != null) {
                                    l10.victor(charlie);
                                    l10.alpha.charlie(charlie);
                                    M m5 = (M) victor.getLayoutParams();
                                    f0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(victor);
                                    if (childViewHolderInt2.isRemoved()) {
                                        bv.aw awVar2 = l10.bravo.mViewInfoStore.alpha;
                                        r0 r0Var2 = (r0) awVar2.get(childViewHolderInt2);
                                        if (r0Var2 == null) {
                                            r0Var2 = r0.alpha();
                                            awVar2.put(childViewHolderInt2, r0Var2);
                                        }
                                        r0Var2.alpha = 1 | r0Var2.alpha;
                                    } else {
                                        l10.bravo.mViewInfoStore.charlie(childViewHolderInt2);
                                    }
                                    l10.alpha.bravo(victor, i4, m5, childViewHolderInt2.isRemoved());
                                } else {
                                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + charlie + l10.bravo.toString());
                                }
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                            sb2.append(this.bravo.indexOfChild(view));
                            throw new IllegalStateException(P0.black(this.bravo, sb2));
                        }
                    }
                }
                charlie = -1;
                if (i4 == -1) {
                }
                if (charlie == -1) {
                }
            } else {
                this.alpha.alpha(view, i4, false);
                m4.red = true;
                ao aoVar = this.echo;
                if (aoVar != null && aoVar.isRunning()) {
                    this.echo.onChildAttachedToWindow(view);
                }
            }
        } else {
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            this.alpha.bravo(view, i4, view.getLayoutParams(), false);
        }
        if (m4.silver) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + m4.alpha);
            }
            childViewHolderInt.itemView.invalidate();
            m4.silver = false;
        }
    }

    public abstract void c(b0 b0Var);

    public void charlie(String str) {
        RecyclerView recyclerView = this.bravo;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public final int coral() {
        az azVar;
        RecyclerView recyclerView = this.bravo;
        if (recyclerView != null) {
            azVar = recyclerView.getAdapter();
        } else {
            azVar = null;
        }
        if (azVar != null) {
            return azVar.getItemCount();
        }
        return 0;
    }

    public final int crimson() {
        RecyclerView recyclerView = this.bravo;
        WeakHashMap weakHashMap = s1.au.alpha;
        return recyclerView.getLayoutDirection();
    }

    public final int cyan() {
        RecyclerView recyclerView = this.bravo;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public void d(Parcelable parcelable) {
    }

    public final void delta(View view, Rect rect) {
        RecyclerView recyclerView = this.bravo;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
    }

    public Parcelable e() {
        return null;
    }

    public abstract boolean echo();

    public final int emerald() {
        RecyclerView recyclerView = this.bravo;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public void f(int i4) {
    }

    public abstract boolean foxtrot();

    public final int fuchsia() {
        RecyclerView recyclerView = this.bravo;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final void g() {
        for (int whiskey = whiskey() - 1; whiskey >= 0; whiskey--) {
            this.alpha.juliet(whiskey);
        }
    }

    public final int gold() {
        RecyclerView recyclerView = this.bravo;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public boolean golf(M m4) {
        return m4 != null;
    }

    public final void h(U u4) {
        for (int whiskey = whiskey() - 1; whiskey >= 0; whiskey--) {
            if (!RecyclerView.getChildViewHolderInt(victor(whiskey)).shouldIgnore()) {
                View victor = victor(whiskey);
                if (victor(whiskey) != null) {
                    this.alpha.juliet(whiskey);
                }
                u4.juliet(victor);
            }
        }
    }

    public final void i(U u4) {
        ArrayList arrayList;
        int size = u4.alpha.size();
        int i4 = size - 1;
        while (true) {
            arrayList = u4.alpha;
            if (i4 < 0) {
                break;
            }
            View view = ((f0) arrayList.get(i4)).itemView;
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.setIsRecyclable(false);
                if (childViewHolderInt.isTmpDetached()) {
                    this.bravo.removeDetachedView(view, false);
                }
                H h4 = this.bravo.mItemAnimator;
                if (h4 != null) {
                    h4.endAnimation(childViewHolderInt);
                }
                childViewHolderInt.setIsRecyclable(true);
                f0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.mScrapContainer = null;
                childViewHolderInt2.mInChangeScrap = false;
                childViewHolderInt2.clearReturnedFromScrapFlag();
                u4.kilo(childViewHolderInt2);
            }
            i4--;
        }
        arrayList.clear();
        ArrayList arrayList2 = u4.bravo;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.bravo.invalidate();
        }
    }

    public void india(int i4, int i5, b0 b0Var, ae aeVar) {
    }

    public int indigo(U u4, b0 b0Var) {
        return -1;
    }

    public final void ivory(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((M) view.getLayoutParams()).purple;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.bravo != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.bravo.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void j(View view, U u4) {
        C0666k c0666k = this.alpha;
        ax axVar = c0666k.alpha;
        int i4 = c0666k.delta;
        if (i4 != 1) {
            if (i4 != 2) {
                try {
                    c0666k.delta = 1;
                    c0666k.echo = view;
                    int indexOfChild = axVar.alpha.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (c0666k.bravo.hotel(indexOfChild)) {
                            c0666k.kilo(view);
                        }
                        axVar.charlie(indexOfChild);
                    }
                    c0666k.delta = 0;
                    c0666k.echo = null;
                    u4.juliet(view);
                    return;
                } catch (Throwable th) {
                    c0666k.delta = 0;
                    c0666k.echo = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public abstract boolean jade();

    public void juliet(int i4, ae aeVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean k(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z10) {
        int emerald = emerald();
        int gold = gold();
        int fuchsia = this.november - fuchsia();
        int cyan = this.oscar - cyan();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i4 = left - emerald;
        int min = Math.min(0, i4);
        int i5 = top - gold;
        int min2 = Math.min(0, i5);
        int i10 = width - fuchsia;
        int max = Math.max(0, i10);
        int max2 = Math.max(0, height - cyan);
        if (crimson() == 1) {
            if (max == 0) {
                max = Math.max(min, i10);
            }
        } else {
            if (min == 0) {
                min = Math.min(i4, max);
            }
            max = min;
        }
        if (min2 == 0) {
            min2 = Math.min(i5, max2);
        }
        int[] iArr = {max, min2};
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (z10) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int emerald2 = emerald();
                int gold2 = gold();
                int fuchsia2 = this.november - fuchsia();
                int cyan2 = this.oscar - cyan();
                Rect rect2 = this.bravo.mTempRect;
                amber(focusedChild, rect2);
                if (rect2.left - i11 < fuchsia2) {
                    if (rect2.right - i11 > emerald2) {
                        if (rect2.top - i12 < cyan2) {
                        }
                    }
                }
            }
            return false;
        }
        if (i11 != 0 || i12 != 0) {
            if (z2) {
                recyclerView.scrollBy(i11, i12);
            } else {
                recyclerView.smoothScrollBy(i11, i12);
            }
            return true;
        }
        return false;
    }

    public abstract int kilo(b0 b0Var);

    public final void l() {
        RecyclerView recyclerView = this.bravo;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int lima(b0 b0Var);

    public abstract int m(int i4, U u4, b0 b0Var);

    public void magenta(int i4) {
        RecyclerView recyclerView = this.bravo;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i4);
        }
    }

    public void maroon(int i4) {
        RecyclerView recyclerView = this.bravo;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i4);
        }
    }

    public abstract int mike(b0 b0Var);

    public abstract void n(int i4);

    public void navy() {
    }

    public abstract int november(b0 b0Var);

    public abstract int o(int i4, U u4, b0 b0Var);

    public void ochre(RecyclerView recyclerView) {
    }

    public abstract void olive(RecyclerView recyclerView);

    public View orange(View view, int i4, U u4, b0 b0Var) {
        return null;
    }

    public abstract int oscar(b0 b0Var);

    public final void p(RecyclerView recyclerView) {
        q(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int papa(b0 b0Var);

    public void peach(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.bravo;
        U u4 = recyclerView.mRecycler;
        if (accessibilityEvent != null) {
            boolean z2 = true;
            if (!recyclerView.canScrollVertically(1) && !this.bravo.canScrollVertically(-1) && !this.bravo.canScrollHorizontally(-1) && !this.bravo.canScrollHorizontally(1)) {
                z2 = false;
            }
            accessibilityEvent.setScrollable(z2);
            az azVar = this.bravo.mAdapter;
            if (azVar != null) {
                accessibilityEvent.setItemCount(azVar.getItemCount());
            }
        }
    }

    public void pink(U u4, b0 b0Var, C2952d c2952d) {
        if (this.bravo.canScrollVertically(-1) || this.bravo.canScrollHorizontally(-1)) {
            c2952d.alpha(8192);
            c2952d.mike(true);
        }
        if (this.bravo.canScrollVertically(1) || this.bravo.canScrollHorizontally(1)) {
            c2952d.alpha(4096);
            c2952d.mike(true);
        }
        c2952d.kilo(C1718a.zulu(indigo(u4, b0Var), yankee(u4, b0Var), 0));
    }

    public final void plum(View view, C2952d c2952d) {
        f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
            C0666k c0666k = this.alpha;
            if (!c0666k.charlie.contains(childViewHolderInt.itemView)) {
                RecyclerView recyclerView = this.bravo;
                purple(recyclerView.mRecycler, recyclerView.mState, view, c2952d);
            }
        }
    }

    public void purple(U u4, b0 b0Var, View view, C2952d c2952d) {
    }

    public final void q(int i4, int i5) {
        this.november = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        this.lima = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.november = 0;
        }
        this.oscar = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        this.mike = mode2;
        if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.oscar = 0;
        }
    }

    public final void quebec(U u4) {
        for (int whiskey = whiskey() - 1; whiskey >= 0; whiskey--) {
            View victor = victor(whiskey);
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(victor);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "ignoring view " + childViewHolderInt);
                }
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.bravo.mAdapter.hasStableIds()) {
                if (victor(whiskey) != null) {
                    this.alpha.juliet(whiskey);
                }
                u4.kilo(childViewHolderInt);
            } else {
                victor(whiskey);
                this.alpha.charlie(whiskey);
                u4.lima(victor);
                this.bravo.mViewInfoStore.charlie(childViewHolderInt);
            }
        }
    }

    public void r(Rect rect, int i4, int i5) {
        int fuchsia = fuchsia() + emerald() + rect.width();
        int cyan = cyan() + gold() + rect.height();
        RecyclerView recyclerView = this.bravo;
        WeakHashMap weakHashMap = s1.au.alpha;
        RecyclerView.access$500(this.bravo, hotel(i4, fuchsia, recyclerView.getMinimumWidth()), hotel(i5, cyan, this.bravo.getMinimumHeight()));
    }

    public void red(int i4, int i5) {
    }

    public View romeo(int i4) {
        int whiskey = whiskey();
        for (int i5 = 0; i5 < whiskey; i5++) {
            View victor = victor(i5);
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(victor);
            if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i4 && !childViewHolderInt.shouldIgnore() && (this.bravo.mState.golf || !childViewHolderInt.isRemoved())) {
                return victor;
            }
        }
        return null;
    }

    public final void s(int i4, int i5) {
        int whiskey = whiskey();
        if (whiskey == 0) {
            this.bravo.defaultOnMeasure(i4, i5);
            return;
        }
        int i10 = RecyclerView.UNDEFINED_DURATION;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        for (int i14 = 0; i14 < whiskey; i14++) {
            View victor = victor(i14);
            Rect rect = this.bravo.mTempRect;
            amber(victor, rect);
            int i15 = rect.left;
            if (i15 < i13) {
                i13 = i15;
            }
            int i16 = rect.right;
            if (i16 > i10) {
                i10 = i16;
            }
            int i17 = rect.top;
            if (i17 < i11) {
                i11 = i17;
            }
            int i18 = rect.bottom;
            if (i18 > i12) {
                i12 = i18;
            }
        }
        this.bravo.mTempRect.set(i13, i11, i10, i12);
        r(this.bravo.mTempRect, i4, i5);
    }

    public abstract M sierra();

    public void silver() {
    }

    public final void t(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.bravo = null;
            this.alpha = null;
            this.november = 0;
            this.oscar = 0;
        } else {
            this.bravo = recyclerView;
            this.alpha = recyclerView.mChildHelper;
            this.november = recyclerView.getWidth();
            this.oscar = recyclerView.getHeight();
        }
        this.lima = 1073741824;
        this.mike = 1073741824;
    }

    public M tango(Context context, AttributeSet attributeSet) {
        return new M(context, attributeSet);
    }

    public void teal(int i4, int i5) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u(View view, int i4, int i5, M m4) {
        if (!view.isLayoutRequested() && this.hotel && lavender(view.getWidth(), i4, ((ViewGroup.MarginLayoutParams) m4).width) && lavender(view.getHeight(), i5, ((ViewGroup.MarginLayoutParams) m4).height)) {
            return false;
        }
        return true;
    }

    public M uniform(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof M) {
            return new M((M) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new M((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new M(layoutParams);
    }

    public boolean v() {
        return false;
    }

    public final View victor(int i4) {
        C0666k c0666k = this.alpha;
        if (c0666k != null) {
            return c0666k.delta(i4);
        }
        return null;
    }

    public final boolean w(View view, int i4, int i5, M m4) {
        if (this.hotel && lavender(view.getMeasuredWidth(), i4, ((ViewGroup.MarginLayoutParams) m4).width) && lavender(view.getMeasuredHeight(), i5, ((ViewGroup.MarginLayoutParams) m4).height)) {
            return false;
        }
        return true;
    }

    public final int whiskey() {
        C0666k c0666k = this.alpha;
        if (c0666k != null) {
            return c0666k.echo();
        }
        return 0;
    }

    public void white(int i4, int i5) {
    }

    public abstract void x(RecyclerView recyclerView, int i4);

    public final void y(ao aoVar) {
        ao aoVar2 = this.echo;
        if (aoVar2 != null && aoVar != aoVar2 && aoVar2.isRunning()) {
            this.echo.stop();
        }
        this.echo = aoVar;
        aoVar.start(this.bravo, this);
    }

    public int yankee(U u4, b0 b0Var) {
        return -1;
    }

    public void yellow(int i4) {
    }

    public boolean z() {
        return false;
    }
}
