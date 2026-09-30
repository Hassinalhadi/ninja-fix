package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class JBP {

    /* renamed from: W, reason: collision with root package name */
    public final Boolean f8935W;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f8936b;

    public JBP(Boolean bool, Boolean bool2) {
        this.f8936b = bool;
        this.f8935W = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JBP)) {
            return false;
        }
        JBP jbp = (JBP) obj;
        if (Intrinsics.areEqual(this.f8936b, jbp.f8936b) && Intrinsics.areEqual(this.f8935W, jbp.f8935W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Boolean bool = this.f8936b;
        int i4 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i5 = hashCode * 31;
        Boolean bool2 = this.f8935W;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        }
        return i5 + i4;
    }
}
