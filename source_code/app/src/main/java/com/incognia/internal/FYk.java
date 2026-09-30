package com.incognia.internal;

/* loaded from: classes2.dex */
public final class FYk {

    /* renamed from: W, reason: collision with root package name */
    public final boolean f8711W;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8712b;

    /* renamed from: f9, reason: collision with root package name */
    public final boolean f8713f9;

    public FYk(boolean z2, boolean z10, boolean z11) {
        this.f8712b = z2;
        this.f8711W = z10;
        this.f8713f9 = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FYk)) {
            return false;
        }
        FYk fYk = (FYk) obj;
        if (this.f8712b == fYk.f8712b && this.f8711W == fYk.f8711W && this.f8713f9 == fYk.f8713f9) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public final int hashCode() {
        boolean z2 = this.f8712b;
        int i4 = 1;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i5 = r02 * 31;
        ?? r22 = this.f8711W;
        int i10 = r22;
        if (r22 != 0) {
            i10 = 1;
        }
        int i11 = (i5 + i10) * 31;
        boolean z10 = this.f8713f9;
        if (!z10) {
            i4 = z10 ? 1 : 0;
        }
        return i11 + i4;
    }
}
