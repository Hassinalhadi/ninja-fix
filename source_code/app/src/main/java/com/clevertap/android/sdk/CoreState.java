package com.clevertap.android.sdk;

import android.content.Context;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.db.BaseDatabaseManager;
import com.clevertap.android.sdk.events.BaseEventQueueManager;
import com.clevertap.android.sdk.events.EventMediator;
import com.clevertap.android.sdk.inapp.ImpressionManager;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inapp.customtemplates.TemplatesManager;
import com.clevertap.android.sdk.inapp.evaluation.EvaluationManager;
import com.clevertap.android.sdk.inapp.store.preference.StoreRegistry;
import com.clevertap.android.sdk.login.LoginController;
import com.clevertap.android.sdk.network.NetworkManager;
import com.clevertap.android.sdk.product_config.CTProductConfigController;
import com.clevertap.android.sdk.product_config.CTProductConfigFactory;
import com.clevertap.android.sdk.pushnotification.PushProviders;
import com.clevertap.android.sdk.task.CTExecutors;
import com.clevertap.android.sdk.task.MainLooperHandler;
import com.clevertap.android.sdk.validation.ValidationResultStack;
import com.clevertap.android.sdk.variables.CTVariables;
import com.clevertap.android.sdk.variables.Parser;
import com.clevertap.android.sdk.variables.VarCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B÷\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u000207\u0012\u0006\u00108\u001a\u000209\u0012\u0006\u0010:\u001a\u00020;\u0012\u0006\u0010<\u001a\u00020=¢\u0006\u0004\b>\u0010?J\u0014\u0010|\u001a\u0004\u0018\u00010}2\b\u0010~\u001a\u0004\u0018\u00010\u007fH\u0007J\u0014\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010~\u001a\u0004\u0018\u00010\u007fH\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0011\u00106\u001a\u000207¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0011\u00108\u001a\u000209¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0011\u0010:\u001a\u00020;¢\u0006\b\n\u0000\u001a\u0004\bx\u0010yR\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{¨\u0006\u0082\u0001"}, d2 = {"Lcom/clevertap/android/sdk/CoreState;", "", "locationManager", "Lcom/clevertap/android/sdk/BaseLocationManager;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "coreMetaData", "Lcom/clevertap/android/sdk/CoreMetaData;", "databaseManager", "Lcom/clevertap/android/sdk/db/BaseDatabaseManager;", "deviceInfo", "Lcom/clevertap/android/sdk/DeviceInfo;", "eventMediator", "Lcom/clevertap/android/sdk/events/EventMediator;", "localDataStore", "Lcom/clevertap/android/sdk/LocalDataStore;", "activityLifeCycleManager", "Lcom/clevertap/android/sdk/ActivityLifeCycleManager;", "analyticsManager", "Lcom/clevertap/android/sdk/AnalyticsManager;", "baseEventQueueManager", "Lcom/clevertap/android/sdk/events/BaseEventQueueManager;", "cTLockManager", "Lcom/clevertap/android/sdk/CTLockManager;", "callbackManager", "Lcom/clevertap/android/sdk/BaseCallbackManager;", "controllerManager", "Lcom/clevertap/android/sdk/ControllerManager;", "inAppController", "Lcom/clevertap/android/sdk/inapp/InAppController;", "evaluationManager", "Lcom/clevertap/android/sdk/inapp/evaluation/EvaluationManager;", "impressionManager", "Lcom/clevertap/android/sdk/inapp/ImpressionManager;", "loginController", "Lcom/clevertap/android/sdk/login/LoginController;", "sessionManager", "Lcom/clevertap/android/sdk/SessionManager;", "validationResultStack", "Lcom/clevertap/android/sdk/validation/ValidationResultStack;", "mainLooperHandler", "Lcom/clevertap/android/sdk/task/MainLooperHandler;", "networkManager", "Lcom/clevertap/android/sdk/network/NetworkManager;", "pushProviders", "Lcom/clevertap/android/sdk/pushnotification/PushProviders;", "varCache", "Lcom/clevertap/android/sdk/variables/VarCache;", "parser", "Lcom/clevertap/android/sdk/variables/Parser;", "cryptHandler", "Lcom/clevertap/android/sdk/cryption/CryptHandler;", "storeRegistry", "Lcom/clevertap/android/sdk/inapp/store/preference/StoreRegistry;", "templatesManager", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;", "profileValueHandler", "Lcom/clevertap/android/sdk/ProfileValueHandler;", "cTVariables", "Lcom/clevertap/android/sdk/variables/CTVariables;", "executors", "Lcom/clevertap/android/sdk/task/CTExecutors;", "<init>", "(Lcom/clevertap/android/sdk/BaseLocationManager;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lcom/clevertap/android/sdk/CoreMetaData;Lcom/clevertap/android/sdk/db/BaseDatabaseManager;Lcom/clevertap/android/sdk/DeviceInfo;Lcom/clevertap/android/sdk/events/EventMediator;Lcom/clevertap/android/sdk/LocalDataStore;Lcom/clevertap/android/sdk/ActivityLifeCycleManager;Lcom/clevertap/android/sdk/AnalyticsManager;Lcom/clevertap/android/sdk/events/BaseEventQueueManager;Lcom/clevertap/android/sdk/CTLockManager;Lcom/clevertap/android/sdk/BaseCallbackManager;Lcom/clevertap/android/sdk/ControllerManager;Lcom/clevertap/android/sdk/inapp/InAppController;Lcom/clevertap/android/sdk/inapp/evaluation/EvaluationManager;Lcom/clevertap/android/sdk/inapp/ImpressionManager;Lcom/clevertap/android/sdk/login/LoginController;Lcom/clevertap/android/sdk/SessionManager;Lcom/clevertap/android/sdk/validation/ValidationResultStack;Lcom/clevertap/android/sdk/task/MainLooperHandler;Lcom/clevertap/android/sdk/network/NetworkManager;Lcom/clevertap/android/sdk/pushnotification/PushProviders;Lcom/clevertap/android/sdk/variables/VarCache;Lcom/clevertap/android/sdk/variables/Parser;Lcom/clevertap/android/sdk/cryption/CryptHandler;Lcom/clevertap/android/sdk/inapp/store/preference/StoreRegistry;Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;Lcom/clevertap/android/sdk/ProfileValueHandler;Lcom/clevertap/android/sdk/variables/CTVariables;Lcom/clevertap/android/sdk/task/CTExecutors;)V", "getLocationManager", "()Lcom/clevertap/android/sdk/BaseLocationManager;", "getConfig", "()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "getCoreMetaData", "()Lcom/clevertap/android/sdk/CoreMetaData;", "getDatabaseManager", "()Lcom/clevertap/android/sdk/db/BaseDatabaseManager;", "getDeviceInfo", "()Lcom/clevertap/android/sdk/DeviceInfo;", "getEventMediator", "()Lcom/clevertap/android/sdk/events/EventMediator;", "getLocalDataStore", "()Lcom/clevertap/android/sdk/LocalDataStore;", "getActivityLifeCycleManager", "()Lcom/clevertap/android/sdk/ActivityLifeCycleManager;", "getAnalyticsManager", "()Lcom/clevertap/android/sdk/AnalyticsManager;", "getBaseEventQueueManager", "()Lcom/clevertap/android/sdk/events/BaseEventQueueManager;", "getCTLockManager", "()Lcom/clevertap/android/sdk/CTLockManager;", "getCallbackManager", "()Lcom/clevertap/android/sdk/BaseCallbackManager;", "getControllerManager", "()Lcom/clevertap/android/sdk/ControllerManager;", "getInAppController", "()Lcom/clevertap/android/sdk/inapp/InAppController;", "getEvaluationManager", "()Lcom/clevertap/android/sdk/inapp/evaluation/EvaluationManager;", "getImpressionManager", "()Lcom/clevertap/android/sdk/inapp/ImpressionManager;", "getLoginController", "()Lcom/clevertap/android/sdk/login/LoginController;", "getSessionManager", "()Lcom/clevertap/android/sdk/SessionManager;", "getValidationResultStack", "()Lcom/clevertap/android/sdk/validation/ValidationResultStack;", "getMainLooperHandler", "()Lcom/clevertap/android/sdk/task/MainLooperHandler;", "getNetworkManager", "()Lcom/clevertap/android/sdk/network/NetworkManager;", "getPushProviders", "()Lcom/clevertap/android/sdk/pushnotification/PushProviders;", "getVarCache", "()Lcom/clevertap/android/sdk/variables/VarCache;", "getParser", "()Lcom/clevertap/android/sdk/variables/Parser;", "getCryptHandler", "()Lcom/clevertap/android/sdk/cryption/CryptHandler;", "getStoreRegistry", "()Lcom/clevertap/android/sdk/inapp/store/preference/StoreRegistry;", "getTemplatesManager", "()Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;", "getProfileValueHandler", "()Lcom/clevertap/android/sdk/ProfileValueHandler;", "getCTVariables", "()Lcom/clevertap/android/sdk/variables/CTVariables;", "getExecutors", "()Lcom/clevertap/android/sdk/task/CTExecutors;", "getCtProductConfigController", "Lcom/clevertap/android/sdk/product_config/CTProductConfigController;", "context", "Landroid/content/Context;", "initProductConfig", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class CoreState {

    @NotNull
    private final ActivityLifeCycleManager activityLifeCycleManager;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final BaseEventQueueManager baseEventQueueManager;

    @NotNull
    private final CTLockManager cTLockManager;

    @NotNull
    private final CTVariables cTVariables;

    @NotNull
    private final BaseCallbackManager callbackManager;

    @NotNull
    private final CleverTapInstanceConfig config;

    @NotNull
    private final ControllerManager controllerManager;

    @NotNull
    private final CoreMetaData coreMetaData;

    @NotNull
    private final CryptHandler cryptHandler;

    @NotNull
    private final BaseDatabaseManager databaseManager;

    @NotNull
    private final DeviceInfo deviceInfo;

    @NotNull
    private final EvaluationManager evaluationManager;

    @NotNull
    private final EventMediator eventMediator;

    @NotNull
    private final CTExecutors executors;

    @NotNull
    private final ImpressionManager impressionManager;

    @NotNull
    private final InAppController inAppController;

    @NotNull
    private final LocalDataStore localDataStore;

    @NotNull
    private final BaseLocationManager locationManager;

    @NotNull
    private final LoginController loginController;

    @NotNull
    private final MainLooperHandler mainLooperHandler;

    @NotNull
    private final NetworkManager networkManager;

    @NotNull
    private final Parser parser;

    @NotNull
    private final ProfileValueHandler profileValueHandler;

    @NotNull
    private final PushProviders pushProviders;

    @NotNull
    private final SessionManager sessionManager;

    @NotNull
    private final StoreRegistry storeRegistry;

    @NotNull
    private final TemplatesManager templatesManager;

    @NotNull
    private final ValidationResultStack validationResultStack;

    @NotNull
    private final VarCache varCache;

    public CoreState(@NotNull BaseLocationManager locationManager, @NotNull CleverTapInstanceConfig config, @NotNull CoreMetaData coreMetaData, @NotNull BaseDatabaseManager databaseManager, @NotNull DeviceInfo deviceInfo, @NotNull EventMediator eventMediator, @NotNull LocalDataStore localDataStore, @NotNull ActivityLifeCycleManager activityLifeCycleManager, @NotNull AnalyticsManager analyticsManager, @NotNull BaseEventQueueManager baseEventQueueManager, @NotNull CTLockManager cTLockManager, @NotNull BaseCallbackManager callbackManager, @NotNull ControllerManager controllerManager, @NotNull InAppController inAppController, @NotNull EvaluationManager evaluationManager, @NotNull ImpressionManager impressionManager, @NotNull LoginController loginController, @NotNull SessionManager sessionManager, @NotNull ValidationResultStack validationResultStack, @NotNull MainLooperHandler mainLooperHandler, @NotNull NetworkManager networkManager, @NotNull PushProviders pushProviders, @NotNull VarCache varCache, @NotNull Parser parser, @NotNull CryptHandler cryptHandler, @NotNull StoreRegistry storeRegistry, @NotNull TemplatesManager templatesManager, @NotNull ProfileValueHandler profileValueHandler, @NotNull CTVariables cTVariables, @NotNull CTExecutors executors) {
        Intrinsics.echo(locationManager, "locationManager");
        Intrinsics.echo(config, "config");
        Intrinsics.echo(coreMetaData, "coreMetaData");
        Intrinsics.echo(databaseManager, "databaseManager");
        Intrinsics.echo(deviceInfo, "deviceInfo");
        Intrinsics.echo(eventMediator, "eventMediator");
        Intrinsics.echo(localDataStore, "localDataStore");
        Intrinsics.echo(activityLifeCycleManager, "activityLifeCycleManager");
        Intrinsics.echo(analyticsManager, "analyticsManager");
        Intrinsics.echo(baseEventQueueManager, "baseEventQueueManager");
        Intrinsics.echo(cTLockManager, "cTLockManager");
        Intrinsics.echo(callbackManager, "callbackManager");
        Intrinsics.echo(controllerManager, "controllerManager");
        Intrinsics.echo(inAppController, "inAppController");
        Intrinsics.echo(evaluationManager, "evaluationManager");
        Intrinsics.echo(impressionManager, "impressionManager");
        Intrinsics.echo(loginController, "loginController");
        Intrinsics.echo(sessionManager, "sessionManager");
        Intrinsics.echo(validationResultStack, "validationResultStack");
        Intrinsics.echo(mainLooperHandler, "mainLooperHandler");
        Intrinsics.echo(networkManager, "networkManager");
        Intrinsics.echo(pushProviders, "pushProviders");
        Intrinsics.echo(varCache, "varCache");
        Intrinsics.echo(parser, "parser");
        Intrinsics.echo(cryptHandler, "cryptHandler");
        Intrinsics.echo(storeRegistry, "storeRegistry");
        Intrinsics.echo(templatesManager, "templatesManager");
        Intrinsics.echo(profileValueHandler, "profileValueHandler");
        Intrinsics.echo(cTVariables, "cTVariables");
        Intrinsics.echo(executors, "executors");
        this.locationManager = locationManager;
        this.config = config;
        this.coreMetaData = coreMetaData;
        this.databaseManager = databaseManager;
        this.deviceInfo = deviceInfo;
        this.eventMediator = eventMediator;
        this.localDataStore = localDataStore;
        this.activityLifeCycleManager = activityLifeCycleManager;
        this.analyticsManager = analyticsManager;
        this.baseEventQueueManager = baseEventQueueManager;
        this.cTLockManager = cTLockManager;
        this.callbackManager = callbackManager;
        this.controllerManager = controllerManager;
        this.inAppController = inAppController;
        this.evaluationManager = evaluationManager;
        this.impressionManager = impressionManager;
        this.loginController = loginController;
        this.sessionManager = sessionManager;
        this.validationResultStack = validationResultStack;
        this.mainLooperHandler = mainLooperHandler;
        this.networkManager = networkManager;
        this.pushProviders = pushProviders;
        this.varCache = varCache;
        this.parser = parser;
        this.cryptHandler = cryptHandler;
        this.storeRegistry = storeRegistry;
        this.templatesManager = templatesManager;
        this.profileValueHandler = profileValueHandler;
        this.cTVariables = cTVariables;
        this.executors = executors;
    }

    @kotlin.c
    private final void initProductConfig(Context context) {
        if (this.config.isAnalyticsOnly()) {
            this.config.getLogger().debug(this.config.getAccountId(), "Product Config is not enabled for this instance");
            return;
        }
        if (this.controllerManager.getCTProductConfigController() == null) {
            this.config.getLogger().verbose(this.config.getAccountId() + ":async_deviceID", "Initializing Product Config with device Id = " + this.deviceInfo.getDeviceID());
            this.controllerManager.setCTProductConfigController(CTProductConfigFactory.getInstance(context, this.deviceInfo, this.config, this.analyticsManager, this.coreMetaData, this.callbackManager));
        }
    }

    @NotNull
    public final ActivityLifeCycleManager getActivityLifeCycleManager() {
        return this.activityLifeCycleManager;
    }

    @NotNull
    public final AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    @NotNull
    public final BaseEventQueueManager getBaseEventQueueManager() {
        return this.baseEventQueueManager;
    }

    @NotNull
    public final CTLockManager getCTLockManager() {
        return this.cTLockManager;
    }

    @NotNull
    public final CTVariables getCTVariables() {
        return this.cTVariables;
    }

    @NotNull
    public final BaseCallbackManager getCallbackManager() {
        return this.callbackManager;
    }

    @NotNull
    public final CleverTapInstanceConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final ControllerManager getControllerManager() {
        return this.controllerManager;
    }

    @NotNull
    public final CoreMetaData getCoreMetaData() {
        return this.coreMetaData;
    }

    @NotNull
    public final CryptHandler getCryptHandler() {
        return this.cryptHandler;
    }

    @kotlin.c
    @Nullable
    public final CTProductConfigController getCtProductConfigController(@Nullable Context context) {
        initProductConfig(context);
        return this.controllerManager.getCTProductConfigController();
    }

    @NotNull
    public final BaseDatabaseManager getDatabaseManager() {
        return this.databaseManager;
    }

    @NotNull
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final EvaluationManager getEvaluationManager() {
        return this.evaluationManager;
    }

    @NotNull
    public final EventMediator getEventMediator() {
        return this.eventMediator;
    }

    @NotNull
    public final CTExecutors getExecutors() {
        return this.executors;
    }

    @NotNull
    public final ImpressionManager getImpressionManager() {
        return this.impressionManager;
    }

    @NotNull
    public final InAppController getInAppController() {
        return this.inAppController;
    }

    @NotNull
    public final LocalDataStore getLocalDataStore() {
        return this.localDataStore;
    }

    @NotNull
    public final BaseLocationManager getLocationManager() {
        return this.locationManager;
    }

    @NotNull
    public final LoginController getLoginController() {
        return this.loginController;
    }

    @NotNull
    public final MainLooperHandler getMainLooperHandler() {
        return this.mainLooperHandler;
    }

    @NotNull
    public final NetworkManager getNetworkManager() {
        return this.networkManager;
    }

    @NotNull
    public final Parser getParser() {
        return this.parser;
    }

    @NotNull
    public final ProfileValueHandler getProfileValueHandler() {
        return this.profileValueHandler;
    }

    @NotNull
    public final PushProviders getPushProviders() {
        return this.pushProviders;
    }

    @NotNull
    public final SessionManager getSessionManager() {
        return this.sessionManager;
    }

    @NotNull
    public final StoreRegistry getStoreRegistry() {
        return this.storeRegistry;
    }

    @NotNull
    public final TemplatesManager getTemplatesManager() {
        return this.templatesManager;
    }

    @NotNull
    public final ValidationResultStack getValidationResultStack() {
        return this.validationResultStack;
    }

    @NotNull
    public final VarCache getVarCache() {
        return this.varCache;
    }
}
