package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class P3H {
    public final String DOu;

    /* renamed from: J, reason: collision with root package name */
    public final String f9377J;
    public final String PqK;

    /* renamed from: R, reason: collision with root package name */
    public final long f9378R;

    /* renamed from: V, reason: collision with root package name */
    public final int f9379V;

    /* renamed from: W, reason: collision with root package name */
    public final Boolean f9380W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9381b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f9382f9;
    public final String gmP;
    public final String olU;
    public final String sVU;

    public P3H(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, int i4, String str7, long j5, String str8) {
        this.f9381b = str;
        this.f9380W = bool;
        this.f9382f9 = str2;
        this.sVU = str3;
        this.gmP = str4;
        this.f9377J = str5;
        this.PqK = str6;
        this.f9379V = i4;
        this.olU = str7;
        this.f9378R = j5;
        this.DOu = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P3H)) {
            return false;
        }
        P3H p3h = (P3H) obj;
        if (Intrinsics.areEqual(this.f9381b, p3h.f9381b) && Intrinsics.areEqual(this.f9380W, p3h.f9380W) && Intrinsics.areEqual(this.f9382f9, p3h.f9382f9) && Intrinsics.areEqual(this.sVU, p3h.sVU) && Intrinsics.areEqual(this.gmP, p3h.gmP) && Intrinsics.areEqual(this.f9377J, p3h.f9377J) && Intrinsics.areEqual(this.PqK, p3h.PqK) && this.f9379V == p3h.f9379V && Intrinsics.areEqual(this.olU, p3h.olU) && this.f9378R == p3h.f9378R && Intrinsics.areEqual(this.DOu, p3h.DOu)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f9381b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        Boolean bool = this.f9380W;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str2 = this.f9382f9;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int b2 = VpS.b(this.sVU, (i10 + hashCode3) * 31, 31);
        String str3 = this.gmP;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i11 = (b2 + hashCode4) * 31;
        String str4 = this.f9377J;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return ((int) 1776277728821L) + VpS.b(this.DOu, lci.b(this.f9378R, ZnG.b(70901, VpS.b(this.olU, ZnG.b(this.f9379V, VpS.b(this.PqK, (i11 + i4) * 31, 31), 31), 31), 31), 31), 31);
    }
}
