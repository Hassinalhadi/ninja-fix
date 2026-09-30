package zendesk.core;

import Kd.a;
import dagger.internal.b;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;
import vg.at;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvideRestServiceProviderFactory implements b {
    private final a coreOkHttpClientProvider;
    private final a mediaOkHttpClientProvider;
    private final ZendeskNetworkModule module;
    private final a retrofitProvider;
    private final a standardOkHttpClientProvider;

    public ZendeskNetworkModule_ProvideRestServiceProviderFactory(ZendeskNetworkModule zendeskNetworkModule, a aVar, a aVar2, a aVar3, a aVar4) {
        this.module = zendeskNetworkModule;
        this.retrofitProvider = aVar;
        this.mediaOkHttpClientProvider = aVar2;
        this.standardOkHttpClientProvider = aVar3;
        this.coreOkHttpClientProvider = aVar4;
    }

    public static ZendeskNetworkModule_ProvideRestServiceProviderFactory create(ZendeskNetworkModule zendeskNetworkModule, a aVar, a aVar2, a aVar3, a aVar4) {
        return new ZendeskNetworkModule_ProvideRestServiceProviderFactory(zendeskNetworkModule, aVar, aVar2, aVar3, aVar4);
    }

    public static RestServiceProvider provideRestServiceProvider(ZendeskNetworkModule zendeskNetworkModule, at atVar, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, OkHttpClient okHttpClient3) {
        RestServiceProvider provideRestServiceProvider = zendeskNetworkModule.provideRestServiceProvider(atVar, okHttpClient, okHttpClient2, okHttpClient3);
        AbstractC2763s0.delta(provideRestServiceProvider);
        return provideRestServiceProvider;
    }

    @Override // Kd.a
    public RestServiceProvider get() {
        return provideRestServiceProvider(this.module, (at) this.retrofitProvider.get(), (OkHttpClient) this.mediaOkHttpClientProvider.get(), (OkHttpClient) this.standardOkHttpClientProvider.get(), (OkHttpClient) this.coreOkHttpClientProvider.get());
    }
}
