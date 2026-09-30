package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class Z1 extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5845a;

    /* renamed from: b, reason: collision with root package name */
    public int f5846b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5847c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5848d;
    public final /* synthetic */ a2 e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5849f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5850g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(a2 a2Var, Nd.c cVar) {
        super(cVar);
        this.e = a2Var;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5845a = obj;
        this.f5846b |= RecyclerView.UNDEFINED_DURATION;
        return this.e.emit(null, this);
    }
}
