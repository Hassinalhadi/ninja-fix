package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class component8<V> extends N14263A23323 {
    public final V component9;

    public component8(V v4) {
        super(null);
        this.component9 = v4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && component8.class == obj.getClass() && Intrinsics.areEqual(this.component9, ((component8) obj).component9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        V v4 = this.component9;
        if (v4 != null) {
            return v4.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Ok(" + this.component9 + ")";
    }
}
