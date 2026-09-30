package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes2.dex */
public final class FnB implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final fU f8733W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f8734b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f8735f9 = LazyKt.lazy(q0Q.f11118b);

    public FnB(pl2 pl2Var, fU fUVar) {
        this.f8734b = pl2Var;
        this.f8733W = fUVar;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8735f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f8733W.b(new yi(this, wa2));
    }
}
