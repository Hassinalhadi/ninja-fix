package com.incognia.internal;

/* loaded from: classes2.dex */
public final class HS implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final gQi f8841W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8842b;

    public HS(String str, gQi gqi) {
        this.f8842b = str;
        this.f8841W = gqi;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f8842b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.FL = this.f8841W;
    }
}
