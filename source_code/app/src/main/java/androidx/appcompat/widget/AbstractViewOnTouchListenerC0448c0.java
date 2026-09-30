package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: androidx.appcompat.widget.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractViewOnTouchListenerC0448c0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public int f2872a;
    public final float alpha;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2873b = new int[2];
    public final int purple;
    public final int red;
    public final View silver;
    public RunnableC0446b0 teal;
    public RunnableC0446b0 white;
    public boolean yellow;

    public AbstractViewOnTouchListenerC0448c0(View view) {
        this.silver = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.alpha = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.purple = tapTimeout;
        this.red = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void alpha() {
        RunnableC0446b0 runnableC0446b0 = this.white;
        View view = this.silver;
        if (runnableC0446b0 != null) {
            view.removeCallbacks(runnableC0446b0);
        }
        RunnableC0446b0 runnableC0446b02 = this.teal;
        if (runnableC0446b02 != null) {
            view.removeCallbacks(runnableC0446b02);
        }
    }

    public abstract ao.ab bravo();

    public abstract boolean charlie();

    public boolean delta() {
        ao.ab bravo = bravo();
        if (bravo != null && bravo.alpha()) {
            bravo.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        Z juliet;
        boolean z10;
        boolean z11 = this.yellow;
        View view2 = this.silver;
        if (z11) {
            ao.ab bravo = bravo();
            if (bravo != null && bravo.alpha() && (juliet = bravo.juliet()) != null && juliet.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f2873b;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                juliet.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean bravo2 = juliet.bravo(obtainNoHistory, this.f2872a);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1 && actionMasked != 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (bravo2) {
                }
            }
            if (delta()) {
                z2 = false;
            }
            z2 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f2872a);
                            if (findPointerIndex >= 0) {
                                float x4 = motionEvent.getX(findPointerIndex);
                                float y10 = motionEvent.getY(findPointerIndex);
                                float f5 = this.alpha;
                                float f10 = -f5;
                                if (x4 < f10 || y10 < f10 || x4 >= (view2.getRight() - view2.getLeft()) + f5 || y10 >= (view2.getBottom() - view2.getTop()) + f5) {
                                    alpha();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (charlie()) {
                                        z2 = true;
                                        if (z2) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    alpha();
                } else {
                    this.f2872a = motionEvent.getPointerId(0);
                    if (this.teal == null) {
                        this.teal = new RunnableC0446b0(this, 0);
                    }
                    view2.postDelayed(this.teal, this.purple);
                    if (this.white == null) {
                        this.white = new RunnableC0446b0(this, 1);
                    }
                    view2.postDelayed(this.white, this.red);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.yellow = z2;
        if (z2 || z11) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.yellow = false;
        this.f2872a = -1;
        RunnableC0446b0 runnableC0446b0 = this.teal;
        if (runnableC0446b0 != null) {
            this.silver.removeCallbacks(runnableC0446b0);
        }
    }
}
