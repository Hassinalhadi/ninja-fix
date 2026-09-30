package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c7p {

    /* renamed from: W, reason: collision with root package name */
    public final long f10224W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10225b;

    public c7p(String str, long j5) {
        this.f10225b = str;
        this.f10224W = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7p)) {
            return false;
        }
        c7p c7pVar = (c7p) obj;
        if (Intrinsics.areEqual(this.f10225b, c7pVar.f10225b) && this.f10224W == c7pVar.f10224W) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10225b.hashCode() * 31;
        long j5 = this.f10224W;
        return ((int) (j5 ^ (j5 >>> 32))) + hashCode;
    }
}
