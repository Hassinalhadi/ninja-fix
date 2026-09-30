package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class G4 {
    public final Boolean DOu;
    public final Boolean IB;

    /* renamed from: J, reason: collision with root package name */
    public final ArrayList f8748J;
    public final Integer PqK;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f8749R;

    /* renamed from: V, reason: collision with root package name */
    public final String f8750V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f8751W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8752b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f8753f9;
    public final String gmP;
    public final String olU;
    public final s1p sVU;

    public G4(String str, ArrayList arrayList, String str2, s1p s1pVar, String str3, ArrayList arrayList2, Integer num, String str4, String str5, ArrayList arrayList3, Boolean bool, Boolean bool2) {
        this.f8752b = str;
        this.f8751W = arrayList;
        this.f8753f9 = str2;
        this.sVU = s1pVar;
        this.gmP = str3;
        this.f8748J = arrayList2;
        this.PqK = num;
        this.f8750V = str4;
        this.olU = str5;
        this.f8749R = arrayList3;
        this.DOu = bool;
        this.IB = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G4)) {
            return false;
        }
        G4 g42 = (G4) obj;
        if (Intrinsics.areEqual(this.f8752b, g42.f8752b) && Intrinsics.areEqual(this.f8751W, g42.f8751W) && Intrinsics.areEqual(this.f8753f9, g42.f8753f9) && Intrinsics.areEqual(this.sVU, g42.sVU) && Intrinsics.areEqual(this.gmP, g42.gmP) && Intrinsics.areEqual(this.f8748J, g42.f8748J) && Intrinsics.areEqual(this.PqK, g42.PqK) && Intrinsics.areEqual(this.f8750V, g42.f8750V) && Intrinsics.areEqual(this.olU, g42.olU) && Intrinsics.areEqual(this.f8749R, g42.f8749R) && Intrinsics.areEqual(this.DOu, g42.DOu) && Intrinsics.areEqual(this.IB, g42.IB)) {
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
        String str = this.f8752b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode9 = (this.f8751W.hashCode() + (hashCode * 31)) * 31;
        String str2 = this.f8753f9;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (hashCode9 + hashCode2) * 31;
        s1p s1pVar = this.sVU;
        if (s1pVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = s1pVar.hashCode();
        }
        int i10 = (i5 + hashCode3) * 31;
        String str3 = this.gmP;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int hashCode10 = (this.f8748J.hashCode() + ((i10 + hashCode4) * 31)) * 31;
        Integer num = this.PqK;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i11 = (hashCode10 + hashCode5) * 31;
        String str4 = this.f8750V;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i12 = (i11 + hashCode6) * 31;
        String str5 = this.olU;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int hashCode11 = (this.f8749R.hashCode() + ((i12 + hashCode7) * 31)) * 31;
        Boolean bool = this.DOu;
        if (bool == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool.hashCode();
        }
        int i13 = (hashCode11 + hashCode8) * 31;
        Boolean bool2 = this.IB;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        }
        return i13 + i4;
    }
}
