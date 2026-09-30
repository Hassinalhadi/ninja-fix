package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class setTopP6481<E> extends N14263A23323 {
    public final E vD14832N6715;

    public setTopP6481(E e) {
        super(null);
        this.vD14832N6715 = e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && setTopP6481.class == obj.getClass() && Intrinsics.areEqual(this.vD14832N6715, ((setTopP6481) obj).vD14832N6715)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        E e = this.vD14832N6715;
        if (e != null) {
            return e.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Err(" + this.vD14832N6715 + ")";
    }
}
