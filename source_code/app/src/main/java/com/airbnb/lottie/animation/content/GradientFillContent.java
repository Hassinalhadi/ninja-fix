package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import bv.u;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientFill;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.DropShadow;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class GradientFillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private static final int CACHE_STEPS_MS = 32;
    private BaseKeyframeAnimation<Float, Float> blurAnimation;
    float blurMaskFilterRadius;
    private final RectF boundsRect;
    private final int cacheSteps;
    private final BaseKeyframeAnimation<GradientColor, GradientColor> colorAnimation;
    private ValueCallbackKeyframeAnimation colorCallbackAnimation;
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> colorFilterAnimation;
    private final BaseKeyframeAnimation<PointF, PointF> endPointAnimation;
    private final boolean hidden;
    private final BaseLayer layer;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<Integer, Integer> opacityAnimation;
    private final Paint paint;
    private final Path path;
    private final List<PathContent> paths;
    private final BaseKeyframeAnimation<PointF, PointF> startPointAnimation;
    private final GradientType type;
    private final u linearGradientCache = new u((Object) null);
    private final u radialGradientCache = new u((Object) null);

    public GradientFillContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer, GradientFill gradientFill) {
        Path path = new Path();
        this.path = path;
        this.paint = new LPaint(1);
        this.boundsRect = new RectF();
        this.paths = new ArrayList();
        this.blurMaskFilterRadius = 0.0f;
        this.layer = baseLayer;
        this.name = gradientFill.getName();
        this.hidden = gradientFill.isHidden();
        this.lottieDrawable = lottieDrawable;
        this.type = gradientFill.getGradientType();
        path.setFillType(gradientFill.getFillType());
        this.cacheSteps = (int) (lottieComposition.getDuration() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation = gradientFill.getGradientColor().createAnimation();
        this.colorAnimation = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation);
        BaseKeyframeAnimation<Integer, Integer> createAnimation2 = gradientFill.getOpacity().createAnimation();
        this.opacityAnimation = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation2);
        BaseKeyframeAnimation<PointF, PointF> createAnimation3 = gradientFill.getStartPoint().createAnimation();
        this.startPointAnimation = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation3);
        BaseKeyframeAnimation<PointF, PointF> createAnimation4 = gradientFill.getEndPoint().createAnimation();
        this.endPointAnimation = createAnimation4;
        createAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation4);
        if (baseLayer.getBlurEffect() != null) {
            FloatKeyframeAnimation createAnimation5 = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.blurAnimation = createAnimation5;
            createAnimation5.addUpdateListener(this);
            baseLayer.addAnimation(this.blurAnimation);
        }
    }

    private int[] applyDynamicColorsIfNeeded(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.colorCallbackAnimation;
        if (valueCallbackKeyframeAnimation != null) {
            Integer[] numArr = (Integer[]) valueCallbackKeyframeAnimation.getValue();
            int i4 = 0;
            if (iArr.length == numArr.length) {
                while (i4 < iArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i4 < numArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            }
        }
        return iArr;
    }

    private int getGradientHash() {
        int i4;
        int round = Math.round(this.startPointAnimation.getProgress() * this.cacheSteps);
        int round2 = Math.round(this.endPointAnimation.getProgress() * this.cacheSteps);
        int round3 = Math.round(this.colorAnimation.getProgress() * this.cacheSteps);
        if (round != 0) {
            i4 = 527 * round;
        } else {
            i4 = 17;
        }
        if (round2 != 0) {
            i4 = i4 * 31 * round2;
        }
        if (round3 != 0) {
            return i4 * 31 * round3;
        }
        return i4;
    }

    private LinearGradient getLinearGradient() {
        float[] fArr;
        int[] iArr;
        long gradientHash = getGradientHash();
        LinearGradient linearGradient = (LinearGradient) this.linearGradientCache.delta(gradientHash);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF value = this.startPointAnimation.getValue();
        PointF value2 = this.endPointAnimation.getValue();
        GradientColor value3 = this.colorAnimation.getValue();
        int[] applyDynamicColorsIfNeeded = applyDynamicColorsIfNeeded(value3.getColors());
        float[] positions = value3.getPositions();
        if (applyDynamicColorsIfNeeded.length < 2) {
            iArr = new int[]{applyDynamicColorsIfNeeded[0], applyDynamicColorsIfNeeded[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = positions;
            iArr = applyDynamicColorsIfNeeded;
        }
        LinearGradient linearGradient2 = new LinearGradient(value.x, value.y, value2.x, value2.y, iArr, fArr, Shader.TileMode.CLAMP);
        this.linearGradientCache.hotel(gradientHash, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient getRadialGradient() {
        float[] fArr;
        int[] iArr;
        long gradientHash = getGradientHash();
        RadialGradient radialGradient = (RadialGradient) this.radialGradientCache.delta(gradientHash);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF value = this.startPointAnimation.getValue();
        PointF value2 = this.endPointAnimation.getValue();
        GradientColor value3 = this.colorAnimation.getValue();
        int[] applyDynamicColorsIfNeeded = applyDynamicColorsIfNeeded(value3.getColors());
        float[] positions = value3.getPositions();
        if (applyDynamicColorsIfNeeded.length < 2) {
            iArr = new int[]{applyDynamicColorsIfNeeded[0], applyDynamicColorsIfNeeded[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = positions;
            iArr = applyDynamicColorsIfNeeded;
        }
        float f5 = value.x;
        float f10 = value.y;
        float hypot = (float) Math.hypot(value2.x - f5, value2.y - f10);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f5, f10, hypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.radialGradientCache.hotel(gradientHash, radialGradient2);
        return radialGradient2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t5, LottieValueCallback<T> lottieValueCallback) {
        if (t5 == LottieProperty.OPACITY) {
            this.opacityAnimation.setValueCallback(lottieValueCallback);
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
        if (t5 == LottieProperty.GRADIENT_COLOR) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.colorCallbackAnimation;
            if (valueCallbackKeyframeAnimation2 != null) {
                this.layer.removeAnimation(valueCallbackKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.colorCallbackAnimation = null;
                return;
            }
            this.linearGradientCache.bravo();
            this.radialGradientCache.bravo();
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.colorCallbackAnimation = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            this.layer.addAnimation(this.colorCallbackAnimation);
            return;
        }
        if (t5 == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.blurAnimation;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.blurAnimation = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            this.layer.addAnimation(this.blurAnimation);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i4, DropShadow dropShadow) {
        Shader radialGradient;
        if (!this.hidden) {
            if (L.isTraceEnabled()) {
                L.beginSection("GradientFillContent#draw");
            }
            this.path.reset();
            for (int i5 = 0; i5 < this.paths.size(); i5++) {
                this.path.addPath(this.paths.get(i5).getPath(), matrix);
            }
            this.path.computeBounds(this.boundsRect, false);
            if (this.type == GradientType.LINEAR) {
                radialGradient = getLinearGradient();
            } else {
                radialGradient = getRadialGradient();
            }
            radialGradient.setLocalMatrix(matrix);
            this.paint.setShader(radialGradient);
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
                    this.paint.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
                }
                this.blurMaskFilterRadius = floatValue;
            }
            float intValue = this.opacityAnimation.getValue().intValue() / 100.0f;
            this.paint.setAlpha(MiscUtils.clamp((int) (i4 * intValue), 0, 255));
            if (dropShadow != null) {
                dropShadow.applyWithAlpha((int) (intValue * 255.0f), this.paint);
            }
            canvas.drawPath(this.path, this.paint);
            if (L.isTraceEnabled()) {
                L.endSection("GradientFillContent#draw");
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z2) {
        this.path.reset();
        for (int i4 = 0; i4 < this.paths.size(); i4++) {
            this.path.addPath(this.paths.get(i4).getPath(), matrix);
        }
        this.path.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
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
        for (int i4 = 0; i4 < list2.size(); i4++) {
            Content content = list2.get(i4);
            if (content instanceof PathContent) {
                this.paths.add((PathContent) content);
            }
        }
    }
}
