package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class GuideModule_ProvidesBlipsProviderFactory implements b {
    private final GuideModule module;

    public GuideModule_ProvidesBlipsProviderFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesBlipsProviderFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesBlipsProviderFactory(guideModule);
    }

    public static HelpCenterBlipsProvider providesBlipsProvider(GuideModule guideModule) {
        HelpCenterBlipsProvider providesBlipsProvider = guideModule.providesBlipsProvider();
        AbstractC2763s0.delta(providesBlipsProvider);
        return providesBlipsProvider;
    }

    @Override // Kd.a
    public HelpCenterBlipsProvider get() {
        return providesBlipsProvider(this.module);
    }
}
