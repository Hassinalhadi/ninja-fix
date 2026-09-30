package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Nh implements L46 {

    /* renamed from: b, reason: collision with root package name */
    public final U91 f9242b;

    public Nh(U91 u91) {
        this.f9242b = u91;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Nh) && Intrinsics.areEqual(this.f9242b, ((Nh) obj).f9242b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9242b.hashCode();
    }
}
