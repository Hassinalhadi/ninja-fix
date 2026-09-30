package com.airbnb.lottie.value;

/* loaded from: classes3.dex */
public class LottieFrameInfo<T> {
    private float endFrame;
    private T endValue;
    private float interpolatedKeyframeProgress;
    private float linearKeyframeProgress;
    private float overallProgress;
    private float startFrame;
    private T startValue;

    public float getEndFrame() {
        return this.endFrame;
    }

    public T getEndValue() {
        return this.endValue;
    }

    public float getInterpolatedKeyframeProgress() {
        return this.interpolatedKeyframeProgress;
    }

    public float getLinearKeyframeProgress() {
        return this.linearKeyframeProgress;
    }

    public float getOverallProgress() {
        return this.overallProgress;
    }

    public float getStartFrame() {
        return this.startFrame;
    }

    public T getStartValue() {
        return this.startValue;
    }

    public LottieFrameInfo<T> set(float f5, float f10, T t5, T t10, float f11, float f12, float f13) {
        this.startFrame = f5;
        this.endFrame = f10;
        this.startValue = t5;
        this.endValue = t10;
        this.linearKeyframeProgress = f11;
        this.interpolatedKeyframeProgress = f12;
        this.overallProgress = f13;
        return this;
    }
}
