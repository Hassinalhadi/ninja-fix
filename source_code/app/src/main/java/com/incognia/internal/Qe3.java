package com.incognia.internal;

/* loaded from: classes2.dex */
public final class Qe3 implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final vY f9508W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9509b;

    public Qe3(String str, vY vYVar) {
        this.f9509b = str;
        this.f9508W = vYVar;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.hod = this.f9508W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9509b;
    }
}
