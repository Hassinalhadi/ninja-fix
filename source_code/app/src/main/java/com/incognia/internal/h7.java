package com.incognia.internal;

/* loaded from: classes2.dex */
public final class h7 implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final hCR f10522W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10523b;

    public h7(String str, hCR hcr) {
        this.f10523b = str;
        this.f10522W = hcr;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.oI = this.f10522W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10523b;
    }
}
