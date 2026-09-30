package com.checkout.components.card;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.operations.PaymentOperationManager;

/* loaded from: classes3.dex */
public final class X extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentOperationManager f3980b;

    /* renamed from: c, reason: collision with root package name */
    public int f3981c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(PaymentOperationManager paymentOperationManager, Nd.c cVar) {
        super(cVar);
        this.f3980b = paymentOperationManager;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f3979a = obj;
        this.f3981c |= RecyclerView.UNDEFINED_DURATION;
        return this.f3980b.tokenize(this);
    }
}
