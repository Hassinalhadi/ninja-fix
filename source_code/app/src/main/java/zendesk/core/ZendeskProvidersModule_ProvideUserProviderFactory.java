package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvideUserProviderFactory implements b {
    private final a userServiceProvider;

    public ZendeskProvidersModule_ProvideUserProviderFactory(a aVar) {
        this.userServiceProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideUserProviderFactory create(a aVar) {
        return new ZendeskProvidersModule_ProvideUserProviderFactory(aVar);
    }

    public static UserProvider provideUserProvider(Object obj) {
        UserProvider provideUserProvider = ZendeskProvidersModule.provideUserProvider((UserService) obj);
        AbstractC2763s0.delta(provideUserProvider);
        return provideUserProvider;
    }

    @Override // Kd.a
    public UserProvider get() {
        return provideUserProvider(this.userServiceProvider.get());
    }
}
