package com.checkout.components.core;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.checkout.components.core.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0912b extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f4654a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4655b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4656c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4657d;
    public final /* synthetic */ C0913c e;

    /* renamed from: f, reason: collision with root package name */
    public int f4658f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0912b(C0913c c0913c, Nd.c cVar) {
        super(cVar);
        this.e = c0913c;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f4657d = obj;
        this.f4658f |= RecyclerView.UNDEFINED_DURATION;
        return this.e.invoke(null, null, this);
    }
}
