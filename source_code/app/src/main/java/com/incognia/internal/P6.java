package com.incognia.internal;

import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class P6 {

    /* renamed from: b, reason: collision with root package name */
    public final Map f9388b;

    public P6(Map map) {
        this.f9388b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof P6) && Intrinsics.areEqual(this.f9388b, ((P6) obj).f9388b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9388b.hashCode();
    }

    public P6() {
        this.f9388b = t.alpha;
    }
}
