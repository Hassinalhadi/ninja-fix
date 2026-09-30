package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s8 {

    /* renamed from: W, reason: collision with root package name */
    public final long f11265W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11266b;

    /* renamed from: f9, reason: collision with root package name */
    public final long f11267f9;
    public final long sVU;

    public s8(String str, long j5, long j6, long j7) {
        this.f11266b = str;
        this.f11265W = j5;
        this.f11267f9 = j6;
        this.sVU = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        if (Intrinsics.areEqual(this.f11266b, s8Var.f11266b) && this.f11265W == s8Var.f11265W && this.f11267f9 == s8Var.f11267f9 && this.sVU == s8Var.sVU) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b2 = lci.b(this.f11267f9, lci.b(this.f11265W, this.f11266b.hashCode() * 31, 31), 31);
        long j5 = this.sVU;
        return ((int) (j5 ^ (j5 >>> 32))) + b2;
    }
}
