package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gW3 {

    /* renamed from: W, reason: collision with root package name */
    public final Long f10483W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10484b;

    public gW3(String str, Long l10) {
        this.f10484b = str;
        this.f10483W = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gW3)) {
            return false;
        }
        gW3 gw3 = (gW3) obj;
        if (Intrinsics.areEqual(this.f10484b, gw3.f10484b) && Intrinsics.areEqual(this.f10483W, gw3.f10483W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f10484b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        Long l10 = this.f10483W;
        if (l10 != null) {
            i4 = l10.hashCode();
        }
        return i5 + i4;
    }
}
