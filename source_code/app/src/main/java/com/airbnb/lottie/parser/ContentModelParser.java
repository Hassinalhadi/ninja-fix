package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ContentModelParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of("ty", Constants.INAPP_DATA_TAG);

    private ContentModelParser() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ce, code lost:
    
        if (r3.equals("fl") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ContentModel parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        ContentModel contentModel;
        String str;
        char c3 = 1;
        jsonReader.beginObject();
        int i4 = 2;
        while (true) {
            contentModel = null;
            if (jsonReader.hasNext()) {
                int selectName = jsonReader.selectName(NAMES);
                if (selectName != 0) {
                    if (selectName != 1) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        i4 = jsonReader.nextInt();
                    }
                } else {
                    str = jsonReader.nextString();
                    break;
                }
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 3270:
                break;
            case 3295:
                if (str.equals("gf")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 3307:
                if (str.equals("gr")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 3633:
                if (str.equals("rc")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 3634:
                if (str.equals("rd")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 3669:
                if (str.equals("sh")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                contentModel = CircleShapeParser.parse(jsonReader, lottieComposition, i4);
                break;
            case 1:
                contentModel = ShapeFillParser.parse(jsonReader, lottieComposition);
                break;
            case 2:
                contentModel = GradientFillParser.parse(jsonReader, lottieComposition);
                break;
            case 3:
                contentModel = ShapeGroupParser.parse(jsonReader, lottieComposition);
                break;
            case 4:
                contentModel = GradientStrokeParser.parse(jsonReader, lottieComposition);
                break;
            case 5:
                contentModel = MergePathsParser.parse(jsonReader);
                lottieComposition.addWarning("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                contentModel = RectangleShapeParser.parse(jsonReader, lottieComposition);
                break;
            case 7:
                contentModel = RoundedCornersParser.parse(jsonReader, lottieComposition);
                break;
            case '\b':
                contentModel = RepeaterParser.parse(jsonReader, lottieComposition);
                break;
            case '\t':
                contentModel = ShapePathParser.parse(jsonReader, lottieComposition);
                break;
            case '\n':
                contentModel = PolystarShapeParser.parse(jsonReader, lottieComposition, i4);
                break;
            case 11:
                contentModel = ShapeStrokeParser.parse(jsonReader, lottieComposition);
                break;
            case '\f':
                contentModel = ShapeTrimPathParser.parse(jsonReader, lottieComposition);
                break;
            case '\r':
                contentModel = AnimatableTransformParser.parse(jsonReader, lottieComposition);
                break;
            default:
                Logger.warning("Unknown shape type ".concat(str));
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return contentModel;
    }
}
