package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class SO {

    /* renamed from: W, reason: collision with root package name */
    public final Long f9594W;

    /* renamed from: b, reason: collision with root package name */
    public final Long f9595b;

    public SO(Long l10, Long l11) {
        this.f9595b = l10;
        this.f9594W = l11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SO)) {
            return false;
        }
        SO so = (SO) obj;
        if (Intrinsics.areEqual(this.f9595b, so.f9595b) && Intrinsics.areEqual(this.f9594W, so.f9594W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l10 = this.f9595b;
        int i4 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i5 = hashCode * 31;
        Long l11 = this.f9594W;
        if (l11 != null) {
            i4 = l11.hashCode();
        }
        return i5 + i4;
    }
}
