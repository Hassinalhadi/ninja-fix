package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetBlipsProviderFactory implements b {
    private final CoreModule module;

    public CoreModule_GetBlipsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetBlipsProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetBlipsProviderFactory(coreModule);
    }

    public static BlipsProvider getBlipsProvider(CoreModule coreModule) {
        BlipsProvider blipsProvider = coreModule.getBlipsProvider();
        AbstractC2763s0.delta(blipsProvider);
        return blipsProvider;
    }

    @Override // Kd.a
    public BlipsProvider get() {
        return getBlipsProvider(this.module);
    }
}
