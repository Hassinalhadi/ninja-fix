package io.getunleash.android.metrics;

import Nd.c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J.\u0010\u0006\u001a\u00020\u00042\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/getunleash/android/metrics/MetricsReporter;", "", "Lkotlin/Function1;", "Lkotlin/Result;", "", "onComplete", "sendMetrics", "(Lkotlin/jvm/functions/Function1;LNd/c;)Ljava/lang/Object;", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MetricsReporter {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    @Nullable
    Object sendMetrics(@Nullable Function1<? super Result<Unit>, Unit> function1, @NotNull c<? super Unit> cVar);
}
