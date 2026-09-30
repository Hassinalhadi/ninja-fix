package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class oVD {

    /* renamed from: W, reason: collision with root package name */
    public final long f11021W;

    /* renamed from: b, reason: collision with root package name */
    public final long f11022b;

    /* renamed from: f9, reason: collision with root package name */
    public final Long f11023f9;
    public final String sVU;

    public oVD(long j5, long j6, Long l10, String str) {
        this.f11022b = j5;
        this.f11021W = j6;
        this.f11023f9 = l10;
        this.sVU = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oVD)) {
            return false;
        }
        oVD ovd = (oVD) obj;
        if (this.f11022b == ovd.f11022b && this.f11021W == ovd.f11021W && Intrinsics.areEqual(this.f11023f9, ovd.f11023f9) && Intrinsics.areEqual(this.sVU, ovd.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j5 = this.f11022b;
        int b2 = lci.b(this.f11021W, ((int) (j5 ^ (j5 >>> 32))) * 31, 31);
        Long l10 = this.f11023f9;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return this.sVU.hashCode() + ((b2 + hashCode) * 31);
    }
}
