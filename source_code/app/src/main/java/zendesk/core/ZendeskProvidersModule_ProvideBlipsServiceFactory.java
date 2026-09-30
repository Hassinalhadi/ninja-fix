package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import vg.at;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvideBlipsServiceFactory implements b {
    private final a retrofitProvider;

    public ZendeskProvidersModule_ProvideBlipsServiceFactory(a aVar) {
        this.retrofitProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideBlipsServiceFactory create(a aVar) {
        return new ZendeskProvidersModule_ProvideBlipsServiceFactory(aVar);
    }

    public static BlipsService provideBlipsService(at atVar) {
        BlipsService provideBlipsService = ZendeskProvidersModule.provideBlipsService(atVar);
        AbstractC2763s0.delta(provideBlipsService);
        return provideBlipsService;
    }

    @Override // Kd.a
    public BlipsService get() {
        return provideBlipsService((at) this.retrofitProvider.get());
    }
}
