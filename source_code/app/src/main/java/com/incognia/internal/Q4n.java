package com.incognia.internal;

import I0.ae;
import g9.a;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class Q4n {
    public static Executor b(pl2 pl2Var) {
        return new ae(1, pl2Var);
    }

    public static final void b(pl2 pl2Var, Runnable runnable) {
        if (runnable != null) {
            pl2Var.b(new a(8, runnable));
        }
    }

    public static final void b(Runnable runnable) {
        runnable.run();
    }
}
