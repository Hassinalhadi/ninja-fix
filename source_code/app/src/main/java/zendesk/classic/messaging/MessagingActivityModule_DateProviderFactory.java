package zendesk.classic.messaging;

import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.classic.messaging.components.DateProvider;

/* loaded from: classes.dex */
public final class MessagingActivityModule_DateProviderFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final MessagingActivityModule_DateProviderFactory INSTANCE = new MessagingActivityModule_DateProviderFactory();

        private InstanceHolder() {
        }
    }

    public static MessagingActivityModule_DateProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DateProvider dateProvider() {
        DateProvider dateProvider = MessagingActivityModule.dateProvider();
        AbstractC2763s0.delta(dateProvider);
        return dateProvider;
    }

    @Override // Kd.a
    public DateProvider get() {
        return dateProvider();
    }
}
