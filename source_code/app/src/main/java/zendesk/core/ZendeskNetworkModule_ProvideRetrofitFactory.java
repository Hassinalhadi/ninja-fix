package zendesk.core;

import Kd.a;
import com.google.gson.l;
import dagger.internal.b;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;
import vg.at;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvideRetrofitFactory implements b {
    private final a configurationProvider;
    private final a gsonProvider;
    private final a okHttpClientProvider;

    public ZendeskNetworkModule_ProvideRetrofitFactory(a aVar, a aVar2, a aVar3) {
        this.configurationProvider = aVar;
        this.gsonProvider = aVar2;
        this.okHttpClientProvider = aVar3;
    }

    public static ZendeskNetworkModule_ProvideRetrofitFactory create(a aVar, a aVar2, a aVar3) {
        return new ZendeskNetworkModule_ProvideRetrofitFactory(aVar, aVar2, aVar3);
    }

    public static at provideRetrofit(ApplicationConfiguration applicationConfiguration, l lVar, OkHttpClient okHttpClient) {
        at provideRetrofit = ZendeskNetworkModule.provideRetrofit(applicationConfiguration, lVar, okHttpClient);
        AbstractC2763s0.delta(provideRetrofit);
        return provideRetrofit;
    }

    @Override // Kd.a
    public at get() {
        return provideRetrofit((ApplicationConfiguration) this.configurationProvider.get(), (l) this.gsonProvider.get(), (OkHttpClient) this.okHttpClientProvider.get());
    }
}
