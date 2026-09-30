package com.checkout.components.card.di.module;

import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.ui.data.DisplayCvvRepository;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;
import yf.L;

/* loaded from: classes3.dex */
public final class PaymentModule_PaymentStateManagerFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final PaymentModule f4147a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4148b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4149c;

    /* renamed from: d, reason: collision with root package name */
    private final d f4150d;
    private final d e;

    public PaymentModule_PaymentStateManagerFactory(PaymentModule paymentModule, d dVar, d dVar2, d dVar3, d dVar4) {
        this.f4147a = paymentModule;
        this.f4148b = dVar;
        this.f4149c = dVar2;
        this.f4150d = dVar3;
        this.e = dVar4;
    }

    public static PaymentModule_PaymentStateManagerFactory create(PaymentModule paymentModule, d dVar, d dVar2, d dVar3, d dVar4) {
        return new PaymentModule_PaymentStateManagerFactory(paymentModule, dVar, dVar2, dVar3, dVar4);
    }

    public static PaymentStateManager paymentStateManager(PaymentModule paymentModule, SupportedSchemesRepository supportedSchemesRepository, DisplayCvvRepository displayCvvRepository, L l10, CardConfiguration cardConfiguration) {
        PaymentStateManager paymentStateManager = paymentModule.paymentStateManager(supportedSchemesRepository, displayCvvRepository, l10, cardConfiguration);
        AbstractC2763s0.delta(paymentStateManager);
        return paymentStateManager;
    }

    @Override // Kd.a
    public final PaymentStateManager get() {
        PaymentStateManager paymentStateManager = this.f4147a.paymentStateManager((SupportedSchemesRepository) this.f4148b.get(), (DisplayCvvRepository) this.f4149c.get(), (L) this.f4150d.get(), (CardConfiguration) this.e.get());
        AbstractC2763s0.delta(paymentStateManager);
        return paymentStateManager;
    }
}
