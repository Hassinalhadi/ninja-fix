package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* loaded from: classes2.dex */
public final class B implements Thread.UncaughtExceptionHandler {
    public final String alpha;
    public final /* synthetic */ E bravo;

    public B(E e, String str) {
        this.bravo = e;
        this.alpha = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        ar arVar = ((G) this.bravo.alpha).f7507b;
        G.foxtrot(arVar);
        arVar.white.bravo(th, this.alpha);
    }
}
