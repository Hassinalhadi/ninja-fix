package com.incognia.internal;

import ao.ad;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class BGx {
    public final Float DOu;

    /* renamed from: E, reason: collision with root package name */
    public final String f8404E;
    public final String IB;

    /* renamed from: J, reason: collision with root package name */
    public final Double f8405J;
    public final Float PqK;
    public final Boolean Qs;

    /* renamed from: R, reason: collision with root package name */
    public final Float f8406R;

    /* renamed from: V, reason: collision with root package name */
    public final Float f8407V;

    /* renamed from: W, reason: collision with root package name */
    public final double f8408W;

    /* renamed from: b, reason: collision with root package name */
    public final double f8409b;

    /* renamed from: f9, reason: collision with root package name */
    public final float f8410f9;
    public final boolean gmP;

    /* renamed from: n9, reason: collision with root package name */
    public final Integer f8411n9;
    public final Float olU;
    public final long sVU;

    public BGx(double d4, double d9, float f5, long j5, boolean z2, Double d10, Float f10, Float f11, Float f12, Float f13, Float f14, String str, Boolean bool, String str2, Integer num) {
        this.f8409b = d4;
        this.f8408W = d9;
        this.f8410f9 = f5;
        this.sVU = j5;
        this.gmP = z2;
        this.f8405J = d10;
        this.PqK = f10;
        this.f8407V = f11;
        this.olU = f12;
        this.f8406R = f13;
        this.DOu = f14;
        this.IB = str;
        this.Qs = bool;
        this.f8404E = str2;
        this.f8411n9 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BGx)) {
            return false;
        }
        BGx bGx = (BGx) obj;
        if (Double.compare(this.f8409b, bGx.f8409b) == 0 && Double.compare(this.f8408W, bGx.f8408W) == 0 && Float.compare(this.f8410f9, bGx.f8410f9) == 0 && this.sVU == bGx.sVU && this.gmP == bGx.gmP && Intrinsics.areEqual(this.f8405J, bGx.f8405J) && Intrinsics.areEqual(this.PqK, bGx.PqK) && Intrinsics.areEqual(this.f8407V, bGx.f8407V) && Intrinsics.areEqual(this.olU, bGx.olU) && Intrinsics.areEqual(this.f8406R, bGx.f8406R) && Intrinsics.areEqual(this.DOu, bGx.DOu) && Intrinsics.areEqual(this.IB, bGx.IB) && Intrinsics.areEqual(this.Qs, bGx.Qs) && Intrinsics.areEqual(this.f8404E, bGx.f8404E) && Intrinsics.areEqual(this.f8411n9, bGx.f8411n9)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        long doubleToLongBits = Double.doubleToLongBits(this.f8409b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f8408W);
        int b2 = lci.b(this.sVU, ad.sierra(this.f8410f9, (((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32))) + (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31)) * 31, 31), 31);
        boolean z2 = this.gmP;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (b2 + i4) * 31;
        Double d4 = this.f8405J;
        int i10 = 0;
        if (d4 == null) {
            hashCode = 0;
        } else {
            hashCode = d4.hashCode();
        }
        int i11 = (i5 + hashCode) * 31;
        Float f5 = this.PqK;
        if (f5 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f5.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Float f10 = this.f8407V;
        if (f10 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = f10.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Float f11 = this.olU;
        if (f11 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = f11.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Float f12 = this.f8406R;
        if (f12 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = f12.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Float f13 = this.DOu;
        if (f13 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = f13.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str = this.IB;
        if (str == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        Boolean bool = this.Qs;
        if (bool == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str2 = this.f8404E;
        if (str2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str2.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        Integer num = this.f8411n9;
        if (num != null) {
            i10 = num.hashCode();
        }
        return i19 + i10;
    }
}
