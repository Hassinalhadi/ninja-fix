package com.checkout.components.card;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.operations.PaymentOperationManager;
import com.checkout.components.interfaces.component.PaymentButtonAction;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class V extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public PaymentButtonAction f3971a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f3972b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f3973c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3974d;
    public final /* synthetic */ PaymentOperationManager e;

    /* renamed from: f, reason: collision with root package name */
    public int f3975f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(PaymentOperationManager paymentOperationManager, Nd.c cVar) {
        super(cVar);
        this.e = paymentOperationManager;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object a6;
        this.f3974d = obj;
        this.f3975f |= RecyclerView.UNDEFINED_DURATION;
        a6 = this.e.a(null, null, null, this);
        return a6;
    }
}
