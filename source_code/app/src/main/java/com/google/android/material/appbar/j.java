package com.google.android.material.appbar;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class j extends l {
    public D2.d alpha;
    public OverScroller purple;
    public boolean red;
    public int silver;
    public int teal;
    public int white;
    public VelocityTracker yellow;

    public abstract int echo();

    public abstract int foxtrot(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i10);

    public final void golf(CoordinatorLayout coordinatorLayout, View view, int i4) {
        foxtrot(coordinatorLayout, view, i4, RecyclerView.UNDEFINED_DURATION, LottieConstants.IterateForever);
    }

    @Override // androidx.coordinatorlayout.widget.c
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2;
        View view2;
        int findPointerIndex;
        if (this.white < 0) {
            this.white = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.red) {
            int i4 = this.silver;
            if (i4 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i4)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.teal) > this.white) {
                this.teal = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.silver = -1;
            int x4 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).e;
            if ((weakReference == null || ((view2 = (View) weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(-1))) && coordinatorLayout.isPointInChildBounds(view, x4, y11)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.red = z2;
            if (z2) {
                this.teal = y11;
                this.silver = motionEvent.getPointerId(0);
                if (this.yellow == null) {
                    this.yellow = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.purple;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.purple.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.yellow;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6  */
    @Override // androidx.coordinatorlayout.widget.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int i4;
        j jVar = this;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        if (motionEvent.getActionIndex() == 0) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        jVar.silver = motionEvent.getPointerId(i4);
                        jVar.teal = (int) (motionEvent.getY(i4) + 0.5f);
                    }
                }
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(jVar.silver);
                if (findPointerIndex != -1) {
                    int y10 = (int) motionEvent.getY(findPointerIndex);
                    int i5 = jVar.teal - y10;
                    jVar.teal = y10;
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    jVar.foxtrot(coordinatorLayout, view, jVar.echo() - i5, appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange()), 0);
                }
                return false;
            }
            z2 = false;
            velocityTracker2 = jVar.yellow;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (!jVar.red || z2) {
                return true;
            }
            return false;
        }
        VelocityTracker velocityTracker3 = jVar.yellow;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            jVar.yellow.computeCurrentVelocity(1000);
            float yVelocity = jVar.yellow.getYVelocity(jVar.silver);
            AppBarLayout appBarLayout2 = (AppBarLayout) view;
            int i10 = -appBarLayout2.getTotalScrollRange();
            Runnable runnable = jVar.alpha;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                jVar.alpha = null;
            }
            if (jVar.purple == null) {
                jVar.purple = new OverScroller(view.getContext());
            }
            jVar.purple.fling(0, jVar.getTopAndBottomOffset(), 0, Math.round(yVelocity), 0, 0, i10, 0);
            if (jVar.purple.computeScrollOffset()) {
                D2.d dVar = new D2.d(this, coordinatorLayout, view, 13, false);
                jVar = this;
                jVar.alpha = dVar;
                view.postOnAnimation(dVar);
            } else {
                ((AppBarLayout.BaseBehavior) jVar).mike(coordinatorLayout, appBarLayout2);
                if (appBarLayout2.e) {
                    appBarLayout2.foxtrot(appBarLayout2.golf(AppBarLayout.BaseBehavior.juliet(coordinatorLayout)));
                }
            }
            z2 = true;
            jVar.red = false;
            jVar.silver = -1;
            velocityTracker = jVar.yellow;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                jVar.yellow = null;
            }
            velocityTracker2 = jVar.yellow;
            if (velocityTracker2 != null) {
            }
            if (!jVar.red) {
            }
            return true;
        }
        z2 = false;
        jVar.red = false;
        jVar.silver = -1;
        velocityTracker = jVar.yellow;
        if (velocityTracker != null) {
        }
        velocityTracker2 = jVar.yellow;
        if (velocityTracker2 != null) {
        }
        if (!jVar.red) {
        }
        return true;
    }
}
