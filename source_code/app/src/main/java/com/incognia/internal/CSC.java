package com.incognia.internal;

/* loaded from: classes2.dex */
public final class CSC implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final LA0 f8458W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8459b;

    public CSC(String str, LA0 la0) {
        this.f8459b = str;
        this.f8458W = la0;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f8459b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8692r = this.f8458W;
    }
}
