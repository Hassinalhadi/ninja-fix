package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class a0 {
    private L mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final Y mRecyclingAction;
    private boolean mRunning;
    private boolean mStarted;
    private int mTargetPosition = -1;
    private View mTargetView;

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.recyclerview.widget.Y, java.lang.Object] */
    public a0() {
        ?? obj = new Object();
        obj.delta = -1;
        obj.foxtrot = false;
        obj.golf = 0;
        obj.alpha = 0;
        obj.bravo = 0;
        obj.charlie = RecyclerView.UNDEFINED_DURATION;
        obj.echo = null;
        this.mRecyclingAction = obj;
    }

    public PointF computeScrollVectorForPosition(int i4) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof Z) {
            return ((Z) layoutManager).alpha(i4);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + Z.class.getCanonicalName());
        return null;
    }

    public View findViewByPosition(int i4) {
        return this.mRecyclerView.mLayout.romeo(i4);
    }

    public int getChildCount() {
        return this.mRecyclerView.mLayout.whiskey();
    }

    public int getChildPosition(View view) {
        return this.mRecyclerView.getChildLayoutPosition(view);
    }

    public L getLayoutManager() {
        return this.mLayoutManager;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    @Deprecated
    public void instantScrollToPosition(int i4) {
        this.mRecyclerView.scrollToPosition(i4);
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void normalize(PointF pointF) {
        float f5 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f5 * f5));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public void onAnimation(int i4, int i5) {
        PointF computeScrollVectorForPosition;
        RecyclerView recyclerView = this.mRecyclerView;
        if (this.mTargetPosition == -1 || recyclerView == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f5 = computeScrollVectorForPosition.x;
            if (f5 != 0.0f || computeScrollVectorForPosition.y != 0.0f) {
                recyclerView.scrollStep((int) Math.signum(f5), (int) Math.signum(computeScrollVectorForPosition.y), null);
            }
        }
        boolean z2 = false;
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                this.mRecyclingAction.alpha(recyclerView);
                stop();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i4, i5, recyclerView.mState, this.mRecyclingAction);
            Y y10 = this.mRecyclingAction;
            if (y10.delta >= 0) {
                z2 = true;
            }
            y10.alpha(recyclerView);
            if (z2 && this.mRunning) {
                this.mPendingInitialRun = true;
                recyclerView.mViewFlinger.bravo();
            }
        }
    }

    public void onChildAttachedToWindow(View view) {
        if (getChildPosition(view) == getTargetPosition()) {
            this.mTargetView = view;
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "smooth scroll target view has been attached");
            }
        }
    }

    public abstract void onSeekTargetStep(int i4, int i5, b0 b0Var, Y y10);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, b0 b0Var, Y y10);

    public void setTargetPosition(int i4) {
        this.mTargetPosition = i4;
    }

    public void start(RecyclerView recyclerView, L l10) {
        e0 e0Var = recyclerView.mViewFlinger;
        e0Var.yellow.removeCallbacks(e0Var);
        e0Var.red.abortAnimation();
        if (this.mStarted) {
            Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = l10;
        int i4 = this.mTargetPosition;
        if (i4 != -1) {
            recyclerView.mState.alpha = i4;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.bravo();
            this.mStarted = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final void stop() {
        if (!this.mRunning) {
            return;
        }
        this.mRunning = false;
        onStop();
        this.mRecyclerView.mState.alpha = -1;
        this.mTargetView = null;
        this.mTargetPosition = -1;
        this.mPendingInitialRun = false;
        L l10 = this.mLayoutManager;
        if (l10.echo == this) {
            l10.echo = null;
        }
        this.mLayoutManager = null;
        this.mRecyclerView = null;
    }
}
