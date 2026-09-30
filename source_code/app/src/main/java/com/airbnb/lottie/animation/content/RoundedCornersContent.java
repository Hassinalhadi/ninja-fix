package com.airbnb.lottie.animation.content;

import Q0.c;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class RoundedCornersContent implements ShapeModifierContent, BaseKeyframeAnimation.AnimationListener {
    private static final float ROUNDED_CORNER_MAGIC_NUMBER = 0.5519f;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<Float, Float> roundedCorners;
    private ShapeData shapeData;

    public RoundedCornersContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RoundedCorners roundedCorners) {
        this.lottieDrawable = lottieDrawable;
        this.name = roundedCorners.getName();
        BaseKeyframeAnimation<Float, Float> createAnimation = roundedCorners.getCornerRadius().createAnimation();
        this.roundedCorners = createAnimation;
        baseLayer.addAnimation(createAnimation);
        createAnimation.addUpdateListener(this);
    }

    private static int floorDiv(int i4, int i5) {
        int i10 = i4 / i5;
        if ((i4 ^ i5) < 0 && i5 * i10 != i4) {
            return i10 - 1;
        }
        return i10;
    }

    private static int floorMod(int i4, int i5) {
        return i4 - (floorDiv(i4, i5) * i5);
    }

    private ShapeData getShapeData(ShapeData shapeData) {
        PointF vertex;
        PointF controlPoint2;
        boolean z2;
        List<CubicCurveData> curves = shapeData.getCurves();
        boolean isClosed = shapeData.isClosed();
        int i4 = 0;
        for (int size = curves.size() - 1; size >= 0; size--) {
            CubicCurveData cubicCurveData = curves.get(size);
            CubicCurveData cubicCurveData2 = curves.get(floorMod(size - 1, curves.size()));
            if (size == 0 && !isClosed) {
                vertex = shapeData.getInitialPoint();
            } else {
                vertex = cubicCurveData2.getVertex();
            }
            if (size == 0 && !isClosed) {
                controlPoint2 = vertex;
            } else {
                controlPoint2 = cubicCurveData2.getControlPoint2();
            }
            PointF controlPoint1 = cubicCurveData.getControlPoint1();
            if (!shapeData.isClosed() && (size == 0 || size == curves.size() - 1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (controlPoint2.equals(vertex) && controlPoint1.equals(vertex) && !z2) {
                i4 += 2;
            } else {
                i4++;
            }
        }
        ShapeData shapeData2 = this.shapeData;
        if (shapeData2 == null || shapeData2.getCurves().size() != i4) {
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(new CubicCurveData());
            }
            this.shapeData = new ShapeData(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.shapeData.setClosed(isClosed);
        return this.shapeData;
    }

    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    public void addUpdateListener(BaseKeyframeAnimation.AnimationListener animationListener) {
        this.roundedCorners.addUpdateListener(animationListener);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    public BaseKeyframeAnimation<Float, Float> getRoundedCorners() {
        return this.roundedCorners;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r7 != (r0.size() - 1)) goto L27;
     */
    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShapeData modifyShape(ShapeData shapeData) {
        PointF vertex;
        PointF controlPoint2;
        boolean z2;
        List<CubicCurveData> list;
        List<CubicCurveData> curves = shapeData.getCurves();
        if (curves.size() > 2) {
            float floatValue = this.roundedCorners.getValue().floatValue();
            if (floatValue != 0.0f) {
                ShapeData shapeData2 = getShapeData(shapeData);
                shapeData2.setInitialPoint(shapeData.getInitialPoint().x, shapeData.getInitialPoint().y);
                List<CubicCurveData> curves2 = shapeData2.getCurves();
                boolean isClosed = shapeData.isClosed();
                int i4 = 0;
                int i5 = 0;
                while (i4 < curves.size()) {
                    CubicCurveData cubicCurveData = curves.get(i4);
                    CubicCurveData cubicCurveData2 = curves.get(floorMod(i4 - 1, curves.size()));
                    CubicCurveData cubicCurveData3 = curves.get(floorMod(i4 - 2, curves.size()));
                    if (i4 == 0 && !isClosed) {
                        vertex = shapeData.getInitialPoint();
                    } else {
                        vertex = cubicCurveData2.getVertex();
                    }
                    if (i4 == 0 && !isClosed) {
                        controlPoint2 = vertex;
                    } else {
                        controlPoint2 = cubicCurveData2.getControlPoint2();
                    }
                    PointF controlPoint1 = cubicCurveData.getControlPoint1();
                    PointF vertex2 = cubicCurveData3.getVertex();
                    PointF vertex3 = cubicCurveData.getVertex();
                    if (!shapeData.isClosed()) {
                        z2 = true;
                        if (i4 != 0) {
                        }
                        if (!controlPoint2.equals(vertex) && controlPoint1.equals(vertex) && !z2) {
                            float f5 = vertex.x;
                            float f10 = f5 - vertex2.x;
                            float f11 = vertex.y;
                            float f12 = f11 - vertex2.y;
                            float f13 = vertex3.x - f5;
                            float f14 = vertex3.y - f11;
                            list = curves;
                            float hypot = (float) Math.hypot(f10, f12);
                            float hypot2 = (float) Math.hypot(f13, f14);
                            float min = Math.min(floatValue / hypot, 0.5f);
                            float min2 = Math.min(floatValue / hypot2, 0.5f);
                            float f15 = vertex.x;
                            float lima = c.lima(vertex2.x, f15, min, f15);
                            float f16 = vertex.y;
                            float lima2 = c.lima(vertex2.y, f16, min, f16);
                            float lima3 = c.lima(vertex3.x, f15, min2, f15);
                            float lima4 = c.lima(vertex3.y, f16, min2, f16);
                            float f17 = lima - ((lima - f15) * ROUNDED_CORNER_MAGIC_NUMBER);
                            float f18 = lima2 - ((lima2 - f16) * ROUNDED_CORNER_MAGIC_NUMBER);
                            float f19 = lima3 - ((lima3 - f15) * ROUNDED_CORNER_MAGIC_NUMBER);
                            float f20 = lima4 - ((lima4 - f16) * ROUNDED_CORNER_MAGIC_NUMBER);
                            CubicCurveData cubicCurveData4 = curves2.get(floorMod(i5 - 1, curves2.size()));
                            CubicCurveData cubicCurveData5 = curves2.get(i5);
                            cubicCurveData4.setControlPoint2(lima, lima2);
                            cubicCurveData4.setVertex(lima, lima2);
                            if (i4 == 0) {
                                shapeData2.setInitialPoint(lima, lima2);
                            }
                            cubicCurveData5.setControlPoint1(f17, f18);
                            CubicCurveData cubicCurveData6 = curves2.get(i5 + 1);
                            cubicCurveData5.setControlPoint2(f19, f20);
                            cubicCurveData5.setVertex(lima3, lima4);
                            cubicCurveData6.setControlPoint1(lima3, lima4);
                            i5 += 2;
                        } else {
                            list = curves;
                            CubicCurveData cubicCurveData7 = curves2.get(floorMod(i5 - 1, curves2.size()));
                            CubicCurveData cubicCurveData8 = curves2.get(i5);
                            cubicCurveData7.setControlPoint2(cubicCurveData2.getControlPoint2().x, cubicCurveData2.getControlPoint2().y);
                            cubicCurveData7.setVertex(cubicCurveData2.getVertex().x, cubicCurveData2.getVertex().y);
                            cubicCurveData8.setControlPoint1(cubicCurveData.getControlPoint1().x, cubicCurveData.getControlPoint1().y);
                            i5++;
                        }
                        i4++;
                        curves = list;
                    }
                    z2 = false;
                    if (!controlPoint2.equals(vertex)) {
                    }
                    list = curves;
                    CubicCurveData cubicCurveData72 = curves2.get(floorMod(i5 - 1, curves2.size()));
                    CubicCurveData cubicCurveData82 = curves2.get(i5);
                    cubicCurveData72.setControlPoint2(cubicCurveData2.getControlPoint2().x, cubicCurveData2.getControlPoint2().y);
                    cubicCurveData72.setVertex(cubicCurveData2.getVertex().x, cubicCurveData2.getVertex().y);
                    cubicCurveData82.setControlPoint1(cubicCurveData.getControlPoint1().x, cubicCurveData.getControlPoint1().y);
                    i5++;
                    i4++;
                    curves = list;
                }
                return shapeData2;
            }
        }
        return shapeData;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }
}
