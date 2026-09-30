package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class FloatKeyframeAnimation extends KeyframeAnimation<Float> {
    public FloatKeyframeAnimation(List<Keyframe<Float>> list) {
        super(list);
    }

    public float getFloatValue(Keyframe<Float> keyframe, float f5) {
        float f10;
        if (keyframe.startValue != null && keyframe.endValue != null) {
            LottieValueCallback<A> lottieValueCallback = this.valueCallback;
            if (lottieValueCallback != 0) {
                f10 = f5;
                Float f11 = (Float) lottieValueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), keyframe.startValue, keyframe.endValue, f10, getLinearCurrentKeyframeProgress(), getProgress());
                if (f11 != null) {
                    return f11.floatValue();
                }
            } else {
                f10 = f5;
            }
            return MiscUtils.lerp(keyframe.getStartValueFloat(), keyframe.getEndValueFloat(), f10);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f5) {
        return getValue((Keyframe<Float>) keyframe, f5);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public Float getValue(Keyframe<Float> keyframe, float f5) {
        return Float.valueOf(getFloatValue(keyframe, f5));
    }

    public float getFloatValue() {
        return getFloatValue(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
