package com.checkout.components.wallet.di;

import com.checkout.components.wallet.data.repository.GooglePayRepositoryImpl;
import dagger.internal.b;

/* loaded from: classes3.dex */
public final class GooglePayModule_ProvideGooglePayRepositoryImplFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final GooglePayModule f6505a;

    public GooglePayModule_ProvideGooglePayRepositoryImplFactory(GooglePayModule googlePayModule) {
        this.f6505a = googlePayModule;
    }

    public static GooglePayModule_ProvideGooglePayRepositoryImplFactory create(GooglePayModule googlePayModule) {
        return new GooglePayModule_ProvideGooglePayRepositoryImplFactory(googlePayModule);
    }

    public static GooglePayRepositoryImpl provideGooglePayRepositoryImpl(GooglePayModule googlePayModule) {
        googlePayModule.getClass();
        return new GooglePayRepositoryImpl();
    }

    @Override // Kd.a
    public final GooglePayRepositoryImpl get() {
        return provideGooglePayRepositoryImpl(this.f6505a);
    }

    @Override // Kd.a
    public final Object get() {
        return provideGooglePayRepositoryImpl(this.f6505a);
    }
}
