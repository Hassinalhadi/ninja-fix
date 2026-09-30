package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.DropShadow;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseStrokeContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, DrawingContent {
    private BaseKeyframeAnimation<Float, Float> blurAnimation;
    float blurMaskFilterRadius;
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> colorFilterAnimation;
    private final List<BaseKeyframeAnimation<?, Float>> dashPatternAnimations;
    private final BaseKeyframeAnimation<?, Float> dashPatternOffsetAnimation;
    private final float[] dashPatternValues;
    protected final BaseLayer layer;
    private final LottieDrawable lottieDrawable;
    private final BaseKeyframeAnimation<?, Integer> opacityAnimation;
    final Paint paint;
    private final BaseKeyframeAnimation<?, Float> widthAnimation;
    private final PathMeasure pm = new PathMeasure();
    private final Path path = new Path();
    private final Path trimPathPath = new Path();
    private final RectF rect = new RectF();
    private final List<PathGroup> pathGroups = new ArrayList();

    /* loaded from: classes3.dex */
    public static final class PathGroup {
        private final List<PathContent> paths;
        private final TrimPathContent trimPath;

        private PathGroup(TrimPathContent trimPathContent) {
            this.paths = new ArrayList();
            this.trimPath = trimPathContent;
        }
    }

    public BaseStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Paint.Cap cap, Paint.Join join, float f5, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue, List<AnimatableFloatValue> list, AnimatableFloatValue animatableFloatValue2) {
        LPaint lPaint = new LPaint(1);
        this.paint = lPaint;
        this.blurMaskFilterRadius = 0.0f;
        this.lottieDrawable = lottieDrawable;
        this.layer = baseLayer;
        lPaint.setStyle(Paint.Style.STROKE);
        lPaint.setStrokeCap(cap);
        lPaint.setStrokeJoin(join);
        lPaint.setStrokeMiter(f5);
        this.opacityAnimation = animatableIntegerValue.createAnimation();
        this.widthAnimation = animatableFloatValue.createAnimation();
        if (animatableFloatValue2 == null) {
            this.dashPatternOffsetAnimation = null;
        } else {
            this.dashPatternOffsetAnimation = animatableFloatValue2.createAnimation();
        }
        this.dashPatternAnimations = new ArrayList(list.size());
        this.dashPatternValues = new float[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.dashPatternAnimations.add(list.get(i4).createAnimation());
        }
        baseLayer.addAnimation(this.opacityAnimation);
        baseLayer.addAnimation(this.widthAnimation);
        for (int i5 = 0; i5 < this.dashPatternAnimations.size(); i5++) {
            baseLayer.addAnimation(this.dashPatternAnimations.get(i5));
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.dashPatternOffsetAnimation;
        if (baseKeyframeAnimation != null) {
            baseLayer.addAnimation(baseKeyframeAnimation);
        }
        this.opacityAnimation.addUpdateListener(this);
        this.widthAnimation.addUpdateListener(this);
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.dashPatternAnimations.get(i10).addUpdateListener(this);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.dashPatternOffsetAnimation;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.addUpdateListener(this);
        }
        if (baseLayer.getBlurEffect() != null) {
            FloatKeyframeAnimation createAnimation = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.blurAnimation = createAnimation;
            createAnimation.addUpdateListener(this);
            baseLayer.addAnimation(this.blurAnimation);
        }
    }

    private void applyDashPatternIfNeeded() {
        float floatValue;
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#applyDashPattern");
        }
        if (this.dashPatternAnimations.isEmpty()) {
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i4 = 0; i4 < this.dashPatternAnimations.size(); i4++) {
            this.dashPatternValues[i4] = this.dashPatternAnimations.get(i4).getValue().floatValue();
            if (i4 % 2 == 0) {
                float[] fArr = this.dashPatternValues;
                if (fArr[i4] < 1.0f) {
                    fArr[i4] = 1.0f;
                }
            } else {
                float[] fArr2 = this.dashPatternValues;
                if (fArr2[i4] < 0.1f) {
                    fArr2[i4] = 0.1f;
                }
            }
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.dashPatternOffsetAnimation;
        if (baseKeyframeAnimation == null) {
            floatValue = 0.0f;
        } else {
            floatValue = baseKeyframeAnimation.getValue().floatValue();
        }
        this.paint.setPathEffect(new DashPathEffect(this.dashPatternValues, floatValue));
        if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#applyDashPattern");
        }
    }

    private void applyTrimPath(Canvas canvas, PathGroup pathGroup) {
        float f5;
        float f10;
        float f11;
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#applyTrimPath");
        }
        if (pathGroup.trimPath == null) {
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.path.reset();
        for (int size = pathGroup.paths.size() - 1; size >= 0; size--) {
            this.path.addPath(((PathContent) pathGroup.paths.get(size)).getPath());
        }
        float floatValue = pathGroup.trimPath.getStart().getValue().floatValue() / 100.0f;
        float floatValue2 = pathGroup.trimPath.getEnd().getValue().floatValue() / 100.0f;
        float floatValue3 = pathGroup.trimPath.getOffset().getValue().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.path, this.paint);
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.pm.setPath(this.path, false);
        float length = this.pm.getLength();
        while (this.pm.nextContour()) {
            length += this.pm.getLength();
        }
        float f12 = floatValue3 * length;
        float f13 = (floatValue * length) + f12;
        float min = Math.min((floatValue2 * length) + f12, (f13 + length) - 1.0f);
        float f14 = 0.0f;
        for (int size2 = pathGroup.paths.size() - 1; size2 >= 0; size2--) {
            this.trimPathPath.set(((PathContent) pathGroup.paths.get(size2)).getPath());
            this.pm.setPath(this.trimPathPath, false);
            float length2 = this.pm.getLength();
            if (min > length) {
                float f15 = min - length;
                if (f15 < f14 + length2 && f14 < f15) {
                    if (f13 > length) {
                        f11 = (f13 - length) / length2;
                    } else {
                        f11 = 0.0f;
                    }
                    Utils.applyTrimPathIfNeeded(this.trimPathPath, f11, Math.min(f15 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.trimPathPath, this.paint);
                    f14 += length2;
                }
            }
            float f16 = f14 + length2;
            if (f16 >= f13 && f14 <= min) {
                if (f16 <= min && f13 < f14) {
                    canvas.drawPath(this.trimPathPath, this.paint);
                } else {
                    if (f13 < f14) {
                        f5 = 0.0f;
                    } else {
                        f5 = (f13 - f14) / length2;
                    }
                    if (min > f16) {
                        f10 = 1.0f;
                    } else {
                        f10 = (min - f14) / length2;
                    }
                    Utils.applyTrimPathIfNeeded(this.trimPathPath, f5, f10, 0.0f);
                    canvas.drawPath(this.trimPathPath, this.paint);
                }
            }
            f14 += length2;
        }
        if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#applyTrimPath");
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t5, LottieValueCallback<T> lottieValueCallback) {
        if (t5 == LottieProperty.OPACITY) {
            this.opacityAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t5 == LottieProperty.STROKE_WIDTH) {
            this.widthAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t5 == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.colorFilterAnimation;
            if (baseKeyframeAnimation != null) {
                this.layer.removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.colorFilterAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.colorFilterAnimation = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.layer.addAnimation(this.colorFilterAnimation);
            return;
        }
        if (t5 == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.blurAnimation;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.blurAnimation = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            this.layer.addAnimation(this.blurAnimation);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i4, DropShadow dropShadow) {
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#draw");
        }
        if (Utils.hasZeroScaleAxis(matrix)) {
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#draw");
                return;
            }
            return;
        }
        float intValue = this.opacityAnimation.getValue().intValue() / 100.0f;
        this.paint.setAlpha(MiscUtils.clamp((int) (i4 * intValue), 0, 255));
        this.paint.setStrokeWidth(((FloatKeyframeAnimation) this.widthAnimation).getFloatValue());
        if (this.paint.getStrokeWidth() <= 0.0f) {
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#draw");
                return;
            }
            return;
        }
        applyDashPatternIfNeeded();
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.colorFilterAnimation;
        if (baseKeyframeAnimation != null) {
            this.paint.setColorFilter(baseKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.blurAnimation;
        if (baseKeyframeAnimation2 != null) {
            float floatValue = baseKeyframeAnimation2.getValue().floatValue();
            if (floatValue == 0.0f) {
                this.paint.setMaskFilter(null);
            } else if (floatValue != this.blurMaskFilterRadius) {
                this.paint.setMaskFilter(this.layer.getBlurMaskFilter(floatValue));
            }
            this.blurMaskFilterRadius = floatValue;
        }
        if (dropShadow != null) {
            dropShadow.applyWithAlpha((int) (intValue * 255.0f), this.paint);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i5 = 0; i5 < this.pathGroups.size(); i5++) {
            PathGroup pathGroup = this.pathGroups.get(i5);
            if (pathGroup.trimPath != null) {
                applyTrimPath(canvas, pathGroup);
            } else {
                if (L.isTraceEnabled()) {
                    L.beginSection("StrokeContent#buildPath");
                }
                this.path.reset();
                for (int size = pathGroup.paths.size() - 1; size >= 0; size--) {
                    this.path.addPath(((PathContent) pathGroup.paths.get(size)).getPath());
                }
                if (L.isTraceEnabled()) {
                    L.endSection("StrokeContent#buildPath");
                    L.beginSection("StrokeContent#drawPath");
                }
                canvas.drawPath(this.path, this.paint);
                if (L.isTraceEnabled()) {
                    L.endSection("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#draw");
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z2) {
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#getBounds");
        }
        this.path.reset();
        for (int i4 = 0; i4 < this.pathGroups.size(); i4++) {
            PathGroup pathGroup = this.pathGroups.get(i4);
            for (int i5 = 0; i5 < pathGroup.paths.size(); i5++) {
                this.path.addPath(((PathContent) pathGroup.paths.get(i5)).getPath(), matrix);
            }
        }
        this.path.computeBounds(this.rect, false);
        float floatValue = ((FloatKeyframeAnimation) this.widthAnimation).getFloatValue();
        RectF rectF2 = this.rect;
        float f5 = floatValue / 2.0f;
        rectF2.set(rectF2.left - f5, rectF2.top - f5, rectF2.right + f5, rectF2.bottom + f5);
        rectF.set(this.rect);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#getBounds");
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i4, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i4, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        TrimPathContent trimPathContent = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = list.get(size);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent2 = (TrimPathContent) content;
                if (trimPathContent2.getType() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    trimPathContent = trimPathContent2;
                }
            }
        }
        if (trimPathContent != null) {
            trimPathContent.addListener(this);
        }
        PathGroup pathGroup = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            Content content2 = list2.get(size2);
            if (content2 instanceof TrimPathContent) {
                TrimPathContent trimPathContent3 = (TrimPathContent) content2;
                if (trimPathContent3.getType() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (pathGroup != null) {
                        this.pathGroups.add(pathGroup);
                    }
                    pathGroup = new PathGroup(trimPathContent3);
                    trimPathContent3.addListener(this);
                }
            }
            if (content2 instanceof PathContent) {
                if (pathGroup == null) {
                    pathGroup = new PathGroup(trimPathContent);
                }
                pathGroup.paths.add((PathContent) content2);
            }
        }
        if (pathGroup != null) {
            this.pathGroups.add(pathGroup);
        }
    }
}
