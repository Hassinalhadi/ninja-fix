package zendesk.core;

import Kd.a;
import dagger.internal.b;
import java.util.concurrent.ExecutorService;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory implements b {
    private final a applicationConfigurationProvider;
    private final a blipsServiceProvider;
    private final a coreSettingsStorageProvider;
    private final a deviceInfoProvider;
    private final a executorProvider;
    private final a identityManagerProvider;
    private final a serializerProvider;

    public ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7) {
        this.blipsServiceProvider = aVar;
        this.deviceInfoProvider = aVar2;
        this.serializerProvider = aVar3;
        this.identityManagerProvider = aVar4;
        this.applicationConfigurationProvider = aVar5;
        this.coreSettingsStorageProvider = aVar6;
        this.executorProvider = aVar7;
    }

    public static ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7) {
        return new ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static ZendeskBlipsProvider providerZendeskBlipsProvider(Object obj, Object obj2, Object obj3, Object obj4, ApplicationConfiguration applicationConfiguration, Object obj5, ExecutorService executorService) {
        ZendeskBlipsProvider providerZendeskBlipsProvider = ZendeskProvidersModule.providerZendeskBlipsProvider((BlipsService) obj, (DeviceInfo) obj2, (Serializer) obj3, (IdentityManager) obj4, applicationConfiguration, (CoreSettingsStorage) obj5, executorService);
        AbstractC2763s0.delta(providerZendeskBlipsProvider);
        return providerZendeskBlipsProvider;
    }

    @Override // Kd.a
    public ZendeskBlipsProvider get() {
        return providerZendeskBlipsProvider(this.blipsServiceProvider.get(), this.deviceInfoProvider.get(), this.serializerProvider.get(), this.identityManagerProvider.get(), (ApplicationConfiguration) this.applicationConfigurationProvider.get(), this.coreSettingsStorageProvider.get(), (ExecutorService) this.executorProvider.get());
    }
}
