package com.incognia.internal;

/* loaded from: classes2.dex */
public final class s0 {

    /* renamed from: W, reason: collision with root package name */
    public final long f11254W;

    /* renamed from: b, reason: collision with root package name */
    public final int f11255b;

    public s0(int i4, long j5) {
        this.f11255b = i4;
        this.f11254W = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f11255b == s0Var.f11255b && this.f11254W == s0Var.f11254W) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f11255b * 31;
        long j5 = this.f11254W;
        return ((int) (j5 ^ (j5 >>> 32))) + i4;
    }
}
