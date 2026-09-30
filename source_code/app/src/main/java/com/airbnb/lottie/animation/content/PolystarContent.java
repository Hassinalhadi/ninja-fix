package com.airbnb.lottie.animation.content;

import Q0.c;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class PolystarContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private static final float POLYGON_MAGIC_NUMBER = 0.25f;
    private static final float POLYSTAR_MAGIC_NUMBER = 0.47829f;
    private final boolean hidden;
    private final BaseKeyframeAnimation<?, Float> innerRadiusAnimation;
    private final BaseKeyframeAnimation<?, Float> innerRoundednessAnimation;
    private boolean isPathValid;
    private final boolean isReversed;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<?, Float> outerRadiusAnimation;
    private final BaseKeyframeAnimation<?, Float> outerRoundednessAnimation;
    private final BaseKeyframeAnimation<?, Float> pointsAnimation;
    private final BaseKeyframeAnimation<?, PointF> positionAnimation;
    private final BaseKeyframeAnimation<?, Float> rotationAnimation;
    private final PolystarShape.Type type;
    private final Path path = new Path();
    private final Path lastSegmentPath = new Path();
    private final PathMeasure lastSegmentPathMeasure = new PathMeasure();
    private final float[] lastSegmentPosition = new float[2];
    private final CompoundTrimPathContent trimPaths = new CompoundTrimPathContent();

    /* renamed from: com.airbnb.lottie.animation.content.PolystarContent$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolystarContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, PolystarShape polystarShape) {
        this.lottieDrawable = lottieDrawable;
        this.name = polystarShape.getName();
        PolystarShape.Type type = polystarShape.getType();
        this.type = type;
        this.hidden = polystarShape.isHidden();
        this.isReversed = polystarShape.isReversed();
        FloatKeyframeAnimation createAnimation = polystarShape.getPoints().createAnimation();
        this.pointsAnimation = createAnimation;
        BaseKeyframeAnimation<PointF, PointF> createAnimation2 = polystarShape.getPosition().createAnimation();
        this.positionAnimation = createAnimation2;
        FloatKeyframeAnimation createAnimation3 = polystarShape.getRotation().createAnimation();
        this.rotationAnimation = createAnimation3;
        FloatKeyframeAnimation createAnimation4 = polystarShape.getOuterRadius().createAnimation();
        this.outerRadiusAnimation = createAnimation4;
        FloatKeyframeAnimation createAnimation5 = polystarShape.getOuterRoundedness().createAnimation();
        this.outerRoundednessAnimation = createAnimation5;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.innerRadiusAnimation = polystarShape.getInnerRadius().createAnimation();
            this.innerRoundednessAnimation = polystarShape.getInnerRoundedness().createAnimation();
        } else {
            this.innerRadiusAnimation = null;
            this.innerRoundednessAnimation = null;
        }
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        baseLayer.addAnimation(createAnimation3);
        baseLayer.addAnimation(createAnimation4);
        baseLayer.addAnimation(createAnimation5);
        if (type == type2) {
            baseLayer.addAnimation(this.innerRadiusAnimation);
            baseLayer.addAnimation(this.innerRoundednessAnimation);
        }
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
        createAnimation4.addUpdateListener(this);
        createAnimation5.addUpdateListener(this);
        if (type == type2) {
            this.innerRadiusAnimation.addUpdateListener(this);
            this.innerRoundednessAnimation.addUpdateListener(this);
        }
    }

    private void createPolygonPath() {
        double floatValue;
        double d4;
        float f5;
        float f10;
        float f11;
        int floor = (int) Math.floor(this.pointsAnimation.getValue().floatValue());
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.rotationAnimation;
        if (baseKeyframeAnimation == null) {
            floatValue = 0.0d;
        } else {
            floatValue = baseKeyframeAnimation.getValue().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d9 = floor;
        float floatValue2 = this.outerRoundednessAnimation.getValue().floatValue() / 100.0f;
        float floatValue3 = this.outerRadiusAnimation.getValue().floatValue();
        double d10 = floatValue3;
        float cos = (float) (Math.cos(radians) * d10);
        float sin = (float) (Math.sin(radians) * d10);
        this.path.moveTo(cos, sin);
        double d11 = (float) (6.283185307179586d / d9);
        double ceil = Math.ceil(d9);
        double d12 = radians + d11;
        int i4 = 0;
        while (true) {
            double d13 = i4;
            if (d13 < ceil) {
                float cos2 = (float) (Math.cos(d12) * d10);
                float sin2 = (float) (Math.sin(d12) * d10);
                if (floatValue2 != 0.0f) {
                    d4 = ceil;
                    f5 = floatValue2;
                    double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f12 = floatValue3 * f5 * POLYGON_MAGIC_NUMBER;
                    float f13 = f12 * cos3;
                    float f14 = f12 * sin3;
                    float f15 = cos4 * f12;
                    float f16 = f12 * sin4;
                    if (d13 == d4 - 1.0d) {
                        this.lastSegmentPath.reset();
                        this.lastSegmentPath.moveTo(cos, sin);
                        float f17 = cos - f13;
                        float f18 = sin - f14;
                        float f19 = cos2 + f15;
                        float f20 = sin2 + f16;
                        f10 = cos2;
                        f11 = sin2;
                        this.lastSegmentPath.cubicTo(f17, f18, f19, f20, f10, f11);
                        this.lastSegmentPathMeasure.setPath(this.lastSegmentPath, false);
                        PathMeasure pathMeasure = this.lastSegmentPathMeasure;
                        pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.lastSegmentPosition, null);
                        Path path = this.path;
                        float[] fArr = this.lastSegmentPosition;
                        path.cubicTo(f17, f18, f19, f20, fArr[0], fArr[1]);
                    } else {
                        f10 = cos2;
                        f11 = sin2;
                        this.path.cubicTo(cos - f13, sin - f14, f10 + f15, f11 + f16, f10, f11);
                    }
                    cos = f10;
                    sin = f11;
                } else {
                    cos = cos2;
                    sin = sin2;
                    d4 = ceil;
                    f5 = floatValue2;
                    if (d13 != d4 - 1.0d) {
                        this.path.lineTo(cos, sin);
                    } else {
                        i4++;
                        ceil = d4;
                        floatValue2 = f5;
                    }
                }
                d12 += d11;
                i4++;
                ceil = d4;
                floatValue2 = f5;
            } else {
                PointF value = this.positionAnimation.getValue();
                this.path.offset(value.x, value.y);
                this.path.close();
                return;
            }
        }
    }

    private void createStarPath() {
        double floatValue;
        float f5;
        float f10;
        float f11;
        float f12;
        int i4;
        float cos;
        float sin;
        float f13;
        float f14;
        double d4;
        float f15;
        float f16;
        int i5;
        float f17;
        double d9;
        float f18;
        float f19;
        double d10;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float floatValue2 = this.pointsAnimation.getValue().floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.rotationAnimation;
        if (baseKeyframeAnimation == null) {
            floatValue = 0.0d;
        } else {
            floatValue = baseKeyframeAnimation.getValue().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d11 = floatValue2;
        float f26 = (float) (6.283185307179586d / d11);
        if (this.isReversed) {
            f26 *= -1.0f;
        }
        float f27 = f26 / 2.0f;
        float f28 = floatValue2 - ((int) floatValue2);
        int i10 = (f28 > 0.0f ? 1 : (f28 == 0.0f ? 0 : -1));
        if (i10 != 0) {
            radians += (1.0f - f28) * f27;
        }
        float floatValue3 = this.outerRadiusAnimation.getValue().floatValue();
        float floatValue4 = this.innerRadiusAnimation.getValue().floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.innerRoundednessAnimation;
        if (baseKeyframeAnimation2 != null) {
            f5 = baseKeyframeAnimation2.getValue().floatValue() / 100.0f;
        } else {
            f5 = 0.0f;
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.outerRoundednessAnimation;
        if (baseKeyframeAnimation3 != null) {
            f10 = baseKeyframeAnimation3.getValue().floatValue() / 100.0f;
        } else {
            f10 = 0.0f;
        }
        if (i10 != 0) {
            f15 = c.lima(floatValue3, floatValue4, f28, floatValue4);
            f12 = 0.0f;
            i4 = i10;
            double d12 = f15;
            f11 = 2.0f;
            float cos2 = (float) (Math.cos(radians) * d12);
            sin = (float) (Math.sin(radians) * d12);
            this.path.moveTo(cos2, sin);
            d4 = radians + ((f26 * f28) / 2.0f);
            f13 = f28;
            cos = cos2;
            f14 = f27;
        } else {
            f11 = 2.0f;
            f12 = 0.0f;
            i4 = i10;
            double d13 = floatValue3;
            cos = (float) (Math.cos(radians) * d13);
            sin = (float) (d13 * Math.sin(radians));
            this.path.moveTo(cos, sin);
            f13 = f28;
            f14 = f27;
            d4 = radians + f14;
            f15 = 0.0f;
        }
        double ceil = Math.ceil(d11) * 2.0d;
        int i11 = 0;
        boolean z2 = false;
        double d14 = d4;
        float f29 = sin;
        float f30 = cos;
        double d15 = d14;
        while (true) {
            double d16 = i11;
            if (d16 < ceil) {
                if (z2) {
                    f16 = floatValue3;
                } else {
                    f16 = floatValue4;
                }
                if (f15 != f12 && d16 == ceil - 2.0d) {
                    i5 = i11;
                    f17 = (f26 * f13) / f11;
                } else {
                    i5 = i11;
                    f17 = f14;
                }
                if (f15 != f12 && d16 == ceil - 1.0d) {
                    d9 = d16;
                    f18 = f15;
                } else {
                    d9 = d16;
                    f18 = f16;
                }
                double d17 = f18;
                float cos3 = (float) (Math.cos(d15) * d17);
                float f31 = f26;
                float sin2 = (float) (Math.sin(d15) * d17);
                if (f5 == f12 && f10 == f12) {
                    this.path.lineTo(cos3, sin2);
                    f25 = cos3;
                    f20 = sin2;
                    f19 = f14;
                    d10 = d15;
                } else {
                    f19 = f14;
                    d10 = d15;
                    double atan2 = (float) (Math.atan2(f29, f30) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    float f32 = f30;
                    float f33 = f29;
                    f20 = sin2;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z2) {
                        f21 = f5;
                    } else {
                        f21 = f10;
                    }
                    if (z2) {
                        f22 = f10;
                    } else {
                        f22 = f5;
                    }
                    if (z2) {
                        f23 = floatValue4;
                    } else {
                        f23 = floatValue3;
                    }
                    if (z2) {
                        f24 = floatValue3;
                    } else {
                        f24 = floatValue4;
                    }
                    float f34 = f23 * f21 * POLYSTAR_MAGIC_NUMBER;
                    float f35 = cos4 * f34;
                    float f36 = f34 * sin3;
                    float f37 = f24 * f22 * POLYSTAR_MAGIC_NUMBER;
                    float f38 = cos5 * f37;
                    float f39 = f37 * sin4;
                    if (i4 != 0) {
                        if (i5 == 0) {
                            f35 *= f13;
                            f36 *= f13;
                        } else if (d9 == ceil - 1.0d) {
                            f38 *= f13;
                            f39 *= f13;
                        }
                    }
                    f25 = cos3;
                    this.path.cubicTo(f32 - f35, f33 - f36, cos3 + f38, f20 + f39, f25, f20);
                }
                d15 = d10 + f17;
                z2 = !z2;
                i11 = i5 + 1;
                f14 = f19;
                f30 = f25;
                f29 = f20;
                f26 = f31;
            } else {
                PointF value = this.positionAnimation.getValue();
                this.path.offset(value.x, value.y);
                this.path.close();
                return;
            }
        }
    }

    private void invalidate() {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t5, LottieValueCallback<T> lottieValueCallback) {
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2;
        if (t5 == LottieProperty.POLYSTAR_POINTS) {
            this.pointsAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t5 == LottieProperty.POLYSTAR_ROTATION) {
            this.rotationAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t5 == LottieProperty.POSITION) {
            this.positionAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t5 == LottieProperty.POLYSTAR_INNER_RADIUS && (baseKeyframeAnimation2 = this.innerRadiusAnimation) != null) {
            baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
            return;
        }
        if (t5 == LottieProperty.POLYSTAR_OUTER_RADIUS) {
            this.outerRadiusAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t5 == LottieProperty.POLYSTAR_INNER_ROUNDEDNESS && (baseKeyframeAnimation = this.innerRoundednessAnimation) != null) {
            baseKeyframeAnimation.setValueCallback(lottieValueCallback);
        } else if (t5 == LottieProperty.POLYSTAR_OUTER_ROUNDEDNESS) {
            this.outerRoundednessAnimation.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        if (this.isPathValid) {
            return this.path;
        }
        this.path.reset();
        if (this.hidden) {
            this.isPathValid = true;
            return this.path;
        }
        int i4 = AnonymousClass1.$SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type[this.type.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                createPolygonPath();
            }
        } else {
            createStarPath();
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
        }
    }
}
