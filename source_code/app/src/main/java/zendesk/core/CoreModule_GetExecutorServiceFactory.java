package zendesk.core;

import dagger.internal.b;
import java.util.concurrent.ExecutorService;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetExecutorServiceFactory implements b {
    private final CoreModule module;

    public CoreModule_GetExecutorServiceFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetExecutorServiceFactory create(CoreModule coreModule) {
        return new CoreModule_GetExecutorServiceFactory(coreModule);
    }

    public static ExecutorService getExecutorService(CoreModule coreModule) {
        ExecutorService executorService = coreModule.getExecutorService();
        AbstractC2763s0.delta(executorService);
        return executorService;
    }

    @Override // Kd.a
    public ExecutorService get() {
        return getExecutorService(this.module);
    }
}
