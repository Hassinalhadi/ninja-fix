package com.incognia.internal;

/* loaded from: classes2.dex */
public final class doQ implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final bXV f10329W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10330b;

    public doQ(String str, bXV bxv) {
        this.f10330b = str;
        this.f10329W = bxv;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.Pk = this.f10329W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10330b;
    }
}
