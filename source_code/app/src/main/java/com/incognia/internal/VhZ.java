package com.incognia.internal;

/* loaded from: classes2.dex */
public final class VhZ implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final FzF f9794W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9795b;

    public VhZ(String str, FzF fzF) {
        this.f9795b = str;
        this.f9794W = fzF;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9795b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8682Y = this.f9794W;
    }
}
