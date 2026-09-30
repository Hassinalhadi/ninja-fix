package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j1D {
    public final String DOu;

    /* renamed from: J, reason: collision with root package name */
    public final String f10647J;
    public final String PqK;

    /* renamed from: R, reason: collision with root package name */
    public final long f10648R;

    /* renamed from: V, reason: collision with root package name */
    public final String f10649V;

    /* renamed from: W, reason: collision with root package name */
    public final String f10650W;

    /* renamed from: b, reason: collision with root package name */
    public final long f10651b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f10652f9;
    public final String gmP;
    public final String olU;
    public final String sVU;

    public j1D(long j5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j6, String str9) {
        this.f10651b = j5;
        this.f10650W = str;
        this.f10652f9 = str2;
        this.sVU = str3;
        this.gmP = str4;
        this.f10647J = str5;
        this.PqK = str6;
        this.f10649V = str7;
        this.olU = str8;
        this.f10648R = j6;
        this.DOu = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1D)) {
            return false;
        }
        j1D j1d = (j1D) obj;
        if (this.f10651b == j1d.f10651b && Intrinsics.areEqual(this.f10650W, j1d.f10650W) && Intrinsics.areEqual(this.f10652f9, j1d.f10652f9) && Intrinsics.areEqual(this.sVU, j1d.sVU) && Intrinsics.areEqual(this.gmP, j1d.gmP) && Intrinsics.areEqual(this.f10647J, j1d.f10647J) && Intrinsics.areEqual(this.PqK, j1d.PqK) && Intrinsics.areEqual(this.f10649V, j1d.f10649V) && Intrinsics.areEqual(this.olU, j1d.olU) && this.f10648R == j1d.f10648R && Intrinsics.areEqual(this.DOu, j1d.DOu)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        long j5 = this.f10651b;
        int i4 = ((int) (j5 ^ (j5 >>> 32))) * 31;
        String str = this.f10650W;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (i4 + hashCode) * 31;
        String str2 = this.f10652f9;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int b2 = VpS.b(this.sVU, (i10 + hashCode2) * 31, 31);
        String str3 = this.gmP;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (b2 + hashCode3) * 31;
        String str4 = this.f10647J;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return ((int) 1776277728821L) + VpS.b(this.DOu, lci.b(this.f10648R, ZnG.b(70901, VpS.b(this.olU, VpS.b(this.f10649V, VpS.b(this.PqK, (i11 + i5) * 31, 31), 31), 31), 31), 31), 31);
    }
}
