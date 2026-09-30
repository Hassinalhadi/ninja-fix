package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ipD {

    /* renamed from: J, reason: collision with root package name */
    public final Integer f10635J;
    public final Integer PqK;

    /* renamed from: V, reason: collision with root package name */
    public final Boolean f10636V;

    /* renamed from: W, reason: collision with root package name */
    public final String f10637W;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f10638b;

    /* renamed from: f9, reason: collision with root package name */
    public final Integer f10639f9;
    public final Boolean gmP;
    public final Long olU;
    public final String sVU;

    public ipD(Integer num, String str, Integer num2, String str2, Boolean bool, Integer num3, Integer num4, Boolean bool2, Long l10) {
        this.f10638b = num;
        this.f10637W = str;
        this.f10639f9 = num2;
        this.sVU = str2;
        this.gmP = bool;
        this.f10635J = num3;
        this.PqK = num4;
        this.f10636V = bool2;
        this.olU = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipD)) {
            return false;
        }
        ipD ipd = (ipD) obj;
        if (Intrinsics.areEqual(this.f10638b, ipd.f10638b) && Intrinsics.areEqual(this.f10637W, ipd.f10637W) && Intrinsics.areEqual(this.f10639f9, ipd.f10639f9) && Intrinsics.areEqual(this.sVU, ipd.sVU) && Intrinsics.areEqual(this.gmP, ipd.gmP) && Intrinsics.areEqual(this.f10635J, ipd.f10635J) && Intrinsics.areEqual(this.PqK, ipd.PqK) && Intrinsics.areEqual(this.f10636V, ipd.f10636V) && Intrinsics.areEqual(this.olU, ipd.olU)) {
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
        Integer num = this.f10638b;
        int i4 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i5 = hashCode * 31;
        String str = this.f10637W;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Integer num2 = this.f10639f9;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.sVU;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Boolean bool = this.gmP;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Integer num3 = this.f10635J;
        if (num3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num3.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        Integer num4 = this.PqK;
        if (num4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num4.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Boolean bool2 = this.f10636V;
        if (bool2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool2.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        Long l10 = this.olU;
        if (l10 != null) {
            i4 = l10.hashCode();
        }
        return i16 + i4;
    }
}
