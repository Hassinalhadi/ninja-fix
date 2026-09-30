package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProviderBlipsProviderFactory implements b {
    private final a zendeskBlipsProvider;

    public ZendeskProvidersModule_ProviderBlipsProviderFactory(a aVar) {
        this.zendeskBlipsProvider = aVar;
    }

    public static ZendeskProvidersModule_ProviderBlipsProviderFactory create(a aVar) {
        return new ZendeskProvidersModule_ProviderBlipsProviderFactory(aVar);
    }

    public static BlipsProvider providerBlipsProvider(Object obj) {
        BlipsProvider providerBlipsProvider = ZendeskProvidersModule.providerBlipsProvider((ZendeskBlipsProvider) obj);
        AbstractC2763s0.delta(providerBlipsProvider);
        return providerBlipsProvider;
    }

    @Override // Kd.a
    public BlipsProvider get() {
        return providerBlipsProvider(this.zendeskBlipsProvider.get());
    }
}
