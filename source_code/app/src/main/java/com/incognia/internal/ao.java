package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ao {

    /* renamed from: W, reason: collision with root package name */
    public final NnB f10113W;

    /* renamed from: b, reason: collision with root package name */
    public final k7Q f10114b;

    public ao(k7Q k7q, NnB nnB) {
        this.f10114b = k7q;
        this.f10113W = nnB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        if (Intrinsics.areEqual(this.f10114b, aoVar.f10114b) && Intrinsics.areEqual(this.f10113W, aoVar.f10113W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        k7Q k7q = this.f10114b;
        int i4 = 0;
        if (k7q == null) {
            hashCode = 0;
        } else {
            hashCode = k7q.hashCode();
        }
        int i5 = hashCode * 31;
        NnB nnB = this.f10113W;
        if (nnB != null) {
            i4 = nnB.hashCode();
        }
        return i5 + i4;
    }
}
