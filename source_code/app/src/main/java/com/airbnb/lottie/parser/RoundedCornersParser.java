package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;

/* loaded from: classes3.dex */
public class RoundedCornersParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of(Constants.NOTIF_MSG, "r", "hd");

    private RoundedCornersParser() {
    }

    public static RoundedCorners parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        boolean z2 = false;
        String str = null;
        AnimatableFloatValue animatableFloatValue = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        jsonReader.skipValue();
                    } else {
                        z2 = jsonReader.nextBoolean();
                    }
                } else {
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, true);
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        if (z2) {
            return null;
        }
        return new RoundedCorners(str, animatableFloatValue);
    }
}
