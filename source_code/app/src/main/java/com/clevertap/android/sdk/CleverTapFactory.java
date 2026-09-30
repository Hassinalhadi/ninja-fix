package com.clevertap.android.sdk;

import android.content.Context;
import com.clevertap.android.sdk.cryption.CTKeyGenerator;
import com.clevertap.android.sdk.cryption.CryptFactory;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.cryption.CryptMigrator;
import com.clevertap.android.sdk.cryption.CryptRepository;
import com.clevertap.android.sdk.cryption.DataMigrationRepository;
import com.clevertap.android.sdk.cryption.EncryptionLevel;
import com.clevertap.android.sdk.db.DBManager;
import com.clevertap.android.sdk.events.EventMediator;
import com.clevertap.android.sdk.events.EventQueueManager;
import com.clevertap.android.sdk.featureFlags.CTFeatureFlagsFactory;
import com.clevertap.android.sdk.inapp.ImpressionManager;
import com.clevertap.android.sdk.inapp.InAppActionHandler;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inapp.InAppNotificationInflater;
import com.clevertap.android.sdk.inapp.StoreRegistryInAppQueue;
import com.clevertap.android.sdk.inapp.TriggerManager;
import com.clevertap.android.sdk.inapp.customtemplates.TemplatesManager;
import com.clevertap.android.sdk.inapp.customtemplates.system.SystemTemplates;
import com.clevertap.android.sdk.inapp.evaluation.EvaluationManager;
import com.clevertap.android.sdk.inapp.evaluation.LimitsMatcher;
import com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepoFactory;
import com.clevertap.android.sdk.inapp.store.preference.ImpressionStore;
import com.clevertap.android.sdk.inapp.store.preference.InAppStore;
import com.clevertap.android.sdk.inapp.store.preference.StoreRegistry;
import com.clevertap.android.sdk.login.LoginController;
import com.clevertap.android.sdk.login.LoginInfoProvider;
import com.clevertap.android.sdk.network.AppLaunchListener;
import com.clevertap.android.sdk.network.ArpRepo;
import com.clevertap.android.sdk.network.CompositeBatchListener;
import com.clevertap.android.sdk.network.ContentFetchManager;
import com.clevertap.android.sdk.network.FetchInAppListener;
import com.clevertap.android.sdk.network.IJRepo;
import com.clevertap.android.sdk.network.NetworkEncryptionManager;
import com.clevertap.android.sdk.network.NetworkManager;
import com.clevertap.android.sdk.network.NetworkRepo;
import com.clevertap.android.sdk.network.QueueHeaderBuilder;
import com.clevertap.android.sdk.network.api.CtApiWrapper;
import com.clevertap.android.sdk.pushnotification.PushProviders;
import com.clevertap.android.sdk.pushnotification.work.CTWorkManager;
import com.clevertap.android.sdk.response.ARPResponse;
import com.clevertap.android.sdk.response.ClevertapResponseHandler;
import com.clevertap.android.sdk.response.ConsoleResponse;
import com.clevertap.android.sdk.response.ContentFetchResponse;
import com.clevertap.android.sdk.response.DisplayUnitResponse;
import com.clevertap.android.sdk.response.FeatureFlagResponse;
import com.clevertap.android.sdk.response.FetchVariablesResponse;
import com.clevertap.android.sdk.response.GeofenceResponse;
import com.clevertap.android.sdk.response.InAppResponse;
import com.clevertap.android.sdk.response.InboxResponse;
import com.clevertap.android.sdk.response.MetadataResponse;
import com.clevertap.android.sdk.response.ProductConfigResponse;
import com.clevertap.android.sdk.response.PushAmpResponse;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import com.clevertap.android.sdk.task.CTExecutors;
import com.clevertap.android.sdk.task.MainLooperHandler;
import com.clevertap.android.sdk.utils.Clock;
import com.clevertap.android.sdk.validation.ValidationResultStack;
import com.clevertap.android.sdk.validation.Validator;
import com.clevertap.android.sdk.variables.CTVariables;
import com.clevertap.android.sdk.variables.Parser;
import com.clevertap.android.sdk.variables.VarCache;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J>\u0010\f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002¨\u0006\u0017"}, d2 = {"Lcom/clevertap/android/sdk/CleverTapFactory;", "", "<init>", "()V", "getCoreState", "Lcom/clevertap/android/sdk/CoreState;", "context", "Landroid/content/Context;", "cleverTapInstanceConfig", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "cleverTapID", "", "initFeatureFlags", "", "controllerManager", "Lcom/clevertap/android/sdk/ControllerManager;", Constants.KEY_CONFIG, "deviceInfo", "Lcom/clevertap/android/sdk/DeviceInfo;", "callbackManager", "Lcom/clevertap/android/sdk/BaseCallbackManager;", "analyticsManager", "Lcom/clevertap/android/sdk/AnalyticsManager;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CleverTapFactory {

    @NotNull
    public static final CleverTapFactory INSTANCE = new CleverTapFactory();

    private CleverTapFactory() {
    }

    @NotNull
    public static final CoreState getCoreState(@Nullable final Context context, @Nullable CleverTapInstanceConfig cleverTapInstanceConfig, @Nullable String cleverTapID) {
        if (context != null && cleverTapInstanceConfig != null) {
            final StoreProvider companion = StoreProvider.INSTANCE.getInstance();
            String accountId = cleverTapInstanceConfig.getAccountId();
            Intrinsics.checkNotNull(accountId);
            final StoreRegistry storeRegistry = new StoreRegistry(null, null, companion.provideLegacyInAppStore(context, accountId), companion.provideInAppAssetsStore(context, accountId), companion.provideFileStore(context, accountId));
            CoreMetaData coreMetaData = new CoreMetaData();
            Validator validator = new Validator();
            ValidationResultStack validationResultStack = new ValidationResultStack();
            CTLockManager cTLockManager = new CTLockManager();
            MainLooperHandler mainLooperHandler = new MainLooperHandler();
            final CleverTapInstanceConfig cleverTapInstanceConfig2 = new CleverTapInstanceConfig(cleverTapInstanceConfig);
            NetworkRepo networkRepo = new NetworkRepo(context, cleverTapInstanceConfig2, null, null, 12, null);
            IJRepo iJRepo = new IJRepo(cleverTapInstanceConfig2);
            CTExecutors executors = CTExecutorFactory.executors(cleverTapInstanceConfig2);
            executors.ioTask().execute("initFileResourceProvider", new c(5, context, cleverTapInstanceConfig2));
            DBManager dBManager = new DBManager(cleverTapInstanceConfig2, cTLockManager, iJRepo, new CleverTapFactory$getCoreState$databaseManager$1(networkRepo), new CleverTapFactory$getCoreState$databaseManager$2(networkRepo));
            String accountId2 = cleverTapInstanceConfig2.getAccountId();
            Intrinsics.delta(accountId2, "getAccountId(...)");
            CryptRepository cryptRepository = new CryptRepository(context, accountId2);
            CTKeyGenerator cTKeyGenerator = new CTKeyGenerator(cryptRepository);
            String accountId3 = cleverTapInstanceConfig2.getAccountId();
            Intrinsics.delta(accountId3, "getAccountId(...)");
            CryptFactory cryptFactory = new CryptFactory(accountId3, cTKeyGenerator);
            EncryptionLevel fromInt = EncryptionLevel.INSTANCE.fromInt(cleverTapInstanceConfig2.getEncryptionLevel());
            String accountId4 = cleverTapInstanceConfig2.getAccountId();
            Intrinsics.delta(accountId4, "getAccountId(...)");
            final CryptHandler cryptHandler = new CryptHandler(fromInt, accountId4, cryptRepository, cryptFactory);
            executors.postAsyncSafelyTask().execute("migratingEncryption", new CallableC1002r(context, cleverTapInstanceConfig2, dBManager, cryptHandler, cryptRepository, 0));
            final DeviceInfo deviceInfo = new DeviceInfo(context, cleverTapInstanceConfig2, cleverTapID, coreMetaData);
            deviceInfo.onInitDeviceInfo(cleverTapID);
            LocalDataStore localDataStore = new LocalDataStore(context, cleverTapInstanceConfig2, cryptHandler, deviceInfo, dBManager);
            ProfileValueHandler profileValueHandler = new ProfileValueHandler(validator, validationResultStack);
            EventMediator eventMediator = new EventMediator(cleverTapInstanceConfig2, coreMetaData, localDataStore, profileValueHandler, networkRepo);
            CTPreferenceCache.INSTANCE.getInstance(context, cleverTapInstanceConfig2);
            final CallbackManager callbackManager = new CallbackManager(cleverTapInstanceConfig2, deviceInfo);
            SessionManager sessionManager = new SessionManager(cleverTapInstanceConfig2, coreMetaData, validator, localDataStore);
            ControllerManager controllerManager = new ControllerManager(context, cleverTapInstanceConfig2, cTLockManager, callbackManager, deviceInfo, dBManager);
            TriggersMatcher triggersMatcher = new TriggersMatcher(localDataStore);
            String accountId5 = cleverTapInstanceConfig2.getAccountId();
            Intrinsics.delta(accountId5, "getAccountId(...)");
            TriggerManager triggerManager = new TriggerManager(context, accountId5, deviceInfo);
            ImpressionManager impressionManager = new ImpressionManager(storeRegistry, null, null, 6, null);
            LimitsMatcher limitsMatcher = new LimitsMatcher(impressionManager, triggerManager);
            InAppActionHandler inAppActionHandler = new InAppActionHandler(context, cleverTapInstanceConfig2, new PushPermissionHandler(cleverTapInstanceConfig2, callbackManager.getPushPermissionResponseListenerList(), null, null, null, 28, null), null, 8, null);
            TemplatesManager createInstance = TemplatesManager.INSTANCE.createInstance(cleverTapInstanceConfig2, SystemTemplates.INSTANCE.getSystemTemplates(inAppActionHandler));
            final EvaluationManager evaluationManager = new EvaluationManager(triggersMatcher, triggerManager, limitsMatcher, storeRegistry, createInstance);
            executors.ioTask().execute("initStores", new Callable() { // from class: com.clevertap.android.sdk.s
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit coreState$lambda$2;
                    coreState$lambda$2 = CleverTapFactory.getCoreState$lambda$2(DeviceInfo.this, storeRegistry, companion, context, cryptHandler, cleverTapInstanceConfig2, evaluationManager, callbackManager);
                    return coreState$lambda$2;
                }
            });
            executors.ioTask().execute("initFCManager", new p(deviceInfo, controllerManager, cleverTapInstanceConfig2, context, storeRegistry, impressionManager, executors));
            FileResourcesRepoFactory.Companion companion2 = FileResourcesRepoFactory.INSTANCE;
            Logger logger = cleverTapInstanceConfig2.getLogger();
            Intrinsics.delta(logger, "getLogger(...)");
            VarCache varCache = new VarCache(cleverTapInstanceConfig2, context, companion2.createFileResourcesRepo(context, logger, storeRegistry));
            CTVariables cTVariables = new CTVariables(varCache);
            controllerManager.setCtVariables(cTVariables);
            Parser parser = new Parser(cTVariables);
            executors.ioTask().execute("initCTVariables", new a(1, cTVariables));
            InAppResponse inAppResponse = new InAppResponse(cleverTapInstanceConfig2, controllerManager, false, storeRegistry, triggerManager, createInstance, coreMetaData);
            CtApiWrapper ctApiWrapper = new CtApiWrapper(networkRepo, cleverTapInstanceConfig2, deviceInfo);
            NetworkEncryptionManager networkEncryptionManager = new NetworkEncryptionManager(cTKeyGenerator, cryptFactory.getAesGcmCrypt());
            String accountId6 = cleverTapInstanceConfig2.getAccountId();
            Intrinsics.delta(accountId6, "getAccountId(...)");
            Logger logger2 = cleverTapInstanceConfig2.getLogger();
            Intrinsics.delta(logger2, "getLogger(...)");
            ArpRepo arpRepo = new ArpRepo(accountId6, logger2, deviceInfo);
            CleverTapFactory$getCoreState$queueHeaderBuilder$1 cleverTapFactory$getCoreState$queueHeaderBuilder$1 = new CleverTapFactory$getCoreState$queueHeaderBuilder$1(networkRepo);
            CleverTapFactory$getCoreState$queueHeaderBuilder$2 cleverTapFactory$getCoreState$queueHeaderBuilder$2 = new CleverTapFactory$getCoreState$queueHeaderBuilder$2(networkRepo);
            Logger logger3 = cleverTapInstanceConfig2.getLogger();
            Intrinsics.delta(logger3, "getLogger(...)");
            QueueHeaderBuilder queueHeaderBuilder = new QueueHeaderBuilder(context, cleverTapInstanceConfig2, coreMetaData, controllerManager, deviceInfo, arpRepo, iJRepo, dBManager, validationResultStack, cleverTapFactory$getCoreState$queueHeaderBuilder$1, cleverTapFactory$getCoreState$queueHeaderBuilder$2, logger3);
            ARPResponse aRPResponse = new ARPResponse(cleverTapInstanceConfig2, validator, controllerManager, arpRepo);
            ContentFetchManager contentFetchManager = new ContentFetchManager(cleverTapInstanceConfig2, coreMetaData, queueHeaderBuilder, ctApiWrapper, 0, null, null, 112, null);
            ClevertapResponseHandler clevertapResponseHandler = new ClevertapResponseHandler(context, CollectionsKt.listOf(inAppResponse, new MetadataResponse(cleverTapInstanceConfig2, deviceInfo, iJRepo), aRPResponse, new ConsoleResponse(cleverTapInstanceConfig2), new InboxResponse(cleverTapInstanceConfig2, cTLockManager, callbackManager, controllerManager), new PushAmpResponse(context, cleverTapInstanceConfig2, dBManager, callbackManager, controllerManager), new FetchVariablesResponse(cleverTapInstanceConfig2, controllerManager, callbackManager), new DisplayUnitResponse(cleverTapInstanceConfig2, callbackManager, controllerManager), new FeatureFlagResponse(cleverTapInstanceConfig2, controllerManager), new ProductConfigResponse(cleverTapInstanceConfig2, coreMetaData, controllerManager), new GeofenceResponse(cleverTapInstanceConfig2, callbackManager), new ContentFetchResponse(cleverTapInstanceConfig2, contentFetchManager)));
            contentFetchManager.setClevertapResponseHandler(clevertapResponseHandler);
            NetworkManager networkManager = new NetworkManager(context, cleverTapInstanceConfig2, deviceInfo, coreMetaData, controllerManager, dBManager, callbackManager, ctApiWrapper, networkEncryptionManager, aRPResponse, networkRepo, queueHeaderBuilder, clevertapResponseHandler, null, 8192, null);
            LoginInfoProvider loginInfoProvider = new LoginInfoProvider(context, cleverTapInstanceConfig2, cryptHandler);
            EventQueueManager eventQueueManager = new EventQueueManager(dBManager, context, cleverTapInstanceConfig2, eventMediator, sessionManager, callbackManager, mainLooperHandler, deviceInfo, validationResultStack, networkManager, coreMetaData, cTLockManager, localDataStore, controllerManager, loginInfoProvider);
            InAppResponse inAppResponse2 = new InAppResponse(cleverTapInstanceConfig2, controllerManager, true, storeRegistry, triggerManager, createInstance, coreMetaData);
            Clock clock = Clock.SYSTEM;
            AnalyticsManager analyticsManager = new AnalyticsManager(context, cleverTapInstanceConfig2, eventQueueManager, validator, validationResultStack, coreMetaData, deviceInfo, callbackManager, controllerManager, cTLockManager, inAppResponse2, clock, executors);
            InAppNotificationInflater inAppNotificationInflater = new InAppNotificationInflater(storeRegistry, createInstance, executors, new Function0() { // from class: com.clevertap.android.sdk.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    FileResourceProvider coreState$lambda$5;
                    coreState$lambda$5 = CleverTapFactory.getCoreState$lambda$5(context, cleverTapInstanceConfig2);
                    return coreState$lambda$5;
                }
            }, false, 16, null);
            networkManager.addNetworkHeadersListener(evaluationManager);
            ManifestInfo manifestInfo = ManifestInfo.getInstance(context);
            Intrinsics.delta(manifestInfo, "getInstance(...)");
            String accountId7 = cleverTapInstanceConfig2.getAccountId();
            Intrinsics.delta(accountId7, "getAccountId(...)");
            InAppController inAppController = new InAppController(context, cleverTapInstanceConfig2, executors, controllerManager, callbackManager, analyticsManager, coreMetaData, manifestInfo, deviceInfo, new StoreRegistryInAppQueue(storeRegistry, accountId7), evaluationManager, createInstance, inAppActionHandler, inAppNotificationInflater, clock);
            controllerManager.setInAppController(inAppController);
            AppLaunchListener appLaunchListener = new AppLaunchListener();
            appLaunchListener.addListener(inAppController.getOnAppLaunchEventSent());
            CompositeBatchListener compositeBatchListener = new CompositeBatchListener();
            compositeBatchListener.addListener(appLaunchListener);
            compositeBatchListener.addListener(new FetchInAppListener(callbackManager));
            callbackManager.setBatchListener(compositeBatchListener);
            executors.ioTask().execute("initFeatureFlags", new u(context, controllerManager, cleverTapInstanceConfig2, deviceInfo, callbackManager, analyticsManager, 0));
            LocationManager locationManager = new LocationManager(context, cleverTapInstanceConfig2, coreMetaData, eventQueueManager);
            PushProviders load = PushProviders.load(context, cleverTapInstanceConfig2, dBManager, validationResultStack, analyticsManager, controllerManager, new CTWorkManager(context, cleverTapInstanceConfig2));
            Intrinsics.delta(load, "load(...)");
            return new CoreState(locationManager, cleverTapInstanceConfig2, coreMetaData, dBManager, deviceInfo, eventMediator, localDataStore, new ActivityLifeCycleManager(context, cleverTapInstanceConfig2, analyticsManager, coreMetaData, sessionManager, load, callbackManager, inAppController, eventQueueManager, executors, clock), analyticsManager, eventQueueManager, cTLockManager, callbackManager, controllerManager, inAppController, evaluationManager, impressionManager, new LoginController(context, cleverTapInstanceConfig2, deviceInfo, validationResultStack, eventQueueManager, analyticsManager, coreMetaData, controllerManager, sessionManager, localDataStore, callbackManager, dBManager, cTLockManager, loginInfoProvider, contentFetchManager), sessionManager, validationResultStack, mainLooperHandler, networkManager, load, varCache, parser, cryptHandler, storeRegistry, createInstance, profileValueHandler, cTVariables, executors);
        }
        throw new RuntimeException("This is invalid case and will not happen. Context/Config is null");
    }

    public static final Unit getCoreState$lambda$0(Context context, CleverTapInstanceConfig config) {
        Intrinsics.echo(config, "$config");
        FileResourceProvider.INSTANCE.getInstance(context, config.getLogger());
        return Unit.INSTANCE;
    }

    public static final Unit getCoreState$lambda$1(Context context, CleverTapInstanceConfig config, DBManager databaseManager, CryptHandler cryptHandler, CryptRepository repository) {
        Intrinsics.echo(config, "$config");
        Intrinsics.echo(databaseManager, "$databaseManager");
        Intrinsics.echo(cryptHandler, "$cryptHandler");
        Intrinsics.echo(repository, "$repository");
        DataMigrationRepository dataMigrationRepository = new DataMigrationRepository(context, config, databaseManager.loadDBAdapter(context));
        String accountId = config.getAccountId();
        Intrinsics.delta(accountId, "getAccountId(...)");
        int encryptionLevel = config.getEncryptionLevel();
        Logger logger = config.getLogger();
        Intrinsics.delta(logger, "getLogger(...)");
        new CryptMigrator(accountId, encryptionLevel, logger, cryptHandler, repository, dataMigrationRepository).migrateEncryption();
        return Unit.INSTANCE;
    }

    public static final Unit getCoreState$lambda$2(DeviceInfo deviceInfo, StoreRegistry storeRegistry, StoreProvider storeProvider, Context context, CryptHandler cryptHandler, CleverTapInstanceConfig config, EvaluationManager evaluationManager, BaseCallbackManager callbackManager) {
        Intrinsics.echo(deviceInfo, "$deviceInfo");
        Intrinsics.echo(storeRegistry, "$storeRegistry");
        Intrinsics.echo(storeProvider, "$storeProvider");
        Intrinsics.echo(cryptHandler, "$cryptHandler");
        Intrinsics.echo(config, "$config");
        Intrinsics.echo(evaluationManager, "$evaluationManager");
        Intrinsics.echo(callbackManager, "$callbackManager");
        if (deviceInfo.getDeviceID() != null) {
            if (storeRegistry.getInAppStore() == null) {
                String deviceID = deviceInfo.getDeviceID();
                Intrinsics.delta(deviceID, "getDeviceID(...)");
                String accountId = config.getAccountId();
                Intrinsics.delta(accountId, "getAccountId(...)");
                InAppStore provideInAppStore = storeProvider.provideInAppStore(context, cryptHandler, deviceID, accountId);
                storeRegistry.setInAppStore(provideInAppStore);
                evaluationManager.loadSuppressedCSAndEvaluatedSSInAppsIds();
                callbackManager.addChangeUserCallback(provideInAppStore);
            }
            if (storeRegistry.getImpressionStore() == null) {
                String deviceID2 = deviceInfo.getDeviceID();
                Intrinsics.delta(deviceID2, "getDeviceID(...)");
                String accountId2 = config.getAccountId();
                Intrinsics.delta(accountId2, "getAccountId(...)");
                ImpressionStore provideImpressionStore = storeProvider.provideImpressionStore(context, deviceID2, accountId2);
                storeRegistry.setImpressionStore(provideImpressionStore);
                callbackManager.addChangeUserCallback(provideImpressionStore);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit getCoreState$lambda$3(DeviceInfo deviceInfo, ControllerManager controllerManager, CleverTapInstanceConfig config, Context context, StoreRegistry storeRegistry, ImpressionManager impressionManager, CTExecutors executors) {
        Intrinsics.echo(deviceInfo, "$deviceInfo");
        Intrinsics.echo(controllerManager, "$controllerManager");
        Intrinsics.echo(config, "$config");
        Intrinsics.echo(storeRegistry, "$storeRegistry");
        Intrinsics.echo(impressionManager, "$impressionManager");
        Intrinsics.echo(executors, "$executors");
        String deviceID = deviceInfo.getDeviceID();
        if (deviceID != null && controllerManager.getInAppFCManager() == null) {
            config.getLogger().verbose(config.getAccountId() + ":async_deviceID", "Initializing InAppFC with device Id = ".concat(deviceID));
            controllerManager.setInAppFCManager(new InAppFCManager(context, config, deviceID, storeRegistry, impressionManager, executors, Clock.SYSTEM));
        }
        return Unit.INSTANCE;
    }

    public static final Unit getCoreState$lambda$4(CTVariables ctVariables) {
        Intrinsics.echo(ctVariables, "$ctVariables");
        ctVariables.init();
        return Unit.INSTANCE;
    }

    public static final FileResourceProvider getCoreState$lambda$5(Context context, CleverTapInstanceConfig config) {
        Intrinsics.echo(config, "$config");
        return FileResourceProvider.INSTANCE.getInstance(context, config.getLogger());
    }

    public static final Unit getCoreState$lambda$6(Context context, ControllerManager controllerManager, CleverTapInstanceConfig config, DeviceInfo deviceInfo, BaseCallbackManager callbackManager, AnalyticsManager analyticsManager) {
        Intrinsics.echo(controllerManager, "$controllerManager");
        Intrinsics.echo(config, "$config");
        Intrinsics.echo(deviceInfo, "$deviceInfo");
        Intrinsics.echo(callbackManager, "$callbackManager");
        Intrinsics.echo(analyticsManager, "$analyticsManager");
        INSTANCE.initFeatureFlags(context, controllerManager, config, deviceInfo, callbackManager, analyticsManager);
        return Unit.INSTANCE;
    }

    private final void initFeatureFlags(Context context, ControllerManager controllerManager, CleverTapInstanceConfig r82, DeviceInfo deviceInfo, BaseCallbackManager callbackManager, AnalyticsManager analyticsManager) {
        r82.getLogger().verbose(r82.getAccountId() + ":async_deviceID", "Initializing Feature Flags with device Id = " + deviceInfo.getDeviceID());
        if (r82.isAnalyticsOnly()) {
            r82.getLogger().debug(r82.getAccountId(), "Feature Flag is not enabled for this instance");
            return;
        }
        controllerManager.setCTFeatureFlagsController(CTFeatureFlagsFactory.getInstance(context, deviceInfo.getDeviceID(), r82, callbackManager, analyticsManager));
        r82.getLogger().verbose(r82.getAccountId() + ":async_deviceID", "Feature Flags initialized");
    }
}
