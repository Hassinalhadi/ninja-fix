package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class K0 {

    /* renamed from: J, reason: collision with root package name */
    public final Long f8978J;
    public final Long PqK;

    /* renamed from: W, reason: collision with root package name */
    public final Boolean f8979W;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8980b;

    /* renamed from: f9, reason: collision with root package name */
    public final Long f8981f9;
    public final Boolean gmP;
    public final Long sVU;

    public K0(boolean z2, Boolean bool, Long l10, Long l11, Boolean bool2, Long l12, Long l13) {
        this.f8980b = z2;
        this.f8979W = bool;
        this.f8981f9 = l10;
        this.sVU = l11;
        this.gmP = bool2;
        this.f8978J = l12;
        this.PqK = l13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        if (this.f8980b == k02.f8980b && Intrinsics.areEqual(this.f8979W, k02.f8979W) && Intrinsics.areEqual(this.f8981f9, k02.f8981f9) && Intrinsics.areEqual(this.sVU, k02.sVU) && Intrinsics.areEqual(this.gmP, k02.gmP) && Intrinsics.areEqual(this.f8978J, k02.f8978J) && Intrinsics.areEqual(this.PqK, k02.PqK)) {
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
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        boolean z2 = this.f8980b;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        Boolean bool = this.f8979W;
        int i5 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i10 = (i4 + hashCode) * 31;
        Long l10 = this.f8981f9;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Long l11 = this.sVU;
        if (l11 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l11.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Boolean bool2 = this.gmP;
        if (bool2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Long l12 = this.f8978J;
        if (l12 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l12.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        Long l13 = this.PqK;
        if (l13 != null) {
            i5 = l13.hashCode();
        }
        return i14 + i5;
    }
}
