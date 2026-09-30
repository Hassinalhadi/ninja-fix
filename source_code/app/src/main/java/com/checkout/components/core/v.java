package com.checkout.components.core;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentCallback;

/* loaded from: classes3.dex */
public final class v extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public PaymentMethodComponent f5085a;

    /* renamed from: b, reason: collision with root package name */
    public ComponentCallback f5086b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5087c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5088d;
    public final /* synthetic */ InternalCheckoutComponents e;

    /* renamed from: f, reason: collision with root package name */
    public int f5089f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(InternalCheckoutComponents internalCheckoutComponents, Nd.c cVar) {
        super(cVar);
        this.e = internalCheckoutComponents;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5088d = obj;
        this.f5089f |= RecyclerView.UNDEFINED_DURATION;
        return InternalCheckoutComponents.access$handleDirectApiCall(this.e, null, null, null, this);
    }
}
