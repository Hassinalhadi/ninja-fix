package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportModule_ProvidesBlipsProviderFactory implements b {
    private final SupportModule module;

    public SupportModule_ProvidesBlipsProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesBlipsProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesBlipsProviderFactory(supportModule);
    }

    public static SupportBlipsProvider providesBlipsProvider(SupportModule supportModule) {
        SupportBlipsProvider providesBlipsProvider = supportModule.providesBlipsProvider();
        AbstractC2763s0.delta(providesBlipsProvider);
        return providesBlipsProvider;
    }

    @Override // Kd.a
    public SupportBlipsProvider get() {
        return providesBlipsProvider(this.module);
    }
}
