package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class StorageModule_ProvideRequestSessionCacheFactory implements b {
    private final StorageModule module;

    public StorageModule_ProvideRequestSessionCacheFactory(StorageModule storageModule) {
        this.module = storageModule;
    }

    public static StorageModule_ProvideRequestSessionCacheFactory create(StorageModule storageModule) {
        return new StorageModule_ProvideRequestSessionCacheFactory(storageModule);
    }

    public static RequestSessionCache provideRequestSessionCache(StorageModule storageModule) {
        RequestSessionCache provideRequestSessionCache = storageModule.provideRequestSessionCache();
        AbstractC2763s0.delta(provideRequestSessionCache);
        return provideRequestSessionCache;
    }

    @Override // Kd.a
    public RequestSessionCache get() {
        return provideRequestSessionCache(this.module);
    }
}
