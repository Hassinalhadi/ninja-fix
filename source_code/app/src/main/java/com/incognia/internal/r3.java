package com.incognia.internal;

import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r3 {
    public final String DOu;

    /* renamed from: E, reason: collision with root package name */
    public final Integer f11192E;
    public final Bundle IB;

    /* renamed from: J, reason: collision with root package name */
    public final List f11193J;

    /* renamed from: L, reason: collision with root package name */
    public final String f11194L;

    /* renamed from: P, reason: collision with root package name */
    public final String f11195P;
    public final List PqK;
    public final String Qs;

    /* renamed from: R, reason: collision with root package name */
    public final String f11196R;

    /* renamed from: V, reason: collision with root package name */
    public final List f11197V;

    /* renamed from: W, reason: collision with root package name */
    public final long f11198W;

    /* renamed from: Y, reason: collision with root package name */
    public final List f11199Y;

    /* renamed from: b, reason: collision with root package name */
    public final long f11200b;

    /* renamed from: f9, reason: collision with root package name */
    public final long f11201f9;
    public final List gmP;

    /* renamed from: n9, reason: collision with root package name */
    public final String f11202n9;
    public final Integer olU;
    public final boolean sVU;

    public r3(long j5, long j6, long j7, boolean z2, List list, List list2, List list3, List list4, Integer num, String str, String str2, Bundle bundle, String str3, Integer num2, String str4, List list5, String str5, String str6) {
        this.f11200b = j5;
        this.f11198W = j6;
        this.f11201f9 = j7;
        this.sVU = z2;
        this.gmP = list;
        this.f11193J = list2;
        this.PqK = list3;
        this.f11197V = list4;
        this.olU = num;
        this.f11196R = str;
        this.DOu = str2;
        this.IB = bundle;
        this.Qs = str3;
        this.f11192E = num2;
        this.f11202n9 = str4;
        this.f11199Y = list5;
        this.f11195P = str5;
        this.f11194L = str6;
    }

    public final boolean b() {
        List list;
        int foregroundServiceType;
        if (Build.VERSION.SDK_INT >= 29 && (list = this.gmP) != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                foregroundServiceType = ((ServiceInfo) it.next()).getForegroundServiceType();
                if (foregroundServiceType == 32) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        if (this.f11200b == r3Var.f11200b && this.f11198W == r3Var.f11198W && this.f11201f9 == r3Var.f11201f9 && this.sVU == r3Var.sVU && Intrinsics.areEqual(this.gmP, r3Var.gmP) && Intrinsics.areEqual(this.f11193J, r3Var.f11193J) && Intrinsics.areEqual(this.PqK, r3Var.PqK) && Intrinsics.areEqual(this.f11197V, r3Var.f11197V) && Intrinsics.areEqual(this.olU, r3Var.olU) && Intrinsics.areEqual(this.f11196R, r3Var.f11196R) && Intrinsics.areEqual(this.DOu, r3Var.DOu) && Intrinsics.areEqual(this.IB, r3Var.IB) && Intrinsics.areEqual(this.Qs, r3Var.Qs) && Intrinsics.areEqual(this.f11192E, r3Var.f11192E) && Intrinsics.areEqual(this.f11202n9, r3Var.f11202n9) && Intrinsics.areEqual(this.f11199Y, r3Var.f11199Y) && Intrinsics.areEqual(this.f11195P, r3Var.f11195P) && Intrinsics.areEqual(this.f11194L, r3Var.f11194L)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        long j5 = this.f11200b;
        int b2 = lci.b(this.f11201f9, lci.b(this.f11198W, ((int) (j5 ^ (j5 >>> 32))) * 31, 31), 31);
        boolean z2 = this.sVU;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (b2 + i4) * 31;
        List list = this.gmP;
        int i10 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (i5 + hashCode) * 31;
        List list2 = this.f11193J;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        List list3 = this.PqK;
        if (list3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        List list4 = this.f11197V;
        if (list4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Integer num = this.olU;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str = this.f11196R;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str2 = this.DOu;
        if (str2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str2.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        Bundle bundle = this.IB;
        if (bundle == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bundle.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str3 = this.Qs;
        if (str3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str3.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        Integer num2 = this.f11192E;
        if (num2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num2.hashCode();
        }
        int i20 = (i19 + hashCode10) * 31;
        String str4 = this.f11202n9;
        if (str4 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str4.hashCode();
        }
        int i21 = (i20 + hashCode11) * 31;
        List list5 = this.f11199Y;
        if (list5 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = list5.hashCode();
        }
        int i22 = (i21 + hashCode12) * 31;
        String str5 = this.f11195P;
        if (str5 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str5.hashCode();
        }
        int i23 = (i22 + hashCode13) * 31;
        String str6 = this.f11194L;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return i23 + i10;
    }
}
