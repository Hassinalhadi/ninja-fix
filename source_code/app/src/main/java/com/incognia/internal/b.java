package com.incognia.internal;

/* loaded from: classes2.dex */
public final class b implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final N6W f10132W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10133b;

    public b(String str, N6W n6w) {
        this.f10133b = str;
        this.f10132W = n6w;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.nT = this.f10132W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10133b;
    }
}
