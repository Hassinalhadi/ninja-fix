package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportModule_ProvidesHelpCenterProviderFactory implements b {
    private final SupportModule module;

    public SupportModule_ProvidesHelpCenterProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesHelpCenterProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesHelpCenterProviderFactory(supportModule);
    }

    public static HelpCenterProvider providesHelpCenterProvider(SupportModule supportModule) {
        HelpCenterProvider providesHelpCenterProvider = supportModule.providesHelpCenterProvider();
        AbstractC2763s0.delta(providesHelpCenterProvider);
        return providesHelpCenterProvider;
    }

    @Override // Kd.a
    public HelpCenterProvider get() {
        return providesHelpCenterProvider(this.module);
    }
}
