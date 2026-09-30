package com.incognia.internal;

/* loaded from: classes2.dex */
public final class iO implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final P6 f10618W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10619b;

    public iO(String str, P6 p62) {
        this.f10619b = str;
        this.f10618W = p62;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10619b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.YaL = this.f10618W;
    }
}
