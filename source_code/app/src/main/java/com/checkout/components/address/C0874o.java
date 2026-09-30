package com.checkout.components.address;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.checkout.components.address.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0874o extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3897a;

    /* renamed from: b, reason: collision with root package name */
    public int f3898b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3899c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0875p f3900d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3901f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3902g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0874o(C0875p c0875p, Nd.c cVar) {
        super(cVar);
        this.f3900d = c0875p;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f3897a = obj;
        this.f3898b |= RecyclerView.UNDEFINED_DURATION;
        return this.f3900d.emit(null, this);
    }
}
