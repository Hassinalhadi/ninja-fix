package zendesk.core;

import dagger.internal.b;
import java.util.concurrent.Executor;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetExecutorFactory implements b {
    private final CoreModule module;

    public CoreModule_GetExecutorFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetExecutorFactory create(CoreModule coreModule) {
        return new CoreModule_GetExecutorFactory(coreModule);
    }

    public static Executor getExecutor(CoreModule coreModule) {
        Executor executor = coreModule.getExecutor();
        AbstractC2763s0.delta(executor);
        return executor;
    }

    @Override // Kd.a
    public Executor get() {
        return getExecutor(this.module);
    }
}
