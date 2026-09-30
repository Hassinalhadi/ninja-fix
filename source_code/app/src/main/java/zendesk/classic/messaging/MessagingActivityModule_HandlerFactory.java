package zendesk.classic.messaging;

import android.os.Handler;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class MessagingActivityModule_HandlerFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final MessagingActivityModule_HandlerFactory INSTANCE = new MessagingActivityModule_HandlerFactory();

        private InstanceHolder() {
        }
    }

    public static MessagingActivityModule_HandlerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Handler handler() {
        Handler handler = MessagingActivityModule.handler();
        AbstractC2763s0.delta(handler);
        return handler;
    }

    @Override // Kd.a
    public Handler get() {
        return handler();
    }
}
