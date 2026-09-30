package com.clevertap.android.sdk.events;

import B2.j;
import android.content.Context;
import android.location.Location;
import com.clevertap.android.sdk.BaseCallbackManager;
import com.clevertap.android.sdk.CTLockManager;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ControllerManager;
import com.clevertap.android.sdk.CoreMetaData;
import com.clevertap.android.sdk.DeviceInfo;
import com.clevertap.android.sdk.FailureFlushListener;
import com.clevertap.android.sdk.LocalDataStore;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.SessionManager;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.db.BaseDatabaseManager;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.events.EventQueueManager;
import com.clevertap.android.sdk.login.IdentityRepo;
import com.clevertap.android.sdk.login.IdentityRepoFactory;
import com.clevertap.android.sdk.login.LoginInfoProvider;
import com.clevertap.android.sdk.network.NetworkManager;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import com.clevertap.android.sdk.task.MainLooperHandler;
import com.clevertap.android.sdk.utils.CTJsonConverter;
import com.clevertap.android.sdk.validation.ValidationResult;
import com.clevertap.android.sdk.validation.ValidationResultStack;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class EventQueueManager extends BaseEventQueueManager implements FailureFlushListener {
    private final BaseDatabaseManager baseDatabaseManager;
    private final CoreMetaData cleverTapMetaData;
    private final CleverTapInstanceConfig config;
    private final Context context;
    private final ControllerManager controllerManager;
    private final CTLockManager ctLockManager;
    private final DeviceInfo deviceInfo;
    private final EventMediator eventMediator;
    private final LocalDataStore localDataStore;
    private final Logger logger;
    private final LoginInfoProvider loginInfoProvider;
    private final MainLooperHandler mainLooperHandler;
    private final NetworkManager networkManager;
    private final SessionManager sessionManager;
    private final ValidationResultStack validationResultStack;
    private Runnable commsRunnable = null;
    private Runnable pushNotificationViewedRunnable = null;

    /* renamed from: com.clevertap.android.sdk.events.EventQueueManager$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Callable<Void> {
        final /* synthetic */ Context val$context;
        final /* synthetic */ EventGroup val$eventGroup;

        public AnonymousClass1(EventGroup eventGroup, Context context) {
            r2 = eventGroup;
            r3 = context;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            if (r2 == EventGroup.PUSH_NOTIFICATION_VIEWED) {
                EventQueueManager.this.logger.verbose(EventQueueManager.this.config.getAccountId(), "Pushing Notification Viewed event onto queue flush sync");
            } else {
                EventQueueManager.this.logger.verbose(EventQueueManager.this.config.getAccountId(), "Pushing event onto queue flush sync");
            }
            EventQueueManager.this.flushQueueSync(r3, r2);
            return null;
        }
    }

    /* renamed from: com.clevertap.android.sdk.events.EventQueueManager$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements Callable<Void> {
        public AnonymousClass2() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            try {
                EventQueueManager.this.config.getLogger().verbose(EventQueueManager.this.config.getAccountId(), "Queuing daily events");
                EventQueueManager.this.pushBasicProfile(null, false);
            } catch (Throwable th) {
                EventQueueManager.this.config.getLogger().verbose(EventQueueManager.this.config.getAccountId(), "Daily profile sync failed", th);
            }
            return null;
        }
    }

    /* renamed from: com.clevertap.android.sdk.events.EventQueueManager$3 */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 implements Callable<Void> {
        final /* synthetic */ Context val$context;
        final /* synthetic */ JSONObject val$event;
        final /* synthetic */ int val$eventType;

        /* renamed from: com.clevertap.android.sdk.events.EventQueueManager$3$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 implements Callable<Void> {
            final /* synthetic */ Context val$context;
            final /* synthetic */ JSONObject val$event;
            final /* synthetic */ int val$eventType;

            public AnonymousClass1(Context context, JSONObject jSONObject, int i4) {
                r2 = context;
                r3 = jSONObject;
                r4 = i4;
            }

            @Override // java.util.concurrent.Callable
            public Void call() {
                EventQueueManager.this.sessionManager.lazyCreateSession(r2);
                EventQueueManager.this.pushInitialEventsAsync();
                EventQueueManager.this.addToQueue(r2, r3, r4);
                return null;
            }
        }

        public AnonymousClass3(JSONObject jSONObject, int i4, Context context) {
            this.val$event = jSONObject;
            this.val$eventType = i4;
            this.val$context = context;
        }

        public /* synthetic */ void lambda$call$0(Context context, JSONObject jSONObject, int i4) {
            CTExecutorFactory.executors(EventQueueManager.this.config).postAsyncSafelyTask().execute("queueEventWithDelay", new Callable<Void>() { // from class: com.clevertap.android.sdk.events.EventQueueManager.3.1
                final /* synthetic */ Context val$context;
                final /* synthetic */ JSONObject val$event;
                final /* synthetic */ int val$eventType;

                public AnonymousClass1(Context context2, JSONObject jSONObject2, int i42) {
                    r2 = context2;
                    r3 = jSONObject2;
                    r4 = i42;
                }

                @Override // java.util.concurrent.Callable
                public Void call() {
                    EventQueueManager.this.sessionManager.lazyCreateSession(r2);
                    EventQueueManager.this.pushInitialEventsAsync();
                    EventQueueManager.this.addToQueue(r2, r3, r4);
                    return null;
                }
            });
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            if (EventQueueManager.this.eventMediator.shouldDropEvent(this.val$event, this.val$eventType)) {
                return null;
            }
            if (EventQueueManager.this.eventMediator.shouldDeferProcessingEvent(this.val$event, this.val$eventType)) {
                EventQueueManager.this.config.getLogger().debug(EventQueueManager.this.config.getAccountId(), "App Launched not yet processed, re-queuing event " + this.val$event + "after 2s");
                MainLooperHandler mainLooperHandler = EventQueueManager.this.mainLooperHandler;
                final Context context = this.val$context;
                final JSONObject jSONObject = this.val$event;
                final int i4 = this.val$eventType;
                mainLooperHandler.postDelayed(new Runnable() { // from class: com.clevertap.android.sdk.events.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        EventQueueManager.AnonymousClass3.this.lambda$call$0(context, jSONObject, i4);
                    }
                }, Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS);
                return null;
            }
            int i5 = this.val$eventType;
            if (i5 != 7 && i5 != 6) {
                EventQueueManager.this.sessionManager.lazyCreateSession(this.val$context);
                EventQueueManager.this.pushInitialEventsAsync();
                EventQueueManager.this.addToQueue(this.val$context, this.val$event, this.val$eventType);
                return null;
            }
            EventQueueManager.this.addToQueue(this.val$context, this.val$event, i5);
            return null;
        }
    }

    /* renamed from: com.clevertap.android.sdk.events.EventQueueManager$4 */
    /* loaded from: classes3.dex */
    public class AnonymousClass4 implements Runnable {
        final /* synthetic */ Context val$context;

        public AnonymousClass4(Context context) {
            r2 = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            EventQueueManager.this.flushQueueAsync(r2, EventGroup.REGULAR);
            EventQueueManager.this.flushQueueAsync(r2, EventGroup.PUSH_NOTIFICATION_VIEWED);
        }
    }

    /* renamed from: com.clevertap.android.sdk.events.EventQueueManager$5 */
    /* loaded from: classes3.dex */
    public class AnonymousClass5 implements Runnable {
        final /* synthetic */ Context val$context;

        public AnonymousClass5(Context context) {
            r2 = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            EventQueueManager.this.config.getLogger().verbose(EventQueueManager.this.config.getAccountId(), "Pushing Notification Viewed event onto queue flush async");
            EventQueueManager.this.flushQueueAsync(r2, EventGroup.PUSH_NOTIFICATION_VIEWED);
        }
    }

    public EventQueueManager(BaseDatabaseManager baseDatabaseManager, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, EventMediator eventMediator, SessionManager sessionManager, BaseCallbackManager baseCallbackManager, MainLooperHandler mainLooperHandler, DeviceInfo deviceInfo, ValidationResultStack validationResultStack, NetworkManager networkManager, CoreMetaData coreMetaData, CTLockManager cTLockManager, LocalDataStore localDataStore, ControllerManager controllerManager, LoginInfoProvider loginInfoProvider) {
        this.baseDatabaseManager = baseDatabaseManager;
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.eventMediator = eventMediator;
        this.sessionManager = sessionManager;
        this.mainLooperHandler = mainLooperHandler;
        this.deviceInfo = deviceInfo;
        this.validationResultStack = validationResultStack;
        this.networkManager = networkManager;
        this.localDataStore = localDataStore;
        this.logger = cleverTapInstanceConfig.getLogger();
        this.cleverTapMetaData = coreMetaData;
        this.ctLockManager = cTLockManager;
        this.controllerManager = controllerManager;
        this.loginInfoProvider = loginInfoProvider;
        baseCallbackManager.setFailureFlushListener(this);
    }

    private void attachMeta(JSONObject jSONObject, Context context) {
        try {
            jSONObject.put("mc", Utils.getMemoryConsumption());
        } catch (Throwable unused) {
        }
        try {
            jSONObject.put(Constants.NOTIF_TITLE, Utils.getCurrentNetworkType(context));
        } catch (Throwable unused2) {
        }
    }

    private void attachPackageNameIfRequired(Context context, JSONObject jSONObject) {
        try {
            if (com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM.equals(jSONObject.getString(Constants.KEY_TYPE)) && Constants.APP_LAUNCHED_EVENT.equals(jSONObject.getString(Constants.KEY_EVT_NAME))) {
                jSONObject.put("pai", context.getPackageName());
            }
        } catch (Throwable unused) {
        }
    }

    private String getCleverTapID() {
        return this.deviceInfo.getDeviceID();
    }

    public /* synthetic */ void lambda$flushQueueSync$0(Context context, EventGroup eventGroup, String str, boolean z2) {
        this.networkManager.flushDBQueue(context, eventGroup, str, z2);
    }

    public /* synthetic */ void lambda$sendImmediately$1(Context context, EventGroup eventGroup, JSONArray jSONArray) {
        this.networkManager.sendQueue(context, eventGroup, jSONArray, null, false);
    }

    private void processDefineVarsEvent(Context context, JSONObject jSONObject) {
        sendImmediately(context, EventGroup.VARIABLES, jSONObject);
    }

    private void schedulePushNotificationViewedQueueFlush(Context context) {
        if (this.pushNotificationViewedRunnable == null) {
            this.pushNotificationViewedRunnable = new Runnable() { // from class: com.clevertap.android.sdk.events.EventQueueManager.5
                final /* synthetic */ Context val$context;

                public AnonymousClass5(Context context2) {
                    r2 = context2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    EventQueueManager.this.config.getLogger().verbose(EventQueueManager.this.config.getAccountId(), "Pushing Notification Viewed event onto queue flush async");
                    EventQueueManager.this.flushQueueAsync(r2, EventGroup.PUSH_NOTIFICATION_VIEWED);
                }
            };
        }
        this.mainLooperHandler.removeCallbacks(this.pushNotificationViewedRunnable);
        this.mainLooperHandler.post(this.pushNotificationViewedRunnable);
    }

    private void updateLocalStore(String str, int i4) {
        if (i4 == 4) {
            this.localDataStore.persistUserEventLog(str);
        }
    }

    @Override // com.clevertap.android.sdk.events.BaseEventQueueManager
    public void addToQueue(Context context, JSONObject jSONObject, int i4) {
        if (i4 == 6) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Pushing Notification Viewed event onto separate queue");
            processPushNotificationViewedEvent(context, jSONObject, i4);
        } else if (i4 == 8) {
            processDefineVarsEvent(context, jSONObject);
        } else {
            processEvent(context, jSONObject, i4);
        }
    }

    @Override // com.clevertap.android.sdk.FailureFlushListener
    public void failureFlush(Context context) {
        scheduleQueueFlush(context);
    }

    @Override // com.clevertap.android.sdk.events.BaseEventQueueManager
    public void flush() {
        flushQueueAsync(this.context, EventGroup.REGULAR);
    }

    @Override // com.clevertap.android.sdk.events.BaseEventQueueManager
    public void flushQueueAsync(Context context, EventGroup eventGroup) {
        CTExecutorFactory.executors(this.config).postAsyncSafelyTask().execute("CommsManager#flushQueueAsync", new Callable<Void>() { // from class: com.clevertap.android.sdk.events.EventQueueManager.1
            final /* synthetic */ Context val$context;
            final /* synthetic */ EventGroup val$eventGroup;

            public AnonymousClass1(EventGroup eventGroup2, Context context2) {
                r2 = eventGroup2;
                r3 = context2;
            }

            @Override // java.util.concurrent.Callable
            public Void call() {
                if (r2 == EventGroup.PUSH_NOTIFICATION_VIEWED) {
                    EventQueueManager.this.logger.verbose(EventQueueManager.this.config.getAccountId(), "Pushing Notification Viewed event onto queue flush sync");
                } else {
                    EventQueueManager.this.logger.verbose(EventQueueManager.this.config.getAccountId(), "Pushing event onto queue flush sync");
                }
                EventQueueManager.this.flushQueueSync(r3, r2);
                return null;
            }
        });
    }

    @Override // com.clevertap.android.sdk.events.BaseEventQueueManager
    public void flushQueueSync(Context context, EventGroup eventGroup) {
        flushQueueSync(context, eventGroup, null);
    }

    public int getNow() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public void initInAppEvaluation(Context context, JSONObject jSONObject, int i4) {
        String eventName = this.eventMediator.getEventName(jSONObject);
        Location locationFromUser = this.cleverTapMetaData.getLocationFromUser();
        updateLocalStore(eventName, i4);
        if (this.eventMediator.isChargedEvent(jSONObject)) {
            this.controllerManager.getInAppController().onQueueChargedEvent(this.eventMediator.getChargedEventDetails(jSONObject), this.eventMediator.getChargedEventItemDetails(jSONObject), locationFromUser);
            return;
        }
        if (!NetworkManager.isNetworkOnline(context) && this.eventMediator.isEvent(jSONObject)) {
            this.controllerManager.getInAppController().onQueueEvent(eventName, this.eventMediator.getEventProperties(jSONObject), locationFromUser);
            return;
        }
        if (i4 == 3) {
            this.controllerManager.getInAppController().onQueueProfileEvent(this.eventMediator.computeUserAttributeChangeProperties(jSONObject), locationFromUser);
        } else if (!this.eventMediator.isAppLaunchedEvent(jSONObject) && this.eventMediator.isEvent(jSONObject)) {
            this.controllerManager.getInAppController().onQueueEvent(eventName, this.eventMediator.getEventProperties(jSONObject), locationFromUser);
        }
    }

    public void processEvent(Context context, JSONObject jSONObject, int i4) {
        String str;
        synchronized (this.ctLockManager.getEventLock()) {
            try {
                if (CoreMetaData.getActivityCount() == 0) {
                    CoreMetaData.setActivityCount(1);
                }
                if (i4 == 1) {
                    str = "page";
                } else if (i4 == 2) {
                    str = "ping";
                    attachMeta(jSONObject, context);
                    if (jSONObject.has("bk")) {
                        this.cleverTapMetaData.setBgPing(true);
                        jSONObject.remove("bk");
                    }
                    if (this.cleverTapMetaData.isLocationForGeofence()) {
                        jSONObject.put("gf", true);
                        this.cleverTapMetaData.setLocationForGeofence(false);
                        jSONObject.put("gfSDKVersion", this.cleverTapMetaData.getGeofenceSDKVersion());
                        this.cleverTapMetaData.setGeofenceSDKVersion(0);
                    }
                } else {
                    str = i4 == 3 ? Constants.PROFILE : i4 == 5 ? Column.DATA : com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM;
                }
                String screenName = this.cleverTapMetaData.getScreenName();
                if (screenName != null) {
                    jSONObject.put(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, screenName);
                }
                jSONObject.put("s", this.cleverTapMetaData.getCurrentSessionId());
                jSONObject.put("pg", CoreMetaData.getActivityCount());
                jSONObject.put(Constants.KEY_TYPE, str);
                jSONObject.put("ep", getNow());
                jSONObject.put("f", this.cleverTapMetaData.isFirstSession());
                jSONObject.put("lsl", this.cleverTapMetaData.getLastSessionLength());
                attachPackageNameIfRequired(context, jSONObject);
                ValidationResult popValidationResult = this.validationResultStack.popValidationResult();
                if (popValidationResult != null) {
                    jSONObject.put(Constants.ERROR_KEY, CTJsonConverter.getErrorObject(popValidationResult));
                }
                this.localDataStore.setDataSyncFlag(jSONObject);
                this.baseDatabaseManager.queueEventToDB(context, jSONObject, i4);
                initInAppEvaluation(context, jSONObject, i4);
                scheduleQueueFlush(context);
            } finally {
            }
        }
    }

    public void processPushNotificationViewedEvent(Context context, JSONObject jSONObject, int i4) {
        synchronized (this.ctLockManager.getEventLock()) {
            try {
                jSONObject.put("s", this.cleverTapMetaData.getCurrentSessionId());
                jSONObject.put(Constants.KEY_TYPE, com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM);
                jSONObject.put("ep", getNow());
                ValidationResult popValidationResult = this.validationResultStack.popValidationResult();
                if (popValidationResult != null) {
                    jSONObject.put(Constants.ERROR_KEY, CTJsonConverter.getErrorObject(popValidationResult));
                }
                this.config.getLogger().verbose(this.config.getAccountId(), "Pushing Notification Viewed event onto DB");
                this.baseDatabaseManager.queuePushNotificationViewedEventToDB(context, jSONObject);
                initInAppEvaluation(context, jSONObject, i4);
                this.config.getLogger().verbose(this.config.getAccountId(), "Pushing Notification Viewed event onto queue flush");
                schedulePushNotificationViewedQueueFlush(context);
            } finally {
            }
        }
    }

    @Override // com.clevertap.android.sdk.events.BaseEventQueueManager
    public void pushBasicProfile(JSONObject jSONObject, boolean z2) {
        Object obj;
        try {
            String cleverTapID = getCleverTapID();
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> keys = jSONObject.keys();
                IdentityRepo repo = IdentityRepoFactory.getRepo(this.context, this.config, this.validationResultStack);
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        try {
                            obj = jSONObject.getJSONObject(next);
                        } catch (Throwable unused) {
                            obj = jSONObject.get(next);
                        }
                    } catch (JSONException unused2) {
                        obj = null;
                    }
                    if (obj != null) {
                        jSONObject2.put(next, obj);
                        if (repo.hasIdentity(next) && !this.deviceInfo.isErrorDeviceId()) {
                            if (z2) {
                                try {
                                    this.loginInfoProvider.removeValueFromCachedGUIDForIdentifier(cleverTapID, next);
                                } catch (Throwable unused3) {
                                }
                            } else {
                                this.loginInfoProvider.cacheGUIDForIdentifier(cleverTapID, next, obj.toString());
                            }
                        }
                    }
                }
            }
            try {
                String carrier = this.deviceInfo.getCarrier();
                if (carrier != null && !carrier.equals("")) {
                    jSONObject2.put(Constants.CLTAP_CARRIER, carrier);
                }
                String countryCode = this.deviceInfo.getCountryCode();
                if (countryCode != null && !countryCode.equals("")) {
                    jSONObject2.put("cc", countryCode);
                }
                jSONObject2.put("tz", TimeZone.getDefault().getID());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(Constants.PROFILE, jSONObject2);
                queueEvent(this.context, jSONObject3, 3);
            } catch (JSONException unused4) {
                this.config.getLogger().verbose(this.config.getAccountId(), "FATAL: Creating basic profile update event failed!");
            }
        } catch (Throwable th) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Basic profile sync", th);
        }
    }

    @Override // com.clevertap.android.sdk.events.BaseEventQueueManager
    public void pushInitialEventsAsync() {
        if (!this.cleverTapMetaData.inCurrentSession()) {
            CTExecutorFactory.executors(this.config).postAsyncSafelyTask().execute("CleverTapAPI#pushInitialEventsAsync", new Callable<Void>() { // from class: com.clevertap.android.sdk.events.EventQueueManager.2
                public AnonymousClass2() {
                }

                @Override // java.util.concurrent.Callable
                public Void call() {
                    try {
                        EventQueueManager.this.config.getLogger().verbose(EventQueueManager.this.config.getAccountId(), "Queuing daily events");
                        EventQueueManager.this.pushBasicProfile(null, false);
                    } catch (Throwable th) {
                        EventQueueManager.this.config.getLogger().verbose(EventQueueManager.this.config.getAccountId(), "Daily profile sync failed", th);
                    }
                    return null;
                }
            });
        }
    }

    @Override // com.clevertap.android.sdk.events.BaseEventQueueManager
    public Future<?> queueEvent(Context context, JSONObject jSONObject, int i4) {
        return CTExecutorFactory.executors(this.config).postAsyncSafelyTask().submit("queueEvent", new AnonymousClass3(jSONObject, i4, context));
    }

    @Override // com.clevertap.android.sdk.events.BaseEventQueueManager
    public void scheduleQueueFlush(Context context) {
        if (this.commsRunnable == null) {
            this.commsRunnable = new Runnable() { // from class: com.clevertap.android.sdk.events.EventQueueManager.4
                final /* synthetic */ Context val$context;

                public AnonymousClass4(Context context2) {
                    r2 = context2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    EventQueueManager.this.flushQueueAsync(r2, EventGroup.REGULAR);
                    EventQueueManager.this.flushQueueAsync(r2, EventGroup.PUSH_NOTIFICATION_VIEWED);
                }
            };
        }
        this.mainLooperHandler.removeCallbacks(this.commsRunnable);
        this.mainLooperHandler.postDelayed(this.commsRunnable, this.networkManager.getDelayFrequency());
        this.logger.verbose(this.config.getAccountId(), "Scheduling delayed queue flush on main event loop");
    }

    @Override // com.clevertap.android.sdk.events.BaseEventQueueManager
    public void sendImmediately(Context context, EventGroup eventGroup, JSONObject jSONObject) {
        if (!NetworkManager.isNetworkOnline(context)) {
            this.logger.verbose(this.config.getAccountId(), "Network connectivity unavailable. Event won't be sent.");
            return;
        }
        if (this.cleverTapMetaData.isOffline()) {
            this.logger.debug(this.config.getAccountId(), "CleverTap Instance has been set to offline, won't send event");
            return;
        }
        JSONArray put = new JSONArray().put(jSONObject);
        if (this.networkManager.needsHandshakeForDomain(eventGroup)) {
            this.networkManager.initHandshake(eventGroup, new j(this, context, eventGroup, put, 7));
        } else {
            this.networkManager.sendQueue(context, eventGroup, put, null, false);
        }
    }

    @Override // com.clevertap.android.sdk.events.BaseEventQueueManager
    public void flushQueueSync(Context context, EventGroup eventGroup, String str) {
        flushQueueSync(context, eventGroup, str, false);
    }

    @Override // com.clevertap.android.sdk.events.BaseEventQueueManager
    public void flushQueueSync(final Context context, final EventGroup eventGroup, final String str, final boolean z2) {
        if (!NetworkManager.isNetworkOnline(context)) {
            this.logger.verbose(this.config.getAccountId(), "Network connectivity unavailable. Will retry later");
            this.controllerManager.invokeCallbacksForNetworkError();
            this.controllerManager.invokeBatchListener(new JSONArray(), false);
        } else if (this.cleverTapMetaData.isOffline()) {
            this.logger.debug(this.config.getAccountId(), "CleverTap Instance has been set to offline, won't send events queue");
            this.controllerManager.invokeCallbacksForNetworkError();
            this.controllerManager.invokeBatchListener(new JSONArray(), false);
        } else if (this.networkManager.needsHandshakeForDomain(eventGroup)) {
            this.networkManager.initHandshake(eventGroup, new Runnable() { // from class: com.clevertap.android.sdk.events.a
                @Override // java.lang.Runnable
                public final void run() {
                    EventQueueManager.this.lambda$flushQueueSync$0(context, eventGroup, str, z2);
                }
            });
        } else {
            this.logger.verbose(this.config.getAccountId(), "Pushing Notification Viewed event onto queue DB flush");
            this.networkManager.flushDBQueue(context, eventGroup, str, z2);
        }
    }
}
