package com.checkout.components.insight.data.repository;

import com.checkout.components.insight.data.remote.InsightApi;
import dagger.internal.b;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class InsightRepositoryImpl_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f5225a;

    public InsightRepositoryImpl_Factory(d dVar) {
        this.f5225a = dVar;
    }

    public static InsightRepositoryImpl_Factory create(d dVar) {
        return new InsightRepositoryImpl_Factory(dVar);
    }

    public static InsightRepositoryImpl newInstance(InsightApi insightApi) {
        return new InsightRepositoryImpl(insightApi);
    }

    @Override // Kd.a
    public final InsightRepositoryImpl get() {
        return new InsightRepositoryImpl((InsightApi) this.f5225a.get());
    }
}
