package com.airbnb.lottie.utils;

import Q0.c;

/* loaded from: classes3.dex */
public class GammaEvaluator {
    private static float EOCF_sRGB(float f5) {
        if (f5 <= 0.04045f) {
            return f5 / 12.92f;
        }
        return (float) Math.pow((f5 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float OECF_sRGB(float f5) {
        if (f5 <= 0.0031308f) {
            return f5 * 12.92f;
        }
        return (float) ((Math.pow(f5, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int evaluate(float f5, int i4, int i5) {
        if (i4 == i5 || f5 <= 0.0f) {
            return i4;
        }
        if (f5 >= 1.0f) {
            return i5;
        }
        float f10 = ((i4 >> 24) & 255) / 255.0f;
        float f11 = ((i5 >> 24) & 255) / 255.0f;
        float EOCF_sRGB = EOCF_sRGB(((i4 >> 16) & 255) / 255.0f);
        float EOCF_sRGB2 = EOCF_sRGB(((i4 >> 8) & 255) / 255.0f);
        float EOCF_sRGB3 = EOCF_sRGB((i4 & 255) / 255.0f);
        float EOCF_sRGB4 = EOCF_sRGB(((i5 >> 16) & 255) / 255.0f);
        float EOCF_sRGB5 = EOCF_sRGB(((i5 >> 8) & 255) / 255.0f);
        float EOCF_sRGB6 = EOCF_sRGB((i5 & 255) / 255.0f);
        float lima = c.lima(f11, f10, f5, f10);
        float lima2 = c.lima(EOCF_sRGB4, EOCF_sRGB, f5, EOCF_sRGB);
        float lima3 = c.lima(EOCF_sRGB5, EOCF_sRGB2, f5, EOCF_sRGB2);
        float lima4 = c.lima(EOCF_sRGB6, EOCF_sRGB3, f5, EOCF_sRGB3);
        float OECF_sRGB = OECF_sRGB(lima2) * 255.0f;
        float OECF_sRGB2 = OECF_sRGB(lima3) * 255.0f;
        return Math.round(OECF_sRGB(lima4) * 255.0f) | (Math.round(OECF_sRGB) << 16) | (Math.round(lima * 255.0f) << 24) | (Math.round(OECF_sRGB2) << 8);
    }
}
