package com.airbnb.lottie.parser;

import android.graphics.Rect;
import bv.ax;
import bv.u;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class LottieCompositionMoshiParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of(Constants.INAPP_WINDOW, "h", "ip", "op", "fr", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE, "layers", "assets", "fonts", "chars", "markers");
    static JsonReader.Options ASSETS_NAMES = JsonReader.Options.of(Constants.KEY_ID, "layers", Constants.INAPP_WINDOW, "h", "p", "u");
    private static final JsonReader.Options FONT_NAMES = JsonReader.Options.of("list");
    private static final JsonReader.Options MARKER_NAMES = JsonReader.Options.of("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0046. Please report as an issue. */
    public static LottieComposition parse(JsonReader jsonReader) throws IOException {
        float f5;
        JsonReader jsonReader2 = jsonReader;
        float dpScale = Utils.dpScale();
        u uVar = new u((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        ax axVar = new ax(0);
        LottieComposition lottieComposition = new LottieComposition();
        jsonReader2.beginObject();
        float f10 = 0.0f;
        int i5 = 0;
        int i10 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (jsonReader2.hasNext()) {
            int i11 = i4;
            switch (jsonReader2.selectName(NAMES)) {
                case 0:
                    f5 = dpScale;
                    i10 = (int) jsonReader.nextDouble();
                    jsonReader2 = jsonReader;
                    dpScale = f5;
                    break;
                case 1:
                    f5 = dpScale;
                    i5 = (int) jsonReader.nextDouble();
                    jsonReader2 = jsonReader;
                    dpScale = f5;
                    break;
                case 2:
                    f5 = dpScale;
                    f10 = (float) jsonReader.nextDouble();
                    jsonReader2 = jsonReader;
                    dpScale = f5;
                    break;
                case 3:
                    f5 = dpScale;
                    f11 = ((float) jsonReader.nextDouble()) - 0.01f;
                    jsonReader2 = jsonReader;
                    dpScale = f5;
                    break;
                case 4:
                    f5 = dpScale;
                    f12 = (float) jsonReader.nextDouble();
                    jsonReader2 = jsonReader;
                    dpScale = f5;
                    break;
                case 5:
                    String[] split = jsonReader2.nextString().split("\\.");
                    if (!Utils.isAtLeastVersion(Integer.parseInt(split[i11]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        lottieComposition.addWarning("Lottie only supports bodymovin >= 4.4.0");
                    }
                    jsonReader2 = jsonReader;
                    break;
                case 6:
                    parseLayers(jsonReader2, lottieComposition, arrayList, uVar);
                    jsonReader2 = jsonReader;
                    break;
                case 7:
                    parseAssets(jsonReader2, lottieComposition, hashMap, hashMap2);
                    jsonReader2 = jsonReader;
                    break;
                case 8:
                    parseFonts(jsonReader2, hashMap3);
                    jsonReader2 = jsonReader;
                    break;
                case 9:
                    parseChars(jsonReader2, lottieComposition, axVar);
                    jsonReader2 = jsonReader;
                    break;
                case 10:
                    parseMarkers(jsonReader2, arrayList2);
                    jsonReader2 = jsonReader;
                    break;
                default:
                    jsonReader2.skipName();
                    jsonReader2.skipValue();
                    jsonReader2 = jsonReader;
                    break;
            }
            i4 = i11;
        }
        int i12 = i4;
        float f13 = dpScale;
        lottieComposition.init(new Rect(i12, i12, (int) (i10 * f13), (int) (i5 * f13)), f10, f11, f12, arrayList, uVar, hashMap, hashMap2, Utils.dpScale(), axVar, hashMap3, arrayList2, i10, i5);
        return lottieComposition;
    }

    private static void parseAssets(JsonReader jsonReader, LottieComposition lottieComposition, Map<String, List<Layer>> map, Map<String, LottieImageAsset> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            u uVar = new u((Object) null);
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i4 = 0;
            int i5 = 0;
            while (jsonReader.hasNext()) {
                int selectName = jsonReader.selectName(ASSETS_NAMES);
                if (selectName != 0) {
                    if (selectName != 1) {
                        if (selectName != 2) {
                            if (selectName != 3) {
                                if (selectName != 4) {
                                    if (selectName != 5) {
                                        jsonReader.skipName();
                                        jsonReader.skipValue();
                                    } else {
                                        str3 = jsonReader.nextString();
                                    }
                                } else {
                                    str2 = jsonReader.nextString();
                                }
                            } else {
                                i5 = jsonReader.nextInt();
                            }
                        } else {
                            i4 = jsonReader.nextInt();
                        }
                    } else {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            Layer parse = LayerParser.parse(jsonReader, lottieComposition);
                            uVar.hotel(parse.getId(), parse);
                            arrayList.add(parse);
                        }
                        jsonReader.endArray();
                    }
                } else {
                    str = jsonReader.nextString();
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                LottieImageAsset lottieImageAsset = new LottieImageAsset(i4, i5, str, str2, str3);
                map2.put(lottieImageAsset.getId(), lottieImageAsset);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void parseChars(JsonReader jsonReader, LottieComposition lottieComposition, ax axVar) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            FontCharacter parse = FontCharacterParser.parse(jsonReader, lottieComposition);
            axVar.foxtrot(parse.hashCode(), parse);
        }
        jsonReader.endArray();
    }

    private static void parseFonts(JsonReader jsonReader, Map<String, Font> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(FONT_NAMES) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    Font parse = FontParser.parse(jsonReader);
                    map.put(parse.getName(), parse);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void parseLayers(JsonReader jsonReader, LottieComposition lottieComposition, List<Layer> list, u uVar) throws IOException {
        jsonReader.beginArray();
        int i4 = 0;
        while (jsonReader.hasNext()) {
            Layer parse = LayerParser.parse(jsonReader, lottieComposition);
            if (parse.getLayerType() == Layer.LayerType.IMAGE) {
                i4++;
            }
            list.add(parse);
            uVar.hotel(parse.getId(), parse);
            if (i4 > 4) {
                Logger.warning("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    private static void parseMarkers(JsonReader jsonReader, List<Marker> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float f5 = 0.0f;
            String str = null;
            float f10 = 0.0f;
            while (jsonReader.hasNext()) {
                int selectName = jsonReader.selectName(MARKER_NAMES);
                if (selectName != 0) {
                    if (selectName != 1) {
                        if (selectName != 2) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            f10 = (float) jsonReader.nextDouble();
                        }
                    } else {
                        f5 = (float) jsonReader.nextDouble();
                    }
                } else {
                    str = jsonReader.nextString();
                }
            }
            jsonReader.endObject();
            list.add(new Marker(str, f5, f10));
        }
        jsonReader.endArray();
    }
}
