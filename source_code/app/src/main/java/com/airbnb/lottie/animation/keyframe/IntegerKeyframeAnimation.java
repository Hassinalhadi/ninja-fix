package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class IntegerKeyframeAnimation extends KeyframeAnimation<Integer> {
    public IntegerKeyframeAnimation(List<Keyframe<Integer>> list) {
        super(list);
    }

    public int getIntValue(Keyframe<Integer> keyframe, float f5) {
        float f10;
        if (keyframe.startValue != null) {
            int startValueInt = keyframe.endValue == null ? keyframe.getStartValueInt() : keyframe.getEndValueInt();
            LottieValueCallback<A> lottieValueCallback = this.valueCallback;
            if (lottieValueCallback != 0) {
                f10 = f5;
                Integer num = (Integer) lottieValueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), keyframe.startValue, Integer.valueOf(startValueInt), f10, getLinearCurrentKeyframeProgress(), getProgress());
                if (num != null) {
                    return num.intValue();
                }
            } else {
                f10 = f5;
            }
            return MiscUtils.lerp(keyframe.getStartValueInt(), startValueInt, f10);
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
