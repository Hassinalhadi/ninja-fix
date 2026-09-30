package com.incognia.internal;

/* loaded from: classes2.dex */
public final class DfE implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final p8 f8555W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8556b;

    public DfE(String str, p8 p8Var) {
        this.f8556b = str;
        this.f8555W = p8Var;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f8556b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.C = this.f8555W;
    }
}
