package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.Collections;

/* loaded from: classes3.dex */
public class SplitDimensionPathKeyframeAnimation extends BaseKeyframeAnimation<PointF, PointF> {
    private final PointF point;
    private final PointF pointWithCallbackValues;
    private final BaseKeyframeAnimation<Float, Float> xAnimation;
    protected LottieValueCallback<Float> xValueCallback;
    private final BaseKeyframeAnimation<Float, Float> yAnimation;
    protected LottieValueCallback<Float> yValueCallback;

    public SplitDimensionPathKeyframeAnimation(BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation, BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2) {
        super(Collections.EMPTY_LIST);
        this.point = new PointF();
        this.pointWithCallbackValues = new PointF();
        this.xAnimation = baseKeyframeAnimation;
        this.yAnimation = baseKeyframeAnimation2;
        setProgress(getProgress());
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void setProgress(float f5) {
        this.xAnimation.setProgress(f5);
        this.yAnimation.setProgress(f5);
        this.point.set(this.xAnimation.getValue().floatValue(), this.yAnimation.getValue().floatValue());
        for (int i4 = 0; i4 < this.listeners.size(); i4++) {
            this.listeners.get(i4).onValueChanged();
        }
    }

    public void setXValueCallback(LottieValueCallback<Float> lottieValueCallback) {
        LottieValueCallback<Float> lottieValueCallback2 = this.xValueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.xValueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    public void setYValueCallback(LottieValueCallback<Float> lottieValueCallback) {
        LottieValueCallback<Float> lottieValueCallback2 = this.yValueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.yValueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public PointF getValue() {
        return getValue((Keyframe<PointF>) null, 0.0f);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public PointF getValue(Keyframe<PointF> keyframe, float f5) {
        Float f10;
        Keyframe<Float> currentKeyframe;
        Keyframe<Float> currentKeyframe2;
        Float f11 = null;
        if (this.xValueCallback == null || (currentKeyframe2 = this.xAnimation.getCurrentKeyframe()) == null) {
            f10 = null;
        } else {
            Float f12 = currentKeyframe2.endFrame;
            LottieValueCallback<Float> lottieValueCallback = this.xValueCallback;
            float f13 = currentKeyframe2.startFrame;
            f10 = lottieValueCallback.getValueInternal(f13, f12 == null ? f13 : f12.floatValue(), currentKeyframe2.startValue, currentKeyframe2.endValue, this.xAnimation.getInterpolatedCurrentKeyframeProgress(), this.xAnimation.getLinearCurrentKeyframeProgress(), this.xAnimation.getProgress());
        }
        if (this.yValueCallback != null && (currentKeyframe = this.yAnimation.getCurrentKeyframe()) != null) {
            Float f14 = currentKeyframe.endFrame;
            LottieValueCallback<Float> lottieValueCallback2 = this.yValueCallback;
            float f15 = currentKeyframe.startFrame;
            f11 = lottieValueCallback2.getValueInternal(f15, f14 == null ? f15 : f14.floatValue(), currentKeyframe.startValue, currentKeyframe.endValue, this.yAnimation.getInterpolatedCurrentKeyframeProgress(), this.yAnimation.getLinearCurrentKeyframeProgress(), this.yAnimation.getProgress());
        }
        if (f10 == null) {
            this.pointWithCallbackValues.set(this.point.x, 0.0f);
        } else {
            this.pointWithCallbackValues.set(f10.floatValue(), 0.0f);
        }
        if (f11 == null) {
            PointF pointF = this.pointWithCallbackValues;
            pointF.set(pointF.x, this.point.y);
        } else {
            PointF pointF2 = this.pointWithCallbackValues;
            pointF2.set(pointF2.x, f11.floatValue());
        }
        return this.pointWithCallbackValues;
    }
}
