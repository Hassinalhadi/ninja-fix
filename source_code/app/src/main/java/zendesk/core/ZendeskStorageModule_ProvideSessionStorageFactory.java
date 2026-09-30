package zendesk.core;

import Kd.a;
import dagger.internal.b;
import java.io.File;
import okhttp3.Cache;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideSessionStorageFactory implements b {
    private final a additionalSdkStorageProvider;
    private final a belvedereDirProvider;
    private final a cacheDirProvider;
    private final a cacheProvider;
    private final a dataDirProvider;
    private final a identityStorageProvider;
    private final a mediaCacheProvider;

    public ZendeskStorageModule_ProvideSessionStorageFactory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7) {
        this.identityStorageProvider = aVar;
        this.additionalSdkStorageProvider = aVar2;
        this.mediaCacheProvider = aVar3;
        this.cacheProvider = aVar4;
        this.cacheDirProvider = aVar5;
        this.dataDirProvider = aVar6;
        this.belvedereDirProvider = aVar7;
    }

    public static ZendeskStorageModule_ProvideSessionStorageFactory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7) {
        return new ZendeskStorageModule_ProvideSessionStorageFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static SessionStorage provideSessionStorage(Object obj, BaseStorage baseStorage, BaseStorage baseStorage2, Cache cache, File file, File file2, File file3) {
        SessionStorage provideSessionStorage = ZendeskStorageModule.provideSessionStorage((IdentityStorage) obj, baseStorage, baseStorage2, cache, file, file2, file3);
        AbstractC2763s0.delta(provideSessionStorage);
        return provideSessionStorage;
    }

    @Override // Kd.a
    public SessionStorage get() {
        return provideSessionStorage(this.identityStorageProvider.get(), (BaseStorage) this.additionalSdkStorageProvider.get(), (BaseStorage) this.mediaCacheProvider.get(), (Cache) this.cacheProvider.get(), (File) this.cacheDirProvider.get(), (File) this.dataDirProvider.get(), (File) this.belvedereDirProvider.get());
    }
}
