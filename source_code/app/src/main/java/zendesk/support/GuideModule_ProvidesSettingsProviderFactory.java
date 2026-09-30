package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class GuideModule_ProvidesSettingsProviderFactory implements b {
    private final GuideModule module;

    public GuideModule_ProvidesSettingsProviderFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesSettingsProviderFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesSettingsProviderFactory(guideModule);
    }

    public static HelpCenterSettingsProvider providesSettingsProvider(GuideModule guideModule) {
        HelpCenterSettingsProvider providesSettingsProvider = guideModule.providesSettingsProvider();
        AbstractC2763s0.delta(providesSettingsProvider);
        return providesSettingsProvider;
    }

    @Override // Kd.a
    public HelpCenterSettingsProvider get() {
        return providesSettingsProvider(this.module);
    }
}
