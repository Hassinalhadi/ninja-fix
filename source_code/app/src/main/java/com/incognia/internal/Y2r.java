package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Y2r {

    /* renamed from: W, reason: collision with root package name */
    public final String f9975W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9976b;

    public Y2r(String str, String str2) {
        this.f9976b = str;
        this.f9975W = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y2r)) {
            return false;
        }
        Y2r y2r = (Y2r) obj;
        if (Intrinsics.areEqual(this.f9976b, y2r.f9976b) && Intrinsics.areEqual(this.f9975W, y2r.f9975W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f9976b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f9975W;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }
}
