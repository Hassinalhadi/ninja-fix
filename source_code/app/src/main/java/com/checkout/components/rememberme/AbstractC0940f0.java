package com.checkout.components.rememberme;

import com.checkout.components.interfaces.utils.Constants;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;

/* renamed from: com.checkout.components.rememberme.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0940f0 {
    public static final Interceptor a() {
        return new C4.a(2);
    }

    public static final Response a(Interceptor.Chain chain) {
        Intrinsics.echo(chain, "chain");
        return chain.proceed(chain.request().newBuilder().header("User-Agent", Constants.INSTANCE.getHEADER_USER_AGENT_VALUE()).build());
    }
}
