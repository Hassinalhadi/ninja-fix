package com.checkout.components.card.operations;

import Kd.a;
import com.checkout.components.card.operations.PaymentOperationManager;
import dagger.internal.d;
import v9.InterfaceC3179a;

/* loaded from: classes3.dex */
public final class PaymentOperationManager_PaymentOperationManagerFactory_MembersInjector implements InterfaceC3179a {

    /* renamed from: a, reason: collision with root package name */
    private final d f4270a;

    public PaymentOperationManager_PaymentOperationManagerFactory_MembersInjector(d dVar) {
        this.f4270a = dVar;
    }

    public static InterfaceC3179a create(d dVar) {
        return new PaymentOperationManager_PaymentOperationManagerFactory_MembersInjector(dVar);
    }

    public static void injectSubComponentProvider(PaymentOperationManager.PaymentOperationManagerFactory paymentOperationManagerFactory, a aVar) {
        paymentOperationManagerFactory.subComponentProvider = aVar;
    }

    public final void injectMembers(Object obj) {
        ((PaymentOperationManager.PaymentOperationManagerFactory) obj).subComponentProvider = this.f4270a;
    }

    public final void injectMembers(PaymentOperationManager.PaymentOperationManagerFactory paymentOperationManagerFactory) {
        paymentOperationManagerFactory.subComponentProvider = this.f4270a;
    }
}
