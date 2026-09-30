package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskApplicationModule_ProvideZendeskFactory implements b {
    private final a blipsCoreProvider;
    private final a coreModuleProvider;
    private final a identityManagerProvider;
    private final a legacyIdentityMigratorProvider;
    private final a providerStoreProvider;
    private final a pushRegistrationProvider;
    private final a storageProvider;

    public ZendeskApplicationModule_ProvideZendeskFactory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7) {
        this.storageProvider = aVar;
        this.legacyIdentityMigratorProvider = aVar2;
        this.identityManagerProvider = aVar3;
        this.blipsCoreProvider = aVar4;
        this.pushRegistrationProvider = aVar5;
        this.coreModuleProvider = aVar6;
        this.providerStoreProvider = aVar7;
    }

    public static ZendeskApplicationModule_ProvideZendeskFactory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7) {
        return new ZendeskApplicationModule_ProvideZendeskFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static ZendeskShadow provideZendesk(Object obj, Object obj2, Object obj3, Object obj4, PushRegistrationProvider pushRegistrationProvider, CoreModule coreModule, ProviderStore providerStore) {
        ZendeskShadow provideZendesk = ZendeskApplicationModule.provideZendesk((Storage) obj, (LegacyIdentityMigrator) obj2, (IdentityManager) obj3, (BlipsCoreProvider) obj4, pushRegistrationProvider, coreModule, providerStore);
        AbstractC2763s0.delta(provideZendesk);
        return provideZendesk;
    }

    @Override // Kd.a
    public ZendeskShadow get() {
        return provideZendesk(this.storageProvider.get(), this.legacyIdentityMigratorProvider.get(), this.identityManagerProvider.get(), this.blipsCoreProvider.get(), (PushRegistrationProvider) this.pushRegistrationProvider.get(), (CoreModule) this.coreModuleProvider.get(), (ProviderStore) this.providerStoreProvider.get());
    }
}
