package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes3.dex */
abstract class LottieInterpolatedValue<T> extends LottieValueCallback<T> {
    private final T endValue;
    private final Interpolator interpolator;
    private final T startValue;

    public LottieInterpolatedValue(T t5, T t10) {
        this(t5, t10, new LinearInterpolator());
    }

    @Override // com.airbnb.lottie.value.LottieValueCallback
    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        return interpolateValue(this.startValue, this.endValue, this.interpolator.getInterpolation(lottieFrameInfo.getOverallProgress()));
    }

    public abstract T interpolateValue(T t5, T t10, float f5);

    public LottieInterpolatedValue(T t5, T t10, Interpolator interpolator) {
        this.startValue = t5;
        this.endValue = t10;
        this.interpolator = interpolator;
    }
}
