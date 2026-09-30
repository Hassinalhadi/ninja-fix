package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.BlipsProvider;

/* loaded from: classes.dex */
public final class ProviderModule_ProvideSupportBlipsProviderFactory implements b {
    private final a blipsProvider;
    private final ProviderModule module;

    public ProviderModule_ProvideSupportBlipsProviderFactory(ProviderModule providerModule, a aVar) {
        this.module = providerModule;
        this.blipsProvider = aVar;
    }

    public static ProviderModule_ProvideSupportBlipsProviderFactory create(ProviderModule providerModule, a aVar) {
        return new ProviderModule_ProvideSupportBlipsProviderFactory(providerModule, aVar);
    }

    public static SupportBlipsProvider provideSupportBlipsProvider(ProviderModule providerModule, BlipsProvider blipsProvider) {
        SupportBlipsProvider provideSupportBlipsProvider = providerModule.provideSupportBlipsProvider(blipsProvider);
        AbstractC2763s0.delta(provideSupportBlipsProvider);
        return provideSupportBlipsProvider;
    }

    @Override // Kd.a
    public SupportBlipsProvider get() {
        return provideSupportBlipsProvider(this.module, (BlipsProvider) this.blipsProvider.get());
    }
}
