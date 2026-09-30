package com.incognia.internal;

/* loaded from: classes2.dex */
public final class u1M implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final Zyk f11436W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11437b;

    public u1M(String str, Zyk zyk) {
        this.f11437b = str;
        this.f11436W = zyk;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f11437b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.Q = this.f11436W;
    }
}
