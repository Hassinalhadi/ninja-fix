package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import java.io.IOException;

/* loaded from: classes3.dex */
class PathKeyframeParser {
    private PathKeyframeParser() {
    }

    public static PathKeyframe parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        boolean z2;
        if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new PathKeyframe(lottieComposition, KeyframeParser.parse(jsonReader, lottieComposition, Utils.dpScale(), PathParser.INSTANCE, z2, false));
    }
}
