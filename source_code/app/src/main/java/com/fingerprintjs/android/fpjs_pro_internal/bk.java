package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bk {
    public static int alpha;
    public static int bravo;

    static {
        bravo();
        alpha();
        alpha = 0;
        bravo = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <V, E> N14263A23323<V, E> D8871(@NotNull N14263A23323<? extends N14263A23323<? extends V, ? extends E>, ? extends E> n14263a23323) {
        int i4 = (alpha + 15) % 128;
        bravo = i4;
        if (n14263a23323 instanceof component8) {
            int i5 = i4 + 101;
            alpha = i5 % 128;
            if (i5 % 2 == 0) {
                return (N14263A23323) ((component8) n14263a23323).component9;
            }
            throw null;
        }
        if (n14263a23323 instanceof setTopP6481) {
            int i10 = i4 + 55;
            alpha = i10 % 128;
            if (i10 % 2 == 0) {
                return n14263a23323;
            }
            throw null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void alpha() {
    }

    public static void bravo() {
    }

    @NotNull
    public static final <T> N14263A23323<T, Throwable> component5(@NotNull Object obj) {
        alpha = (bravo + 7) % 128;
        Result.Companion companion = Result.INSTANCE;
        if (!(obj instanceof kotlin.k)) {
            ResultKt.alpha(obj);
            return new component8(obj);
        }
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
        Intrinsics.checkNotNull(m207exceptionOrNullimpl);
        setTopP6481 settopp6481 = new setTopP6481(m207exceptionOrNullimpl);
        int i4 = alpha + 105;
        bravo = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return settopp6481;
    }
}
