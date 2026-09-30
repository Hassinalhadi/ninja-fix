package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportModule_ProvidesRequestProviderFactory implements b {
    private final SupportModule module;

    public SupportModule_ProvidesRequestProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesRequestProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesRequestProviderFactory(supportModule);
    }

    public static RequestProvider providesRequestProvider(SupportModule supportModule) {
        RequestProvider providesRequestProvider = supportModule.providesRequestProvider();
        AbstractC2763s0.delta(providesRequestProvider);
        return providesRequestProvider;
    }

    @Override // Kd.a
    public RequestProvider get() {
        return providesRequestProvider(this.module);
    }
}
