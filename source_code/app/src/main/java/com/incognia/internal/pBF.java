package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pBF {

    /* renamed from: W, reason: collision with root package name */
    public final String f11056W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11057b;

    public pBF(String str, String str2) {
        this.f11057b = str;
        this.f11056W = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pBF)) {
            return false;
        }
        pBF pbf = (pBF) obj;
        if (Intrinsics.areEqual(this.f11057b, pbf.f11057b) && Intrinsics.areEqual(this.f11056W, pbf.f11056W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f11057b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f11056W;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }
}
