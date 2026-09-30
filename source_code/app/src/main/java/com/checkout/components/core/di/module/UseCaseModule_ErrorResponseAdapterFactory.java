package com.checkout.components.core.di.module;

import com.checkout.components.core.network.model.response.ErrorResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class UseCaseModule_ErrorResponseAdapterFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final UseCaseModule f4780a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4781b;

    public UseCaseModule_ErrorResponseAdapterFactory(UseCaseModule useCaseModule, d dVar) {
        this.f4780a = useCaseModule;
        this.f4781b = dVar;
    }

    public static UseCaseModule_ErrorResponseAdapterFactory create(UseCaseModule useCaseModule, d dVar) {
        return new UseCaseModule_ErrorResponseAdapterFactory(useCaseModule, dVar);
    }

    public static JsonAdapter<ErrorResponse> errorResponseAdapter(UseCaseModule useCaseModule, Moshi moshi) {
        JsonAdapter<ErrorResponse> errorResponseAdapter = useCaseModule.errorResponseAdapter(moshi);
        AbstractC2763s0.delta(errorResponseAdapter);
        return errorResponseAdapter;
    }

    @Override // Kd.a
    public final JsonAdapter<ErrorResponse> get() {
        JsonAdapter<ErrorResponse> errorResponseAdapter = this.f4780a.errorResponseAdapter((Moshi) this.f4781b.get());
        AbstractC2763s0.delta(errorResponseAdapter);
        return errorResponseAdapter;
    }
}
