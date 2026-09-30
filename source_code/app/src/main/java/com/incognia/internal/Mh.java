package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Mh {

    /* renamed from: J, reason: collision with root package name */
    public final int f9158J;
    public final double PqK;

    /* renamed from: R, reason: collision with root package name */
    public final Integer f9159R;

    /* renamed from: V, reason: collision with root package name */
    public final int f9160V;

    /* renamed from: W, reason: collision with root package name */
    public final boolean f9161W;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9162b;

    /* renamed from: f9, reason: collision with root package name */
    public final int f9163f9;
    public final int gmP;
    public final String olU;
    public final int sVU;

    public Mh(boolean z2, boolean z10, int i4, int i5, int i10, int i11, double d4, int i12, String str, Integer num) {
        this.f9162b = z2;
        this.f9161W = z10;
        this.f9163f9 = i4;
        this.sVU = i5;
        this.gmP = i10;
        this.f9158J = i11;
        this.PqK = d4;
        this.f9160V = i12;
        this.olU = str;
        this.f9159R = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mh)) {
            return false;
        }
        Mh mh = (Mh) obj;
        if (this.f9162b == mh.f9162b && this.f9161W == mh.f9161W && this.f9163f9 == mh.f9163f9 && this.sVU == mh.sVU && this.gmP == mh.gmP && this.f9158J == mh.f9158J && Double.compare(this.PqK, mh.PqK) == 0 && this.f9160V == mh.f9160V && Intrinsics.areEqual(this.olU, mh.olU) && Intrinsics.areEqual(this.f9159R, mh.f9159R)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public final int hashCode() {
        int hashCode;
        boolean z2 = this.f9162b;
        int i4 = 1;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i5 = r02 * 31;
        boolean z10 = this.f9161W;
        if (!z10) {
            i4 = z10 ? 1 : 0;
        }
        int b2 = ZnG.b(this.f9158J, ZnG.b(this.gmP, ZnG.b(this.sVU, ZnG.b(this.f9163f9, (i5 + i4) * 31, 31), 31), 31), 31);
        long doubleToLongBits = Double.doubleToLongBits(this.PqK);
        int b4 = ZnG.b(this.f9160V, (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + b2) * 31, 31);
        String str = this.olU;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (b4 + hashCode) * 31;
        Integer num = this.f9159R;
        if (num != null) {
            i10 = num.hashCode();
        }
        return i11 + i10;
    }
}
