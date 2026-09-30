package com.checkout.components.card;

import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3439i;
import yf.ar;
import yf.at;

/* loaded from: classes3.dex */
public final class B extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardNumberViewModel f3921b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(CardNumberViewModel cardNumberViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f3921b = cardNumberViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new B(this.f3921b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new B(this.f3921b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = Od.a.alpha;
        int i4 = this.f3920a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            at cardScheme = this.f3921b.getPaymentStateManager().getCardScheme();
            at cardMetadata = this.f3921b.getPaymentStateManager().getCardMetadata();
            C0910z c0910z = new C0910z(null);
            A a6 = new A(this.f3921b);
            this.f3920a = 1;
            Object alpha = zf.b.alpha(this, new cd.a(c0910z, (Nd.c) null), ar.alpha, a6, new InterfaceC3439i[]{cardScheme, cardMetadata});
            if (alpha != Od.a.alpha) {
                alpha = Unit.INSTANCE;
            }
            if (alpha == obj2) {
                return obj2;
            }
        }
        return Unit.INSTANCE;
    }
}
