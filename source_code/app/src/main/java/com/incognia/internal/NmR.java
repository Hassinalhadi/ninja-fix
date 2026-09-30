package com.incognia.internal;

import java.util.List;

/* loaded from: classes2.dex */
public final class NmR implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final List f9252W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9253b;

    public NmR(String str, List list) {
        this.f9253b = str;
        this.f9252W = list;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9253b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.sA = this.f9252W;
    }
}
