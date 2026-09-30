package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import bv.ax;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
class KeyframeParser {
    private static final float MAX_CP_VALUE = 100.0f;
    private static ax pathInterpolatorCache;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    static JsonReader.Options NAMES = JsonReader.Options.of("t", "s", "e", "o", "i", "h", "to", Constants.INAPP_ID_IN_PAYLOAD);
    static JsonReader.Options INTERPOLATOR_NAMES = JsonReader.Options.of("x", "y");

    private static WeakReference<Interpolator> getInterpolator(int i4) {
        WeakReference<Interpolator> weakReference;
        synchronized (KeyframeParser.class) {
            weakReference = (WeakReference) pathInterpolatorCache().delta(i4);
        }
        return weakReference;
    }

    private static Interpolator interpolatorFor(PointF pointF, PointF pointF2) {
        WeakReference<Interpolator> interpolator;
        Interpolator linearInterpolator;
        pointF.x = MiscUtils.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.clamp(pointF.y, -100.0f, MAX_CP_VALUE);
        pointF2.x = MiscUtils.clamp(pointF2.x, -1.0f, 1.0f);
        float clamp = MiscUtils.clamp(pointF2.y, -100.0f, MAX_CP_VALUE);
        pointF2.y = clamp;
        int hashFor = Utils.hashFor(pointF.x, pointF.y, pointF2.x, clamp);
        Interpolator interpolator2 = null;
        if (L.getDisablePathInterpolatorCache()) {
            interpolator = null;
        } else {
            interpolator = getInterpolator(hashFor);
        }
        if (interpolator != null) {
            interpolator2 = interpolator.get();
        }
        if (interpolator != null && interpolator2 != null) {
            return interpolator2;
        }
        try {
            linearInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                linearInterpolator = new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!L.getDisablePathInterpolatorCache()) {
            try {
                putInterpolator(hashFor, new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    public static <T> Keyframe<T> parse(JsonReader jsonReader, LottieComposition lottieComposition, float f5, ValueParser<T> valueParser, boolean z2, boolean z10) throws IOException {
        if (z2 && z10) {
            return parseMultiDimensionalKeyframe(lottieComposition, jsonReader, f5, valueParser);
        }
        if (z2) {
            return parseKeyframe(lottieComposition, jsonReader, f5, valueParser);
        }
        return parseStaticValue(jsonReader, f5, valueParser);
    }

    private static <T> Keyframe<T> parseKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f5, ValueParser<T> valueParser) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t5;
        jsonReader.beginObject();
        PointF pointF = null;
        T t10 = null;
        T t11 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f10 = 0.0f;
        boolean z2 = false;
        PointF pointF4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    f10 = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t11 = valueParser.parse(jsonReader, f5);
                    break;
                case 2:
                    t10 = valueParser.parse(jsonReader, f5);
                    break;
                case 3:
                    pointF = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF4 = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.nextInt() == 1) {
                        z2 = true;
                        break;
                    } else {
                        z2 = false;
                        break;
                    }
                case 6:
                    pointF2 = JsonUtils.jsonToPoint(jsonReader, f5);
                    break;
                case 7:
                    pointF3 = JsonUtils.jsonToPoint(jsonReader, f5);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z2) {
            interpolator2 = LINEAR_INTERPOLATOR;
            t5 = t11;
        } else {
            if (pointF != null && pointF4 != null) {
                interpolator = interpolatorFor(pointF, pointF4);
            } else {
                interpolator = LINEAR_INTERPOLATOR;
            }
            interpolator2 = interpolator;
            t5 = t10;
        }
        Keyframe<T> keyframe = new Keyframe<>(lottieComposition, t11, t5, interpolator2, f10, null);
        keyframe.pathCp1 = pointF2;
        keyframe.pathCp2 = pointF3;
        return keyframe;
    }

    private static <T> Keyframe<T> parseMultiDimensionalKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f5, ValueParser<T> valueParser) throws IOException {
        Interpolator interpolator;
        Interpolator interpolatorFor;
        Interpolator interpolatorFor2;
        T t5;
        Interpolator interpolator2;
        PointF pointF;
        PointF pointF2;
        Keyframe<T> keyframe;
        PointF pointF3;
        boolean z2;
        float f10;
        jsonReader.beginObject();
        boolean z10 = false;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        T t10 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        float f11 = 0.0f;
        T t11 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    f11 = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t10 = valueParser.parse(jsonReader, f5);
                    break;
                case 2:
                    t11 = valueParser.parse(jsonReader, f5);
                    break;
                case 3:
                    boolean z11 = z10;
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int selectName = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (selectName != 0) {
                                if (selectName != 1) {
                                    jsonReader.skipValue();
                                } else {
                                    JsonReader.Token peek = jsonReader.peek();
                                    JsonReader.Token token = JsonReader.Token.NUMBER;
                                    if (peek == token) {
                                        pointF3 = pointF8;
                                        f15 = (float) jsonReader.nextDouble();
                                        f13 = f15;
                                    } else {
                                        pointF3 = pointF8;
                                        jsonReader.beginArray();
                                        f13 = (float) jsonReader.nextDouble();
                                        if (jsonReader.peek() == token) {
                                            f15 = (float) jsonReader.nextDouble();
                                        } else {
                                            f15 = f13;
                                        }
                                        jsonReader.endArray();
                                    }
                                }
                            } else {
                                pointF3 = pointF8;
                                JsonReader.Token peek2 = jsonReader.peek();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (peek2 == token2) {
                                    f14 = (float) jsonReader.nextDouble();
                                    f12 = f14;
                                } else {
                                    jsonReader.beginArray();
                                    f12 = (float) jsonReader.nextDouble();
                                    if (jsonReader.peek() == token2) {
                                        f14 = (float) jsonReader.nextDouble();
                                    } else {
                                        f14 = f12;
                                    }
                                    jsonReader.endArray();
                                }
                            }
                            pointF8 = pointF3;
                        }
                        pointF6 = new PointF(f12, f13);
                        pointF7 = new PointF(f14, f15);
                        jsonReader.endObject();
                    } else {
                        pointF4 = JsonUtils.jsonToPoint(jsonReader, f5);
                    }
                    z10 = z11;
                    break;
                case 4:
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f16 = 0.0f;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        float f19 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int selectName2 = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (selectName2 != 0) {
                                z2 = z10;
                                if (selectName2 != 1) {
                                    jsonReader.skipValue();
                                } else {
                                    JsonReader.Token peek3 = jsonReader.peek();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (peek3 == token3) {
                                        f19 = (float) jsonReader.nextDouble();
                                        f17 = f19;
                                    } else {
                                        jsonReader.beginArray();
                                        PointF pointF12 = pointF10;
                                        float nextDouble = (float) jsonReader.nextDouble();
                                        if (jsonReader.peek() == token3) {
                                            f19 = (float) jsonReader.nextDouble();
                                        } else {
                                            f19 = nextDouble;
                                        }
                                        jsonReader.endArray();
                                        pointF10 = pointF12;
                                        f17 = nextDouble;
                                    }
                                }
                            } else {
                                z2 = z10;
                                PointF pointF13 = pointF10;
                                JsonReader.Token peek4 = jsonReader.peek();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (peek4 == token4) {
                                    pointF10 = pointF13;
                                    f18 = (float) jsonReader.nextDouble();
                                    f16 = f18;
                                } else {
                                    pointF10 = pointF13;
                                    jsonReader.beginArray();
                                    float nextDouble2 = (float) jsonReader.nextDouble();
                                    if (jsonReader.peek() == token4) {
                                        f10 = nextDouble2;
                                        f18 = (float) jsonReader.nextDouble();
                                    } else {
                                        f10 = nextDouble2;
                                        f18 = f10;
                                    }
                                    jsonReader.endArray();
                                    f16 = f10;
                                }
                            }
                            z10 = z2;
                        }
                        PointF pointF14 = new PointF(f16, f17);
                        PointF pointF15 = new PointF(f18, f19);
                        jsonReader.endObject();
                        pointF9 = pointF15;
                        pointF8 = pointF14;
                        break;
                    } else {
                        pointF5 = JsonUtils.jsonToPoint(jsonReader, f5);
                        break;
                    }
                case 5:
                    if (jsonReader.nextInt() == 1) {
                        z10 = true;
                        break;
                    } else {
                        z10 = false;
                        break;
                    }
                case 6:
                    pointF10 = JsonUtils.jsonToPoint(jsonReader, f5);
                    break;
                case 7:
                    pointF11 = JsonUtils.jsonToPoint(jsonReader, f5);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        boolean z12 = z10;
        PointF pointF16 = pointF8;
        jsonReader.endObject();
        if (z12) {
            interpolator2 = LINEAR_INTERPOLATOR;
            t5 = t10;
        } else {
            if (pointF4 != null && pointF5 != null) {
                interpolator = interpolatorFor(pointF4, pointF5);
            } else {
                if (pointF6 != null && pointF7 != null && pointF16 != null && pointF9 != null) {
                    interpolatorFor = interpolatorFor(pointF6, pointF16);
                    interpolatorFor2 = interpolatorFor(pointF7, pointF9);
                    t5 = t11;
                    interpolator2 = null;
                    if (interpolatorFor == null && interpolatorFor2 != null) {
                        pointF2 = pointF11;
                        pointF = pointF10;
                        keyframe = new Keyframe<>(lottieComposition, t10, t5, interpolatorFor, interpolatorFor2, f11, null);
                    } else {
                        pointF = pointF10;
                        pointF2 = pointF11;
                        keyframe = new Keyframe<>(lottieComposition, t10, t5, interpolator2, f11, null);
                    }
                    keyframe.pathCp1 = pointF;
                    keyframe.pathCp2 = pointF2;
                    return keyframe;
                }
                interpolator = LINEAR_INTERPOLATOR;
            }
            interpolator2 = interpolator;
            t5 = t11;
        }
        interpolatorFor = null;
        interpolatorFor2 = null;
        if (interpolatorFor == null) {
        }
        pointF = pointF10;
        pointF2 = pointF11;
        keyframe = new Keyframe<>(lottieComposition, t10, t5, interpolator2, f11, null);
        keyframe.pathCp1 = pointF;
        keyframe.pathCp2 = pointF2;
        return keyframe;
    }

    private static <T> Keyframe<T> parseStaticValue(JsonReader jsonReader, float f5, ValueParser<T> valueParser) throws IOException {
        return new Keyframe<>(valueParser.parse(jsonReader, f5));
    }

    private static ax pathInterpolatorCache() {
        if (pathInterpolatorCache == null) {
            pathInterpolatorCache = new ax(0);
        }
        return pathInterpolatorCache;
    }

    private static void putInterpolator(int i4, WeakReference<Interpolator> weakReference) {
        synchronized (KeyframeParser.class) {
            pathInterpolatorCache.foxtrot(i4, weakReference);
        }
    }
}
