package com.checkout.components.card;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.operations.PaymentOperationManager;

/* loaded from: classes3.dex */
public final class W extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentOperationManager f3977b;

    /* renamed from: c, reason: collision with root package name */
    public int f3978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(PaymentOperationManager paymentOperationManager, Nd.c cVar) {
        super(cVar);
        this.f3977b = paymentOperationManager;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f3976a = obj;
        this.f3978c |= RecyclerView.UNDEFINED_DURATION;
        return this.f3977b.submit(this);
    }
}
