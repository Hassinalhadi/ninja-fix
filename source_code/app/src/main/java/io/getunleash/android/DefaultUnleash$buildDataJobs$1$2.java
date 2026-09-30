package io.getunleash.android;

import Nd.c;
import io.getunleash.android.metrics.MetricsReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class DefaultUnleash$buildDataJobs$1$2 extends kotlin.jvm.internal.a implements Function1<c<? super Unit>, Object> {
    public DefaultUnleash$buildDataJobs$1$2(Object obj) {
        super(1, 0, MetricsReporter.class, obj, "sendMetrics", "sendMetrics(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(c<? super Unit> cVar) {
        Object buildDataJobs$lambda$7$sendMetrics;
        buildDataJobs$lambda$7$sendMetrics = DefaultUnleash.buildDataJobs$lambda$7$sendMetrics((MetricsReporter) this.receiver, cVar);
        return buildDataJobs$lambda$7$sendMetrics;
    }
}
