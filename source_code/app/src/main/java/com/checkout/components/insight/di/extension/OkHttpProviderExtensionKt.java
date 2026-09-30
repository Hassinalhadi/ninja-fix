package com.checkout.components.insight.di.extension;

import C4.a;
import com.checkout.components.interfaces.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "addUserAgentInterceptor", "(Lokhttp3/OkHttpClient$Builder;)Lokhttp3/OkHttpClient$Builder;", "insight_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OkHttpProviderExtensionKt {
    private static final Interceptor a() {
        return new a(1);
    }

    public static final OkHttpClient.Builder addUserAgentInterceptor(OkHttpClient.Builder builder) {
        Intrinsics.echo(builder, "<this>");
        return builder.addInterceptor(a());
    }

    public static final Response a(Interceptor.Chain chain) {
        Intrinsics.echo(chain, "chain");
        return chain.proceed(chain.request().newBuilder().header("User-Agent", Constants.INSTANCE.getHEADER_USER_AGENT_VALUE()).build());
    }
}
