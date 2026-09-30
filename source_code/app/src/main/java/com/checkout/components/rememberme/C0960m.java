package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.checkout.components.rememberme.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0960m extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckoutRememberMe f5996b;

    /* renamed from: c, reason: collision with root package name */
    public int f5997c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0960m(CheckoutRememberMe checkoutRememberMe, Nd.c cVar) {
        super(cVar);
        this.f5996b = checkoutRememberMe;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5995a = obj;
        this.f5997c |= RecyclerView.UNDEFINED_DURATION;
        return this.f5996b.checkPrefilledData(this);
    }
}
