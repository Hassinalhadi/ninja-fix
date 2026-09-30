package com.incognia.internal;

/* loaded from: classes2.dex */
public final class qfn {

    /* renamed from: W, reason: collision with root package name */
    public final boolean f11161W;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11162b;

    public qfn(boolean z2, boolean z10) {
        this.f11162b = z2;
        this.f11161W = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfn)) {
            return false;
        }
        qfn qfnVar = (qfn) obj;
        if (this.f11162b == qfnVar.f11162b && this.f11161W == qfnVar.f11161W) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z2 = this.f11162b;
        int i4 = 1;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i5 = r02 * 31;
        boolean z10 = this.f11161W;
        if (!z10) {
            i4 = z10 ? 1 : 0;
        }
        return i5 + i4;
    }
}
