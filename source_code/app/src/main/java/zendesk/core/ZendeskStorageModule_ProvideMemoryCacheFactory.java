package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideMemoryCacheFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final ZendeskStorageModule_ProvideMemoryCacheFactory INSTANCE = new ZendeskStorageModule_ProvideMemoryCacheFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskStorageModule_ProvideMemoryCacheFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MemoryCache provideMemoryCache() {
        MemoryCache provideMemoryCache = ZendeskStorageModule.provideMemoryCache();
        AbstractC2763s0.delta(provideMemoryCache);
        return provideMemoryCache;
    }

    @Override // Kd.a
    public MemoryCache get() {
        return provideMemoryCache();
    }
}
