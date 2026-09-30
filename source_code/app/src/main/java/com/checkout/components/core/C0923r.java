package com.checkout.components.core;

import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.interfaces.model.PayRequestPayload;

/* renamed from: com.checkout.components.core.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0923r extends kotlin.jvm.internal.i implements Xd.l {
    public C0923r(InternalCheckoutComponents internalCheckoutComponents) {
        super(2, 0, InternalCheckoutComponents.class, internalCheckoutComponents, "handleRememberMePayment", "handleRememberMePayment$core_standardRelease(Lcom/checkout/components/interfaces/model/PayRequestPayload$RememberMe;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((InternalCheckoutComponents) this.receiver).handleRememberMePayment$core_standardRelease((PayRequestPayload.RememberMe) obj, (Nd.c) obj2);
    }
}
