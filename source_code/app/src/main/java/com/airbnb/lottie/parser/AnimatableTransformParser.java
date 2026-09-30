package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableSplitDimensionPathValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.ScaleXY;
import java.io.IOException;

/* loaded from: classes3.dex */
public class AnimatableTransformParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");
    private static final JsonReader.Options ANIMATABLE_NAMES = JsonReader.Options.of("k");

    private AnimatableTransformParser() {
    }

    private static boolean isAnchorPointIdentity(AnimatablePathValue animatablePathValue) {
        if (animatablePathValue != null) {
            if (!animatablePathValue.isStatic() || !animatablePathValue.getKeyframes().get(0).startValue.equals(0.0f, 0.0f)) {
                return false;
            }
            return true;
        }
        return true;
    }

    private static boolean isPositionIdentity(AnimatableValue<PointF, PointF> animatableValue) {
        if (animatableValue != null) {
            if ((animatableValue instanceof AnimatableSplitDimensionPathValue) || !animatableValue.isStatic() || !animatableValue.getKeyframes().get(0).startValue.equals(0.0f, 0.0f)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isRotationIdentity(AnimatableFloatValue animatableFloatValue) {
        if (animatableFloatValue != null) {
            if (!animatableFloatValue.isStatic() || ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() != 0.0f) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isScaleIdentity(AnimatableScaleValue animatableScaleValue) {
        if (animatableScaleValue != null) {
            if (!animatableScaleValue.isStatic() || !((ScaleXY) ((Keyframe) animatableScaleValue.getKeyframes().get(0)).startValue).equals(1.0f, 1.0f)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isSkewAngleIdentity(AnimatableFloatValue animatableFloatValue) {
        if (animatableFloatValue != null) {
            if (!animatableFloatValue.isStatic() || ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() != 0.0f) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isSkewIdentity(AnimatableFloatValue animatableFloatValue) {
        if (animatableFloatValue != null) {
            if (!animatableFloatValue.isStatic() || ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() != 0.0f) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AnimatableTransform parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        boolean z2;
        AnimatablePathValue animatablePathValue;
        AnimatableFloatValue animatableFloatValue;
        AnimatableScaleValue animatableScaleValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableFloatValue animatableFloatValue3;
        AnimatableFloatValue parseFloat;
        LottieComposition lottieComposition2 = lottieComposition;
        if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            jsonReader.beginObject();
        }
        AnimatableFloatValue animatableFloatValue4 = null;
        AnimatablePathValue animatablePathValue2 = null;
        AnimatableValue<PointF, PointF> animatableValue = null;
        AnimatableScaleValue animatableScaleValue2 = null;
        AnimatableFloatValue animatableFloatValue5 = null;
        AnimatableFloatValue animatableFloatValue6 = null;
        AnimatableIntegerValue animatableIntegerValue = null;
        AnimatableFloatValue animatableFloatValue7 = null;
        AnimatableFloatValue animatableFloatValue8 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.selectName(ANIMATABLE_NAMES) != 0) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            animatablePathValue2 = AnimatablePathValueParser.parse(jsonReader, lottieComposition);
                        }
                    }
                    jsonReader.endObject();
                    lottieComposition2 = lottieComposition;
                    break;
                case 1:
                    animatableValue = AnimatablePathValueParser.parseSplitPath(jsonReader, lottieComposition);
                    lottieComposition2 = lottieComposition;
                    break;
                case 2:
                    animatableScaleValue2 = AnimatableValueParser.parseScale(jsonReader, lottieComposition);
                    lottieComposition2 = lottieComposition;
                    break;
                case 3:
                    lottieComposition2.addWarning("Lottie doesn't support 3D layers.");
                    parseFloat = AnimatableValueParser.parseFloat(jsonReader, lottieComposition2, false);
                    if (!parseFloat.getKeyframes().isEmpty()) {
                        parseFloat.getKeyframes().add(new Keyframe(lottieComposition2, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition2.getEndFrame())));
                    } else if (((Keyframe) parseFloat.getKeyframes().get(0)).startValue == 0) {
                        parseFloat.getKeyframes().set(0, new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.getEndFrame())));
                    }
                    lottieComposition2 = lottieComposition;
                    animatableFloatValue4 = parseFloat;
                    break;
                case 4:
                    parseFloat = AnimatableValueParser.parseFloat(jsonReader, lottieComposition2, false);
                    if (!parseFloat.getKeyframes().isEmpty()) {
                    }
                    lottieComposition2 = lottieComposition;
                    animatableFloatValue4 = parseFloat;
                    break;
                case 5:
                    animatableIntegerValue = AnimatableValueParser.parseInteger(jsonReader, lottieComposition);
                    break;
                case 6:
                    animatableFloatValue7 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition2, false);
                    break;
                case 7:
                    animatableFloatValue8 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition2, false);
                    break;
                case 8:
                    animatableFloatValue5 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition2, false);
                    break;
                case 9:
                    animatableFloatValue6 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition2, false);
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        if (z2) {
            jsonReader.endObject();
        }
        if (isAnchorPointIdentity(animatablePathValue2)) {
            animatablePathValue = null;
        } else {
            animatablePathValue = animatablePathValue2;
        }
        if (isPositionIdentity(animatableValue)) {
            animatableValue = null;
        }
        if (isRotationIdentity(animatableFloatValue4)) {
            animatableFloatValue = null;
        } else {
            animatableFloatValue = animatableFloatValue4;
        }
        if (isScaleIdentity(animatableScaleValue2)) {
            animatableScaleValue = null;
        } else {
            animatableScaleValue = animatableScaleValue2;
        }
        if (isSkewIdentity(animatableFloatValue5)) {
            animatableFloatValue2 = null;
        } else {
            animatableFloatValue2 = animatableFloatValue5;
        }
        if (isSkewAngleIdentity(animatableFloatValue6)) {
            animatableFloatValue3 = null;
        } else {
            animatableFloatValue3 = animatableFloatValue6;
        }
        return new AnimatableTransform(animatablePathValue, animatableValue, animatableScaleValue, animatableFloatValue, animatableIntegerValue, animatableFloatValue7, animatableFloatValue8, animatableFloatValue2, animatableFloatValue3);
    }
}
