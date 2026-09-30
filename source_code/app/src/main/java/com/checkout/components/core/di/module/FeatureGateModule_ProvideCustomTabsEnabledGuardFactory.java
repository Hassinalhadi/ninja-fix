package com.checkout.components.core.di.module;

import com.checkout.components.core.featuregate.FeatureGateImpl;
import com.checkout.components.core.featuregate.guard.CustomTabsEnabledGuard;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class FeatureGateModule_ProvideCustomTabsEnabledGuardFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final FeatureGateModule f4754a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4755b;

    public FeatureGateModule_ProvideCustomTabsEnabledGuardFactory(FeatureGateModule featureGateModule, d dVar) {
        this.f4754a = featureGateModule;
        this.f4755b = dVar;
    }

    public static FeatureGateModule_ProvideCustomTabsEnabledGuardFactory create(FeatureGateModule featureGateModule, d dVar) {
        return new FeatureGateModule_ProvideCustomTabsEnabledGuardFactory(featureGateModule, dVar);
    }

    public static CustomTabsEnabledGuard provideCustomTabsEnabledGuard(FeatureGateModule featureGateModule, FeatureGateImpl gate) {
        featureGateModule.getClass();
        Intrinsics.echo(gate, "gate");
        CustomTabsEnabledGuard fromFeatureGate = CustomTabsEnabledGuard.INSTANCE.fromFeatureGate(gate);
        AbstractC2763s0.delta(fromFeatureGate);
        return fromFeatureGate;
    }

    @Override // Kd.a
    public final CustomTabsEnabledGuard get() {
        return provideCustomTabsEnabledGuard(this.f4754a, (FeatureGateImpl) this.f4755b.get());
    }
}
