package com.checkout.components.core.di.module;

import com.checkout.components.core.featuregate.FeatureGateImpl;
import com.checkout.components.core.featuregate.guard.JaywanSchemeEnabledGuard;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class FeatureGateModule_ProvideJaywanSchemeEnabledGuardFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final FeatureGateModule f4758a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4759b;

    public FeatureGateModule_ProvideJaywanSchemeEnabledGuardFactory(FeatureGateModule featureGateModule, d dVar) {
        this.f4758a = featureGateModule;
        this.f4759b = dVar;
    }

    public static FeatureGateModule_ProvideJaywanSchemeEnabledGuardFactory create(FeatureGateModule featureGateModule, d dVar) {
        return new FeatureGateModule_ProvideJaywanSchemeEnabledGuardFactory(featureGateModule, dVar);
    }

    public static JaywanSchemeEnabledGuard provideJaywanSchemeEnabledGuard(FeatureGateModule featureGateModule, FeatureGateImpl gate) {
        featureGateModule.getClass();
        Intrinsics.echo(gate, "gate");
        JaywanSchemeEnabledGuard fromFeatureGate = JaywanSchemeEnabledGuard.INSTANCE.fromFeatureGate(gate);
        AbstractC2763s0.delta(fromFeatureGate);
        return fromFeatureGate;
    }

    @Override // Kd.a
    public final JaywanSchemeEnabledGuard get() {
        return provideJaywanSchemeEnabledGuard(this.f4758a, (FeatureGateImpl) this.f4759b.get());
    }
}
