package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class FCF {

    /* renamed from: W, reason: collision with root package name */
    public final Boolean f8651W;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f8652b;

    public FCF(Boolean bool, Boolean bool2) {
        this.f8652b = bool;
        this.f8651W = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FCF)) {
            return false;
        }
        FCF fcf = (FCF) obj;
        if (Intrinsics.areEqual(this.f8652b, fcf.f8652b) && Intrinsics.areEqual(this.f8651W, fcf.f8651W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Boolean bool = this.f8652b;
        int i4 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i5 = hashCode * 31;
        Boolean bool2 = this.f8651W;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        }
        return i5 + i4;
    }
}
