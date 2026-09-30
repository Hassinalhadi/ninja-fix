package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rKz {
    public final String DOu;

    /* renamed from: J, reason: collision with root package name */
    public final String f11219J;
    public final String PqK;

    /* renamed from: R, reason: collision with root package name */
    public final String f11220R;

    /* renamed from: V, reason: collision with root package name */
    public final String f11221V;

    /* renamed from: W, reason: collision with root package name */
    public final String f11222W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11223b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f11224f9;
    public final String gmP;
    public final String olU;
    public final String sVU;

    public rKz(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f11223b = str;
        this.f11222W = str2;
        this.f11224f9 = str3;
        this.sVU = str4;
        this.gmP = str5;
        this.f11219J = str6;
        this.PqK = str7;
        this.f11221V = str8;
        this.olU = str9;
        this.f11220R = str10;
        this.DOu = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rKz)) {
            return false;
        }
        rKz rkz = (rKz) obj;
        if (Intrinsics.areEqual(this.f11223b, rkz.f11223b) && Intrinsics.areEqual(this.f11222W, rkz.f11222W) && Intrinsics.areEqual(this.f11224f9, rkz.f11224f9) && Intrinsics.areEqual(this.sVU, rkz.sVU) && Intrinsics.areEqual(this.gmP, rkz.gmP) && Intrinsics.areEqual(this.f11219J, rkz.f11219J) && Intrinsics.areEqual(this.PqK, rkz.PqK) && Intrinsics.areEqual(this.f11221V, rkz.f11221V) && Intrinsics.areEqual(this.olU, rkz.olU) && Intrinsics.areEqual(this.f11220R, rkz.f11220R) && Intrinsics.areEqual(this.DOu, rkz.DOu)) {
            return true;
        }
        return false;
    }

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
        int hashCode10;
        String str = this.f11223b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f11222W;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str3 = this.f11224f9;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.sVU;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.gmP;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f11219J;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.PqK;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str8 = this.f11221V;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str9 = this.olU;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        String str10 = this.f11220R;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        String str11 = this.DOu;
        if (str11 != null) {
            i4 = str11.hashCode();
        }
        return i18 + i4;
    }
}
