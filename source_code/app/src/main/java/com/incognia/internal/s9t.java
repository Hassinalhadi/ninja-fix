package com.incognia.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s9t {
    public final List DOu;

    /* renamed from: E, reason: collision with root package name */
    public final Long f11269E;
    public final Long IB;

    /* renamed from: J, reason: collision with root package name */
    public final String f11270J;
    public final String PqK;
    public final Long Qs;

    /* renamed from: R, reason: collision with root package name */
    public final Long f11271R;

    /* renamed from: V, reason: collision with root package name */
    public final Long f11272V;

    /* renamed from: W, reason: collision with root package name */
    public final Long f11273W;

    /* renamed from: b, reason: collision with root package name */
    public final Long f11274b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f11275f9;
    public final String gmP;
    public final Long olU;
    public final String sVU;

    public s9t(Long l10, Long l11, String str, String str2, String str3, String str4, String str5, Long l12, Long l13, Long l14, List list, Long l15, Long l16, Long l17) {
        this.f11274b = l10;
        this.f11273W = l11;
        this.f11275f9 = str;
        this.sVU = str2;
        this.gmP = str3;
        this.f11270J = str4;
        this.PqK = str5;
        this.f11272V = l12;
        this.olU = l13;
        this.f11271R = l14;
        this.DOu = list;
        this.IB = l15;
        this.Qs = l16;
        this.f11269E = l17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9t)) {
            return false;
        }
        s9t s9tVar = (s9t) obj;
        if (Intrinsics.areEqual(this.f11274b, s9tVar.f11274b) && Intrinsics.areEqual(this.f11273W, s9tVar.f11273W) && Intrinsics.areEqual(this.f11275f9, s9tVar.f11275f9) && Intrinsics.areEqual(this.sVU, s9tVar.sVU) && Intrinsics.areEqual(this.gmP, s9tVar.gmP) && Intrinsics.areEqual(this.f11270J, s9tVar.f11270J) && Intrinsics.areEqual(this.PqK, s9tVar.PqK) && Intrinsics.areEqual(this.f11272V, s9tVar.f11272V) && Intrinsics.areEqual(this.olU, s9tVar.olU) && Intrinsics.areEqual(this.f11271R, s9tVar.f11271R) && Intrinsics.areEqual(this.DOu, s9tVar.DOu) && Intrinsics.areEqual(this.IB, s9tVar.IB) && Intrinsics.areEqual(this.Qs, s9tVar.Qs) && Intrinsics.areEqual(this.f11269E, s9tVar.f11269E)) {
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
        Long l10 = this.f11274b;
        int i4 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i5 = hashCode * 31;
        Long l11 = this.f11273W;
        if (l11 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l11.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str = this.f11275f9;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.sVU;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str3 = this.gmP;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str4 = this.f11270J;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str5 = this.PqK;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Long l12 = this.f11272V;
        if (l12 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l12.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        Long l13 = this.olU;
        if (l13 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l13.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        Long l14 = this.f11271R;
        if (l14 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = l14.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        List list = this.DOu;
        if (list == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        Long l15 = this.IB;
        if (l15 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = l15.hashCode();
        }
        int i20 = (i19 + hashCode12) * 31;
        Long l16 = this.Qs;
        if (l16 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = l16.hashCode();
        }
        int i21 = (i20 + hashCode13) * 31;
        Long l17 = this.f11269E;
        if (l17 != null) {
            i4 = l17.hashCode();
        }
        return i21 + i4;
    }
}
