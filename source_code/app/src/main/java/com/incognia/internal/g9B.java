package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g9B {

    /* renamed from: W, reason: collision with root package name */
    public final int f10463W;

    /* renamed from: b, reason: collision with root package name */
    public final int f10464b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f10465f9;
    public final Integer gmP;
    public final String sVU;

    public g9B(int i4, int i5, String str, String str2, Integer num) {
        this.f10464b = i4;
        this.f10463W = i5;
        this.f10465f9 = str;
        this.sVU = str2;
        this.gmP = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9B)) {
            return false;
        }
        g9B g9b = (g9B) obj;
        if (this.f10464b == g9b.f10464b && this.f10463W == g9b.f10463W && Intrinsics.areEqual(this.f10465f9, g9b.f10465f9) && Intrinsics.areEqual(this.sVU, g9b.sVU) && Intrinsics.areEqual(this.gmP, g9b.gmP)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int b2 = ZnG.b(this.f10463W, this.f10464b * 31, 31);
        String str = this.f10465f9;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (b2 + hashCode) * 31;
        String str2 = this.sVU;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Integer num = this.gmP;
        if (num != null) {
            i4 = num.hashCode();
        }
        return i10 + i4;
    }
}
