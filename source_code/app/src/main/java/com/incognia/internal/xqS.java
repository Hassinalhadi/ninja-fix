package com.incognia.internal;

/* loaded from: classes2.dex */
public final class xqS implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final mqI f11818W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11819b;

    public xqS(String str, mqI mqi) {
        this.f11819b = str;
        this.f11818W = mqi;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f11819b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.TF1 = this.f11818W;
    }
}
