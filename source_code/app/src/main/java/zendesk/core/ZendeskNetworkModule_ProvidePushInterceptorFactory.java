package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvidePushInterceptorFactory implements b {
    private final a identityStorageProvider;
    private final a pushDeviceIdStorageProvider;
    private final a pushProvider;

    public ZendeskNetworkModule_ProvidePushInterceptorFactory(a aVar, a aVar2, a aVar3) {
        this.pushProvider = aVar;
        this.pushDeviceIdStorageProvider = aVar2;
        this.identityStorageProvider = aVar3;
    }

    public static ZendeskNetworkModule_ProvidePushInterceptorFactory create(a aVar, a aVar2, a aVar3) {
        return new ZendeskNetworkModule_ProvidePushInterceptorFactory(aVar, aVar2, aVar3);
    }

    public static ZendeskPushInterceptor providePushInterceptor(Object obj, Object obj2, Object obj3) {
        ZendeskPushInterceptor providePushInterceptor = ZendeskNetworkModule.providePushInterceptor((PushRegistrationProviderInternal) obj, (PushDeviceIdStorage) obj2, (IdentityStorage) obj3);
        AbstractC2763s0.delta(providePushInterceptor);
        return providePushInterceptor;
    }

    @Override // Kd.a
    public ZendeskPushInterceptor get() {
        return providePushInterceptor(this.pushProvider.get(), this.pushDeviceIdStorageProvider.get(), this.identityStorageProvider.get());
    }
}
