package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class uK {

    /* renamed from: W, reason: collision with root package name */
    public final VXt f11457W;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f11458b;

    public uK(Boolean bool, VXt vXt) {
        this.f11458b = bool;
        this.f11457W = vXt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uK)) {
            return false;
        }
        uK uKVar = (uK) obj;
        if (Intrinsics.areEqual(this.f11458b, uKVar.f11458b) && Intrinsics.areEqual(this.f11457W, uKVar.f11457W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Boolean bool = this.f11458b;
        int i4 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i5 = hashCode * 31;
        VXt vXt = this.f11457W;
        if (vXt != null) {
            i4 = vXt.hashCode();
        }
        return i5 + i4;
    }
}
