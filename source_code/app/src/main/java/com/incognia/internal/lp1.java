package com.incognia.internal;

/* loaded from: classes2.dex */
public final class lp1 implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final GW f10845W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10846b;

    public lp1(String str, GW gw) {
        this.f10846b = str;
        this.f10845W = gw;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10846b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.el = this.f10845W;
    }
}
