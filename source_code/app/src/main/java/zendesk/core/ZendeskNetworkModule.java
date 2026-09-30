package zendesk.core;

import android.content.Context;
import com.google.gson.l;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import vg.as;
import vg.at;
import wg.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ZendeskNetworkModule {
    private static final String BASE_OK_HTTP = "BaseOkHttp";
    private static final String CORE_OK_HTTP = "CoreOkHttp";
    static final String CORE_RETROFIT = "CoreRetrofit";
    private static final String MEDIA_OK_HTTP = "MediaOkHttp";
    static final String PUSH_PROVIDER_RETROFIT = "PushProviderRetrofit";
    private static final String STANDARD_OK_HTTP = "StandardOkHttp";
    static final String STANDARD_RETROFIT = "Retrofit";

    public static AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor(Context context) {
        return new AcceptLanguageHeaderInterceptor(context);
    }

    public static ZendeskAccessInterceptor provideAccessInterceptor(IdentityManager identityManager, AccessProvider accessProvider, Storage storage, CoreSettingsStorage coreSettingsStorage) {
        return new ZendeskAccessInterceptor(identityManager, accessProvider, storage, coreSettingsStorage);
    }

    public static ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor(IdentityManager identityManager) {
        return new ZendeskAuthHeaderInterceptor(identityManager);
    }

    public static CachingInterceptor provideCachingInterceptor(BaseStorage baseStorage) {
        return new CachingInterceptor(baseStorage);
    }

    public static at provideCoreRetrofit(ApplicationConfiguration applicationConfiguration, l lVar, OkHttpClient okHttpClient) {
        as asVar = new as();
        asVar.alpha(applicationConfiguration.getZendeskUrl());
        asVar.charlie.add(a.charlie(lVar));
        asVar.charlie(okHttpClient);
        return asVar.bravo();
    }

    public static ZendeskPushInterceptor providePushInterceptor(PushRegistrationProviderInternal pushRegistrationProviderInternal, PushDeviceIdStorage pushDeviceIdStorage, IdentityStorage identityStorage) {
        return new ZendeskPushInterceptor(pushRegistrationProviderInternal, pushDeviceIdStorage, identityStorage);
    }

    public static at providePushProviderRetrofit(ApplicationConfiguration applicationConfiguration, l lVar, OkHttpClient okHttpClient, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor) {
        as asVar = new as();
        asVar.alpha(applicationConfiguration.getZendeskUrl());
        asVar.charlie.add(a.charlie(lVar));
        asVar.charlie(okHttpClient.newBuilder().addInterceptor(zendeskAuthHeaderInterceptor).build());
        return asVar.bravo();
    }

    public static at provideRetrofit(ApplicationConfiguration applicationConfiguration, l lVar, OkHttpClient okHttpClient) {
        as asVar = new as();
        asVar.alpha(applicationConfiguration.getZendeskUrl());
        asVar.charlie.add(a.charlie(lVar));
        asVar.charlie(okHttpClient);
        return asVar.bravo();
    }

    public static ZendeskSettingsInterceptor provideSettingsInterceptor(SdkSettingsProviderInternal sdkSettingsProviderInternal, SettingsStorage settingsStorage) {
        return new ZendeskSettingsInterceptor(sdkSettingsProviderInternal, settingsStorage);
    }

    public static ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor(SessionStorage sessionStorage, IdentityManager identityManager) {
        return new ZendeskUnauthorizedInterceptor(sessionStorage, identityManager);
    }

    public static AcceptHeaderInterceptor providesAcceptHeaderInterceptor() {
        return new AcceptHeaderInterceptor();
    }

    public OkHttpClient provideBaseOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, ZendeskOauthIdHeaderInterceptor zendeskOauthIdHeaderInterceptor, UserAgentAndClientHeadersInterceptor userAgentAndClientHeadersInterceptor, ExecutorService executorService) {
        OkHttpClient.Builder addInterceptor = Tls12SocketFactory.enableTls12(new OkHttpClient.Builder()).addInterceptor(zendeskOauthIdHeaderInterceptor).addInterceptor(httpLoggingInterceptor).addInterceptor(userAgentAndClientHeadersInterceptor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return addInterceptor.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).dispatcher(new Dispatcher(executorService)).build();
    }

    public OkHttpClient provideCoreOkHttpClient(OkHttpClient okHttpClient, AcceptLanguageHeaderInterceptor acceptLanguageHeaderInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor) {
        return okHttpClient.newBuilder().addInterceptor(acceptLanguageHeaderInterceptor).addInterceptor(acceptHeaderInterceptor).build();
    }

    public OkHttpClient provideMediaOkHttpClient(OkHttpClient okHttpClient, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, CachingInterceptor cachingInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor) {
        return okHttpClient.newBuilder().addInterceptor(zendeskSettingsInterceptor).addInterceptor(cachingInterceptor).addInterceptor(zendeskAccessInterceptor).addInterceptor(zendeskAuthHeaderInterceptor).addInterceptor(zendeskUnauthorizedInterceptor).build();
    }

    public OkHttpClient provideOkHttpClient(OkHttpClient okHttpClient, ZendeskAccessInterceptor zendeskAccessInterceptor, ZendeskUnauthorizedInterceptor zendeskUnauthorizedInterceptor, ZendeskAuthHeaderInterceptor zendeskAuthHeaderInterceptor, ZendeskSettingsInterceptor zendeskSettingsInterceptor, AcceptHeaderInterceptor acceptHeaderInterceptor, ZendeskPushInterceptor zendeskPushInterceptor, Cache cache) {
        return okHttpClient.newBuilder().addInterceptor(zendeskSettingsInterceptor).addInterceptor(zendeskAccessInterceptor).addInterceptor(zendeskAuthHeaderInterceptor).addInterceptor(zendeskUnauthorizedInterceptor).addInterceptor(acceptHeaderInterceptor).addInterceptor(zendeskPushInterceptor).cache(cache).build();
    }

    public RestServiceProvider provideRestServiceProvider(at atVar, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, OkHttpClient okHttpClient3) {
        return new ZendeskRestServiceProvider(atVar, okHttpClient, okHttpClient2, okHttpClient3);
    }

    public ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor(ApplicationConfiguration applicationConfiguration) {
        return new ZendeskOauthIdHeaderInterceptor(applicationConfiguration.getOauthClientId());
    }

    public UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor() {
        return new UserAgentAndClientHeadersInterceptor(BuildConfig.VERSION_NAME, Constants.VARIANT);
    }
}
