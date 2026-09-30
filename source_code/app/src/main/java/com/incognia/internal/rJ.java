package com.incognia.internal;

import java.util.List;

/* loaded from: classes2.dex */
public final class rJ implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final List f11216W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11217b;

    public rJ(String str, List list) {
        this.f11217b = str;
        this.f11216W = list;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f11217b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8693s = this.f11216W;
    }
}
