package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class FzF {

    /* renamed from: W, reason: collision with root package name */
    public final zm f8742W;

    /* renamed from: b, reason: collision with root package name */
    public final k7Q f8743b;

    public FzF(k7Q k7q, zm zmVar) {
        this.f8743b = k7q;
        this.f8742W = zmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FzF)) {
            return false;
        }
        FzF fzF = (FzF) obj;
        if (Intrinsics.areEqual(this.f8743b, fzF.f8743b) && Intrinsics.areEqual(this.f8742W, fzF.f8742W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        k7Q k7q = this.f8743b;
        int i4 = 0;
        if (k7q == null) {
            hashCode = 0;
        } else {
            hashCode = k7q.hashCode();
        }
        int i5 = hashCode * 31;
        zm zmVar = this.f8742W;
        if (zmVar != null) {
            i4 = zmVar.hashCode();
        }
        return i5 + i4;
    }
}
