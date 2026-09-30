package io.getunleash.android.http;

import android.content.Context;
import io.getunleash.android.UnleashConfig;
import io.getunleash.android.cache.CacheDirectoryProvider;
import io.getunleash.android.data.DataStrategy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/getunleash/android/http/ClientBuilder;", "", "unleashConfig", "Lio/getunleash/android/UnleashConfig;", "androidContext", "Landroid/content/Context;", "<init>", "(Lio/getunleash/android/UnleashConfig;Landroid/content/Context;)V", "build", "Lokhttp3/OkHttpClient;", "clientName", "", "strategy", "Lio/getunleash/android/data/DataStrategy;", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClientBuilder {

    @NotNull
    private final Context androidContext;

    @NotNull
    private final UnleashConfig unleashConfig;

    public ClientBuilder(@NotNull UnleashConfig unleashConfig, @NotNull Context androidContext) {
        Intrinsics.echo(unleashConfig, "unleashConfig");
        Intrinsics.echo(androidContext, "androidContext");
        this.unleashConfig = unleashConfig;
        this.androidContext = androidContext;
    }

    @NotNull
    public final OkHttpClient build(@NotNull String clientName, @NotNull DataStrategy strategy) {
        OkHttpClient.Builder builder;
        Intrinsics.echo(clientName, "clientName");
        Intrinsics.echo(strategy, "strategy");
        OkHttpClient httpClient = this.unleashConfig.getHttpClient();
        if (httpClient == null || (builder = httpClient.newBuilder()) == null) {
            builder = new OkHttpClient.Builder();
        }
        long httpReadTimeout = strategy.getHttpReadTimeout();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder connectTimeout = builder.readTimeout(httpReadTimeout, timeUnit).writeTimeout(strategy.getHttpWriteTimeout(), timeUnit).connectTimeout(strategy.getHttpConnectionTimeout(), timeUnit);
        if (this.unleashConfig.getLocalStorageConfig().getEnabled()) {
            connectTimeout.cache(new Cache(new CacheDirectoryProvider(this.unleashConfig.getLocalStorageConfig(), this.androidContext, null, 4, null).getCacheDirectory("unleash_" + clientName + "_http_cache", true), strategy.getHttpCacheSize()));
        }
        return connectTimeout.build();
    }
}
