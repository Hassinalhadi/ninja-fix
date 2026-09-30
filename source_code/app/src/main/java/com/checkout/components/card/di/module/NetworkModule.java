package com.checkout.components.card.di.module;

import com.checkout.components.card.operations.network.NetworkApiClientImpl;
import com.checkout.components.card.operations.network.extension.OkHttpProviderExtensionKt;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Moshi;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J,\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\tH\u0007J,\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\tH\u0007¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/card/di/module/NetworkModule;", "", "<init>", "()V", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "publicKey", "", "provideNetworkApiClientImpl", "Lcom/checkout/components/card/operations/network/NetworkApiClientImpl;", "okHttpClient", "moshi", "baseUrl", Constants.KEY_URL, "cagNetworkApiClientImpl", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkModule {
    public static final int $stable = 0;

    @NotNull
    public final NetworkApiClientImpl cagNetworkApiClientImpl(@NotNull OkHttpClient okHttpClient, @NotNull Moshi moshi, @NotNull String baseUrl, @NotNull String url) {
        Intrinsics.echo(okHttpClient, "okHttpClient");
        Intrinsics.echo(moshi, "moshi");
        Intrinsics.echo(baseUrl, "baseUrl");
        Intrinsics.echo(url, "url");
        return new NetworkApiClientImpl(baseUrl, url, okHttpClient, moshi);
    }

    @NotNull
    public final Moshi provideMoshi() {
        Moshi build = new Moshi.Builder().build();
        Intrinsics.delta(build, "build(...)");
        return build;
    }

    @NotNull
    public final NetworkApiClientImpl provideNetworkApiClientImpl(@NotNull OkHttpClient okHttpClient, @NotNull Moshi moshi, @NotNull String baseUrl, @NotNull String url) {
        Intrinsics.echo(okHttpClient, "okHttpClient");
        Intrinsics.echo(moshi, "moshi");
        Intrinsics.echo(baseUrl, "baseUrl");
        Intrinsics.echo(url, "url");
        return new NetworkApiClientImpl(baseUrl, url, okHttpClient, moshi);
    }

    @NotNull
    public final OkHttpClient provideOkHttpClient(@NotNull String publicKey) {
        Intrinsics.echo(publicKey, "publicKey");
        OkHttpClient.Builder retryOnConnectionFailure = new OkHttpClient.Builder().connectionSpecs(CollectionsKt.listOf(ConnectionSpec.RESTRICTED_TLS, ConnectionSpec.CLEARTEXT)).retryOnConnectionFailure(true);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder readTimeout = retryOnConnectionFailure.connectTimeout(10000L, timeUnit).callTimeout(10000L, timeUnit).readTimeout(OkHttpConstants.READ_TIMEOUT_MS, timeUnit);
        Intrinsics.echo(readTimeout, "<this>");
        return OkHttpProviderExtensionKt.addRequestInterceptors(readTimeout, publicKey).build();
    }
}
