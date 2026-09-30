package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class M extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5770a;

    /* renamed from: b, reason: collision with root package name */
    public int f5771b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5772c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f5773d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5774f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5775g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n5, Nd.c cVar) {
        super(cVar);
        this.f5773d = n5;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5770a = obj;
        this.f5771b |= RecyclerView.UNDEFINED_DURATION;
        return this.f5773d.emit(null, this);
    }
}
