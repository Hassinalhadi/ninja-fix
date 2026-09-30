package com.incognia.internal;

/* loaded from: classes2.dex */
public final class VHb implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final Mh f9765W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9766b;

    public VHb(String str, Mh mh) {
        this.f9766b = str;
        this.f9765W = mh;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.PqK = this.f9765W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9766b;
    }
}
