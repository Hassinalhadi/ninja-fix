package zendesk.classic.messaging;

import Kd.a;
import dagger.internal.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class MessagingActivityModule_ExecutorServiceFactory implements b {
    private final a scheduledExecutorServiceProvider;

    public MessagingActivityModule_ExecutorServiceFactory(a aVar) {
        this.scheduledExecutorServiceProvider = aVar;
    }

    public static MessagingActivityModule_ExecutorServiceFactory create(a aVar) {
        return new MessagingActivityModule_ExecutorServiceFactory(aVar);
    }

    public static ExecutorService executorService(ScheduledExecutorService scheduledExecutorService) {
        ExecutorService executorService = MessagingActivityModule.executorService(scheduledExecutorService);
        AbstractC2763s0.delta(executorService);
        return executorService;
    }

    @Override // Kd.a
    public ExecutorService get() {
        return executorService((ScheduledExecutorService) this.scheduledExecutorServiceProvider.get());
    }
}
