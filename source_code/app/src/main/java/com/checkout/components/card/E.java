package com.checkout.components.card;

import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import com.checkout.components.ui.model.CardScheme;
import kotlin.Unit;
import yf.InterfaceC3440j;
import yf.at;

/* loaded from: classes3.dex */
public final class E implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardNumberViewModel f3942a;

    public E(CardNumberViewModel cardNumberViewModel) {
        this.f3942a = cardNumberViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        yf.N n5;
        Object value;
        CardScheme cardScheme = (CardScheme) obj;
        if (cardScheme != CardScheme.UNKNOWN) {
            at cardScheme2 = this.f3942a.getPaymentStateManager().getCardScheme();
            do {
                n5 = (yf.N) cardScheme2;
                value = n5.getValue();
            } while (!n5.hotel(value, cardScheme));
        }
        return Unit.INSTANCE;
    }
}
