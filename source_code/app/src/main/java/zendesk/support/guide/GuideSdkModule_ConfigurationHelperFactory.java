package zendesk.support.guide;

import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.configurations.ConfigurationHelper;

/* loaded from: classes.dex */
public final class GuideSdkModule_ConfigurationHelperFactory implements b {
    private final GuideSdkModule module;

    public GuideSdkModule_ConfigurationHelperFactory(GuideSdkModule guideSdkModule) {
        this.module = guideSdkModule;
    }

    public static ConfigurationHelper configurationHelper(GuideSdkModule guideSdkModule) {
        ConfigurationHelper configurationHelper = guideSdkModule.configurationHelper();
        AbstractC2763s0.delta(configurationHelper);
        return configurationHelper;
    }

    public static GuideSdkModule_ConfigurationHelperFactory create(GuideSdkModule guideSdkModule) {
        return new GuideSdkModule_ConfigurationHelperFactory(guideSdkModule);
    }

    @Override // Kd.a
    public ConfigurationHelper get() {
        return configurationHelper(this.module);
    }
}
