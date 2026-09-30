package zendesk.core;

import Kd.a;
import dagger.internal.b;
import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvideBaseOkHttpClientFactory implements b {
    private final a executorServiceProvider;
    private final a loggingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final a oauthIdHeaderInterceptorProvider;
    private final a userAgentAndClientHeadersInterceptorProvider;

    public ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, a aVar, a aVar2, a aVar3, a aVar4) {
        this.module = zendeskNetworkModule;
        this.loggingInterceptorProvider = aVar;
        this.oauthIdHeaderInterceptorProvider = aVar2;
        this.userAgentAndClientHeadersInterceptorProvider = aVar3;
        this.executorServiceProvider = aVar4;
    }

    public static ZendeskNetworkModule_ProvideBaseOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, a aVar, a aVar2, a aVar3, a aVar4) {
        return new ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(zendeskNetworkModule, aVar, aVar2, aVar3, aVar4);
    }

    public static OkHttpClient provideBaseOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, HttpLoggingInterceptor httpLoggingInterceptor, Object obj, Object obj2, ExecutorService executorService) {
        OkHttpClient provideBaseOkHttpClient = zendeskNetworkModule.provideBaseOkHttpClient(httpLoggingInterceptor, (ZendeskOauthIdHeaderInterceptor) obj, (UserAgentAndClientHeadersInterceptor) obj2, executorService);
        AbstractC2763s0.delta(provideBaseOkHttpClient);
        return provideBaseOkHttpClient;
    }

    @Override // Kd.a
    public OkHttpClient get() {
        return provideBaseOkHttpClient(this.module, (HttpLoggingInterceptor) this.loggingInterceptorProvider.get(), this.oauthIdHeaderInterceptorProvider.get(), this.userAgentAndClientHeadersInterceptorProvider.get(), (ExecutorService) this.executorServiceProvider.get());
    }
}
