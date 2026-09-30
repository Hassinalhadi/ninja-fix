package com.checkout.components.card;

import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import yf.at;

/* loaded from: classes3.dex */
public final class F extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardNumberViewModel f3944b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(CardNumberViewModel cardNumberViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f3944b = cardNumberViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new F(this.f3944b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new F(this.f3944b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3943a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        at preferredCardScheme = this.f3944b.getPaymentStateManager().getPreferredCardScheme();
        E e = new E(this.f3944b);
        this.f3943a = 1;
        ((yf.N) preferredCardScheme).collect(e, this);
        return aVar;
    }
}
