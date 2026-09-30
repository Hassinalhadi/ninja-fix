package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.wallet.WalletButtonDelegate;

/* loaded from: classes3.dex */
public final class E1 extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f5747a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5748b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5749c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WalletButtonDelegate f5750d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1(WalletButtonDelegate walletButtonDelegate, Nd.c cVar) {
        super(cVar);
        this.f5750d = walletButtonDelegate;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5749c = obj;
        this.e |= RecyclerView.UNDEFINED_DURATION;
        return this.f5750d.onClick$rememberme_standardRelease(this);
    }
}
