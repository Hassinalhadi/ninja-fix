package zendesk.core;

import dagger.internal.b;
import java.util.concurrent.ScheduledExecutorService;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskApplicationModule_ProvideExecutorFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final ZendeskApplicationModule_ProvideExecutorFactory INSTANCE = new ZendeskApplicationModule_ProvideExecutorFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskApplicationModule_ProvideExecutorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ScheduledExecutorService provideExecutor() {
        ScheduledExecutorService provideExecutor = ZendeskApplicationModule.provideExecutor();
        AbstractC2763s0.delta(provideExecutor);
        return provideExecutor;
    }

    @Override // Kd.a
    public ScheduledExecutorService get() {
        return provideExecutor();
    }
}
