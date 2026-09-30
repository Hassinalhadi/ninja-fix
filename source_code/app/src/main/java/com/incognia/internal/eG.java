package com.incognia.internal;

/* loaded from: classes2.dex */
public final class eG implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final fKw f10356W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10357b;

    public eG(String str, fKw fkw) {
        this.f10357b = str;
        this.f10356W = fkw;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10357b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.Uj = this.f10356W;
    }
}
