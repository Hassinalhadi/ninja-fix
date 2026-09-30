package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fKN {

    /* renamed from: W, reason: collision with root package name */
    public final String f10406W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10407b;

    public fKN(String str, String str2) {
        this.f10407b = str;
        this.f10406W = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fKN)) {
            return false;
        }
        fKN fkn = (fKN) obj;
        if (Intrinsics.areEqual(this.f10407b, fkn.f10407b) && Intrinsics.areEqual(this.f10406W, fkn.f10406W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f10407b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.f10406W;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }
}
