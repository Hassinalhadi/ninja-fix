package com.incognia.internal;

/* loaded from: classes2.dex */
public final class T4 implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final ao f9638W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9639b;

    public T4(String str, ao aoVar) {
        this.f9639b = str;
        this.f9638W = aoVar;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9639b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8691n9 = this.f9638W;
    }
}
