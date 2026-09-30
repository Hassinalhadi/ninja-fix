package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xK {

    /* renamed from: W, reason: collision with root package name */
    public final String f11788W;

    /* renamed from: b, reason: collision with root package name */
    public final Long f11789b;

    /* renamed from: f9, reason: collision with root package name */
    public final long f11790f9;
    public final XD sVU;

    public xK(Long l10, String str, long j5, XD xd2) {
        this.f11789b = l10;
        this.f11788W = str;
        this.f11790f9 = j5;
        this.sVU = xd2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xK)) {
            return false;
        }
        xK xKVar = (xK) obj;
        if (Intrinsics.areEqual(this.f11789b, xKVar.f11789b) && Intrinsics.areEqual(this.f11788W, xKVar.f11788W) && this.f11790f9 == xKVar.f11790f9 && Intrinsics.areEqual(this.sVU, xKVar.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l10 = this.f11789b;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return this.sVU.hashCode() + lci.b(this.f11790f9, VpS.b(this.f11788W, hashCode * 31, 31), 31);
    }
}
