package com.checkout.components.card;

import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import yf.at;

/* loaded from: classes3.dex */
public final class D extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardNumberViewModel f3941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(CardNumberViewModel cardNumberViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f3941b = cardNumberViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new D(this.f3941b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new D(this.f3941b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3940a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        at merchantCardNotSupportedErrorMessage = this.f3941b.getPaymentStateManager().getMerchantCardNotSupportedErrorMessage();
        C c3 = new C(this.f3941b);
        this.f3940a = 1;
        ((yf.N) merchantCardNotSupportedErrorMessage).collect(c3, this);
        return aVar;
    }
}
