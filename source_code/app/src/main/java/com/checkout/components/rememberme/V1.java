package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.model.WalletListItem;

/* loaded from: classes3.dex */
public final class V1 extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public WalletListItem f5817a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W1 f5819c;

    /* renamed from: d, reason: collision with root package name */
    public int f5820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(W1 w12, Nd.c cVar) {
        super(cVar);
        this.f5819c = w12;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5818b = obj;
        this.f5820d |= RecyclerView.UNDEFINED_DURATION;
        return this.f5819c.emit(null, this);
    }
}
