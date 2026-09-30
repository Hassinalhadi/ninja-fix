package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class X1 extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5830a;

    /* renamed from: b, reason: collision with root package name */
    public int f5831b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5832c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5833d;
    public final /* synthetic */ Y1 e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5834f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5835g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X1(Y1 y12, Nd.c cVar) {
        super(cVar);
        this.e = y12;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5830a = obj;
        this.f5831b |= RecyclerView.UNDEFINED_DURATION;
        return this.e.emit(null, this);
    }
}
