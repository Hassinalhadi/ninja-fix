package com.checkout.components.core.di.module;

import com.checkout.components.core.data.remote.PaymentSessionApi;
import com.checkout.components.core.data.repository.PaymentRepositoryImpl;
import com.checkout.components.core.di.extension.OkHttpProviderExtensionKt;
import com.checkout.components.core.domain.repository.PaymentRepository;
import com.checkout.components.core.network.adapter.ApmRequestJsonAdapter;
import com.checkout.components.core.network.adapter.DeclineReasonAdapter;
import com.checkout.components.core.network.adapter.ErrorResponseAdapter;
import com.checkout.components.core.network.adapter.PaymentMethodNameAdapter;
import com.checkout.components.core.network.adapter.PaymentStatusAdapter;
import com.checkout.components.core.network.model.response.PayPaymentSessionResponse;
import com.checkout.components.core.network.model.response.PaymentAction;
import com.checkout.components.core.network.model.response.PaymentActionType;
import com.checkout.components.core.network.model.response.PaymentStatus;
import com.checkout.components.core.utils.extension.ExtensionsKt;
import com.checkout.components.interfaces.Environment;
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
import org.jetbrains.annotations.NotNull;
import vg.as;
import xg.a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\nJ\r\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\b\rJ%\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\fH\u0001¢\u0006\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/core/di/module/NetworkModule;", "", "<init>", "()V", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "providePaymentRepository", "Lcom/checkout/components/core/domain/repository/PaymentRepository;", "api", "Lcom/checkout/components/core/data/remote/PaymentSessionApi;", "providePaymentRepository$core_standardRelease", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideLoggingInterceptor$core_standardRelease", "providePaymentSessionApi", "moshi", "httpClient", "Lokhttp3/OkHttpClient;", "environment", "Lcom/checkout/components/interfaces/Environment;", "providePaymentSessionApi$core_standardRelease", "provideOkHttpClient", "loggingInterceptor", "provideOkHttpClient$core_standardRelease", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkModule {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final HttpLoggingInterceptor provideLoggingInterceptor$core_standardRelease() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
        return httpLoggingInterceptor;
    }

    @NotNull
    public final Moshi provideMoshi() {
        Moshi build = new Moshi.Builder().add((JsonAdapter.Factory) new ApmRequestJsonAdapter()).add(new DeclineReasonAdapter()).add(new PaymentStatusAdapter()).add(new PaymentMethodNameAdapter()).add(new ErrorResponseAdapter()).add((JsonAdapter.Factory) PolymorphicJsonAdapterFactory.of(PayPaymentSessionResponse.class, "status").withSubtype(PayPaymentSessionResponse.ActionRequired.class, PaymentStatus.ActionRequired.getValue()).withSubtype(PayPaymentSessionResponse.Approved.class, PaymentStatus.Approved.getValue()).withSubtype(PayPaymentSessionResponse.Declined.class, PaymentStatus.Declined.getValue())).add((JsonAdapter.Factory) PolymorphicJsonAdapterFactory.of(PaymentAction.class, Constants.KEY_TYPE).withSubtype(PaymentAction.Redirect.class, PaymentActionType.Redirect.getValue()).withSubtype(PaymentAction.ThreeDS.class, PaymentActionType.ThreeDS.getValue())).add((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).build();
        Intrinsics.delta(build, "build(...)");
        return build;
    }

    @NotNull
    public final OkHttpClient provideOkHttpClient$core_standardRelease(@NotNull HttpLoggingInterceptor loggingInterceptor) {
        Intrinsics.echo(loggingInterceptor, "loggingInterceptor");
        OkHttpClient.Builder addInterceptor = OkHttpProviderExtensionKt.addUserAgentInterceptor(new OkHttpClient.Builder()).addInterceptor(loggingInterceptor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return addInterceptor.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(50L, timeUnit).protocols(CollectionsKt.white(Protocol.HTTP_1_1)).build();
    }

    @NotNull
    public final PaymentRepository providePaymentRepository$core_standardRelease(@NotNull PaymentSessionApi api) {
        Intrinsics.echo(api, "api");
        return new PaymentRepositoryImpl(api);
    }

    @NotNull
    public final PaymentSessionApi providePaymentSessionApi$core_standardRelease(@NotNull Moshi moshi, @NotNull OkHttpClient httpClient, @NotNull Environment environment) {
        Intrinsics.echo(moshi, "moshi");
        Intrinsics.echo(httpClient, "httpClient");
        Intrinsics.echo(environment, "environment");
        as asVar = new as();
        asVar.alpha(ExtensionsKt.baseUrl(environment));
        asVar.charlie.add(new a(moshi));
        asVar.alpha = httpClient;
        Object bravo = asVar.bravo().bravo(PaymentSessionApi.class);
        Intrinsics.delta(bravo, "create(...)");
        return (PaymentSessionApi) bravo;
    }
}
