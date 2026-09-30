package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;

/* loaded from: classes3.dex */
class MergePathsParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of(Constants.NOTIF_MSG, "mm", "hd");

    private MergePathsParser() {
    }

    public static MergePaths parse(JsonReader jsonReader) throws IOException {
        String str = null;
        boolean z2 = false;
        MergePaths.MergePathsMode mergePathsMode = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        z2 = jsonReader.nextBoolean();
                    }
                } else {
                    mergePathsMode = MergePaths.MergePathsMode.forId(jsonReader.nextInt());
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        return new MergePaths(str, mergePathsMode, z2);
    }
}
