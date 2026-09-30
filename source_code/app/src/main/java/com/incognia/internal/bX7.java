package com.incognia.internal;

/* loaded from: classes2.dex */
public final class bX7 implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final Ip7 f10185W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10186b;

    public bX7(String str, Ip7 ip7) {
        this.f10186b = str;
        this.f10185W = ip7;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10186b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.jgi = this.f10185W;
    }
}
