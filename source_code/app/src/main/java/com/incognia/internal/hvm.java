package com.incognia.internal;

/* loaded from: classes2.dex */
public final class hvm implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final K0 f10580W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10581b;

    public hvm(String str, K0 k02) {
        this.f10581b = str;
        this.f10580W = k02;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10581b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.H02 = this.f10580W;
    }
}
