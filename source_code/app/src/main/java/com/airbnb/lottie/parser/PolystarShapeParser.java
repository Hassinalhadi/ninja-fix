package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.api.CtApi;
import java.io.IOException;

/* loaded from: classes3.dex */
class PolystarShapeParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of(Constants.NOTIF_MSG, "sy", "pt", "p", "r", "or", CtApi.QUERY_PARAM_OS_KEY, "ir", "is", "hd", Constants.INAPP_DATA_TAG);

    private PolystarShapeParser() {
    }

    public static PolystarShape parse(JsonReader jsonReader, LottieComposition lottieComposition, int i4) throws IOException {
        boolean z2;
        if (i4 == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z10 = false;
        boolean z11 = z2;
        String str = null;
        PolystarShape.Type type = null;
        AnimatableFloatValue animatableFloatValue = null;
        AnimatableValue<PointF, PointF> animatableValue = null;
        AnimatableFloatValue animatableFloatValue2 = null;
        AnimatableFloatValue animatableFloatValue3 = null;
        AnimatableFloatValue animatableFloatValue4 = null;
        AnimatableFloatValue animatableFloatValue5 = null;
        AnimatableFloatValue animatableFloatValue6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    type = PolystarShape.Type.forValue(jsonReader.nextInt());
                    break;
                case 2:
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 3:
                    animatableValue = AnimatablePathValueParser.parseSplitPath(jsonReader, lottieComposition);
                    break;
                case 4:
                    animatableFloatValue2 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 5:
                    animatableFloatValue4 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                    break;
                case 6:
                    animatableFloatValue6 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 7:
                    animatableFloatValue3 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                    break;
                case 8:
                    animatableFloatValue5 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    break;
                case 9:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 10:
                    if (jsonReader.nextInt() == 3) {
                        z11 = true;
                        break;
                    } else {
                        z11 = false;
                        break;
                    }
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        return new PolystarShape(str, type, animatableFloatValue, animatableValue, animatableFloatValue2, animatableFloatValue3, animatableFloatValue4, animatableFloatValue5, animatableFloatValue6, z10, z11);
    }
}
