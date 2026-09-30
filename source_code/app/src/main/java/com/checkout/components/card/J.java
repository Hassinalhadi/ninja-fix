package com.checkout.components.card;

import com.checkout.components.card.ui.component.expirydate.ExpiryDateViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import yf.at;

/* loaded from: classes3.dex */
public final class J extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExpiryDateViewModel f3950b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(ExpiryDateViewModel expiryDateViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f3950b = expiryDateViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new J(this.f3950b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new J(this.f3950b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        PaymentStateManager paymentStateManager;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3949a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        paymentStateManager = this.f3950b.f4507h;
        at isCvvRequiredScheme = paymentStateManager.getIsCvvRequiredScheme();
        I i5 = new I(this.f3950b);
        this.f3949a = 1;
        ((yf.N) isCvvRequiredScheme).collect(i5, this);
        return aVar;
    }
}
