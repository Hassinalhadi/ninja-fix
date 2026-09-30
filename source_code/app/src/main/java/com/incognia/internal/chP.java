package com.incognia.internal;

/* loaded from: classes2.dex */
public final class chP implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final fKN f10259W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10260b;

    public chP(String str, fKN fkn) {
        this.f10260b = str;
        this.f10259W = fkn;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.Sn = this.f10259W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10260b;
    }
}
