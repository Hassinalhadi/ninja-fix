package io.getunleash.android.metrics;

import Nd.c;
import com.clevertap.android.sdk.db.Column;
import io.getunleash.android.data.Variant;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0012\u001a\u00020\u00102\u001a\u0010\u0011\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/getunleash/android/metrics/NoOpMetrics;", "Lio/getunleash/android/metrics/MetricsHandler;", "<init>", "()V", "", "featureName", "", "enabled", Column.COUNT, "(Ljava/lang/String;Z)Z", "Lio/getunleash/android/data/Variant;", "variant", "countVariant", "(Ljava/lang/String;Lio/getunleash/android/data/Variant;)Lio/getunleash/android/data/Variant;", "Lkotlin/Function1;", "Lkotlin/Result;", "", "onComplete", "sendMetrics", "(Lkotlin/jvm/functions/Function1;LNd/c;)Ljava/lang/Object;", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NoOpMetrics implements MetricsHandler {
    @Override // io.getunleash.android.metrics.MetricsCollector
    public boolean count(@NotNull String featureName, boolean enabled) {
        Intrinsics.echo(featureName, "featureName");
        return enabled;
    }

    @Override // io.getunleash.android.metrics.MetricsCollector
    @NotNull
    public Variant countVariant(@NotNull String featureName, @NotNull Variant variant) {
        Intrinsics.echo(featureName, "featureName");
        Intrinsics.echo(variant, "variant");
        return variant;
    }

    @Override // io.getunleash.android.metrics.MetricsReporter
    @Nullable
    public Object sendMetrics(@Nullable Function1<? super Result<Unit>, Unit> function1, @NotNull c<? super Unit> cVar) {
        return Unit.INSTANCE;
    }
}
