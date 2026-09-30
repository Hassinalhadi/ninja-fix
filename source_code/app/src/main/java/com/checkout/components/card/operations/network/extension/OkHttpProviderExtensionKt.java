package com.checkout.components.card.operations.network.extension;

import com.checkout.components.card.operations.network.extension.OkHttpProviderExtensionKt;
import com.checkout.components.interfaces.utils.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ConnectionSpec;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "addLocalInterceptors", "(Lokhttp3/OkHttpClient$Builder;)Lokhttp3/OkHttpClient$Builder;", "", "publicKey", "addRequestInterceptors", "(Lokhttp3/OkHttpClient$Builder;Ljava/lang/String;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/ConnectionSpec;", "buildConnectionSpecs", "()Ljava/util/List;", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OkHttpProviderExtensionKt {
    private static final Interceptor a(final String str) {
        return new Interceptor() { // from class: o4.a
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response a6;
                a6 = OkHttpProviderExtensionKt.a(str, chain);
                return a6;
            }
        };
    }

    @NotNull
    public static final OkHttpClient.Builder addLocalInterceptors(@NotNull OkHttpClient.Builder builder) {
        Intrinsics.echo(builder, "<this>");
        return builder;
    }

    @NotNull
    public static final OkHttpClient.Builder addRequestInterceptors(@NotNull OkHttpClient.Builder builder, @NotNull String publicKey) {
        Intrinsics.echo(builder, "<this>");
        Intrinsics.echo(publicKey, "publicKey");
        return builder.addInterceptor(a(publicKey));
    }

    @NotNull
    public static final List<ConnectionSpec> buildConnectionSpecs() {
        return CollectionsKt.listOf(ConnectionSpec.RESTRICTED_TLS, ConnectionSpec.CLEARTEXT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response a(String str, Interceptor.Chain chain) {
        Intrinsics.echo(chain, "chain");
        Request.Builder newBuilder = chain.request().newBuilder();
        newBuilder.addHeader("Authorization", "Bearer " + str);
        newBuilder.addHeader("User-Agent", Constants.INSTANCE.getHEADER_USER_AGENT_VALUE());
        return chain.proceed(newBuilder.build());
    }
}
