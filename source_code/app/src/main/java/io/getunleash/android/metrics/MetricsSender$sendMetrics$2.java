package io.getunleash.android.metrics;

import Nd.c;
import Pd.e;
import Pd.i;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.getunleash.android.UnleashConfig;
import io.getunleash.android.data.Parser;
import io.getunleash.android.http.Throttler;
import io.getunleash.android.util.UnleashLogger;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import s6.AbstractC2716m6;

@e(c = "io.getunleash.android.metrics.MetricsSender$sendMetrics$2", f = "MetricsSender.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MetricsSender$sendMetrics$2 extends i implements Function1<c<? super Unit>, Object> {
    final /* synthetic */ Function1<Result<Unit>, Unit> $onComplete;
    int label;
    final /* synthetic */ MetricsSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MetricsSender$sendMetrics$2(MetricsSender metricsSender, Function1<? super Result<Unit>, Unit> function1, c<? super MetricsSender$sendMetrics$2> cVar) {
        super(1, cVar);
        this.this$0 = metricsSender;
        this.$onComplete = function1;
    }

    @Override // Pd.a
    public final c<Unit> create(c<?> cVar) {
        return new MetricsSender$sendMetrics$2(this.this$0, this.$onComplete, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(c<? super Unit> cVar) {
        return ((MetricsSender$sendMetrics$2) create(cVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        final Pair swapAndFreeze;
        UnleashConfig unleashConfig;
        UnleashConfig unleashConfig2;
        Map<String, String> map;
        HttpUrl httpUrl;
        OkHttpClient okHttpClient;
        Od.a aVar = Od.a.alpha;
        if (this.label == 0) {
            ResultKt.alpha(obj);
            swapAndFreeze = this.this$0.swapAndFreeze();
            unleashConfig = this.this$0.config;
            String appName = unleashConfig.getAppName();
            unleashConfig2 = this.this$0.config;
            MetricsPayload metricsPayload = new MetricsPayload(appName, unleashConfig2.getInstanceId(), (Bucket) swapAndFreeze.getFirst());
            Request.Builder builder = new Request.Builder();
            Headers.Companion companion = Headers.INSTANCE;
            map = this.this$0.applicationHeaders;
            Request.Builder headers = builder.headers(companion.of(map));
            httpUrl = this.this$0.metricsUrl;
            Request.Builder url = headers.url(httpUrl);
            RequestBody.Companion companion2 = RequestBody.INSTANCE;
            String json = Parser.INSTANCE.getMetricsBodyAdapter().toJson(metricsPayload);
            Intrinsics.delta(json, "toJson(...)");
            final Request build = url.post(companion2.create(json, MediaType.INSTANCE.get("application/json"))).build();
            okHttpClient = this.this$0.httpClient;
            Call newCall = okHttpClient.newCall(build);
            final MetricsSender metricsSender = this.this$0;
            final Function1<Result<Unit>, Unit> function1 = this.$onComplete;
            FirebasePerfOkHttpClient.enqueue(newCall, new Callback() { // from class: io.getunleash.android.metrics.MetricsSender$sendMetrics$2.1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e) {
                    AtomicBoolean atomicBoolean;
                    Intrinsics.echo(call, "call");
                    Intrinsics.echo(e, "e");
                    MetricsSender.this.mergeBack(swapAndFreeze.getSecond());
                    atomicBoolean = MetricsSender.this.inFlight;
                    atomicBoolean.set(false);
                    try {
                        Function1<Result<Unit>, Unit> function12 = function1;
                        if (function12 != null) {
                            Result.Companion companion3 = Result.INSTANCE;
                            function12.invoke(new Result<>(Result.m206constructorimpl(ResultKt.createFailure(e))));
                        }
                    } catch (Throwable th) {
                        UnleashLogger.INSTANCE.w("MetricsSender", "onComplete callback threw", th);
                    }
                    UnleashLogger.INSTANCE.i("MetricsSender", "Failed to report metrics for interval", e);
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    HttpUrl httpUrl2;
                    Throttler throttler;
                    AtomicBoolean atomicBoolean;
                    Intrinsics.echo(call, "call");
                    Intrinsics.echo(response, "response");
                    UnleashLogger unleashLogger = UnleashLogger.INSTANCE;
                    StringBuilder sb2 = new StringBuilder("Received status code ");
                    sb2.append(response.code());
                    sb2.append(" from ");
                    sb2.append(build.method());
                    sb2.append(' ');
                    httpUrl2 = MetricsSender.this.metricsUrl;
                    sb2.append(httpUrl2);
                    UnleashLogger.d$default(unleashLogger, "MetricsSender", sb2.toString(), null, 4, null);
                    throttler = MetricsSender.this.throttler;
                    throttler.handle(response.code());
                    AbstractC2716m6.alpha(response.body(), null);
                    atomicBoolean = MetricsSender.this.inFlight;
                    atomicBoolean.set(false);
                    try {
                        Function1<Result<Unit>, Unit> function12 = function1;
                        if (function12 != null) {
                            Result.Companion companion3 = Result.INSTANCE;
                            function12.invoke(new Result<>(Result.m206constructorimpl(Unit.INSTANCE)));
                        }
                    } catch (Throwable th) {
                        UnleashLogger.INSTANCE.w("MetricsSender", "onComplete callback threw", th);
                    }
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
