package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class GuideModule_ProvidesHelpCenterProviderFactory implements b {
    private final GuideModule module;

    public GuideModule_ProvidesHelpCenterProviderFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesHelpCenterProviderFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesHelpCenterProviderFactory(guideModule);
    }

    public static HelpCenterProvider providesHelpCenterProvider(GuideModule guideModule) {
        HelpCenterProvider providesHelpCenterProvider = guideModule.providesHelpCenterProvider();
        AbstractC2763s0.delta(providesHelpCenterProvider);
        return providesHelpCenterProvider;
    }

    @Override // Kd.a
    public HelpCenterProvider get() {
        return providesHelpCenterProvider(this.module);
    }
}
