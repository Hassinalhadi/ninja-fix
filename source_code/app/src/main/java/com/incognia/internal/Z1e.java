package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Z1e {

    /* renamed from: W, reason: collision with root package name */
    public final long f10020W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10021b;

    public Z1e(String str, long j5) {
        this.f10021b = str;
        this.f10020W = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z1e)) {
            return false;
        }
        Z1e z1e = (Z1e) obj;
        if (Intrinsics.areEqual(this.f10021b, z1e.f10021b) && this.f10020W == z1e.f10020W) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10021b.hashCode() * 31;
        long j5 = this.f10020W;
        return ((int) (j5 ^ (j5 >>> 32))) + hashCode;
    }
}
