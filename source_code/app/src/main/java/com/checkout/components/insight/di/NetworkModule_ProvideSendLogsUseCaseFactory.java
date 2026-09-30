package com.checkout.components.insight.di;

import com.checkout.components.insight.domain.repository.InsightRepository;
import com.checkout.components.insight.usecase.SendLogsUseCase;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvideSendLogsUseCaseFactory implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f5244a;

    /* renamed from: b, reason: collision with root package name */
    private final d f5245b;

    public NetworkModule_ProvideSendLogsUseCaseFactory(NetworkModule networkModule, d dVar) {
        this.f5244a = networkModule;
        this.f5245b = dVar;
    }

    public static NetworkModule_ProvideSendLogsUseCaseFactory create(NetworkModule networkModule, d dVar) {
        return new NetworkModule_ProvideSendLogsUseCaseFactory(networkModule, dVar);
    }

    public static SendLogsUseCase provideSendLogsUseCase(NetworkModule networkModule, InsightRepository insightRepository) {
        networkModule.getClass();
        Intrinsics.echo(insightRepository, "insightRepository");
        return new SendLogsUseCase(insightRepository);
    }

    @Override // Kd.a
    public final SendLogsUseCase get() {
        return provideSendLogsUseCase(this.f5244a, (InsightRepository) this.f5245b.get());
    }
}
