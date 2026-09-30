package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class PathKeyframeAnimation extends KeyframeAnimation<PointF> {
    private final PathMeasure pathMeasure;
    private PathKeyframe pathMeasureKeyframe;
    private final PointF point;
    private final float[] pos;
    private final float[] tangent;

    public PathKeyframeAnimation(List<? extends Keyframe<PointF>> list) {
        super(list);
        this.point = new PointF();
        this.pos = new float[2];
        this.tangent = new float[2];
        this.pathMeasure = new PathMeasure();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f5) {
        return getValue((Keyframe<PointF>) keyframe, f5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public PointF getValue(Keyframe<PointF> keyframe, float f5) {
        float f10;
        PathKeyframe pathKeyframe = (PathKeyframe) keyframe;
        Path path = pathKeyframe.getPath();
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        if (lottieValueCallback == 0 || keyframe.endFrame == null) {
            f10 = f5;
        } else {
            f10 = f5;
            PointF pointF = (PointF) lottieValueCallback.getValueInternal(pathKeyframe.startFrame, pathKeyframe.endFrame.floatValue(), (PointF) pathKeyframe.startValue, (PointF) pathKeyframe.endValue, getLinearCurrentKeyframeProgress(), f10, getProgress());
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return keyframe.startValue;
        }
        if (this.pathMeasureKeyframe != pathKeyframe) {
            this.pathMeasure.setPath(path, false);
            this.pathMeasureKeyframe = pathKeyframe;
        }
        float length = this.pathMeasure.getLength();
        float f11 = f10 * length;
        this.pathMeasure.getPosTan(f11, this.pos, this.tangent);
        PointF pointF2 = this.point;
        float[] fArr = this.pos;
        pointF2.set(fArr[0], fArr[1]);
        if (f11 < 0.0f) {
            PointF pointF3 = this.point;
            float[] fArr2 = this.tangent;
            pointF3.offset(fArr2[0] * f11, fArr2[1] * f11);
        } else if (f11 > length) {
            PointF pointF4 = this.point;
            float[] fArr3 = this.tangent;
            float f12 = f11 - length;
            pointF4.offset(fArr3[0] * f12, fArr3[1] * f12);
        }
        return this.point;
    }
}
