package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory implements b {
    private final a configurationProvider;
    private final ZendeskNetworkModule module;

    public ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory(ZendeskNetworkModule zendeskNetworkModule, a aVar) {
        this.module = zendeskNetworkModule;
        this.configurationProvider = aVar;
    }

    public static ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory create(ZendeskNetworkModule zendeskNetworkModule, a aVar) {
        return new ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory(zendeskNetworkModule, aVar);
    }

    public static ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor(ZendeskNetworkModule zendeskNetworkModule, ApplicationConfiguration applicationConfiguration) {
        ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor = zendeskNetworkModule.provideZendeskBasicHeadersInterceptor(applicationConfiguration);
        AbstractC2763s0.delta(provideZendeskBasicHeadersInterceptor);
        return provideZendeskBasicHeadersInterceptor;
    }

    @Override // Kd.a
    public ZendeskOauthIdHeaderInterceptor get() {
        return provideZendeskBasicHeadersInterceptor(this.module, (ApplicationConfiguration) this.configurationProvider.get());
    }
}
