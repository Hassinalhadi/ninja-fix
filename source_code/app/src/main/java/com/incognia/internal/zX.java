package com.incognia.internal;

/* loaded from: classes2.dex */
public final class zX implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final rKz f11918W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11919b;

    public zX(String str, rKz rkz) {
        this.f11919b = str;
        this.f11918W = rkz;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f11919b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.IB = this.f11918W;
    }
}
