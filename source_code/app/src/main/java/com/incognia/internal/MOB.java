package com.incognia.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class MOB {
    public final ipD DOu;

    /* renamed from: E, reason: collision with root package name */
    public final List f9118E;
    public final String IB;

    /* renamed from: J, reason: collision with root package name */
    public final Long f9119J;
    public final Long PqK;
    public final ArrayList Qs;

    /* renamed from: R, reason: collision with root package name */
    public final Long f9120R;

    /* renamed from: V, reason: collision with root package name */
    public final String f9121V;

    /* renamed from: W, reason: collision with root package name */
    public final String f9122W;

    /* renamed from: Y, reason: collision with root package name */
    public final Boolean f9123Y;

    /* renamed from: b, reason: collision with root package name */
    public final Long f9124b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f9125f9;
    public final Long gmP;

    /* renamed from: n9, reason: collision with root package name */
    public final Long f9126n9;
    public final ArrayList olU;
    public final String sVU;

    public MOB(Long l10, String str, String str2, String str3, Long l11, Long l12, Long l13, String str4, ArrayList arrayList, Long l14, ipD ipd, String str5, ArrayList arrayList2, List list, Long l15, Boolean bool) {
        this.f9124b = l10;
        this.f9122W = str;
        this.f9125f9 = str2;
        this.sVU = str3;
        this.gmP = l11;
        this.f9119J = l12;
        this.PqK = l13;
        this.f9121V = str4;
        this.olU = arrayList;
        this.f9120R = l14;
        this.DOu = ipd;
        this.IB = str5;
        this.Qs = arrayList2;
        this.f9118E = list;
        this.f9126n9 = l15;
        this.f9123Y = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MOB)) {
            return false;
        }
        MOB mob = (MOB) obj;
        if (Intrinsics.areEqual(this.f9124b, mob.f9124b) && Intrinsics.areEqual(this.f9122W, mob.f9122W) && Intrinsics.areEqual(this.f9125f9, mob.f9125f9) && Intrinsics.areEqual(this.sVU, mob.sVU) && Intrinsics.areEqual(this.gmP, mob.gmP) && Intrinsics.areEqual(this.f9119J, mob.f9119J) && Intrinsics.areEqual(this.PqK, mob.PqK) && Intrinsics.areEqual(this.f9121V, mob.f9121V) && Intrinsics.areEqual(this.olU, mob.olU) && Intrinsics.areEqual(this.f9120R, mob.f9120R) && Intrinsics.areEqual(this.DOu, mob.DOu) && Intrinsics.areEqual(this.IB, mob.IB) && Intrinsics.areEqual(this.Qs, mob.Qs) && Intrinsics.areEqual(this.f9118E, mob.f9118E) && Intrinsics.areEqual(this.f9126n9, mob.f9126n9) && Intrinsics.areEqual(this.f9123Y, mob.f9123Y)) {
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
        int hashCode7 = this.f9124b.hashCode() * 31;
        String str = this.f9122W;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (hashCode7 + hashCode) * 31;
        String str2 = this.f9125f9;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str3 = this.sVU;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode8 = (this.PqK.hashCode() + ((this.f9119J.hashCode() + ((this.gmP.hashCode() + ((i10 + hashCode3) * 31)) * 31)) * 31)) * 31;
        String str4 = this.f9121V;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int hashCode9 = (this.f9120R.hashCode() + ((this.olU.hashCode() + ((hashCode8 + hashCode4) * 31)) * 31)) * 31;
        ipD ipd = this.DOu;
        if (ipd == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = ipd.hashCode();
        }
        int i11 = (hashCode9 + hashCode5) * 31;
        String str5 = this.IB;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int hashCode10 = (this.Qs.hashCode() + ((i11 + hashCode6) * 31)) * 31;
        List list = this.f9118E;
        if (list != null) {
            i4 = list.hashCode();
        }
        return this.f9123Y.hashCode() + ((this.f9126n9.hashCode() + ((hashCode10 + i4) * 31)) * 31);
    }
}
