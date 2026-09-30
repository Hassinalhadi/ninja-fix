package com.incognia.internal;

/* loaded from: classes2.dex */
public final class LA0 {

    /* renamed from: W, reason: collision with root package name */
    public final long f9050W;

    /* renamed from: b, reason: collision with root package name */
    public final long f9051b;

    public LA0(long j5, long j6) {
        this.f9051b = j5;
        this.f9050W = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LA0)) {
            return false;
        }
        LA0 la0 = (LA0) obj;
        if (this.f9051b == la0.f9051b && this.f9050W == la0.f9050W) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f9051b;
        int i4 = ((int) (j5 ^ (j5 >>> 32))) * 31;
        long j6 = this.f9050W;
        return ((int) ((j6 >>> 32) ^ j6)) + i4;
    }
}
