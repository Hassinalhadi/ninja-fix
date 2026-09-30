package com.checkout.components.card.operations.validator;

import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.data.SupportedTypesRepository;
import dagger.internal.b;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class CardTypeValidator_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4375a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4376b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4377c;

    public CardTypeValidator_Factory(d dVar, d dVar2, d dVar3) {
        this.f4375a = dVar;
        this.f4376b = dVar2;
        this.f4377c = dVar3;
    }

    public static CardTypeValidator_Factory create(d dVar, d dVar2, d dVar3) {
        return new CardTypeValidator_Factory(dVar, dVar2, dVar3);
    }

    public static CardTypeValidator newInstance(SupportedTypesRepository supportedTypesRepository, PaymentStateManager paymentStateManager, ResourceProvider resourceProvider) {
        return new CardTypeValidator(supportedTypesRepository, paymentStateManager, resourceProvider);
    }

    @Override // Kd.a
    public final CardTypeValidator get() {
        return new CardTypeValidator((SupportedTypesRepository) this.f4375a.get(), (PaymentStateManager) this.f4376b.get(), (ResourceProvider) this.f4377c.get());
    }
}
