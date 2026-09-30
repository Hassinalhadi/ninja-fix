package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory implements b {
    private final a identityManagerProvider;
    private final a sessionStorageProvider;

    public ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory(a aVar, a aVar2) {
        this.sessionStorageProvider = aVar;
        this.identityManagerProvider = aVar2;
    }

    public static ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory create(a aVar, a aVar2) {
        return new ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory(aVar, aVar2);
    }

    public static ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor(SessionStorage sessionStorage, Object obj) {
        ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor = ZendeskNetworkModule.provideZendeskUnauthorizedInterceptor(sessionStorage, (IdentityManager) obj);
        AbstractC2763s0.delta(provideZendeskUnauthorizedInterceptor);
        return provideZendeskUnauthorizedInterceptor;
    }

    @Override // Kd.a
    public ZendeskUnauthorizedInterceptor get() {
        return provideZendeskUnauthorizedInterceptor((SessionStorage) this.sessionStorageProvider.get(), this.identityManagerProvider.get());
    }
}
