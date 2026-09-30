package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bWZ extends cQM {

    /* renamed from: f9, reason: collision with root package name */
    public final int f10184f9;
    public final String sVU;

    public bWZ(int i4, String str) {
        super("Network Exception: URL: " + str + " Status: " + i4, null, 8);
        this.f10184f9 = i4;
        this.sVU = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bWZ)) {
            return false;
        }
        bWZ bwz = (bWZ) obj;
        if (this.f10184f9 == bwz.f10184f9 && Intrinsics.areEqual(this.sVU, bwz.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.sVU.hashCode() + (this.f10184f9 * 31);
    }
}
