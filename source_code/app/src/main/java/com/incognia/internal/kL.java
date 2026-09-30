package com.incognia.internal;

/* loaded from: classes2.dex */
public final class kL implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final OH f10753W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10754b;

    public kL(String str, OH oh) {
        this.f10754b = str;
        this.f10753W = oh;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10754b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8676P = this.f10753W;
    }
}
