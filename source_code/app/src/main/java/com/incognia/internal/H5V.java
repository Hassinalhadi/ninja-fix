package com.incognia.internal;

/* loaded from: classes2.dex */
public final class H5V implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final ORV f8820W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8821b;

    public H5V(String str, ORV orv) {
        this.f8821b = str;
        this.f8820W = orv;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f8821b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.oRC = this.f8820W;
    }
}
