package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetApplicationConfigurationFactory implements b {
    private final CoreModule module;

    public CoreModule_GetApplicationConfigurationFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetApplicationConfigurationFactory create(CoreModule coreModule) {
        return new CoreModule_GetApplicationConfigurationFactory(coreModule);
    }

    public static ApplicationConfiguration getApplicationConfiguration(CoreModule coreModule) {
        ApplicationConfiguration applicationConfiguration = coreModule.getApplicationConfiguration();
        AbstractC2763s0.delta(applicationConfiguration);
        return applicationConfiguration;
    }

    @Override // Kd.a
    public ApplicationConfiguration get() {
        return getApplicationConfiguration(this.module);
    }
}
