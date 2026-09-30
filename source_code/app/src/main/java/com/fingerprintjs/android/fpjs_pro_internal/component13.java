package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class component13 {
    public static final Object alpha(N14263A23323 n14263a23323) {
        if (n14263a23323 instanceof component8) {
            return ((component8) n14263a23323).component9;
        }
        if (n14263a23323 instanceof setTopP6481) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <V, E> V vD14832N6715(@NotNull N14263A23323<? extends V, ? extends E> n14263a23323, V v4) {
        if (n14263a23323 instanceof component8) {
            return ((component8) n14263a23323).component9;
        }
        if (n14263a23323 instanceof setTopP6481) {
            return v4;
        }
        throw new NoWhenBranchMatchedException();
    }
}
