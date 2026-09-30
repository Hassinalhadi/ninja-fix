package com.incognia.internal;

/* loaded from: classes2.dex */
public final class SfK implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final OME f9614W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9615b;

    public SfK(String str, OME ome) {
        this.f9615b = str;
        this.f9614W = ome;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8684ar = this.f9614W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9615b;
    }
}
