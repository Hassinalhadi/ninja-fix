package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideSdkStorageFactory implements b {
    private final a memoryCacheProvider;
    private final a sdkBaseStorageProvider;
    private final a sessionStorageProvider;
    private final a settingsStorageProvider;

    public ZendeskStorageModule_ProvideSdkStorageFactory(a aVar, a aVar2, a aVar3, a aVar4) {
        this.settingsStorageProvider = aVar;
        this.sessionStorageProvider = aVar2;
        this.sdkBaseStorageProvider = aVar3;
        this.memoryCacheProvider = aVar4;
    }

    public static ZendeskStorageModule_ProvideSdkStorageFactory create(a aVar, a aVar2, a aVar3, a aVar4) {
        return new ZendeskStorageModule_ProvideSdkStorageFactory(aVar, aVar2, aVar3, aVar4);
    }

    public static Storage provideSdkStorage(Object obj, SessionStorage sessionStorage, BaseStorage baseStorage, MemoryCache memoryCache) {
        Storage provideSdkStorage = ZendeskStorageModule.provideSdkStorage((SettingsStorage) obj, sessionStorage, baseStorage, memoryCache);
        AbstractC2763s0.delta(provideSdkStorage);
        return provideSdkStorage;
    }

    @Override // Kd.a
    public Storage get() {
        return provideSdkStorage(this.settingsStorageProvider.get(), (SessionStorage) this.sessionStorageProvider.get(), (BaseStorage) this.sdkBaseStorageProvider.get(), (MemoryCache) this.memoryCacheProvider.get());
    }
}
