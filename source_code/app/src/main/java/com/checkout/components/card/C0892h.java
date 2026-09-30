package com.checkout.components.card;

import com.checkout.components.card.ui.component.cvv.CVVViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import yf.at;

/* renamed from: com.checkout.components.card.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0892h extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f4194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CVVViewModel f4195b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0892h(CVVViewModel cVVViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f4195b = cVVViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0892h(this.f4195b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0892h(this.f4195b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        PaymentStateManager paymentStateManager;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4194a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        paymentStateManager = this.f4195b.f4486h;
        at cardScheme = paymentStateManager.getCardScheme();
        C0891g c0891g = new C0891g(this.f4195b);
        this.f4194a = 1;
        ((yf.N) cardScheme).collect(c0891g, this);
        return aVar;
    }
}
