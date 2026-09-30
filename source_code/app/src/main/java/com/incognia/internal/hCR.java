package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hCR {

    /* renamed from: W, reason: collision with root package name */
    public final Long f10526W;

    /* renamed from: b, reason: collision with root package name */
    public final Long f10527b;

    public hCR(Long l10, Long l11) {
        this.f10527b = l10;
        this.f10526W = l11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hCR)) {
            return false;
        }
        hCR hcr = (hCR) obj;
        if (Intrinsics.areEqual(this.f10527b, hcr.f10527b) && Intrinsics.areEqual(this.f10526W, hcr.f10526W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l10 = this.f10527b;
        int i4 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i5 = hashCode * 31;
        Long l11 = this.f10526W;
        if (l11 != null) {
            i4 = l11.hashCode();
        }
        return i5 + i4;
    }
}
