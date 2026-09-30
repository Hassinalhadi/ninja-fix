package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.UseCaseModule;
import com.checkout.components.rememberme.utils.TokenDetailsResponseToTokenDetails;

/* loaded from: classes3.dex */
public final class C1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final UseCaseModule f5733a;

    public C1(UseCaseModule useCaseModule) {
        this.f5733a = useCaseModule;
    }

    @Override // Kd.a
    public final Object get() {
        this.f5733a.getClass();
        return new TokenDetailsResponseToTokenDetails();
    }
}
