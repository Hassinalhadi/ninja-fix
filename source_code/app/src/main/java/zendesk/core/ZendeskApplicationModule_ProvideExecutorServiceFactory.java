package zendesk.core;

import Kd.a;
import dagger.internal.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskApplicationModule_ProvideExecutorServiceFactory implements b {
    private final a scheduledExecutorServiceProvider;

    public ZendeskApplicationModule_ProvideExecutorServiceFactory(a aVar) {
        this.scheduledExecutorServiceProvider = aVar;
    }

    public static ZendeskApplicationModule_ProvideExecutorServiceFactory create(a aVar) {
        return new ZendeskApplicationModule_ProvideExecutorServiceFactory(aVar);
    }

    public static ExecutorService provideExecutorService(ScheduledExecutorService scheduledExecutorService) {
        ExecutorService provideExecutorService = ZendeskApplicationModule.provideExecutorService(scheduledExecutorService);
        AbstractC2763s0.delta(provideExecutorService);
        return provideExecutorService;
    }

    @Override // Kd.a
    public ExecutorService get() {
        return provideExecutorService((ScheduledExecutorService) this.scheduledExecutorServiceProvider.get());
    }
}
