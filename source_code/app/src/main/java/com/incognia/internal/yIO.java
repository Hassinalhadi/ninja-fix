package com.incognia.internal;

/* loaded from: classes2.dex */
public final class yIO implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final FCF f11850W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11851b;

    public yIO(String str, FCF fcf) {
        this.f11851b = str;
        this.f11850W = fcf;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f11851b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.mi = this.f11850W;
    }
}
