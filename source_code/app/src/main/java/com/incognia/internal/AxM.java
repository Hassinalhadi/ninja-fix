package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class AxM {

    /* renamed from: W, reason: collision with root package name */
    public final FYk f8392W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8393b;

    /* renamed from: f9, reason: collision with root package name */
    public final r4 f8394f9;
    public final O0s sVU;

    public AxM(G1 g12, FYk fYk, r4 r4Var) {
        String b2 = g12.b();
        O0s o0s = new O0s(g12);
        this.f8393b = b2;
        this.f8392W = fYk;
        this.f8394f9 = r4Var;
        this.sVU = o0s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AxM)) {
            return false;
        }
        AxM axM = (AxM) obj;
        if (Intrinsics.areEqual(this.f8393b, axM.f8393b) && Intrinsics.areEqual(this.f8392W, axM.f8392W) && Intrinsics.areEqual(this.f8394f9, axM.f8394f9) && Intrinsics.areEqual(this.sVU, axM.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.sVU.hashCode() + ((this.f8394f9.hashCode() + ((this.f8392W.hashCode() + (this.f8393b.hashCode() * 31)) * 31)) * 31);
    }
}
