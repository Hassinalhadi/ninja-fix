package io.getunleash.android.metrics;

import Nd.c;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object alpha(MetricsReporter metricsReporter, Function1 function1, c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                function1 = null;
            }
            return metricsReporter.sendMetrics(function1, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMetrics");
    }
}
