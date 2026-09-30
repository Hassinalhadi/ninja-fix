package com.incognia.internal;

/* loaded from: classes2.dex */
public final class Wi implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final D f9863W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9864b;

    public Wi(String str, D d4) {
        this.f9864b = str;
        this.f9863W = d4;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.eHc = this.f9863W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9864b;
    }
}
