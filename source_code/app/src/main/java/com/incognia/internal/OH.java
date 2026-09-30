package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class OH {

    /* renamed from: W, reason: collision with root package name */
    public final NnB f9294W;

    /* renamed from: b, reason: collision with root package name */
    public final k7Q f9295b;

    public OH(k7Q k7q, NnB nnB) {
        this.f9295b = k7q;
        this.f9294W = nnB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OH)) {
            return false;
        }
        OH oh = (OH) obj;
        if (Intrinsics.areEqual(this.f9295b, oh.f9295b) && Intrinsics.areEqual(this.f9294W, oh.f9294W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        k7Q k7q = this.f9295b;
        int i4 = 0;
        if (k7q == null) {
            hashCode = 0;
        } else {
            hashCode = k7q.hashCode();
        }
        int i5 = hashCode * 31;
        NnB nnB = this.f9294W;
        if (nnB != null) {
            i4 = nnB.hashCode();
        }
        return i5 + i4;
    }
}
