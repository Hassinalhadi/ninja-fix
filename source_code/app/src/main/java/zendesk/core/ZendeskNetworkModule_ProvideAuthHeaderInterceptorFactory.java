package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory implements b {
    private final a identityManagerProvider;

    public ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(a aVar) {
        this.identityManagerProvider = aVar;
    }

    public static ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory create(a aVar) {
        return new ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(aVar);
    }

    public static ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor(Object obj) {
        ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor = ZendeskNetworkModule.provideAuthHeaderInterceptor((IdentityManager) obj);
        AbstractC2763s0.delta(provideAuthHeaderInterceptor);
        return provideAuthHeaderInterceptor;
    }

    @Override // Kd.a
    public ZendeskAuthHeaderInterceptor get() {
        return provideAuthHeaderInterceptor(this.identityManagerProvider.get());
    }
}
