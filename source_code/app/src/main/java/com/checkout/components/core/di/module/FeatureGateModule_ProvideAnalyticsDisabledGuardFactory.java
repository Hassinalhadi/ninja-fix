package com.checkout.components.core.di.module;

import com.checkout.components.core.featuregate.FeatureGateImpl;
import com.checkout.components.core.featuregate.guard.AnalyticsDisabledGuard;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class FeatureGateModule_ProvideAnalyticsDisabledGuardFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final FeatureGateModule f4752a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4753b;

    public FeatureGateModule_ProvideAnalyticsDisabledGuardFactory(FeatureGateModule featureGateModule, d dVar) {
        this.f4752a = featureGateModule;
        this.f4753b = dVar;
    }

    public static FeatureGateModule_ProvideAnalyticsDisabledGuardFactory create(FeatureGateModule featureGateModule, d dVar) {
        return new FeatureGateModule_ProvideAnalyticsDisabledGuardFactory(featureGateModule, dVar);
    }

    public static AnalyticsDisabledGuard provideAnalyticsDisabledGuard(FeatureGateModule featureGateModule, FeatureGateImpl gate) {
        featureGateModule.getClass();
        Intrinsics.echo(gate, "gate");
        AnalyticsDisabledGuard fromFeatureGate = AnalyticsDisabledGuard.INSTANCE.fromFeatureGate(gate);
        AbstractC2763s0.delta(fromFeatureGate);
        return fromFeatureGate;
    }

    @Override // Kd.a
    public final AnalyticsDisabledGuard get() {
        return provideAnalyticsDisabledGuard(this.f4752a, (FeatureGateImpl) this.f4753b.get());
    }
}
