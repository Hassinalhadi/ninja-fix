package com.checkout.components.rememberme;

import com.checkout.components.rememberme.savecard.SaveCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class T0 extends kotlin.jvm.internal.i implements Function1 {
    public T0(SaveCardViewModel saveCardViewModel) {
        super(1, 0, SaveCardViewModel.class, saveCardViewModel, "onCheckedChange", "onCheckedChange$rememberme_standardRelease(Z)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((SaveCardViewModel) this.receiver).onCheckedChange$rememberme_standardRelease(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }
}
