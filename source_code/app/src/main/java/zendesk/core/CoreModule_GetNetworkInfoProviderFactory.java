package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetNetworkInfoProviderFactory implements b {
    private final CoreModule module;

    public CoreModule_GetNetworkInfoProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetNetworkInfoProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetNetworkInfoProviderFactory(coreModule);
    }

    public static NetworkInfoProvider getNetworkInfoProvider(CoreModule coreModule) {
        NetworkInfoProvider networkInfoProvider = coreModule.getNetworkInfoProvider();
        AbstractC2763s0.delta(networkInfoProvider);
        return networkInfoProvider;
    }

    @Override // Kd.a
    public NetworkInfoProvider get() {
        return getNetworkInfoProvider(this.module);
    }
}
