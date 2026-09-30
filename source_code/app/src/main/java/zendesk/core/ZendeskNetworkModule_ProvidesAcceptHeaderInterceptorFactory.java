package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory INSTANCE = new ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AcceptHeaderInterceptor providesAcceptHeaderInterceptor() {
        AcceptHeaderInterceptor providesAcceptHeaderInterceptor = ZendeskNetworkModule.providesAcceptHeaderInterceptor();
        AbstractC2763s0.delta(providesAcceptHeaderInterceptor);
        return providesAcceptHeaderInterceptor;
    }

    @Override // Kd.a
    public AcceptHeaderInterceptor get() {
        return providesAcceptHeaderInterceptor();
    }
}
