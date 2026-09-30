package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class T extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5799a;

    /* renamed from: b, reason: collision with root package name */
    public int f5800b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5801c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U f5802d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5803f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5804g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3440j f5805h;

    /* renamed from: i, reason: collision with root package name */
    public Object f5806i;

    /* renamed from: j, reason: collision with root package name */
    public Object f5807j;

    /* renamed from: k, reason: collision with root package name */
    public Object f5808k;

    /* renamed from: l, reason: collision with root package name */
    public int f5809l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u4, Nd.c cVar) {
        super(cVar);
        this.f5802d = u4;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5799a = obj;
        this.f5800b |= RecyclerView.UNDEFINED_DURATION;
        return this.f5802d.emit(null, this);
    }
}
