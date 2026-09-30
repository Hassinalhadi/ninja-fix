package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskApplicationModule_ProvideApplicationConfigurationFactory implements b {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationConfigurationFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideApplicationConfigurationFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationConfigurationFactory(zendeskApplicationModule);
    }

    public static ApplicationConfiguration provideApplicationConfiguration(ZendeskApplicationModule zendeskApplicationModule) {
        ApplicationConfiguration provideApplicationConfiguration = zendeskApplicationModule.provideApplicationConfiguration();
        AbstractC2763s0.delta(provideApplicationConfiguration);
        return provideApplicationConfiguration;
    }

    @Override // Kd.a
    public ApplicationConfiguration get() {
        return provideApplicationConfiguration(this.module);
    }
}
