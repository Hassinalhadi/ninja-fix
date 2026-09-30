package com.incognia.internal;

/* loaded from: classes2.dex */
public final class WT implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final jW f9855W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9856b;

    public WT(String str, jW jWVar) {
        this.f9856b = str;
        this.f9855W = jWVar;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9856b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8694s0 = this.f9855W;
    }
}
