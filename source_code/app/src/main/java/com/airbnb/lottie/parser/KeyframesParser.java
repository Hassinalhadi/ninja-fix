package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
class KeyframesParser {
    static JsonReader.Options NAMES = JsonReader.Options.of("k");

    private KeyframesParser() {
    }

    public static <T> List<Keyframe<T>> parse(JsonReader jsonReader, LottieComposition lottieComposition, float f5, ValueParser<T> valueParser, boolean z2) throws IOException {
        JsonReader jsonReader2;
        LottieComposition lottieComposition2;
        float f10;
        ValueParser<T> valueParser2;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonReader.Token.STRING) {
            lottieComposition.addWarning("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(NAMES) != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonReader.Token.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    LottieComposition lottieComposition3 = lottieComposition;
                    float f11 = f5;
                    ValueParser<T> valueParser3 = valueParser;
                    boolean z11 = z2;
                    Keyframe parse = KeyframeParser.parse(jsonReader3, lottieComposition3, f11, valueParser3, false, z11);
                    jsonReader2 = jsonReader3;
                    lottieComposition2 = lottieComposition3;
                    f10 = f11;
                    valueParser2 = valueParser3;
                    z10 = z11;
                    arrayList.add(parse);
                } else {
                    jsonReader2 = jsonReader;
                    lottieComposition2 = lottieComposition;
                    f10 = f5;
                    valueParser2 = valueParser;
                    z10 = z2;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(KeyframeParser.parse(jsonReader2, lottieComposition2, f10, valueParser2, true, z10));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                lottieComposition = lottieComposition2;
                f5 = f10;
                valueParser = valueParser2;
                z2 = z10;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(KeyframeParser.parse(jsonReader4, lottieComposition, f5, valueParser, false, z2));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        setEndFrames(arrayList);
        return arrayList;
    }

    public static <T> void setEndFrames(List<? extends Keyframe<T>> list) {
        int i4;
        T t5;
        int size = list.size();
        int i5 = 0;
        while (true) {
            i4 = size - 1;
            if (i5 >= i4) {
                break;
            }
            Keyframe<T> keyframe = list.get(i5);
            i5++;
            Keyframe<T> keyframe2 = list.get(i5);
            keyframe.endFrame = Float.valueOf(keyframe2.startFrame);
            if (keyframe.endValue == null && (t5 = keyframe2.startValue) != null) {
                keyframe.endValue = t5;
                if (keyframe instanceof PathKeyframe) {
                    ((PathKeyframe) keyframe).createPath();
                }
            }
        }
        Keyframe<T> keyframe3 = list.get(i4);
        if ((keyframe3.startValue == null || keyframe3.endValue == null) && list.size() > 1) {
            list.remove(keyframe3);
        }
    }
}
