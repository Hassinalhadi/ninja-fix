package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import vg.at;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvidePushRegistrationServiceFactory implements b {
    private final a retrofitProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(a aVar) {
        this.retrofitProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationServiceFactory create(a aVar) {
        return new ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(aVar);
    }

    public static PushRegistrationService providePushRegistrationService(at atVar) {
        PushRegistrationService providePushRegistrationService = ZendeskProvidersModule.providePushRegistrationService(atVar);
        AbstractC2763s0.delta(providePushRegistrationService);
        return providePushRegistrationService;
    }

    @Override // Kd.a
    public PushRegistrationService get() {
        return providePushRegistrationService((at) this.retrofitProvider.get());
    }
}
