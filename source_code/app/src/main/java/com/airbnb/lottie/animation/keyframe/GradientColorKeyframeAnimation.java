package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* loaded from: classes3.dex */
public class GradientColorKeyframeAnimation extends KeyframeAnimation<GradientColor> {
    private final GradientColor gradientColor;

    public GradientColorKeyframeAnimation(List<Keyframe<GradientColor>> list) {
        super(list);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            GradientColor gradientColor = list.get(i5).startValue;
            if (gradientColor != null) {
                i4 = Math.max(i4, gradientColor.getSize());
            }
        }
        this.gradientColor = new GradientColor(new float[i4], new int[i4]);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f5) {
        return getValue((Keyframe<GradientColor>) keyframe, f5);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public GradientColor getValue(Keyframe<GradientColor> keyframe, float f5) {
        this.gradientColor.lerp(keyframe.startValue, keyframe.endValue, f5);
        return this.gradientColor;
    }
}
