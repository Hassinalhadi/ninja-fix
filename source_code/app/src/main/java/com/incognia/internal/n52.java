package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n52 {

    /* renamed from: W, reason: collision with root package name */
    public final NnB f10930W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10931b;

    public n52(String str, NnB nnB) {
        this.f10931b = str;
        this.f10930W = nnB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n52)) {
            return false;
        }
        n52 n52Var = (n52) obj;
        if (Intrinsics.areEqual(this.f10931b, n52Var.f10931b) && Intrinsics.areEqual(this.f10930W, n52Var.f10930W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10930W.hashCode() + (this.f10931b.hashCode() * 31);
    }
}
