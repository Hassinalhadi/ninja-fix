package com.incognia.internal;

/* loaded from: classes2.dex */
public final class X4J implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final uK f9889W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9890b;

    public X4J(String str, uK uKVar) {
        this.f9890b = str;
        this.f9889W = uKVar;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8689i = this.f9889W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9890b;
    }
}
