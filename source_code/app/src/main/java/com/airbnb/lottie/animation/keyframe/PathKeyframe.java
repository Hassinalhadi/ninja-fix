package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;

/* loaded from: classes3.dex */
public class PathKeyframe extends Keyframe<PointF> {
    private Path path;
    private final Keyframe<PointF> pointKeyFrame;

    public PathKeyframe(LottieComposition lottieComposition, Keyframe<PointF> keyframe) {
        super(lottieComposition, keyframe.startValue, keyframe.endValue, keyframe.interpolator, keyframe.xInterpolator, keyframe.yInterpolator, keyframe.startFrame, keyframe.endFrame);
        this.pointKeyFrame = keyframe;
        createPath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void createPath() {
        boolean z2;
        T t5;
        T t10;
        T t11 = this.endValue;
        if (t11 != 0 && (t10 = this.startValue) != 0 && ((PointF) t10).equals(((PointF) t11).x, ((PointF) t11).y)) {
            z2 = true;
        } else {
            z2 = false;
        }
        T t12 = this.startValue;
        if (t12 != 0 && (t5 = this.endValue) != 0 && !z2) {
            Keyframe<PointF> keyframe = this.pointKeyFrame;
            this.path = Utils.createPath((PointF) t12, (PointF) t5, keyframe.pathCp1, keyframe.pathCp2);
        }
    }

    public Path getPath() {
        return this.path;
    }
}
