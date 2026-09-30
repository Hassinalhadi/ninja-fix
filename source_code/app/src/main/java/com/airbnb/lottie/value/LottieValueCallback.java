package com.airbnb.lottie.value;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;

/* loaded from: classes3.dex */
public class LottieValueCallback<T> {
    private BaseKeyframeAnimation<?, ?> animation;
    private final LottieFrameInfo<T> frameInfo;
    protected T value;

    public LottieValueCallback() {
        this.frameInfo = new LottieFrameInfo<>();
        this.value = null;
    }

    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        return this.value;
    }

    public final T getValueInternal(float f5, float f10, T t5, T t10, float f11, float f12, float f13) {
        return getValue(this.frameInfo.set(f5, f10, t5, t10, f11, f12, f13));
    }

    public final void setAnimation(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.animation = baseKeyframeAnimation;
    }

    public final void setValue(T t5) {
        this.value = t5;
        BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.animation;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.notifyListeners();
        }
    }

    public LottieValueCallback(T t5) {
        this.frameInfo = new LottieFrameInfo<>();
        this.value = t5;
    }
}
