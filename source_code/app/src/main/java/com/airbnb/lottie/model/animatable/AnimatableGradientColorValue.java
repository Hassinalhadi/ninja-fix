package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.value.Keyframe;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor, GradientColor> {
    public AnimatableGradientColorValue(List<Keyframe<GradientColor>> list) {
        super((List) ensureInterpolatableKeyframes(list));
    }

    private static Keyframe<GradientColor> ensureInterpolatableKeyframe(Keyframe<GradientColor> keyframe) {
        GradientColor gradientColor = keyframe.startValue;
        GradientColor gradientColor2 = keyframe.endValue;
        if (gradientColor != null && gradientColor2 != null && gradientColor.getPositions().length != gradientColor2.getPositions().length) {
            float[] mergePositions = mergePositions(gradientColor.getPositions(), gradientColor2.getPositions());
            return keyframe.copyWith(gradientColor.copyWithPositions(mergePositions), gradientColor2.copyWithPositions(mergePositions));
        }
        return keyframe;
    }

    private static List<Keyframe<GradientColor>> ensureInterpolatableKeyframes(List<Keyframe<GradientColor>> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.set(i4, ensureInterpolatableKeyframe(list.get(i4)));
        }
        return list;
    }

    public static float[] mergePositions(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f5 = Float.NaN;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            float f10 = fArr3[i5];
            if (f10 != f5) {
                fArr3[i4] = f10;
                i4++;
                f5 = fArr3[i5];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i4);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation() {
        return new GradientColorKeyframeAnimation(this.keyframes);
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ List getKeyframes() {
        return super.getKeyframes();
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
