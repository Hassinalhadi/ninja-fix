package com.incognia.internal;

/* loaded from: classes2.dex */
public final class dg implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final N8 f10322W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10323b;

    public dg(String str, N8 n82) {
        this.f10323b = str;
        this.f10322W = n82;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10323b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.i2a = this.f10322W;
    }
}
