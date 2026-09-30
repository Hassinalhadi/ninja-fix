package com.checkout.components.card;

import com.checkout.components.card.ui.component.savecard.SaveCardContainerViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import kotlin.Unit;
import yf.InterfaceC3440j;
import yf.at;

/* loaded from: classes3.dex */
public final class Y implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SaveCardContainerViewModel f3982a;

    public Y(SaveCardContainerViewModel saveCardContainerViewModel) {
        this.f3982a = saveCardContainerViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        PaymentStateManager paymentStateManager;
        yf.N n5;
        Object value;
        PaymentStateManager paymentStateManager2;
        yf.N n10;
        Object value2;
        ((Boolean) obj).getClass();
        if (!this.f3982a.getRememberMe().isSaveCardChecked()) {
            paymentStateManager = this.f3982a.f4544b;
            at rememberMeJWTToken = paymentStateManager.getRememberMeJWTToken();
            do {
                n5 = (yf.N) rememberMeJWTToken;
                value = n5.getValue();
            } while (!n5.hotel(value, "save_card_unchecked"));
        } else {
            String customerJWTTokenOrShowError = this.f3982a.getRememberMe().getCustomerJWTTokenOrShowError();
            paymentStateManager2 = this.f3982a.f4544b;
            at rememberMeJWTToken2 = paymentStateManager2.getRememberMeJWTToken();
            do {
                n10 = (yf.N) rememberMeJWTToken2;
                value2 = n10.getValue();
            } while (!n10.hotel(value2, customerJWTTokenOrShowError));
        }
        return Unit.INSTANCE;
    }
}
