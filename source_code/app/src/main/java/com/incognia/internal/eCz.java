package com.incognia.internal;

/* loaded from: classes2.dex */
public final class eCz implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final py f10353W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10354b;

    public eCz(String str, py pyVar) {
        this.f10354b = str;
        this.f10353W = pyVar;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10354b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.AL = this.f10353W;
    }
}
