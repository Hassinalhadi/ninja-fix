package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zm {

    /* renamed from: W, reason: collision with root package name */
    public final double f11943W;

    /* renamed from: b, reason: collision with root package name */
    public final double f11944b;

    /* renamed from: f9, reason: collision with root package name */
    public final Long f11945f9;

    public zm(double d4, double d9, Long l10) {
        this.f11944b = d4;
        this.f11943W = d9;
        this.f11945f9 = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm)) {
            return false;
        }
        zm zmVar = (zm) obj;
        if (Double.compare(this.f11944b, zmVar.f11944b) == 0 && Double.compare(this.f11943W, zmVar.f11943W) == 0 && Intrinsics.areEqual(this.f11945f9, zmVar.f11945f9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long doubleToLongBits = Double.doubleToLongBits(this.f11944b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f11943W);
        int i4 = (((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2)) + (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31)) * 31;
        Long l10 = this.f11945f9;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return i4 + hashCode;
    }
}
