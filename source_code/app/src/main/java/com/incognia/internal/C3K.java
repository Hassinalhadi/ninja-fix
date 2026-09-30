package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class C3K {

    /* renamed from: W, reason: collision with root package name */
    public final Long f8433W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8434b;

    /* renamed from: f9, reason: collision with root package name */
    public final Long f8435f9;
    public final Long sVU;

    public C3K(String str, Long l10, Long l11, Long l12) {
        this.f8434b = str;
        this.f8433W = l10;
        this.f8435f9 = l11;
        this.sVU = l12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3K)) {
            return false;
        }
        C3K c3k = (C3K) obj;
        if (Intrinsics.areEqual(this.f8434b, c3k.f8434b) && Intrinsics.areEqual(this.f8433W, c3k.f8433W) && Intrinsics.areEqual(this.f8435f9, c3k.f8435f9) && Intrinsics.areEqual(this.sVU, c3k.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f8434b.hashCode() * 31;
        Long l10 = this.f8433W;
        int i4 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i5 = (hashCode3 + hashCode) * 31;
        Long l11 = this.f8435f9;
        if (l11 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l11.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Long l12 = this.sVU;
        if (l12 != null) {
            i4 = l12.hashCode();
        }
        return i10 + i4;
    }
}
