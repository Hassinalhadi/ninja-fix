package com.checkout.components.insight.di;

import com.checkout.components.insight.data.remote.InsightApi;
import com.checkout.components.insight.data.repository.InsightRepositoryImpl;
import com.checkout.components.insight.domain.repository.InsightRepository;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvideInsightRepository$insight_standardReleaseFactory implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f5238a;

    /* renamed from: b, reason: collision with root package name */
    private final d f5239b;

    public NetworkModule_ProvideInsightRepository$insight_standardReleaseFactory(NetworkModule networkModule, d dVar) {
        this.f5238a = networkModule;
        this.f5239b = dVar;
    }

    public static NetworkModule_ProvideInsightRepository$insight_standardReleaseFactory create(NetworkModule networkModule, d dVar) {
        return new NetworkModule_ProvideInsightRepository$insight_standardReleaseFactory(networkModule, dVar);
    }

    public static InsightRepository provideInsightRepository$insight_standardRelease(NetworkModule networkModule, InsightApi api) {
        networkModule.getClass();
        Intrinsics.echo(api, "api");
        return new InsightRepositoryImpl(api);
    }

    @Override // Kd.a
    public final InsightRepository get() {
        return provideInsightRepository$insight_standardRelease(this.f5238a, (InsightApi) this.f5239b.get());
    }
}
