package zendesk.core;

import Kd.a;
import dagger.internal.b;
import java.io.File;
import okhttp3.Cache;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideCacheFactory implements b {
    private final a fileProvider;

    public ZendeskStorageModule_ProvideCacheFactory(a aVar) {
        this.fileProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideCacheFactory create(a aVar) {
        return new ZendeskStorageModule_ProvideCacheFactory(aVar);
    }

    public static Cache provideCache(File file) {
        Cache provideCache = ZendeskStorageModule.provideCache(file);
        AbstractC2763s0.delta(provideCache);
        return provideCache;
    }

    @Override // Kd.a
    public Cache get() {
        return provideCache((File) this.fileProvider.get());
    }
}
