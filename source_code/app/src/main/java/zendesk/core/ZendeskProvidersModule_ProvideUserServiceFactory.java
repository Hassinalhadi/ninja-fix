package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import vg.at;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvideUserServiceFactory implements b {
    private final a retrofitProvider;

    public ZendeskProvidersModule_ProvideUserServiceFactory(a aVar) {
        this.retrofitProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideUserServiceFactory create(a aVar) {
        return new ZendeskProvidersModule_ProvideUserServiceFactory(aVar);
    }

    public static UserService provideUserService(at atVar) {
        UserService provideUserService = ZendeskProvidersModule.provideUserService(atVar);
        AbstractC2763s0.delta(provideUserService);
        return provideUserService;
    }

    @Override // Kd.a
    public UserService get() {
        return provideUserService((at) this.retrofitProvider.get());
    }
}
