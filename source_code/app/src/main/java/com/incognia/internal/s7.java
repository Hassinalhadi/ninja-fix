package com.incognia.internal;

/* loaded from: classes2.dex */
public final class s7 implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final Y2r f11261W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11262b;

    public s7(String str, Y2r y2r) {
        this.f11262b = str;
        this.f11261W = y2r;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8669H = this.f11261W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f11262b;
    }
}
