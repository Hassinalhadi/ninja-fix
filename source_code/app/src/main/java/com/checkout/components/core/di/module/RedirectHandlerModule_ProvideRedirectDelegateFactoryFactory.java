package com.checkout.components.core.di.module;

import com.checkout.components.redirecthandler.RedirectDelegate;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class RedirectHandlerModule_ProvideRedirectDelegateFactoryFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final RedirectHandlerModule f4774a;

    public RedirectHandlerModule_ProvideRedirectDelegateFactoryFactory(RedirectHandlerModule redirectHandlerModule) {
        this.f4774a = redirectHandlerModule;
    }

    public static RedirectHandlerModule_ProvideRedirectDelegateFactoryFactory create(RedirectHandlerModule redirectHandlerModule) {
        return new RedirectHandlerModule_ProvideRedirectDelegateFactoryFactory(redirectHandlerModule);
    }

    public static RedirectDelegate.Factory provideRedirectDelegateFactory(RedirectHandlerModule redirectHandlerModule) {
        redirectHandlerModule.getClass();
        RedirectDelegate.Factory instance = RedirectDelegate.Factory.INSTANCE.getINSTANCE();
        AbstractC2763s0.delta(instance);
        return instance;
    }

    @Override // Kd.a
    public final RedirectDelegate.Factory get() {
        return provideRedirectDelegateFactory(this.f4774a);
    }

    @Override // Kd.a
    public final Object get() {
        return provideRedirectDelegateFactory(this.f4774a);
    }
}
