package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetRestServiceProviderFactory implements b {
    private final CoreModule module;

    public CoreModule_GetRestServiceProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetRestServiceProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetRestServiceProviderFactory(coreModule);
    }

    public static RestServiceProvider getRestServiceProvider(CoreModule coreModule) {
        RestServiceProvider restServiceProvider = coreModule.getRestServiceProvider();
        AbstractC2763s0.delta(restServiceProvider);
        return restServiceProvider;
    }

    @Override // Kd.a
    public RestServiceProvider get() {
        return getRestServiceProvider(this.module);
    }
}
