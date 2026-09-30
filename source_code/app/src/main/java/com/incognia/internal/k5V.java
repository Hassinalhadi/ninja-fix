package com.incognia.internal;

/* loaded from: classes2.dex */
public final class k5V implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final RUd f10733W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10734b;

    public k5V(String str, RUd rUd) {
        this.f10734b = str;
        this.f10733W = rUd;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.qnE = this.f10733W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10734b;
    }
}
