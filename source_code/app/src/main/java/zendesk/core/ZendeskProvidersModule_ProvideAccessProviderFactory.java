package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvideAccessProviderFactory implements b {
    private final a accessServiceProvider;
    private final a identityManagerProvider;

    public ZendeskProvidersModule_ProvideAccessProviderFactory(a aVar, a aVar2) {
        this.identityManagerProvider = aVar;
        this.accessServiceProvider = aVar2;
    }

    public static ZendeskProvidersModule_ProvideAccessProviderFactory create(a aVar, a aVar2) {
        return new ZendeskProvidersModule_ProvideAccessProviderFactory(aVar, aVar2);
    }

    public static AccessProvider provideAccessProvider(Object obj, Object obj2) {
        AccessProvider provideAccessProvider = ZendeskProvidersModule.provideAccessProvider((IdentityManager) obj, (AccessService) obj2);
        AbstractC2763s0.delta(provideAccessProvider);
        return provideAccessProvider;
    }

    @Override // Kd.a
    public AccessProvider get() {
        return provideAccessProvider(this.identityManagerProvider.get(), this.accessServiceProvider.get());
    }
}
