package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideCoreSettingsStorageFactory implements b {
    private final a settingsStorageProvider;

    public ZendeskStorageModule_ProvideCoreSettingsStorageFactory(a aVar) {
        this.settingsStorageProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideCoreSettingsStorageFactory create(a aVar) {
        return new ZendeskStorageModule_ProvideCoreSettingsStorageFactory(aVar);
    }

    public static CoreSettingsStorage provideCoreSettingsStorage(Object obj) {
        CoreSettingsStorage provideCoreSettingsStorage = ZendeskStorageModule.provideCoreSettingsStorage((SettingsStorage) obj);
        AbstractC2763s0.delta(provideCoreSettingsStorage);
        return provideCoreSettingsStorage;
    }

    @Override // Kd.a
    public CoreSettingsStorage get() {
        return provideCoreSettingsStorage(this.settingsStorageProvider.get());
    }
}
