package io.getunleash.android.metrics;

import Nd.c;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import io.getunleash.android.UnleashConfig;
import io.getunleash.android.data.Variant;
import io.getunleash.android.http.Throttler;
import io.getunleash.android.util.UnleashLogger;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u0001:\u00010B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0017\u001a\u00020\u00112\u001a\u0010\u0016\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0016\u0010&\u001a\u0004\u0018\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lio/getunleash/android/metrics/MetricsSender;", "Lio/getunleash/android/metrics/MetricsHandler;", "Lio/getunleash/android/UnleashConfig;", Constants.KEY_CONFIG, "Lokhttp3/OkHttpClient;", "httpClient", "", "", "applicationHeaders", "<init>", "(Lio/getunleash/android/UnleashConfig;Lokhttp3/OkHttpClient;Ljava/util/Map;)V", "Lkotlin/Pair;", "Lio/getunleash/android/metrics/Bucket;", "Lio/getunleash/android/metrics/CountBucket;", "swapAndFreeze", "()Lkotlin/Pair;", "snapshot", "", "mergeBack", "(Lio/getunleash/android/metrics/CountBucket;)V", "Lkotlin/Function1;", "Lkotlin/Result;", "onComplete", "sendMetrics", "(Lkotlin/jvm/functions/Function1;LNd/c;)Ljava/lang/Object;", "featureName", "", "enabled", Column.COUNT, "(Ljava/lang/String;Z)Z", "Lio/getunleash/android/data/Variant;", "variant", "countVariant", "(Ljava/lang/String;Lio/getunleash/android/data/Variant;)Lio/getunleash/android/data/Variant;", "Lio/getunleash/android/UnleashConfig;", "Lokhttp3/OkHttpClient;", "Ljava/util/Map;", "Lokhttp3/HttpUrl;", "metricsUrl", "Lokhttp3/HttpUrl;", "bucket", "Lio/getunleash/android/metrics/CountBucket;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "inFlight", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/getunleash/android/http/Throttler;", "throttler", "Lio/getunleash/android/http/Throttler;", "Companion", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MetricsSender implements MetricsHandler {

    @NotNull
    private static final String TAG = "MetricsSender";

    @NotNull
    private final Map<String, String> applicationHeaders;

    @NotNull
    private CountBucket bucket;

    @NotNull
    private final UnleashConfig config;

    @NotNull
    private final OkHttpClient httpClient;

    @NotNull
    private final AtomicBoolean inFlight;

    @Nullable
    private final HttpUrl metricsUrl;

    @NotNull
    private final Throttler throttler;

    public MetricsSender(@NotNull UnleashConfig config, @NotNull OkHttpClient httpClient, @NotNull Map<String, String> applicationHeaders) {
        HttpUrl httpUrl;
        HttpUrl.Builder newBuilder;
        HttpUrl.Builder addPathSegment;
        HttpUrl.Builder addPathSegment2;
        Intrinsics.echo(config, "config");
        Intrinsics.echo(httpClient, "httpClient");
        Intrinsics.echo(applicationHeaders, "applicationHeaders");
        this.config = config;
        this.httpClient = httpClient;
        this.applicationHeaders = applicationHeaders;
        String proxyUrl = config.getProxyUrl();
        HttpUrl build = (proxyUrl == null || (httpUrl = HttpUrl.INSTANCE.get(proxyUrl)) == null || (newBuilder = httpUrl.newBuilder()) == null || (addPathSegment = newBuilder.addPathSegment("client")) == null || (addPathSegment2 = addPathSegment.addPathSegment("metrics")) == null) ? null : addPathSegment2.build();
        this.metricsUrl = build;
        this.bucket = new CountBucket(new Date(), null, null, null, 14, null);
        this.inFlight = new AtomicBoolean(false);
        this.throttler = new Throttler(TimeUnit.MILLISECONDS.toSeconds(config.getMetricsStrategy().getInterval()), 300L, String.valueOf(build));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mergeBack(CountBucket snapshot) {
        for (Map.Entry<String, AtomicInteger> entry : snapshot.getYes().entrySet()) {
            this.bucket.count(entry.getKey(), true, entry.getValue().get());
        }
        for (Map.Entry<String, AtomicInteger> entry2 : snapshot.getNo().entrySet()) {
            this.bucket.count(entry2.getKey(), false, entry2.getValue().get());
        }
        for (Map.Entry<Pair<String, String>, AtomicInteger> entry3 : snapshot.getVariants().entrySet()) {
            Pair<String, String> key = entry3.getKey();
            this.bucket.countVariant(key.getFirst(), new Variant(key.getSecond(), false, false, null, 14, null), entry3.getValue().get());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Bucket, CountBucket> swapAndFreeze() {
        CountBucket copy$default = CountBucket.copy$default(this.bucket, null, null, null, null, 15, null);
        CountBucket countBucket = new CountBucket(new Date(), null, null, null, 14, null);
        this.bucket = countBucket;
        return new Pair<>(copy$default.toBucket(countBucket.getStart()), copy$default);
    }

    @Override // io.getunleash.android.metrics.MetricsCollector
    public boolean count(@NotNull String featureName, boolean enabled) {
        Intrinsics.echo(featureName, "featureName");
        return b.alpha(this.bucket, featureName, enabled, 0, 4, null);
    }

    @Override // io.getunleash.android.metrics.MetricsCollector
    @NotNull
    public Variant countVariant(@NotNull String featureName, @NotNull Variant variant) {
        Intrinsics.echo(featureName, "featureName");
        Intrinsics.echo(variant, "variant");
        return b.bravo(this.bucket, featureName, variant, 0, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // io.getunleash.android.metrics.MetricsReporter
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendMetrics(@Nullable Function1<? super Result<Unit>, Unit> function1, @NotNull c<? super Unit> cVar) {
        MetricsSender$sendMetrics$1 metricsSender$sendMetrics$1;
        Object obj;
        int i4;
        if (cVar instanceof MetricsSender$sendMetrics$1) {
            metricsSender$sendMetrics$1 = (MetricsSender$sendMetrics$1) cVar;
            int i5 = metricsSender$sendMetrics$1.label;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                metricsSender$sendMetrics$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                obj = metricsSender$sendMetrics$1.result;
                Od.a aVar = Od.a.alpha;
                i4 = metricsSender$sendMetrics$1.label;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (this.metricsUrl == null) {
                        UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "No proxy URL configured, skipping metrics reporting", null, 4, null);
                        return Unit.INSTANCE;
                    }
                    if (this.bucket.isEmpty()) {
                        UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "No metrics to report", null, 4, null);
                        return Unit.INSTANCE;
                    }
                    if (!this.inFlight.compareAndSet(false, true)) {
                        UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Metrics report already in-flight, skipping this send", null, 4, null);
                        return Unit.INSTANCE;
                    }
                    Throttler throttler = this.throttler;
                    MetricsSender$sendMetrics$2 metricsSender$sendMetrics$2 = new MetricsSender$sendMetrics$2(this, function1, null);
                    metricsSender$sendMetrics$1.L$0 = null;
                    metricsSender$sendMetrics$1.label = 1;
                    obj = throttler.runIfAllowed(metricsSender$sendMetrics$2, metricsSender$sendMetrics$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (((Unit) obj) == null) {
                    this.inFlight.set(false);
                }
                return Unit.INSTANCE;
            }
        }
        metricsSender$sendMetrics$1 = new MetricsSender$sendMetrics$1(this, cVar);
        obj = metricsSender$sendMetrics$1.result;
        Od.a aVar2 = Od.a.alpha;
        i4 = metricsSender$sendMetrics$1.label;
        if (i4 == 0) {
        }
        if (((Unit) obj) == null) {
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MetricsSender(UnleashConfig unleashConfig, OkHttpClient okHttpClient, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(unleashConfig, okHttpClient, (i4 & 4) != 0 ? unleashConfig.getApplicationHeaders(unleashConfig.getMetricsStrategy()) : map);
    }
}
