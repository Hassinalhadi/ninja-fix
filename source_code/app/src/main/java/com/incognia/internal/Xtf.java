package com.incognia.internal;

import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes2.dex */
public final class Xtf implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final fU f9961W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f9962b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f9963f9 = LazyKt.lazy(PQ.f9420b);

    public Xtf(pl2 pl2Var, fU fUVar) {
        this.f9962b = pl2Var;
        this.f9961W = fUVar;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9963f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f9961W.b(new FmN(this, wa2));
    }
}
