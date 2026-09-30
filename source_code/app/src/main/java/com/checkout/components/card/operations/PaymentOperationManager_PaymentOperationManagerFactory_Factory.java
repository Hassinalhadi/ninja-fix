package com.checkout.components.card.operations;

import com.checkout.components.card.di.injector.CardInjector;
import com.checkout.components.card.operations.PaymentOperationManager;
import dagger.internal.b;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class PaymentOperationManager_PaymentOperationManagerFactory_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4268a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4269b;

    public PaymentOperationManager_PaymentOperationManagerFactory_Factory(d dVar, d dVar2) {
        this.f4268a = dVar;
        this.f4269b = dVar2;
    }

    public static PaymentOperationManager_PaymentOperationManagerFactory_Factory create(d dVar, d dVar2) {
        return new PaymentOperationManager_PaymentOperationManagerFactory_Factory(dVar, dVar2);
    }

    public static PaymentOperationManager.PaymentOperationManagerFactory newInstance(CardInjector cardInjector) {
        return new PaymentOperationManager.PaymentOperationManagerFactory(cardInjector);
    }

    @Override // Kd.a
    public final PaymentOperationManager.PaymentOperationManagerFactory get() {
        PaymentOperationManager.PaymentOperationManagerFactory paymentOperationManagerFactory = new PaymentOperationManager.PaymentOperationManagerFactory((CardInjector) this.f4268a.get());
        paymentOperationManagerFactory.subComponentProvider = this.f4269b;
        return paymentOperationManagerFactory;
    }
}
