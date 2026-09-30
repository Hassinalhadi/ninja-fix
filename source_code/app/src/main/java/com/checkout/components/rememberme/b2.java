package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class b2 extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5860a;

    /* renamed from: b, reason: collision with root package name */
    public int f5861b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5862c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c2 f5863d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5864f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5865g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, Nd.c cVar) {
        super(cVar);
        this.f5863d = c2Var;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5860a = obj;
        this.f5861b |= RecyclerView.UNDEFINED_DURATION;
        return this.f5863d.emit(null, this);
    }
}
