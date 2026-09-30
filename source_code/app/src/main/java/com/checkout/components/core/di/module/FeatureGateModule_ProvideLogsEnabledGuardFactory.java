package com.checkout.components.core.di.module;

import com.checkout.components.core.featuregate.FeatureGateImpl;
import com.checkout.components.core.featuregate.guard.LogsEnabledGuard;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class FeatureGateModule_ProvideLogsEnabledGuardFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final FeatureGateModule f4760a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4761b;

    public FeatureGateModule_ProvideLogsEnabledGuardFactory(FeatureGateModule featureGateModule, d dVar) {
        this.f4760a = featureGateModule;
        this.f4761b = dVar;
    }

    public static FeatureGateModule_ProvideLogsEnabledGuardFactory create(FeatureGateModule featureGateModule, d dVar) {
        return new FeatureGateModule_ProvideLogsEnabledGuardFactory(featureGateModule, dVar);
    }

    public static LogsEnabledGuard provideLogsEnabledGuard(FeatureGateModule featureGateModule, FeatureGateImpl gate) {
        featureGateModule.getClass();
        Intrinsics.echo(gate, "gate");
        LogsEnabledGuard fromFeatureGate = LogsEnabledGuard.INSTANCE.fromFeatureGate(gate);
        AbstractC2763s0.delta(fromFeatureGate);
        return fromFeatureGate;
    }

    @Override // Kd.a
    public final LogsEnabledGuard get() {
        return provideLogsEnabledGuard(this.f4760a, (FeatureGateImpl) this.f4761b.get());
    }
}
