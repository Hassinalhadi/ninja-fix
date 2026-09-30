package zendesk.support.request;

import android.app.Activity;
import android.content.Context;
import com.squareup.picasso.Picasso;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;
import zendesk.commonui.PermissionsHandler;
import zendesk.configurations.Configuration;
import zendesk.configurations.ConfigurationHelper;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;
import zendesk.core.MediaFileResolver;
import zendesk.core.Zendesk;
import zendesk.support.ActivityScope;
import zendesk.support.BuildConfig;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.UploadProvider;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.AttachmentDownloaderComponent;
import zendesk.support.request.ComponentPersistence;
import zendesk.support.requestlist.RequestInfoDataSource;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Filters;
import zendesk.support.suas.Reducer;
import zendesk.support.suas.Store;
import zendesk.support.suas.Suas;

/* loaded from: classes.dex */
public class RequestModule {
    private final Activity activity;
    private final Configuration configuration;

    public RequestModule(Activity activity, Configuration configuration) {
        this.activity = activity;
        this.configuration = configuration;
    }

    @ActivityScope
    public static ActionFactory providesActionFactory(RequestProvider requestProvider, SupportSettingsProvider supportSettingsProvider, UploadProvider uploadProvider, SupportUiStorage supportUiStorage, ExecutorService executorService, Executor executor, AuthenticationProvider authenticationProvider, SupportBlipsProvider supportBlipsProvider, MediaResultUtility mediaResultUtility, ResolveUri resolveUri) {
        return new ActionFactory(requestProvider, uploadProvider, supportSettingsProvider, supportUiStorage, executorService, BuildConfig.VERSION_NAME, authenticationProvider, Zendesk.INSTANCE, supportBlipsProvider, executor, mediaResultUtility, resolveUri);
    }

    @ActivityScope
    public static AsyncMiddleware providesAsyncMiddleware() {
        return new AsyncMiddleware(new AsyncMiddleware.Queue());
    }

    @ActivityScope
    public static AttachmentDownloaderComponent.AttachmentDownloader providesAttachmentDownloader(AttachmentDownloadService attachmentDownloadService, MediaResultUtility mediaResultUtility) {
        return new AttachmentDownloaderComponent.AttachmentDownloader(attachmentDownloadService, mediaResultUtility);
    }

    @ActivityScope
    public static AttachmentDownloaderComponent providesAttachmentDownloaderComponent(Dispatcher dispatcher, ActionFactory actionFactory, AttachmentDownloaderComponent.AttachmentDownloader attachmentDownloader) {
        return new AttachmentDownloaderComponent(dispatcher, actionFactory, attachmentDownloader);
    }

    @ActivityScope
    public static AttachmentDownloadService providesAttachmentToDiskService(OkHttpClient okHttpClient, ExecutorService executorService) {
        return new AttachmentDownloadService(okHttpClient, executorService);
    }

    @ActivityScope
    public static HeadlessComponentListener providesComponentListener(ComponentPersistence componentPersistence, AttachmentDownloaderComponent attachmentDownloaderComponent, ComponentUpdateActionHandlers componentUpdateActionHandlers) {
        return new HeadlessComponentListener(componentPersistence, attachmentDownloaderComponent, componentUpdateActionHandlers);
    }

    public static ComponentUpdateActionHandlers providesConUpdatesComponent(Context context, ActionHandlerRegistry actionHandlerRegistry, RequestInfoDataSource.LocalDataSource localDataSource) {
        return new ComponentUpdateActionHandlers(context, actionHandlerRegistry, localDataSource);
    }

    @ActivityScope
    public static ComponentPersistence.PersistenceQueue providesDiskQueue(ExecutorService executorService) {
        return new ComponentPersistence.PersistenceQueue(executorService);
    }

    @ActivityScope
    public static Dispatcher providesDispatcher(Store store) {
        return store;
    }

    @ActivityScope
    public static ComponentPersistence providesPersistenceComponent(SupportUiStorage supportUiStorage, ComponentPersistence.PersistenceQueue persistenceQueue, ExecutorService executorService) {
        return new ComponentPersistence(supportUiStorage, persistenceQueue, executorService);
    }

    @ActivityScope
    public static List<Reducer> providesReducer() {
        return Arrays.asList(new ReducerProgress(), new ReducerConfiguration(), new ReducerConversation(), new ReducerAttachments(), new ReducerAndroidLifecycle(), new ReducerUiState(), new ReducerError());
    }

    @ActivityScope
    public static ResolveUri providesResolveUriTask(MediaResultUtility mediaResultUtility, ExecutorService executorService, Executor executor) {
        return new ResolveUri(mediaResultUtility, executorService, executor);
    }

    @ActivityScope
    public static Store providesStore(List<Reducer> list, AsyncMiddleware asyncMiddleware) {
        return Suas.createStore(list).withMiddleware(asyncMiddleware).withDefaultFilter(Filters.EQUALS).build();
    }

    @ActivityScope
    public PermissionsHandler permissionsHandler() {
        return new PermissionsHandler(this.activity);
    }

    @ActivityScope
    public MediaResultUtility provideMediaResultUtility(Context context, MediaFileResolver mediaFileResolver) {
        return new MediaResultUtility(context, mediaFileResolver);
    }

    @ActivityScope
    public CellFactory providesMessageFactory(Context context, Picasso picasso, ActionFactory actionFactory, Dispatcher dispatcher, ActionHandlerRegistry actionHandlerRegistry, ConfigurationHelper configurationHelper, MediaResultUtility mediaResultUtility) {
        return new CellFactory(context.getApplicationContext(), picasso, actionFactory, dispatcher, actionHandlerRegistry, configurationHelper, this.configuration, mediaResultUtility);
    }
}
