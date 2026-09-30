package com.incognia.internal;

import java.util.List;

/* loaded from: classes2.dex */
public final class kIx implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final List f10750W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10751b;

    public kIx(String str, List list) {
        this.f10751b = str;
        this.f10750W = list;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10751b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.lCi = this.f10750W;
    }
}
