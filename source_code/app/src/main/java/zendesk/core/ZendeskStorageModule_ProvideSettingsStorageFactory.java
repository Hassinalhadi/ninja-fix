package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideSettingsStorageFactory implements b {
    private final a baseStorageProvider;

    public ZendeskStorageModule_ProvideSettingsStorageFactory(a aVar) {
        this.baseStorageProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideSettingsStorageFactory create(a aVar) {
        return new ZendeskStorageModule_ProvideSettingsStorageFactory(aVar);
    }

    public static SettingsStorage provideSettingsStorage(BaseStorage baseStorage) {
        SettingsStorage provideSettingsStorage = ZendeskStorageModule.provideSettingsStorage(baseStorage);
        AbstractC2763s0.delta(provideSettingsStorage);
        return provideSettingsStorage;
    }

    @Override // Kd.a
    public SettingsStorage get() {
        return provideSettingsStorage((BaseStorage) this.baseStorageProvider.get());
    }
}
