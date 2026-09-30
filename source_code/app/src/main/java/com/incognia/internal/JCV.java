package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class JCV {

    /* renamed from: W, reason: collision with root package name */
    public final String f8937W;

    /* renamed from: b, reason: collision with root package name */
    public final double f8938b;

    /* renamed from: f9, reason: collision with root package name */
    public final Integer f8939f9;
    public final Double sVU;

    public JCV(double d4, String str, Integer num, Double d9) {
        this.f8938b = d4;
        this.f8937W = str;
        this.f8939f9 = num;
        this.sVU = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JCV)) {
            return false;
        }
        JCV jcv = (JCV) obj;
        if (Double.compare(this.f8938b, jcv.f8938b) == 0 && Intrinsics.areEqual(this.f8937W, jcv.f8937W) && Intrinsics.areEqual(this.f8939f9, jcv.f8939f9) && Intrinsics.areEqual(this.sVU, jcv.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long doubleToLongBits = Double.doubleToLongBits(this.f8938b);
        int i4 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        String str = this.f8937W;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (i4 + hashCode) * 31;
        Integer num = this.f8939f9;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Double d4 = this.sVU;
        if (d4 != null) {
            i5 = d4.hashCode();
        }
        return i11 + i5;
    }
}
