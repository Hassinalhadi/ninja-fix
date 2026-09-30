package com.checkout.components.core.risk;

import com.checkout.components.interfaces.insight.Logger;
import dagger.internal.b;
import dagger.internal.d;
import vf.ab;

/* loaded from: classes3.dex */
public final class RiskManager_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f5003a;

    /* renamed from: b, reason: collision with root package name */
    private final d f5004b;

    /* renamed from: c, reason: collision with root package name */
    private final d f5005c;

    public RiskManager_Factory(d dVar, d dVar2, d dVar3) {
        this.f5003a = dVar;
        this.f5004b = dVar2;
        this.f5005c = dVar3;
    }

    public static RiskManager_Factory create(d dVar, d dVar2, d dVar3) {
        return new RiskManager_Factory(dVar, dVar2, dVar3);
    }

    public static RiskManager newInstance(Logger logger, RiskFactory riskFactory, ab abVar) {
        return new RiskManager(logger, riskFactory, abVar);
    }

    @Override // Kd.a
    public final RiskManager get() {
        return new RiskManager((Logger) this.f5003a.get(), (RiskFactory) this.f5004b.get(), (ab) this.f5005c.get());
    }
}
