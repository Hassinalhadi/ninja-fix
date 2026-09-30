package com.checkout.components.core;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentCallback;

/* loaded from: classes3.dex */
public final class u extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public PaymentMethodComponent f5018a;

    /* renamed from: b, reason: collision with root package name */
    public ComponentCallback f5019b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5020c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5021d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InternalCheckoutComponents f5023g;

    /* renamed from: h, reason: collision with root package name */
    public int f5024h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(InternalCheckoutComponents internalCheckoutComponents, Nd.c cVar) {
        super(cVar);
        this.f5023g = internalCheckoutComponents;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5022f = obj;
        this.f5024h |= RecyclerView.UNDEFINED_DURATION;
        return InternalCheckoutComponents.access$handleCustomSubmission(this.f5023g, null, null, null, null, this);
    }
}
