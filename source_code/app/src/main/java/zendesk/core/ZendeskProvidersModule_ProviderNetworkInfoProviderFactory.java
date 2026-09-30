package zendesk.core;

import Kd.a;
import android.net.ConnectivityManager;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProviderNetworkInfoProviderFactory implements b {
    private final a connectivityManagerProvider;

    public ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(a aVar) {
        this.connectivityManagerProvider = aVar;
    }

    public static ZendeskProvidersModule_ProviderNetworkInfoProviderFactory create(a aVar) {
        return new ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(aVar);
    }

    public static NetworkInfoProvider providerNetworkInfoProvider(ConnectivityManager connectivityManager) {
        NetworkInfoProvider providerNetworkInfoProvider = ZendeskProvidersModule.providerNetworkInfoProvider(connectivityManager);
        AbstractC2763s0.delta(providerNetworkInfoProvider);
        return providerNetworkInfoProvider;
    }

    @Override // Kd.a
    public NetworkInfoProvider get() {
        return providerNetworkInfoProvider((ConnectivityManager) this.connectivityManagerProvider.get());
    }
}
