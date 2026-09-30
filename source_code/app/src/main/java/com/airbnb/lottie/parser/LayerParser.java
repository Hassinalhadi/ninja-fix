package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class LayerParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of(Constants.NOTIF_MSG, "ind", "refId", "ty", "parent", "sw", "sh", Constants.INAPP_NOTIF_SHOW_CLOSE, "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", Constants.INAPP_WINDOW, "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    private static final JsonReader.Options TEXT_NAMES = JsonReader.Options.of(Constants.INAPP_DATA_TAG, "a");
    private static final JsonReader.Options EFFECTS_NAMES = JsonReader.Options.of("ty", Constants.NOTIF_MSG);

    /* renamed from: com.airbnb.lottie.parser.LayerParser$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private LayerParser() {
    }

    public static Layer parse(LottieComposition lottieComposition) {
        Rect bounds = lottieComposition.getBounds();
        List list = Collections.EMPTY_LIST;
        return new Layer(list, lottieComposition, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, list, new AnimatableTransform(), 0, 0, 0, 0.0f, 0.0f, bounds.width(), bounds.height(), null, null, list, Layer.MatteType.NONE, null, false, null, null, LBlendMode.NORMAL);
    }

    public static Layer parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        Float f5;
        boolean z2;
        float f10;
        String str;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        LBlendMode lBlendMode = LBlendMode.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        float f11 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        LBlendMode lBlendMode2 = lBlendMode;
        Layer.MatteType matteType2 = matteType;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        String str2 = null;
        AnimatableTextFrame animatableTextFrame = null;
        AnimatableTextProperties animatableTextProperties = null;
        AnimatableFloatValue animatableFloatValue = null;
        BlurEffect blurEffect = null;
        DropShadowEffect dropShadowEffect = null;
        long j5 = 0;
        boolean z10 = false;
        int i4 = 0;
        int i5 = 0;
        int i10 = 0;
        boolean z11 = false;
        long j6 = -1;
        float f17 = 1.0f;
        String str3 = "UNSET";
        String str4 = null;
        AnimatableTransform animatableTransform = null;
        Layer.LayerType layerType = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str3 = jsonReader.nextString();
                    continue;
                case 1:
                    j5 = jsonReader.nextInt();
                    continue;
                case 2:
                    str2 = jsonReader.nextString();
                    continue;
                case 3:
                    f10 = f11;
                    str = str2;
                    int nextInt = jsonReader.nextInt();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (nextInt < layerType.ordinal()) {
                        layerType = Layer.LayerType.values()[nextInt];
                        break;
                    }
                    break;
                case 4:
                    j6 = jsonReader.nextInt();
                    continue;
                case 5:
                    i4 = (int) (Utils.dpScale() * jsonReader.nextInt());
                    continue;
                case 6:
                    i5 = (int) (Utils.dpScale() * jsonReader.nextInt());
                    continue;
                case 7:
                    i10 = Color.parseColor(jsonReader.nextString());
                    continue;
                case 8:
                    animatableTransform = AnimatableTransformParser.parse(jsonReader, lottieComposition);
                    continue;
                case 9:
                    f10 = f11;
                    str = str2;
                    int nextInt2 = jsonReader.nextInt();
                    if (nextInt2 >= Layer.MatteType.values().length) {
                        lottieComposition.addWarning("Unsupported matte type: " + nextInt2);
                        break;
                    } else {
                        matteType2 = Layer.MatteType.values()[nextInt2];
                        int i11 = AnonymousClass1.$SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[matteType2.ordinal()];
                        if (i11 == 1) {
                            lottieComposition.addWarning("Unsupported matte type: Luma");
                        } else if (i11 == 2) {
                            lottieComposition.addWarning("Unsupported matte type: Luma Inverted");
                        }
                        lottieComposition.incrementMatteOrMaskCount(1);
                        break;
                    }
                case 10:
                    f10 = f11;
                    str = str2;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(MaskParser.parse(jsonReader, lottieComposition));
                    }
                    lottieComposition.incrementMatteOrMaskCount(arrayList.size());
                    jsonReader.endArray();
                    break;
                case 11:
                    f10 = f11;
                    str = str2;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ContentModel parse = ContentModelParser.parse(jsonReader, lottieComposition);
                        if (parse != null) {
                            arrayList2.add(parse);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case 12:
                    f10 = f11;
                    str = str2;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        int selectName = jsonReader.selectName(TEXT_NAMES);
                        if (selectName == 0) {
                            animatableTextFrame = AnimatableValueParser.parseDocumentData(jsonReader, lottieComposition);
                        } else if (selectName != 1) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                animatableTextProperties = AnimatableTextPropertiesParser.parse(jsonReader, lottieComposition);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 13:
                    f10 = f11;
                    str = str2;
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            int selectName2 = jsonReader.selectName(EFFECTS_NAMES);
                            if (selectName2 == 0) {
                                int nextInt3 = jsonReader.nextInt();
                                if (nextInt3 == 29) {
                                    blurEffect = BlurEffectParser.parse(jsonReader, lottieComposition);
                                } else if (nextInt3 == 25) {
                                    dropShadowEffect = new DropShadowEffectParser().parse(jsonReader, lottieComposition);
                                }
                            } else if (selectName2 != 1) {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            } else {
                                arrayList3.add(jsonReader.nextString());
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    lottieComposition.addWarning("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    break;
                case 14:
                    f17 = (float) jsonReader.nextDouble();
                    continue;
                case 15:
                    f16 = (float) jsonReader.nextDouble();
                    continue;
                case 16:
                    f10 = f11;
                    str = str2;
                    f14 = (float) (jsonReader.nextDouble() * Utils.dpScale());
                    break;
                case 17:
                    f10 = f11;
                    str = str2;
                    f15 = (float) (jsonReader.nextDouble() * Utils.dpScale());
                    break;
                case 18:
                    f12 = (float) jsonReader.nextDouble();
                    continue;
                case 19:
                    f13 = (float) jsonReader.nextDouble();
                    continue;
                case 20:
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    continue;
                case 21:
                    str4 = jsonReader.nextString();
                    continue;
                case 22:
                    z11 = jsonReader.nextBoolean();
                    continue;
                case 23:
                    if (jsonReader.nextInt() == 1) {
                        z10 = true;
                        break;
                    } else {
                        z10 = false;
                        continue;
                    }
                case 24:
                    int nextInt4 = jsonReader.nextInt();
                    if (nextInt4 >= LBlendMode.values().length) {
                        lottieComposition.addWarning("Unsupported Blend Mode: " + nextInt4);
                        lBlendMode2 = LBlendMode.NORMAL;
                        break;
                    } else {
                        lBlendMode2 = LBlendMode.values()[nextInt4];
                        continue;
                    }
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    f10 = f11;
                    str = str2;
                    break;
            }
            f11 = f10;
            str2 = str;
        }
        float f18 = f11;
        String str5 = str2;
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (f12 > f18) {
            z2 = z10;
            f5 = valueOf;
            arrayList4.add(new Keyframe(lottieComposition, valueOf, valueOf, null, 0.0f, Float.valueOf(f12)));
        } else {
            f5 = valueOf;
            z2 = z10;
        }
        if (f13 <= f18) {
            f13 = lottieComposition.getEndFrame();
        }
        arrayList4.add(new Keyframe(lottieComposition, valueOf2, valueOf2, null, f12, Float.valueOf(f13)));
        arrayList4.add(new Keyframe(lottieComposition, f5, f5, null, f13, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str4)) {
            lottieComposition.addWarning("Convert your Illustrator layers to shape layers.");
        }
        if (z2) {
            if (animatableTransform == null) {
                animatableTransform = new AnimatableTransform();
            }
            animatableTransform.setAutoOrient(z2);
        }
        return new Layer(arrayList2, lottieComposition, str3, j5, layerType, j6, str5, arrayList, animatableTransform, i4, i5, i10, f17, f16, f14, f15, animatableTextFrame, animatableTextProperties, arrayList4, matteType2, animatableFloatValue, z11, blurEffect, dropShadowEffect, lBlendMode2);
    }
}
