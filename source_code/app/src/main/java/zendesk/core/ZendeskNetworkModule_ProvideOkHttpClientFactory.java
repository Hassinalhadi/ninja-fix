package zendesk.core;

import Kd.a;
import dagger.internal.b;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvideOkHttpClientFactory implements b {
    private final a acceptHeaderInterceptorProvider;
    private final a accessInterceptorProvider;
    private final a authHeaderInterceptorProvider;
    private final a cacheProvider;
    private final ZendeskNetworkModule module;
    private final a okHttpClientProvider;
    private final a pushInterceptorProvider;
    private final a settingsInterceptorProvider;
    private final a unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = aVar;
        this.accessInterceptorProvider = aVar2;
        this.unauthorizedInterceptorProvider = aVar3;
        this.authHeaderInterceptorProvider = aVar4;
        this.settingsInterceptorProvider = aVar5;
        this.acceptHeaderInterceptorProvider = aVar6;
        this.pushInterceptorProvider = aVar7;
        this.cacheProvider = aVar8;
    }

    public static ZendeskNetworkModule_ProvideOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8) {
        return new ZendeskNetworkModule_ProvideOkHttpClientFactory(zendeskNetworkModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static OkHttpClient provideOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Cache cache) {
        OkHttpClient provideOkHttpClient = zendeskNetworkModule.provideOkHttpClient(okHttpClient, (ZendeskAccessInterceptor) obj, (ZendeskUnauthorizedInterceptor) obj2, (ZendeskAuthHeaderInterceptor) obj3, (ZendeskSettingsInterceptor) obj4, (AcceptHeaderInterceptor) obj5, (ZendeskPushInterceptor) obj6, cache);
        AbstractC2763s0.delta(provideOkHttpClient);
        return provideOkHttpClient;
    }

    @Override // Kd.a
    public OkHttpClient get() {
        return provideOkHttpClient(this.module, (OkHttpClient) this.okHttpClientProvider.get(), this.accessInterceptorProvider.get(), this.unauthorizedInterceptorProvider.get(), this.authHeaderInterceptorProvider.get(), this.settingsInterceptorProvider.get(), this.acceptHeaderInterceptorProvider.get(), this.pushInterceptorProvider.get(), (Cache) this.cacheProvider.get());
    }
}
