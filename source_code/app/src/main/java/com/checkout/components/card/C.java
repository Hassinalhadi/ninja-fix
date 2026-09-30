package com.checkout.components.card;

import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class C implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardNumberViewModel f3922a;

    public C(CardNumberViewModel cardNumberViewModel) {
        this.f3922a = cardNumberViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        String str = (String) obj;
        if (str.length() > 0) {
            this.f3922a.showError$card_standardRelease(str);
        } else {
            this.f3922a.hideError$card_standardRelease();
        }
        return Unit.INSTANCE;
    }
}
