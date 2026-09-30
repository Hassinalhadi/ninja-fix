package com.checkout.components.card;

import com.checkout.components.card.ui.component.paybutton.PayButtonViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class P extends kotlin.jvm.internal.i implements Function0 {
    public P(PayButtonViewModel payButtonViewModel) {
        super(0, 0, PayButtonViewModel.class, payButtonViewModel, "pay", "pay()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((PayButtonViewModel) this.receiver).pay();
        return Unit.INSTANCE;
    }
}
