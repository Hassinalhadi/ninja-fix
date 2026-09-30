package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetMemoryCacheFactory implements b {
    private final CoreModule module;

    public CoreModule_GetMemoryCacheFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetMemoryCacheFactory create(CoreModule coreModule) {
        return new CoreModule_GetMemoryCacheFactory(coreModule);
    }

    public static MemoryCache getMemoryCache(CoreModule coreModule) {
        MemoryCache memoryCache = coreModule.getMemoryCache();
        AbstractC2763s0.delta(memoryCache);
        return memoryCache;
    }

    @Override // Kd.a
    public MemoryCache get() {
        return getMemoryCache(this.module);
    }
}
