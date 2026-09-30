package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProviderBlipsCoreProviderFactory implements b {
    private final a zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(a aVar) {
        this.zendeskBlipsProvider = aVar;
    }

    public static ZendeskProvidersModule_ProviderBlipsCoreProviderFactory create(a aVar) {
        return new ZendeskProvidersModule_ProviderBlipsCoreProviderFactory(aVar);
    }

    public static BlipsCoreProvider providerBlipsCoreProvider(Object obj) {
        BlipsCoreProvider providerBlipsCoreProvider = ZendeskProvidersModule.providerBlipsCoreProvider((ZendeskBlipsProvider) obj);
        AbstractC2763s0.delta(providerBlipsCoreProvider);
        return providerBlipsCoreProvider;
    }

    @Override // Kd.a
    public BlipsCoreProvider get() {
        return providerBlipsCoreProvider(this.zendeskBlipsProvider.get());
    }
}
