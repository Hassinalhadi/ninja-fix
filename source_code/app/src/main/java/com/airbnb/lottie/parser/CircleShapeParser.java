package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.CircleShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;

/* loaded from: classes3.dex */
class CircleShapeParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of(Constants.NOTIF_MSG, "p", "s", "hd", Constants.INAPP_DATA_TAG);

    private CircleShapeParser() {
    }

    public static CircleShape parse(JsonReader jsonReader, LottieComposition lottieComposition, int i4) throws IOException {
        boolean z2;
        if (i4 == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z10 = z2;
        boolean z11 = false;
        String str = null;
        AnimatableValue<PointF, PointF> animatableValue = null;
        AnimatablePointValue animatablePointValue = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        if (selectName != 3) {
                            if (selectName != 4) {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            } else if (jsonReader.nextInt() == 3) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z11 = jsonReader.nextBoolean();
                        }
                    } else {
                        animatablePointValue = AnimatableValueParser.parsePoint(jsonReader, lottieComposition);
                    }
                } else {
                    animatableValue = AnimatablePathValueParser.parseSplitPath(jsonReader, lottieComposition);
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        return new CircleShape(str, animatableValue, animatablePointValue, z10, z11);
    }
}
