package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class sh {

    /* renamed from: W, reason: collision with root package name */
    public final long f11316W;

    /* renamed from: b, reason: collision with root package name */
    public final int f11317b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f11318f9;

    public sh(int i4, long j5, String str) {
        this.f11317b = i4;
        this.f11316W = j5;
        this.f11318f9 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh)) {
            return false;
        }
        sh shVar = (sh) obj;
        if (this.f11317b == shVar.f11317b && this.f11316W == shVar.f11316W && Intrinsics.areEqual(this.f11318f9, shVar.f11318f9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b2 = lci.b(this.f11316W, this.f11317b * 31, 31);
        String str = this.f11318f9;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return b2 + hashCode;
    }
}
