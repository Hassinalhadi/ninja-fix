package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.AuthenticationProvider;

/* loaded from: classes.dex */
public final class ProviderModule_ProvideRequestProviderFactory implements b {
    private final a authenticationProvider;
    private final a blipsProvider;
    private final ProviderModule module;
    private final a requestServiceProvider;
    private final a requestSessionCacheProvider;
    private final a requestStorageProvider;
    private final a settingsProvider;
    private final a supportSdkMetadataProvider;
    private final a zendeskTrackerProvider;

    public ProviderModule_ProvideRequestProviderFactory(ProviderModule providerModule, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8) {
        this.module = providerModule;
        this.settingsProvider = aVar;
        this.authenticationProvider = aVar2;
        this.requestServiceProvider = aVar3;
        this.requestStorageProvider = aVar4;
        this.requestSessionCacheProvider = aVar5;
        this.zendeskTrackerProvider = aVar6;
        this.supportSdkMetadataProvider = aVar7;
        this.blipsProvider = aVar8;
    }

    public static ProviderModule_ProvideRequestProviderFactory create(ProviderModule providerModule, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8) {
        return new ProviderModule_ProvideRequestProviderFactory(providerModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static RequestProvider provideRequestProvider(ProviderModule providerModule, SupportSettingsProvider supportSettingsProvider, AuthenticationProvider authenticationProvider, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, SupportBlipsProvider supportBlipsProvider) {
        RequestProvider provideRequestProvider = providerModule.provideRequestProvider(supportSettingsProvider, authenticationProvider, (ZendeskRequestService) obj, (RequestStorage) obj2, (RequestSessionCache) obj3, (ZendeskTracker) obj4, (SupportSdkMetadata) obj5, supportBlipsProvider);
        AbstractC2763s0.delta(provideRequestProvider);
        return provideRequestProvider;
    }

    @Override // Kd.a
    public RequestProvider get() {
        return provideRequestProvider(this.module, (SupportSettingsProvider) this.settingsProvider.get(), (AuthenticationProvider) this.authenticationProvider.get(), this.requestServiceProvider.get(), this.requestStorageProvider.get(), this.requestSessionCacheProvider.get(), this.zendeskTrackerProvider.get(), this.supportSdkMetadataProvider.get(), (SupportBlipsProvider) this.blipsProvider.get());
    }
}
