package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class uR2 {

    /* renamed from: W, reason: collision with root package name */
    public final long f11467W;

    /* renamed from: b, reason: collision with root package name */
    public final long f11468b;

    /* renamed from: f9, reason: collision with root package name */
    public final qWe f11469f9;

    public uR2(long j5, long j6, qWe qwe) {
        this.f11468b = j5;
        this.f11467W = j6;
        this.f11469f9 = qwe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uR2)) {
            return false;
        }
        uR2 ur2 = (uR2) obj;
        if (this.f11468b == ur2.f11468b && this.f11467W == ur2.f11467W && Intrinsics.areEqual(this.f11469f9, ur2.f11469f9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j5 = this.f11468b;
        int b2 = lci.b(this.f11467W, ((int) (j5 ^ (j5 >>> 32))) * 31, 31);
        qWe qwe = this.f11469f9;
        if (qwe == null) {
            hashCode = 0;
        } else {
            hashCode = qwe.hashCode();
        }
        return b2 + hashCode;
    }
}
