package com.checkout.components.core.di.module;

import com.checkout.components.interfaces.Environment;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class EnvironmentModule_ProvideEnvironmentFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final EnvironmentModule f4751a;

    public EnvironmentModule_ProvideEnvironmentFactory(EnvironmentModule environmentModule) {
        this.f4751a = environmentModule;
    }

    public static EnvironmentModule_ProvideEnvironmentFactory create(EnvironmentModule environmentModule) {
        return new EnvironmentModule_ProvideEnvironmentFactory(environmentModule);
    }

    public static Environment provideEnvironment(EnvironmentModule environmentModule) {
        Environment provideEnvironment = environmentModule.provideEnvironment();
        AbstractC2763s0.delta(provideEnvironment);
        return provideEnvironment;
    }

    @Override // Kd.a
    public final Environment get() {
        Environment provideEnvironment = this.f4751a.provideEnvironment();
        AbstractC2763s0.delta(provideEnvironment);
        return provideEnvironment;
    }

    @Override // Kd.a
    public final Object get() {
        Environment provideEnvironment = this.f4751a.provideEnvironment();
        AbstractC2763s0.delta(provideEnvironment);
        return provideEnvironment;
    }
}
