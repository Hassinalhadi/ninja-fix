package com.checkout.components.card.di.component;

import com.checkout.components.card.di.component.PaymentOperationManagerSubComponent;

/* loaded from: classes3.dex */
public final class q implements PaymentOperationManagerSubComponent.Builder {

    /* renamed from: a, reason: collision with root package name */
    public final j f4103a;

    public q(j jVar) {
        this.f4103a = jVar;
    }

    @Override // com.checkout.components.card.di.component.PaymentOperationManagerSubComponent.Builder
    public final PaymentOperationManagerSubComponent build() {
        return new r(this.f4103a);
    }
}
