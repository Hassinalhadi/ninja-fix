package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class ColorKeyframeAnimation extends KeyframeAnimation<Integer> {
    public ColorKeyframeAnimation(List<Keyframe<Integer>> list) {
        super(list);
    }

    public int getIntValue(Keyframe<Integer> keyframe, float f5) {
        float f10;
        Float f11;
        if (keyframe.startValue != null && keyframe.endValue != null) {
            LottieValueCallback<A> lottieValueCallback = this.valueCallback;
            if (lottieValueCallback == 0 || (f11 = keyframe.endFrame) == null) {
                f10 = f5;
            } else {
                f10 = f5;
                Integer num = (Integer) lottieValueCallback.getValueInternal(keyframe.startFrame, f11.floatValue(), keyframe.startValue, keyframe.endValue, f10, getLinearCurrentKeyframeProgress(), getProgress());
                if (num != null) {
                    return num.intValue();
                }
            }
            return GammaEvaluator.evaluate(MiscUtils.clamp(f10, 0.0f, 1.0f), keyframe.startValue.intValue(), keyframe.endValue.intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f5) {
        return getValue((Keyframe<Integer>) keyframe, f5);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public Integer getValue(Keyframe<Integer> keyframe, float f5) {
        return Integer.valueOf(getIntValue(keyframe, f5));
    }

    public int getIntValue() {
        return getIntValue(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
