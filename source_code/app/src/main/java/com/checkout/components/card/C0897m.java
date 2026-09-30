package com.checkout.components.card;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.checkout.components.card.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0897m extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f4205a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CardComponent f4207c;

    /* renamed from: d, reason: collision with root package name */
    public int f4208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0897m(CardComponent cardComponent, Nd.c cVar) {
        super(cVar);
        this.f4207c = cardComponent;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f4206b = obj;
        this.f4208d |= RecyclerView.UNDEFINED_DURATION;
        return this.f4207c.isValid(this);
    }
}
