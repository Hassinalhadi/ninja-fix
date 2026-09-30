package zendesk.support;

import Kd.a;
import dagger.internal.d;
import s6.AbstractC2763s0;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetAuthenticationProviderFactory;
import zendesk.core.CoreModule_GetBlipsProviderFactory;
import zendesk.core.CoreModule_GetMemoryCacheFactory;
import zendesk.core.CoreModule_GetRestServiceProviderFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.CoreModule_GetSettingsProviderFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DaggerSupportSdkProvidersComponent {

    /* loaded from: classes.dex */
    public static final class Builder {
        private CoreModule coreModule;
        private GuideModule guideModule;
        private ProviderModule providerModule;
        private StorageModule storageModule;
        private SupportApplicationModule supportApplicationModule;

        public /* synthetic */ Builder(int i4) {
            this();
        }

        public SupportSdkProvidersComponent build() {
            AbstractC2763s0.bravo(SupportApplicationModule.class, this.supportApplicationModule);
            AbstractC2763s0.bravo(CoreModule.class, this.coreModule);
            if (this.providerModule == null) {
                this.providerModule = new ProviderModule();
            }
            AbstractC2763s0.bravo(GuideModule.class, this.guideModule);
            if (this.storageModule == null) {
                this.storageModule = new StorageModule();
            }
            return new SupportSdkProvidersComponentImpl(this.supportApplicationModule, this.coreModule, this.providerModule, this.guideModule, this.storageModule, 0);
        }

        public Builder coreModule(CoreModule coreModule) {
            coreModule.getClass();
            this.coreModule = coreModule;
            return this;
        }

        public Builder guideModule(GuideModule guideModule) {
            guideModule.getClass();
            this.guideModule = guideModule;
            return this;
        }

        public Builder providerModule(ProviderModule providerModule) {
            providerModule.getClass();
            this.providerModule = providerModule;
            return this;
        }

        @Deprecated
        public Builder serviceModule(ServiceModule serviceModule) {
            serviceModule.getClass();
            return this;
        }

        public Builder storageModule(StorageModule storageModule) {
            storageModule.getClass();
            this.storageModule = storageModule;
            return this;
        }

        public Builder supportApplicationModule(SupportApplicationModule supportApplicationModule) {
            supportApplicationModule.getClass();
            this.supportApplicationModule = supportApplicationModule;
            return this;
        }

        private Builder() {
        }
    }

    /* loaded from: classes.dex */
    public static final class SupportSdkProvidersComponentImpl implements SupportSdkProvidersComponent {
        private final CoreModule coreModule;
        private a getApplicationContextProvider;
        private a getAuthenticationProvider;
        private a getBlipsProvider;
        private a getMemoryCacheProvider;
        private a getRestServiceProvider;
        private a getSessionStorageProvider;
        private a getSettingsProvider;
        private a provideLocaleProvider;
        private a provideMetadataProvider;
        private a provideProviderStoreProvider;
        private a provideRequestMigratorProvider;
        private a provideRequestProvider;
        private a provideRequestSessionCacheProvider;
        private a provideRequestStorageProvider;
        private a provideSdkSettingsProvider;
        private a provideSupportBlipsProvider;
        private a provideSupportModuleProvider;
        private a provideUploadProvider;
        private a provideZendeskLocaleConverterProvider;
        private a provideZendeskRequestServiceProvider;
        private a provideZendeskUploadServiceProvider;
        private a providesArticleVoteStorageProvider;
        private a providesHelpCenterProvider;
        private a providesRequestServiceProvider;
        private a providesUploadServiceProvider;
        private a providesZendeskTrackerProvider;
        private final SupportSdkProvidersComponentImpl supportSdkProvidersComponentImpl;

        public /* synthetic */ SupportSdkProvidersComponentImpl(SupportApplicationModule supportApplicationModule, CoreModule coreModule, ProviderModule providerModule, GuideModule guideModule, StorageModule storageModule, int i4) {
            this(supportApplicationModule, coreModule, providerModule, guideModule, storageModule);
        }

        private void initialize(SupportApplicationModule supportApplicationModule, CoreModule coreModule, ProviderModule providerModule, GuideModule guideModule, StorageModule storageModule) {
            this.providesHelpCenterProvider = GuideModule_ProvidesHelpCenterProviderFactory.create(guideModule);
            this.getSettingsProvider = CoreModule_GetSettingsProviderFactory.create(coreModule);
            this.provideLocaleProvider = dagger.internal.a.alpha(SupportApplicationModule_ProvideLocaleFactory.create(supportApplicationModule));
            d alpha = dagger.internal.a.alpha(ProviderModule_ProvideZendeskLocaleConverterFactory.create(providerModule));
            this.provideZendeskLocaleConverterProvider = alpha;
            this.provideSdkSettingsProvider = dagger.internal.a.alpha(ProviderModule_ProvideSdkSettingsProviderFactory.create(providerModule, this.getSettingsProvider, this.provideLocaleProvider, alpha));
            this.getAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.create(coreModule);
            CoreModule_GetRestServiceProviderFactory create = CoreModule_GetRestServiceProviderFactory.create(coreModule);
            this.getRestServiceProvider = create;
            d alpha2 = dagger.internal.a.alpha(ServiceModule_ProvidesRequestServiceFactory.create(create));
            this.providesRequestServiceProvider = alpha2;
            this.provideZendeskRequestServiceProvider = dagger.internal.a.alpha(ServiceModule_ProvideZendeskRequestServiceFactory.create(alpha2));
            this.getSessionStorageProvider = CoreModule_GetSessionStorageFactory.create(coreModule);
            CoreModule_GetApplicationContextFactory create2 = CoreModule_GetApplicationContextFactory.create(coreModule);
            this.getApplicationContextProvider = create2;
            this.provideRequestMigratorProvider = dagger.internal.a.alpha(StorageModule_ProvideRequestMigratorFactory.create(storageModule, create2));
            CoreModule_GetMemoryCacheFactory create3 = CoreModule_GetMemoryCacheFactory.create(coreModule);
            this.getMemoryCacheProvider = create3;
            this.provideRequestStorageProvider = dagger.internal.a.alpha(StorageModule_ProvideRequestStorageFactory.create(storageModule, this.getSessionStorageProvider, this.provideRequestMigratorProvider, create3));
            this.provideRequestSessionCacheProvider = dagger.internal.a.alpha(StorageModule_ProvideRequestSessionCacheFactory.create(storageModule));
            this.providesZendeskTrackerProvider = dagger.internal.a.alpha(SupportApplicationModule_ProvidesZendeskTrackerFactory.create(supportApplicationModule));
            this.provideMetadataProvider = dagger.internal.a.alpha(SupportApplicationModule_ProvideMetadataFactory.create(supportApplicationModule, this.getApplicationContextProvider));
            CoreModule_GetBlipsProviderFactory create4 = CoreModule_GetBlipsProviderFactory.create(coreModule);
            this.getBlipsProvider = create4;
            d alpha3 = dagger.internal.a.alpha(ProviderModule_ProvideSupportBlipsProviderFactory.create(providerModule, create4));
            this.provideSupportBlipsProvider = alpha3;
            this.provideRequestProvider = dagger.internal.a.alpha(ProviderModule_ProvideRequestProviderFactory.create(providerModule, this.provideSdkSettingsProvider, this.getAuthenticationProvider, this.provideZendeskRequestServiceProvider, this.provideRequestStorageProvider, this.provideRequestSessionCacheProvider, this.providesZendeskTrackerProvider, this.provideMetadataProvider, alpha3));
            d alpha4 = dagger.internal.a.alpha(ServiceModule_ProvidesUploadServiceFactory.create(this.getRestServiceProvider));
            this.providesUploadServiceProvider = alpha4;
            d alpha5 = dagger.internal.a.alpha(ServiceModule_ProvideZendeskUploadServiceFactory.create(alpha4));
            this.provideZendeskUploadServiceProvider = alpha5;
            d alpha6 = dagger.internal.a.alpha(ProviderModule_ProvideUploadProviderFactory.create(providerModule, alpha5));
            this.provideUploadProvider = alpha6;
            this.provideProviderStoreProvider = dagger.internal.a.alpha(ProviderModule_ProvideProviderStoreFactory.create(providerModule, this.providesHelpCenterProvider, this.provideRequestProvider, alpha6));
            GuideModule_ProvidesArticleVoteStorageFactory create5 = GuideModule_ProvidesArticleVoteStorageFactory.create(guideModule);
            this.providesArticleVoteStorageProvider = create5;
            this.provideSupportModuleProvider = dagger.internal.a.alpha(ProviderModule_ProvideSupportModuleFactory.create(providerModule, this.provideRequestProvider, this.provideUploadProvider, this.providesHelpCenterProvider, this.provideSdkSettingsProvider, this.getRestServiceProvider, this.provideSupportBlipsProvider, this.providesZendeskTrackerProvider, create5));
        }

        private Support injectSupport(Support support) {
            Support_MembersInjector.injectProviderStore(support, (ProviderStore) this.provideProviderStoreProvider.get());
            Support_MembersInjector.injectSupportModule(support, (SupportModule) this.provideSupportModuleProvider.get());
            Support_MembersInjector.injectRequestMigrator(support, this.provideRequestMigratorProvider.get());
            Support_MembersInjector.injectBlipsProvider(support, (SupportBlipsProvider) this.provideSupportBlipsProvider.get());
            Support_MembersInjector.injectActionHandlerRegistry(support, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
            Support_MembersInjector.injectRequestProvider(support, (RequestProvider) this.provideRequestProvider.get());
            Support_MembersInjector.injectAuthenticationProvider(support, CoreModule_GetAuthenticationProviderFactory.getAuthenticationProvider(this.coreModule));
            return support;
        }

        @Override // zendesk.support.SupportSdkProvidersComponent
        public Support inject(Support support) {
            return injectSupport(support);
        }

        private SupportSdkProvidersComponentImpl(SupportApplicationModule supportApplicationModule, CoreModule coreModule, ProviderModule providerModule, GuideModule guideModule, StorageModule storageModule) {
            this.supportSdkProvidersComponentImpl = this;
            this.coreModule = coreModule;
            initialize(supportApplicationModule, coreModule, providerModule, guideModule, storageModule);
        }
    }

    private DaggerSupportSdkProvidersComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }
}
