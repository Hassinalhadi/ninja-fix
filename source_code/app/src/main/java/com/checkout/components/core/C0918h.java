package com.checkout.components.core;

import com.checkout.components.core.ui.FlowComponent;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.core.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0918h extends kotlin.jvm.internal.i implements Function1 {
    public C0918h(FlowComponent flowComponent) {
        super(1, 0, FlowComponent.class, flowComponent, "handleMethodSelected", "handleMethodSelected$core_standardRelease(Lcom/checkout/components/interfaces/api/PaymentMethodComponent;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PaymentMethodComponent p02 = (PaymentMethodComponent) obj;
        Intrinsics.echo(p02, "p0");
        ((FlowComponent) this.receiver).handleMethodSelected$core_standardRelease(p02);
        return Unit.INSTANCE;
    }
}
