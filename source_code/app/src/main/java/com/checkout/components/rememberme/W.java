package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class W extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5821a;

    /* renamed from: b, reason: collision with root package name */
    public int f5822b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5823c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X f5824d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5825f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5826g;

    /* renamed from: h, reason: collision with root package name */
    public Object f5827h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x4, Nd.c cVar) {
        super(cVar);
        this.f5824d = x4;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5821a = obj;
        this.f5822b |= RecyclerView.UNDEFINED_DURATION;
        return this.f5824d.emit(null, this);
    }
}
