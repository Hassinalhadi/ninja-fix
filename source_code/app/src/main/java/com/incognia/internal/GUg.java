package com.incognia.internal;

/* loaded from: classes2.dex */
public final class GUg implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final DdD f8771W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8772b;

    public GUg(String str, DdD ddD) {
        this.f8772b = str;
        this.f8771W = ddD;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.DOu = this.f8771W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f8772b;
    }
}
