package com.incognia.internal;

/* loaded from: classes2.dex */
public final class KB implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final G4 f8992W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8993b;

    public KB(String str, G4 g42) {
        this.f8993b = str;
        this.f8992W = g42;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f8993b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.j43 = this.f8992W;
    }
}
