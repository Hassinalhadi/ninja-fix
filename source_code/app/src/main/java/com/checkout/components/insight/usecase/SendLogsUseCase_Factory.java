package com.checkout.components.insight.usecase;

import com.checkout.components.insight.domain.repository.InsightRepository;
import dagger.internal.b;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class SendLogsUseCase_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f5257a;

    public SendLogsUseCase_Factory(d dVar) {
        this.f5257a = dVar;
    }

    public static SendLogsUseCase_Factory create(d dVar) {
        return new SendLogsUseCase_Factory(dVar);
    }

    public static SendLogsUseCase newInstance(InsightRepository insightRepository) {
        return new SendLogsUseCase(insightRepository);
    }

    @Override // Kd.a
    public final SendLogsUseCase get() {
        return new SendLogsUseCase((InsightRepository) this.f5257a.get());
    }
}
