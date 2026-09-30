package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import g1.AbstractC1735d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final LottieListener<Throwable> DEFAULT_FAILURE_LISTENER = new Object();
    private static final String TAG = "LottieAnimationView";
    private String animationName;
    private int animationResId;
    private boolean autoPlay;
    private boolean cacheComposition;
    private LottieTask<LottieComposition> compositionTask;
    private LottieListener<Throwable> failureListener;
    private int fallbackResource;
    private boolean ignoreUnschedule;
    private final LottieListener<LottieComposition> loadedListener;
    private final LottieDrawable lottieDrawable;
    private final Set<LottieOnCompositionLoadedListener> lottieOnCompositionLoadedListeners;
    private final Set<UserActionTaken> userActionsTaken;
    private final LottieListener<Throwable> wrappedFailureListener;

    /* renamed from: com.airbnb.lottie.LottieAnimationView$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1<T> extends LottieValueCallback<T> {
        final /* synthetic */ LottieAnimationView this$0;
        final /* synthetic */ SimpleLottieValueCallback val$callback;

        public AnonymousClass1(LottieAnimationView lottieAnimationView, SimpleLottieValueCallback simpleLottieValueCallback) {
            r2 = simpleLottieValueCallback;
            this.this$0 = lottieAnimationView;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
            return (T) r2.getValue(lottieFrameInfo);
        }
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.airbnb.lottie.LottieAnimationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        };
        String animationName;
        int animationResId;
        String imageAssetsFolder;
        boolean isAnimating;
        float progress;
        int repeatCount;
        int repeatMode;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, AnonymousClass1 anonymousClass1) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeString(this.animationName);
            parcel.writeFloat(this.progress);
            parcel.writeInt(this.isAnimating ? 1 : 0);
            parcel.writeString(this.imageAssetsFolder);
            parcel.writeInt(this.repeatMode);
            parcel.writeInt(this.repeatCount);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.animationName = parcel.readString();
            this.progress = parcel.readFloat();
            this.isAnimating = parcel.readInt() == 1;
            this.imageAssetsFolder = parcel.readString();
            this.repeatMode = parcel.readInt();
            this.repeatCount = parcel.readInt();
        }
    }

    /* loaded from: classes3.dex */
    public enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* loaded from: classes3.dex */
    public static class WeakFailureListener implements LottieListener<Throwable> {
        private final WeakReference<LottieAnimationView> targetReference;

        public WeakFailureListener(LottieAnimationView lottieAnimationView) {
            this.targetReference = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.LottieListener
        public void onResult(Throwable th) {
            LottieAnimationView lottieAnimationView = this.targetReference.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.fallbackResource != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
            }
            (lottieAnimationView.failureListener == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : lottieAnimationView.failureListener).onResult(th);
        }
    }

    /* loaded from: classes3.dex */
    public static class WeakSuccessListener implements LottieListener<LottieComposition> {
        private final WeakReference<LottieAnimationView> targetReference;

        public WeakSuccessListener(LottieAnimationView lottieAnimationView) {
            this.targetReference = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.LottieListener
        public void onResult(LottieComposition lottieComposition) {
            LottieAnimationView lottieAnimationView = this.targetReference.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(lottieComposition);
        }
    }

    public LottieAnimationView(Context context) {
        super(context, null);
        this.loadedListener = new WeakSuccessListener(this);
        this.wrappedFailureListener = new WeakFailureListener(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(null, R.attr.lottieAnimationViewStyle);
    }

    private void cancelLoaderTask() {
        LottieTask<LottieComposition> lottieTask = this.compositionTask;
        if (lottieTask != null) {
            lottieTask.removeListener(this.loadedListener);
            this.compositionTask.removeFailureListener(this.wrappedFailureListener);
        }
    }

    private void clearComposition() {
        this.lottieDrawable.clearComposition();
    }

    private LottieTask<LottieComposition> fromAssets(String str) {
        if (isInEditMode()) {
            return new LottieTask<>(new b(0, this, str), true);
        }
        if (this.cacheComposition) {
            return LottieCompositionFactory.fromAsset(getContext(), str);
        }
        return LottieCompositionFactory.fromAsset(getContext(), str, null);
    }

    private LottieTask<LottieComposition> fromRawRes(final int i4) {
        if (isInEditMode()) {
            return new LottieTask<>(new Callable() { // from class: com.airbnb.lottie.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieResult lambda$fromRawRes$1;
                    lambda$fromRawRes$1 = LottieAnimationView.this.lambda$fromRawRes$1(i4);
                    return lambda$fromRawRes$1;
                }
            }, true);
        }
        if (this.cacheComposition) {
            return LottieCompositionFactory.fromRawRes(getContext(), i4);
        }
        return LottieCompositionFactory.fromRawRes(getContext(), i4, null);
    }

    private void init(AttributeSet attributeSet, int i4) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LottieAnimationView, i4, 0);
        this.cacheComposition = obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_cacheComposition, true);
        int i5 = R.styleable.LottieAnimationView_lottie_rawRes;
        boolean hasValue = obtainStyledAttributes.hasValue(i5);
        int i10 = R.styleable.LottieAnimationView_lottie_fileName;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i10);
        int i11 = R.styleable.LottieAnimationView_lottie_url;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i11);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i5, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i10);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i11)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(R.styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.autoPlay = true;
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_loop, false)) {
            this.lottieDrawable.setRepeatCount(-1);
        }
        int i12 = R.styleable.LottieAnimationView_lottie_repeatMode;
        if (obtainStyledAttributes.hasValue(i12)) {
            setRepeatMode(obtainStyledAttributes.getInt(i12, 1));
        }
        int i13 = R.styleable.LottieAnimationView_lottie_repeatCount;
        if (obtainStyledAttributes.hasValue(i13)) {
            setRepeatCount(obtainStyledAttributes.getInt(i13, -1));
        }
        int i14 = R.styleable.LottieAnimationView_lottie_speed;
        if (obtainStyledAttributes.hasValue(i14)) {
            setSpeed(obtainStyledAttributes.getFloat(i14, 1.0f));
        }
        int i15 = R.styleable.LottieAnimationView_lottie_clipToCompositionBounds;
        if (obtainStyledAttributes.hasValue(i15)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i15, true));
        }
        int i16 = R.styleable.LottieAnimationView_lottie_clipTextToBoundingBox;
        if (obtainStyledAttributes.hasValue(i16)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(i16, false));
        }
        int i17 = R.styleable.LottieAnimationView_lottie_defaultFontFileExtension;
        if (obtainStyledAttributes.hasValue(i17)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(i17));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
        int i18 = R.styleable.LottieAnimationView_lottie_progress;
        setProgressInternal(obtainStyledAttributes.getFloat(i18, 0.0f), obtainStyledAttributes.hasValue(i18));
        enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_applyOpacityToLayers, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_applyShadowToLayers, true));
        int i19 = R.styleable.LottieAnimationView_lottie_colorFilter;
        if (obtainStyledAttributes.hasValue(i19)) {
            addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.COLOR_FILTER, (LottieValueCallback<KeyPath>) new LottieValueCallback(new SimpleColorFilter(AbstractC1735d.charlie(obtainStyledAttributes.getResourceId(i19, -1), getContext()).getDefaultColor())));
        }
        int i20 = R.styleable.LottieAnimationView_lottie_renderMode;
        if (obtainStyledAttributes.hasValue(i20)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int i21 = obtainStyledAttributes.getInt(i20, renderMode.ordinal());
            if (i21 >= RenderMode.values().length) {
                i21 = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[i21]);
        }
        int i22 = R.styleable.LottieAnimationView_lottie_asyncUpdates;
        if (obtainStyledAttributes.hasValue(i22)) {
            AsyncUpdates asyncUpdates = AsyncUpdates.AUTOMATIC;
            int i23 = obtainStyledAttributes.getInt(i22, asyncUpdates.ordinal());
            if (i23 >= RenderMode.values().length) {
                i23 = asyncUpdates.ordinal();
            }
            setAsyncUpdates(AsyncUpdates.values()[i23]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        int i24 = R.styleable.LottieAnimationView_lottie_useCompositionFrameRate;
        if (obtainStyledAttributes.hasValue(i24)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(i24, false));
        }
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ LottieResult lambda$fromAssets$2(String str) throws Exception {
        if (this.cacheComposition) {
            return LottieCompositionFactory.fromAssetSync(getContext(), str);
        }
        return LottieCompositionFactory.fromAssetSync(getContext(), str, null);
    }

    public /* synthetic */ LottieResult lambda$fromRawRes$1(int i4) throws Exception {
        if (this.cacheComposition) {
            return LottieCompositionFactory.fromRawResSync(getContext(), i4);
        }
        return LottieCompositionFactory.fromRawResSync(getContext(), i4, null);
    }

    public static /* synthetic */ void lambda$static$0(Throwable th) {
        if (Utils.isNetworkException(th)) {
            Logger.warning("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    private void setCompositionTask(LottieTask<LottieComposition> lottieTask) {
        LottieResult<LottieComposition> result = lottieTask.getResult();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (result != null && lottieDrawable == getDrawable() && lottieDrawable.getComposition() == result.getValue()) {
            return;
        }
        this.userActionsTaken.add(UserActionTaken.SET_ANIMATION);
        clearComposition();
        cancelLoaderTask();
        this.compositionTask = lottieTask.addListener(this.loadedListener).addFailureListener(this.wrappedFailureListener);
    }

    private void setLottieDrawable() {
        boolean isAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.lottieDrawable);
        if (isAnimating) {
            this.lottieDrawable.resumeAnimation();
        }
    }

    private void setProgressInternal(float f5, boolean z2) {
        if (z2) {
            this.userActionsTaken.add(UserActionTaken.SET_PROGRESS);
        }
        this.lottieDrawable.setProgress(f5);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.addAnimatorListener(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.addAnimatorPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        LottieComposition composition = getComposition();
        if (composition != null) {
            lottieOnCompositionLoadedListener.onCompositionLoaded(composition);
        }
        return this.lottieOnCompositionLoadedListeners.add(lottieOnCompositionLoadedListener);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t5, LottieValueCallback<T> lottieValueCallback) {
        this.lottieDrawable.addValueCallback(keyPath, (KeyPath) t5, (LottieValueCallback<KeyPath>) lottieValueCallback);
    }

    public void cancelAnimation() {
        this.autoPlay = false;
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.cancelAnimation();
    }

    public <T> void clearValueCallback(KeyPath keyPath, T t5) {
        this.lottieDrawable.addValueCallback(keyPath, (KeyPath) t5, (LottieValueCallback<KeyPath>) null);
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.lottieDrawable.disableExtraScaleModeInFitXY();
    }

    public void enableFeatureFlag(LottieFeatureFlag lottieFeatureFlag, boolean z2) {
        this.lottieDrawable.enableFeatureFlag(lottieFeatureFlag, z2);
    }

    public void enableMergePathsForKitKatAndAbove(boolean z2) {
        this.lottieDrawable.enableFeatureFlag(LottieFeatureFlag.MergePathsApi19, z2);
    }

    public AsyncUpdates getAsyncUpdates() {
        return this.lottieDrawable.getAsyncUpdates();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.lottieDrawable.getAsyncUpdatesEnabled();
    }

    public boolean getClipTextToBoundingBox() {
        return this.lottieDrawable.getClipTextToBoundingBox();
    }

    public boolean getClipToCompositionBounds() {
        return this.lottieDrawable.getClipToCompositionBounds();
    }

    public LottieComposition getComposition() {
        Drawable drawable = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable == lottieDrawable) {
            return lottieDrawable.getComposition();
        }
        return null;
    }

    public long getDuration() {
        if (getComposition() != null) {
            return r0.getDuration();
        }
        return 0L;
    }

    public int getFrame() {
        return this.lottieDrawable.getFrame();
    }

    public String getImageAssetsFolder() {
        return this.lottieDrawable.getImageAssetsFolder();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.lottieDrawable.getMaintainOriginalImageBounds();
    }

    public float getMaxFrame() {
        return this.lottieDrawable.getMaxFrame();
    }

    public float getMinFrame() {
        return this.lottieDrawable.getMinFrame();
    }

    public PerformanceTracker getPerformanceTracker() {
        return this.lottieDrawable.getPerformanceTracker();
    }

    public float getProgress() {
        return this.lottieDrawable.getProgress();
    }

    public RenderMode getRenderMode() {
        return this.lottieDrawable.getRenderMode();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.getRepeatMode();
    }

    public float getSpeed() {
        return this.lottieDrawable.getSpeed();
    }

    public boolean hasMasks() {
        return this.lottieDrawable.hasMasks();
    }

    public boolean hasMatte() {
        return this.lottieDrawable.hasMatte();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).getRenderMode() == RenderMode.SOFTWARE) {
            this.lottieDrawable.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.lottieDrawable.isAnimating();
    }

    public boolean isFeatureFlagEnabled(LottieFeatureFlag lottieFeatureFlag) {
        return this.lottieDrawable.isFeatureFlagEnabled(lottieFeatureFlag);
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.isFeatureFlagEnabled(LottieFeatureFlag.MergePathsApi19);
    }

    @Deprecated
    public void loop(boolean z2) {
        int i4;
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (z2) {
            i4 = -1;
        } else {
            i4 = 0;
        }
        lottieDrawable.setRepeatCount(i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.autoPlay) {
            this.lottieDrawable.playAnimation();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i4;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.animationName = savedState.animationName;
        Set<UserActionTaken> set = this.userActionsTaken;
        UserActionTaken userActionTaken = UserActionTaken.SET_ANIMATION;
        if (!set.contains(userActionTaken) && !TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = savedState.animationResId;
        if (!this.userActionsTaken.contains(userActionTaken) && (i4 = this.animationResId) != 0) {
            setAnimation(i4);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_PROGRESS)) {
            setProgressInternal(savedState.progress, false);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.PLAY_OPTION) && savedState.isAnimating) {
            playAnimation();
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.imageAssetsFolder);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.repeatMode);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            setRepeatCount(savedState.repeatCount);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.animationName = this.animationName;
        savedState.animationResId = this.animationResId;
        savedState.progress = this.lottieDrawable.getProgress();
        savedState.isAnimating = this.lottieDrawable.isAnimatingOrWillAnimateOnVisible();
        savedState.imageAssetsFolder = this.lottieDrawable.getImageAssetsFolder();
        savedState.repeatMode = this.lottieDrawable.getRepeatMode();
        savedState.repeatCount = this.lottieDrawable.getRepeatCount();
        return savedState;
    }

    public void pauseAnimation() {
        this.autoPlay = false;
        this.lottieDrawable.pauseAnimation();
    }

    public void playAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.playAnimation();
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.removeAllAnimatorListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        this.lottieDrawable.removeAllUpdateListeners();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.removeAnimatorListener(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.removeAnimatorPauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        return this.lottieOnCompositionLoadedListeners.remove(lottieOnCompositionLoadedListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        return this.lottieDrawable.resolveKeyPath(keyPath);
    }

    public void resumeAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.resumeAnimation();
    }

    public void reverseAnimationSpeed() {
        this.lottieDrawable.reverseAnimationSpeed();
    }

    public void setAnimation(int i4) {
        this.animationResId = i4;
        this.animationName = null;
        setCompositionTask(fromRawRes(i4));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.cacheComposition ? LottieCompositionFactory.fromUrl(getContext(), str) : LottieCompositionFactory.fromUrl(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z2) {
        this.lottieDrawable.setApplyingOpacityToLayersEnabled(z2);
    }

    public void setApplyingShadowToLayersEnabled(boolean z2) {
        this.lottieDrawable.setApplyingShadowToLayersEnabled(z2);
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.lottieDrawable.setAsyncUpdates(asyncUpdates);
    }

    public void setCacheComposition(boolean z2) {
        this.cacheComposition = z2;
    }

    public void setClipTextToBoundingBox(boolean z2) {
        this.lottieDrawable.setClipTextToBoundingBox(z2);
    }

    public void setClipToCompositionBounds(boolean z2) {
        this.lottieDrawable.setClipToCompositionBounds(z2);
    }

    public void setComposition(LottieComposition lottieComposition) {
        if (L.DBG) {
            Log.v(TAG, "Set Composition \n" + lottieComposition);
        }
        this.lottieDrawable.setCallback(this);
        this.ignoreUnschedule = true;
        boolean composition = this.lottieDrawable.setComposition(lottieComposition);
        if (this.autoPlay) {
            this.lottieDrawable.playAnimation();
        }
        this.ignoreUnschedule = false;
        if (getDrawable() != this.lottieDrawable || composition) {
            if (!composition) {
                setLottieDrawable();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<LottieOnCompositionLoadedListener> it = this.lottieOnCompositionLoadedListeners.iterator();
            while (it.hasNext()) {
                it.next().onCompositionLoaded(lottieComposition);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.lottieDrawable.setDefaultFontFileExtension(str);
    }

    public void setFailureListener(LottieListener<Throwable> lottieListener) {
        this.failureListener = lottieListener;
    }

    public void setFallbackResource(int i4) {
        this.fallbackResource = i4;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.lottieDrawable.setFontAssetDelegate(fontAssetDelegate);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.lottieDrawable.setFontMap(map);
    }

    public void setFrame(int i4) {
        this.lottieDrawable.setFrame(i4);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z2) {
        this.lottieDrawable.setIgnoreDisabledSystemAnimations(z2);
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.lottieDrawable.setImageAssetDelegate(imageAssetDelegate);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.setImagesAssetsFolder(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i4) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageResource(i4);
    }

    public void setMaintainOriginalImageBounds(boolean z2) {
        this.lottieDrawable.setMaintainOriginalImageBounds(z2);
    }

    public void setMaxFrame(int i4) {
        this.lottieDrawable.setMaxFrame(i4);
    }

    public void setMaxProgress(float f5) {
        this.lottieDrawable.setMaxProgress(f5);
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxProgress(float f5, float f10) {
        this.lottieDrawable.setMinAndMaxProgress(f5, f10);
    }

    public void setMinFrame(int i4) {
        this.lottieDrawable.setMinFrame(i4);
    }

    public void setMinProgress(float f5) {
        this.lottieDrawable.setMinProgress(f5);
    }

    public void setOutlineMasksAndMattes(boolean z2) {
        this.lottieDrawable.setOutlineMasksAndMattes(z2);
    }

    public void setPerformanceTrackingEnabled(boolean z2) {
        this.lottieDrawable.setPerformanceTrackingEnabled(z2);
    }

    public void setProgress(float f5) {
        setProgressInternal(f5, true);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.lottieDrawable.setRenderMode(renderMode);
    }

    public void setRepeatCount(int i4) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_COUNT);
        this.lottieDrawable.setRepeatCount(i4);
    }

    public void setRepeatMode(int i4) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_MODE);
        this.lottieDrawable.setRepeatMode(i4);
    }

    public void setSafeMode(boolean z2) {
        this.lottieDrawable.setSafeMode(z2);
    }

    public void setSpeed(float f5) {
        this.lottieDrawable.setSpeed(f5);
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.lottieDrawable.setTextDelegate(textDelegate);
    }

    public void setUseCompositionFrameRate(boolean z2) {
        this.lottieDrawable.setUseCompositionFrameRate(z2);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.ignoreUnschedule && drawable == (lottieDrawable = this.lottieDrawable) && lottieDrawable.isAnimating()) {
            pauseAnimation();
        } else if (!this.ignoreUnschedule && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.isAnimating()) {
                lottieDrawable2.pauseAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        return this.lottieDrawable.updateBitmap(str, bitmap);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t5, SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        this.lottieDrawable.addValueCallback(keyPath, (KeyPath) t5, (LottieValueCallback<KeyPath>) new LottieValueCallback<T>(this) { // from class: com.airbnb.lottie.LottieAnimationView.1
            final /* synthetic */ LottieAnimationView this$0;
            final /* synthetic */ SimpleLottieValueCallback val$callback;

            public AnonymousClass1(LottieAnimationView this, SimpleLottieValueCallback simpleLottieValueCallback2) {
                r2 = simpleLottieValueCallback2;
                this.this$0 = this;
            }

            @Override // com.airbnb.lottie.value.LottieValueCallback
            public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                return (T) r2.getValue(lottieFrameInfo);
            }
        });
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.setMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z2) {
        this.lottieDrawable.setMinAndMaxFrame(str, str2, z2);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.setMinFrame(str);
    }

    public void setMinAndMaxFrame(int i4, int i5) {
        this.lottieDrawable.setMinAndMaxFrame(i4, i5);
    }

    public void setAnimation(String str) {
        this.animationName = str;
        this.animationResId = 0;
        setCompositionTask(fromAssets(str));
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(LottieCompositionFactory.fromUrl(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(LottieCompositionFactory.fromJsonInputStream(inputStream, str));
    }

    public void setAnimation(ZipInputStream zipInputStream, String str) {
        setCompositionTask(LottieCompositionFactory.fromZipStream(zipInputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadedListener = new WeakSuccessListener(this);
        this.wrappedFailureListener = new WeakFailureListener(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.loadedListener = new WeakSuccessListener(this);
        this.wrappedFailureListener = new WeakFailureListener(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, i4);
    }
}
