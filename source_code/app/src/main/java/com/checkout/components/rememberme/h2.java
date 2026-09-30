package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class h2 extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5944a;

    /* renamed from: b, reason: collision with root package name */
    public int f5945b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5946c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i2 f5947d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5948f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5949g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(i2 i2Var, Nd.c cVar) {
        super(cVar);
        this.f5947d = i2Var;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5944a = obj;
        this.f5945b |= RecyclerView.UNDEFINED_DURATION;
        return this.f5947d.emit(null, this);
    }
}
