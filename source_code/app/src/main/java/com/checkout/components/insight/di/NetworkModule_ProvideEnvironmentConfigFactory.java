package com.checkout.components.insight.di;

import com.checkout.components.insight.config.EnvironmentConfig;
import com.checkout.components.interfaces.Environment;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NetworkModule_ProvideEnvironmentConfigFactory implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkModule f5232a;

    /* renamed from: b, reason: collision with root package name */
    private final d f5233b;

    public NetworkModule_ProvideEnvironmentConfigFactory(NetworkModule networkModule, d dVar) {
        this.f5232a = networkModule;
        this.f5233b = dVar;
    }

    public static NetworkModule_ProvideEnvironmentConfigFactory create(NetworkModule networkModule, d dVar) {
        return new NetworkModule_ProvideEnvironmentConfigFactory(networkModule, dVar);
    }

    public static EnvironmentConfig provideEnvironmentConfig(NetworkModule networkModule, Environment environment) {
        networkModule.getClass();
        Intrinsics.echo(environment, "environment");
        return new EnvironmentConfig(environment);
    }

    @Override // Kd.a
    public final EnvironmentConfig get() {
        return provideEnvironmentConfig(this.f5232a, (Environment) this.f5233b.get());
    }
}
