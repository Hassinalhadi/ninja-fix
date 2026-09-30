package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class GW {

    /* renamed from: J, reason: collision with root package name */
    public final Integer f8785J;

    /* renamed from: W, reason: collision with root package name */
    public final Integer f8786W;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f8787b;

    /* renamed from: f9, reason: collision with root package name */
    public final Integer f8788f9;
    public final Integer gmP;
    public final Integer sVU;

    public GW(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.f8787b = num;
        this.f8786W = num2;
        this.f8788f9 = num3;
        this.sVU = num4;
        this.gmP = num5;
        this.f8785J = num6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GW)) {
            return false;
        }
        GW gw = (GW) obj;
        if (Intrinsics.areEqual(this.f8787b, gw.f8787b) && Intrinsics.areEqual(this.f8786W, gw.f8786W) && Intrinsics.areEqual(this.f8788f9, gw.f8788f9) && Intrinsics.areEqual(this.sVU, gw.sVU) && Intrinsics.areEqual(this.gmP, gw.gmP) && Intrinsics.areEqual(this.f8785J, gw.f8785J)) {
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
        Integer num = this.f8787b;
        int i4 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i5 = hashCode * 31;
        Integer num2 = this.f8786W;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Integer num3 = this.f8788f9;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Integer num4 = this.sVU;
        if (num4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Integer num5 = this.gmP;
        if (num5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Integer num6 = this.f8785J;
        if (num6 != null) {
            i4 = num6.hashCode();
        }
        return i13 + i4;
    }
}
