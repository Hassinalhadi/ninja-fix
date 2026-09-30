package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory implements b {
    private final ZendeskNetworkModule module;

    public ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(ZendeskNetworkModule zendeskNetworkModule) {
        this.module = zendeskNetworkModule;
    }

    public static ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory create(ZendeskNetworkModule zendeskNetworkModule) {
        return new ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(zendeskNetworkModule);
    }

    public static UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor(ZendeskNetworkModule zendeskNetworkModule) {
        UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor = zendeskNetworkModule.providesUserAgentHeaderInterceptor();
        AbstractC2763s0.delta(providesUserAgentHeaderInterceptor);
        return providesUserAgentHeaderInterceptor;
    }

    @Override // Kd.a
    public UserAgentAndClientHeadersInterceptor get() {
        return providesUserAgentHeaderInterceptor(this.module);
    }
}
