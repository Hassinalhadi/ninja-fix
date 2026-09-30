package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ao.ad;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.parser.LayerParser;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieThreadFactory;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    private static final List<String> ALLOWED_REDUCED_MOTION_MARKERS;
    public static final int INFINITE = -1;
    private static final float MAX_DELTA_MS_ASYNC_SET_PROGRESS = 50.0f;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    private static final boolean invalidateSelfOnMainThread;
    private static final Executor setProgressExecutor;
    private int alpha;
    private final LottieValueAnimator animator;
    private AsyncUpdates asyncUpdates;
    private Rect canvasClipBounds;
    private RectF canvasClipBoundsRectF;
    private boolean clipTextToBoundingBox;
    private boolean clipToCompositionBounds;
    private LottieComposition composition;
    private CompositionLayer compositionLayer;
    String defaultFontFileExtension;
    FontAssetDelegate fontAssetDelegate;
    private FontAssetManager fontAssetManager;
    private Map<String, Typeface> fontMap;
    private boolean ignoreSystemAnimationsDisabled;
    private ImageAssetDelegate imageAssetDelegate;
    private ImageAssetManager imageAssetManager;
    private String imageAssetsFolder;
    private Runnable invalidateSelfRunnable;
    private boolean isApplyingOpacityToLayersEnabled;
    private boolean isApplyingShadowToLayersEnabled;
    private boolean isDirty;
    private float lastDrawnProgress;
    private final ArrayList<LazyCompositionTask> lazyCompositionTasks;
    private final LottieFeatureFlags lottieFeatureFlags;
    private Handler mainThreadHandler;
    private boolean maintainOriginalImageBounds;
    private OnVisibleAction onVisibleAction;
    private boolean outlineMasksAndMattes;
    private boolean performanceTrackingEnabled;
    private final ValueAnimator.AnimatorUpdateListener progressUpdateListener;
    private RenderMode renderMode;
    private final Matrix renderingMatrix;
    private boolean safeMode;
    private final Semaphore setProgressDrawLock;
    private Bitmap softwareRenderingBitmap;
    private Canvas softwareRenderingCanvas;
    private Rect softwareRenderingDstBoundsRect;
    private RectF softwareRenderingDstBoundsRectF;
    private Matrix softwareRenderingOriginalCanvasMatrix;
    private float[] softwareRenderingOriginalCanvasMatrixElements;
    private Matrix softwareRenderingOriginalCanvasMatrixInverse;
    private Paint softwareRenderingPaint;
    private Rect softwareRenderingSrcBoundsRect;
    private RectF softwareRenderingTransformedBounds;
    private boolean systemAnimationsEnabled;
    TextDelegate textDelegate;
    private final Runnable updateProgressRunnable;
    private boolean useSoftwareRendering;

    /* renamed from: com.airbnb.lottie.LottieDrawable$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1<T> extends LottieValueCallback<T> {
        final /* synthetic */ LottieDrawable this$0;
        final /* synthetic */ SimpleLottieValueCallback val$callback;

        public AnonymousClass1(LottieDrawable lottieDrawable, SimpleLottieValueCallback simpleLottieValueCallback) {
            r2 = simpleLottieValueCallback;
            this.this$0 = lottieDrawable;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
            return (T) r2.getValue(lottieFrameInfo);
        }
    }

    /* loaded from: classes3.dex */
    public interface LazyCompositionTask {
        void run(LottieComposition lottieComposition);
    }

    /* loaded from: classes3.dex */
    public enum OnVisibleAction {
        NONE,
        PLAY,
        RESUME
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface RepeatMode {
    }

    static {
        boolean z2;
        if (Build.VERSION.SDK_INT <= 25) {
            z2 = true;
        } else {
            z2 = false;
        }
        invalidateSelfOnMainThread = z2;
        ALLOWED_REDUCED_MOTION_MARKERS = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        setProgressExecutor = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new LottieThreadFactory());
    }

    public LottieDrawable() {
        LottieValueAnimator lottieValueAnimator = new LottieValueAnimator();
        this.animator = lottieValueAnimator;
        this.systemAnimationsEnabled = true;
        this.ignoreSystemAnimationsDisabled = false;
        this.safeMode = false;
        this.onVisibleAction = OnVisibleAction.NONE;
        this.lazyCompositionTasks = new ArrayList<>();
        this.lottieFeatureFlags = new LottieFeatureFlags();
        this.maintainOriginalImageBounds = false;
        this.clipToCompositionBounds = true;
        this.alpha = 255;
        this.clipTextToBoundingBox = false;
        this.renderMode = RenderMode.AUTOMATIC;
        this.useSoftwareRendering = false;
        this.renderingMatrix = new Matrix();
        this.softwareRenderingOriginalCanvasMatrixElements = new float[9];
        this.isDirty = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.u
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LottieDrawable.this.lambda$new$0(valueAnimator);
            }
        };
        this.progressUpdateListener = animatorUpdateListener;
        this.setProgressDrawLock = new Semaphore(1);
        this.updateProgressRunnable = new RunnableC0859r(this, 1);
        this.lastDrawnProgress = -3.4028235E38f;
        lottieValueAnimator.addUpdateListener(animatorUpdateListener);
    }

    private void buildCompositionLayer() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return;
        }
        CompositionLayer compositionLayer = new CompositionLayer(this, LayerParser.parse(lottieComposition), lottieComposition.getLayers(), lottieComposition);
        this.compositionLayer = compositionLayer;
        if (this.outlineMasksAndMattes) {
            compositionLayer.setOutlineMasksAndMattes(true);
        }
        this.compositionLayer.setClipToCompositionBounds(this.clipToCompositionBounds);
    }

    private void computeRenderMode() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return;
        }
        this.useSoftwareRendering = this.renderMode.useSoftwareRendering(Build.VERSION.SDK_INT, lottieComposition.hasDashPattern(), lottieComposition.getMaskAndMatteCount());
    }

    private void convertRect(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void drawDirectlyToCanvas(Canvas canvas) {
        CompositionLayer compositionLayer = this.compositionLayer;
        LottieComposition lottieComposition = this.composition;
        if (compositionLayer != null && lottieComposition != null) {
            this.renderingMatrix.reset();
            if (!getBounds().isEmpty()) {
                this.renderingMatrix.preTranslate(r2.left, r2.top);
                this.renderingMatrix.preScale(r2.width() / lottieComposition.getBounds().width(), r2.height() / lottieComposition.getBounds().height());
            }
            compositionLayer.draw(canvas, this.renderingMatrix, this.alpha, null);
        }
    }

    private void ensureSoftwareRenderingBitmap(int i4, int i5) {
        Bitmap bitmap = this.softwareRenderingBitmap;
        if (bitmap != null && bitmap.getWidth() >= i4 && this.softwareRenderingBitmap.getHeight() >= i5) {
            if (this.softwareRenderingBitmap.getWidth() <= i4 && this.softwareRenderingBitmap.getHeight() <= i5) {
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(this.softwareRenderingBitmap, 0, 0, i4, i5);
            this.softwareRenderingBitmap = createBitmap;
            this.softwareRenderingCanvas.setBitmap(createBitmap);
            this.isDirty = true;
            return;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        this.softwareRenderingBitmap = createBitmap2;
        this.softwareRenderingCanvas.setBitmap(createBitmap2);
        this.isDirty = true;
    }

    private void ensureSoftwareRenderingObjectsInitialized() {
        if (this.softwareRenderingCanvas != null) {
            return;
        }
        this.softwareRenderingCanvas = new Canvas();
        this.softwareRenderingTransformedBounds = new RectF();
        this.softwareRenderingOriginalCanvasMatrix = new Matrix();
        this.softwareRenderingOriginalCanvasMatrixInverse = new Matrix();
        this.canvasClipBounds = new Rect();
        this.canvasClipBoundsRectF = new RectF();
        this.softwareRenderingPaint = new LPaint();
        this.softwareRenderingSrcBoundsRect = new Rect();
        this.softwareRenderingDstBoundsRect = new Rect();
        this.softwareRenderingDstBoundsRectF = new RectF();
    }

    private Context getContext() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    private FontAssetManager getFontAssetManager() {
        if (getCallback() == null) {
            return null;
        }
        if (this.fontAssetManager == null) {
            FontAssetManager fontAssetManager = new FontAssetManager(getCallback(), this.fontAssetDelegate);
            this.fontAssetManager = fontAssetManager;
            String str = this.defaultFontFileExtension;
            if (str != null) {
                fontAssetManager.setDefaultFontFileExtension(str);
            }
        }
        return this.fontAssetManager;
    }

    private ImageAssetManager getImageAssetManager() {
        ImageAssetManager imageAssetManager = this.imageAssetManager;
        if (imageAssetManager != null && !imageAssetManager.hasSameContext(getContext())) {
            this.imageAssetManager = null;
        }
        if (this.imageAssetManager == null) {
            this.imageAssetManager = new ImageAssetManager(getCallback(), this.imageAssetsFolder, this.imageAssetDelegate, this.composition.getImages());
        }
        return this.imageAssetManager;
    }

    private boolean ignoreCanvasClipBounds() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (!(((View) callback).getParent() instanceof ViewGroup)) {
            return false;
        }
        return !((ViewGroup) r0).getClipChildren();
    }

    public /* synthetic */ void lambda$addValueCallback$17(KeyPath keyPath, Object obj, LottieValueCallback lottieValueCallback, LottieComposition lottieComposition) {
        addValueCallback(keyPath, (KeyPath) obj, (LottieValueCallback<KeyPath>) lottieValueCallback);
    }

    public /* synthetic */ void lambda$new$0(ValueAnimator valueAnimator) {
        if (getAsyncUpdatesEnabled()) {
            invalidateSelf();
            return;
        }
        CompositionLayer compositionLayer = this.compositionLayer;
        if (compositionLayer != null) {
            compositionLayer.setProgress(this.animator.getAnimatedValueAbsolute());
        }
    }

    public /* synthetic */ void lambda$new$1() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public /* synthetic */ void lambda$new$2() {
        CompositionLayer compositionLayer = this.compositionLayer;
        if (compositionLayer != null) {
            try {
                this.setProgressDrawLock.acquire();
                compositionLayer.setProgress(this.animator.getAnimatedValueAbsolute());
                if (invalidateSelfOnMainThread && this.isDirty) {
                    if (this.mainThreadHandler == null) {
                        this.mainThreadHandler = new Handler(Looper.getMainLooper());
                        this.invalidateSelfRunnable = new RunnableC0859r(this, 0);
                    }
                    this.mainThreadHandler.post(this.invalidateSelfRunnable);
                }
                this.setProgressDrawLock.release();
            } catch (InterruptedException unused) {
                this.setProgressDrawLock.release();
            } catch (Throwable th) {
                this.setProgressDrawLock.release();
                throw th;
            }
        }
    }

    public /* synthetic */ void lambda$playAnimation$3(LottieComposition lottieComposition) {
        playAnimation();
    }

    public /* synthetic */ void lambda$resumeAnimation$4(LottieComposition lottieComposition) {
        resumeAnimation();
    }

    public /* synthetic */ void lambda$setFrame$15(int i4, LottieComposition lottieComposition) {
        setFrame(i4);
    }

    public /* synthetic */ void lambda$setMaxFrame$10(String str, LottieComposition lottieComposition) {
        setMaxFrame(str);
    }

    public /* synthetic */ void lambda$setMaxFrame$7(int i4, LottieComposition lottieComposition) {
        setMaxFrame(i4);
    }

    public /* synthetic */ void lambda$setMaxProgress$8(float f5, LottieComposition lottieComposition) {
        setMaxProgress(f5);
    }

    public /* synthetic */ void lambda$setMinAndMaxFrame$11(String str, LottieComposition lottieComposition) {
        setMinAndMaxFrame(str);
    }

    public /* synthetic */ void lambda$setMinAndMaxFrame$12(String str, String str2, boolean z2, LottieComposition lottieComposition) {
        setMinAndMaxFrame(str, str2, z2);
    }

    public /* synthetic */ void lambda$setMinAndMaxFrame$13(int i4, int i5, LottieComposition lottieComposition) {
        setMinAndMaxFrame(i4, i5);
    }

    public /* synthetic */ void lambda$setMinAndMaxProgress$14(float f5, float f10, LottieComposition lottieComposition) {
        setMinAndMaxProgress(f5, f10);
    }

    public /* synthetic */ void lambda$setMinFrame$5(int i4, LottieComposition lottieComposition) {
        setMinFrame(i4);
    }

    public /* synthetic */ void lambda$setMinFrame$9(String str, LottieComposition lottieComposition) {
        setMinFrame(str);
    }

    public /* synthetic */ void lambda$setMinProgress$6(float f5, LottieComposition lottieComposition) {
        setMinProgress(f5);
    }

    public /* synthetic */ void lambda$setProgress$16(float f5, LottieComposition lottieComposition) {
        setProgress(f5);
    }

    private void renderAndDrawAsBitmap(Canvas canvas, CompositionLayer compositionLayer) {
        if (this.composition != null && compositionLayer != null) {
            ensureSoftwareRenderingObjectsInitialized();
            canvas.getMatrix(this.softwareRenderingOriginalCanvasMatrix);
            canvas.getClipBounds(this.canvasClipBounds);
            convertRect(this.canvasClipBounds, this.canvasClipBoundsRectF);
            this.softwareRenderingOriginalCanvasMatrix.mapRect(this.canvasClipBoundsRectF);
            convertRect(this.canvasClipBoundsRectF, this.canvasClipBounds);
            if (this.clipToCompositionBounds) {
                this.softwareRenderingTransformedBounds.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                compositionLayer.getBounds(this.softwareRenderingTransformedBounds, null, false);
            }
            this.softwareRenderingOriginalCanvasMatrix.mapRect(this.softwareRenderingTransformedBounds);
            Rect bounds = getBounds();
            float width = bounds.width() / getIntrinsicWidth();
            float height = bounds.height() / getIntrinsicHeight();
            scaleRect(this.softwareRenderingTransformedBounds, width, height);
            if (!ignoreCanvasClipBounds()) {
                RectF rectF = this.softwareRenderingTransformedBounds;
                Rect rect = this.canvasClipBounds;
                rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
            }
            int ceil = (int) Math.ceil(this.softwareRenderingTransformedBounds.width());
            int ceil2 = (int) Math.ceil(this.softwareRenderingTransformedBounds.height());
            if (ceil > 0 && ceil2 > 0) {
                ensureSoftwareRenderingBitmap(ceil, ceil2);
                if (this.isDirty) {
                    this.softwareRenderingOriginalCanvasMatrix.getValues(this.softwareRenderingOriginalCanvasMatrixElements);
                    float[] fArr = this.softwareRenderingOriginalCanvasMatrixElements;
                    float f5 = fArr[0];
                    float f10 = fArr[4];
                    this.renderingMatrix.set(this.softwareRenderingOriginalCanvasMatrix);
                    this.renderingMatrix.preScale(width, height);
                    Matrix matrix = this.renderingMatrix;
                    RectF rectF2 = this.softwareRenderingTransformedBounds;
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    this.renderingMatrix.postScale(1.0f / f5, 1.0f / f10);
                    this.softwareRenderingBitmap.eraseColor(0);
                    this.softwareRenderingCanvas.setMatrix(Utils.IDENTITY_MATRIX);
                    this.softwareRenderingCanvas.scale(f5, f10);
                    compositionLayer.draw(this.softwareRenderingCanvas, this.renderingMatrix, this.alpha, null);
                    this.softwareRenderingOriginalCanvasMatrix.invert(this.softwareRenderingOriginalCanvasMatrixInverse);
                    this.softwareRenderingOriginalCanvasMatrixInverse.mapRect(this.softwareRenderingDstBoundsRectF, this.softwareRenderingTransformedBounds);
                    convertRect(this.softwareRenderingDstBoundsRectF, this.softwareRenderingDstBoundsRect);
                }
                this.softwareRenderingSrcBoundsRect.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.softwareRenderingBitmap, this.softwareRenderingSrcBoundsRect, this.softwareRenderingDstBoundsRect, this.softwareRenderingPaint);
            }
        }
    }

    private void scaleRect(RectF rectF, float f5, float f10) {
        rectF.set(rectF.left * f5, rectF.top * f10, rectF.right * f5, rectF.bottom * f10);
    }

    private boolean shouldSetProgressBeforeDrawing() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return false;
        }
        float f5 = this.lastDrawnProgress;
        float animatedValueAbsolute = this.animator.getAnimatedValueAbsolute();
        this.lastDrawnProgress = animatedValueAbsolute;
        if (Math.abs(animatedValueAbsolute - f5) * lottieComposition.getDuration() < 50.0f) {
            return false;
        }
        return true;
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.addListener(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.animator.addPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.addUpdateListener(animatorUpdateListener);
    }

    public <T> void addValueCallback(final KeyPath keyPath, final T t5, final LottieValueCallback<T> lottieValueCallback) {
        CompositionLayer compositionLayer = this.compositionLayer;
        if (compositionLayer == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.p
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.lambda$addValueCallback$17(keyPath, t5, lottieValueCallback, lottieComposition);
                }
            });
            return;
        }
        boolean z2 = true;
        if (keyPath == KeyPath.COMPOSITION) {
            compositionLayer.addValueCallback(t5, lottieValueCallback);
        } else if (keyPath.getResolvedElement() != null) {
            keyPath.getResolvedElement().addValueCallback(t5, lottieValueCallback);
        } else {
            List<KeyPath> resolveKeyPath = resolveKeyPath(keyPath);
            for (int i4 = 0; i4 < resolveKeyPath.size(); i4++) {
                resolveKeyPath.get(i4).getResolvedElement().addValueCallback(t5, lottieValueCallback);
            }
            z2 = true ^ resolveKeyPath.isEmpty();
        }
        if (z2) {
            invalidateSelf();
            if (t5 == LottieProperty.TIME_REMAP) {
                setProgress(getProgress());
            }
        }
    }

    public boolean animationsEnabled(Context context) {
        if (this.ignoreSystemAnimationsDisabled) {
            return true;
        }
        if (this.systemAnimationsEnabled && L.getReducedMotionOption().getCurrentReducedMotionMode(context) == ReducedMotionMode.STANDARD_MOTION) {
            return true;
        }
        return false;
    }

    public void cancelAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.cancel();
        if (!isVisible()) {
            this.onVisibleAction = OnVisibleAction.NONE;
        }
    }

    public void clearComposition() {
        if (this.animator.isRunning()) {
            this.animator.cancel();
            if (!isVisible()) {
                this.onVisibleAction = OnVisibleAction.NONE;
            }
        }
        this.composition = null;
        this.compositionLayer = null;
        this.imageAssetManager = null;
        this.lastDrawnProgress = -3.4028235E38f;
        this.animator.clearComposition();
        invalidateSelf();
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        CompositionLayer compositionLayer = this.compositionLayer;
        if (compositionLayer == null) {
            return;
        }
        boolean asyncUpdatesEnabled = getAsyncUpdatesEnabled();
        if (asyncUpdatesEnabled) {
            try {
                this.setProgressDrawLock.acquire();
            } catch (InterruptedException unused) {
                if (L.isTraceEnabled()) {
                    L.endSection("Drawable#draw");
                }
                if (!asyncUpdatesEnabled) {
                    return;
                }
                this.setProgressDrawLock.release();
                if (compositionLayer.getProgress() == this.animator.getAnimatedValueAbsolute()) {
                    return;
                }
            } catch (Throwable th) {
                if (L.isTraceEnabled()) {
                    L.endSection("Drawable#draw");
                }
                if (asyncUpdatesEnabled) {
                    this.setProgressDrawLock.release();
                    if (compositionLayer.getProgress() != this.animator.getAnimatedValueAbsolute()) {
                        setProgressExecutor.execute(this.updateProgressRunnable);
                    }
                }
                throw th;
            }
        }
        if (L.isTraceEnabled()) {
            L.beginSection("Drawable#draw");
        }
        if (asyncUpdatesEnabled && shouldSetProgressBeforeDrawing()) {
            setProgress(this.animator.getAnimatedValueAbsolute());
        }
        if (this.safeMode) {
            try {
                if (this.useSoftwareRendering) {
                    renderAndDrawAsBitmap(canvas, compositionLayer);
                } else {
                    drawDirectlyToCanvas(canvas);
                }
            } catch (Throwable th2) {
                Logger.error("Lottie crashed in draw!", th2);
            }
        } else if (this.useSoftwareRendering) {
            renderAndDrawAsBitmap(canvas, compositionLayer);
        } else {
            drawDirectlyToCanvas(canvas);
        }
        this.isDirty = false;
        if (L.isTraceEnabled()) {
            L.endSection("Drawable#draw");
        }
        if (asyncUpdatesEnabled) {
            this.setProgressDrawLock.release();
            if (compositionLayer.getProgress() == this.animator.getAnimatedValueAbsolute()) {
                return;
            }
            setProgressExecutor.execute(this.updateProgressRunnable);
        }
    }

    public void enableFeatureFlag(LottieFeatureFlag lottieFeatureFlag, boolean z2) {
        boolean enableFlag = this.lottieFeatureFlags.enableFlag(lottieFeatureFlag, z2);
        if (this.composition != null && enableFlag) {
            buildCompositionLayer();
        }
    }

    @Deprecated
    public boolean enableMergePathsForKitKatAndAbove() {
        return this.lottieFeatureFlags.isFlagEnabled(LottieFeatureFlag.MergePathsApi19);
    }

    public void endAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.endAnimation();
        if (!isVisible()) {
            this.onVisibleAction = OnVisibleAction.NONE;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    public AsyncUpdates getAsyncUpdates() {
        AsyncUpdates asyncUpdates = this.asyncUpdates;
        if (asyncUpdates != null) {
            return asyncUpdates;
        }
        return L.getDefaultAsyncUpdates();
    }

    public boolean getAsyncUpdatesEnabled() {
        if (getAsyncUpdates() == AsyncUpdates.ENABLED) {
            return true;
        }
        return false;
    }

    public Bitmap getBitmapForId(String str) {
        ImageAssetManager imageAssetManager = getImageAssetManager();
        if (imageAssetManager != null) {
            return imageAssetManager.bitmapForId(str);
        }
        return null;
    }

    public boolean getClipTextToBoundingBox() {
        return this.clipTextToBoundingBox;
    }

    public boolean getClipToCompositionBounds() {
        return this.clipToCompositionBounds;
    }

    public LottieComposition getComposition() {
        return this.composition;
    }

    public int getFrame() {
        return (int) this.animator.getFrame();
    }

    @Deprecated
    public Bitmap getImageAsset(String str) {
        LottieImageAsset lottieImageAsset;
        ImageAssetManager imageAssetManager = getImageAssetManager();
        if (imageAssetManager != null) {
            return imageAssetManager.bitmapForId(str);
        }
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            lottieImageAsset = null;
        } else {
            lottieImageAsset = lottieComposition.getImages().get(str);
        }
        if (lottieImageAsset == null) {
            return null;
        }
        return lottieImageAsset.getBitmap();
    }

    public String getImageAssetsFolder() {
        return this.imageAssetsFolder;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.getBounds().width();
    }

    public LottieImageAsset getLottieImageAssetForId(String str) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return null;
        }
        return lottieComposition.getImages().get(str);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.maintainOriginalImageBounds;
    }

    public Marker getMarkerForAnimationsDisabled() {
        Iterator<String> it = ALLOWED_REDUCED_MOTION_MARKERS.iterator();
        Marker marker = null;
        while (it.hasNext()) {
            marker = this.composition.getMarker(it.next());
            if (marker != null) {
                break;
            }
        }
        return marker;
    }

    public float getMaxFrame() {
        return this.animator.getMaxFrame();
    }

    public float getMinFrame() {
        return this.animator.getMinFrame();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public PerformanceTracker getPerformanceTracker() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition != null) {
            return lottieComposition.getPerformanceTracker();
        }
        return null;
    }

    public float getProgress() {
        return this.animator.getAnimatedValueAbsolute();
    }

    public RenderMode getRenderMode() {
        if (this.useSoftwareRendering) {
            return RenderMode.SOFTWARE;
        }
        return RenderMode.HARDWARE;
    }

    public int getRepeatCount() {
        return this.animator.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public int getRepeatMode() {
        return this.animator.getRepeatMode();
    }

    public float getSpeed() {
        return this.animator.getSpeed();
    }

    public TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public Typeface getTypeface(Font font) {
        Map<String, Typeface> map = this.fontMap;
        if (map != null) {
            String family = font.getFamily();
            if (map.containsKey(family)) {
                return map.get(family);
            }
            String name = font.getName();
            if (map.containsKey(name)) {
                return map.get(name);
            }
            String str = font.getFamily() + "-" + font.getStyle();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        FontAssetManager fontAssetManager = getFontAssetManager();
        if (fontAssetManager != null) {
            return fontAssetManager.getTypeface(font);
        }
        return null;
    }

    public boolean hasMasks() {
        CompositionLayer compositionLayer = this.compositionLayer;
        if (compositionLayer != null && compositionLayer.hasMasks()) {
            return true;
        }
        return false;
    }

    public boolean hasMatte() {
        CompositionLayer compositionLayer = this.compositionLayer;
        if (compositionLayer != null && compositionLayer.hasMatte()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (!this.isDirty) {
            this.isDirty = true;
            if ((!invalidateSelfOnMainThread || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isAnimating() {
        LottieValueAnimator lottieValueAnimator = this.animator;
        if (lottieValueAnimator == null) {
            return false;
        }
        return lottieValueAnimator.isRunning();
    }

    public boolean isAnimatingOrWillAnimateOnVisible() {
        if (isVisible()) {
            return this.animator.isRunning();
        }
        OnVisibleAction onVisibleAction = this.onVisibleAction;
        if (onVisibleAction != OnVisibleAction.PLAY && onVisibleAction != OnVisibleAction.RESUME) {
            return false;
        }
        return true;
    }

    public boolean isApplyingOpacityToLayersEnabled() {
        return this.isApplyingOpacityToLayersEnabled;
    }

    public boolean isApplyingShadowToLayersEnabled() {
        return this.isApplyingShadowToLayersEnabled;
    }

    public boolean isFeatureFlagEnabled(LottieFeatureFlag lottieFeatureFlag) {
        return this.lottieFeatureFlags.isFlagEnabled(lottieFeatureFlag);
    }

    public boolean isLooping() {
        if (this.animator.getRepeatCount() == -1) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieFeatureFlags.isFlagEnabled(LottieFeatureFlag.MergePathsApi19);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return isAnimating();
    }

    @Deprecated
    public void loop(boolean z2) {
        int i4;
        LottieValueAnimator lottieValueAnimator = this.animator;
        if (z2) {
            i4 = -1;
        } else {
            i4 = 0;
        }
        lottieValueAnimator.setRepeatCount(i4);
    }

    public void pauseAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.pauseAnimation();
        if (!isVisible()) {
            this.onVisibleAction = OnVisibleAction.NONE;
        }
    }

    public void playAnimation() {
        float maxFrame;
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new s(this, 1));
            return;
        }
        computeRenderMode();
        if (animationsEnabled(getContext()) || getRepeatCount() == 0) {
            if (isVisible()) {
                this.animator.playAnimation();
                this.onVisibleAction = OnVisibleAction.NONE;
            } else {
                this.onVisibleAction = OnVisibleAction.PLAY;
            }
        }
        if (!animationsEnabled(getContext())) {
            Marker markerForAnimationsDisabled = getMarkerForAnimationsDisabled();
            if (markerForAnimationsDisabled != null) {
                setFrame((int) markerForAnimationsDisabled.startFrame);
            } else {
                if (getSpeed() < 0.0f) {
                    maxFrame = getMinFrame();
                } else {
                    maxFrame = getMaxFrame();
                }
                setFrame((int) maxFrame);
            }
            this.animator.endAnimation();
            if (!isVisible()) {
                this.onVisibleAction = OnVisibleAction.NONE;
            }
        }
    }

    public void removeAllAnimatorListeners() {
        this.animator.removeAllListeners();
    }

    public void removeAllUpdateListeners() {
        this.animator.removeAllUpdateListeners();
        this.animator.addUpdateListener(this.progressUpdateListener);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.removeListener(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.animator.removePauseListener(animatorPauseListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.removeUpdateListener(animatorUpdateListener);
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        if (this.compositionLayer == null) {
            Logger.warning("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.compositionLayer.resolveKeyPath(keyPath, 0, arrayList, new KeyPath(new String[0]));
        return arrayList;
    }

    public void resumeAnimation() {
        float maxFrame;
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new s(this, 0));
            return;
        }
        computeRenderMode();
        if (animationsEnabled(getContext()) || getRepeatCount() == 0) {
            if (isVisible()) {
                this.animator.resumeAnimation();
                this.onVisibleAction = OnVisibleAction.NONE;
            } else {
                this.onVisibleAction = OnVisibleAction.RESUME;
            }
        }
        if (!animationsEnabled(getContext())) {
            if (getSpeed() < 0.0f) {
                maxFrame = getMinFrame();
            } else {
                maxFrame = getMaxFrame();
            }
            setFrame((int) maxFrame);
            this.animator.endAnimation();
            if (!isVisible()) {
                this.onVisibleAction = OnVisibleAction.NONE;
            }
        }
    }

    public void reverseAnimationSpeed() {
        this.animator.reverseAnimationSpeed();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.alpha = i4;
        invalidateSelf();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z2) {
        this.isApplyingOpacityToLayersEnabled = z2;
    }

    public void setApplyingShadowToLayersEnabled(boolean z2) {
        this.isApplyingShadowToLayersEnabled = z2;
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.asyncUpdates = asyncUpdates;
    }

    public void setClipTextToBoundingBox(boolean z2) {
        if (z2 != this.clipTextToBoundingBox) {
            this.clipTextToBoundingBox = z2;
            invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z2) {
        if (z2 != this.clipToCompositionBounds) {
            this.clipToCompositionBounds = z2;
            CompositionLayer compositionLayer = this.compositionLayer;
            if (compositionLayer != null) {
                compositionLayer.setClipToCompositionBounds(z2);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Logger.warning("Use addColorFilter instead.");
    }

    public boolean setComposition(LottieComposition lottieComposition) {
        if (this.composition == lottieComposition) {
            return false;
        }
        this.isDirty = true;
        clearComposition();
        this.composition = lottieComposition;
        buildCompositionLayer();
        this.animator.setComposition(lottieComposition);
        setProgress(this.animator.getAnimatedFraction());
        Iterator it = new ArrayList(this.lazyCompositionTasks).iterator();
        while (it.hasNext()) {
            LazyCompositionTask lazyCompositionTask = (LazyCompositionTask) it.next();
            if (lazyCompositionTask != null) {
                lazyCompositionTask.run(lottieComposition);
            }
            it.remove();
        }
        this.lazyCompositionTasks.clear();
        lottieComposition.setPerformanceTrackingEnabled(this.performanceTrackingEnabled);
        computeRenderMode();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void setDefaultFontFileExtension(String str) {
        this.defaultFontFileExtension = str;
        FontAssetManager fontAssetManager = getFontAssetManager();
        if (fontAssetManager != null) {
            fontAssetManager.setDefaultFontFileExtension(str);
        }
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.fontAssetDelegate = fontAssetDelegate;
        FontAssetManager fontAssetManager = this.fontAssetManager;
        if (fontAssetManager != null) {
            fontAssetManager.setDelegate(fontAssetDelegate);
        }
    }

    public void setFontMap(Map<String, Typeface> map) {
        if (map == this.fontMap) {
            return;
        }
        this.fontMap = map;
        invalidateSelf();
    }

    public void setFrame(int i4) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new m(this, i4, 0));
        } else {
            this.animator.setFrame(i4);
        }
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z2) {
        this.ignoreSystemAnimationsDisabled = z2;
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.imageAssetDelegate = imageAssetDelegate;
        ImageAssetManager imageAssetManager = this.imageAssetManager;
        if (imageAssetManager != null) {
            imageAssetManager.setDelegate(imageAssetDelegate);
        }
    }

    public void setImagesAssetsFolder(String str) {
        this.imageAssetsFolder = str;
    }

    public void setMaintainOriginalImageBounds(boolean z2) {
        this.maintainOriginalImageBounds = z2;
    }

    public void setMaxFrame(int i4) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new m(this, i4, 1));
        } else {
            this.animator.setMaxFrame(i4 + 0.99f);
        }
    }

    public void setMaxProgress(float f5) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new q(this, f5, 0));
        } else {
            this.animator.setMaxFrame(MiscUtils.lerp(lottieComposition.getStartFrame(), this.composition.getEndFrame(), f5));
        }
    }

    public void setMinAndMaxFrame(String str) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new C0858l(this, str, 0));
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            int i4 = (int) marker.startFrame;
            setMinAndMaxFrame(i4, ((int) marker.durationFrames) + i4);
            return;
        }
        throw new IllegalArgumentException(ad.gray("Cannot find marker with name ", str, "."));
    }

    public void setMinAndMaxProgress(final float f5, final float f10) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(LottieComposition lottieComposition2) {
                    LottieDrawable.this.lambda$setMinAndMaxProgress$14(f5, f10, lottieComposition2);
                }
            });
        } else {
            setMinAndMaxFrame((int) MiscUtils.lerp(lottieComposition.getStartFrame(), this.composition.getEndFrame(), f5), (int) MiscUtils.lerp(this.composition.getStartFrame(), this.composition.getEndFrame(), f10));
        }
    }

    public void setMinFrame(int i4) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new m(this, i4, 2));
        } else {
            this.animator.setMinFrame(i4);
        }
    }

    public void setMinProgress(float f5) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new q(this, f5, 1));
        } else {
            setMinFrame((int) MiscUtils.lerp(lottieComposition.getStartFrame(), this.composition.getEndFrame(), f5));
        }
    }

    public void setOutlineMasksAndMattes(boolean z2) {
        if (this.outlineMasksAndMattes != z2) {
            this.outlineMasksAndMattes = z2;
            CompositionLayer compositionLayer = this.compositionLayer;
            if (compositionLayer != null) {
                compositionLayer.setOutlineMasksAndMattes(z2);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z2) {
        this.performanceTrackingEnabled = z2;
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition != null) {
            lottieComposition.setPerformanceTrackingEnabled(z2);
        }
    }

    public void setProgress(float f5) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new q(this, f5, 2));
            return;
        }
        if (L.isTraceEnabled()) {
            L.beginSection("Drawable#setProgress");
        }
        this.animator.setFrame(this.composition.getFrameForProgress(f5));
        if (L.isTraceEnabled()) {
            L.endSection("Drawable#setProgress");
        }
    }

    public void setRenderMode(RenderMode renderMode) {
        this.renderMode = renderMode;
        computeRenderMode();
    }

    public void setRepeatCount(int i4) {
        this.animator.setRepeatCount(i4);
    }

    public void setRepeatMode(int i4) {
        this.animator.setRepeatMode(i4);
    }

    public void setSafeMode(boolean z2) {
        this.safeMode = z2;
    }

    public void setSpeed(float f5) {
        this.animator.setSpeed(f5);
    }

    @Deprecated
    public void setSystemAnimationsAreEnabled(Boolean bool) {
        this.systemAnimationsEnabled = bool.booleanValue();
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.textDelegate = textDelegate;
    }

    public void setUseCompositionFrameRate(boolean z2) {
        this.animator.setUseCompositionFrameRate(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z10) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z2, z10);
        if (z2) {
            OnVisibleAction onVisibleAction = this.onVisibleAction;
            if (onVisibleAction == OnVisibleAction.PLAY) {
                playAnimation();
                return visible;
            }
            if (onVisibleAction == OnVisibleAction.RESUME) {
                resumeAnimation();
                return visible;
            }
        } else {
            if (this.animator.isRunning()) {
                pauseAnimation();
                this.onVisibleAction = OnVisibleAction.RESUME;
                return visible;
            }
            if (isVisible) {
                this.onVisibleAction = OnVisibleAction.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        playAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        endAnimation();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        ImageAssetManager imageAssetManager = getImageAssetManager();
        if (imageAssetManager == null) {
            Logger.warning("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap updateBitmap = imageAssetManager.updateBitmap(str, bitmap);
        invalidateSelf();
        return updateBitmap;
    }

    public boolean useTextGlyphs() {
        if (this.fontMap == null && this.textDelegate == null && this.composition.getCharacters().golf() > 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void enableMergePathsForKitKatAndAbove(boolean z2) {
        boolean enableFlag = this.lottieFeatureFlags.enableFlag(LottieFeatureFlag.MergePathsApi19, z2);
        if (this.composition == null || !enableFlag) {
            return;
        }
        buildCompositionLayer();
    }

    public void setMaxFrame(String str) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new C0858l(this, str, 1));
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            setMaxFrame((int) (marker.startFrame + marker.durationFrames));
            return;
        }
        throw new IllegalArgumentException(ad.gray("Cannot find marker with name ", str, "."));
    }

    public void setMinFrame(String str) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new C0858l(this, str, 2));
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            setMinFrame((int) marker.startFrame);
            return;
        }
        throw new IllegalArgumentException(ad.gray("Cannot find marker with name ", str, "."));
    }

    private void convertRect(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t5, SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        addValueCallback(keyPath, (KeyPath) t5, (LottieValueCallback<KeyPath>) new LottieValueCallback<T>(this) { // from class: com.airbnb.lottie.LottieDrawable.1
            final /* synthetic */ LottieDrawable this$0;
            final /* synthetic */ SimpleLottieValueCallback val$callback;

            public AnonymousClass1(LottieDrawable this, SimpleLottieValueCallback simpleLottieValueCallback2) {
                r2 = simpleLottieValueCallback2;
                this.this$0 = this;
            }

            @Override // com.airbnb.lottie.value.LottieValueCallback
            public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                return (T) r2.getValue(lottieFrameInfo);
            }
        });
    }

    public void setMinAndMaxFrame(final String str, final String str2, final boolean z2) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.t
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(LottieComposition lottieComposition2) {
                    LottieDrawable.this.lambda$setMinAndMaxFrame$12(str, str2, z2, lottieComposition2);
                }
            });
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            int i4 = (int) marker.startFrame;
            Marker marker2 = this.composition.getMarker(str2);
            if (marker2 != null) {
                setMinAndMaxFrame(i4, (int) (marker2.startFrame + (z2 ? 1.0f : 0.0f)));
                return;
            }
            throw new IllegalArgumentException(ad.gray("Cannot find marker with name ", str2, "."));
        }
        throw new IllegalArgumentException(ad.gray("Cannot find marker with name ", str, "."));
    }

    public void draw(Canvas canvas, Matrix matrix) {
        CompositionLayer compositionLayer = this.compositionLayer;
        LottieComposition lottieComposition = this.composition;
        if (compositionLayer == null || lottieComposition == null) {
            return;
        }
        boolean asyncUpdatesEnabled = getAsyncUpdatesEnabled();
        if (asyncUpdatesEnabled) {
            try {
                this.setProgressDrawLock.acquire();
                if (shouldSetProgressBeforeDrawing()) {
                    setProgress(this.animator.getAnimatedValueAbsolute());
                }
            } catch (InterruptedException unused) {
                if (!asyncUpdatesEnabled) {
                    return;
                }
                this.setProgressDrawLock.release();
                if (compositionLayer.getProgress() == this.animator.getAnimatedValueAbsolute()) {
                    return;
                }
            } catch (Throwable th) {
                if (asyncUpdatesEnabled) {
                    this.setProgressDrawLock.release();
                    if (compositionLayer.getProgress() != this.animator.getAnimatedValueAbsolute()) {
                        setProgressExecutor.execute(this.updateProgressRunnable);
                    }
                }
                throw th;
            }
        }
        if (this.safeMode) {
            try {
                draw(canvas, matrix, compositionLayer, this.alpha);
            } catch (Throwable th2) {
                Logger.error("Lottie crashed in draw!", th2);
            }
        } else {
            draw(canvas, matrix, compositionLayer, this.alpha);
        }
        this.isDirty = false;
        if (asyncUpdatesEnabled) {
            this.setProgressDrawLock.release();
            if (compositionLayer.getProgress() == this.animator.getAnimatedValueAbsolute()) {
                return;
            }
            setProgressExecutor.execute(this.updateProgressRunnable);
        }
    }

    public void setMinAndMaxFrame(final int i4, final int i5) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.o
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.lambda$setMinAndMaxFrame$13(i4, i5, lottieComposition);
                }
            });
        } else {
            this.animator.setMinAndMaxFrames(i4, i5 + 0.99f);
        }
    }

    private void draw(Canvas canvas, Matrix matrix, CompositionLayer compositionLayer, int i4) {
        if (this.useSoftwareRendering) {
            canvas.save();
            canvas.concat(matrix);
            renderAndDrawAsBitmap(canvas, compositionLayer);
            canvas.restore();
            return;
        }
        compositionLayer.draw(canvas, matrix, i4, null);
    }
}
