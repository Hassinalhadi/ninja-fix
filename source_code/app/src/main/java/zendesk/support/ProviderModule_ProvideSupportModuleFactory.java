package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.RestServiceProvider;

/* loaded from: classes.dex */
public final class ProviderModule_ProvideSupportModuleFactory implements b {
    private final a articleVoteStorageProvider;
    private final a blipsProvider;
    private final a helpCenterProvider;
    private final ProviderModule module;
    private final a requestProvider;
    private final a restServiceProvider;
    private final a settingsProvider;
    private final a uploadProvider;
    private final a zendeskTrackerProvider;

    public ProviderModule_ProvideSupportModuleFactory(ProviderModule providerModule, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8) {
        this.module = providerModule;
        this.requestProvider = aVar;
        this.uploadProvider = aVar2;
        this.helpCenterProvider = aVar3;
        this.settingsProvider = aVar4;
        this.restServiceProvider = aVar5;
        this.blipsProvider = aVar6;
        this.zendeskTrackerProvider = aVar7;
        this.articleVoteStorageProvider = aVar8;
    }

    public static ProviderModule_ProvideSupportModuleFactory create(ProviderModule providerModule, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8) {
        return new ProviderModule_ProvideSupportModuleFactory(providerModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static SupportModule provideSupportModule(ProviderModule providerModule, RequestProvider requestProvider, UploadProvider uploadProvider, HelpCenterProvider helpCenterProvider, SupportSettingsProvider supportSettingsProvider, RestServiceProvider restServiceProvider, SupportBlipsProvider supportBlipsProvider, Object obj, ArticleVoteStorage articleVoteStorage) {
        SupportModule provideSupportModule = providerModule.provideSupportModule(requestProvider, uploadProvider, helpCenterProvider, supportSettingsProvider, restServiceProvider, supportBlipsProvider, (ZendeskTracker) obj, articleVoteStorage);
        AbstractC2763s0.delta(provideSupportModule);
        return provideSupportModule;
    }

    @Override // Kd.a
    public SupportModule get() {
        return provideSupportModule(this.module, (RequestProvider) this.requestProvider.get(), (UploadProvider) this.uploadProvider.get(), (HelpCenterProvider) this.helpCenterProvider.get(), (SupportSettingsProvider) this.settingsProvider.get(), (RestServiceProvider) this.restServiceProvider.get(), (SupportBlipsProvider) this.blipsProvider.get(), this.zendeskTrackerProvider.get(), (ArticleVoteStorage) this.articleVoteStorageProvider.get());
    }
}
