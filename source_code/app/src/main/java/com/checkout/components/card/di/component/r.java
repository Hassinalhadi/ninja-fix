package com.checkout.components.card.di.component;

import com.checkout.components.card.operations.PaymentOperationManager;
import com.checkout.components.card.operations.tokenisation.repository.TokenRepository;
import com.checkout.components.card.ui.manager.PaymentStateManager;

/* loaded from: classes3.dex */
public final class r implements PaymentOperationManagerSubComponent {

    /* renamed from: a, reason: collision with root package name */
    public final j f4104a;

    public r(j jVar) {
        this.f4104a = jVar;
    }

    @Override // com.checkout.components.card.di.component.PaymentOperationManagerSubComponent
    public final PaymentOperationManager getPaymentOperationManager() {
        PaymentStateManager paymentStateManager = (PaymentStateManager) this.f4104a.f4045F.get();
        TokenRepository tokenRepository = (TokenRepository) this.f4104a.f4077g0.get();
        j jVar = this.f4104a;
        return new PaymentOperationManager(paymentStateManager, tokenRepository, jVar.f4078h, jVar.f4076g, jVar.f4074f);
    }
}
