package com.incognia.internal;

/* loaded from: classes2.dex */
public final class Vpx implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final HLa f9803W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9804b;

    public Vpx(String str, HLa hLa) {
        this.f9804b = str;
        this.f9803W = hLa;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.Lu = this.f9803W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9804b;
    }
}
