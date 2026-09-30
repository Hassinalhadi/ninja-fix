package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.UseCaseModule;
import com.checkout.components.rememberme.model.SubmitSavedCardUseCaseRequest;
import com.checkout.components.rememberme.usecase.SubmitSavedCardUseCase;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class D1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final UseCaseModule f5742a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5743b;

    public D1(UseCaseModule useCaseModule, dagger.internal.d dVar) {
        this.f5742a = useCaseModule;
        this.f5743b = dVar;
    }

    @Override // Kd.a
    public final Object get() {
        UseCaseModule useCaseModule = this.f5742a;
        SubmitSavedCardUseCaseRequest request = (SubmitSavedCardUseCaseRequest) this.f5743b.get();
        useCaseModule.getClass();
        Intrinsics.echo(request, "request");
        return new SubmitSavedCardUseCase(request);
    }
}
