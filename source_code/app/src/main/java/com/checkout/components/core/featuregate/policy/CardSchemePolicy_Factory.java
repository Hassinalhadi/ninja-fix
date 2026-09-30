package com.checkout.components.core.featuregate.policy;

import com.checkout.components.core.featuregate.guard.JaywanSchemeEnabledGuard;
import dagger.internal.b;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class CardSchemePolicy_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4804a;

    public CardSchemePolicy_Factory(d dVar) {
        this.f4804a = dVar;
    }

    public static CardSchemePolicy_Factory create(d dVar) {
        return new CardSchemePolicy_Factory(dVar);
    }

    public static CardSchemePolicy newInstance(JaywanSchemeEnabledGuard jaywanSchemeEnabledGuard) {
        return new CardSchemePolicy(jaywanSchemeEnabledGuard);
    }

    @Override // Kd.a
    public final CardSchemePolicy get() {
        return new CardSchemePolicy((JaywanSchemeEnabledGuard) this.f4804a.get());
    }
}
