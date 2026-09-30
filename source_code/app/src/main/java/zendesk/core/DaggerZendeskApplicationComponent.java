package zendesk.core;

import Kd.a;
import dagger.internal.d;
import dagger.internal.e;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
final class DaggerZendeskApplicationComponent {

    /* loaded from: classes.dex */
    public static final class Builder {
        private ZendeskApplicationModule zendeskApplicationModule;
        private ZendeskNetworkModule zendeskNetworkModule;

        public /* synthetic */ Builder(int i4) {
            this();
        }

        public ZendeskApplicationComponent build() {
            AbstractC2763s0.bravo(ZendeskApplicationModule.class, this.zendeskApplicationModule);
            if (this.zendeskNetworkModule == null) {
                this.zendeskNetworkModule = new ZendeskNetworkModule();
            }
            return new ZendeskApplicationComponentImpl(this.zendeskApplicationModule, this.zendeskNetworkModule, 0);
        }

        public Builder zendeskApplicationModule(ZendeskApplicationModule zendeskApplicationModule) {
            zendeskApplicationModule.getClass();
            this.zendeskApplicationModule = zendeskApplicationModule;
            return this;
        }

        public Builder zendeskNetworkModule(ZendeskNetworkModule zendeskNetworkModule) {
            zendeskNetworkModule.getClass();
            this.zendeskNetworkModule = zendeskNetworkModule;
            return this;
        }

        @Deprecated
        public Builder zendeskProvidersModule(ZendeskProvidersModule zendeskProvidersModule) {
            zendeskProvidersModule.getClass();
            return this;
        }

        @Deprecated
        public Builder zendeskStorageModule(ZendeskStorageModule zendeskStorageModule) {
            zendeskStorageModule.getClass();
            return this;
        }

        private Builder() {
        }
    }

    /* loaded from: classes.dex */
    public static final class ZendeskApplicationComponentImpl implements ZendeskApplicationComponent {
        private a actionHandlerRegistryProvider;
        private a provideAcceptLanguageHeaderInterceptorProvider;
        private a provideAccessInterceptorProvider;
        private a provideAccessProvider;
        private a provideAccessServiceProvider;
        private a provideAdditionalSdkBaseStorageProvider;
        private a provideApplicationConfigurationProvider;
        private a provideApplicationContextProvider;
        private a provideAuthHeaderInterceptorProvider;
        private a provideAuthProvider;
        private a provideBase64SerializerProvider;
        private a provideBaseOkHttpClientProvider;
        private a provideBlipsServiceProvider;
        private a provideCacheProvider;
        private a provideCachingInterceptorProvider;
        private a provideCoreOkHttpClientProvider;
        private a provideCoreRetrofitProvider;
        private a provideCoreSdkModuleProvider;
        private a provideCoreSettingsStorageProvider;
        private a provideDeviceInfoProvider;
        private a provideExecutorProvider;
        private a provideExecutorServiceProvider;
        private a provideGsonProvider;
        private a provideHttpLoggingInterceptorProvider;
        private a provideIdentityBaseStorageProvider;
        private a provideIdentityManagerProvider;
        private a provideIdentityStorageProvider;
        private a provideLegacyIdentityBaseStorageProvider;
        private a provideLegacyIdentityStorageProvider;
        private a provideLegacyPushBaseStorageProvider;
        private a provideMachineIdStorageProvider;
        private a provideMediaOkHttpClientProvider;
        private a provideMemoryCacheProvider;
        private a provideOkHttpClientProvider;
        private a provideProviderStoreProvider;
        private a providePushDeviceIdStorageProvider;
        private a providePushInterceptorProvider;
        private a providePushProviderRetrofitProvider;
        private a providePushRegistrationProvider;
        private a providePushRegistrationProviderInternalProvider;
        private a providePushRegistrationServiceProvider;
        private a provideRestServiceProvider;
        private a provideRetrofitProvider;
        private a provideSdkBaseStorageProvider;
        private a provideSdkSettingsProvider;
        private a provideSdkSettingsProviderInternalProvider;
        private a provideSdkSettingsServiceProvider;
        private a provideSdkStorageProvider;
        private a provideSerializerProvider;
        private a provideSessionStorageProvider;
        private a provideSettingsBaseStorageProvider;
        private a provideSettingsInterceptorProvider;
        private a provideSettingsStorageProvider;
        private a provideUserProvider;
        private a provideUserServiceProvider;
        private a provideZendeskBasicHeadersInterceptorProvider;
        private a provideZendeskLocaleConverterProvider;
        private a provideZendeskProvider;
        private a provideZendeskSdkSettingsProvider;
        private a provideZendeskUnauthorizedInterceptorProvider;
        private a providerBlipsCoreProvider;
        private a providerBlipsProvider;
        private a providerConnectivityManagerProvider;
        private a providerNetworkInfoProvider;
        private a providerZendeskBlipsProvider;
        private a providesAcceptHeaderInterceptorProvider;
        private a providesBelvedereDirProvider;
        private a providesCacheDirProvider;
        private a providesDataDirProvider;
        private a providesDiskLruStorageProvider;
        private a providesUserAgentHeaderInterceptorProvider;
        private final ZendeskApplicationComponentImpl zendeskApplicationComponentImpl;

        public /* synthetic */ ZendeskApplicationComponentImpl(ZendeskApplicationModule zendeskApplicationModule, ZendeskNetworkModule zendeskNetworkModule, int i4) {
            this(zendeskApplicationModule, zendeskNetworkModule);
        }

        private void initialize(ZendeskApplicationModule zendeskApplicationModule, ZendeskNetworkModule zendeskNetworkModule) {
            this.provideApplicationContextProvider = dagger.internal.a.alpha(ZendeskApplicationModule_ProvideApplicationContextFactory.create(zendeskApplicationModule));
            d alpha = e.alpha(ZendeskApplicationModule_ProvideGsonFactory.create());
            this.provideGsonProvider = alpha;
            d alpha2 = dagger.internal.a.alpha(ZendeskStorageModule_ProvideSerializerFactory.create(alpha));
            this.provideSerializerProvider = alpha2;
            d alpha3 = dagger.internal.a.alpha(ZendeskStorageModule_ProvideSettingsBaseStorageFactory.create(this.provideApplicationContextProvider, alpha2));
            this.provideSettingsBaseStorageProvider = alpha3;
            this.provideSettingsStorageProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvideSettingsStorageFactory.create(alpha3));
            d alpha4 = dagger.internal.a.alpha(ZendeskStorageModule_ProvideIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
            this.provideIdentityBaseStorageProvider = alpha4;
            this.provideIdentityStorageProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvideIdentityStorageFactory.create(alpha4));
            this.provideAdditionalSdkBaseStorageProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
            d alpha5 = dagger.internal.a.alpha(ZendeskStorageModule_ProvidesCacheDirFactory.create(this.provideApplicationContextProvider));
            this.providesCacheDirProvider = alpha5;
            this.providesDiskLruStorageProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvidesDiskLruStorageFactory.create(alpha5, this.provideSerializerProvider));
            this.provideCacheProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvideCacheFactory.create(this.providesCacheDirProvider));
            this.providesDataDirProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvidesDataDirFactory.create(this.provideApplicationContextProvider));
            d alpha6 = dagger.internal.a.alpha(ZendeskStorageModule_ProvidesBelvedereDirFactory.create(this.provideApplicationContextProvider));
            this.providesBelvedereDirProvider = alpha6;
            this.provideSessionStorageProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvideSessionStorageFactory.create(this.provideIdentityStorageProvider, this.provideAdditionalSdkBaseStorageProvider, this.providesDiskLruStorageProvider, this.provideCacheProvider, this.providesCacheDirProvider, this.providesDataDirProvider, alpha6));
            this.provideSdkBaseStorageProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvideSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
            d alpha7 = dagger.internal.a.alpha(ZendeskStorageModule_ProvideMemoryCacheFactory.create());
            this.provideMemoryCacheProvider = alpha7;
            this.provideSdkStorageProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvideSdkStorageFactory.create(this.provideSettingsStorageProvider, this.provideSessionStorageProvider, this.provideSdkBaseStorageProvider, alpha7));
            this.provideLegacyIdentityBaseStorageProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
            this.provideLegacyPushBaseStorageProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
            this.provideIdentityManagerProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvideIdentityManagerFactory.create(this.provideIdentityStorageProvider));
            d alpha8 = dagger.internal.a.alpha(ZendeskStorageModule_ProvidePushDeviceIdStorageFactory.create(this.provideAdditionalSdkBaseStorageProvider));
            this.providePushDeviceIdStorageProvider = alpha8;
            this.provideLegacyIdentityStorageProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvideLegacyIdentityStorageFactory.create(this.provideLegacyIdentityBaseStorageProvider, this.provideLegacyPushBaseStorageProvider, this.provideIdentityStorageProvider, this.provideIdentityManagerProvider, alpha8));
            this.provideApplicationConfigurationProvider = dagger.internal.a.alpha(ZendeskApplicationModule_ProvideApplicationConfigurationFactory.create(zendeskApplicationModule));
            this.provideHttpLoggingInterceptorProvider = e.alpha(ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory.create());
            this.provideZendeskBasicHeadersInterceptorProvider = e.alpha(ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory.create(zendeskNetworkModule, this.provideApplicationConfigurationProvider));
            this.providesUserAgentHeaderInterceptorProvider = e.alpha(ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory.create(zendeskNetworkModule));
            d alpha9 = dagger.internal.a.alpha(ZendeskApplicationModule_ProvideExecutorFactory.create());
            this.provideExecutorProvider = alpha9;
            d alpha10 = dagger.internal.a.alpha(ZendeskApplicationModule_ProvideExecutorServiceFactory.create(alpha9));
            this.provideExecutorServiceProvider = alpha10;
            this.provideBaseOkHttpClientProvider = dagger.internal.a.alpha(ZendeskNetworkModule_ProvideBaseOkHttpClientFactory.create(zendeskNetworkModule, this.provideHttpLoggingInterceptorProvider, this.provideZendeskBasicHeadersInterceptorProvider, this.providesUserAgentHeaderInterceptorProvider, alpha10));
            this.provideAcceptLanguageHeaderInterceptorProvider = e.alpha(ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory.create(this.provideApplicationContextProvider));
            d alpha11 = e.alpha(ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory.create());
            this.providesAcceptHeaderInterceptorProvider = alpha11;
            d alpha12 = dagger.internal.a.alpha(ZendeskNetworkModule_ProvideCoreOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAcceptLanguageHeaderInterceptorProvider, alpha11));
            this.provideCoreOkHttpClientProvider = alpha12;
            d alpha13 = dagger.internal.a.alpha(ZendeskNetworkModule_ProvideCoreRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, alpha12));
            this.provideCoreRetrofitProvider = alpha13;
            this.provideBlipsServiceProvider = dagger.internal.a.alpha(ZendeskProvidersModule_ProvideBlipsServiceFactory.create(alpha13));
            this.provideDeviceInfoProvider = dagger.internal.a.alpha(ZendeskApplicationModule_ProvideDeviceInfoFactory.create(this.provideApplicationContextProvider));
            this.provideBase64SerializerProvider = e.alpha(ZendeskApplicationModule_ProvideBase64SerializerFactory.create(zendeskApplicationModule, this.provideSerializerProvider));
            d alpha14 = dagger.internal.a.alpha(ZendeskStorageModule_ProvideCoreSettingsStorageFactory.create(this.provideSettingsStorageProvider));
            this.provideCoreSettingsStorageProvider = alpha14;
            d alpha15 = dagger.internal.a.alpha(ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory.create(this.provideBlipsServiceProvider, this.provideDeviceInfoProvider, this.provideBase64SerializerProvider, this.provideIdentityManagerProvider, this.provideApplicationConfigurationProvider, alpha14, this.provideExecutorServiceProvider));
            this.providerZendeskBlipsProvider = alpha15;
            this.providerBlipsCoreProvider = dagger.internal.a.alpha(ZendeskProvidersModule_ProviderBlipsCoreProviderFactory.create(alpha15));
            d alpha16 = e.alpha(ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory.create(this.provideIdentityManagerProvider));
            this.provideAuthHeaderInterceptorProvider = alpha16;
            d alpha17 = dagger.internal.a.alpha(ZendeskNetworkModule_ProvidePushProviderRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, this.provideCoreOkHttpClientProvider, alpha16));
            this.providePushProviderRetrofitProvider = alpha17;
            this.providePushRegistrationServiceProvider = e.alpha(ZendeskProvidersModule_ProvidePushRegistrationServiceFactory.create(alpha17));
            this.provideSdkSettingsServiceProvider = e.alpha(ZendeskProvidersModule_ProvideSdkSettingsServiceFactory.create(this.provideCoreRetrofitProvider));
            this.actionHandlerRegistryProvider = dagger.internal.a.alpha(ZendeskProvidersModule_ActionHandlerRegistryFactory.create());
            d alpha18 = dagger.internal.a.alpha(ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory.create(zendeskApplicationModule));
            this.provideZendeskLocaleConverterProvider = alpha18;
            d alpha19 = dagger.internal.a.alpha(ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory.create(this.provideSdkSettingsServiceProvider, this.provideSettingsStorageProvider, this.provideCoreSettingsStorageProvider, this.actionHandlerRegistryProvider, this.provideSerializerProvider, alpha18, this.provideApplicationConfigurationProvider, this.provideApplicationContextProvider));
            this.provideZendeskSdkSettingsProvider = alpha19;
            d alpha20 = dagger.internal.a.alpha(ZendeskProvidersModule_ProvideSdkSettingsProviderFactory.create(alpha19));
            this.provideSdkSettingsProvider = alpha20;
            this.providePushRegistrationProvider = dagger.internal.a.alpha(ZendeskProvidersModule_ProvidePushRegistrationProviderFactory.create(this.providePushRegistrationServiceProvider, this.provideIdentityManagerProvider, alpha20, this.providerBlipsCoreProvider, this.providePushDeviceIdStorageProvider, this.provideApplicationContextProvider));
            d alpha21 = e.alpha(ZendeskProvidersModule_ProvideAccessServiceFactory.create(this.provideCoreRetrofitProvider));
            this.provideAccessServiceProvider = alpha21;
            d alpha22 = dagger.internal.a.alpha(ZendeskProvidersModule_ProvideAccessProviderFactory.create(this.provideIdentityManagerProvider, alpha21));
            this.provideAccessProvider = alpha22;
            this.provideAccessInterceptorProvider = e.alpha(ZendeskNetworkModule_ProvideAccessInterceptorFactory.create(this.provideIdentityManagerProvider, alpha22, this.provideSdkStorageProvider, this.provideCoreSettingsStorageProvider));
            this.provideZendeskUnauthorizedInterceptorProvider = e.alpha(ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory.create(this.provideSessionStorageProvider, this.provideIdentityManagerProvider));
            d alpha23 = dagger.internal.a.alpha(ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory.create(this.provideZendeskSdkSettingsProvider));
            this.provideSdkSettingsProviderInternalProvider = alpha23;
            this.provideSettingsInterceptorProvider = e.alpha(ZendeskNetworkModule_ProvideSettingsInterceptorFactory.create(alpha23, this.provideSettingsStorageProvider));
            d alpha24 = dagger.internal.a.alpha(ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory.create(this.providePushRegistrationProvider));
            this.providePushRegistrationProviderInternalProvider = alpha24;
            d alpha25 = e.alpha(ZendeskNetworkModule_ProvidePushInterceptorFactory.create(alpha24, this.providePushDeviceIdStorageProvider, this.provideIdentityStorageProvider));
            this.providePushInterceptorProvider = alpha25;
            d alpha26 = dagger.internal.a.alpha(ZendeskNetworkModule_ProvideOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideZendeskUnauthorizedInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, this.providesAcceptHeaderInterceptorProvider, alpha25, this.provideCacheProvider));
            this.provideOkHttpClientProvider = alpha26;
            this.provideRetrofitProvider = dagger.internal.a.alpha(ZendeskNetworkModule_ProvideRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, alpha26));
            d alpha27 = e.alpha(ZendeskNetworkModule_ProvideCachingInterceptorFactory.create(this.providesDiskLruStorageProvider));
            this.provideCachingInterceptorProvider = alpha27;
            d alpha28 = dagger.internal.a.alpha(ZendeskNetworkModule_ProvideMediaOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, alpha27, this.provideZendeskUnauthorizedInterceptorProvider));
            this.provideMediaOkHttpClientProvider = alpha28;
            this.provideRestServiceProvider = dagger.internal.a.alpha(ZendeskNetworkModule_ProvideRestServiceProviderFactory.create(zendeskNetworkModule, this.provideRetrofitProvider, alpha28, this.provideOkHttpClientProvider, this.provideCoreOkHttpClientProvider));
            this.providerBlipsProvider = dagger.internal.a.alpha(ZendeskProvidersModule_ProviderBlipsProviderFactory.create(this.providerZendeskBlipsProvider));
            d alpha29 = dagger.internal.a.alpha(ZendeskProvidersModule_ProviderConnectivityManagerFactory.create(this.provideApplicationContextProvider));
            this.providerConnectivityManagerProvider = alpha29;
            this.providerNetworkInfoProvider = dagger.internal.a.alpha(ZendeskProvidersModule_ProviderNetworkInfoProviderFactory.create(alpha29));
            this.provideAuthProvider = dagger.internal.a.alpha(ZendeskStorageModule_ProvideAuthProviderFactory.create(this.provideIdentityManagerProvider));
            d alpha30 = dagger.internal.a.alpha(ZendeskStorageModule_ProvideMachineIdStorageFactory.create(this.provideApplicationContextProvider));
            this.provideMachineIdStorageProvider = alpha30;
            this.provideCoreSdkModuleProvider = e.alpha(ZendeskProvidersModule_ProvideCoreSdkModuleFactory.create(this.provideSdkSettingsProvider, this.provideRestServiceProvider, this.providerBlipsProvider, this.provideSessionStorageProvider, this.providerNetworkInfoProvider, this.provideMemoryCacheProvider, this.actionHandlerRegistryProvider, this.provideExecutorProvider, this.provideApplicationContextProvider, this.provideAuthProvider, this.provideApplicationConfigurationProvider, this.providePushRegistrationProvider, alpha30));
            d alpha31 = e.alpha(ZendeskProvidersModule_ProvideUserServiceFactory.create(this.provideRetrofitProvider));
            this.provideUserServiceProvider = alpha31;
            d alpha32 = dagger.internal.a.alpha(ZendeskProvidersModule_ProvideUserProviderFactory.create(alpha31));
            this.provideUserProvider = alpha32;
            d alpha33 = dagger.internal.a.alpha(ZendeskProvidersModule_ProvideProviderStoreFactory.create(alpha32, this.providePushRegistrationProvider));
            this.provideProviderStoreProvider = alpha33;
            this.provideZendeskProvider = dagger.internal.a.alpha(ZendeskApplicationModule_ProvideZendeskFactory.create(this.provideSdkStorageProvider, this.provideLegacyIdentityStorageProvider, this.provideIdentityManagerProvider, this.providerBlipsCoreProvider, this.providePushRegistrationProvider, this.provideCoreSdkModuleProvider, alpha33));
        }

        @Override // zendesk.core.ZendeskApplicationComponent
        public ZendeskShadow zendeskShadow() {
            return (ZendeskShadow) this.provideZendeskProvider.get();
        }

        private ZendeskApplicationComponentImpl(ZendeskApplicationModule zendeskApplicationModule, ZendeskNetworkModule zendeskNetworkModule) {
            this.zendeskApplicationComponentImpl = this;
            initialize(zendeskApplicationModule, zendeskNetworkModule);
        }
    }

    private DaggerZendeskApplicationComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }
}
