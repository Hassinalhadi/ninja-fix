package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;

/* loaded from: classes3.dex */
public class DocumentDataParser implements ValueParser<DocumentData> {
    public static final DocumentDataParser INSTANCE = new DocumentDataParser();
    private static final JsonReader.Options NAMES = JsonReader.Options.of("t", "f", "s", "j", "tr", "lh", "ls", "fc", Constants.INAPP_NOTIF_SHOW_CLOSE, "sw", "of", "ps", "sz");

    private DocumentDataParser() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.parser.ValueParser
    public DocumentData parse(JsonReader jsonReader, float f5) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.beginObject();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        int i10 = 0;
        boolean z2 = true;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    f10 = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    int nextInt = jsonReader.nextInt();
                    justification2 = DocumentData.Justification.CENTER;
                    if (nextInt <= justification2.ordinal() && nextInt >= 0) {
                        justification2 = DocumentData.Justification.values()[nextInt];
                        break;
                    }
                    break;
                case 4:
                    i4 = jsonReader.nextInt();
                    break;
                case 5:
                    f11 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    f12 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    i5 = JsonUtils.jsonToColor(jsonReader);
                    break;
                case 8:
                    i10 = JsonUtils.jsonToColor(jsonReader);
                    break;
                case 9:
                    f13 = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    z2 = jsonReader.nextBoolean();
                    break;
                case 11:
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f5, ((float) jsonReader.nextDouble()) * f5);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case 12:
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f5, ((float) jsonReader.nextDouble()) * f5);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new DocumentData(str, str2, f10, justification2, i4, f11, f12, i5, i10, f13, z2, pointF, pointF2);
    }
}
