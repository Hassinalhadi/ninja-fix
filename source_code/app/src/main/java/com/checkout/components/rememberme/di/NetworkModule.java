package com.checkout.components.rememberme.di;

import com.checkout.components.interfaces.Environment;
import com.checkout.components.rememberme.AbstractC0940f0;
import com.checkout.components.rememberme.data.ConsumerApi;
import com.checkout.components.rememberme.data.TokeniseApi;
import com.checkout.components.rememberme.utils.ExtensionsKt;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import vg.as;
import xg.a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J \u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0010"}, d2 = {"Lcom/checkout/components/rememberme/di/NetworkModule;", "", "<init>", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "loggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "httpClient", "Lokhttp3/OkHttpClient;", "consumerApi", "Lcom/checkout/components/rememberme/data/ConsumerApi;", "environment", "Lcom/checkout/components/interfaces/Environment;", "tokeniseApi", "Lcom/checkout/components/rememberme/data/TokeniseApi;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkModule {
    public static final int $stable = 0;

    @NotNull
    public final ConsumerApi consumerApi(@NotNull OkHttpClient httpClient, @NotNull Moshi moshi, @NotNull Environment environment) {
        Intrinsics.echo(httpClient, "httpClient");
        Intrinsics.echo(moshi, "moshi");
        Intrinsics.echo(environment, "environment");
        as asVar = new as();
        asVar.alpha(ExtensionsKt.baseUrlCag(environment));
        asVar.charlie.add(new a(moshi));
        asVar.alpha = httpClient;
        Object bravo = asVar.bravo().bravo(ConsumerApi.class);
        Intrinsics.delta(bravo, "create(...)");
        return (ConsumerApi) bravo;
    }

    @NotNull
    public final OkHttpClient httpClient(@NotNull HttpLoggingInterceptor loggingInterceptor) {
        Intrinsics.echo(loggingInterceptor, "loggingInterceptor");
        OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(AbstractC0940f0.a()).addInterceptor(loggingInterceptor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return addInterceptor.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(50L, timeUnit).protocols(CollectionsKt.white(Protocol.HTTP_1_1)).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final HttpLoggingInterceptor loggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
        return httpLoggingInterceptor;
    }

    @NotNull
    public final Moshi moshi() {
        Moshi build = new Moshi.Builder().add((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).build();
        Intrinsics.delta(build, "build(...)");
        return build;
    }

    @NotNull
    public final TokeniseApi tokeniseApi(@NotNull OkHttpClient httpClient, @NotNull Moshi moshi, @NotNull Environment environment) {
        Intrinsics.echo(httpClient, "httpClient");
        Intrinsics.echo(moshi, "moshi");
        Intrinsics.echo(environment, "environment");
        as asVar = new as();
        asVar.alpha(ExtensionsKt.baseUrl(environment));
        asVar.charlie.add(new a(moshi));
        asVar.alpha = httpClient;
        Object bravo = asVar.bravo().bravo(TokeniseApi.class);
        Intrinsics.delta(bravo, "create(...)");
        return (TokeniseApi) bravo;
    }
}
