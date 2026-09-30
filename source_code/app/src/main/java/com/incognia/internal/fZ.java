package com.incognia.internal;

/* loaded from: classes2.dex */
public final class fZ {

    /* renamed from: W, reason: collision with root package name */
    public final int f10426W;

    /* renamed from: b, reason: collision with root package name */
    public final int f10427b;

    public fZ(int i4, int i5) {
        this.f10427b = i4;
        this.f10426W = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fZ)) {
            return false;
        }
        fZ fZVar = (fZ) obj;
        if (this.f10427b == fZVar.f10427b && this.f10426W == fZVar.f10426W) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10426W + (this.f10427b * 31);
    }
}
