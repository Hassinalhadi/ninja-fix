package com.checkout.components.core.di.module;

import com.checkout.components.core.featuregate.FeatureGateImpl;
import com.checkout.components.core.featuregate.SessionFlagWriter;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class FeatureGateModule_ProvideSessionFlagWriterFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final FeatureGateModule f4762a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4763b;

    public FeatureGateModule_ProvideSessionFlagWriterFactory(FeatureGateModule featureGateModule, d dVar) {
        this.f4762a = featureGateModule;
        this.f4763b = dVar;
    }

    public static FeatureGateModule_ProvideSessionFlagWriterFactory create(FeatureGateModule featureGateModule, d dVar) {
        return new FeatureGateModule_ProvideSessionFlagWriterFactory(featureGateModule, dVar);
    }

    public static SessionFlagWriter provideSessionFlagWriter(FeatureGateModule featureGateModule, FeatureGateImpl gate) {
        featureGateModule.getClass();
        Intrinsics.echo(gate, "gate");
        return gate;
    }

    @Override // Kd.a
    public final SessionFlagWriter get() {
        return provideSessionFlagWriter(this.f4762a, (FeatureGateImpl) this.f4763b.get());
    }
}
