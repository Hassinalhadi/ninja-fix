package com.checkout.components.wallet.di;

import com.checkout.components.wallet.common.GooglePayMapper;
import com.squareup.moshi.Moshi;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class GooglePayModule_ProvideGooglePayMapperFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final GooglePayModule f6503a;

    /* renamed from: b, reason: collision with root package name */
    private final d f6504b;

    public GooglePayModule_ProvideGooglePayMapperFactory(GooglePayModule googlePayModule, d dVar) {
        this.f6503a = googlePayModule;
        this.f6504b = dVar;
    }

    public static GooglePayModule_ProvideGooglePayMapperFactory create(GooglePayModule googlePayModule, d dVar) {
        return new GooglePayModule_ProvideGooglePayMapperFactory(googlePayModule, dVar);
    }

    public static GooglePayMapper provideGooglePayMapper(GooglePayModule googlePayModule, Moshi moshi) {
        googlePayModule.getClass();
        Intrinsics.echo(moshi, "moshi");
        return new GooglePayMapper(moshi);
    }

    @Override // Kd.a
    public final GooglePayMapper get() {
        return provideGooglePayMapper(this.f6503a, (Moshi) this.f6504b.get());
    }
}
