package com.checkout.risk;

import com.google.gson.l;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import vg.as;
import vg.at;
import wg.a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "baseUrl", "Lvg/at;", "getRetrofitClient", "(Ljava/lang/String;)Lvg/at;", "", "TIMEOUT_DURATION_SECONDS", "J", "Risk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApiClientKt {
    public static final long TIMEOUT_DURATION_SECONDS = 5;

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final at getRetrofitClient(@NotNull String baseUrl) {
        Intrinsics.echo(baseUrl, "baseUrl");
        OkHttpClient build = new OkHttpClient.Builder().addInterceptor(new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0).setLevel(HttpLoggingInterceptor.Level.BODY)).connectTimeout(5L, TimeUnit.SECONDS).build();
        as asVar = new as();
        asVar.alpha(baseUrl.concat("/"));
        asVar.charlie.add(a.charlie(new l()));
        asVar.charlie(build);
        return asVar.bravo();
    }
}
