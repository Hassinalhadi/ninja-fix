package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Xh {

    /* renamed from: W, reason: collision with root package name */
    public final Double f9938W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9939b;

    /* renamed from: f9, reason: collision with root package name */
    public final Double f9940f9;
    public final String gmP;
    public final String sVU;

    public Xh(String str, Double d4, Double d9, String str2, String str3) {
        this.f9939b = str;
        this.f9938W = d4;
        this.f9940f9 = d9;
        this.sVU = str2;
        this.gmP = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xh)) {
            return false;
        }
        Xh xh = (Xh) obj;
        if (Intrinsics.areEqual(this.f9939b, xh.f9939b) && Intrinsics.areEqual(this.f9938W, xh.f9938W) && Intrinsics.areEqual(this.f9940f9, xh.f9940f9) && Intrinsics.areEqual(this.sVU, xh.sVU) && Intrinsics.areEqual(this.gmP, xh.gmP)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f9939b.hashCode() * 31;
        Double d4 = this.f9938W;
        int i4 = 0;
        if (d4 == null) {
            hashCode = 0;
        } else {
            hashCode = d4.hashCode();
        }
        int i5 = (hashCode4 + hashCode) * 31;
        Double d9 = this.f9940f9;
        if (d9 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d9.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str = this.sVU;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.gmP;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i11 + i4;
    }
}
