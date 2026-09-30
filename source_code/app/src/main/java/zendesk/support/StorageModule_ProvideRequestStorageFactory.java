package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.MemoryCache;
import zendesk.core.SessionStorage;

/* loaded from: classes.dex */
public final class StorageModule_ProvideRequestStorageFactory implements b {
    private final a baseStorageProvider;
    private final a memoryCacheProvider;
    private final StorageModule module;
    private final a requestMigratorProvider;

    public StorageModule_ProvideRequestStorageFactory(StorageModule storageModule, a aVar, a aVar2, a aVar3) {
        this.module = storageModule;
        this.baseStorageProvider = aVar;
        this.requestMigratorProvider = aVar2;
        this.memoryCacheProvider = aVar3;
    }

    public static StorageModule_ProvideRequestStorageFactory create(StorageModule storageModule, a aVar, a aVar2, a aVar3) {
        return new StorageModule_ProvideRequestStorageFactory(storageModule, aVar, aVar2, aVar3);
    }

    public static RequestStorage provideRequestStorage(StorageModule storageModule, SessionStorage sessionStorage, Object obj, MemoryCache memoryCache) {
        RequestStorage provideRequestStorage = storageModule.provideRequestStorage(sessionStorage, (RequestMigrator) obj, memoryCache);
        AbstractC2763s0.delta(provideRequestStorage);
        return provideRequestStorage;
    }

    @Override // Kd.a
    public RequestStorage get() {
        return provideRequestStorage(this.module, (SessionStorage) this.baseStorageProvider.get(), this.requestMigratorProvider.get(), (MemoryCache) this.memoryCacheProvider.get());
    }
}
