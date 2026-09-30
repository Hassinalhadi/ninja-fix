package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p8 {
    public final Boolean DOu;

    /* renamed from: J, reason: collision with root package name */
    public final Boolean f11048J;
    public final Boolean PqK;

    /* renamed from: R, reason: collision with root package name */
    public final Integer f11049R;

    /* renamed from: V, reason: collision with root package name */
    public final Boolean f11050V;

    /* renamed from: W, reason: collision with root package name */
    public final Boolean f11051W;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f11052b;

    /* renamed from: f9, reason: collision with root package name */
    public final Boolean f11053f9;
    public final Boolean gmP;
    public final Boolean olU;
    public final Boolean sVU;

    public p8(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num, Boolean bool10) {
        this.f11052b = bool;
        this.f11051W = bool2;
        this.f11053f9 = bool3;
        this.sVU = bool4;
        this.gmP = bool5;
        this.f11048J = bool6;
        this.PqK = bool7;
        this.f11050V = bool8;
        this.olU = bool9;
        this.f11049R = num;
        this.DOu = bool10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        if (Intrinsics.areEqual(this.f11052b, p8Var.f11052b) && Intrinsics.areEqual(this.f11051W, p8Var.f11051W) && Intrinsics.areEqual(this.f11053f9, p8Var.f11053f9) && Intrinsics.areEqual(this.sVU, p8Var.sVU) && Intrinsics.areEqual(this.gmP, p8Var.gmP) && Intrinsics.areEqual(this.f11048J, p8Var.f11048J) && Intrinsics.areEqual(this.PqK, p8Var.PqK) && Intrinsics.areEqual(this.f11050V, p8Var.f11050V) && Intrinsics.areEqual(this.olU, p8Var.olU) && Intrinsics.areEqual(this.f11049R, p8Var.f11049R) && Intrinsics.areEqual(this.DOu, p8Var.DOu)) {
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
        Boolean bool = this.f11052b;
        int i4 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i5 = hashCode * 31;
        Boolean bool2 = this.f11051W;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Boolean bool3 = this.f11053f9;
        if (bool3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Boolean bool4 = this.sVU;
        if (bool4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Boolean bool5 = this.gmP;
        if (bool5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Boolean bool6 = this.f11048J;
        if (bool6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        Boolean bool7 = this.PqK;
        if (bool7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Boolean bool8 = this.f11050V;
        if (bool8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool8.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        Boolean bool9 = this.olU;
        if (bool9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = bool9.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        Integer num = this.f11049R;
        if (num == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        Boolean bool10 = this.DOu;
        if (bool10 != null) {
            i4 = bool10.hashCode();
        }
        return i18 + i4;
    }
}
