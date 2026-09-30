package com.checkout.components.core.di.module;

import com.checkout.components.core.featuregate.FeatureGateImpl;
import com.checkout.components.core.featuregate.guard.ForwardingEmailsDisabledGuard;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class FeatureGateModule_ProvideForwardingEmailsDisabledGuardFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final FeatureGateModule f4756a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4757b;

    public FeatureGateModule_ProvideForwardingEmailsDisabledGuardFactory(FeatureGateModule featureGateModule, d dVar) {
        this.f4756a = featureGateModule;
        this.f4757b = dVar;
    }

    public static FeatureGateModule_ProvideForwardingEmailsDisabledGuardFactory create(FeatureGateModule featureGateModule, d dVar) {
        return new FeatureGateModule_ProvideForwardingEmailsDisabledGuardFactory(featureGateModule, dVar);
    }

    public static ForwardingEmailsDisabledGuard provideForwardingEmailsDisabledGuard(FeatureGateModule featureGateModule, FeatureGateImpl gate) {
        featureGateModule.getClass();
        Intrinsics.echo(gate, "gate");
        ForwardingEmailsDisabledGuard fromFeatureGate = ForwardingEmailsDisabledGuard.INSTANCE.fromFeatureGate(gate);
        AbstractC2763s0.delta(fromFeatureGate);
        return fromFeatureGate;
    }

    @Override // Kd.a
    public final ForwardingEmailsDisabledGuard get() {
        return provideForwardingEmailsDisabledGuard(this.f4756a, (FeatureGateImpl) this.f4757b.get());
    }
}
