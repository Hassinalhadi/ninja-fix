package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.content.GradientStroke;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
class GradientStrokeParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of(Constants.NOTIF_MSG, "g", "o", "t", "s", "e", Constants.INAPP_WINDOW, "lc", "lj", "ml", "hd", Constants.INAPP_DATA_TAG);
    private static final JsonReader.Options GRADIENT_NAMES = JsonReader.Options.of("p", "k");
    private static final JsonReader.Options DASH_PATTERN_NAMES = JsonReader.Options.of(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE);

    private GradientStrokeParser() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0024. Please report as an issue. */
    public static GradientStroke parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        GradientType gradientType;
        AnimatableIntegerValue animatableIntegerValue;
        ArrayList arrayList = new ArrayList();
        GradientType gradientType2 = null;
        String str = null;
        AnimatableGradientColorValue animatableGradientColorValue = null;
        AnimatablePointValue animatablePointValue = null;
        AnimatablePointValue animatablePointValue2 = null;
        AnimatableFloatValue animatableFloatValue = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        AnimatableFloatValue animatableFloatValue2 = null;
        float f5 = 0.0f;
        boolean z2 = false;
        AnimatableIntegerValue animatableIntegerValue2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    gradientType = gradientType2;
                    animatableIntegerValue = animatableIntegerValue2;
                    jsonReader.beginObject();
                    int i4 = -1;
                    while (jsonReader.hasNext()) {
                        int selectName = jsonReader.selectName(GRADIENT_NAMES);
                        if (selectName != 0) {
                            if (selectName != 1) {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            } else {
                                animatableGradientColorValue = AnimatableValueParser.parseGradientColor(jsonReader, lottieComposition, i4);
                            }
                        } else {
                            i4 = jsonReader.nextInt();
                        }
                    }
                    jsonReader.endObject();
                    animatableIntegerValue2 = animatableIntegerValue;
                    gradientType2 = gradientType;
                    break;
                case 2:
                    animatableIntegerValue2 = AnimatableValueParser.parseInteger(jsonReader, lottieComposition);
                    break;
                case 3:
                    AnimatableIntegerValue animatableIntegerValue3 = animatableIntegerValue2;
                    if (jsonReader.nextInt() == 1) {
                        gradientType2 = GradientType.LINEAR;
                    } else {
                        gradientType2 = GradientType.RADIAL;
                    }
                    animatableIntegerValue2 = animatableIntegerValue3;
                    break;
                case 4:
                    animatablePointValue = AnimatableValueParser.parsePoint(jsonReader, lottieComposition);
                    break;
                case 5:
                    animatablePointValue2 = AnimatableValueParser.parsePoint(jsonReader, lottieComposition);
                    break;
                case 6:
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                    break;
                case 7:
                    gradientType = gradientType2;
                    animatableIntegerValue = animatableIntegerValue2;
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                    animatableIntegerValue2 = animatableIntegerValue;
                    gradientType2 = gradientType;
                    break;
                case 8:
                    gradientType = gradientType2;
                    animatableIntegerValue = animatableIntegerValue2;
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                    animatableIntegerValue2 = animatableIntegerValue;
                    gradientType2 = gradientType;
                    break;
                case 9:
                    gradientType = gradientType2;
                    animatableIntegerValue = animatableIntegerValue2;
                    f5 = (float) jsonReader.nextDouble();
                    animatableIntegerValue2 = animatableIntegerValue;
                    gradientType2 = gradientType;
                    break;
                case 10:
                    gradientType = gradientType2;
                    z2 = jsonReader.nextBoolean();
                    gradientType2 = gradientType;
                    break;
                case 11:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        AnimatableFloatValue animatableFloatValue3 = null;
                        while (jsonReader.hasNext()) {
                            int selectName2 = jsonReader.selectName(DASH_PATTERN_NAMES);
                            if (selectName2 != 0) {
                                GradientType gradientType3 = gradientType2;
                                if (selectName2 != 1) {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                } else {
                                    animatableFloatValue3 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                                }
                                gradientType2 = gradientType3;
                            } else {
                                str2 = jsonReader.nextString();
                            }
                        }
                        GradientType gradientType4 = gradientType2;
                        jsonReader.endObject();
                        if (str2.equals("o")) {
                            animatableFloatValue2 = animatableFloatValue3;
                        } else if (str2.equals(Constants.INAPP_DATA_TAG) || str2.equals("g")) {
                            lottieComposition.setHasDashPattern(true);
                            arrayList.add(animatableFloatValue3);
                            gradientType2 = gradientType4;
                        }
                        gradientType2 = gradientType4;
                    }
                    gradientType = gradientType2;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add((AnimatableFloatValue) arrayList.get(0));
                    }
                    gradientType2 = gradientType;
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        GradientType gradientType5 = gradientType2;
        AnimatableIntegerValue animatableIntegerValue4 = animatableIntegerValue2;
        if (animatableIntegerValue4 == null) {
            animatableIntegerValue4 = new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100)));
        }
        return new GradientStroke(str, gradientType5, animatableGradientColorValue, animatableIntegerValue4, animatablePointValue, animatablePointValue2, animatableFloatValue, lineCapType, lineJoinType, f5, arrayList, animatableFloatValue2, z2);
    }
}
