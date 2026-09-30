package com.checkout.components.card;

import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import yf.at;

/* renamed from: com.checkout.components.card.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0909y extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f4612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardNumberViewModel f4613b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0909y(CardNumberViewModel cardNumberViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f4613b = cardNumberViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0909y(this.f4613b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0909y(this.f4613b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4612a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        at cardMetadata = this.f4613b.getPaymentStateManager().getCardMetadata();
        C0908x c0908x = new C0908x(this.f4613b);
        this.f4612a = 1;
        ((yf.N) cardMetadata).collect(c0908x, this);
        return aVar;
    }
}
