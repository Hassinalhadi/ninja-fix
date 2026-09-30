package zendesk.support;

import Kd.a;
import dagger.internal.b;
import i9.f;
import s6.AbstractC2763s0;
import zendesk.core.SessionStorage;

/* loaded from: classes.dex */
public final class SupportSdkModule_ProvidesRequestDiskLruCacheFactory implements b {
    private final SupportSdkModule module;
    private final a sessionStorageProvider;

    public SupportSdkModule_ProvidesRequestDiskLruCacheFactory(SupportSdkModule supportSdkModule, a aVar) {
        this.module = supportSdkModule;
        this.sessionStorageProvider = aVar;
    }

    public static SupportSdkModule_ProvidesRequestDiskLruCacheFactory create(SupportSdkModule supportSdkModule, a aVar) {
        return new SupportSdkModule_ProvidesRequestDiskLruCacheFactory(supportSdkModule, aVar);
    }

    public static f providesRequestDiskLruCache(SupportSdkModule supportSdkModule, SessionStorage sessionStorage) {
        f providesRequestDiskLruCache = supportSdkModule.providesRequestDiskLruCache(sessionStorage);
        AbstractC2763s0.delta(providesRequestDiskLruCache);
        return providesRequestDiskLruCache;
    }

    @Override // Kd.a
    public f get() {
        return providesRequestDiskLruCache(this.module, (SessionStorage) this.sessionStorageProvider.get());
    }
}
