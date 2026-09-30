package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class P extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5787a;

    /* renamed from: b, reason: collision with root package name */
    public int f5788b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f5790d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5791f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5792g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q4, Nd.c cVar) {
        super(cVar);
        this.f5790d = q4;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5787a = obj;
        this.f5788b |= RecyclerView.UNDEFINED_DURATION;
        return this.f5790d.emit(null, this);
    }
}
