package com.checkout.components.core.di.module;

import com.checkout.components.rememberme.CheckoutRememberMeFactory;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class RememberMeModule_CheckoutRememberMeFactoryFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final RememberMeModule f4778a;

    public RememberMeModule_CheckoutRememberMeFactoryFactory(RememberMeModule rememberMeModule) {
        this.f4778a = rememberMeModule;
    }

    public static CheckoutRememberMeFactory checkoutRememberMeFactory(RememberMeModule rememberMeModule) {
        CheckoutRememberMeFactory checkoutRememberMeFactory = rememberMeModule.checkoutRememberMeFactory();
        AbstractC2763s0.delta(checkoutRememberMeFactory);
        return checkoutRememberMeFactory;
    }

    public static RememberMeModule_CheckoutRememberMeFactoryFactory create(RememberMeModule rememberMeModule) {
        return new RememberMeModule_CheckoutRememberMeFactoryFactory(rememberMeModule);
    }

    @Override // Kd.a
    public final CheckoutRememberMeFactory get() {
        CheckoutRememberMeFactory checkoutRememberMeFactory = this.f4778a.checkoutRememberMeFactory();
        AbstractC2763s0.delta(checkoutRememberMeFactory);
        return checkoutRememberMeFactory;
    }

    @Override // Kd.a
    public final Object get() {
        CheckoutRememberMeFactory checkoutRememberMeFactory = this.f4778a.checkoutRememberMeFactory();
        AbstractC2763s0.delta(checkoutRememberMeFactory);
        return checkoutRememberMeFactory;
    }
}
