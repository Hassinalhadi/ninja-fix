package com.incognia.internal;

/* loaded from: classes2.dex */
public final class YCr implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final qfn f9981W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9982b;

    public YCr(String str, qfn qfnVar) {
        this.f9982b = str;
        this.f9981W = qfnVar;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9982b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.Gw = this.f9981W;
    }
}
