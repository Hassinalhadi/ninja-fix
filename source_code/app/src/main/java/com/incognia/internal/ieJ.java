package com.incognia.internal;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ieJ implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f10628W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10629b;

    public ieJ(String str, ArrayList arrayList) {
        this.f10629b = str;
        this.f10628W = arrayList;
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f10629b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        fm4.f8690k = this.f10628W;
    }
}
