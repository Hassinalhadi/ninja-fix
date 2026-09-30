package com.airbnb.lottie.animation.keyframe;

import Q0.c;
import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class PointKeyframeAnimation extends KeyframeAnimation<PointF> {
    private final PointF point;

    public PointKeyframeAnimation(List<Keyframe<PointF>> list) {
        super(list);
        this.point = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f5) {
        return getValue((Keyframe<PointF>) keyframe, f5);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f5, float f10, float f11) {
        return getValue((Keyframe<PointF>) keyframe, f5, f10, f11);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public PointF getValue(Keyframe<PointF> keyframe, float f5) {
        return getValue(keyframe, f5, f5, f5);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public PointF getValue(Keyframe<PointF> keyframe, float f5, float f10, float f11) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = keyframe.startValue;
        if (pointF3 != null && (pointF = keyframe.endValue) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            LottieValueCallback<A> lottieValueCallback = this.valueCallback;
            if (lottieValueCallback != 0 && (pointF2 = (PointF) lottieValueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), pointF4, pointF5, f5, getLinearCurrentKeyframeProgress(), getProgress())) != null) {
                return pointF2;
            }
            PointF pointF6 = this.point;
            float f12 = pointF4.x;
            float lima = c.lima(pointF5.x, f12, f10, f12);
            float f13 = pointF4.y;
            pointF6.set(lima, c.lima(pointF5.y, f13, f11, f13));
            return this.point;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
