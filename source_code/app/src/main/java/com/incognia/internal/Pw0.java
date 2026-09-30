package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Pw0 {

    /* renamed from: W, reason: collision with root package name */
    public final String f9454W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9455b;

    public Pw0(String str, String str2, int i4) {
        str = (i4 & 1) != 0 ? null : str;
        str2 = (i4 & 2) != 0 ? null : str2;
        this.f9455b = str;
        this.f9454W = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pw0)) {
            return false;
        }
        Pw0 pw0 = (Pw0) obj;
        if (Intrinsics.areEqual(this.f9455b, pw0.f9455b) && Intrinsics.areEqual(this.f9454W, pw0.f9454W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f9455b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f9454W;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }
}
