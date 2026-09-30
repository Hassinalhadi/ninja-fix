package zendesk.core;

import Kd.a;
import android.content.Context;
import android.net.ConnectivityManager;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProviderConnectivityManagerFactory implements b {
    private final a contextProvider;

    public ZendeskProvidersModule_ProviderConnectivityManagerFactory(a aVar) {
        this.contextProvider = aVar;
    }

    public static ZendeskProvidersModule_ProviderConnectivityManagerFactory create(a aVar) {
        return new ZendeskProvidersModule_ProviderConnectivityManagerFactory(aVar);
    }

    public static ConnectivityManager providerConnectivityManager(Context context) {
        ConnectivityManager providerConnectivityManager = ZendeskProvidersModule.providerConnectivityManager(context);
        AbstractC2763s0.delta(providerConnectivityManager);
        return providerConnectivityManager;
    }

    @Override // Kd.a
    public ConnectivityManager get() {
        return providerConnectivityManager((Context) this.contextProvider.get());
    }
}
