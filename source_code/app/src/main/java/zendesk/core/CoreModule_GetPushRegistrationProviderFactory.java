package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetPushRegistrationProviderFactory implements b {
    private final CoreModule module;

    public CoreModule_GetPushRegistrationProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetPushRegistrationProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetPushRegistrationProviderFactory(coreModule);
    }

    public static PushRegistrationProvider getPushRegistrationProvider(CoreModule coreModule) {
        PushRegistrationProvider pushRegistrationProvider = coreModule.getPushRegistrationProvider();
        AbstractC2763s0.delta(pushRegistrationProvider);
        return pushRegistrationProvider;
    }

    @Override // Kd.a
    public PushRegistrationProvider get() {
        return getPushRegistrationProvider(this.module);
    }
}
