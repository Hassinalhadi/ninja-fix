package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import com.airbnb.lottie.utils.MiscUtils;

/* loaded from: classes3.dex */
public class LottieInterpolatedFloatValue extends LottieInterpolatedValue<Float> {
    public LottieInterpolatedFloatValue(Float f5, Float f10) {
        super(f5, f10);
    }

    @Override // com.airbnb.lottie.value.LottieInterpolatedValue, com.airbnb.lottie.value.LottieValueCallback
    public /* bridge */ /* synthetic */ Object getValue(LottieFrameInfo lottieFrameInfo) {
        return super.getValue(lottieFrameInfo);
    }

    public LottieInterpolatedFloatValue(Float f5, Float f10, Interpolator interpolator) {
        super(f5, f10, interpolator);
    }

    @Override // com.airbnb.lottie.value.LottieInterpolatedValue
    public Float interpolateValue(Float f5, Float f10, float f11) {
        return Float.valueOf(MiscUtils.lerp(f5.floatValue(), f10.floatValue(), f11));
    }
}
