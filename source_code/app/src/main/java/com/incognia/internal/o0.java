package com.incognia.internal;

import java.util.List;

/* loaded from: classes2.dex */
public final class o0 implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final List f10982W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10983b;

    public o0(String str, List list) {
        this.f10983b = str;
        this.f10982W = list;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10983b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.Hz = this.f10982W;
    }
}
