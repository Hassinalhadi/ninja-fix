package com.incognia.internal;

/* loaded from: classes2.dex */
public final class pAe implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final Kq f11054W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11055b;

    public pAe(String str, Kq kq) {
        this.f11055b = str;
        this.f11054W = kq;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f11055b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.mn = this.f11054W;
    }
}
