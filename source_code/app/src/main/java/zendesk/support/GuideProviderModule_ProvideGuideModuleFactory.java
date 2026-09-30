package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.RestServiceProvider;

/* loaded from: classes.dex */
public final class GuideProviderModule_ProvideGuideModuleFactory implements b {
    private final a articleVoteStorageProvider;
    private final a blipsProvider;
    private final a helpCenterProvider;
    private final GuideProviderModule module;
    private final a restServiceProvider;
    private final a settingsProvider;

    public GuideProviderModule_ProvideGuideModuleFactory(GuideProviderModule guideProviderModule, a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.module = guideProviderModule;
        this.helpCenterProvider = aVar;
        this.settingsProvider = aVar2;
        this.blipsProvider = aVar3;
        this.articleVoteStorageProvider = aVar4;
        this.restServiceProvider = aVar5;
    }

    public static GuideProviderModule_ProvideGuideModuleFactory create(GuideProviderModule guideProviderModule, a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new GuideProviderModule_ProvideGuideModuleFactory(guideProviderModule, aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static GuideModule provideGuideModule(GuideProviderModule guideProviderModule, HelpCenterProvider helpCenterProvider, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ArticleVoteStorage articleVoteStorage, RestServiceProvider restServiceProvider) {
        GuideModule provideGuideModule = guideProviderModule.provideGuideModule(helpCenterProvider, helpCenterSettingsProvider, helpCenterBlipsProvider, articleVoteStorage, restServiceProvider);
        AbstractC2763s0.delta(provideGuideModule);
        return provideGuideModule;
    }

    @Override // Kd.a
    public GuideModule get() {
        return provideGuideModule(this.module, (HelpCenterProvider) this.helpCenterProvider.get(), (HelpCenterSettingsProvider) this.settingsProvider.get(), (HelpCenterBlipsProvider) this.blipsProvider.get(), (ArticleVoteStorage) this.articleVoteStorageProvider.get(), (RestServiceProvider) this.restServiceProvider.get());
    }
}
