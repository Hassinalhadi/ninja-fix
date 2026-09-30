package com.incognia.internal;

/* loaded from: classes2.dex */
public final class L implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final SO f9035W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9036b;

    public L(String str, SO so) {
        this.f9036b = str;
        this.f9035W = so;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8679S = this.f9035W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9036b;
    }
}
