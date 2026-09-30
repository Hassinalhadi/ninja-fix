package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dz {

    /* renamed from: J, reason: collision with root package name */
    public final String f10341J;
    public final String PqK;

    /* renamed from: R, reason: collision with root package name */
    public final Uxa f10342R;

    /* renamed from: V, reason: collision with root package name */
    public final Boolean f10343V;

    /* renamed from: W, reason: collision with root package name */
    public final long f10344W;

    /* renamed from: b, reason: collision with root package name */
    public final long f10345b;

    /* renamed from: f9, reason: collision with root package name */
    public final int f10346f9;
    public final long gmP;
    public final s9t olU;
    public final int sVU;

    public dz(long j5, long j6, int i4, int i5, long j7, String str, String str2, Boolean bool, s9t s9tVar, Uxa uxa) {
        this.f10345b = j5;
        this.f10344W = j6;
        this.f10346f9 = i4;
        this.sVU = i5;
        this.gmP = j7;
        this.f10341J = str;
        this.PqK = str2;
        this.f10343V = bool;
        this.olU = s9tVar;
        this.f10342R = uxa;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz)) {
            return false;
        }
        dz dzVar = (dz) obj;
        if (this.f10345b == dzVar.f10345b && this.f10344W == dzVar.f10344W && this.f10346f9 == dzVar.f10346f9 && this.sVU == dzVar.sVU && this.gmP == dzVar.gmP && Intrinsics.areEqual(this.f10341J, dzVar.f10341J) && Intrinsics.areEqual(this.PqK, dzVar.PqK) && Intrinsics.areEqual(this.f10343V, dzVar.f10343V) && Intrinsics.areEqual(this.olU, dzVar.olU) && Intrinsics.areEqual(this.f10342R, dzVar.f10342R)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j5 = this.f10345b;
        int b2 = lci.b(this.gmP, ZnG.b(this.sVU, ZnG.b(this.f10346f9, lci.b(this.f10344W, ((int) (j5 ^ (j5 >>> 32))) * 31, 31), 31), 31), 31);
        String str = this.f10341J;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (b2 + hashCode) * 31;
        String str2 = this.PqK;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Boolean bool = this.f10343V;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        s9t s9tVar = this.olU;
        if (s9tVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = s9tVar.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Uxa uxa = this.f10342R;
        if (uxa != null) {
            i4 = uxa.hashCode();
        }
        return i12 + i4;
    }
}
