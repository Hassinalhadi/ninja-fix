package com.checkout.components.card;

import com.checkout.components.card.ui.component.paybutton.PayButtonViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class T extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayButtonViewModel f3965b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(PayButtonViewModel payButtonViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f3965b = payButtonViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new T(this.f3965b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new T(this.f3965b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        PaymentStateManager paymentStateManager;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3964a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            paymentStateManager = this.f3965b.f4519a;
            yf.L paymentState = paymentStateManager.getPaymentState();
            S s3 = new S(this.f3965b);
            this.f3964a = 1;
            if (paymentState.collect(s3, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
