package com.incognia.internal;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class q0e implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f11119W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11120b;

    public q0e(String str, ArrayList arrayList) {
        this.f11120b = str;
        this.f11119W = arrayList;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8670H8 = this.f11119W;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f11120b;
    }
}
