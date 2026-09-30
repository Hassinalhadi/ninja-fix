package zendesk.core;

import Kd.a;
import dagger.internal.b;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvideCoreOkHttpClientFactory implements b {
    private final a acceptHeaderInterceptorProvider;
    private final a acceptLanguageHeaderInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final a okHttpClientProvider;

    public ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, a aVar, a aVar2, a aVar3) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = aVar;
        this.acceptLanguageHeaderInterceptorProvider = aVar2;
        this.acceptHeaderInterceptorProvider = aVar3;
    }

    public static ZendeskNetworkModule_ProvideCoreOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, a aVar, a aVar2, a aVar3) {
        return new ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(zendeskNetworkModule, aVar, aVar2, aVar3);
    }

    public static OkHttpClient provideCoreOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2) {
        OkHttpClient provideCoreOkHttpClient = zendeskNetworkModule.provideCoreOkHttpClient(okHttpClient, (AcceptLanguageHeaderInterceptor) obj, (AcceptHeaderInterceptor) obj2);
        AbstractC2763s0.delta(provideCoreOkHttpClient);
        return provideCoreOkHttpClient;
    }

    @Override // Kd.a
    public OkHttpClient get() {
        return provideCoreOkHttpClient(this.module, (OkHttpClient) this.okHttpClientProvider.get(), this.acceptLanguageHeaderInterceptorProvider.get(), this.acceptHeaderInterceptorProvider.get());
    }
}
