package com.incognia.internal;

/* loaded from: classes2.dex */
public final class ecq implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final oVD f10378W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10379b;

    public ecq(String str, oVD ovd) {
        this.f10379b = str;
        this.f10378W = ovd;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8700z = this.f10378W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10379b;
    }
}
