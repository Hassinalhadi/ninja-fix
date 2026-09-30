package com.checkout.components.core;

import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.model.PaymentState;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class q extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f4990a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InternalCheckoutComponents f4992c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Xd.l f4993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InternalCheckoutComponents internalCheckoutComponents, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.f4992c = internalCheckoutComponents;
        this.f4993d = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        q qVar = new q(this.f4992c, this.f4993d, cVar);
        qVar.f4991b = obj;
        return qVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((PaymentMethodComponent) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        PaymentMethodComponent paymentMethodComponent = (PaymentMethodComponent) this.f4991b;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4990a;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                this.f4992c.updatePaymentState$core_standardRelease(PaymentState.InProgress.INSTANCE, paymentMethodComponent.getName().getValue());
                Xd.l lVar = this.f4993d;
                this.f4991b = paymentMethodComponent;
                this.f4990a = 1;
                obj = lVar.invoke(paymentMethodComponent, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            Boolean bool = (Boolean) obj;
            if (!bool.booleanValue()) {
            }
            return bool;
        } finally {
            this.f4992c.updatePaymentState$core_standardRelease(PaymentState.Default.INSTANCE, paymentMethodComponent.getName().getValue());
        }
    }
}
