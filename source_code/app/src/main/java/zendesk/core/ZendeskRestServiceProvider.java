package zendesk.core;

import java.util.Iterator;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import vg.as;
import vg.at;

/* loaded from: classes.dex */
class ZendeskRestServiceProvider implements RestServiceProvider {
    private final OkHttpClient coreOkHttpClient;
    private final OkHttpClient mediaHttpClient;
    final at retrofit;
    final OkHttpClient standardOkHttpClient;

    public ZendeskRestServiceProvider(at atVar, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, OkHttpClient okHttpClient3) {
        this.retrofit = atVar;
        this.mediaHttpClient = okHttpClient;
        this.standardOkHttpClient = okHttpClient2;
        this.coreOkHttpClient = okHttpClient3;
    }

    private OkHttpClient.Builder createNonAuthenticatedOkHttpClient() {
        OkHttpClient.Builder newBuilder = this.standardOkHttpClient.newBuilder();
        Iterator<Interceptor> it = newBuilder.interceptors().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof ZendeskAuthHeaderInterceptor) {
                it.remove();
            }
        }
        return newBuilder;
    }

    @Override // zendesk.core.RestServiceProvider
    public <E> E createRestService(Class<E> cls, String str, String str2) {
        at atVar = this.retrofit;
        atVar.getClass();
        as asVar = new as(atVar);
        asVar.charlie(this.standardOkHttpClient.newBuilder().addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2)).build());
        return (E) asVar.bravo().bravo(cls);
    }

    @Override // zendesk.core.RestServiceProvider
    public <E> E createUnauthenticatedRestService(Class<E> cls, String str, String str2, CustomNetworkConfig customNetworkConfig) {
        OkHttpClient.Builder createNonAuthenticatedOkHttpClient = createNonAuthenticatedOkHttpClient();
        customNetworkConfig.configureOkHttpClient(createNonAuthenticatedOkHttpClient);
        createNonAuthenticatedOkHttpClient.addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2));
        at atVar = this.retrofit;
        atVar.getClass();
        as asVar = new as(atVar);
        customNetworkConfig.configureRetrofit(asVar);
        asVar.charlie(createNonAuthenticatedOkHttpClient.build());
        return (E) asVar.bravo().bravo(cls);
    }

    @Override // zendesk.core.RestServiceProvider
    public OkHttpClient getCoreOkHttpClient() {
        return this.coreOkHttpClient;
    }

    @Override // zendesk.core.RestServiceProvider
    public OkHttpClient getMediaOkHttpClient() {
        return this.mediaHttpClient;
    }

    @Override // zendesk.core.RestServiceProvider
    public <E> E createRestService(Class<E> cls, String str, String str2, CustomNetworkConfig customNetworkConfig) {
        OkHttpClient.Builder newBuilder = this.standardOkHttpClient.newBuilder();
        customNetworkConfig.configureOkHttpClient(newBuilder);
        newBuilder.addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2));
        at atVar = this.retrofit;
        atVar.getClass();
        as asVar = new as(atVar);
        customNetworkConfig.configureRetrofit(asVar);
        asVar.charlie(newBuilder.build());
        return (E) asVar.bravo().bravo(cls);
    }
}
