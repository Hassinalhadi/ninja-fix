package com.incognia.internal;

/* loaded from: classes2.dex */
public final class Y9 implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final hvw f9979W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9980b;

    public Y9(String str, hvw hvwVar) {
        this.f9980b = str;
        this.f9979W = hvwVar;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.CM5 = this.f9979W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9980b;
    }
}
