package com.incognia.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ECc {

    /* renamed from: J, reason: collision with root package name */
    public final String f8589J;
    public final RuF PqK;

    /* renamed from: V, reason: collision with root package name */
    public final List f8590V;

    /* renamed from: W, reason: collision with root package name */
    public final Integer f8591W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8592b;

    /* renamed from: f9, reason: collision with root package name */
    public final Boolean f8593f9;
    public final String gmP;
    public final zJO olU;
    public final Long sVU;

    public ECc(String str, Integer num, Boolean bool, Long l10, String str2, String str3, RuF ruF, List list, zJO zjo) {
        this.f8592b = str;
        this.f8591W = num;
        this.f8593f9 = bool;
        this.sVU = l10;
        this.gmP = str2;
        this.f8589J = str3;
        this.PqK = ruF;
        this.f8590V = list;
        this.olU = zjo;
    }

    public final boolean b() {
        String str = this.f8592b;
        if (str == null || str.length() == 0) {
            String str2 = this.f8589J;
            if ((str2 == null || str2.length() == 0) && this.sVU == null && this.f8591W == null && this.f8593f9 == null && this.gmP == null && this.PqK == null && this.f8590V == null && this.olU == null) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECc)) {
            return false;
        }
        ECc eCc = (ECc) obj;
        if (Intrinsics.areEqual(this.f8592b, eCc.f8592b) && Intrinsics.areEqual(this.f8591W, eCc.f8591W) && Intrinsics.areEqual(this.f8593f9, eCc.f8593f9) && Intrinsics.areEqual(this.sVU, eCc.sVU) && Intrinsics.areEqual(this.gmP, eCc.gmP) && Intrinsics.areEqual(this.f8589J, eCc.f8589J) && Intrinsics.areEqual(this.PqK, eCc.PqK) && Intrinsics.areEqual(this.f8590V, eCc.f8590V) && Intrinsics.areEqual(this.olU, eCc.olU)) {
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
        String str = this.f8592b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        Integer num = this.f8591W;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Boolean bool = this.f8593f9;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Long l10 = this.sVU;
        if (l10 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l10.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str2 = this.gmP;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str3 = this.f8589J;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        RuF ruF = this.PqK;
        if (ruF == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = ruF.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        List list = this.f8590V;
        if (list == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        zJO zjo = this.olU;
        if (zjo != null) {
            i4 = zjo.hashCode();
        }
        return i16 + i4;
    }
}
