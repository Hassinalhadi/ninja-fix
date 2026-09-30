package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory implements b {
    private final a pushRegistrationProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory(a aVar) {
        this.pushRegistrationProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory create(a aVar) {
        return new ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory(aVar);
    }

    public static PushRegistrationProviderInternal providePushRegistrationProviderInternal(PushRegistrationProvider pushRegistrationProvider) {
        PushRegistrationProviderInternal providePushRegistrationProviderInternal = ZendeskProvidersModule.providePushRegistrationProviderInternal(pushRegistrationProvider);
        AbstractC2763s0.delta(providePushRegistrationProviderInternal);
        return providePushRegistrationProviderInternal;
    }

    @Override // Kd.a
    public PushRegistrationProviderInternal get() {
        return providePushRegistrationProviderInternal((PushRegistrationProvider) this.pushRegistrationProvider.get());
    }
}
