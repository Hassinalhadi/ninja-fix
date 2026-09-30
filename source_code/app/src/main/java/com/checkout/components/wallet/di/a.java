package com.checkout.components.wallet.di;

import com.checkout.components.wallet.GooglePayMediator;
import com.checkout.components.wallet.common.GooglePayMapper;
import com.checkout.components.wallet.data.repository.GooglePayRepositoryImpl;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class a implements GooglePayComponent {

    /* renamed from: a, reason: collision with root package name */
    public final d f6507a;

    /* renamed from: b, reason: collision with root package name */
    public final d f6508b;

    public a(GooglePayModule googlePayModule) {
        this.f6507a = dagger.internal.a.bravo(new GooglePayModule_ProvideGooglePayRepositoryImplFactory(googlePayModule));
        this.f6508b = dagger.internal.a.bravo(new GooglePayModule_ProvideGooglePayMapperFactory(googlePayModule, dagger.internal.a.bravo(new GooglePayModule_ProvideMoshiFactory(googlePayModule))));
    }

    @Override // com.checkout.components.wallet.di.GooglePayComponent
    public final GooglePayMapper getGooglePayMapper() {
        return (GooglePayMapper) this.f6508b.get();
    }

    @Override // com.checkout.components.wallet.di.GooglePayComponent
    public final GooglePayRepositoryImpl getGooglePayRepositoryImpl() {
        return (GooglePayRepositoryImpl) this.f6507a.get();
    }

    @Override // com.checkout.components.wallet.di.GooglePayComponent
    public final void inject(GooglePayMediator googlePayMediator) {
        googlePayMediator.repository = (GooglePayRepositoryImpl) this.f6507a.get();
        googlePayMediator.mapper = (GooglePayMapper) this.f6508b.get();
    }
}
