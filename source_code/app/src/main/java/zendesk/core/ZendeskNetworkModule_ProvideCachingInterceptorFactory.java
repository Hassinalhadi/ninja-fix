package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvideCachingInterceptorFactory implements b {
    private final a mediaCacheProvider;

    public ZendeskNetworkModule_ProvideCachingInterceptorFactory(a aVar) {
        this.mediaCacheProvider = aVar;
    }

    public static ZendeskNetworkModule_ProvideCachingInterceptorFactory create(a aVar) {
        return new ZendeskNetworkModule_ProvideCachingInterceptorFactory(aVar);
    }

    public static CachingInterceptor provideCachingInterceptor(BaseStorage baseStorage) {
        CachingInterceptor provideCachingInterceptor = ZendeskNetworkModule.provideCachingInterceptor(baseStorage);
        AbstractC2763s0.delta(provideCachingInterceptor);
        return provideCachingInterceptor;
    }

    @Override // Kd.a
    public CachingInterceptor get() {
        return provideCachingInterceptor((BaseStorage) this.mediaCacheProvider.get());
    }
}
