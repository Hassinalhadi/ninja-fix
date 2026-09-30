package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
public final class C extends FutureTask implements Comparable {
    public final long alpha;
    public final boolean purple;
    public final String red;
    public final /* synthetic */ E silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(E e, Runnable runnable, boolean z2, String str) {
        super(runnable, null);
        this.silver = e;
        long andIncrement = E.f7502d.getAndIncrement();
        this.alpha = andIncrement;
        this.red = str;
        this.purple = z2;
        if (andIncrement == Long.MAX_VALUE) {
            ar arVar = ((G) e.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.white.alpha("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C c3 = (C) obj;
        boolean z2 = c3.purple;
        boolean z10 = this.purple;
        if (z10 != z2) {
            if (z10) {
                return -1;
            }
            return 1;
        }
        long j5 = this.alpha;
        long j6 = c3.alpha;
        if (j5 < j6) {
            return -1;
        }
        if (j5 > j6) {
            return 1;
        }
        ar arVar = ((G) this.silver.alpha).f7507b;
        G.foxtrot(arVar);
        arVar.yellow.bravo(Long.valueOf(j5), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        ar arVar = ((G) this.silver.alpha).f7507b;
        G.foxtrot(arVar);
        arVar.white.bravo(th, this.red);
        if ((th instanceof zzih) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(E e, Callable callable, boolean z2) {
        super(callable);
        this.silver = e;
        long andIncrement = E.f7502d.getAndIncrement();
        this.alpha = andIncrement;
        this.red = "Task exception on worker thread";
        this.purple = z2;
        if (andIncrement == Long.MAX_VALUE) {
            ar arVar = ((G) e.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.white.alpha("Tasks index overflow");
        }
    }
}
