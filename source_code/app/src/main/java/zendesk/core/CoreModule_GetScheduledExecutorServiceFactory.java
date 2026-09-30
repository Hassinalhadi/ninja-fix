package zendesk.core;

import dagger.internal.b;
import java.util.concurrent.ScheduledExecutorService;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetScheduledExecutorServiceFactory implements b {
    private final CoreModule module;

    public CoreModule_GetScheduledExecutorServiceFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetScheduledExecutorServiceFactory create(CoreModule coreModule) {
        return new CoreModule_GetScheduledExecutorServiceFactory(coreModule);
    }

    public static ScheduledExecutorService getScheduledExecutorService(CoreModule coreModule) {
        ScheduledExecutorService scheduledExecutorService = coreModule.getScheduledExecutorService();
        AbstractC2763s0.delta(scheduledExecutorService);
        return scheduledExecutorService;
    }

    @Override // Kd.a
    public ScheduledExecutorService get() {
        return getScheduledExecutorService(this.module);
    }
}
