package com.checkout.components.rememberme;

import com.checkout.components.rememberme.savecard.SaveCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class U0 extends kotlin.jvm.internal.i implements Function1 {
    public U0(SaveCardViewModel saveCardViewModel) {
        super(1, 0, SaveCardViewModel.class, saveCardViewModel, "onEmailChange", "onEmailChange$rememberme_standardRelease(Ljava/lang/String;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p02 = (String) obj;
        Intrinsics.echo(p02, "p0");
        ((SaveCardViewModel) this.receiver).onEmailChange$rememberme_standardRelease(p02);
        return Unit.INSTANCE;
    }
}
