package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class GuideProviderModule_ProvideHelpCenterProviderFactory implements b {
    private final a blipsProvider;
    private final a helpCenterServiceProvider;
    private final a helpCenterSessionCacheProvider;
    private final GuideProviderModule module;
    private final a settingsProvider;

    public GuideProviderModule_ProvideHelpCenterProviderFactory(GuideProviderModule guideProviderModule, a aVar, a aVar2, a aVar3, a aVar4) {
        this.module = guideProviderModule;
        this.settingsProvider = aVar;
        this.blipsProvider = aVar2;
        this.helpCenterServiceProvider = aVar3;
        this.helpCenterSessionCacheProvider = aVar4;
    }

    public static GuideProviderModule_ProvideHelpCenterProviderFactory create(GuideProviderModule guideProviderModule, a aVar, a aVar2, a aVar3, a aVar4) {
        return new GuideProviderModule_ProvideHelpCenterProviderFactory(guideProviderModule, aVar, aVar2, aVar3, aVar4);
    }

    public static HelpCenterProvider provideHelpCenterProvider(GuideProviderModule guideProviderModule, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, Object obj, Object obj2) {
        HelpCenterProvider provideHelpCenterProvider = guideProviderModule.provideHelpCenterProvider(helpCenterSettingsProvider, helpCenterBlipsProvider, (ZendeskHelpCenterService) obj, (HelpCenterSessionCache) obj2);
        AbstractC2763s0.delta(provideHelpCenterProvider);
        return provideHelpCenterProvider;
    }

    @Override // Kd.a
    public HelpCenterProvider get() {
        return provideHelpCenterProvider(this.module, (HelpCenterSettingsProvider) this.settingsProvider.get(), (HelpCenterBlipsProvider) this.blipsProvider.get(), this.helpCenterServiceProvider.get(), this.helpCenterSessionCacheProvider.get());
    }
}
