package com.incognia.internal;

/* loaded from: classes2.dex */
public final class hp {

    /* renamed from: W, reason: collision with root package name */
    public final double f10569W;

    /* renamed from: b, reason: collision with root package name */
    public final double f10570b;

    public hp(double d4, double d9) {
        this.f10570b = d4;
        this.f10569W = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        if (Double.compare(this.f10570b, hpVar.f10570b) == 0 && Double.compare(this.f10569W, hpVar.f10569W) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f10570b);
        int i4 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f10569W);
        return ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2)) + i4;
    }
}
