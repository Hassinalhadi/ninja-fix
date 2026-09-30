package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class N6W {

    /* renamed from: W, reason: collision with root package name */
    public final int f9182W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9183b;

    public N6W(String str, int i4) {
        this.f9183b = str;
        this.f9182W = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N6W)) {
            return false;
        }
        N6W n6w = (N6W) obj;
        if (Intrinsics.areEqual(this.f9183b, n6w.f9183b) && this.f9182W == n6w.f9182W) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9182W + (this.f9183b.hashCode() * 31);
    }
}
