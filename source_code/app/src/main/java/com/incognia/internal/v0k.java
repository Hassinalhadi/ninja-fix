package com.incognia.internal;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v0k {
    public final Boolean DOu;

    /* renamed from: E, reason: collision with root package name */
    public final String f11517E;
    public final Long FL;
    public final Set IB;

    /* renamed from: J, reason: collision with root package name */
    public final Boolean f11518J;

    /* renamed from: L, reason: collision with root package name */
    public final Integer f11519L;

    /* renamed from: P, reason: collision with root package name */
    public final Integer f11520P;
    public final Boolean PqK;
    public final Integer Qs;

    /* renamed from: R, reason: collision with root package name */
    public final Boolean f11521R;

    /* renamed from: V, reason: collision with root package name */
    public final Boolean f11522V;

    /* renamed from: W, reason: collision with root package name */
    public final String f11523W;

    /* renamed from: Y, reason: collision with root package name */
    public final Integer f11524Y;

    /* renamed from: ar, reason: collision with root package name */
    public final String f11525ar;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f11526b;

    /* renamed from: f9, reason: collision with root package name */
    public final Boolean f11527f9;
    public final Boolean gmP;

    /* renamed from: n9, reason: collision with root package name */
    public final String f11528n9;
    public final Boolean olU;
    public final Boolean sVU;

    public v0k(Integer num, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Set set, Integer num2, String str2, String str3, Integer num3, Integer num4, Integer num5, Long l10, String str4) {
        this.f11526b = num;
        this.f11523W = str;
        this.f11527f9 = bool;
        this.sVU = bool2;
        this.gmP = bool3;
        this.f11518J = bool4;
        this.PqK = bool5;
        this.f11522V = bool6;
        this.olU = bool7;
        this.f11521R = bool8;
        this.DOu = bool9;
        this.IB = set;
        this.Qs = num2;
        this.f11517E = str2;
        this.f11528n9 = str3;
        this.f11524Y = num3;
        this.f11520P = num4;
        this.f11519L = num5;
        this.FL = l10;
        this.f11525ar = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0k)) {
            return false;
        }
        v0k v0kVar = (v0k) obj;
        if (Intrinsics.areEqual(this.f11526b, v0kVar.f11526b) && Intrinsics.areEqual(this.f11523W, v0kVar.f11523W) && Intrinsics.areEqual(this.f11527f9, v0kVar.f11527f9) && Intrinsics.areEqual(this.sVU, v0kVar.sVU) && Intrinsics.areEqual(this.gmP, v0kVar.gmP) && Intrinsics.areEqual(this.f11518J, v0kVar.f11518J) && Intrinsics.areEqual(this.PqK, v0kVar.PqK) && Intrinsics.areEqual(this.f11522V, v0kVar.f11522V) && Intrinsics.areEqual(this.olU, v0kVar.olU) && Intrinsics.areEqual(this.f11521R, v0kVar.f11521R) && Intrinsics.areEqual(this.DOu, v0kVar.DOu) && Intrinsics.areEqual(this.IB, v0kVar.IB) && Intrinsics.areEqual(this.Qs, v0kVar.Qs) && Intrinsics.areEqual(this.f11517E, v0kVar.f11517E) && Intrinsics.areEqual(this.f11528n9, v0kVar.f11528n9) && Intrinsics.areEqual(this.f11524Y, v0kVar.f11524Y) && Intrinsics.areEqual(this.f11520P, v0kVar.f11520P) && Intrinsics.areEqual(this.f11519L, v0kVar.f11519L) && Intrinsics.areEqual(this.FL, v0kVar.FL) && Intrinsics.areEqual(this.f11525ar, v0kVar.f11525ar)) {
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
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        Integer num = this.f11526b;
        int i4 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i5 = hashCode * 31;
        String str = this.f11523W;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Boolean bool = this.f11527f9;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Boolean bool2 = this.sVU;
        if (bool2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Boolean bool3 = this.gmP;
        if (bool3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool3.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Boolean bool4 = this.f11518J;
        if (bool4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool4.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        Boolean bool5 = this.PqK;
        if (bool5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool5.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Boolean bool6 = this.f11522V;
        if (bool6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool6.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        Boolean bool7 = this.olU;
        if (bool7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = bool7.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        Boolean bool8 = this.f11521R;
        if (bool8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = bool8.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        Boolean bool9 = this.DOu;
        if (bool9 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool9.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        Set set = this.IB;
        if (set == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = set.hashCode();
        }
        int i20 = (i19 + hashCode12) * 31;
        Integer num2 = this.Qs;
        if (num2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num2.hashCode();
        }
        int i21 = (i20 + hashCode13) * 31;
        String str2 = this.f11517E;
        if (str2 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str2.hashCode();
        }
        int i22 = (i21 + hashCode14) * 31;
        String str3 = this.f11528n9;
        if (str3 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str3.hashCode();
        }
        int i23 = (i22 + hashCode15) * 31;
        Integer num3 = this.f11524Y;
        if (num3 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num3.hashCode();
        }
        int i24 = (i23 + hashCode16) * 31;
        Integer num4 = this.f11520P;
        if (num4 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = num4.hashCode();
        }
        int i25 = (i24 + hashCode17) * 31;
        Integer num5 = this.f11519L;
        if (num5 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = num5.hashCode();
        }
        int i26 = (i25 + hashCode18) * 31;
        Long l10 = this.FL;
        if (l10 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = l10.hashCode();
        }
        int i27 = (i26 + hashCode19) * 31;
        String str4 = this.f11525ar;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i27 + i4;
    }
}
