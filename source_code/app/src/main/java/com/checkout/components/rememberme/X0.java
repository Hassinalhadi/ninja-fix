package com.checkout.components.rememberme;

import com.checkout.components.rememberme.savecard.SaveCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class X0 extends kotlin.jvm.internal.i implements Function0 {
    public X0(SaveCardViewModel saveCardViewModel) {
        super(0, 0, SaveCardViewModel.class, saveCardViewModel, "onPhoneEditClick", "onPhoneEditClick$rememberme_standardRelease()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((SaveCardViewModel) this.receiver).onPhoneEditClick$rememberme_standardRelease();
        return Unit.INSTANCE;
    }
}
