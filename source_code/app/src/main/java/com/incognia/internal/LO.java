package com.incognia.internal;

import java.util.List;

/* loaded from: classes2.dex */
public final class LO implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final List f9053W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9054b;

    public LO(String str, List list) {
        this.f9054b = str;
        this.f9053W = list;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9054b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8687d = this.f9053W;
    }
}
