package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class sD {

    /* renamed from: W, reason: collision with root package name */
    public final long f11280W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11281b;

    /* renamed from: f9, reason: collision with root package name */
    public Long f11282f9;

    public sD(String str, long j5) {
        this.f11281b = str;
        this.f11280W = j5;
        this.f11282f9 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sD)) {
            return false;
        }
        sD sDVar = (sD) obj;
        if (Intrinsics.areEqual(this.f11281b, sDVar.f11281b) && this.f11280W == sDVar.f11280W && Intrinsics.areEqual(this.f11282f9, sDVar.f11282f9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b2 = lci.b(this.f11280W, this.f11281b.hashCode() * 31, 31);
        Long l10 = this.f11282f9;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return b2 + hashCode;
    }

    public sD(String str, long j5, Long l10) {
        this.f11281b = str;
        this.f11280W = j5;
        this.f11282f9 = l10;
    }
}
