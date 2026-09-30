package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.content.ShapePath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;

/* loaded from: classes3.dex */
class ShapePathParser {
    static JsonReader.Options NAMES = JsonReader.Options.of(Constants.NOTIF_MSG, "ind", "ks", "hd");

    private ShapePathParser() {
    }

    public static ShapePath parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        String str = null;
        int i4 = 0;
        boolean z2 = false;
        AnimatableShapeValue animatableShapeValue = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        if (selectName != 3) {
                            jsonReader.skipValue();
                        } else {
                            z2 = jsonReader.nextBoolean();
                        }
                    } else {
                        animatableShapeValue = AnimatableValueParser.parseShapeData(jsonReader, lottieComposition);
                    }
                } else {
                    i4 = jsonReader.nextInt();
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        return new ShapePath(str, i4, animatableShapeValue, z2);
    }
}
