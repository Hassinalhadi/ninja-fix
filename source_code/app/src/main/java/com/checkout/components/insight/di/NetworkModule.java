package com.checkout.components.insight.di;

import com.checkout.components.insight.config.EnvironmentConfig;
import com.checkout.components.insight.data.dto.EventData;
import com.checkout.components.insight.data.remote.InsightApi;
import com.checkout.components.insight.data.repository.InsightRepositoryImpl;
import com.checkout.components.insight.di.extension.OkHttpProviderExtensionKt;
import com.checkout.components.insight.domain.repository.InsightRepository;
import com.checkout.components.insight.usecase.SendLogsUseCase;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.insight.EventType;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.logging.HttpLoggingInterceptor;
import vg.as;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\r\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fJ%\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0007J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/checkout/components/insight/di/NetworkModule;", "", "<init>", "()V", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideEnvironmentConfig", "Lcom/checkout/components/insight/config/EnvironmentConfig;", "environment", "Lcom/checkout/components/interfaces/Environment;", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideLoggingInterceptor$insight_standardRelease", "provideInsightApi", "Lcom/checkout/components/insight/data/remote/InsightApi;", "moshi", "httpClient", "Lokhttp3/OkHttpClient;", "environmentConfig", "provideInsightApi$insight_standardRelease", "provideInsightRepository", "Lcom/checkout/components/insight/domain/repository/InsightRepository;", "api", "provideInsightRepository$insight_standardRelease", "provideSendLogsUseCase", "Lcom/checkout/components/insight/usecase/SendLogsUseCase;", "insightRepository", "provideOkHttpClient", "loggingInterceptor", "provideOkHttpClient$insight_standardRelease", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkModule {
    public final EnvironmentConfig provideEnvironmentConfig(Environment environment) {
        Intrinsics.echo(environment, "environment");
        return new EnvironmentConfig(environment);
    }

    public final InsightApi provideInsightApi$insight_standardRelease(Moshi moshi, OkHttpClient httpClient, EnvironmentConfig environmentConfig) {
        Intrinsics.echo(moshi, "moshi");
        Intrinsics.echo(httpClient, "httpClient");
        Intrinsics.echo(environmentConfig, "environmentConfig");
        as asVar = new as();
        asVar.alpha(environmentConfig.getLogEndpoint());
        asVar.charlie.add(new xg.a(moshi));
        asVar.alpha = httpClient;
        Object bravo = asVar.bravo().bravo(InsightApi.class);
        Intrinsics.delta(bravo, "create(...)");
        return (InsightApi) bravo;
    }

    public final InsightRepository provideInsightRepository$insight_standardRelease(InsightApi api) {
        Intrinsics.echo(api, "api");
        return new InsightRepositoryImpl(api);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HttpLoggingInterceptor provideLoggingInterceptor$insight_standardRelease() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
        return httpLoggingInterceptor;
    }

    public final Moshi provideMoshi() {
        Moshi build = new Moshi.Builder().add((JsonAdapter.Factory) PolymorphicJsonAdapterFactory.of(EventData.class, Constants.KEY_TYPE).withSubtype(EventData.LogEvent.class, EventType.LOG.getValue()).withSubtype(EventData.ProductEvent.class, EventType.PRODUCT_EVENT.getValue()).withSubtype(EventData.MetricEvent.class, EventType.METRIC.getValue())).add((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).build();
        Intrinsics.delta(build, "build(...)");
        return build;
    }

    public final OkHttpClient provideOkHttpClient$insight_standardRelease(HttpLoggingInterceptor loggingInterceptor) {
        Intrinsics.echo(loggingInterceptor, "loggingInterceptor");
        OkHttpClient.Builder addInterceptor = OkHttpProviderExtensionKt.addUserAgentInterceptor(new OkHttpClient.Builder()).addInterceptor(loggingInterceptor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return addInterceptor.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(50L, timeUnit).protocols(CollectionsKt.white(Protocol.HTTP_1_1)).build();
    }

    public final SendLogsUseCase provideSendLogsUseCase(InsightRepository insightRepository) {
        Intrinsics.echo(insightRepository, "insightRepository");
        return new SendLogsUseCase(insightRepository);
    }
}
