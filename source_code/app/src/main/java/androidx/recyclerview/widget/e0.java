package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class e0 implements Runnable {
    public int alpha;
    public int purple;
    public OverScroller red;
    public Interpolator silver;
    public boolean teal;
    public boolean white;
    public final /* synthetic */ RecyclerView yellow;

    public e0(RecyclerView recyclerView) {
        this.yellow = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.silver = interpolator;
        this.teal = false;
        this.white = false;
        this.red = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void alpha(int i4, int i5) {
        RecyclerView recyclerView = this.yellow;
        recyclerView.setScrollState(2);
        this.purple = 0;
        this.alpha = 0;
        Interpolator interpolator = this.silver;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.silver = interpolator2;
            this.red = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.red.fling(0, 0, i4, i5, RecyclerView.UNDEFINED_DURATION, LottieConstants.IterateForever, RecyclerView.UNDEFINED_DURATION, LottieConstants.IterateForever);
        bravo();
    }

    public final void bravo() {
        if (this.teal) {
            this.white = true;
            return;
        }
        RecyclerView recyclerView = this.yellow;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = s1.au.alpha;
        recyclerView.postOnAnimation(this);
    }

    public final void charlie(int i4, int i5, Interpolator interpolator, int i10) {
        boolean z2;
        int height;
        RecyclerView recyclerView = this.yellow;
        if (i10 == Integer.MIN_VALUE) {
            int abs = Math.abs(i4);
            int abs2 = Math.abs(i5);
            if (abs > abs2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z2) {
                abs = abs2;
            }
            i10 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i11 = i10;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.silver != interpolator) {
            this.silver = interpolator;
            this.red = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.purple = 0;
        this.alpha = 0;
        recyclerView.setScrollState(2);
        this.red.startScroll(0, 0, i4, i5, i11);
        bravo();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        int i5;
        int i10;
        int i11;
        boolean awakenScrollBars;
        boolean z2;
        boolean z10;
        boolean z11;
        int i12;
        RecyclerView recyclerView = this.yellow;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.red.abortAnimation();
            return;
        }
        this.white = false;
        this.teal = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.red;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i13 = currX - this.alpha;
            int i14 = currY - this.purple;
            this.alpha = currX;
            this.purple = currY;
            int consumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i13);
            int consumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i14);
            int[] iArr = recyclerView.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                int[] iArr2 = recyclerView.mReusableIntPair;
                consumeFlingInHorizontalStretch -= iArr2[0];
                consumeFlingInVerticalStretch -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
            }
            if (recyclerView.mAdapter != null) {
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                int[] iArr4 = recyclerView.mReusableIntPair;
                int i15 = iArr4[0];
                int i16 = iArr4[1];
                int i17 = consumeFlingInHorizontalStretch - i15;
                int i18 = consumeFlingInVerticalStretch - i16;
                ao aoVar = recyclerView.mLayout.echo;
                if (aoVar != null && !aoVar.isPendingInitialRun() && aoVar.isRunning()) {
                    int bravo = recyclerView.mState.bravo();
                    if (bravo == 0) {
                        aoVar.stop();
                    } else if (aoVar.getTargetPosition() >= bravo) {
                        aoVar.setTargetPosition(bravo - 1);
                        aoVar.onAnimation(i15, i16);
                    } else {
                        aoVar.onAnimation(i15, i16);
                    }
                }
                i4 = i17;
                i10 = i15;
                i5 = i18;
                i11 = i16;
            } else {
                i4 = consumeFlingInHorizontalStretch;
                i5 = consumeFlingInVerticalStretch;
                i10 = 0;
                i11 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i10, i11, i4, i5, null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i19 = i4 - iArr6[0];
            int i20 = i5 - iArr6[1];
            if (i10 != 0 || i11 != 0) {
                recyclerView.dispatchOnScrolled(i10, i11);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!overScroller.isFinished() && ((!z2 && i19 == 0) || (!z10 && i20 == 0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            ao aoVar2 = recyclerView.mLayout.echo;
            if ((aoVar2 == null || !aoVar2.isPendingInitialRun()) && z11) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i19 < 0) {
                        i12 = -currVelocity;
                    } else if (i19 > 0) {
                        i12 = currVelocity;
                    } else {
                        i12 = 0;
                    }
                    if (i20 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i20 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i12, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    ae aeVar = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = aeVar.charlie;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    aeVar.delta = 0;
                }
            } else {
                bravo();
                ag agVar = recyclerView.mGapWorker;
                if (agVar != null) {
                    agVar.alpha(recyclerView, i10, i11);
                }
            }
        }
        ao aoVar3 = recyclerView.mLayout.echo;
        if (aoVar3 != null && aoVar3.isPendingInitialRun()) {
            aoVar3.onAnimation(0, 0);
        }
        this.teal = false;
        if (this.white) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = s1.au.alpha;
            recyclerView.postOnAnimation(this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        }
    }
}
