package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class J extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5758a;

    /* renamed from: b, reason: collision with root package name */
    public int f5759b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5760c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5761d;
    public final /* synthetic */ K e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5762f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5763g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k6, Nd.c cVar) {
        super(cVar);
        this.e = k6;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5758a = obj;
        this.f5759b |= RecyclerView.UNDEFINED_DURATION;
        return this.e.emit(null, this);
    }
}
