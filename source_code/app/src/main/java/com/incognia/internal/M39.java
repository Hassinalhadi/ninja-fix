package com.incognia.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class M39 {

    /* renamed from: W, reason: collision with root package name */
    public final int f9096W;

    /* renamed from: b, reason: collision with root package name */
    public final long f9097b;

    /* renamed from: f9, reason: collision with root package name */
    public final List f9098f9;

    public M39(int i4, long j5) {
        this.f9097b = j5;
        this.f9096W = i4;
        this.f9098f9 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M39)) {
            return false;
        }
        M39 m39 = (M39) obj;
        if (this.f9097b == m39.f9097b && this.f9096W == m39.f9096W && Intrinsics.areEqual(this.f9098f9, m39.f9098f9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j5 = this.f9097b;
        int b2 = ZnG.b(this.f9096W, ((int) (j5 ^ (j5 >>> 32))) * 31, 31);
        List list = this.f9098f9;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return b2 + hashCode;
    }

    public M39(long j5, int i4, List list) {
        this.f9097b = j5;
        this.f9096W = i4;
        this.f9098f9 = list;
    }
}
