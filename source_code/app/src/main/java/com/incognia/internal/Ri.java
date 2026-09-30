package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Ri implements L46 {

    /* renamed from: b, reason: collision with root package name */
    public final nD f9560b;

    public Ri(nD nDVar) {
        this.f9560b = nDVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Ri) && Intrinsics.areEqual(this.f9560b, ((Ri) obj).f9560b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9560b.hashCode();
    }
}
