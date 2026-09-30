package com.checkout.components.wallet;

import com.checkout.components.interfaces.error.CheckoutError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.i implements Function1 {
    public e(WalletComponent walletComponent) {
        super(1, 0, WalletComponent.class, walletComponent, "handleCoordinatorError", "handleCoordinatorError(Lcom/checkout/components/interfaces/error/CheckoutError;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CheckoutError p02 = (CheckoutError) obj;
        Intrinsics.echo(p02, "p0");
        ((WalletComponent) this.receiver).handleCoordinatorError(p02);
        return Unit.INSTANCE;
    }
}
