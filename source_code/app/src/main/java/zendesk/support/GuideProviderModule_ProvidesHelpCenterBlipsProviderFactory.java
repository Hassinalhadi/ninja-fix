package zendesk.support;

import Kd.a;
import dagger.internal.b;
import java.util.Locale;
import s6.AbstractC2763s0;
import zendesk.core.BlipsProvider;

/* loaded from: classes.dex */
public final class GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory implements b {
    private final a blipsProvider;
    private final a localeProvider;
    private final GuideProviderModule module;

    public GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory(GuideProviderModule guideProviderModule, a aVar, a aVar2) {
        this.module = guideProviderModule;
        this.blipsProvider = aVar;
        this.localeProvider = aVar2;
    }

    public static GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory create(GuideProviderModule guideProviderModule, a aVar, a aVar2) {
        return new GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory(guideProviderModule, aVar, aVar2);
    }

    public static HelpCenterBlipsProvider providesHelpCenterBlipsProvider(GuideProviderModule guideProviderModule, BlipsProvider blipsProvider, Locale locale) {
        HelpCenterBlipsProvider providesHelpCenterBlipsProvider = guideProviderModule.providesHelpCenterBlipsProvider(blipsProvider, locale);
        AbstractC2763s0.delta(providesHelpCenterBlipsProvider);
        return providesHelpCenterBlipsProvider;
    }

    @Override // Kd.a
    public HelpCenterBlipsProvider get() {
        return providesHelpCenterBlipsProvider(this.module, (BlipsProvider) this.blipsProvider.get(), (Locale) this.localeProvider.get());
    }
}
