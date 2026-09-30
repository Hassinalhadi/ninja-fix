package io.getunleash.android.metrics;

import io.getunleash.android.data.Variant;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ boolean alpha(UnleashMetricsBucket unleashMetricsBucket, String str, boolean z2, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 4) != 0) {
                i4 = 1;
            }
            return unleashMetricsBucket.count(str, z2, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: count");
    }

    public static /* synthetic */ Variant bravo(UnleashMetricsBucket unleashMetricsBucket, String str, Variant variant, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 4) != 0) {
                i4 = 1;
            }
            return unleashMetricsBucket.countVariant(str, variant, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: countVariant");
    }
}
