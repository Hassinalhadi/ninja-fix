package com.incognia.internal;

/* loaded from: classes2.dex */
public final class ktj implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final gh f10785W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10786b;

    public ktj(String str, gh ghVar) {
        this.f10786b = str;
        this.f10785W = ghVar;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10786b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.vZZ = this.f10785W;
    }
}
