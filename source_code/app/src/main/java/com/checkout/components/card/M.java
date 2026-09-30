package com.checkout.components.card;

import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import com.checkout.components.ui.model.CardScheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class M extends kotlin.jvm.internal.i implements Function1 {
    public M(CardNumberViewModel cardNumberViewModel) {
        super(1, 0, CardNumberViewModel.class, cardNumberViewModel, "onCardSchemeSelected", "onCardSchemeSelected$card_standardRelease(Lcom/checkout/components/ui/model/CardScheme;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CardScheme p02 = (CardScheme) obj;
        Intrinsics.echo(p02, "p0");
        ((CardNumberViewModel) this.receiver).onCardSchemeSelected$card_standardRelease(p02);
        return Unit.INSTANCE;
    }
}
