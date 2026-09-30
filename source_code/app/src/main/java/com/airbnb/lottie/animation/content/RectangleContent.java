package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.RectangleShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class RectangleContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, PathContent {
    private final BaseKeyframeAnimation<?, Float> cornerRadiusAnimation;
    private final boolean hidden;
    private boolean isPathValid;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<?, PointF> positionAnimation;
    private final BaseKeyframeAnimation<?, PointF> sizeAnimation;
    private final Path path = new Path();
    private final RectF rect = new RectF();
    private final CompoundTrimPathContent trimPaths = new CompoundTrimPathContent();
    private BaseKeyframeAnimation<Float, Float> roundedCornersAnimation = null;

    public RectangleContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RectangleShape rectangleShape) {
        this.name = rectangleShape.getName();
        this.hidden = rectangleShape.isHidden();
        this.lottieDrawable = lottieDrawable;
        BaseKeyframeAnimation<PointF, PointF> createAnimation = rectangleShape.getPosition().createAnimation();
        this.positionAnimation = createAnimation;
        BaseKeyframeAnimation<PointF, PointF> createAnimation2 = rectangleShape.getSize().createAnimation();
        this.sizeAnimation = createAnimation2;
        FloatKeyframeAnimation createAnimation3 = rectangleShape.getCornerRadius().createAnimation();
        this.cornerRadiusAnimation = createAnimation3;
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        baseLayer.addAnimation(createAnimation3);
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
    }

    private void invalidate() {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t5, LottieValueCallback<T> lottieValueCallback) {
        if (t5 == LottieProperty.RECTANGLE_SIZE) {
            this.sizeAnimation.setValueCallback(lottieValueCallback);
        } else if (t5 == LottieProperty.POSITION) {
            this.positionAnimation.setValueCallback(lottieValueCallback);
        } else if (t5 == LottieProperty.CORNER_RADIUS) {
            this.cornerRadiusAnimation.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        float floatValue;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation;
        if (this.isPathValid) {
            return this.path;
        }
        this.path.reset();
        if (this.hidden) {
            this.isPathValid = true;
            return this.path;
        }
        PointF value = this.sizeAnimation.getValue();
        float f5 = value.x / 2.0f;
        float f10 = value.y / 2.0f;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.cornerRadiusAnimation;
        if (baseKeyframeAnimation2 == null) {
            floatValue = 0.0f;
        } else {
            floatValue = ((FloatKeyframeAnimation) baseKeyframeAnimation2).getFloatValue();
        }
        if (floatValue == 0.0f && (baseKeyframeAnimation = this.roundedCornersAnimation) != null) {
            floatValue = Math.min(baseKeyframeAnimation.getValue().floatValue(), Math.min(f5, f10));
        }
        float min = Math.min(f5, f10);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF value2 = this.positionAnimation.getValue();
        this.path.moveTo(value2.x + f5, (value2.y - f10) + floatValue);
        this.path.lineTo(value2.x + f5, (value2.y + f10) - floatValue);
        if (floatValue > 0.0f) {
            RectF rectF = this.rect;
            float f11 = value2.x;
            float f12 = floatValue * 2.0f;
            float f13 = value2.y;
            rectF.set((f11 + f5) - f12, (f13 + f10) - f12, f11 + f5, f13 + f10);
            this.path.arcTo(this.rect, 0.0f, 90.0f, false);
        }
        this.path.lineTo((value2.x - f5) + floatValue, value2.y + f10);
        if (floatValue > 0.0f) {
            RectF rectF2 = this.rect;
            float f14 = value2.x;
            float f15 = value2.y;
            float f16 = floatValue * 2.0f;
            rectF2.set(f14 - f5, (f15 + f10) - f16, (f14 - f5) + f16, f15 + f10);
            this.path.arcTo(this.rect, 90.0f, 90.0f, false);
        }
        this.path.lineTo(value2.x - f5, (value2.y - f10) + floatValue);
        if (floatValue > 0.0f) {
            RectF rectF3 = this.rect;
            float f17 = value2.x;
            float f18 = value2.y;
            float f19 = floatValue * 2.0f;
            rectF3.set(f17 - f5, f18 - f10, (f17 - f5) + f19, (f18 - f10) + f19);
            this.path.arcTo(this.rect, 180.0f, 90.0f, false);
        }
        this.path.lineTo((value2.x + f5) - floatValue, value2.y - f10);
        if (floatValue > 0.0f) {
            RectF rectF4 = this.rect;
            float f20 = value2.x;
            float f21 = floatValue * 2.0f;
            float f22 = value2.y;
            rectF4.set((f20 + f5) - f21, f22 - f10, f20 + f5, (f22 - f10) + f21);
            this.path.arcTo(this.rect, 270.0f, 90.0f, false);
        }
        this.path.close();
        this.trimPaths.apply(this.path);
        this.isPathValid = true;
        return this.path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        invalidate();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i4, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i4, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            Content content = list.get(i4);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.getType() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.trimPaths.addTrimPath(trimPathContent);
                    trimPathContent.addListener(this);
                }
            }
            if (content instanceof RoundedCornersContent) {
                this.roundedCornersAnimation = ((RoundedCornersContent) content).getRoundedCorners();
            }
        }
    }
}
