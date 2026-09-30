package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvideProviderStoreFactory implements b {
    private final a pushRegistrationProvider;
    private final a userProvider;

    public ZendeskProvidersModule_ProvideProviderStoreFactory(a aVar, a aVar2) {
        this.userProvider = aVar;
        this.pushRegistrationProvider = aVar2;
    }

    public static ZendeskProvidersModule_ProvideProviderStoreFactory create(a aVar, a aVar2) {
        return new ZendeskProvidersModule_ProvideProviderStoreFactory(aVar, aVar2);
    }

    public static ProviderStore provideProviderStore(UserProvider userProvider, PushRegistrationProvider pushRegistrationProvider) {
        ProviderStore provideProviderStore = ZendeskProvidersModule.provideProviderStore(userProvider, pushRegistrationProvider);
        AbstractC2763s0.delta(provideProviderStore);
        return provideProviderStore;
    }

    @Override // Kd.a
    public ProviderStore get() {
        return provideProviderStore((UserProvider) this.userProvider.get(), (PushRegistrationProvider) this.pushRegistrationProvider.get());
    }
}
