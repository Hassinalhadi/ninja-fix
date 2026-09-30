package delivery.samurai.android;

import dagger.internal.b;
import s6.AbstractC2763s0;
import w9.v;
import z3.InterfaceC3463b;

/* loaded from: classes2.dex */
public final class LoggingModule_ProvideCrashLoggerFactory implements b {
    @Override // Kd.a
    public final Object get() {
        InterfaceC3463b provideCrashLogger = v.alpha.provideCrashLogger();
        AbstractC2763s0.delta(provideCrashLogger);
        return provideCrashLogger;
    }
}
