package com.checkout.components.card.ui.component.savecard;

import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.rememberme.CheckoutRememberMe;
import dagger.internal.b;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class SaveCardContainerViewModel_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f4556a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4557b;

    public SaveCardContainerViewModel_Factory(d dVar, d dVar2) {
        this.f4556a = dVar;
        this.f4557b = dVar2;
    }

    public static SaveCardContainerViewModel_Factory create(d dVar, d dVar2) {
        return new SaveCardContainerViewModel_Factory(dVar, dVar2);
    }

    public static SaveCardContainerViewModel newInstance(CheckoutRememberMe checkoutRememberMe, PaymentStateManager paymentStateManager) {
        return new SaveCardContainerViewModel(checkoutRememberMe, paymentStateManager);
    }

    @Override // Kd.a
    public final SaveCardContainerViewModel get() {
        return new SaveCardContainerViewModel((CheckoutRememberMe) this.f4556a.get(), (PaymentStateManager) this.f4557b.get());
    }
}
