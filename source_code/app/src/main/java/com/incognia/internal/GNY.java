package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class GNY {

    /* renamed from: W, reason: collision with root package name */
    public final boolean f8766W;

    /* renamed from: b, reason: collision with root package name */
    public final zKA f8767b;

    public GNY(zKA zka, boolean z2) {
        this.f8767b = zka;
        this.f8766W = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GNY)) {
            return false;
        }
        GNY gny = (GNY) obj;
        if (Intrinsics.areEqual(this.f8767b, gny.f8767b) && this.f8766W == gny.f8766W) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f8767b.hashCode() * 31;
        boolean z2 = this.f8766W;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }
}
