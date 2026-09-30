package zendesk.classic.messaging;

import dagger.internal.b;
import java.util.concurrent.ScheduledExecutorService;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class MessagingActivityModule_ProvideExecutorFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final MessagingActivityModule_ProvideExecutorFactory INSTANCE = new MessagingActivityModule_ProvideExecutorFactory();

        private InstanceHolder() {
        }
    }

    public static MessagingActivityModule_ProvideExecutorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ScheduledExecutorService provideExecutor() {
        ScheduledExecutorService provideExecutor = MessagingActivityModule.provideExecutor();
        AbstractC2763s0.delta(provideExecutor);
        return provideExecutor;
    }

    @Override // Kd.a
    public ScheduledExecutorService get() {
        return provideExecutor();
    }
}
