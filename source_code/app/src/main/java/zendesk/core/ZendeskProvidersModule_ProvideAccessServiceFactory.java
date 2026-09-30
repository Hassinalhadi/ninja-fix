package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import vg.at;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvideAccessServiceFactory implements b {
    private final a retrofitProvider;

    public ZendeskProvidersModule_ProvideAccessServiceFactory(a aVar) {
        this.retrofitProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideAccessServiceFactory create(a aVar) {
        return new ZendeskProvidersModule_ProvideAccessServiceFactory(aVar);
    }

    public static AccessService provideAccessService(at atVar) {
        AccessService provideAccessService = ZendeskProvidersModule.provideAccessService(atVar);
        AbstractC2763s0.delta(provideAccessService);
        return provideAccessService;
    }

    @Override // Kd.a
    public AccessService get() {
        return provideAccessService((at) this.retrofitProvider.get());
    }
}
