package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetSettingsProviderFactory implements b {
    private final CoreModule module;

    public CoreModule_GetSettingsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetSettingsProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetSettingsProviderFactory(coreModule);
    }

    public static SettingsProvider getSettingsProvider(CoreModule coreModule) {
        SettingsProvider settingsProvider = coreModule.getSettingsProvider();
        AbstractC2763s0.delta(settingsProvider);
        return settingsProvider;
    }

    @Override // Kd.a
    public SettingsProvider get() {
        return getSettingsProvider(this.module);
    }
}
