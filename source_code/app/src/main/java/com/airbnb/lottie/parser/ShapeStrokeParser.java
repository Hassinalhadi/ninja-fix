package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ShapeStrokeParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of(Constants.NOTIF_MSG, "c", Constants.INAPP_WINDOW, "o", "lc", "lj", "ml", "hd", Constants.INAPP_DATA_TAG);
    private static final JsonReader.Options DASH_PATTERN_NAMES = JsonReader.Options.of(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE);

    private ShapeStrokeParser() {
    }

    public static ShapeStroke parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        char c3;
        ArrayList arrayList = new ArrayList();
        float f5 = 0.0f;
        boolean z2 = false;
        AnimatableIntegerValue animatableIntegerValue = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        String str = null;
        AnimatableFloatValue animatableFloatValue = null;
        AnimatableColorValue animatableColorValue = null;
        AnimatableFloatValue animatableFloatValue2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    animatableColorValue = AnimatableValueParser.parseColor(jsonReader, lottieComposition);
                    break;
                case 2:
                    animatableFloatValue2 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                    break;
                case 3:
                    animatableIntegerValue = AnimatableValueParser.parseInteger(jsonReader, lottieComposition);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                    break;
                case 6:
                    f5 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    z2 = jsonReader.nextBoolean();
                    break;
                case 8:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        AnimatableFloatValue animatableFloatValue3 = null;
                        while (jsonReader.hasNext()) {
                            int selectName = jsonReader.selectName(DASH_PATTERN_NAMES);
                            if (selectName != 0) {
                                if (selectName != 1) {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                } else {
                                    animatableFloatValue3 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                                }
                            } else {
                                str2 = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals(Constants.INAPP_DATA_TAG)) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                        }
                        c3 = 65535;
                        switch (c3) {
                            case 0:
                            case 1:
                                lottieComposition.setHasDashPattern(true);
                                arrayList.add(animatableFloatValue3);
                                break;
                            case 2:
                                animatableFloatValue = animatableFloatValue3;
                                break;
                        }
                    }
                    jsonReader.endArray();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((AnimatableFloatValue) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (animatableIntegerValue == null) {
            animatableIntegerValue = new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100)));
        }
        if (lineCapType == null) {
            lineCapType = ShapeStroke.LineCapType.BUTT;
        }
        if (lineJoinType == null) {
            lineJoinType = ShapeStroke.LineJoinType.MITER;
        }
        AnimatableFloatValue animatableFloatValue4 = animatableFloatValue;
        ShapeStroke.LineCapType lineCapType2 = lineCapType;
        return new ShapeStroke(str, animatableFloatValue4, arrayList, animatableColorValue, animatableIntegerValue, animatableFloatValue2, lineCapType2, lineJoinType, f5, z2);
    }
}
