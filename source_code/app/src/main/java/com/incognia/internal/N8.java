package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class N8 {

    /* renamed from: W, reason: collision with root package name */
    public final String f9184W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9185b;

    public N8(String str, String str2) {
        this.f9185b = str;
        this.f9184W = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N8)) {
            return false;
        }
        N8 n82 = (N8) obj;
        if (Intrinsics.areEqual(this.f9185b, n82.f9185b) && Intrinsics.areEqual(this.f9184W, n82.f9184W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f9185b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f9184W;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }
}
