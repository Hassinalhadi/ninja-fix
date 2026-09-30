package com.checkout.components.wallet;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class b extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6448a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6449b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6450c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6451d;
    public /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GooglePayMediator f6452f;

    /* renamed from: g, reason: collision with root package name */
    public int f6453g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GooglePayMediator googlePayMediator, Nd.c cVar) {
        super(cVar);
        this.f6452f = googlePayMediator;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f6453g |= RecyclerView.UNDEFINED_DURATION;
        return this.f6452f.isGooglePayReady(this);
    }
}
