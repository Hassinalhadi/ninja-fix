package com.incognia.internal;

/* loaded from: classes2.dex */
public final class EyM implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final Ye8 f8629W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8630b;

    public EyM(String str, Ye8 ye8) {
        this.f8630b = str;
        this.f8629W = ye8;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f8630b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.OyQ = this.f8629W;
    }
}
