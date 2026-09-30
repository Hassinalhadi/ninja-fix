package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.configurations.ConfigurationHelper;

/* loaded from: classes.dex */
public final class SupportSdkModule_ConfigurationHelperFactory implements b {
    private final SupportSdkModule module;

    public SupportSdkModule_ConfigurationHelperFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static ConfigurationHelper configurationHelper(SupportSdkModule supportSdkModule) {
        ConfigurationHelper configurationHelper = supportSdkModule.configurationHelper();
        AbstractC2763s0.delta(configurationHelper);
        return configurationHelper;
    }

    public static SupportSdkModule_ConfigurationHelperFactory create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ConfigurationHelperFactory(supportSdkModule);
    }

    @Override // Kd.a
    public ConfigurationHelper get() {
        return configurationHelper(this.module);
    }
}
