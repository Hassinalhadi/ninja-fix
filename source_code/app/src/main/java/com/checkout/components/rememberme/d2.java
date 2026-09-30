package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class d2 extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5876a;

    /* renamed from: b, reason: collision with root package name */
    public int f5877b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5878c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2 f5879d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5880f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5881g;

    /* renamed from: h, reason: collision with root package name */
    public Object f5882h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e2 e2Var, Nd.c cVar) {
        super(cVar);
        this.f5879d = e2Var;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5876a = obj;
        this.f5877b |= RecyclerView.UNDEFINED_DURATION;
        return this.f5879d.emit(null, this);
    }
}
