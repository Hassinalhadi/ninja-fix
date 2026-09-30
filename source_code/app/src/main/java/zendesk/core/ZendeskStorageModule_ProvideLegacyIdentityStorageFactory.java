package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideLegacyIdentityStorageFactory implements b {
    private final a identityManagerProvider;
    private final a identityStorageProvider;
    private final a legacyIdentityBaseStorageProvider;
    private final a legacyPushBaseStorageProvider;
    private final a pushDeviceIdStorageProvider;

    public ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.legacyIdentityBaseStorageProvider = aVar;
        this.legacyPushBaseStorageProvider = aVar2;
        this.identityStorageProvider = aVar3;
        this.identityManagerProvider = aVar4;
        this.pushDeviceIdStorageProvider = aVar5;
    }

    public static ZendeskStorageModule_ProvideLegacyIdentityStorageFactory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static LegacyIdentityMigrator provideLegacyIdentityStorage(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        LegacyIdentityMigrator provideLegacyIdentityStorage = ZendeskStorageModule.provideLegacyIdentityStorage((SharedPreferencesStorage) obj, (SharedPreferencesStorage) obj2, (IdentityStorage) obj3, (IdentityManager) obj4, (PushDeviceIdStorage) obj5);
        AbstractC2763s0.delta(provideLegacyIdentityStorage);
        return provideLegacyIdentityStorage;
    }

    @Override // Kd.a
    public LegacyIdentityMigrator get() {
        return provideLegacyIdentityStorage(this.legacyIdentityBaseStorageProvider.get(), this.legacyPushBaseStorageProvider.get(), this.identityStorageProvider.get(), this.identityManagerProvider.get(), this.pushDeviceIdStorageProvider.get());
    }
}
