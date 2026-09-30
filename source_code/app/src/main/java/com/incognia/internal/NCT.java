package com.incognia.internal;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class NCT implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f9190W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9191b;

    public NCT(String str, ArrayList arrayList) {
        this.f9191b = str;
        this.f9190W = arrayList;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f9191b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8668G = this.f9190W;
    }
}
