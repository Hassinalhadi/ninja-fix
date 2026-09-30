package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: J, reason: collision with root package name */
    public final String f8506J;
    public final String PqK;

    /* renamed from: V, reason: collision with root package name */
    public final String f8507V;

    /* renamed from: W, reason: collision with root package name */
    public final long f8508W;

    /* renamed from: b, reason: collision with root package name */
    public final long f8509b;

    /* renamed from: f9, reason: collision with root package name */
    public final long f8510f9;
    public final String gmP;
    public final String olU;
    public final String sVU;

    public D(long j5, long j6, long j7, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f8509b = j5;
        this.f8508W = j6;
        this.f8510f9 = j7;
        this.sVU = str;
        this.gmP = str2;
        this.f8506J = str3;
        this.PqK = str4;
        this.f8507V = str5;
        this.olU = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        if (this.f8509b == d4.f8509b && this.f8508W == d4.f8508W && this.f8510f9 == d4.f8510f9 && Intrinsics.areEqual(this.sVU, d4.sVU) && Intrinsics.areEqual(this.gmP, d4.gmP) && Intrinsics.areEqual(this.f8506J, d4.f8506J) && Intrinsics.areEqual(this.PqK, d4.PqK) && Intrinsics.areEqual(this.f8507V, d4.f8507V) && Intrinsics.areEqual(this.olU, d4.olU)) {
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
        long j5 = this.f8509b;
        int b2 = lci.b(this.f8510f9, lci.b(this.f8508W, ((int) (j5 ^ (j5 >>> 32))) * 31, 31), 31);
        String str = this.sVU;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (b2 + hashCode) * 31;
        String str2 = this.gmP;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str3 = this.f8506J;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.PqK;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f8507V;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.olU;
        if (str6 != null) {
            i4 = str6.hashCode();
        }
        return i13 + i4;
    }
}
