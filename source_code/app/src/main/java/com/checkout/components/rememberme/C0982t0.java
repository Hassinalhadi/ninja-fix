package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Result;

/* renamed from: com.checkout.components.rememberme.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0982t0 extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6294a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6295b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6296c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6297d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0985u0 f6299g;

    /* renamed from: h, reason: collision with root package name */
    public int f6300h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0982t0(C0985u0 c0985u0, Nd.c cVar) {
        super(cVar);
        this.f6299g = c0985u0;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f6298f = obj;
        this.f6300h |= RecyclerView.UNDEFINED_DURATION;
        return this.f6299g.emit(new Result(null), this);
    }
}
