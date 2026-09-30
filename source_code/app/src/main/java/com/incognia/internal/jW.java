package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jW {

    /* renamed from: W, reason: collision with root package name */
    public final NnB f10694W;

    /* renamed from: b, reason: collision with root package name */
    public final BGx f10695b;

    public jW(BGx bGx) {
        this.f10695b = bGx;
        this.f10694W = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jW)) {
            return false;
        }
        jW jWVar = (jW) obj;
        if (Intrinsics.areEqual(this.f10695b, jWVar.f10695b) && Intrinsics.areEqual(this.f10694W, jWVar.f10694W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f10695b.hashCode() * 31;
        NnB nnB = this.f10694W;
        if (nnB == null) {
            hashCode = 0;
        } else {
            hashCode = nnB.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public jW(BGx bGx, NnB nnB) {
        this.f10695b = bGx;
        this.f10694W = nnB;
    }
}
