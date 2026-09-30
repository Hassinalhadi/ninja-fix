package com.checkout.components.wallet;

import com.checkout.components.wallet.common.GooglePayMapper;
import com.checkout.components.wallet.data.repository.GooglePayRepositoryImpl;
import v9.InterfaceC3179a;

/* loaded from: classes3.dex */
public final class GooglePayMediator_MembersInjector implements InterfaceC3179a {

    /* renamed from: a, reason: collision with root package name */
    private final dagger.internal.d f6439a;

    /* renamed from: b, reason: collision with root package name */
    private final dagger.internal.d f6440b;

    public GooglePayMediator_MembersInjector(dagger.internal.d dVar, dagger.internal.d dVar2) {
        this.f6439a = dVar;
        this.f6440b = dVar2;
    }

    public static InterfaceC3179a create(dagger.internal.d dVar, dagger.internal.d dVar2) {
        return new GooglePayMediator_MembersInjector(dVar, dVar2);
    }

    public static void injectMapper(GooglePayMediator googlePayMediator, GooglePayMapper googlePayMapper) {
        googlePayMediator.mapper = googlePayMapper;
    }

    public static void injectRepository(GooglePayMediator googlePayMediator, GooglePayRepositoryImpl googlePayRepositoryImpl) {
        googlePayMediator.repository = googlePayRepositoryImpl;
    }

    public final void injectMembers(GooglePayMediator googlePayMediator) {
        googlePayMediator.repository = (GooglePayRepositoryImpl) this.f6439a.get();
        googlePayMediator.mapper = (GooglePayMapper) this.f6440b.get();
    }
}
