package com.incognia.internal;

/* loaded from: classes2.dex */
public final class uB implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final VJU f11448W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11449b;

    public uB(String str, VJU vju) {
        this.f11449b = str;
        this.f11448W = vju;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f11449b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8671J = this.f11448W;
    }
}
