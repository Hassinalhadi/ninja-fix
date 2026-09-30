package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes3.dex */
public class ao extends a0 {
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    private final DisplayMetrics mDisplayMetrics;
    private float mMillisPerPixel;

    @SuppressLint({"UnknownNullness"})
    protected PointF mTargetVector;
    protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
    private boolean mHasCalculatedMillisPerPixel = false;
    protected int mInterimTargetDx = 0;
    protected int mInterimTargetDy = 0;

    public ao(Context context) {
        this.mDisplayMetrics = context.getResources().getDisplayMetrics();
    }

    public int calculateDtToFit(int i4, int i5, int i10, int i11, int i12) {
        if (i12 != -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return i11 - i5;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i13 = i10 - i4;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i11 - i5;
            if (i14 < 0) {
                return i14;
            }
            return 0;
        }
        return i10 - i4;
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDxToMakeVisible(View view, int i4) {
        L layoutManager = getLayoutManager();
        if (layoutManager != null && layoutManager.echo()) {
            M m4 = (M) view.getLayoutParams();
            return calculateDtToFit(L.azure(view) - ((ViewGroup.MarginLayoutParams) m4).leftMargin, L.blue(view) + ((ViewGroup.MarginLayoutParams) m4).rightMargin, layoutManager.emerald(), layoutManager.november - layoutManager.fuchsia(), i4);
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDyToMakeVisible(View view, int i4) {
        L layoutManager = getLayoutManager();
        if (layoutManager != null && layoutManager.foxtrot()) {
            M m4 = (M) view.getLayoutParams();
            return calculateDtToFit(L.bronze(view) - ((ViewGroup.MarginLayoutParams) m4).topMargin, L.zulu(view) + ((ViewGroup.MarginLayoutParams) m4).bottomMargin, layoutManager.gold(), layoutManager.oscar - layoutManager.cyan(), i4);
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int calculateTimeForDeceleration(int i4) {
        return (int) Math.ceil(calculateTimeForScrolling(i4) / 0.3356d);
    }

    public int calculateTimeForScrolling(int i4) {
        float abs = Math.abs(i4);
        if (!this.mHasCalculatedMillisPerPixel) {
            this.mMillisPerPixel = calculateSpeedPerPixel(this.mDisplayMetrics);
            this.mHasCalculatedMillisPerPixel = true;
        }
        return (int) Math.ceil(abs * this.mMillisPerPixel);
    }

    public int getHorizontalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF != null) {
            float f5 = pointF.x;
            if (f5 != 0.0f) {
                if (f5 > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public int getVerticalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF != null) {
            float f5 = pointF.y;
            if (f5 != 0.0f) {
                if (f5 > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.a0
    @SuppressLint({"UnknownNullness"})
    public void onSeekTargetStep(int i4, int i5, b0 b0Var, Y y10) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        int i10 = this.mInterimTargetDx;
        int i11 = i10 - i4;
        int i12 = 0;
        if (i10 * i11 <= 0) {
            i11 = 0;
        }
        this.mInterimTargetDx = i11;
        int i13 = this.mInterimTargetDy;
        int i14 = i13 - i5;
        if (i13 * i14 > 0) {
            i12 = i14;
        }
        this.mInterimTargetDy = i12;
        if (i11 == 0 && i12 == 0) {
            updateActionForInterimTarget(y10);
        }
    }

    @Override // androidx.recyclerview.widget.a0
    public void onStart() {
    }

    @Override // androidx.recyclerview.widget.a0
    public void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    @Override // androidx.recyclerview.widget.a0
    @SuppressLint({"UnknownNullness"})
    public void onTargetFound(View view, b0 b0Var, Y y10) {
        int calculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
        int calculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
        int calculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((calculateDyToMakeVisible * calculateDyToMakeVisible) + (calculateDxToMakeVisible * calculateDxToMakeVisible)));
        if (calculateTimeForDeceleration > 0) {
            DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
            y10.alpha = -calculateDxToMakeVisible;
            y10.bravo = -calculateDyToMakeVisible;
            y10.charlie = calculateTimeForDeceleration;
            y10.echo = decelerateInterpolator;
            y10.foxtrot = true;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void updateActionForInterimTarget(Y y10) {
        PointF computeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (computeScrollVectorForPosition != null && (computeScrollVectorForPosition.x != 0.0f || computeScrollVectorForPosition.y != 0.0f)) {
            normalize(computeScrollVectorForPosition);
            this.mTargetVector = computeScrollVectorForPosition;
            this.mInterimTargetDx = (int) (computeScrollVectorForPosition.x * 10000.0f);
            this.mInterimTargetDy = (int) (computeScrollVectorForPosition.y * 10000.0f);
            int calculateTimeForScrolling = calculateTimeForScrolling(10000);
            int i4 = (int) (this.mInterimTargetDx * TARGET_SEEK_EXTRA_SCROLL_RATIO);
            int i5 = (int) (this.mInterimTargetDy * TARGET_SEEK_EXTRA_SCROLL_RATIO);
            int i10 = (int) (calculateTimeForScrolling * TARGET_SEEK_EXTRA_SCROLL_RATIO);
            LinearInterpolator linearInterpolator = this.mLinearInterpolator;
            y10.alpha = i4;
            y10.bravo = i5;
            y10.charlie = i10;
            y10.echo = linearInterpolator;
            y10.foxtrot = true;
            return;
        }
        y10.delta = getTargetPosition();
        stop();
    }
}
