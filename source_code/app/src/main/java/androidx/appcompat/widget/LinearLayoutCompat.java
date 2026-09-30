package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import id.C1915c;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;

/* loaded from: classes3.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0450d0;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        boolean z2;
        int right;
        int left;
        int i4;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean z10 = m1.alpha;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View virtualChildAt = getVirtualChildAt(i5);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i5)) {
                C0450d0 c0450d0 = (C0450d0) virtualChildAt.getLayoutParams();
                if (z2) {
                    left2 = virtualChildAt.getRight() + ((LinearLayout.LayoutParams) c0450d0).rightMargin;
                } else {
                    left2 = (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) c0450d0).leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, left2);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                if (z2) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i4 = this.mDividerWidth;
                    right = left - i4;
                }
            } else {
                C0450d0 c0450d02 = (C0450d0) virtualChildAt2.getLayoutParams();
                if (z2) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) c0450d02).leftMargin;
                    i4 = this.mDividerWidth;
                    right = left - i4;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) c0450d02).rightMargin;
                }
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View virtualChildAt = getVirtualChildAt(i4);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i4)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((C0450d0) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0450d0) virtualChildAt2.getLayoutParams())).bottomMargin;
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i4) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i4, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i4);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i4) {
        this.mDivider.setBounds(i4, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i4, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i4;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.mBaselineAlignedChildIndex;
        if (childCount > i5) {
            View childAt = getChildAt(i5);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.mBaselineAlignedChildIndex == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i10 = this.mBaselineChildTop;
            if (this.mOrientation == 1 && (i4 = this.mGravity & 112) != 48) {
                if (i4 != 16) {
                    if (i4 == 80) {
                        i10 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                    }
                } else {
                    i10 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
                }
            }
            return i10 + ((LinearLayout.LayoutParams) ((C0450d0) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i4) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i4) {
        return getChildAt(i4);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public boolean hasDividerBeforeChildAt(int i4) {
        if (i4 == 0) {
            if ((this.mShowDividers & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i4 == getChildCount()) {
            if ((this.mShowDividers & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                if (getChildAt(i5).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutHorizontal(int i4, int i5, int i10, int i11) {
        Object[] objArr;
        int paddingLeft;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z2 = true;
        boolean z10 = m1.alpha;
        int i22 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
        } else {
            objArr = false;
        }
        int paddingTop = getPaddingTop();
        int i23 = i11 - i5;
        int paddingBottom = i23 - getPaddingBottom();
        int paddingBottom2 = (i23 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i24 = this.mGravity;
        int i25 = 8388615 & i24;
        int i26 = i24 & 112;
        boolean z11 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = Gravity.getAbsoluteGravity(i25, getLayoutDirection());
        char c3 = 2;
        if (absoluteGravity != 1) {
            if (absoluteGravity != 5) {
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = ((getPaddingLeft() + i10) - i4) - this.mTotalLength;
            }
        } else {
            paddingLeft = getPaddingLeft() + (((i10 - i4) - this.mTotalLength) / 2);
        }
        if (objArr != false) {
            i13 = virtualChildCount - 1;
            i12 = -1;
        } else {
            i12 = 1;
            i13 = 0;
        }
        while (i22 < virtualChildCount) {
            boolean z12 = z2;
            int i27 = (i12 * i22) + i13;
            char c4 = c3;
            View virtualChildAt = getVirtualChildAt(i27);
            if (virtualChildAt == null) {
                paddingLeft = measureNullChild(i27) + paddingLeft;
                i14 = i13;
            } else {
                i14 = i13;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    C0450d0 c0450d0 = (C0450d0) virtualChildAt.getLayoutParams();
                    int i28 = i22;
                    if (z11) {
                        i15 = paddingTop;
                        if (((LinearLayout.LayoutParams) c0450d0).height != -1) {
                            i16 = virtualChildAt.getBaseline();
                            i17 = ((LinearLayout.LayoutParams) c0450d0).gravity;
                            if (i17 < 0) {
                                i17 = i26;
                            }
                            i18 = i17 & 112;
                            i19 = paddingBottom2;
                            if (i18 == 16) {
                                if (i18 != 48) {
                                    if (i18 != 80) {
                                        i20 = i15;
                                    } else {
                                        i20 = (paddingBottom - measuredHeight) - ((LinearLayout.LayoutParams) c0450d0).bottomMargin;
                                        if (i16 != -1) {
                                            i21 = iArr2[c4] - (virtualChildAt.getMeasuredHeight() - i16);
                                        }
                                    }
                                } else {
                                    i20 = i15 + ((LinearLayout.LayoutParams) c0450d0).topMargin;
                                    if (i16 != -1) {
                                        i20 = (iArr[z12 ? 1 : 0] - i16) + i20;
                                    }
                                }
                                if (hasDividerBeforeChildAt(i27)) {
                                    paddingLeft += this.mDividerWidth;
                                }
                                int i29 = paddingLeft + ((LinearLayout.LayoutParams) c0450d0).leftMargin;
                                int locationOffset = getLocationOffset(virtualChildAt) + i29;
                                virtualChildAt.layout(locationOffset, i20, locationOffset + measuredWidth, measuredHeight + i20);
                                paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) c0450d0).rightMargin + i29;
                                i22 = getChildrenSkipCount(virtualChildAt, i27) + i28;
                                i22++;
                                c3 = c4;
                                i13 = i14;
                                z2 = z12 ? 1 : 0;
                                paddingTop = i15;
                                paddingBottom2 = i19;
                            } else {
                                i20 = ((i19 - measuredHeight) / 2) + i15 + ((LinearLayout.LayoutParams) c0450d0).topMargin;
                                i21 = ((LinearLayout.LayoutParams) c0450d0).bottomMargin;
                            }
                            i20 -= i21;
                            if (hasDividerBeforeChildAt(i27)) {
                            }
                            int i292 = paddingLeft + ((LinearLayout.LayoutParams) c0450d0).leftMargin;
                            int locationOffset2 = getLocationOffset(virtualChildAt) + i292;
                            virtualChildAt.layout(locationOffset2, i20, locationOffset2 + measuredWidth, measuredHeight + i20);
                            paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) c0450d0).rightMargin + i292;
                            i22 = getChildrenSkipCount(virtualChildAt, i27) + i28;
                            i22++;
                            c3 = c4;
                            i13 = i14;
                            z2 = z12 ? 1 : 0;
                            paddingTop = i15;
                            paddingBottom2 = i19;
                        }
                    } else {
                        i15 = paddingTop;
                    }
                    i16 = -1;
                    i17 = ((LinearLayout.LayoutParams) c0450d0).gravity;
                    if (i17 < 0) {
                    }
                    i18 = i17 & 112;
                    i19 = paddingBottom2;
                    if (i18 == 16) {
                    }
                    i20 -= i21;
                    if (hasDividerBeforeChildAt(i27)) {
                    }
                    int i2922 = paddingLeft + ((LinearLayout.LayoutParams) c0450d0).leftMargin;
                    int locationOffset22 = getLocationOffset(virtualChildAt) + i2922;
                    virtualChildAt.layout(locationOffset22, i20, locationOffset22 + measuredWidth, measuredHeight + i20);
                    paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) c0450d0).rightMargin + i2922;
                    i22 = getChildrenSkipCount(virtualChildAt, i27) + i28;
                    i22++;
                    c3 = c4;
                    i13 = i14;
                    z2 = z12 ? 1 : 0;
                    paddingTop = i15;
                    paddingBottom2 = i19;
                }
            }
            i15 = paddingTop;
            i19 = paddingBottom2;
            i22++;
            c3 = c4;
            i13 = i14;
            z2 = z12 ? 1 : 0;
            paddingTop = i15;
            paddingBottom2 = i19;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutVertical(int i4, int i5, int i10, int i11) {
        int paddingTop;
        int i12;
        int i13;
        int i14;
        int paddingLeft = getPaddingLeft();
        int i15 = i10 - i4;
        int paddingRight = i15 - getPaddingRight();
        int paddingRight2 = (i15 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i16 = this.mGravity;
        int i17 = i16 & 112;
        int i18 = i16 & 8388615;
        if (i17 != 16) {
            if (i17 != 80) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((getPaddingTop() + i11) - i5) - this.mTotalLength;
            }
        } else {
            paddingTop = (((i11 - i5) - this.mTotalLength) / 2) + getPaddingTop();
        }
        int i19 = 0;
        while (i19 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i19);
            if (virtualChildAt == null) {
                paddingTop = measureNullChild(i19) + paddingTop;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                C0450d0 c0450d0 = (C0450d0) virtualChildAt.getLayoutParams();
                int i20 = ((LinearLayout.LayoutParams) c0450d0).gravity;
                if (i20 < 0) {
                    i20 = i18;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i20, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i14 = ((LinearLayout.LayoutParams) c0450d0).leftMargin + paddingLeft;
                        if (hasDividerBeforeChildAt(i19)) {
                            paddingTop += this.mDividerHeight;
                        }
                        int i21 = paddingTop + ((LinearLayout.LayoutParams) c0450d0).topMargin;
                        int locationOffset = getLocationOffset(virtualChildAt) + i21;
                        virtualChildAt.layout(i14, locationOffset, measuredWidth + i14, locationOffset + measuredHeight);
                        int nextLocationOffset = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) c0450d0).bottomMargin + i21;
                        i19 += getChildrenSkipCount(virtualChildAt, i19);
                        paddingTop = nextLocationOffset;
                    } else {
                        i12 = paddingRight - measuredWidth;
                        i13 = ((LinearLayout.LayoutParams) c0450d0).rightMargin;
                    }
                } else {
                    i12 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0450d0).leftMargin;
                    i13 = ((LinearLayout.LayoutParams) c0450d0).rightMargin;
                }
                i14 = i12 - i13;
                if (hasDividerBeforeChildAt(i19)) {
                }
                int i212 = paddingTop + ((LinearLayout.LayoutParams) c0450d0).topMargin;
                int locationOffset2 = getLocationOffset(virtualChildAt) + i212;
                virtualChildAt.layout(i14, locationOffset2, measuredWidth + i14, locationOffset2 + measuredHeight);
                int nextLocationOffset2 = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) c0450d0).bottomMargin + i212;
                i19 += getChildrenSkipCount(virtualChildAt, i19);
                paddingTop = nextLocationOffset2;
            }
            i19++;
        }
    }

    public void measureChildBeforeLayout(View view, int i4, int i5, int i10, int i11, int i12) {
        measureChildWithMargins(view, i5, i10, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x043d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureHorizontal(int i4, int i5) {
        boolean z2;
        int i10;
        int max;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        int i17;
        boolean z11;
        int baseline;
        int i18;
        int i19;
        int i20;
        int i21;
        int childrenSkipCount;
        char c3;
        int i22;
        boolean z12;
        int i23;
        int i24;
        int[] iArr;
        int i25;
        boolean z13;
        int[] iArr2;
        View view;
        boolean z14;
        boolean z15;
        int baseline2;
        LinearLayoutCompat linearLayoutCompat = this;
        linearLayoutCompat.mTotalLength = 0;
        int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        if (linearLayoutCompat.mMaxAscent == null || linearLayoutCompat.mMaxDescent == null) {
            linearLayoutCompat.mMaxAscent = new int[4];
            linearLayoutCompat.mMaxDescent = new int[4];
        }
        int[] iArr3 = linearLayoutCompat.mMaxAscent;
        int[] iArr4 = linearLayoutCompat.mMaxDescent;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z16 = linearLayoutCompat.mBaselineAligned;
        boolean z17 = linearLayoutCompat.mUseLargestChild;
        int i26 = 1073741824;
        if (mode == 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z18 = z17;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        boolean z19 = false;
        int i30 = 0;
        boolean z20 = false;
        boolean z21 = true;
        float f5 = 0.0f;
        int i31 = 0;
        int i32 = 0;
        while (true) {
            i10 = i28;
            if (i27 >= virtualChildCount) {
                break;
            }
            boolean z22 = z16;
            View virtualChildAt = linearLayoutCompat.getVirtualChildAt(i27);
            if (virtualChildAt == null) {
                linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(i27) + linearLayoutCompat.mTotalLength;
            } else if (virtualChildAt.getVisibility() == 8) {
                i27 += linearLayoutCompat.getChildrenSkipCount(virtualChildAt, i27);
            } else {
                if (linearLayoutCompat.hasDividerBeforeChildAt(i27)) {
                    linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerWidth;
                }
                C0450d0 c0450d0 = (C0450d0) virtualChildAt.getLayoutParams();
                float f10 = ((LinearLayout.LayoutParams) c0450d0).weight;
                float f11 = f5 + f10;
                if (mode == i26 && ((LinearLayout.LayoutParams) c0450d0).width == 0 && f10 > 0.0f) {
                    if (z2) {
                        linearLayoutCompat.mTotalLength = ((LinearLayout.LayoutParams) c0450d0).leftMargin + ((LinearLayout.LayoutParams) c0450d0).rightMargin + linearLayoutCompat.mTotalLength;
                    } else {
                        int i33 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i33, ((LinearLayout.LayoutParams) c0450d0).leftMargin + i33 + ((LinearLayout.LayoutParams) c0450d0).rightMargin);
                    }
                    if (z22) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(makeMeasureSpec, makeMeasureSpec);
                        view = virtualChildAt;
                        i24 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                    } else {
                        view = virtualChildAt;
                        i24 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        z19 = true;
                    }
                    i25 = i10;
                    z13 = z18;
                } else {
                    if (((LinearLayout.LayoutParams) c0450d0).width == 0 && f10 > 0.0f) {
                        c3 = 65534;
                        ((LinearLayout.LayoutParams) c0450d0).width = -2;
                        i22 = 0;
                    } else {
                        c3 = 65534;
                        i22 = RecyclerView.UNDEFINED_DURATION;
                    }
                    if (f11 == 0.0f) {
                        z12 = z18;
                        i23 = linearLayoutCompat.mTotalLength;
                    } else {
                        z12 = z18;
                        i23 = 0;
                    }
                    i24 = mode;
                    iArr = iArr3;
                    i25 = i10;
                    int i34 = i22;
                    z13 = z12;
                    iArr2 = iArr4;
                    linearLayoutCompat.measureChildBeforeLayout(virtualChildAt, i27, i4, i23, i5, 0);
                    view = virtualChildAt;
                    if (i34 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) c0450d0).width = i34;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    if (z2) {
                        linearLayoutCompat.mTotalLength = linearLayoutCompat.getNextLocationOffset(view) + ((LinearLayout.LayoutParams) c0450d0).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) c0450d0).rightMargin + linearLayoutCompat.mTotalLength;
                    } else {
                        int i35 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i35, linearLayoutCompat.getNextLocationOffset(view) + i35 + measuredWidth + ((LinearLayout.LayoutParams) c0450d0).leftMargin + ((LinearLayout.LayoutParams) c0450d0).rightMargin);
                    }
                    if (z13) {
                        i29 = Math.max(measuredWidth, i29);
                    }
                }
                if (mode2 != 1073741824 && ((LinearLayout.LayoutParams) c0450d0).height == -1) {
                    z14 = true;
                    z20 = true;
                } else {
                    z14 = false;
                }
                int i36 = ((LinearLayout.LayoutParams) c0450d0).topMargin + ((LinearLayout.LayoutParams) c0450d0).bottomMargin;
                int measuredHeight = view.getMeasuredHeight() + i36;
                i30 = View.combineMeasuredStates(i30, view.getMeasuredState());
                if (z22 && (baseline2 = view.getBaseline()) != -1) {
                    int i37 = ((LinearLayout.LayoutParams) c0450d0).gravity;
                    if (i37 < 0) {
                        i37 = linearLayoutCompat.mGravity;
                    }
                    int i38 = (((i37 & 112) >> 4) & (-2)) >> 1;
                    z15 = z14;
                    iArr[i38] = Math.max(iArr[i38], baseline2);
                    iArr2[i38] = Math.max(iArr2[i38], measuredHeight - baseline2);
                } else {
                    z15 = z14;
                }
                int max2 = Math.max(i25, measuredHeight);
                if (z21 && ((LinearLayout.LayoutParams) c0450d0).height == -1) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (((LinearLayout.LayoutParams) c0450d0).weight > 0.0f) {
                    if (!z15) {
                        i36 = measuredHeight;
                    }
                    i32 = Math.max(i32, i36);
                } else {
                    if (!z15) {
                        i36 = measuredHeight;
                    }
                    i31 = Math.max(i31, i36);
                }
                i27 += linearLayoutCompat.getChildrenSkipCount(view, i27);
                i28 = max2;
                f5 = f11;
                i27++;
                z18 = z13;
                iArr4 = iArr2;
                z16 = z22;
                iArr3 = iArr;
                mode = i24;
                i26 = 1073741824;
            }
            i24 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            i28 = i10;
            z13 = z18;
            i27++;
            z18 = z13;
            iArr4 = iArr2;
            z16 = z22;
            iArr3 = iArr;
            mode = i24;
            i26 = 1073741824;
        }
        boolean z23 = z16;
        int i39 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i40 = i30;
        boolean z24 = z18;
        if (linearLayoutCompat.mTotalLength > 0 && linearLayoutCompat.hasDividerBeforeChildAt(virtualChildCount)) {
            linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerWidth;
        }
        int i41 = iArr5[1];
        if (i41 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) {
            max = i10;
        } else {
            max = Math.max(i10, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i41, iArr5[2]))));
        }
        int i42 = i39;
        if (z24 && (i42 == Integer.MIN_VALUE || i42 == 0)) {
            linearLayoutCompat.mTotalLength = 0;
            int i43 = 0;
            while (i43 < virtualChildCount) {
                View virtualChildAt2 = linearLayoutCompat.getVirtualChildAt(i43);
                if (virtualChildAt2 == null) {
                    linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(i43) + linearLayoutCompat.mTotalLength;
                } else if (virtualChildAt2.getVisibility() == 8) {
                    childrenSkipCount = i43 + linearLayoutCompat.getChildrenSkipCount(virtualChildAt2, i43);
                    i43 = childrenSkipCount + 1;
                } else {
                    C0450d0 c0450d02 = (C0450d0) virtualChildAt2.getLayoutParams();
                    if (z2) {
                        linearLayoutCompat.mTotalLength = linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + ((LinearLayout.LayoutParams) c0450d02).leftMargin + i29 + ((LinearLayout.LayoutParams) c0450d02).rightMargin + linearLayoutCompat.mTotalLength;
                    } else {
                        int i44 = linearLayoutCompat.mTotalLength;
                        i21 = i43;
                        linearLayoutCompat.mTotalLength = Math.max(i44, linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + i44 + i29 + ((LinearLayout.LayoutParams) c0450d02).leftMargin + ((LinearLayout.LayoutParams) c0450d02).rightMargin);
                        childrenSkipCount = i21;
                        i43 = childrenSkipCount + 1;
                    }
                }
                i21 = i43;
                childrenSkipCount = i21;
                i43 = childrenSkipCount + 1;
            }
        }
        int paddingRight = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.mTotalLength;
        linearLayoutCompat.mTotalLength = paddingRight;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, linearLayoutCompat.getSuggestedMinimumWidth()), i4, 0);
        int i45 = (16777215 & resolveSizeAndState) - linearLayoutCompat.mTotalLength;
        if (!z19 && (i45 == 0 || f5 <= 0.0f)) {
            i14 = Math.max(i31, i32);
            if (z24 && i42 != 1073741824) {
                for (int i46 = 0; i46 < virtualChildCount; i46++) {
                    View virtualChildAt3 = linearLayoutCompat.getVirtualChildAt(i46);
                    if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0450d0) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i29, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i11 = resolveSizeAndState;
            i12 = ShapeBuilder.DEFAULT_SHAPE_COLOR;
            i13 = 0;
        } else {
            float f12 = linearLayoutCompat.mWeightSum;
            if (f12 > 0.0f) {
                f5 = f12;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            linearLayoutCompat.mTotalLength = 0;
            max = -1;
            int i47 = 0;
            while (i47 < virtualChildCount) {
                View virtualChildAt4 = linearLayoutCompat.getVirtualChildAt(i47);
                if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8) {
                    C0450d0 c0450d03 = (C0450d0) virtualChildAt4.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) c0450d03).weight;
                    if (f13 > 0.0f) {
                        i16 = resolveSizeAndState;
                        int i48 = (int) ((i45 * f13) / f5);
                        f5 -= f13;
                        i45 -= i48;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + ((LinearLayout.LayoutParams) c0450d03).topMargin + ((LinearLayout.LayoutParams) c0450d03).bottomMargin, ((LinearLayout.LayoutParams) c0450d03).height);
                        if (((LinearLayout.LayoutParams) c0450d03).width == 0) {
                            i19 = 1073741824;
                            if (i42 == 1073741824) {
                                i15 = i42;
                                if (i48 > 0) {
                                    i20 = i48;
                                } else {
                                    i20 = 0;
                                }
                                virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), childMeasureSpec);
                                i40 = View.combineMeasuredStates(i40, virtualChildAt4.getMeasuredState() & ShapeBuilder.DEFAULT_SHAPE_COLOR);
                            }
                        } else {
                            i19 = 1073741824;
                        }
                        i15 = i42;
                        int measuredWidth2 = virtualChildAt4.getMeasuredWidth() + i48;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i19), childMeasureSpec);
                        i40 = View.combineMeasuredStates(i40, virtualChildAt4.getMeasuredState() & ShapeBuilder.DEFAULT_SHAPE_COLOR);
                    } else {
                        i15 = i42;
                        i16 = resolveSizeAndState;
                    }
                    if (z2) {
                        linearLayoutCompat.mTotalLength = linearLayoutCompat.getNextLocationOffset(virtualChildAt4) + virtualChildAt4.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0450d03).leftMargin + ((LinearLayout.LayoutParams) c0450d03).rightMargin + linearLayoutCompat.mTotalLength;
                    } else {
                        int i49 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i49, linearLayoutCompat.getNextLocationOffset(virtualChildAt4) + virtualChildAt4.getMeasuredWidth() + i49 + ((LinearLayout.LayoutParams) c0450d03).leftMargin + ((LinearLayout.LayoutParams) c0450d03).rightMargin);
                    }
                    if (mode2 != 1073741824 && ((LinearLayout.LayoutParams) c0450d03).height == -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i50 = ((LinearLayout.LayoutParams) c0450d03).topMargin + ((LinearLayout.LayoutParams) c0450d03).bottomMargin;
                    int measuredHeight2 = virtualChildAt4.getMeasuredHeight() + i50;
                    max = Math.max(max, measuredHeight2);
                    if (!z10) {
                        i50 = measuredHeight2;
                    }
                    int max3 = Math.max(i31, i50);
                    if (z21) {
                        i17 = -1;
                        if (((LinearLayout.LayoutParams) c0450d03).height == -1) {
                            z11 = true;
                            if (z23 && (baseline = virtualChildAt4.getBaseline()) != i17) {
                                i18 = ((LinearLayout.LayoutParams) c0450d03).gravity;
                                if (i18 < 0) {
                                    i18 = linearLayoutCompat.mGravity;
                                }
                                int i51 = (((i18 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i51] = Math.max(iArr5[i51], baseline);
                                iArr6[i51] = Math.max(iArr6[i51], measuredHeight2 - baseline);
                            }
                            i31 = max3;
                            z21 = z11;
                            i47++;
                            resolveSizeAndState = i16;
                            i42 = i15;
                        }
                    } else {
                        i17 = -1;
                    }
                    z11 = false;
                    if (z23) {
                        i18 = ((LinearLayout.LayoutParams) c0450d03).gravity;
                        if (i18 < 0) {
                        }
                        int i512 = (((i18 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i512] = Math.max(iArr5[i512], baseline);
                        iArr6[i512] = Math.max(iArr6[i512], measuredHeight2 - baseline);
                    }
                    i31 = max3;
                    z21 = z11;
                    i47++;
                    resolveSizeAndState = i16;
                    i42 = i15;
                }
                i15 = i42;
                i16 = resolveSizeAndState;
                i47++;
                resolveSizeAndState = i16;
                i42 = i15;
            }
            i11 = resolveSizeAndState;
            i12 = ShapeBuilder.DEFAULT_SHAPE_COLOR;
            linearLayoutCompat.mTotalLength = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.mTotalLength;
            int i52 = iArr5[1];
            if (i52 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) {
                i13 = 0;
            } else {
                i13 = 0;
                max = Math.max(max, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i52, iArr5[2]))));
            }
            i14 = i31;
        }
        if (z21 || mode2 == 1073741824) {
            i14 = max;
        }
        linearLayoutCompat.setMeasuredDimension(i11 | (i40 & i12), View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + i14, linearLayoutCompat.getSuggestedMinimumHeight()), i5, i40 << 16));
        if (z20) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredHeight(), 1073741824);
            int i53 = i13;
            while (i53 < virtualChildCount) {
                int i54 = makeMeasureSpec2;
                View virtualChildAt5 = linearLayoutCompat.getVirtualChildAt(i53);
                if (virtualChildAt5.getVisibility() != 8) {
                    C0450d0 c0450d04 = (C0450d0) virtualChildAt5.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c0450d04).height == -1) {
                        int i55 = ((LinearLayout.LayoutParams) c0450d04).width;
                        ((LinearLayout.LayoutParams) c0450d04).width = virtualChildAt5.getMeasuredWidth();
                        linearLayoutCompat.measureChildWithMargins(virtualChildAt5, i4, 0, i54, 0);
                        ((LinearLayout.LayoutParams) c0450d04).width = i55;
                    }
                }
                i53++;
                linearLayoutCompat = this;
                makeMeasureSpec2 = i54;
            }
        }
    }

    public int measureNullChild(int i4) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e3, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L145;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureVertical(int i4, int i5) {
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        View view;
        boolean z11;
        int i23;
        LinearLayoutCompat linearLayoutCompat = this;
        linearLayoutCompat.mTotalLength = 0;
        int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int i24 = linearLayoutCompat.mBaselineAlignedChildIndex;
        boolean z12 = linearLayoutCompat.mUseLargestChild;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        boolean z13 = false;
        boolean z14 = false;
        float f5 = 0.0f;
        boolean z15 = true;
        while (true) {
            int i31 = i26;
            int i32 = 8;
            if (i25 < virtualChildCount) {
                float f10 = f5;
                View virtualChildAt = linearLayoutCompat.getVirtualChildAt(i25);
                if (virtualChildAt == null) {
                    linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(i25) + linearLayoutCompat.mTotalLength;
                } else if (virtualChildAt.getVisibility() == 8) {
                    i25 += linearLayoutCompat.getChildrenSkipCount(virtualChildAt, i25);
                } else {
                    if (linearLayoutCompat.hasDividerBeforeChildAt(i25)) {
                        linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerHeight;
                    }
                    C0450d0 c0450d0 = (C0450d0) virtualChildAt.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) c0450d0).weight;
                    f10 += f11;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) c0450d0).height == 0 && f11 > 0.0f) {
                        int i33 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i33, ((LinearLayout.LayoutParams) c0450d0).topMargin + i33 + ((LinearLayout.LayoutParams) c0450d0).bottomMargin);
                        view = virtualChildAt;
                        i21 = virtualChildCount;
                        z10 = z12;
                        i17 = i30;
                        z13 = true;
                        i18 = i31;
                        i22 = i28;
                        i19 = i29;
                        i20 = mode2;
                    } else {
                        if (((LinearLayout.LayoutParams) c0450d0).height == 0 && f11 > 0.0f) {
                            ((LinearLayout.LayoutParams) c0450d0).height = -2;
                            i14 = 0;
                        } else {
                            i14 = Integer.MIN_VALUE;
                        }
                        if (f10 == 0.0f) {
                            int i34 = i29;
                            i16 = linearLayoutCompat.mTotalLength;
                            i15 = i34;
                        } else {
                            i15 = i29;
                            i16 = 0;
                        }
                        int i35 = i27;
                        z10 = z12;
                        i17 = i30;
                        i18 = i31;
                        i19 = i15;
                        i20 = mode2;
                        i21 = virtualChildCount;
                        i22 = i28;
                        linearLayoutCompat.measureChildBeforeLayout(virtualChildAt, i25, i4, 0, i5, i16);
                        view = virtualChildAt;
                        if (i14 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c0450d0).height = i14;
                        }
                        int measuredHeight = view.getMeasuredHeight();
                        int i36 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i36, linearLayoutCompat.getNextLocationOffset(view) + i36 + measuredHeight + ((LinearLayout.LayoutParams) c0450d0).topMargin + ((LinearLayout.LayoutParams) c0450d0).bottomMargin);
                        if (z10) {
                            i27 = Math.max(measuredHeight, i35);
                        } else {
                            i27 = i35;
                        }
                    }
                    if (i24 >= 0 && i24 == i25 + 1) {
                        linearLayoutCompat.mBaselineChildTop = linearLayoutCompat.mTotalLength;
                    }
                    if (i25 < i24 && ((LinearLayout.LayoutParams) c0450d0).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode != 1073741824 && ((LinearLayout.LayoutParams) c0450d0).width == -1) {
                        z11 = true;
                        z14 = true;
                    } else {
                        z11 = false;
                    }
                    int i37 = ((LinearLayout.LayoutParams) c0450d0).leftMargin + ((LinearLayout.LayoutParams) c0450d0).rightMargin;
                    int measuredWidth = view.getMeasuredWidth() + i37;
                    int max = Math.max(i22, measuredWidth);
                    int combineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                    if (z15 && ((LinearLayout.LayoutParams) c0450d0).width == -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (((LinearLayout.LayoutParams) c0450d0).weight > 0.0f) {
                        if (!z11) {
                            i37 = measuredWidth;
                        }
                        i23 = Math.max(i18, i37);
                        i30 = i17;
                    } else {
                        if (!z11) {
                            i37 = measuredWidth;
                        }
                        i30 = Math.max(i17, i37);
                        i23 = i18;
                    }
                    i25 += linearLayoutCompat.getChildrenSkipCount(view, i25);
                    i26 = i23;
                    i28 = max;
                    i29 = combineMeasuredStates;
                    i25++;
                    mode2 = i20;
                    f5 = f10;
                    virtualChildCount = i21;
                    z12 = z10;
                }
                i21 = virtualChildCount;
                z10 = z12;
                i26 = i31;
                i20 = mode2;
                i25++;
                mode2 = i20;
                f5 = f10;
                virtualChildCount = i21;
                z12 = z10;
            } else {
                float f12 = f5;
                int i38 = virtualChildCount;
                boolean z16 = z12;
                int i39 = i30;
                int i40 = i28;
                int i41 = i29;
                int i42 = mode2;
                int i43 = i27;
                if (linearLayoutCompat.mTotalLength > 0 && linearLayoutCompat.hasDividerBeforeChildAt(i38)) {
                    linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerHeight;
                }
                int i44 = i42;
                if (z16 && (i44 == Integer.MIN_VALUE || i44 == 0)) {
                    linearLayoutCompat.mTotalLength = 0;
                    int i45 = 0;
                    while (i45 < i38) {
                        View virtualChildAt2 = linearLayoutCompat.getVirtualChildAt(i45);
                        if (virtualChildAt2 == null) {
                            linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(i45) + linearLayoutCompat.mTotalLength;
                        } else if (virtualChildAt2.getVisibility() == i32) {
                            i45 += linearLayoutCompat.getChildrenSkipCount(virtualChildAt2, i45);
                        } else {
                            C0450d0 c0450d02 = (C0450d0) virtualChildAt2.getLayoutParams();
                            int i46 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i46, linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + i46 + i43 + ((LinearLayout.LayoutParams) c0450d02).topMargin + ((LinearLayout.LayoutParams) c0450d02).bottomMargin);
                        }
                        i45++;
                        i32 = 8;
                    }
                }
                int paddingBottom = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.mTotalLength;
                linearLayoutCompat.mTotalLength = paddingBottom;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, linearLayoutCompat.getSuggestedMinimumHeight()), i5, 0);
                int i47 = (16777215 & resolveSizeAndState) - linearLayoutCompat.mTotalLength;
                if (!z13 && (i47 == 0 || f12 <= 0.0f)) {
                    i10 = Math.max(i39, i31);
                    if (z16 && i44 != 1073741824) {
                        for (int i48 = 0; i48 < i38; i48++) {
                            View virtualChildAt3 = linearLayoutCompat.getVirtualChildAt(i48);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0450d0) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i43, 1073741824));
                            }
                        }
                    }
                } else {
                    float f13 = linearLayoutCompat.mWeightSum;
                    if (f13 > 0.0f) {
                        f12 = f13;
                    }
                    linearLayoutCompat.mTotalLength = 0;
                    int i49 = i39;
                    int i50 = i47;
                    int i51 = 0;
                    while (i51 < i38) {
                        View virtualChildAt4 = linearLayoutCompat.getVirtualChildAt(i51);
                        if (virtualChildAt4.getVisibility() == 8) {
                            i11 = i44;
                        } else {
                            C0450d0 c0450d03 = (C0450d0) virtualChildAt4.getLayoutParams();
                            float f14 = ((LinearLayout.LayoutParams) c0450d03).weight;
                            if (f14 > 0.0f) {
                                int i52 = (int) ((i50 * f14) / f12);
                                f12 -= f14;
                                i50 -= i52;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + ((LinearLayout.LayoutParams) c0450d03).leftMargin + ((LinearLayout.LayoutParams) c0450d03).rightMargin, ((LinearLayout.LayoutParams) c0450d03).width);
                                if (((LinearLayout.LayoutParams) c0450d03).height == 0) {
                                    i13 = 1073741824;
                                    if (i44 == 1073741824) {
                                        if (i52 <= 0) {
                                            i52 = 0;
                                        }
                                        virtualChildAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i52, 1073741824));
                                        i41 = View.combineMeasuredStates(i41, virtualChildAt4.getMeasuredState() & (-256));
                                    }
                                } else {
                                    i13 = 1073741824;
                                }
                                int measuredHeight2 = virtualChildAt4.getMeasuredHeight() + i52;
                                if (measuredHeight2 < 0) {
                                    measuredHeight2 = 0;
                                }
                                virtualChildAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i13));
                                i41 = View.combineMeasuredStates(i41, virtualChildAt4.getMeasuredState() & (-256));
                            }
                            int i53 = ((LinearLayout.LayoutParams) c0450d03).leftMargin + ((LinearLayout.LayoutParams) c0450d03).rightMargin;
                            int measuredWidth2 = virtualChildAt4.getMeasuredWidth() + i53;
                            i40 = Math.max(i40, measuredWidth2);
                            if (mode != 1073741824) {
                                i11 = i44;
                                i12 = -1;
                            } else {
                                i11 = i44;
                                i12 = -1;
                            }
                            i53 = measuredWidth2;
                            int max2 = Math.max(i49, i53);
                            if (z15 && ((LinearLayout.LayoutParams) c0450d03).width == i12) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int i54 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i54, linearLayoutCompat.getNextLocationOffset(virtualChildAt4) + virtualChildAt4.getMeasuredHeight() + i54 + ((LinearLayout.LayoutParams) c0450d03).topMargin + ((LinearLayout.LayoutParams) c0450d03).bottomMargin);
                            z15 = z2;
                            i49 = max2;
                        }
                        i51++;
                        i44 = i11;
                    }
                    linearLayoutCompat.mTotalLength = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.mTotalLength;
                    i10 = i49;
                }
                if (z15 || mode == 1073741824) {
                    i10 = i40;
                }
                linearLayoutCompat.setMeasuredDimension(View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + i10, linearLayoutCompat.getSuggestedMinimumWidth()), i4, i41), resolveSizeAndState);
                if (z14) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredWidth(), 1073741824);
                    int i55 = 0;
                    while (i55 < i38) {
                        View virtualChildAt5 = linearLayoutCompat.getVirtualChildAt(i55);
                        if (virtualChildAt5.getVisibility() != 8) {
                            C0450d0 c0450d04 = (C0450d0) virtualChildAt5.getLayoutParams();
                            if (((LinearLayout.LayoutParams) c0450d04).width == -1) {
                                int i56 = ((LinearLayout.LayoutParams) c0450d04).height;
                                ((LinearLayout.LayoutParams) c0450d04).height = virtualChildAt5.getMeasuredHeight();
                                linearLayoutCompat.measureChildWithMargins(virtualChildAt5, makeMeasureSpec, 0, i5, 0);
                                ((LinearLayout.LayoutParams) c0450d04).height = i56;
                            }
                        }
                        i55++;
                        linearLayoutCompat = this;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        if (this.mOrientation == 1) {
            layoutVertical(i4, i5, i10, i11);
        } else {
            layoutHorizontal(i4, i5, i10, i11);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        if (this.mOrientation == 1) {
            measureVertical(i4, i5);
        } else {
            measureHorizontal(i4, i5);
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.mBaselineAligned = z2;
    }

    public void setBaselineAlignedChildIndex(int i4) {
        if (i4 >= 0 && i4 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i4;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        boolean z2 = false;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        if (drawable == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setDividerPadding(int i4) {
        this.mDividerPadding = i4;
    }

    public void setGravity(int i4) {
        if (this.mGravity != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.mGravity = i4;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i4) {
        int i5 = i4 & 8388615;
        int i10 = this.mGravity;
        if ((8388615 & i10) != i5) {
            this.mGravity = i5 | ((-8388616) & i10);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.mUseLargestChild = z2;
    }

    public void setOrientation(int i4) {
        if (this.mOrientation != i4) {
            this.mOrientation = i4;
            requestLayout();
        }
    }

    public void setShowDividers(int i4) {
        if (i4 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i4;
    }

    public void setVerticalGravity(int i4) {
        int i5 = i4 & 112;
        int i10 = this.mGravity;
        if ((i10 & 112) != i5) {
            this.mGravity = i5 | (i10 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f5) {
        this.mWeightSum = Math.max(0.0f, f5);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = aj.a.oscar;
        C1915c victor = C1915c.victor(context, attributeSet, iArr, i4);
        s1.au.mike(this, context, iArr, attributeSet, (TypedArray) victor.red, i4);
        TypedArray typedArray = (TypedArray) victor.red;
        int i5 = typedArray.getInt(1, -1);
        if (i5 >= 0) {
            setOrientation(i5);
        }
        int i10 = typedArray.getInt(0, -1);
        if (i10 >= 0) {
            setGravity(i10);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.mWeightSum = typedArray.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = typedArray.getInt(3, -1);
        this.mUseLargestChild = typedArray.getBoolean(7, false);
        setDividerDrawable(victor.oscar(5));
        this.mShowDividers = typedArray.getInt(8, 0);
        this.mDividerPadding = typedArray.getDimensionPixelSize(6, 0);
        victor.xray();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.appcompat.widget.d0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.appcompat.widget.d0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public C0450d0 generateDefaultLayoutParams() {
        int i4 = this.mOrientation;
        if (i4 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i4 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.d0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public C0450d0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.appcompat.widget.d0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.appcompat.widget.d0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.appcompat.widget.d0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public C0450d0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0450d0) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }
}
