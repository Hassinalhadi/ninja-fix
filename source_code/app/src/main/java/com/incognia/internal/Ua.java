package com.incognia.internal;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Ua implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f9717W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9718b;

    public Ua(String str, ArrayList arrayList) {
        this.f9718b = str;
        this.f9717W = arrayList;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9718b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.iMc = this.f9717W;
    }
}
