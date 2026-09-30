package com.checkout.components.core;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.interfaces.error.CheckoutError;

/* renamed from: com.checkout.components.core.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0914d extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f4724a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4725b;

    /* renamed from: c, reason: collision with root package name */
    public CheckoutError.Request f4726c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4727d;
    public /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CheckoutComponentsFactory f4728f;

    /* renamed from: g, reason: collision with root package name */
    public int f4729g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0914d(CheckoutComponentsFactory checkoutComponentsFactory, Nd.c cVar) {
        super(cVar);
        this.f4728f = checkoutComponentsFactory;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f4729g |= RecyclerView.UNDEFINED_DURATION;
        return this.f4728f.fetchPaymentSessionAndCreateCheckoutComponents$core_standardRelease(null, this);
    }
}
