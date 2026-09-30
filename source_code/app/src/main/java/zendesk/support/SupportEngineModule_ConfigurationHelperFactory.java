package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.configurations.ConfigurationHelper;

/* loaded from: classes.dex */
public final class SupportEngineModule_ConfigurationHelperFactory implements b {
    private final SupportEngineModule module;

    public SupportEngineModule_ConfigurationHelperFactory(SupportEngineModule supportEngineModule) {
        this.module = supportEngineModule;
    }

    public static ConfigurationHelper configurationHelper(SupportEngineModule supportEngineModule) {
        ConfigurationHelper configurationHelper = supportEngineModule.configurationHelper();
        AbstractC2763s0.delta(configurationHelper);
        return configurationHelper;
    }

    public static SupportEngineModule_ConfigurationHelperFactory create(SupportEngineModule supportEngineModule) {
        return new SupportEngineModule_ConfigurationHelperFactory(supportEngineModule);
    }

    @Override // Kd.a
    public ConfigurationHelper get() {
        return configurationHelper(this.module);
    }
}
