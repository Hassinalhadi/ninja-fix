package ja.burhanrashid52.photoeditor;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.clevertap.android.sdk.leanplum.Constants;
import ja.burhanrashid52.photoeditor.ScaleGestureDetector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 52\u00020\u0001:\u000656789:B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\tH\u0002J\"\u0010,\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u00032\u0006\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0015H\u0002J\u0018\u0010/\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00032\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020)2\b\u00103\u001a\u0004\u0018\u00010\u0019J\u0010\u00104\u001a\u00020)2\b\u0010$\u001a\u0004\u0018\u00010%R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001cX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001cX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lja/burhanrashid52/photoeditor/MultiTouchListener;", "Landroid/view/View$OnTouchListener;", "deleteView", "Landroid/view/View;", "photoEditorView", "Lja/burhanrashid52/photoeditor/PhotoEditorView;", "photoEditImageView", "Landroid/widget/ImageView;", "mIsPinchScalable", "", "onPhotoEditorListener", "Lja/burhanrashid52/photoeditor/OnPhotoEditorListener;", "viewState", "Lja/burhanrashid52/photoeditor/PhotoEditorViewState;", "(Landroid/view/View;Lja/burhanrashid52/photoeditor/PhotoEditorView;Landroid/widget/ImageView;ZLja/burhanrashid52/photoeditor/OnPhotoEditorListener;Lja/burhanrashid52/photoeditor/PhotoEditorViewState;)V", "isRotateEnabled", "isScaleEnabled", "isTranslateEnabled", "location", "", "mActivePointerId", "", "mGestureListener", "Landroid/view/GestureDetector;", "mOnGestureControl", "Lja/burhanrashid52/photoeditor/MultiTouchListener$OnGestureControl;", "mOnPhotoEditorListener", "mPrevRawX", "", "mPrevRawY", "mPrevX", "mPrevY", "mScaleGestureDetector", "Lja/burhanrashid52/photoeditor/ScaleGestureDetector;", "maximumScale", "minimumScale", "onMultiTouchListener", "Lja/burhanrashid52/photoeditor/MultiTouchListener$OnMultiTouchListener;", "outRect", "Landroid/graphics/Rect;", "firePhotoEditorSDKListener", "", "view", "isStart", "isViewInBounds", "x", "y", "onTouch", Constants.CHARGED_EVENT_PARAM, "Landroid/view/MotionEvent;", "setOnGestureControl", "onGestureControl", "setOnMultiTouchListener", "Companion", "GestureListener", "OnGestureControl", "OnMultiTouchListener", "ScaleGestureListener", "TransformInfo", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiTouchListener implements View.OnTouchListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int INVALID_POINTER_ID = -1;

    @Nullable
    private final View deleteView;
    private final boolean isRotateEnabled;
    private final boolean isScaleEnabled;
    private final boolean isTranslateEnabled;

    @NotNull
    private final int[] location;
    private int mActivePointerId;

    @NotNull
    private final GestureDetector mGestureListener;
    private final boolean mIsPinchScalable;

    @Nullable
    private OnGestureControl mOnGestureControl;

    @Nullable
    private final OnPhotoEditorListener mOnPhotoEditorListener;
    private float mPrevRawX;
    private float mPrevRawY;
    private float mPrevX;
    private float mPrevY;

    @NotNull
    private final ScaleGestureDetector mScaleGestureDetector;
    private final float maximumScale;
    private final float minimumScale;

    @Nullable
    private OnMultiTouchListener onMultiTouchListener;

    @Nullable
    private Rect outRect;

    @Nullable
    private final ImageView photoEditImageView;

    @NotNull
    private final PhotoEditorView photoEditorView;

    @NotNull
    private final PhotoEditorViewState viewState;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002J \u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u001c\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\u0012\u001a\u00060\u0013R\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lja/burhanrashid52/photoeditor/MultiTouchListener$Companion;", "", "()V", "INVALID_POINTER_ID", "", "adjustAngle", "", "degrees", "adjustTranslation", "", "view", "Landroid/view/View;", "deltaX", "deltaY", "computeRenderOffset", "pivotX", "pivotY", "move", Constants.INFO_PARAM, "Lja/burhanrashid52/photoeditor/MultiTouchListener$TransformInfo;", "Lja/burhanrashid52/photoeditor/MultiTouchListener;", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float adjustAngle(float degrees) {
            return degrees > 180.0f ? degrees - 360.0f : degrees < -180.0f ? degrees + 360.0f : degrees;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void adjustTranslation(View view, float deltaX, float deltaY) {
            float[] fArr = {deltaX, deltaY};
            view.getMatrix().mapVectors(fArr);
            view.setTranslationX(view.getTranslationX() + fArr[0]);
            view.setTranslationY(view.getTranslationY() + fArr[1]);
        }

        private final void computeRenderOffset(View view, float pivotX, float pivotY) {
            if (view.getPivotX() == pivotX && view.getPivotY() == pivotY) {
                return;
            }
            float[] fArr = {0.0f, 0.0f};
            view.getMatrix().mapPoints(fArr);
            view.setPivotX(pivotX);
            view.setPivotY(pivotY);
            float[] fArr2 = {0.0f, 0.0f};
            view.getMatrix().mapPoints(fArr2);
            float f5 = fArr2[0] - fArr[0];
            float f10 = fArr2[1] - fArr[1];
            view.setTranslationX(view.getTranslationX() - f5);
            view.setTranslationY(view.getTranslationY() - f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void move(View view, TransformInfo info) {
            computeRenderOffset(view, info.getPivotX(), info.getPivotY());
            adjustTranslation(view, info.getDeltaX(), info.getDeltaY());
            float max = Math.max(info.getMinimumScale(), Math.min(info.getMaximumScale(), view.getScaleX() * info.getDeltaScale()));
            view.setScaleX(max);
            view.setScaleY(max);
            view.setRotation(adjustAngle(view.getRotation() + info.getDeltaAngle()));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lja/burhanrashid52/photoeditor/MultiTouchListener$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lja/burhanrashid52/photoeditor/MultiTouchListener;)V", "onLongPress", "", "e", "Landroid/view/MotionEvent;", "onSingleTapUp", "", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(@NotNull MotionEvent e) {
            Intrinsics.echo(e, "e");
            super.onLongPress(e);
            OnGestureControl onGestureControl = MultiTouchListener.this.mOnGestureControl;
            if (onGestureControl != null) {
                onGestureControl.onLongClick();
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(@NotNull MotionEvent e) {
            Intrinsics.echo(e, "e");
            OnGestureControl onGestureControl = MultiTouchListener.this.mOnGestureControl;
            if (onGestureControl != null) {
                onGestureControl.onClick();
                return true;
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lja/burhanrashid52/photoeditor/MultiTouchListener$OnGestureControl;", "", "onClick", "", "onLongClick", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface OnGestureControl {
        void onClick();

        void onLongClick();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lja/burhanrashid52/photoeditor/MultiTouchListener$OnMultiTouchListener;", "", "onEditTextClickListener", "", com.clevertap.android.sdk.Constants.KEY_TEXT, "", "colorCode", "", "onRemoveViewListener", "removedView", "Landroid/view/View;", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface OnMultiTouchListener {
        void onEditTextClickListener(@NotNull String text, int colorCode);

        void onRemoveViewListener(@NotNull View removedView);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lja/burhanrashid52/photoeditor/MultiTouchListener$ScaleGestureListener;", "Lja/burhanrashid52/photoeditor/ScaleGestureDetector$SimpleOnScaleGestureListener;", "(Lja/burhanrashid52/photoeditor/MultiTouchListener;)V", "mPivotX", "", "mPivotY", "mPrevSpanVector", "Lja/burhanrashid52/photoeditor/Vector2D;", "onScale", "", "view", "Landroid/view/View;", "detector", "Lja/burhanrashid52/photoeditor/ScaleGestureDetector;", "onScaleBegin", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public final class ScaleGestureListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private float mPivotX;
        private float mPivotY;

        @NotNull
        private final Vector2D mPrevSpanVector = new Vector2D();

        public ScaleGestureListener() {
        }

        @Override // ja.burhanrashid52.photoeditor.ScaleGestureDetector.SimpleOnScaleGestureListener, ja.burhanrashid52.photoeditor.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(@NotNull View view, @NotNull ScaleGestureDetector detector) {
            float f5;
            float f10;
            float f11;
            Intrinsics.echo(view, "view");
            Intrinsics.echo(detector, "detector");
            TransformInfo transformInfo = new TransformInfo();
            if (MultiTouchListener.this.isScaleEnabled) {
                f5 = detector.getScaleFactor();
            } else {
                f5 = 1.0f;
            }
            transformInfo.setDeltaScale(f5);
            float f12 = 0.0f;
            if (MultiTouchListener.this.isRotateEnabled) {
                f10 = Vector2D.INSTANCE.getAngle(this.mPrevSpanVector, detector.getMCurrSpanVector());
            } else {
                f10 = 0.0f;
            }
            transformInfo.setDeltaAngle(f10);
            if (MultiTouchListener.this.isTranslateEnabled) {
                f11 = detector.getMFocusX() - this.mPivotX;
            } else {
                f11 = 0.0f;
            }
            transformInfo.setDeltaX(f11);
            if (MultiTouchListener.this.isTranslateEnabled) {
                f12 = detector.getMFocusY() - this.mPivotY;
            }
            transformInfo.setDeltaY(f12);
            transformInfo.setPivotX(this.mPivotX);
            transformInfo.setPivotY(this.mPivotY);
            transformInfo.setMinimumScale(MultiTouchListener.this.minimumScale);
            transformInfo.setMaximumScale(MultiTouchListener.this.maximumScale);
            MultiTouchListener.INSTANCE.move(view, transformInfo);
            return !MultiTouchListener.this.mIsPinchScalable;
        }

        @Override // ja.burhanrashid52.photoeditor.ScaleGestureDetector.SimpleOnScaleGestureListener, ja.burhanrashid52.photoeditor.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(@NotNull View view, @NotNull ScaleGestureDetector detector) {
            Intrinsics.echo(view, "view");
            Intrinsics.echo(detector, "detector");
            this.mPivotX = detector.getMFocusX();
            this.mPivotY = detector.getMFocusY();
            this.mPrevSpanVector.set(detector.getMCurrSpanVector());
            return MultiTouchListener.this.mIsPinchScalable;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001a\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lja/burhanrashid52/photoeditor/MultiTouchListener$TransformInfo;", "", "(Lja/burhanrashid52/photoeditor/MultiTouchListener;)V", "deltaAngle", "", "getDeltaAngle", "()F", "setDeltaAngle", "(F)V", "deltaScale", "getDeltaScale", "setDeltaScale", "deltaX", "getDeltaX", "setDeltaX", "deltaY", "getDeltaY", "setDeltaY", "maximumScale", "getMaximumScale", "setMaximumScale", "minimumScale", "getMinimumScale", "setMinimumScale", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public final class TransformInfo {
        private float deltaAngle;
        private float deltaScale;
        private float deltaX;
        private float deltaY;
        private float maximumScale;
        private float minimumScale;
        private float pivotX;
        private float pivotY;

        public TransformInfo() {
        }

        public final float getDeltaAngle() {
            return this.deltaAngle;
        }

        public final float getDeltaScale() {
            return this.deltaScale;
        }

        public final float getDeltaX() {
            return this.deltaX;
        }

        public final float getDeltaY() {
            return this.deltaY;
        }

        public final float getMaximumScale() {
            return this.maximumScale;
        }

        public final float getMinimumScale() {
            return this.minimumScale;
        }

        public final float getPivotX() {
            return this.pivotX;
        }

        public final float getPivotY() {
            return this.pivotY;
        }

        public final void setDeltaAngle(float f5) {
            this.deltaAngle = f5;
        }

        public final void setDeltaScale(float f5) {
            this.deltaScale = f5;
        }

        public final void setDeltaX(float f5) {
            this.deltaX = f5;
        }

        public final void setDeltaY(float f5) {
            this.deltaY = f5;
        }

        public final void setMaximumScale(float f5) {
            this.maximumScale = f5;
        }

        public final void setMinimumScale(float f5) {
            this.minimumScale = f5;
        }

        public final void setPivotX(float f5) {
            this.pivotX = f5;
        }

        public final void setPivotY(float f5) {
            this.pivotY = f5;
        }
    }

    public MultiTouchListener(@Nullable View view, @NotNull PhotoEditorView photoEditorView, @Nullable ImageView imageView, boolean z2, @Nullable OnPhotoEditorListener onPhotoEditorListener, @NotNull PhotoEditorViewState viewState) {
        Rect rect;
        Intrinsics.echo(photoEditorView, "photoEditorView");
        Intrinsics.echo(viewState, "viewState");
        this.mIsPinchScalable = z2;
        this.isRotateEnabled = true;
        this.isTranslateEnabled = true;
        this.isScaleEnabled = true;
        this.minimumScale = 0.5f;
        this.maximumScale = 10.0f;
        this.mActivePointerId = -1;
        this.location = new int[2];
        this.mScaleGestureDetector = new ScaleGestureDetector(new ScaleGestureListener());
        this.mGestureListener = new GestureDetector(new GestureListener());
        this.deleteView = view;
        this.photoEditorView = photoEditorView;
        this.photoEditImageView = imageView;
        this.mOnPhotoEditorListener = onPhotoEditorListener;
        if (view != null) {
            rect = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            rect = new Rect(0, 0, 0, 0);
        }
        this.outRect = rect;
        this.viewState = viewState;
    }

    private final void firePhotoEditorSDKListener(View view, boolean isStart) {
        Object tag = view.getTag();
        OnPhotoEditorListener onPhotoEditorListener = this.mOnPhotoEditorListener;
        if (onPhotoEditorListener != null && tag != null && (tag instanceof ViewType)) {
            if (isStart) {
                Object tag2 = view.getTag();
                Intrinsics.charlie(tag2, "null cannot be cast to non-null type ja.burhanrashid52.photoeditor.ViewType");
                onPhotoEditorListener.onStartViewChangeListener((ViewType) tag2);
            } else {
                Object tag3 = view.getTag();
                Intrinsics.charlie(tag3, "null cannot be cast to non-null type ja.burhanrashid52.photoeditor.ViewType");
                onPhotoEditorListener.onStopViewChangeListener((ViewType) tag3);
            }
        }
    }

    private final boolean isViewInBounds(View view, int x4, int y10) {
        Boolean bool;
        if (view != null) {
            view.getDrawingRect(this.outRect);
            view.getLocationOnScreen(this.location);
            Rect rect = this.outRect;
            if (rect != null) {
                int[] iArr = this.location;
                rect.offset(iArr[0], iArr[1]);
            }
            Rect rect2 = this.outRect;
            if (rect2 != null) {
                bool = Boolean.valueOf(rect2.contains(x4, y10));
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
        int findPointerIndex;
        Intrinsics.echo(view, "view");
        Intrinsics.echo(event, "event");
        this.mScaleGestureDetector.onTouchEvent(view, event);
        this.mGestureListener.onTouchEvent(event);
        if (!this.isTranslateEnabled) {
            return true;
        }
        int action = event.getAction();
        int rawX = (int) event.getRawX();
        int rawY = (int) event.getRawY();
        int actionMasked = event.getActionMasked() & action;
        int i4 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int i5 = (65280 & action) >> 8;
                            if (event.getPointerId(i5) == this.mActivePointerId) {
                                if (i5 == 0) {
                                    i4 = 1;
                                }
                                this.mPrevX = event.getX(i4);
                                this.mPrevY = event.getY(i4);
                                this.mActivePointerId = event.getPointerId(i4);
                            }
                        }
                    } else {
                        this.mActivePointerId = -1;
                    }
                } else if (view == this.viewState.getCurrentSelectedView() && (findPointerIndex = event.findPointerIndex(this.mActivePointerId)) != -1) {
                    float x4 = event.getX(findPointerIndex);
                    float y10 = event.getY(findPointerIndex);
                    if (!this.mScaleGestureDetector.getIsInProgress()) {
                        INSTANCE.adjustTranslation(view, x4 - this.mPrevX, y10 - this.mPrevY);
                    }
                }
            } else {
                this.mActivePointerId = -1;
                View view2 = this.deleteView;
                if (view2 != null && isViewInBounds(view2, rawX, rawY)) {
                    OnMultiTouchListener onMultiTouchListener = this.onMultiTouchListener;
                    if (onMultiTouchListener != null) {
                        onMultiTouchListener.onRemoveViewListener(view);
                    }
                } else if (!isViewInBounds(this.photoEditImageView, rawX, rawY)) {
                    view.animate().translationY(0.0f).translationY(0.0f);
                }
                View view3 = this.deleteView;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                firePhotoEditorSDKListener(view, false);
            }
        } else {
            this.mPrevX = event.getX();
            this.mPrevY = event.getY();
            this.mPrevRawX = event.getRawX();
            this.mPrevRawY = event.getRawY();
            this.mActivePointerId = event.getPointerId(0);
            View view4 = this.deleteView;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            view.bringToFront();
            firePhotoEditorSDKListener(view, true);
        }
        return true;
    }

    public final void setOnGestureControl(@Nullable OnGestureControl onGestureControl) {
        this.mOnGestureControl = onGestureControl;
    }

    public final void setOnMultiTouchListener(@Nullable OnMultiTouchListener onMultiTouchListener) {
        this.onMultiTouchListener = onMultiTouchListener;
    }
}
