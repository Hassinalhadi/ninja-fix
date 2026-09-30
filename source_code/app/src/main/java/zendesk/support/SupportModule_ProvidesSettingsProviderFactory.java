package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportModule_ProvidesSettingsProviderFactory implements b {
    private final SupportModule module;

    public SupportModule_ProvidesSettingsProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesSettingsProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesSettingsProviderFactory(supportModule);
    }

    public static SupportSettingsProvider providesSettingsProvider(SupportModule supportModule) {
        SupportSettingsProvider providesSettingsProvider = supportModule.providesSettingsProvider();
        AbstractC2763s0.delta(providesSettingsProvider);
        return providesSettingsProvider;
    }

    @Override // Kd.a
    public SupportSettingsProvider get() {
        return providesSettingsProvider(this.module);
    }
}
