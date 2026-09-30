package com.checkout.components.core;

import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.redirecthandler.RedirectOutcome;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class y extends kotlin.jvm.internal.i implements Function1 {
    public y(InternalCheckoutComponents internalCheckoutComponents) {
        super(1, 0, InternalCheckoutComponents.class, internalCheckoutComponents, "buildRedirectOutcomeHandler", "buildRedirectOutcomeHandler$core_standardRelease(Lcom/checkout/components/redirecthandler/RedirectOutcome;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RedirectOutcome p02 = (RedirectOutcome) obj;
        Intrinsics.echo(p02, "p0");
        ((InternalCheckoutComponents) this.receiver).buildRedirectOutcomeHandler$core_standardRelease(p02);
        return Unit.INSTANCE;
    }
}
