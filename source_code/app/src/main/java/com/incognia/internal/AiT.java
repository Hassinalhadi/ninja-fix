package com.incognia.internal;

/* loaded from: classes2.dex */
public final class AiT implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final XOD f8374W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8375b;

    public AiT(String str, XOD xod) {
        this.f8375b = str;
        this.f8374W = xod;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f8375b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.VL = this.f8374W;
    }
}
