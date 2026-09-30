package ja.burhanrashid52.photoeditor;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.clevertap.android.sdk.leanplum.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 92\u00020\u0001:\u00039:;B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH\u0002J\b\u0010%\u001a\u00020\u0010H\u0002J\u0006\u0010&\u001a\u00020\u0015J\u0006\u0010'\u001a\u00020\u0010J\u0006\u0010(\u001a\u00020\u0010J\u0006\u0010)\u001a\u00020 J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010+\u001a\u00020\u0010J\b\u0010,\u001a\u00020\u0010H\u0002J\u0006\u0010-\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010J\u0006\u0010/\u001a\u00020\u0010J\u0006\u00100\u001a\u00020 J\u0016\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u000eJ\b\u00105\u001a\u000206H\u0002J\u0018\u00107\u001a\u0002062\u0006\u00102\u001a\u0002032\u0006\u00108\u001a\u00020\u000eH\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lja/burhanrashid52/photoeditor/ScaleGestureDetector;", "", "mListener", "Lja/burhanrashid52/photoeditor/ScaleGestureDetector$OnScaleGestureListener;", "(Lja/burhanrashid52/photoeditor/ScaleGestureDetector$OnScaleGestureListener;)V", "<set-?>", "", "isInProgress", "()Z", "mActive0MostRecent", "mActiveId0", "", "mActiveId1", "mCurrEvent", "Landroid/view/MotionEvent;", "mCurrFingerDiffX", "", "mCurrFingerDiffY", "mCurrLen", "mCurrPressure", "mCurrSpanVector", "Lja/burhanrashid52/photoeditor/Vector2D;", "mFocusX", "mFocusY", "mInvalidGesture", "mPrevEvent", "mPrevFingerDiffX", "mPrevFingerDiffY", "mPrevLen", "mPrevPressure", "mScaleFactor", "mTimeDelta", "", "findNewActiveIndex", "ev", "otherActiveId", "removedPointerIndex", "getCurrentSpan", "getCurrentSpanVector", "getCurrentSpanX", "getCurrentSpanY", "getEventTime", "getFocusX", "getFocusY", "getPreviousSpan", "getPreviousSpanX", "getPreviousSpanY", "getScaleFactor", "getTimeDelta", "onTouchEvent", "view", "Landroid/view/View;", Constants.CHARGED_EVENT_PARAM, "reset", "", "setContext", "curr", "Companion", "OnScaleGestureListener", "SimpleOnScaleGestureListener", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScaleGestureDetector {
    private static final float PRESSURE_THRESHOLD = 0.67f;

    @NotNull
    private static final String TAG = "ScaleGestureDetector";
    private boolean isInProgress;
    private boolean mActive0MostRecent;
    private int mActiveId0;
    private int mActiveId1;

    @Nullable
    private MotionEvent mCurrEvent;
    private float mCurrFingerDiffX;
    private float mCurrFingerDiffY;
    private float mCurrLen;
    private float mCurrPressure;

    @NotNull
    private final Vector2D mCurrSpanVector;
    private float mFocusX;
    private float mFocusY;
    private boolean mInvalidGesture;

    @NotNull
    private final OnScaleGestureListener mListener;

    @Nullable
    private MotionEvent mPrevEvent;
    private float mPrevFingerDiffX;
    private float mPrevFingerDiffY;
    private float mPrevLen;
    private float mPrevPressure;
    private float mScaleFactor;
    private long mTimeDelta;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lja/burhanrashid52/photoeditor/ScaleGestureDetector$OnScaleGestureListener;", "", "onScale", "", "view", "Landroid/view/View;", "detector", "Lja/burhanrashid52/photoeditor/ScaleGestureDetector;", "onScaleBegin", "onScaleEnd", "", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface OnScaleGestureListener {
        boolean onScale(@NotNull View view, @NotNull ScaleGestureDetector detector);

        boolean onScaleBegin(@NotNull View view, @NotNull ScaleGestureDetector detector);

        void onScaleEnd(@NotNull View view, @NotNull ScaleGestureDetector detector);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lja/burhanrashid52/photoeditor/ScaleGestureDetector$SimpleOnScaleGestureListener;", "Lja/burhanrashid52/photoeditor/ScaleGestureDetector$OnScaleGestureListener;", "()V", "onScale", "", "view", "Landroid/view/View;", "detector", "Lja/burhanrashid52/photoeditor/ScaleGestureDetector;", "onScaleBegin", "onScaleEnd", "", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static class SimpleOnScaleGestureListener implements OnScaleGestureListener {
        @Override // ja.burhanrashid52.photoeditor.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(@NotNull View view, @NotNull ScaleGestureDetector detector) {
            Intrinsics.echo(view, "view");
            Intrinsics.echo(detector, "detector");
            return false;
        }

        @Override // ja.burhanrashid52.photoeditor.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(@NotNull View view, @NotNull ScaleGestureDetector detector) {
            Intrinsics.echo(view, "view");
            Intrinsics.echo(detector, "detector");
            return true;
        }

        @Override // ja.burhanrashid52.photoeditor.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(@NotNull View view, @NotNull ScaleGestureDetector detector) {
            Intrinsics.echo(view, "view");
            Intrinsics.echo(detector, "detector");
        }
    }

    public ScaleGestureDetector(@NotNull OnScaleGestureListener mListener) {
        Intrinsics.echo(mListener, "mListener");
        this.mListener = mListener;
        this.mCurrSpanVector = new Vector2D();
    }

    private final int findNewActiveIndex(MotionEvent ev, int otherActiveId, int removedPointerIndex) {
        int pointerCount = ev.getPointerCount();
        int findPointerIndex = ev.findPointerIndex(otherActiveId);
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (i4 != removedPointerIndex && i4 != findPointerIndex) {
                return i4;
            }
        }
        return -1;
    }

    private final float getCurrentSpan() {
        if (this.mCurrLen == -1.0f) {
            float f5 = this.mCurrFingerDiffX;
            float f10 = this.mCurrFingerDiffY;
            this.mCurrLen = (float) Math.sqrt((f10 * f10) + (f5 * f5));
        }
        return this.mCurrLen;
    }

    private final float getPreviousSpan() {
        if (this.mPrevLen == -1.0f) {
            float f5 = this.mPrevFingerDiffX;
            float f10 = this.mPrevFingerDiffY;
            this.mPrevLen = (float) Math.sqrt((f10 * f10) + (f5 * f5));
        }
        return this.mPrevLen;
    }

    private final void reset() {
        MotionEvent motionEvent = this.mPrevEvent;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.mPrevEvent = null;
        MotionEvent motionEvent2 = this.mCurrEvent;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.mCurrEvent = null;
        this.isInProgress = false;
        this.mActiveId0 = -1;
        this.mActiveId1 = -1;
        this.mInvalidGesture = false;
    }

    private final void setContext(View view, MotionEvent curr) {
        MotionEvent motionEvent = this.mCurrEvent;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.mCurrEvent = MotionEvent.obtain(curr);
        this.mCurrLen = -1.0f;
        this.mPrevLen = -1.0f;
        this.mScaleFactor = -1.0f;
        this.mCurrSpanVector.set(0.0f, 0.0f);
        MotionEvent motionEvent2 = this.mPrevEvent;
        if (motionEvent2 != null) {
            Intrinsics.checkNotNull(motionEvent2);
            int findPointerIndex = motionEvent2.findPointerIndex(this.mActiveId0);
            int findPointerIndex2 = motionEvent2.findPointerIndex(this.mActiveId1);
            int findPointerIndex3 = curr.findPointerIndex(this.mActiveId0);
            int findPointerIndex4 = curr.findPointerIndex(this.mActiveId1);
            if (findPointerIndex >= 0 && findPointerIndex2 >= 0 && findPointerIndex3 >= 0 && findPointerIndex4 >= 0) {
                float x4 = motionEvent2.getX(findPointerIndex);
                float y10 = motionEvent2.getY(findPointerIndex);
                float x5 = motionEvent2.getX(findPointerIndex2);
                float y11 = motionEvent2.getY(findPointerIndex2);
                float x10 = curr.getX(findPointerIndex3);
                float y12 = curr.getY(findPointerIndex3);
                float x11 = curr.getX(findPointerIndex4) - x10;
                float y13 = curr.getY(findPointerIndex4) - y12;
                this.mCurrSpanVector.set(x11, y13);
                this.mPrevFingerDiffX = x5 - x4;
                this.mPrevFingerDiffY = y11 - y10;
                this.mCurrFingerDiffX = x11;
                this.mCurrFingerDiffY = y13;
                this.mFocusX = (x11 * 0.5f) + x10;
                this.mFocusY = (y13 * 0.5f) + y12;
                this.mTimeDelta = curr.getEventTime() - motionEvent2.getEventTime();
                this.mCurrPressure = curr.getPressure(findPointerIndex4) + curr.getPressure(findPointerIndex3);
                this.mPrevPressure = motionEvent2.getPressure(findPointerIndex2) + motionEvent2.getPressure(findPointerIndex);
                return;
            }
            this.mInvalidGesture = true;
            Log.e(TAG, "Invalid MotionEvent stream detected.", new Throwable());
            if (this.isInProgress) {
                this.mListener.onScaleEnd(view, this);
            }
        }
    }

    @NotNull
    /* renamed from: getCurrentSpanVector, reason: from getter */
    public final Vector2D getMCurrSpanVector() {
        return this.mCurrSpanVector;
    }

    /* renamed from: getCurrentSpanX, reason: from getter */
    public final float getMCurrFingerDiffX() {
        return this.mCurrFingerDiffX;
    }

    /* renamed from: getCurrentSpanY, reason: from getter */
    public final float getMCurrFingerDiffY() {
        return this.mCurrFingerDiffY;
    }

    public final long getEventTime() {
        MotionEvent motionEvent = this.mCurrEvent;
        if (motionEvent != null) {
            return motionEvent.getEventTime();
        }
        return 0L;
    }

    /* renamed from: getFocusX, reason: from getter */
    public final float getMFocusX() {
        return this.mFocusX;
    }

    /* renamed from: getFocusY, reason: from getter */
    public final float getMFocusY() {
        return this.mFocusY;
    }

    /* renamed from: getPreviousSpanX, reason: from getter */
    public final float getMPrevFingerDiffX() {
        return this.mPrevFingerDiffX;
    }

    /* renamed from: getPreviousSpanY, reason: from getter */
    public final float getMPrevFingerDiffY() {
        return this.mPrevFingerDiffY;
    }

    public final float getScaleFactor() {
        if (this.mScaleFactor == -1.0f) {
            this.mScaleFactor = getCurrentSpan() / getPreviousSpan();
        }
        return this.mScaleFactor;
    }

    /* renamed from: getTimeDelta, reason: from getter */
    public final long getMTimeDelta() {
        return this.mTimeDelta;
    }

    /* renamed from: isInProgress, reason: from getter */
    public final boolean getIsInProgress() {
        return this.isInProgress;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(@NotNull View view, @NotNull MotionEvent event) {
        MotionEvent motionEvent;
        Intrinsics.echo(view, "view");
        Intrinsics.echo(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        boolean z2 = false;
        if (this.mInvalidGesture) {
            return false;
        }
        if (!this.isInProgress) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 5) {
                        MotionEvent motionEvent2 = this.mPrevEvent;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.mPrevEvent = MotionEvent.obtain(event);
                        this.mTimeDelta = 0L;
                        int actionIndex = event.getActionIndex();
                        int findPointerIndex = event.findPointerIndex(this.mActiveId0);
                        int pointerId = event.getPointerId(actionIndex);
                        this.mActiveId1 = pointerId;
                        if (findPointerIndex < 0 || findPointerIndex == actionIndex) {
                            this.mActiveId0 = event.getPointerId(findNewActiveIndex(event, pointerId, -1));
                        }
                        this.mActive0MostRecent = false;
                        setContext(view, event);
                        this.isInProgress = this.mListener.onScaleBegin(view, this);
                        return true;
                    }
                } else {
                    reset();
                    return true;
                }
            } else {
                this.mActiveId0 = event.getPointerId(0);
                this.mActive0MostRecent = true;
                return true;
            }
        } else if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            int pointerCount = event.getPointerCount();
                            int actionIndex2 = event.getActionIndex();
                            int pointerId2 = event.getPointerId(actionIndex2);
                            if (pointerCount > 2) {
                                int i4 = this.mActiveId0;
                                if (pointerId2 == i4) {
                                    int findNewActiveIndex = findNewActiveIndex(event, this.mActiveId1, actionIndex2);
                                    if (findNewActiveIndex >= 0) {
                                        this.mListener.onScaleEnd(view, this);
                                        this.mActiveId0 = event.getPointerId(findNewActiveIndex);
                                        this.mActive0MostRecent = true;
                                        this.mPrevEvent = MotionEvent.obtain(event);
                                        setContext(view, event);
                                        this.isInProgress = this.mListener.onScaleBegin(view, this);
                                        motionEvent = this.mPrevEvent;
                                        if (motionEvent != null) {
                                            motionEvent.recycle();
                                        }
                                        this.mPrevEvent = MotionEvent.obtain(event);
                                        setContext(view, event);
                                    }
                                    z2 = true;
                                    motionEvent = this.mPrevEvent;
                                    if (motionEvent != null) {
                                    }
                                    this.mPrevEvent = MotionEvent.obtain(event);
                                    setContext(view, event);
                                } else {
                                    if (pointerId2 == this.mActiveId1) {
                                        int findNewActiveIndex2 = findNewActiveIndex(event, i4, actionIndex2);
                                        if (findNewActiveIndex2 >= 0) {
                                            this.mListener.onScaleEnd(view, this);
                                            this.mActiveId1 = event.getPointerId(findNewActiveIndex2);
                                            this.mActive0MostRecent = false;
                                            this.mPrevEvent = MotionEvent.obtain(event);
                                            setContext(view, event);
                                            this.isInProgress = this.mListener.onScaleBegin(view, this);
                                        }
                                        z2 = true;
                                    }
                                    motionEvent = this.mPrevEvent;
                                    if (motionEvent != null) {
                                    }
                                    this.mPrevEvent = MotionEvent.obtain(event);
                                    setContext(view, event);
                                }
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                setContext(view, event);
                                int i5 = this.mActiveId0;
                                if (pointerId2 == i5) {
                                    i5 = this.mActiveId1;
                                }
                                int findPointerIndex2 = event.findPointerIndex(i5);
                                this.mFocusX = event.getX(findPointerIndex2);
                                this.mFocusY = event.getY(findPointerIndex2);
                                this.mListener.onScaleEnd(view, this);
                                reset();
                                this.mActiveId0 = i5;
                                this.mActive0MostRecent = true;
                                return true;
                            }
                        }
                    } else {
                        this.mListener.onScaleEnd(view, this);
                        int i10 = this.mActiveId0;
                        int i11 = this.mActiveId1;
                        reset();
                        this.mPrevEvent = MotionEvent.obtain(event);
                        if (!this.mActive0MostRecent) {
                            i10 = i11;
                        }
                        this.mActiveId0 = i10;
                        this.mActiveId1 = event.getPointerId(event.getActionIndex());
                        this.mActive0MostRecent = false;
                        if (event.findPointerIndex(this.mActiveId0) < 0 || this.mActiveId0 == this.mActiveId1) {
                            this.mActiveId0 = event.getPointerId(findNewActiveIndex(event, this.mActiveId1, -1));
                        }
                        setContext(view, event);
                        this.isInProgress = this.mListener.onScaleBegin(view, this);
                        return true;
                    }
                } else {
                    this.mListener.onScaleEnd(view, this);
                    reset();
                    return true;
                }
            } else {
                setContext(view, event);
                if (this.mCurrPressure / this.mPrevPressure > PRESSURE_THRESHOLD && this.mListener.onScale(view, this)) {
                    MotionEvent motionEvent3 = this.mPrevEvent;
                    if (motionEvent3 != null) {
                        motionEvent3.recycle();
                    }
                    this.mPrevEvent = MotionEvent.obtain(event);
                }
            }
        } else {
            reset();
            return true;
        }
        return true;
    }
}
