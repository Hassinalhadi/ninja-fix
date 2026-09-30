package com.incognia.internal;

/* loaded from: classes2.dex */
public final class K5 implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final IlU f8987W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8988b;

    public K5(String str, IlU ilU) {
        this.f8988b = str;
        this.f8987W = ilU;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.a2F = this.f8987W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f8988b;
    }
}
