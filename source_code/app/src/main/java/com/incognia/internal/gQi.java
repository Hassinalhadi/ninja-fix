package com.incognia.internal;

/* loaded from: classes2.dex */
public final class gQi {

    /* renamed from: W, reason: collision with root package name */
    public final boolean f10478W;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10479b;

    public gQi(boolean z2, boolean z10) {
        this.f10479b = z2;
        this.f10478W = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gQi)) {
            return false;
        }
        gQi gqi = (gQi) obj;
        if (this.f10479b == gqi.f10479b && this.f10478W == gqi.f10478W) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z2 = this.f10479b;
        int i4 = 1;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i5 = r02 * 31;
        boolean z10 = this.f10478W;
        if (!z10) {
            i4 = z10 ? 1 : 0;
        }
        return i5 + i4;
    }
}
