package com.incognia.internal;

import com.google.android.material.datepicker.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qn2 {

    /* renamed from: J, reason: collision with root package name */
    public final String f11171J;
    public final List PqK;

    /* renamed from: V, reason: collision with root package name */
    public final Long f11172V;

    /* renamed from: W, reason: collision with root package name */
    public final String f11173W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11174b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f11175f9;
    public final Long gmP;
    public final Integer sVU;

    public qn2(String str, String str2, String str3, Integer num, Long l10, String str4, List list, Long l11) {
        this.f11174b = str;
        this.f11173W = str2;
        this.f11175f9 = str3;
        this.sVU = num;
        this.gmP = l10;
        this.f11171J = str4;
        this.PqK = list;
        this.f11172V = l11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn2)) {
            return false;
        }
        qn2 qn2Var = (qn2) obj;
        if (Intrinsics.areEqual(this.f11174b, qn2Var.f11174b) && Intrinsics.areEqual(this.f11173W, qn2Var.f11173W) && Intrinsics.areEqual(this.f11175f9, qn2Var.f11175f9) && Intrinsics.areEqual(this.sVU, qn2Var.sVU) && Intrinsics.areEqual(this.gmP, qn2Var.gmP) && Intrinsics.areEqual(this.f11171J, qn2Var.f11171J) && Intrinsics.areEqual(this.PqK, qn2Var.PqK) && Intrinsics.areEqual(this.f11172V, qn2Var.f11172V)) {
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
        String str = this.f11174b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f11173W;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str3 = this.f11175f9;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Integer num = this.sVU;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int hashCode6 = (this.gmP.hashCode() + ((i11 + hashCode4) * 31)) * 31;
        String str4 = this.f11171J;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int golf = j.golf((((hashCode6 + hashCode5) * 31) + 1) * 31, 31, this.PqK);
        Long l10 = this.f11172V;
        if (l10 != null) {
            i4 = l10.hashCode();
        }
        return golf + i4;
    }
}
