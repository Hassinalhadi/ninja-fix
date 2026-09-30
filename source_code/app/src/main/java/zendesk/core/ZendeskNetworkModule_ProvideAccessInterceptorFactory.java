package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvideAccessInterceptorFactory implements b {
    private final a accessProvider;
    private final a coreSettingsStorageProvider;
    private final a identityManagerProvider;
    private final a storageProvider;

    public ZendeskNetworkModule_ProvideAccessInterceptorFactory(a aVar, a aVar2, a aVar3, a aVar4) {
        this.identityManagerProvider = aVar;
        this.accessProvider = aVar2;
        this.storageProvider = aVar3;
        this.coreSettingsStorageProvider = aVar4;
    }

    public static ZendeskNetworkModule_ProvideAccessInterceptorFactory create(a aVar, a aVar2, a aVar3, a aVar4) {
        return new ZendeskNetworkModule_ProvideAccessInterceptorFactory(aVar, aVar2, aVar3, aVar4);
    }

    public static ZendeskAccessInterceptor provideAccessInterceptor(Object obj, Object obj2, Object obj3, Object obj4) {
        ZendeskAccessInterceptor provideAccessInterceptor = ZendeskNetworkModule.provideAccessInterceptor((IdentityManager) obj, (AccessProvider) obj2, (Storage) obj3, (CoreSettingsStorage) obj4);
        AbstractC2763s0.delta(provideAccessInterceptor);
        return provideAccessInterceptor;
    }

    @Override // Kd.a
    public ZendeskAccessInterceptor get() {
        return provideAccessInterceptor(this.identityManagerProvider.get(), this.accessProvider.get(), this.storageProvider.get(), this.coreSettingsStorageProvider.get());
    }
}
