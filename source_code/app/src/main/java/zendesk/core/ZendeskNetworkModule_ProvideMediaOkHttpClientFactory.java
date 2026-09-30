package zendesk.core;

import Kd.a;
import dagger.internal.b;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvideMediaOkHttpClientFactory implements b {
    private final a accessInterceptorProvider;
    private final a authHeaderInterceptorProvider;
    private final a cachingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final a okHttpClientProvider;
    private final a settingsInterceptorProvider;
    private final a unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = aVar;
        this.accessInterceptorProvider = aVar2;
        this.authHeaderInterceptorProvider = aVar3;
        this.settingsInterceptorProvider = aVar4;
        this.cachingInterceptorProvider = aVar5;
        this.unauthorizedInterceptorProvider = aVar6;
    }

    public static ZendeskNetworkModule_ProvideMediaOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6) {
        return new ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(zendeskNetworkModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static OkHttpClient provideMediaOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        OkHttpClient provideMediaOkHttpClient = zendeskNetworkModule.provideMediaOkHttpClient(okHttpClient, (ZendeskAccessInterceptor) obj, (ZendeskAuthHeaderInterceptor) obj2, (ZendeskSettingsInterceptor) obj3, (CachingInterceptor) obj4, (ZendeskUnauthorizedInterceptor) obj5);
        AbstractC2763s0.delta(provideMediaOkHttpClient);
        return provideMediaOkHttpClient;
    }

    @Override // Kd.a
    public OkHttpClient get() {
        return provideMediaOkHttpClient(this.module, (OkHttpClient) this.okHttpClientProvider.get(), this.accessInterceptorProvider.get(), this.authHeaderInterceptorProvider.get(), this.settingsInterceptorProvider.get(), this.cachingInterceptorProvider.get(), this.unauthorizedInterceptorProvider.get());
    }
}
