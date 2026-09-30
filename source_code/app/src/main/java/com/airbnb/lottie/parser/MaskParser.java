package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class MaskParser {
    private MaskParser() {
    }

    public static Mask parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        boolean z2;
        boolean z10;
        jsonReader.beginObject();
        Mask.MaskMode maskMode = null;
        AnimatableShapeValue animatableShapeValue = null;
        AnimatableIntegerValue animatableIntegerValue = null;
        boolean z11 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case 111:
                    if (nextName.equals("o")) {
                        z2 = false;
                        break;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        z2 = true;
                        break;
                    }
                    break;
                case 104433:
                    if (nextName.equals("inv")) {
                        z2 = 2;
                        break;
                    }
                    break;
                case 3357091:
                    if (nextName.equals("mode")) {
                        z2 = 3;
                        break;
                    }
                    break;
            }
            z2 = -1;
            switch (z2) {
                case false:
                    animatableIntegerValue = AnimatableValueParser.parseInteger(jsonReader, lottieComposition);
                    break;
                case true:
                    animatableShapeValue = AnimatableValueParser.parseShapeData(jsonReader, lottieComposition);
                    break;
                case true:
                    z11 = jsonReader.nextBoolean();
                    break;
                case true:
                    String nextString = jsonReader.nextString();
                    nextString.getClass();
                    switch (nextString.hashCode()) {
                        case 97:
                            if (nextString.equals("a")) {
                                z10 = false;
                                break;
                            }
                            break;
                        case 105:
                            if (nextString.equals("i")) {
                                z10 = true;
                                break;
                            }
                            break;
                        case 110:
                            if (nextString.equals(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY)) {
                                z10 = 2;
                                break;
                            }
                            break;
                        case 115:
                            if (nextString.equals("s")) {
                                z10 = 3;
                                break;
                            }
                            break;
                    }
                    z10 = -1;
                    switch (z10) {
                        case false:
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                        case true:
                            lottieComposition.addWarning("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                            break;
                        case true:
                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                            break;
                        case true:
                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            Logger.warning("Unknown mask mode " + nextName + ". Defaulting to Add.");
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new Mask(maskMode, animatableShapeValue, animatableIntegerValue, z11);
    }
}
