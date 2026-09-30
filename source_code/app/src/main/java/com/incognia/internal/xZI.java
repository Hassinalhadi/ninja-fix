package com.incognia.internal;

/* loaded from: classes2.dex */
public final class xZI implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final JBP f11801W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11802b;

    public xZI(String str, JBP jbp) {
        this.f11802b = str;
        this.f11801W = jbp;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f11802b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.eeB = this.f11801W;
    }
}
