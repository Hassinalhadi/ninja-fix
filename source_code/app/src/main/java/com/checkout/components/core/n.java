package com.checkout.components.core;

import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.model.PayRequestPayload;

/* loaded from: classes3.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.i implements Xd.n {
    public n(InternalCheckoutComponents internalCheckoutComponents) {
        super(4, 0, InternalCheckoutComponents.class, internalCheckoutComponents, "submitComponentPayment", "submitComponentPayment$core_standardRelease(Lcom/checkout/components/interfaces/api/PaymentMethodComponent;Lcom/checkout/components/interfaces/component/ComponentCallback;Lcom/checkout/components/interfaces/model/PayRequestPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((InternalCheckoutComponents) this.receiver).submitComponentPayment$core_standardRelease((PaymentMethodComponent) obj, (ComponentCallback) obj2, (PayRequestPayload) obj3, (Nd.c) obj4);
    }
}
