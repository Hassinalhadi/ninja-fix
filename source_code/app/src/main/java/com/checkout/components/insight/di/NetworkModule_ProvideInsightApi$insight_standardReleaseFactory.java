package com.checkout.components.insight.di;

import com.checkout.components.insight.config.EnvironmentConfig;
import com.checkout.components.insight.data.remote.InsightApi;
import com.squareup.moshi.Moshi;
import dagger.internal.d;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvideInsightApi$insight_standardReleaseFactory implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f5234a;

    /* renamed from: b, reason: collision with root package name */
    private final d f5235b;

    /* renamed from: c, reason: collision with root package name */
    private final d f5236c;

    /* renamed from: d, reason: collision with root package name */
    private final d f5237d;

    public NetworkModule_ProvideInsightApi$insight_standardReleaseFactory(NetworkModule networkModule, d dVar, d dVar2, d dVar3) {
        this.f5234a = networkModule;
        this.f5235b = dVar;
        this.f5236c = dVar2;
        this.f5237d = dVar3;
    }

    public static NetworkModule_ProvideInsightApi$insight_standardReleaseFactory create(NetworkModule networkModule, d dVar, d dVar2, d dVar3) {
        return new NetworkModule_ProvideInsightApi$insight_standardReleaseFactory(networkModule, dVar, dVar2, dVar3);
    }

    public static InsightApi provideInsightApi$insight_standardRelease(NetworkModule networkModule, Moshi moshi, OkHttpClient okHttpClient, EnvironmentConfig environmentConfig) {
        InsightApi provideInsightApi$insight_standardRelease = networkModule.provideInsightApi$insight_standardRelease(moshi, okHttpClient, environmentConfig);
        AbstractC2763s0.delta(provideInsightApi$insight_standardRelease);
        return provideInsightApi$insight_standardRelease;
    }

    @Override // Kd.a
    public final InsightApi get() {
        InsightApi provideInsightApi$insight_standardRelease = this.f5234a.provideInsightApi$insight_standardRelease((Moshi) this.f5235b.get(), (OkHttpClient) this.f5236c.get(), (EnvironmentConfig) this.f5237d.get());
        AbstractC2763s0.delta(provideInsightApi$insight_standardRelease);
        return provideInsightApi$insight_standardRelease;
    }
}
