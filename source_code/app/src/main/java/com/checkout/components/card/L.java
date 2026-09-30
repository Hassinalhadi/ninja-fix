package com.checkout.components.card;

import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class L extends kotlin.jvm.internal.i implements Function1 {
    public L(CardNumberViewModel cardNumberViewModel) {
        super(1, 0, CardNumberViewModel.class, cardNumberViewModel, "onInputTextChanged", "onInputTextChanged$card_standardRelease(Ljava/lang/String;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p02 = (String) obj;
        Intrinsics.echo(p02, "p0");
        ((CardNumberViewModel) this.receiver).onInputTextChanged$card_standardRelease(p02);
        return Unit.INSTANCE;
    }
}
