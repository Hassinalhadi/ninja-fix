package com.checkout.components.wallet;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class h extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletComponent f6519b;

    /* renamed from: c, reason: collision with root package name */
    public int f6520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WalletComponent walletComponent, Nd.c cVar) {
        super(cVar);
        this.f6519b = walletComponent;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f6518a = obj;
        this.f6520c |= RecyclerView.UNDEFINED_DURATION;
        return this.f6519b.isAvailable(this);
    }
}
