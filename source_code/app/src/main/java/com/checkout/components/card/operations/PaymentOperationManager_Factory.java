package com.checkout.components.card.operations;

import Nd.c;
import com.checkout.components.card.operations.tokenisation.repository.TokenRepository;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetails;
import dagger.internal.b;
import dagger.internal.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class PaymentOperationManager_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4264a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4265b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4266c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4267d;
    private final d e;

    public PaymentOperationManager_Factory(d dVar, d dVar2, d dVar3, d dVar4, d dVar5) {
        this.f4264a = dVar;
        this.f4265b = dVar2;
        this.f4266c = dVar3;
        this.f4267d = dVar4;
        this.e = dVar5;
    }

    public static PaymentOperationManager_Factory create(d dVar, d dVar2, d dVar3, d dVar4, d dVar5) {
        return new PaymentOperationManager_Factory(dVar, dVar2, dVar3, dVar4, dVar5);
    }

    public static PaymentOperationManager newInstance(PaymentStateManager paymentStateManager, TokenRepository tokenRepository, LogDetails logDetails, Function1<? super CheckoutError, Unit> function1, Function1<? super c<? super Boolean>, ?> function12) {
        return new PaymentOperationManager(paymentStateManager, tokenRepository, logDetails, function1, function12);
    }

    @Override // Kd.a
    public final PaymentOperationManager get() {
        return new PaymentOperationManager((PaymentStateManager) this.f4264a.get(), (TokenRepository) this.f4265b.get(), (LogDetails) this.f4266c.get(), (Function1) this.f4267d.get(), (Function1) this.e.get());
    }
}
