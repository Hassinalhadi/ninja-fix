package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q0n {

    /* renamed from: W, reason: collision with root package name */
    public final Boolean f11121W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11122b;

    public q0n(String str, Boolean bool) {
        this.f11122b = str;
        this.f11121W = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0n)) {
            return false;
        }
        q0n q0nVar = (q0n) obj;
        if (Intrinsics.areEqual(this.f11122b, q0nVar.f11122b) && Intrinsics.areEqual(this.f11121W, q0nVar.f11121W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f11122b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        Boolean bool = this.f11121W;
        if (bool != null) {
            i4 = bool.hashCode();
        }
        return i5 + i4;
    }
}
