package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class huR {
    public final s9t DOu;

    /* renamed from: J, reason: collision with root package name */
    public final String f10573J;
    public final String PqK;

    /* renamed from: R, reason: collision with root package name */
    public final MOB f10574R;

    /* renamed from: V, reason: collision with root package name */
    public final Boolean f10575V;

    /* renamed from: W, reason: collision with root package name */
    public final long f10576W;

    /* renamed from: b, reason: collision with root package name */
    public final long f10577b;

    /* renamed from: f9, reason: collision with root package name */
    public final int f10578f9;
    public final long gmP;
    public final String olU;
    public final int sVU;

    public huR(long j5, long j6, int i4, int i5, long j7, String str, String str2, Boolean bool, String str3, MOB mob, s9t s9tVar) {
        this.f10577b = j5;
        this.f10576W = j6;
        this.f10578f9 = i4;
        this.sVU = i5;
        this.gmP = j7;
        this.f10573J = str;
        this.PqK = str2;
        this.f10575V = bool;
        this.olU = str3;
        this.f10574R = mob;
        this.DOu = s9tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huR)) {
            return false;
        }
        huR hur = (huR) obj;
        if (this.f10577b == hur.f10577b && this.f10576W == hur.f10576W && this.f10578f9 == hur.f10578f9 && this.sVU == hur.sVU && this.gmP == hur.gmP && Intrinsics.areEqual(this.f10573J, hur.f10573J) && Intrinsics.areEqual(this.PqK, hur.PqK) && Intrinsics.areEqual(this.f10575V, hur.f10575V) && Intrinsics.areEqual(this.olU, hur.olU) && Intrinsics.areEqual(this.f10574R, hur.f10574R) && Intrinsics.areEqual(this.DOu, hur.DOu)) {
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
        long j5 = this.f10577b;
        int b2 = lci.b(this.gmP, ZnG.b(this.sVU, ZnG.b(this.f10578f9, lci.b(this.f10576W, ((int) (j5 ^ (j5 >>> 32))) * 31, 31), 31), 31), 31);
        String str = this.f10573J;
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
        Boolean bool = this.f10575V;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str3 = this.olU;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        MOB mob = this.f10574R;
        if (mob == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = mob.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        s9t s9tVar = this.DOu;
        if (s9tVar != null) {
            i4 = s9tVar.hashCode();
        }
        return i13 + i4;
    }
}
