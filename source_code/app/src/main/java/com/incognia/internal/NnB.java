package com.incognia.internal;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class NnB {
    public final String DOu;
    public final String IB;

    /* renamed from: J, reason: collision with root package name */
    public final String f9254J;
    public final String PqK;
    public final Locale Qs;

    /* renamed from: R, reason: collision with root package name */
    public final String f9255R;

    /* renamed from: V, reason: collision with root package name */
    public final String f9256V;

    /* renamed from: W, reason: collision with root package name */
    public final Double f9257W;

    /* renamed from: b, reason: collision with root package name */
    public final Double f9258b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f9259f9;
    public final String gmP;
    public final String olU;
    public final String sVU;

    public NnB(Double d4, Double d9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Locale locale) {
        this.f9258b = d4;
        this.f9257W = d9;
        this.f9259f9 = str;
        this.sVU = str2;
        this.gmP = str3;
        this.f9254J = str4;
        this.PqK = str5;
        this.f9256V = str6;
        this.olU = str7;
        this.f9255R = str8;
        this.DOu = str9;
        this.IB = str10;
        this.Qs = locale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NnB)) {
            return false;
        }
        NnB nnB = (NnB) obj;
        if (Intrinsics.areEqual(this.f9258b, nnB.f9258b) && Intrinsics.areEqual(this.f9257W, nnB.f9257W) && Intrinsics.areEqual(this.f9259f9, nnB.f9259f9) && Intrinsics.areEqual(this.sVU, nnB.sVU) && Intrinsics.areEqual(this.gmP, nnB.gmP) && Intrinsics.areEqual(this.f9254J, nnB.f9254J) && Intrinsics.areEqual(this.PqK, nnB.PqK) && Intrinsics.areEqual(this.f9256V, nnB.f9256V) && Intrinsics.areEqual(this.olU, nnB.olU) && Intrinsics.areEqual(this.f9255R, nnB.f9255R) && Intrinsics.areEqual(this.DOu, nnB.DOu) && Intrinsics.areEqual(this.IB, nnB.IB) && Intrinsics.areEqual(this.Qs, nnB.Qs)) {
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
        Double d4 = this.f9258b;
        int i4 = 0;
        if (d4 == null) {
            hashCode = 0;
        } else {
            hashCode = d4.hashCode();
        }
        int i5 = hashCode * 31;
        Double d9 = this.f9257W;
        if (d9 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d9.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str = this.f9259f9;
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
        String str4 = this.f9254J;
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
        String str6 = this.f9256V;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str7 = this.olU;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        String str8 = this.f9255R;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        String str9 = this.DOu;
        if (str9 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str9.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        String str10 = this.IB;
        if (str10 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str10.hashCode();
        }
        int i20 = (i19 + hashCode12) * 31;
        Locale locale = this.Qs;
        if (locale != null) {
            i4 = locale.hashCode();
        }
        return i20 + i4;
    }
}
