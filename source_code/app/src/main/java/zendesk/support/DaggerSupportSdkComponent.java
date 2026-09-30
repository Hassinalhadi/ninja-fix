package zendesk.support;

import Kd.a;
import com.squareup.picasso.Picasso;
import dagger.internal.d;
import dagger.internal.e;
import java.util.List;
import s6.AbstractC2763s0;
import zendesk.commonui.PermissionsHandler;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetAuthenticationProviderFactory;
import zendesk.core.CoreModule_GetExecutorServiceFactory;
import zendesk.core.CoreModule_GetMemoryCacheFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.MediaFileResolver_Factory;
import zendesk.support.request.RequestActivity;
import zendesk.support.request.RequestActivity_MembersInjector;
import zendesk.support.request.RequestComponent;
import zendesk.support.request.RequestModule;
import zendesk.support.request.RequestModule_PermissionsHandlerFactory;
import zendesk.support.request.RequestModule_ProvideMediaResultUtilityFactory;
import zendesk.support.request.RequestModule_ProvidesActionFactoryFactory;
import zendesk.support.request.RequestModule_ProvidesAsyncMiddlewareFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentDownloaderComponentFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentDownloaderFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentToDiskServiceFactory;
import zendesk.support.request.RequestModule_ProvidesComponentListenerFactory;
import zendesk.support.request.RequestModule_ProvidesConUpdatesComponentFactory;
import zendesk.support.request.RequestModule_ProvidesDiskQueueFactory;
import zendesk.support.request.RequestModule_ProvidesDispatcherFactory;
import zendesk.support.request.RequestModule_ProvidesMessageFactoryFactory;
import zendesk.support.request.RequestModule_ProvidesPersistenceComponentFactory;
import zendesk.support.request.RequestModule_ProvidesReducerFactory;
import zendesk.support.request.RequestModule_ProvidesResolveUriTaskFactory;
import zendesk.support.request.RequestModule_ProvidesStoreFactory;
import zendesk.support.request.RequestViewConversationsDisabled;
import zendesk.support.request.RequestViewConversationsDisabled_MembersInjector;
import zendesk.support.request.RequestViewConversationsEnabled;
import zendesk.support.request.RequestViewConversationsEnabled_MembersInjector;
import zendesk.support.requestlist.RequestListActivity;
import zendesk.support.requestlist.RequestListActivity_MembersInjector;
import zendesk.support.requestlist.RequestListComponent;
import zendesk.support.requestlist.RequestListModule;
import zendesk.support.requestlist.RequestListModule_ModelFactory;
import zendesk.support.requestlist.RequestListModule_PresenterFactory;
import zendesk.support.requestlist.RequestListModule_RefreshHandlerFactory;
import zendesk.support.requestlist.RequestListModule_RepositoryFactory;
import zendesk.support.requestlist.RequestListViewModule;
import zendesk.support.requestlist.RequestListViewModule_ViewFactory;
import zendesk.support.suas.Store;

/* loaded from: classes.dex */
public final class DaggerSupportSdkComponent {

    /* loaded from: classes.dex */
    public static final class Builder {
        private CoreModule coreModule;
        private SupportModule supportModule;
        private SupportSdkModule supportSdkModule;

        public /* synthetic */ Builder(int i4) {
            this();
        }

        public SupportSdkComponent build() {
            AbstractC2763s0.bravo(CoreModule.class, this.coreModule);
            AbstractC2763s0.bravo(SupportModule.class, this.supportModule);
            if (this.supportSdkModule == null) {
                this.supportSdkModule = new SupportSdkModule();
            }
            return new SupportSdkComponentImpl(this.coreModule, this.supportModule, this.supportSdkModule, 0);
        }

        public Builder coreModule(CoreModule coreModule) {
            coreModule.getClass();
            this.coreModule = coreModule;
            return this;
        }

        public Builder supportModule(SupportModule supportModule) {
            supportModule.getClass();
            this.supportModule = supportModule;
            return this;
        }

        public Builder supportSdkModule(SupportSdkModule supportSdkModule) {
            supportSdkModule.getClass();
            this.supportSdkModule = supportSdkModule;
            return this;
        }

        private Builder() {
        }
    }

    /* loaded from: classes.dex */
    public static final class RequestComponentImpl implements RequestComponent {
        private a mediaFileResolverProvider;
        private a permissionsHandlerProvider;
        private a provideMediaResultUtilityProvider;
        private a providesActionFactoryProvider;
        private a providesAsyncMiddlewareProvider;
        private a providesAttachmentDownloaderComponentProvider;
        private a providesAttachmentDownloaderProvider;
        private a providesAttachmentToDiskServiceProvider;
        private a providesComponentListenerProvider;
        private a providesConUpdatesComponentProvider;
        private a providesDiskQueueProvider;
        private a providesDispatcherProvider;
        private a providesMessageFactoryProvider;
        private a providesPersistenceComponentProvider;
        private a providesReducerProvider;
        private a providesResolveUriTaskProvider;
        private a providesStoreProvider;
        private final RequestComponentImpl requestComponentImpl;
        private final SupportSdkComponentImpl supportSdkComponentImpl;

        public /* synthetic */ RequestComponentImpl(SupportSdkComponentImpl supportSdkComponentImpl, RequestModule requestModule, int i4) {
            this(supportSdkComponentImpl, requestModule);
        }

        private void initialize(RequestModule requestModule) {
            this.providesReducerProvider = dagger.internal.a.alpha(RequestModule_ProvidesReducerFactory.create());
            d alpha = dagger.internal.a.alpha(RequestModule_ProvidesAsyncMiddlewareFactory.create());
            this.providesAsyncMiddlewareProvider = alpha;
            this.providesStoreProvider = dagger.internal.a.alpha(RequestModule_ProvidesStoreFactory.create(this.providesReducerProvider, alpha));
            this.mediaFileResolverProvider = MediaFileResolver_Factory.create(this.supportSdkComponentImpl.getApplicationContextProvider);
            d alpha2 = dagger.internal.a.alpha(RequestModule_ProvideMediaResultUtilityFactory.create(requestModule, this.supportSdkComponentImpl.getApplicationContextProvider, this.mediaFileResolverProvider));
            this.provideMediaResultUtilityProvider = alpha2;
            this.providesResolveUriTaskProvider = dagger.internal.a.alpha(RequestModule_ProvidesResolveUriTaskFactory.create(alpha2, this.supportSdkComponentImpl.getExecutorServiceProvider, this.supportSdkComponentImpl.mainThreadExecutorProvider));
            this.providesActionFactoryProvider = dagger.internal.a.alpha(RequestModule_ProvidesActionFactoryFactory.create(this.supportSdkComponentImpl.providesRequestProvider, this.supportSdkComponentImpl.providesSettingsProvider, this.supportSdkComponentImpl.providesUploadProvider, this.supportSdkComponentImpl.supportUiStorageProvider, this.supportSdkComponentImpl.getExecutorServiceProvider, this.supportSdkComponentImpl.mainThreadExecutorProvider, this.supportSdkComponentImpl.getAuthenticationProvider, this.supportSdkComponentImpl.providesBlipsProvider, this.provideMediaResultUtilityProvider, this.providesResolveUriTaskProvider));
            this.providesDiskQueueProvider = dagger.internal.a.alpha(RequestModule_ProvidesDiskQueueFactory.create(this.supportSdkComponentImpl.getExecutorServiceProvider));
            this.providesPersistenceComponentProvider = dagger.internal.a.alpha(RequestModule_ProvidesPersistenceComponentFactory.create(this.supportSdkComponentImpl.supportUiStorageProvider, this.providesDiskQueueProvider, this.supportSdkComponentImpl.getExecutorServiceProvider));
            this.providesDispatcherProvider = dagger.internal.a.alpha(RequestModule_ProvidesDispatcherFactory.create(this.providesStoreProvider));
            d alpha3 = dagger.internal.a.alpha(RequestModule_ProvidesAttachmentToDiskServiceFactory.create(this.supportSdkComponentImpl.providesOkHttpClientProvider, this.supportSdkComponentImpl.getExecutorServiceProvider));
            this.providesAttachmentToDiskServiceProvider = alpha3;
            d alpha4 = dagger.internal.a.alpha(RequestModule_ProvidesAttachmentDownloaderFactory.create(alpha3, this.provideMediaResultUtilityProvider));
            this.providesAttachmentDownloaderProvider = alpha4;
            this.providesAttachmentDownloaderComponentProvider = dagger.internal.a.alpha(RequestModule_ProvidesAttachmentDownloaderComponentFactory.create(this.providesDispatcherProvider, this.providesActionFactoryProvider, alpha4));
            d alpha5 = e.alpha(RequestModule_ProvidesConUpdatesComponentFactory.create(this.supportSdkComponentImpl.getApplicationContextProvider, this.supportSdkComponentImpl.actionHandlerRegistryProvider, this.supportSdkComponentImpl.requestInfoDataSourceProvider));
            this.providesConUpdatesComponentProvider = alpha5;
            this.providesComponentListenerProvider = dagger.internal.a.alpha(RequestModule_ProvidesComponentListenerFactory.create(this.providesPersistenceComponentProvider, this.providesAttachmentDownloaderComponentProvider, alpha5));
            this.permissionsHandlerProvider = dagger.internal.a.alpha(RequestModule_PermissionsHandlerFactory.create(requestModule));
            this.providesMessageFactoryProvider = dagger.internal.a.alpha(RequestModule_ProvidesMessageFactoryFactory.create(requestModule, this.supportSdkComponentImpl.getApplicationContextProvider, this.supportSdkComponentImpl.providesPicassoProvider, this.providesActionFactoryProvider, this.providesDispatcherProvider, this.supportSdkComponentImpl.actionHandlerRegistryProvider, this.supportSdkComponentImpl.configurationHelperProvider, this.provideMediaResultUtilityProvider));
        }

        private RequestActivity injectRequestActivity(RequestActivity requestActivity) {
            RequestActivity_MembersInjector.injectStore(requestActivity, (Store) this.providesStoreProvider.get());
            RequestActivity_MembersInjector.injectActionFactory(requestActivity, this.providesActionFactoryProvider.get());
            RequestActivity_MembersInjector.injectHeadlessComponentListener(requestActivity, this.providesComponentListenerProvider.get());
            RequestActivity_MembersInjector.injectPicasso(requestActivity, (Picasso) this.supportSdkComponentImpl.providesPicassoProvider.get());
            RequestActivity_MembersInjector.injectActionHandlerRegistry(requestActivity, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.supportSdkComponentImpl.coreModule));
            RequestActivity_MembersInjector.injectMediaResultUtility(requestActivity, this.provideMediaResultUtilityProvider.get());
            RequestActivity_MembersInjector.injectPermissionsHandler(requestActivity, (PermissionsHandler) this.permissionsHandlerProvider.get());
            return requestActivity;
        }

        private RequestViewConversationsDisabled injectRequestViewConversationsDisabled(RequestViewConversationsDisabled requestViewConversationsDisabled) {
            RequestViewConversationsDisabled_MembersInjector.injectStore(requestViewConversationsDisabled, (Store) this.providesStoreProvider.get());
            RequestViewConversationsDisabled_MembersInjector.injectActionFactory(requestViewConversationsDisabled, this.providesActionFactoryProvider.get());
            RequestViewConversationsDisabled_MembersInjector.injectPicasso(requestViewConversationsDisabled, (Picasso) this.supportSdkComponentImpl.providesPicassoProvider.get());
            RequestViewConversationsDisabled_MembersInjector.injectMediaResultUtility(requestViewConversationsDisabled, this.provideMediaResultUtilityProvider.get());
            return requestViewConversationsDisabled;
        }

        private RequestViewConversationsEnabled injectRequestViewConversationsEnabled(RequestViewConversationsEnabled requestViewConversationsEnabled) {
            RequestViewConversationsEnabled_MembersInjector.injectStore(requestViewConversationsEnabled, (Store) this.providesStoreProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectActionFactory(requestViewConversationsEnabled, this.providesActionFactoryProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectCellFactory(requestViewConversationsEnabled, this.providesMessageFactoryProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectPicasso(requestViewConversationsEnabled, (Picasso) this.supportSdkComponentImpl.providesPicassoProvider.get());
            return requestViewConversationsEnabled;
        }

        @Override // zendesk.support.request.RequestComponent
        public void inject(RequestActivity requestActivity) {
            injectRequestActivity(requestActivity);
        }

        private RequestComponentImpl(SupportSdkComponentImpl supportSdkComponentImpl, RequestModule requestModule) {
            this.requestComponentImpl = this;
            this.supportSdkComponentImpl = supportSdkComponentImpl;
            initialize(requestModule);
        }

        @Override // zendesk.support.request.RequestComponent
        public void inject(RequestViewConversationsEnabled requestViewConversationsEnabled) {
            injectRequestViewConversationsEnabled(requestViewConversationsEnabled);
        }

        @Override // zendesk.support.request.RequestComponent
        public void inject(RequestViewConversationsDisabled requestViewConversationsDisabled) {
            injectRequestViewConversationsDisabled(requestViewConversationsDisabled);
        }
    }

    /* loaded from: classes.dex */
    public static final class RequestListComponentImpl implements RequestListComponent {
        private a modelProvider;
        private a presenterProvider;
        private a refreshHandlerProvider;
        private a repositoryProvider;
        private final RequestListComponentImpl requestListComponentImpl;
        private final SupportSdkComponentImpl supportSdkComponentImpl;
        private a viewProvider;

        public /* synthetic */ RequestListComponentImpl(SupportSdkComponentImpl supportSdkComponentImpl, RequestListModule requestListModule, RequestListViewModule requestListViewModule, int i4) {
            this(supportSdkComponentImpl, requestListModule, requestListViewModule);
        }

        private void initialize(RequestListModule requestListModule, RequestListViewModule requestListViewModule) {
            d alpha = dagger.internal.a.alpha(RequestListModule_RepositoryFactory.create(this.supportSdkComponentImpl.requestInfoDataSourceProvider, this.supportSdkComponentImpl.supportUiStorageProvider, this.supportSdkComponentImpl.providesRequestProvider, this.supportSdkComponentImpl.mainThreadExecutorProvider, this.supportSdkComponentImpl.getExecutorServiceProvider));
            this.repositoryProvider = alpha;
            d alpha2 = dagger.internal.a.alpha(RequestListModule_ModelFactory.create(requestListModule, alpha, this.supportSdkComponentImpl.getMemoryCacheProvider, this.supportSdkComponentImpl.providesBlipsProvider, this.supportSdkComponentImpl.providesSettingsProvider));
            this.modelProvider = alpha2;
            this.presenterProvider = dagger.internal.a.alpha(RequestListModule_PresenterFactory.create(requestListModule, alpha2));
            this.viewProvider = dagger.internal.a.alpha(RequestListViewModule_ViewFactory.create(requestListViewModule, this.supportSdkComponentImpl.providesPicassoProvider));
            this.refreshHandlerProvider = dagger.internal.a.alpha(RequestListModule_RefreshHandlerFactory.create(this.presenterProvider));
        }

        private RequestListActivity injectRequestListActivity(RequestListActivity requestListActivity) {
            RequestListActivity_MembersInjector.injectPresenter(requestListActivity, this.presenterProvider.get());
            RequestListActivity_MembersInjector.injectView(requestListActivity, this.viewProvider.get());
            RequestListActivity_MembersInjector.injectModel(requestListActivity, this.modelProvider.get());
            RequestListActivity_MembersInjector.injectActionHandlerRegistry(requestListActivity, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.supportSdkComponentImpl.coreModule));
            RequestListActivity_MembersInjector.injectSyncHandler(requestListActivity, this.refreshHandlerProvider.get());
            return requestListActivity;
        }

        @Override // zendesk.support.requestlist.RequestListComponent
        public void inject(RequestListActivity requestListActivity) {
            injectRequestListActivity(requestListActivity);
        }

        private RequestListComponentImpl(SupportSdkComponentImpl supportSdkComponentImpl, RequestListModule requestListModule, RequestListViewModule requestListViewModule) {
            this.requestListComponentImpl = this;
            this.supportSdkComponentImpl = supportSdkComponentImpl;
            initialize(requestListModule, requestListViewModule);
        }
    }

    /* loaded from: classes.dex */
    public static final class SupportSdkComponentImpl implements SupportSdkComponent {
        private a actionHandlerRegistryProvider;
        private a configurationHelperProvider;
        private final CoreModule coreModule;
        private a getApplicationContextProvider;
        private a getAuthenticationProvider;
        private a getExecutorServiceProvider;
        private a getMemoryCacheProvider;
        private a getSessionStorageProvider;
        private a mainThreadExecutorProvider;
        private a okHttp3DownloaderProvider;
        private a providesActionHandlersProvider;
        private a providesBlipsProvider;
        private a providesOkHttpClientProvider;
        private a providesPicassoProvider;
        private a providesProvider;
        private a providesRequestDiskLruCacheProvider;
        private a providesRequestProvider;
        private a providesSettingsProvider;
        private a providesUploadProvider;
        private a requestInfoDataSourceProvider;
        private final SupportSdkComponentImpl supportSdkComponentImpl;
        private a supportUiStorageProvider;

        public /* synthetic */ SupportSdkComponentImpl(CoreModule coreModule, SupportModule supportModule, SupportSdkModule supportSdkModule, int i4) {
            this(coreModule, supportModule, supportSdkModule);
        }

        private void initialize(CoreModule coreModule, SupportModule supportModule, SupportSdkModule supportSdkModule) {
            this.providesActionHandlersProvider = dagger.internal.a.alpha(SupportSdkModule_ProvidesActionHandlersFactory.create(supportSdkModule));
            this.providesRequestProvider = SupportModule_ProvidesRequestProviderFactory.create(supportModule);
            this.providesSettingsProvider = SupportModule_ProvidesSettingsProviderFactory.create(supportModule);
            this.providesUploadProvider = SupportModule_ProvidesUploadProviderFactory.create(supportModule);
            CoreModule_GetSessionStorageFactory create = CoreModule_GetSessionStorageFactory.create(coreModule);
            this.getSessionStorageProvider = create;
            this.providesRequestDiskLruCacheProvider = dagger.internal.a.alpha(SupportSdkModule_ProvidesRequestDiskLruCacheFactory.create(supportSdkModule, create));
            d alpha = dagger.internal.a.alpha(SupportSdkModule_ProvidesFactory.create(supportSdkModule));
            this.providesProvider = alpha;
            this.supportUiStorageProvider = dagger.internal.a.alpha(SupportSdkModule_SupportUiStorageFactory.create(supportSdkModule, this.providesRequestDiskLruCacheProvider, alpha));
            this.getExecutorServiceProvider = CoreModule_GetExecutorServiceFactory.create(coreModule);
            this.mainThreadExecutorProvider = dagger.internal.a.alpha(SupportSdkModule_MainThreadExecutorFactory.create(supportSdkModule));
            this.getAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.create(coreModule);
            this.providesBlipsProvider = SupportModule_ProvidesBlipsProviderFactory.create(supportModule);
            this.getApplicationContextProvider = CoreModule_GetApplicationContextFactory.create(coreModule);
            this.providesOkHttpClientProvider = SupportModule_ProvidesOkHttpClientFactory.create(supportModule);
            this.actionHandlerRegistryProvider = CoreModule_ActionHandlerRegistryFactory.create(coreModule);
            this.requestInfoDataSourceProvider = SupportSdkModule_RequestInfoDataSourceFactory.create(supportSdkModule, this.supportUiStorageProvider, this.mainThreadExecutorProvider, this.getExecutorServiceProvider);
            d alpha2 = dagger.internal.a.alpha(SupportSdkModule_OkHttp3DownloaderFactory.create(supportSdkModule, this.providesOkHttpClientProvider));
            this.okHttp3DownloaderProvider = alpha2;
            this.providesPicassoProvider = dagger.internal.a.alpha(SupportSdkModule_ProvidesPicassoFactory.create(supportSdkModule, this.getApplicationContextProvider, alpha2, this.getExecutorServiceProvider));
            this.configurationHelperProvider = SupportSdkModule_ConfigurationHelperFactory.create(supportSdkModule);
            this.getMemoryCacheProvider = CoreModule_GetMemoryCacheFactory.create(coreModule);
        }

        private DeepLinkingBroadcastReceiver injectDeepLinkingBroadcastReceiver(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver) {
            DeepLinkingBroadcastReceiver_MembersInjector.injectRegistry(deepLinkingBroadcastReceiver, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
            return deepLinkingBroadcastReceiver;
        }

        private SdkDependencyProvider injectSdkDependencyProvider(SdkDependencyProvider sdkDependencyProvider) {
            SdkDependencyProvider_MembersInjector.injectRegistry(sdkDependencyProvider, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
            SdkDependencyProvider_MembersInjector.injectActionHandlers(sdkDependencyProvider, (List) this.providesActionHandlersProvider.get());
            return sdkDependencyProvider;
        }

        @Override // zendesk.support.SupportSdkComponent
        public void inject(SdkDependencyProvider sdkDependencyProvider) {
            injectSdkDependencyProvider(sdkDependencyProvider);
        }

        @Override // zendesk.support.SupportSdkComponent
        public RequestComponent plus(RequestModule requestModule) {
            requestModule.getClass();
            return new RequestComponentImpl(this.supportSdkComponentImpl, requestModule, 0);
        }

        private SupportSdkComponentImpl(CoreModule coreModule, SupportModule supportModule, SupportSdkModule supportSdkModule) {
            this.supportSdkComponentImpl = this;
            this.coreModule = coreModule;
            initialize(coreModule, supportModule, supportSdkModule);
        }

        @Override // zendesk.support.SupportSdkComponent
        public void inject(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver) {
            injectDeepLinkingBroadcastReceiver(deepLinkingBroadcastReceiver);
        }

        @Override // zendesk.support.SupportSdkComponent
        public RequestListComponent plus(RequestListModule requestListModule, RequestListViewModule requestListViewModule) {
            requestListModule.getClass();
            requestListViewModule.getClass();
            return new RequestListComponentImpl(this.supportSdkComponentImpl, requestListModule, requestListViewModule, 0);
        }
    }

    private DaggerSupportSdkComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }
}
