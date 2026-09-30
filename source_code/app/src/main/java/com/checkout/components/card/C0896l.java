package com.checkout.components.card;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.checkout.components.card.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0896l extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardComponent f4203b;

    /* renamed from: c, reason: collision with root package name */
    public int f4204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0896l(CardComponent cardComponent, Nd.c cVar) {
        super(cVar);
        this.f4203b = cardComponent;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f4202a = obj;
        this.f4204c |= RecyclerView.UNDEFINED_DURATION;
        return this.f4203b.isAvailable(this);
    }
}
