package zendesk.core;

import Kd.a;
import com.google.gson.l;
import dagger.internal.b;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;
import vg.at;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvidePushProviderRetrofitFactory implements b {
    private final a authHeaderInterceptorProvider;
    private final a configurationProvider;
    private final a gsonProvider;
    private final a okHttpClientProvider;

    public ZendeskNetworkModule_ProvidePushProviderRetrofitFactory(a aVar, a aVar2, a aVar3, a aVar4) {
        this.configurationProvider = aVar;
        this.gsonProvider = aVar2;
        this.okHttpClientProvider = aVar3;
        this.authHeaderInterceptorProvider = aVar4;
    }

    public static ZendeskNetworkModule_ProvidePushProviderRetrofitFactory create(a aVar, a aVar2, a aVar3, a aVar4) {
        return new ZendeskNetworkModule_ProvidePushProviderRetrofitFactory(aVar, aVar2, aVar3, aVar4);
    }

    public static at providePushProviderRetrofit(ApplicationConfiguration applicationConfiguration, l lVar, OkHttpClient okHttpClient, Object obj) {
        at providePushProviderRetrofit = ZendeskNetworkModule.providePushProviderRetrofit(applicationConfiguration, lVar, okHttpClient, (ZendeskAuthHeaderInterceptor) obj);
        AbstractC2763s0.delta(providePushProviderRetrofit);
        return providePushProviderRetrofit;
    }

    @Override // Kd.a
    public at get() {
        return providePushProviderRetrofit((ApplicationConfiguration) this.configurationProvider.get(), (l) this.gsonProvider.get(), (OkHttpClient) this.okHttpClientProvider.get(), this.authHeaderInterceptorProvider.get());
    }
}
