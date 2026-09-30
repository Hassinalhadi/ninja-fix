package com.clevertap.android.sdk;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.displayunits.DisplayUnitListener;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import com.clevertap.android.sdk.events.EventDetail;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.featureFlags.CTFeatureFlagsController;
import com.clevertap.android.sdk.inapp.callbacks.FetchInAppsCallback;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateContext;
import com.clevertap.android.sdk.inapp.customtemplates.FunctionPresenter;
import com.clevertap.android.sdk.inapp.customtemplates.JsonTemplatesProducer;
import com.clevertap.android.sdk.inapp.customtemplates.TemplatePresenter;
import com.clevertap.android.sdk.inapp.customtemplates.TemplateProducer;
import com.clevertap.android.sdk.inapp.customtemplates.TemplatesManager;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.evaluation.EvaluationManager;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepoFactory;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepoImpl;
import com.clevertap.android.sdk.inapp.store.preference.ImpressionStore;
import com.clevertap.android.sdk.inapp.store.preference.InAppStore;
import com.clevertap.android.sdk.inapp.store.preference.StoreRegistry;
import com.clevertap.android.sdk.inbox.CTInboxActivity;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTMessageDAO;
import com.clevertap.android.sdk.interfaces.NotificationHandler;
import com.clevertap.android.sdk.interfaces.NotificationRenderedListener;
import com.clevertap.android.sdk.interfaces.OnInitCleverTapIDListener;
import com.clevertap.android.sdk.interfaces.SCDomainListener;
import com.clevertap.android.sdk.network.NetworkManager;
import com.clevertap.android.sdk.product_config.CTProductConfigController;
import com.clevertap.android.sdk.product_config.CTProductConfigListener;
import com.clevertap.android.sdk.pushnotification.CTPushNotificationListener;
import com.clevertap.android.sdk.pushnotification.CoreNotificationRenderer;
import com.clevertap.android.sdk.pushnotification.INotificationRenderer;
import com.clevertap.android.sdk.pushnotification.NotificationInfo;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import com.clevertap.android.sdk.pushnotification.PushType;
import com.clevertap.android.sdk.pushnotification.amp.CTPushAmpListener;
import com.clevertap.android.sdk.usereventlogs.UserEventLog;
import com.clevertap.android.sdk.utils.Clock;
import com.clevertap.android.sdk.utils.UriHelper;
import com.clevertap.android.sdk.validation.ManifestValidator;
import com.clevertap.android.sdk.validation.ValidationResult;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.clevertap.android.sdk.variables.Var;
import com.clevertap.android.sdk.variables.callbacks.FetchVariablesCallback;
import com.clevertap.android.sdk.variables.callbacks.VariablesChangedCallback;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CleverTapAPI implements CTInboxActivity.InboxActivityListener {
    public static final String NOTIFICATION_TAG = "wzrk_pn";
    static CleverTapInstanceConfig defaultConfig;
    private static HashMap<String, CleverTapAPI> instances;
    private static NotificationHandler sNotificationHandler;
    private static NotificationHandler sSignedCallNotificationHandler;
    private static String sdkVersion;
    private final Context context;
    private CoreState coreState;
    private WeakReference<InboxMessageButtonListener> inboxMessageButtonListener;
    private WeakReference<InboxMessageListener> inboxMessageListener;
    private static int debugLevel = LogLevel.INFO.intValue();
    private static final HashMap<String, NotificationRenderedListener> sNotificationRenderedListenerMap = new HashMap<>();
    private static Clock clevertapClock = Clock.SYSTEM;

    /* renamed from: com.clevertap.android.sdk.CleverTapAPI$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Callable<Void> {
        final /* synthetic */ String val$channelDescription;
        final /* synthetic */ String val$channelId;
        final /* synthetic */ CharSequence val$channelName;
        final /* synthetic */ Context val$context;
        final /* synthetic */ int val$importance;
        final /* synthetic */ CleverTapAPI val$instance;
        final /* synthetic */ boolean val$showBadge;

        public AnonymousClass1(Context context, String str, CharSequence charSequence, int i4, String str2, boolean z2, CleverTapAPI cleverTapAPI) {
            r1 = context;
            r2 = str;
            r3 = charSequence;
            r4 = i4;
            r5 = str2;
            r6 = z2;
            r7 = cleverTapAPI;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            NotificationManager notificationManager = (NotificationManager) r1.getSystemService("notification");
            if (notificationManager == null) {
                return null;
            }
            androidx.camera.camera2.internal.compat.a.lima();
            NotificationChannel charlie = androidx.camera.camera2.internal.compat.a.charlie(r4, r3, r2);
            charlie.setDescription(r5);
            charlie.setShowBadge(r6);
            notificationManager.createNotificationChannel(charlie);
            r7.getConfigLogger().info(r7.getAccountId(), "Notification channel " + r3.toString() + " has been created");
            return null;
        }
    }

    /* renamed from: com.clevertap.android.sdk.CleverTapAPI$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements G6.e {
        final /* synthetic */ RequestDevicePushTokenListener val$requestTokenListener;

        public AnonymousClass2(RequestDevicePushTokenListener requestDevicePushTokenListener) {
            r2 = requestDevicePushTokenListener;
        }

        @Override // G6.e
        public void onComplete(Task task) {
            String str = null;
            if (!task.juliet()) {
                Logger.v(PushConstants.LOG_TAG, "FCMFCM token using googleservices.json failed", task.golf());
                r2.onDevicePushToken(null, PushConstants.FCM);
                return;
            }
            if (task.hotel() != null) {
                str = (String) task.hotel();
            }
            Logger.v(PushConstants.LOG_TAG, "FCMFCM token using googleservices.json - " + str);
            r2.onDevicePushToken(str, PushConstants.FCM);
        }
    }

    /* loaded from: classes3.dex */
    public interface DevicePushTokenRefreshListener {
        void devicePushTokenDidRefresh(String str, PushType pushType);
    }

    /* loaded from: classes3.dex */
    public enum LogLevel {
        OFF(-1),
        INFO(0),
        DEBUG(2),
        VERBOSE(3);

        private final int value;

        LogLevel(int i4) {
            this.value = i4;
        }

        public int intValue() {
            return this.value;
        }
    }

    /* loaded from: classes3.dex */
    public interface RequestDevicePushTokenListener {
        void onDevicePushToken(String str, PushType pushType);
    }

    private CleverTapAPI(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        this(context, cleverTapInstanceConfig, CleverTapFactory.getCoreState(context, cleverTapInstanceConfig, str), Clock.SYSTEM);
    }

    public static void addNotificationRenderedListener(String str, NotificationRenderedListener notificationRenderedListener) {
        sNotificationRenderedListenerMap.put(str, notificationRenderedListener);
    }

    private void asyncStartup() {
        final int i4 = 0;
        this.coreState.getExecutors().postAsyncSafelyTask().execute("CleverTapAPI#initializeDeviceInfo", new Callable(this) { // from class: com.clevertap.android.sdk.o
            public final /* synthetic */ CleverTapAPI purple;

            {
                this.purple = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$asyncStartup$8;
                Void lambda$asyncStartup$9;
                Void lambda$asyncStartup$10;
                Void lambda$asyncStartup$11;
                switch (i4) {
                    case 0:
                        lambda$asyncStartup$8 = this.purple.lambda$asyncStartup$8();
                        return lambda$asyncStartup$8;
                    case 1:
                        lambda$asyncStartup$9 = this.purple.lambda$asyncStartup$9();
                        return lambda$asyncStartup$9;
                    case 2:
                        lambda$asyncStartup$10 = this.purple.lambda$asyncStartup$10();
                        return lambda$asyncStartup$10;
                    default:
                        lambda$asyncStartup$11 = this.purple.lambda$asyncStartup$11();
                        return lambda$asyncStartup$11;
                }
            }
        });
        if (clevertapClock.currentTimeSecondsInt() - CoreMetaData.getInitialAppEnteredForegroundTime() > 5) {
            this.coreState.getConfig().setCreatedPostAppLaunch();
        }
        final int i5 = 1;
        this.coreState.getExecutors().postAsyncSafelyTask().execute("setStatesAsync", new Callable(this) { // from class: com.clevertap.android.sdk.o
            public final /* synthetic */ CleverTapAPI purple;

            {
                this.purple = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$asyncStartup$8;
                Void lambda$asyncStartup$9;
                Void lambda$asyncStartup$10;
                Void lambda$asyncStartup$11;
                switch (i5) {
                    case 0:
                        lambda$asyncStartup$8 = this.purple.lambda$asyncStartup$8();
                        return lambda$asyncStartup$8;
                    case 1:
                        lambda$asyncStartup$9 = this.purple.lambda$asyncStartup$9();
                        return lambda$asyncStartup$9;
                    case 2:
                        lambda$asyncStartup$10 = this.purple.lambda$asyncStartup$10();
                        return lambda$asyncStartup$10;
                    default:
                        lambda$asyncStartup$11 = this.purple.lambda$asyncStartup$11();
                        return lambda$asyncStartup$11;
                }
            }
        });
        final int i10 = 2;
        this.coreState.getExecutors().postAsyncSafelyTask().execute("saveConfigtoSharedPrefs", new Callable(this) { // from class: com.clevertap.android.sdk.o
            public final /* synthetic */ CleverTapAPI purple;

            {
                this.purple = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$asyncStartup$8;
                Void lambda$asyncStartup$9;
                Void lambda$asyncStartup$10;
                Void lambda$asyncStartup$11;
                switch (i10) {
                    case 0:
                        lambda$asyncStartup$8 = this.purple.lambda$asyncStartup$8();
                        return lambda$asyncStartup$8;
                    case 1:
                        lambda$asyncStartup$9 = this.purple.lambda$asyncStartup$9();
                        return lambda$asyncStartup$9;
                    case 2:
                        lambda$asyncStartup$10 = this.purple.lambda$asyncStartup$10();
                        return lambda$asyncStartup$10;
                    default:
                        lambda$asyncStartup$11 = this.purple.lambda$asyncStartup$11();
                        return lambda$asyncStartup$11;
                }
            }
        });
        final int i11 = 3;
        this.coreState.getExecutors().postAsyncSafelyTask().execute("recordDeviceIDErrors", new Callable(this) { // from class: com.clevertap.android.sdk.o
            public final /* synthetic */ CleverTapAPI purple;

            {
                this.purple = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$asyncStartup$8;
                Void lambda$asyncStartup$9;
                Void lambda$asyncStartup$10;
                Void lambda$asyncStartup$11;
                switch (i11) {
                    case 0:
                        lambda$asyncStartup$8 = this.purple.lambda$asyncStartup$8();
                        return lambda$asyncStartup$8;
                    case 1:
                        lambda$asyncStartup$9 = this.purple.lambda$asyncStartup$9();
                        return lambda$asyncStartup$9;
                    case 2:
                        lambda$asyncStartup$10 = this.purple.lambda$asyncStartup$10();
                        return lambda$asyncStartup$10;
                    default:
                        lambda$asyncStartup$11 = this.purple.lambda$asyncStartup$11();
                        return lambda$asyncStartup$11;
                }
            }
        });
    }

    public static void changeCredentials(String str, String str2) {
        changeCredentials(str, str2, null);
    }

    private static boolean checkNotificationBitmapRequestInvalid(Context context, Bundle bundle, long j5) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Logger.v("Notification Bitmap Download is not allowed on main thread");
            return true;
        }
        if (context == null) {
            Logger.v("Given Context is null. Not downloading bitmap!");
            return true;
        }
        if (bundle == null) {
            Logger.v("Given Bundle is null. Not downloading bitmap!");
            return true;
        }
        if (j5 < 1) {
            Logger.v("Given timeoutInMillis is less than 1 millis. Not downloading bitmap!");
            return true;
        }
        if (j5 > 20000) {
            Logger.v("Given timeoutInMillis exceeds 20 secs limit. Not downloading bitmap!");
            return true;
        }
        return false;
    }

    private static CleverTapAPI createInstanceIfAvailable(Context context, String str) {
        return createInstanceIfAvailable(context, str, null);
    }

    public static void createNotification(Context context, Bundle bundle, int i4) {
        CleverTapAPI fromBundle = fromBundle(context, bundle);
        if (fromBundle != null) {
            CoreState coreState = fromBundle.coreState;
            CleverTapInstanceConfig config = coreState.getConfig();
            try {
                synchronized (coreState.getPushProviders().getPushRenderingLock()) {
                    coreState.getPushProviders().setPushNotificationRenderer(new CoreNotificationRenderer());
                    coreState.getPushProviders()._createNotification(context, bundle, i4);
                }
            } catch (Throwable th) {
                config.getLogger().debug(config.getAccountId(), "Failed to process createNotification()", th);
            }
        }
    }

    public static void createNotificationChannel(Context context, String str, CharSequence charSequence, String str2, int i4, boolean z2) {
        CleverTapAPI defaultInstanceOrFirstOther = getDefaultInstanceOrFirstOther(context);
        if (defaultInstanceOrFirstOther == null) {
            Logger.v("No CleverTap Instance found in CleverTapAPI#createNotificatonChannel");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                defaultInstanceOrFirstOther.getCoreState().getExecutors().postAsyncSafelyTask().execute("createNotificationChannel", new Callable<Void>() { // from class: com.clevertap.android.sdk.CleverTapAPI.1
                    final /* synthetic */ String val$channelDescription;
                    final /* synthetic */ String val$channelId;
                    final /* synthetic */ CharSequence val$channelName;
                    final /* synthetic */ Context val$context;
                    final /* synthetic */ int val$importance;
                    final /* synthetic */ CleverTapAPI val$instance;
                    final /* synthetic */ boolean val$showBadge;

                    public AnonymousClass1(Context context2, String str3, CharSequence charSequence2, int i42, String str22, boolean z22, CleverTapAPI defaultInstanceOrFirstOther2) {
                        r1 = context2;
                        r2 = str3;
                        r3 = charSequence2;
                        r4 = i42;
                        r5 = str22;
                        r6 = z22;
                        r7 = defaultInstanceOrFirstOther2;
                    }

                    @Override // java.util.concurrent.Callable
                    public Void call() {
                        NotificationManager notificationManager = (NotificationManager) r1.getSystemService("notification");
                        if (notificationManager == null) {
                            return null;
                        }
                        androidx.camera.camera2.internal.compat.a.lima();
                        NotificationChannel charlie = androidx.camera.camera2.internal.compat.a.charlie(r4, r3, r2);
                        charlie.setDescription(r5);
                        charlie.setShowBadge(r6);
                        notificationManager.createNotificationChannel(charlie);
                        r7.getConfigLogger().info(r7.getAccountId(), "Notification channel " + r3.toString() + " has been created");
                        return null;
                    }
                });
            }
        } catch (Throwable th) {
            defaultInstanceOrFirstOther2.getConfigLogger().verbose(defaultInstanceOrFirstOther2.getAccountId(), "Failure creating Notification Channel", th);
        }
    }

    public static void createNotificationChannelGroup(Context context, String str, CharSequence charSequence) {
        CleverTapAPI defaultInstanceOrFirstOther = getDefaultInstanceOrFirstOther(context);
        if (defaultInstanceOrFirstOther == null) {
            Logger.v("No CleverTap Instance found in CleverTapAPI#createNotificationChannelGroup");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                defaultInstanceOrFirstOther.getCoreState().getExecutors().postAsyncSafelyTask().execute("creatingNotificationChannelGroup", new g(context, str, charSequence, defaultInstanceOrFirstOther));
            }
        } catch (Throwable th) {
            defaultInstanceOrFirstOther.getConfigLogger().verbose(defaultInstanceOrFirstOther.getAccountId(), "Failure creating Notification Channel Group", th);
        }
    }

    public static void deleteNotificationChannel(Context context, String str) {
        CleverTapAPI defaultInstanceOrFirstOther = getDefaultInstanceOrFirstOther(context);
        if (defaultInstanceOrFirstOther == null) {
            Logger.v("No CleverTap Instance found in CleverTapAPI#deleteNotificationChannel");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                defaultInstanceOrFirstOther.getCoreState().getExecutors().postAsyncSafelyTask().execute("deletingNotificationChannel", new k(context, str, defaultInstanceOrFirstOther, 0));
            }
        } catch (Throwable th) {
            defaultInstanceOrFirstOther.getConfigLogger().verbose(defaultInstanceOrFirstOther.getAccountId(), "Failure deleting Notification Channel", th);
        }
    }

    public static void deleteNotificationChannelGroup(Context context, String str) {
        CleverTapAPI defaultInstanceOrFirstOther = getDefaultInstanceOrFirstOther(context);
        if (defaultInstanceOrFirstOther == null) {
            Logger.v("No CleverTap Instance found in CleverTapAPI#deleteNotificationChannelGroup");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                defaultInstanceOrFirstOther.getCoreState().getExecutors().postAsyncSafelyTask().execute("deletingNotificationChannelGroup", new k(context, str, defaultInstanceOrFirstOther, 1));
            }
        } catch (Throwable th) {
            defaultInstanceOrFirstOther.getConfigLogger().verbose(defaultInstanceOrFirstOther.getAccountId(), "Failure deleting Notification Channel Group", th);
        }
    }

    @Deprecated
    public static void fcmTokenRefresh(Context context, String str) {
        Iterator<CleverTapAPI> it = getAvailableInstances(context).iterator();
        while (it.hasNext()) {
            CleverTapAPI next = it.next();
            if (next != null && !next.getCoreState().getConfig().isAnalyticsOnly()) {
                next.getCoreState().getPushProviders().doTokenRefresh(str, PushConstants.FCM);
            } else {
                Logger.d("Instance is Analytics Only not processing device token");
            }
        }
    }

    private static CleverTapAPI fromAccountId(Context context, String str) {
        HashMap<String, CleverTapAPI> hashMap = instances;
        if (hashMap == null) {
            return createInstanceIfAvailable(context, str);
        }
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            CleverTapAPI cleverTapAPI = instances.get(it.next());
            if (cleverTapAPI != null && ((str == null && cleverTapAPI.coreState.getConfig().isDefaultInstance()) || cleverTapAPI.getAccountId().equals(str))) {
                return cleverTapAPI;
            }
        }
        return null;
    }

    private static CleverTapAPI fromBundle(Context context, Bundle bundle) {
        return fromAccountId(context, bundle.getString(Constants.WZRK_ACCT_ID_KEY));
    }

    public static ArrayList<CleverTapAPI> getAvailableInstances(Context context) {
        ArrayList<CleverTapAPI> arrayList = new ArrayList<>();
        HashMap<String, CleverTapAPI> hashMap = instances;
        if (hashMap != null && !hashMap.isEmpty()) {
            arrayList.addAll(instances.values());
            return arrayList;
        }
        CleverTapAPI defaultInstance = getDefaultInstance(context);
        if (defaultInstance != null) {
            arrayList.add(defaultInstance);
        }
        return arrayList;
    }

    private CleverTapInstanceConfig getConfig() {
        return this.coreState.getConfig();
    }

    public Logger getConfigLogger() {
        return getConfig().getLogger();
    }

    public static int getDebugLevel() {
        return debugLevel;
    }

    private static CleverTapInstanceConfig getDefaultConfig(Context context) {
        ManifestInfo manifestInfo = ManifestInfo.getInstance(context);
        String accountId = manifestInfo.getAccountId();
        String accountToken = manifestInfo.getAccountToken();
        String accountRegion = manifestInfo.getAccountRegion();
        String proxyDomain = manifestInfo.getProxyDomain();
        String spikeyProxyDomain = manifestInfo.getSpikeyProxyDomain();
        String handshakeDomain = manifestInfo.getHandshakeDomain();
        if (accountId != null && accountToken != null) {
            if (accountRegion == null) {
                Logger.i("Account Region not specified in the AndroidManifest - using default region");
            }
            CleverTapInstanceConfig createDefaultInstance = CleverTapInstanceConfig.createDefaultInstance(context, accountId, accountToken, accountRegion);
            if (proxyDomain != null && !proxyDomain.trim().isEmpty()) {
                createDefaultInstance.setProxyDomain(proxyDomain);
            }
            if (spikeyProxyDomain != null && !spikeyProxyDomain.trim().isEmpty()) {
                createDefaultInstance.setSpikyProxyDomain(spikeyProxyDomain);
            }
            if (handshakeDomain != null && !handshakeDomain.trim().isEmpty()) {
                createDefaultInstance.setCustomHandshakeDomain(handshakeDomain);
            }
            return createDefaultInstance;
        }
        Logger.i("Account ID or Account token is missing from AndroidManifest.xml, unable to create default instance");
        return null;
    }

    public static CleverTapAPI getDefaultInstance(Context context, String str) {
        sdkVersion = BuildConfig.SDK_VERSION_STRING;
        CleverTapInstanceConfig cleverTapInstanceConfig = defaultConfig;
        if (cleverTapInstanceConfig != null) {
            return instanceWithConfig(context, cleverTapInstanceConfig, str);
        }
        CleverTapInstanceConfig defaultConfig2 = getDefaultConfig(context);
        defaultConfig = defaultConfig2;
        if (defaultConfig2 != null) {
            return instanceWithConfig(context, defaultConfig2, str);
        }
        return null;
    }

    private static CleverTapAPI getDefaultInstanceOrFirstOther(Context context) {
        HashMap<String, CleverTapAPI> hashMap;
        CleverTapAPI defaultInstance = getDefaultInstance(context);
        if (defaultInstance == null && (hashMap = instances) != null && !hashMap.isEmpty()) {
            Iterator<String> it = instances.keySet().iterator();
            while (it.hasNext()) {
                defaultInstance = instances.get(it.next());
                if (defaultInstance != null) {
                    break;
                }
            }
        }
        return defaultInstance;
    }

    public static CleverTapAPI getGlobalInstance(Context context, String str) {
        return fromAccountId(context, str);
    }

    public static HashMap<String, CleverTapAPI> getInstances() {
        return instances;
    }

    public static Bitmap getNotificationBitmapWithTimeout(Context context, Bundle bundle, String str, boolean z2, long j5) {
        if (checkNotificationBitmapRequestInvalid(context, bundle, j5)) {
            return null;
        }
        CleverTapAPI fromBundle = fromBundle(context, bundle);
        if (fromBundle == null) {
            Logger.v("cleverTapAPI is null. Not downloading bitmap!");
            return null;
        }
        return Utils.getNotificationBitmapWithTimeout(str, z2, context, fromBundle.getConfig(), j5).getBitmap();
    }

    public static Bitmap getNotificationBitmapWithTimeoutAndSize(Context context, Bundle bundle, String str, boolean z2, long j5, int i4) {
        if (checkNotificationBitmapRequestInvalid(context, bundle, j5)) {
            return null;
        }
        if (i4 < 1) {
            Logger.v("Given sizeInBytes is less than 1 bytes. Not downloading bitmap!");
            return null;
        }
        CleverTapAPI fromBundle = fromBundle(context, bundle);
        if (fromBundle == null) {
            Logger.v("cleverTapAPI is null. Not downloading bitmap!");
            return null;
        }
        return Utils.getNotificationBitmapWithTimeoutAndSize(str, z2, context, fromBundle.getConfig(), j5, i4).getBitmap();
    }

    public static NotificationHandler getNotificationHandler() {
        return sNotificationHandler;
    }

    public static NotificationInfo getNotificationInfo(Bundle bundle) {
        boolean z2 = false;
        if (bundle == null) {
            return new NotificationInfo(false, false);
        }
        boolean containsKey = bundle.containsKey("wzrk_pn");
        if (containsKey && bundle.containsKey(Constants.NOTIF_MSG)) {
            z2 = true;
        }
        return new NotificationInfo(containsKey, z2);
    }

    public static NotificationRenderedListener getNotificationRenderedListener(String str) {
        return sNotificationRenderedListenerMap.get(str);
    }

    public static NotificationHandler getSignedCallNotificationHandler() {
        return sSignedCallNotificationHandler;
    }

    public static void handleNotificationClicked(Context context, Bundle bundle) {
        String str;
        if (bundle != null) {
            try {
                str = bundle.getString(Constants.WZRK_ACCT_ID_KEY);
            } catch (Throwable unused) {
                str = null;
            }
            HashMap<String, CleverTapAPI> hashMap = instances;
            if (hashMap == null) {
                CleverTapAPI createInstanceIfAvailable = createInstanceIfAvailable(context, str);
                if (createInstanceIfAvailable != null) {
                    createInstanceIfAvailable.pushNotificationClickedEvent(bundle);
                    return;
                }
                return;
            }
            Iterator<String> it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                CleverTapAPI cleverTapAPI = instances.get(it.next());
                if (cleverTapAPI != null && ((str == null && cleverTapAPI.coreState.getConfig().isDefaultInstance()) || cleverTapAPI.getAccountId().equals(str))) {
                    cleverTapAPI.pushNotificationClickedEvent(bundle);
                    return;
                }
            }
        }
    }

    public static CleverTapAPI instanceWithConfig(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        return instanceWithConfig(context, cleverTapInstanceConfig, null);
    }

    public static boolean isAppForeground() {
        return CoreMetaData.isAppForeground();
    }

    private static boolean isDevelopmentMode(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private boolean isErrorDeviceId() {
        return this.coreState.getDeviceInfo().isErrorDeviceId();
    }

    public /* synthetic */ Void lambda$asyncStartup$10() throws Exception {
        String jSONString = getConfig().toJSONString();
        if (jSONString == null) {
            Logger.v("Unable to save config to SharedPrefs, config Json is null");
            return null;
        }
        StorageHelper.putString(this.context, StorageHelper.storageKeyWithSuffix(getConfig(), "instance"), jSONString);
        return null;
    }

    public /* synthetic */ Void lambda$asyncStartup$11() throws Exception {
        if (this.coreState.getDeviceInfo().getDeviceID() != null) {
            this.coreState.getLoginController().recordDeviceIDErrors();
            return null;
        }
        return null;
    }

    public /* synthetic */ Void lambda$asyncStartup$8() throws Exception {
        if (getConfig().isDefaultInstance()) {
            ManifestValidator.validate(this.context, this.coreState.getDeviceInfo(), this.coreState.getPushProviders());
            return null;
        }
        return null;
    }

    public /* synthetic */ Void lambda$asyncStartup$9() throws Exception {
        this.coreState.getSessionManager().setLastVisitTime();
        this.coreState.getSessionManager().setUserLastVisitTs();
        this.coreState.getDeviceInfo().setDeviceNetworkInfoReportingFromStorage();
        this.coreState.getDeviceInfo().setCurrentUserOptOutStateFromStorage();
        this.coreState.getDeviceInfo().setSystemEventsAllowedStateFromStorage();
        return null;
    }

    public static /* synthetic */ Void lambda$createNotificationChannel$0(Context context, String str, CharSequence charSequence, int i4, String str2, String str3, boolean z2, CleverTapAPI cleverTapAPI) throws Exception {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return null;
        }
        NotificationChannel charlie = androidx.camera.camera2.internal.compat.a.charlie(i4, charSequence, str);
        charlie.setDescription(str2);
        charlie.setGroup(str3);
        charlie.setShowBadge(z2);
        notificationManager.createNotificationChannel(charlie);
        cleverTapAPI.getConfigLogger().info(cleverTapAPI.getAccountId(), "Notification channel " + charSequence.toString() + " has been created");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Void lambda$createNotificationChannel$1(Context context, String str, CleverTapAPI cleverTapAPI, String str2, CharSequence charSequence, int i4, String str3, boolean z2) throws Exception {
        Uri uri;
        String substring;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return null;
        }
        if (!str.isEmpty()) {
            if (!str.contains(".mp3") && !str.contains(".ogg") && !str.contains(".wav")) {
                cleverTapAPI.getConfigLogger().debug(cleverTapAPI.getAccountId(), "Sound file name not supported");
                substring = "";
            } else {
                substring = str.substring(0, str.length() - 4);
            }
            if (!substring.isEmpty()) {
                uri = Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + substring);
                NotificationChannel charlie = androidx.camera.camera2.internal.compat.a.charlie(i4, charSequence, str2);
                charlie.setDescription(str3);
                charlie.setShowBadge(z2);
                if (uri == null) {
                    charlie.setSound(uri, new AudioAttributes.Builder().setUsage(5).build());
                } else {
                    cleverTapAPI.getConfigLogger().debug(cleverTapAPI.getAccountId(), "Sound file not found, notification channel will be created without custom sound");
                }
                notificationManager.createNotificationChannel(charlie);
                cleverTapAPI.getConfigLogger().info(cleverTapAPI.getAccountId(), "Notification channel " + charSequence.toString() + " has been created");
                return null;
            }
        }
        uri = null;
        NotificationChannel charlie2 = androidx.camera.camera2.internal.compat.a.charlie(i4, charSequence, str2);
        charlie2.setDescription(str3);
        charlie2.setShowBadge(z2);
        if (uri == null) {
        }
        notificationManager.createNotificationChannel(charlie2);
        cleverTapAPI.getConfigLogger().info(cleverTapAPI.getAccountId(), "Notification channel " + charSequence.toString() + " has been created");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Void lambda$createNotificationChannel$2(Context context, String str, CleverTapAPI cleverTapAPI, String str2, CharSequence charSequence, int i4, String str3, String str4, boolean z2) throws Exception {
        Uri uri;
        String substring;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return null;
        }
        if (!str.isEmpty()) {
            if (!str.contains(".mp3") && !str.contains(".ogg") && !str.contains(".wav")) {
                cleverTapAPI.getConfigLogger().debug(cleverTapAPI.getAccountId(), "Sound file name not supported");
                substring = "";
            } else {
                substring = str.substring(0, str.length() - 4);
            }
            if (!substring.isEmpty()) {
                uri = Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + substring);
                NotificationChannel charlie = androidx.camera.camera2.internal.compat.a.charlie(i4, charSequence, str2);
                charlie.setDescription(str3);
                charlie.setGroup(str4);
                charlie.setShowBadge(z2);
                if (uri == null) {
                    charlie.setSound(uri, new AudioAttributes.Builder().setUsage(5).build());
                } else {
                    cleverTapAPI.getConfigLogger().debug(cleverTapAPI.getAccountId(), "Sound file not found, notification channel will be created without custom sound");
                }
                notificationManager.createNotificationChannel(charlie);
                cleverTapAPI.getConfigLogger().info(cleverTapAPI.getAccountId(), "Notification channel " + charSequence.toString() + " has been created");
                return null;
            }
        }
        uri = null;
        NotificationChannel charlie2 = androidx.camera.camera2.internal.compat.a.charlie(i4, charSequence, str2);
        charlie2.setDescription(str3);
        charlie2.setGroup(str4);
        charlie2.setShowBadge(z2);
        if (uri == null) {
        }
        notificationManager.createNotificationChannel(charlie2);
        cleverTapAPI.getConfigLogger().info(cleverTapAPI.getAccountId(), "Notification channel " + charSequence.toString() + " has been created");
        return null;
    }

    public static /* synthetic */ Void lambda$createNotificationChannelGroup$3(Context context, String str, CharSequence charSequence, CleverTapAPI cleverTapAPI) throws Exception {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.createNotificationChannelGroup(androidx.camera.camera2.internal.compat.a.golf(charSequence, str));
            cleverTapAPI.getConfigLogger().info(cleverTapAPI.getAccountId(), "Notification channel group " + charSequence.toString() + " has been created");
            return null;
        }
        return null;
    }

    public static /* synthetic */ Void lambda$deleteNotificationChannel$4(Context context, String str, CleverTapAPI cleverTapAPI) throws Exception {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.deleteNotificationChannel(str);
            cleverTapAPI.getConfigLogger().info(cleverTapAPI.getAccountId(), "Notification channel " + str + " has been deleted");
            return null;
        }
        return null;
    }

    public static /* synthetic */ Void lambda$deleteNotificationChannelGroup$5(Context context, String str, CleverTapAPI cleverTapAPI) throws Exception {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.deleteNotificationChannelGroup(str);
            cleverTapAPI.getConfigLogger().info(cleverTapAPI.getAccountId(), "Notification channel group " + str + " has been deleted");
            return null;
        }
        return null;
    }

    public /* synthetic */ Void lambda$deviceIDCreated$14(StoreRegistry storeRegistry, StoreProvider storeProvider, CryptHandler cryptHandler, String str, String str2, EvaluationManager evaluationManager) throws Exception {
        if (storeRegistry.getInAppStore() == null) {
            InAppStore provideInAppStore = storeProvider.provideInAppStore(this.context, cryptHandler, str, str2);
            storeRegistry.setInAppStore(provideInAppStore);
            evaluationManager.loadSuppressedCSAndEvaluatedSSInAppsIds();
            this.coreState.getCallbackManager().addChangeUserCallback(provideInAppStore);
        }
        if (storeRegistry.getImpressionStore() == null) {
            ImpressionStore provideImpressionStore = storeProvider.provideImpressionStore(this.context, str, str2);
            storeRegistry.setImpressionStore(provideImpressionStore);
            this.coreState.getCallbackManager().addChangeUserCallback(provideImpressionStore);
            return null;
        }
        return null;
    }

    public /* synthetic */ Void lambda$getCleverTapID$16(final OnInitCleverTapIDListener onInitCleverTapIDListener) throws Exception {
        final String deviceID = this.coreState.getDeviceInfo().getDeviceID();
        if (deviceID != null) {
            Utils.runOnUiThread(new Runnable() { // from class: com.clevertap.android.sdk.m
                @Override // java.lang.Runnable
                public final void run() {
                    OnInitCleverTapIDListener.this.onInitCleverTapID(deviceID);
                }
            });
        }
        this.coreState.getCallbackManager().addOnInitCleverTapIDListener(onInitCleverTapIDListener);
        return null;
    }

    public /* synthetic */ Void lambda$messageDidShow$12(CTInboxMessage cTInboxMessage, Bundle bundle) throws Exception {
        Logger.d("CleverTapAPI:messageDidShow() called  in async with: messageId = [" + cTInboxMessage.getMessageId() + Constants.AES_SUFFIX);
        if (!getInboxMessageForId(cTInboxMessage.getMessageId()).isRead()) {
            markReadInboxMessage(cTInboxMessage);
            this.coreState.getAnalyticsManager().pushInboxMessageStateEvent(false, cTInboxMessage, bundle);
            return null;
        }
        return null;
    }

    public /* synthetic */ Void lambda$renderPushNotification$17(INotificationRenderer iNotificationRenderer, Bundle bundle, Context context) throws Exception {
        synchronized (this.coreState.getPushProviders().getPushRenderingLock()) {
            try {
                this.coreState.getPushProviders().setPushNotificationRenderer(iNotificationRenderer);
                if (bundle != null && bundle.containsKey(Constants.PT_NOTIF_ID)) {
                    this.coreState.getPushProviders()._createNotification(context, bundle, bundle.getInt(Constants.PT_NOTIF_ID));
                } else {
                    this.coreState.getPushProviders()._createNotification(context, bundle, Constants.EMPTY_NOTIFICATION_ID);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    public /* synthetic */ Void lambda$setOptOut$13(boolean z2, boolean z10) throws Exception {
        boolean z11;
        if (z2 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.CLEVERTAP_OPTOUT, Boolean.valueOf(z2));
        hashMap.put(Constants.CLEVERTAP_ALLOW_SYSTEM_EVENTS, Boolean.valueOf(z11));
        this.coreState.getCoreMetaData().setCurrentUserOptedOut(false);
        this.coreState.getAnalyticsManager().pushProfile(hashMap);
        this.coreState.getCoreMetaData().setCurrentUserOptedOut(z2);
        this.coreState.getCoreMetaData().setEnabledSystemEvents(z11);
        this.coreState.getDeviceInfo().saveOptOutState(z2);
        this.coreState.getDeviceInfo().saveAllowedSystemEventsState(z11);
        return null;
    }

    public static /* synthetic */ Void lambda$syncRegisteredInAppTemplates$6(NetworkManager networkManager, TemplatesManager templatesManager) throws Exception {
        networkManager.defineTemplates(templatesManager.getAllRegisteredTemplates());
        return null;
    }

    public /* synthetic */ void lambda$syncRegisteredInAppTemplates$7(NetworkManager networkManager, TemplatesManager templatesManager, String str) {
        this.coreState.getExecutors().postAsyncSafelyTask().execute("DefineTemplates", new c(3, networkManager, templatesManager));
    }

    public /* synthetic */ void lambda$syncVariables$18(String str) {
        JSONObject defineVarsData = this.coreState.getVarCache().getDefineVarsData();
        Logger.v("variables", "syncVariables: sending following vars to server:" + defineVarsData);
        this.coreState.getAnalyticsManager().pushDefineVarsEvent(defineVarsData);
    }

    public static void onActivityCreated(Activity activity) {
        onActivityCreated(activity, null);
    }

    public static void onActivityPaused() {
        HashMap<String, CleverTapAPI> hashMap = instances;
        if (hashMap != null) {
            Iterator<String> it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                CleverTapAPI cleverTapAPI = instances.get(it.next());
                if (cleverTapAPI != null) {
                    try {
                        cleverTapAPI.coreState.getActivityLifeCycleManager().activityPaused();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static void onActivityResumed(Activity activity) {
        onActivityResumed(activity, null);
    }

    public static void processPushNotification(Context context, Bundle bundle) {
        CleverTapAPI fromBundle = fromBundle(context, bundle);
        if (fromBundle != null) {
            fromBundle.coreState.getPushProviders().processCustomPushNotification(bundle);
        }
    }

    public static synchronized void registerCustomInAppTemplates(TemplateProducer templateProducer) {
        synchronized (CleverTapAPI.class) {
            TemplatesManager.register(templateProducer);
        }
    }

    public static NotificationRenderedListener removeNotificationRenderedListener(String str) {
        return sNotificationRenderedListenerMap.remove(str);
    }

    public static void runJobWork(Context context) {
        HashMap<String, CleverTapAPI> hashMap = instances;
        if (hashMap == null) {
            CleverTapAPI defaultInstance = getDefaultInstance(context);
            if (defaultInstance != null) {
                if (defaultInstance.getConfig().isBackgroundSync()) {
                    defaultInstance.coreState.getPushProviders().runPushAmpWork(context);
                    return;
                } else {
                    Logger.d("Instance doesn't allow Background sync, not running the Job");
                    return;
                }
            }
            return;
        }
        for (String str : hashMap.keySet()) {
            CleverTapAPI cleverTapAPI = instances.get(str);
            if (cleverTapAPI != null && cleverTapAPI.getConfig().isAnalyticsOnly()) {
                Logger.d(str, "Instance is Analytics Only not running the Job");
            } else if (cleverTapAPI != null && cleverTapAPI.getConfig().isBackgroundSync()) {
                cleverTapAPI.coreState.getPushProviders().runPushAmpWork(context);
            } else {
                Logger.d(str, "Instance doesn't allow Background sync, not running the Job");
            }
        }
    }

    public static void setAppForeground(boolean z2) {
        CoreMetaData.setAppForeground(z2);
    }

    public static void setDebugLevel(int i4) {
        debugLevel = i4;
    }

    public static void setInstances(HashMap<String, CleverTapAPI> hashMap) {
        instances = hashMap;
    }

    public static void setNotificationHandler(NotificationHandler notificationHandler) {
        sNotificationHandler = notificationHandler;
    }

    public static void setSignedCallNotificationHandler(NotificationHandler notificationHandler) {
        sSignedCallNotificationHandler = notificationHandler;
    }

    public static void tokenRefresh(Context context, String str, PushType pushType) {
        Iterator<CleverTapAPI> it = getAvailableInstances(context).iterator();
        while (it.hasNext()) {
            it.next().coreState.getPushProviders().doTokenRefresh(str, pushType);
        }
    }

    public void addMultiValueForKey(String str, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            addMultiValuesForKey(str, new ArrayList<>(Collections.singletonList(str2)));
        } else {
            this.coreState.getAnalyticsManager()._generateEmptyMultiValueError(str);
        }
    }

    public void addMultiValuesForKey(String str, ArrayList<String> arrayList) {
        this.coreState.getAnalyticsManager().addMultiValuesForKey(str, arrayList);
    }

    public void addOneTimeVariablesChangedCallback(VariablesChangedCallback variablesChangedCallback) {
        this.coreState.getCTVariables().addOneTimeVariablesChangedCallback(variablesChangedCallback);
    }

    public void addVariablesChangedCallback(VariablesChangedCallback variablesChangedCallback) {
        this.coreState.getCTVariables().addVariablesChangedCallback(variablesChangedCallback);
    }

    public void clearFileResources(boolean z2) {
        Logger configLogger = getConfigLogger();
        StoreRegistry storeRegistry = this.coreState.getStoreRegistry();
        if (storeRegistry == null) {
            configLogger.info("There was a problem clearing file resources because instance is not completely initialised, please try again after some time");
            return;
        }
        FileResourcesRepoImpl createFileResourcesRepo = FileResourcesRepoFactory.createFileResourcesRepo(this.context, configLogger, storeRegistry);
        if (z2) {
            createFileResourcesRepo.cleanupExpiredResources(CtCacheType.FILES);
        } else {
            createFileResourcesRepo.cleanupAllResources(CtCacheType.FILES);
        }
    }

    public void clearInAppResources(boolean z2) {
        Logger configLogger = getConfigLogger();
        StoreRegistry storeRegistry = this.coreState.getStoreRegistry();
        if (storeRegistry == null) {
            configLogger.info("There was a problem clearing resources because instance is not completely initialised, please try again after some time");
            return;
        }
        FileResourcesRepoImpl createFileResourcesRepo = FileResourcesRepoFactory.createFileResourcesRepo(this.context, configLogger, storeRegistry);
        if (z2) {
            createFileResourcesRepo.cleanupExpiredResources(CtCacheType.IMAGE);
        } else {
            createFileResourcesRepo.cleanupAllResources(CtCacheType.IMAGE);
        }
    }

    public void decrementValue(String str, Number number) {
        this.coreState.getAnalyticsManager().decrementValue(str, number);
    }

    public Var<String> defineFileVariable(String str) {
        return Var.define(str, null, CTVariableUtils.FILE, this.coreState.getCTVariables());
    }

    public <T> Var<T> defineVariable(String str, T t5) {
        return Var.define(str, t5, this.coreState.getCTVariables());
    }

    public void deleteInboxMessage(CTInboxMessage cTInboxMessage) {
        if (this.coreState.getControllerManager().getCTInboxController() != null) {
            this.coreState.getControllerManager().getCTInboxController().deleteInboxMessage(cTInboxMessage);
        } else {
            getConfigLogger().debug(getAccountId(), "Notification Inbox not initialized");
        }
    }

    public void deleteInboxMessagesForIDs(ArrayList<String> arrayList) {
        if (this.coreState.getControllerManager().getCTInboxController() != null) {
            this.coreState.getControllerManager().getCTInboxController().deleteInboxMessagesForIDs(arrayList);
        } else {
            getConfigLogger().debug(getAccountId(), "Notification Inbox not initialized");
        }
    }

    public void deviceIDCreated(String str) {
        String accountId = this.coreState.getConfig().getAccountId();
        if (this.coreState.getControllerManager() == null) {
            getConfigLogger().verbose(accountId + ":async_deviceID", "ControllerManager not set yet! Returning from deviceIDCreated()");
            return;
        }
        StoreRegistry storeRegistry = this.coreState.getStoreRegistry();
        CryptHandler cryptHandler = this.coreState.getCryptHandler();
        StoreProvider storeProvider = StoreProvider.getInstance();
        EvaluationManager evaluationManager = this.coreState.getEvaluationManager();
        this.coreState.getLocalDataStore().inflateLocalProfileAsync(this.context);
        this.coreState.getExecutors().ioTask().execute("initStores", new p(this, storeRegistry, storeProvider, cryptHandler, str, accountId, evaluationManager));
        if (this.coreState.getControllerManager().getInAppFCManager() == null) {
            getConfigLogger().verbose(P0.crimson(accountId, ":async_deviceID"), "Initializing InAppFC after Device ID Created = " + str);
            this.coreState.getControllerManager().setInAppFCManager(new InAppFCManager(this.context, this.coreState.getConfig(), str, this.coreState.getStoreRegistry(), this.coreState.getImpressionManager(), this.coreState.getExecutors(), clevertapClock));
        }
        CTFeatureFlagsController cTFeatureFlagsController = this.coreState.getControllerManager().getCTFeatureFlagsController();
        if (cTFeatureFlagsController != null && TextUtils.isEmpty(cTFeatureFlagsController.getGuid())) {
            getConfigLogger().verbose(P0.crimson(accountId, ":async_deviceID"), "Initializing Feature Flags after Device ID Created = " + str);
            cTFeatureFlagsController.setGuidAndInit(str);
        }
        CTProductConfigController cTProductConfigController = this.coreState.getControllerManager().getCTProductConfigController();
        if (cTProductConfigController != null && TextUtils.isEmpty(cTProductConfigController.getSettings().getGuid())) {
            getConfigLogger().verbose(P0.crimson(accountId, ":async_deviceID"), "Initializing Product Config after Device ID Created = " + str);
            cTProductConfigController.setGuidAndInit(str);
        }
        getConfigLogger().verbose(accountId + ":async_deviceID", "Got device id from DeviceInfo, notifying user profile initialized to SyncListener");
        this.coreState.getCallbackManager().notifyUserProfileInitialized(str);
        this.coreState.getCallbackManager().notifyCleverTapIDChanged(str);
    }

    public void disablePersonalization() {
        this.coreState.getConfig().enablePersonalization(false);
    }

    public void discardInAppNotifications() {
        if (!this.coreState.getConfig().isAnalyticsOnly()) {
            getConfigLogger().debug(getAccountId(), "Discarding InApp Notifications...");
            getConfigLogger().debug(getAccountId(), "Please Note - InApp Notifications will be dropped till resumeInAppNotifications() is not called again");
            this.coreState.getInAppController().discardInApps();
            return;
        }
        getConfigLogger().debug(getAccountId(), "CleverTap instance is set for Analytics only! Cannot discard InApp Notifications.");
    }

    public void dismissAppInbox() {
        try {
            Activity appInboxActivity = this.coreState.getCoreMetaData().getAppInboxActivity();
            if (appInboxActivity != null) {
                if (!appInboxActivity.isFinishing()) {
                    getConfigLogger().verbose(getAccountId(), "Finishing the App Inbox");
                    appInboxActivity.finish();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppInboxActivity reference not found");
        } catch (Throwable th) {
            getConfigLogger().verbose(getAccountId(), "Can't dismiss AppInbox, please ensure to call this method after the usage of cleverTapApiInstance.showAppInbox(). \n" + th);
        }
    }

    public void enableDeviceNetworkInfoReporting(boolean z2) {
        this.coreState.getDeviceInfo().enableDeviceNetworkInfoReporting(z2);
    }

    public void enablePersonalization() {
        this.coreState.getConfig().enablePersonalization(true);
    }

    @Deprecated
    public CTFeatureFlagsController featureFlag() {
        if (getConfig().isAnalyticsOnly()) {
            getConfig().getLogger().debug(getAccountId(), "Feature flag is not supported with analytics only configuration");
        }
        return this.coreState.getControllerManager().getCTFeatureFlagsController();
    }

    public void fetchInApps(FetchInAppsCallback fetchInAppsCallback) {
        if (this.coreState.getConfig().isAnalyticsOnly()) {
            return;
        }
        Logger.v("InApp :  Fetching In Apps...");
        if (fetchInAppsCallback != null) {
            this.coreState.getCallbackManager().setFetchInAppsCallback(fetchInAppsCallback);
        }
        this.coreState.getAnalyticsManager().sendFetchEvent(getFetchRequestAsJson(5));
    }

    public void fetchVariables() {
        fetchVariables(null);
    }

    public void flush() {
        this.coreState.getBaseEventQueueManager().flush();
    }

    public String getAccountId() {
        return this.coreState.getConfig().getAccountId();
    }

    public CustomTemplateContext getActiveContextForTemplate(String str) {
        CoreState coreState = this.coreState;
        if (coreState != null && coreState.getTemplatesManager() != null) {
            return this.coreState.getTemplatesManager().getActiveContextForTemplate(str);
        }
        return null;
    }

    public ArrayList<CleverTapDisplayUnit> getAllDisplayUnits() {
        if (this.coreState.getControllerManager().getCTDisplayUnitController() != null) {
            return this.coreState.getControllerManager().getCTDisplayUnitController().getAllDisplayUnits();
        }
        getConfigLogger().verbose(getAccountId(), "DisplayUnit : Failed to get all Display Units");
        return null;
    }

    public ArrayList<CTInboxMessage> getAllInboxMessages() {
        Logger.d("CleverTapAPI:getAllInboxMessages: called");
        ArrayList<CTInboxMessage> arrayList = new ArrayList<>();
        synchronized (this.coreState.getCTLockManager().getInboxControllerLock()) {
            try {
                if (this.coreState.getControllerManager().getCTInboxController() != null) {
                    Iterator<CTMessageDAO> it = this.coreState.getControllerManager().getCTInboxController().getMessages().iterator();
                    while (it.hasNext()) {
                        CTMessageDAO next = it.next();
                        Logger.v("CTMessage Dao - " + next.toJSON().toString());
                        arrayList.add(new CTInboxMessage(next.toJSON()));
                    }
                    return arrayList;
                }
                getConfigLogger().debug(getAccountId(), "Notification Inbox not initialized");
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CTInboxListener getCTNotificationInboxListener() {
        return this.coreState.getCallbackManager().getInboxListener();
    }

    public CTPushAmpListener getCTPushAmpListener() {
        return this.coreState.getCallbackManager().getPushAmpListener();
    }

    public CTPushNotificationListener getCTPushNotificationListener() {
        return this.coreState.getCallbackManager().getPushNotificationListener();
    }

    @Deprecated
    public String getCleverTapAttributionIdentifier() {
        return this.coreState.getDeviceInfo().getAttributionID();
    }

    public String getCleverTapID() {
        return this.coreState.getDeviceInfo().getDeviceID();
    }

    public CoreState getCoreState() {
        return this.coreState;
    }

    @Deprecated(since = "7.1.0")
    public int getCount(String str) {
        EventDetail eventDetail = this.coreState.getLocalDataStore().getEventDetail(str);
        if (eventDetail != null) {
            return eventDetail.getCount();
        }
        return -1;
    }

    public int getCustomSdkVersion(String str) {
        return this.coreState.getCoreMetaData().getCustomSdkVersion(str);
    }

    @Deprecated(since = "7.1.0")
    public EventDetail getDetails(String str) {
        return this.coreState.getLocalDataStore().getEventDetail(str);
    }

    public String getDevicePushToken(PushType pushType) {
        return this.coreState.getPushProviders().getCachedToken(pushType);
    }

    public DevicePushTokenRefreshListener getDevicePushTokenRefreshListener() {
        return this.coreState.getPushProviders().getDevicePushTokenRefreshListener();
    }

    public CleverTapDisplayUnit getDisplayUnitForId(String str) {
        if (this.coreState.getControllerManager().getCTDisplayUnitController() != null) {
            return this.coreState.getControllerManager().getCTDisplayUnitController().getDisplayUnitForID(str);
        }
        getConfigLogger().verbose(getAccountId(), "DisplayUnit : Failed to get Display Unit for id: " + str);
        return null;
    }

    public JSONObject getFetchRequestAsJson(int i4) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("t", i4);
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.WZRK_FETCH);
            jSONObject.put(Constants.KEY_EVT_DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            Logger.v(Constants.CLEVERTAP_LOG_TAG, "Failed while parsing fetch request as json:", e);
            return jSONObject;
        }
    }

    @Deprecated(since = "7.1.0")
    public int getFirstTime(String str) {
        EventDetail eventDetail = this.coreState.getLocalDataStore().getEventDetail(str);
        if (eventDetail != null) {
            return eventDetail.getFirstTime();
        }
        return -1;
    }

    public GeofenceCallback getGeofenceCallback() {
        return this.coreState.getCallbackManager().getGeofenceCallback();
    }

    @Deprecated(since = "7.1.0")
    public Map<String, EventDetail> getHistory() {
        return this.coreState.getLocalDataStore().getEventHistory(this.context);
    }

    public InAppNotificationListener getInAppNotificationListener() {
        return this.coreState.getCallbackManager().getInAppNotificationListener();
    }

    public int getInboxMessageCount() {
        synchronized (this.coreState.getCTLockManager().getInboxControllerLock()) {
            try {
                if (this.coreState.getControllerManager().getCTInboxController() != null) {
                    return this.coreState.getControllerManager().getCTInboxController().count();
                }
                getConfigLogger().debug(getAccountId(), "Notification Inbox not initialized");
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CTInboxMessage getInboxMessageForId(String str) {
        Logger.d("CleverTapAPI:getInboxMessageForId() called with: messageId = [" + str + Constants.AES_SUFFIX);
        synchronized (this.coreState.getCTLockManager().getInboxControllerLock()) {
            try {
                CTInboxMessage cTInboxMessage = null;
                if (this.coreState.getControllerManager().getCTInboxController() != null) {
                    CTMessageDAO messageForId = this.coreState.getControllerManager().getCTInboxController().getMessageForId(str);
                    if (messageForId != null) {
                        cTInboxMessage = new CTInboxMessage(messageForId.toJSON());
                    }
                    return cTInboxMessage;
                }
                getConfigLogger().debug(getAccountId(), "Notification Inbox not initialized");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getInboxMessageUnreadCount() {
        synchronized (this.coreState.getCTLockManager().getInboxControllerLock()) {
            try {
                if (this.coreState.getControllerManager().getCTInboxController() != null) {
                    return this.coreState.getControllerManager().getCTInboxController().unreadCount();
                }
                getConfigLogger().debug(getAccountId(), "Notification Inbox not initialized");
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated(since = "7.1.0")
    public int getLastTime(String str) {
        EventDetail eventDetail = this.coreState.getLocalDataStore().getEventDetail(str);
        if (eventDetail != null) {
            return eventDetail.getLastTime();
        }
        return -1;
    }

    public String getLocale() {
        return this.coreState.getDeviceInfo().getCustomLocale();
    }

    public Location getLocation() {
        return this.coreState.getLocationManager()._getLocation();
    }

    @Deprecated(since = "7.1.0")
    public int getPreviousVisitTime() {
        return this.coreState.getSessionManager().getLastVisitTime();
    }

    public Object getProperty(String str) {
        if (!this.coreState.getConfig().isPersonalizationEnabled()) {
            return null;
        }
        return this.coreState.getLocalDataStore().getProfileProperty(str);
    }

    public String getPushToken(PushType pushType) {
        return this.coreState.getPushProviders().getCachedToken(pushType);
    }

    public int getScreenCount() {
        return CoreMetaData.getActivityCount();
    }

    public SyncListener getSyncListener() {
        return this.coreState.getCallbackManager().getSyncListener();
    }

    public int getTimeElapsed() {
        int currentSessionId = this.coreState.getCoreMetaData().getCurrentSessionId();
        if (currentSessionId == 0) {
            return -1;
        }
        return clevertapClock.currentTimeSecondsInt() - currentSessionId;
    }

    @Deprecated(since = "7.1.0")
    public int getTotalVisits() {
        EventDetail eventDetail = this.coreState.getLocalDataStore().getEventDetail(Constants.APP_LAUNCHED_EVENT);
        if (eventDetail != null) {
            return eventDetail.getCount();
        }
        return 0;
    }

    public UTMDetail getUTMDetails() {
        UTMDetail uTMDetail = new UTMDetail();
        uTMDetail.setSource(this.coreState.getCoreMetaData().getSource());
        uTMDetail.setMedium(this.coreState.getCoreMetaData().getMedium());
        uTMDetail.setCampaign(this.coreState.getCoreMetaData().getCampaign());
        return uTMDetail;
    }

    public ArrayList<CTInboxMessage> getUnreadInboxMessages() {
        ArrayList<CTInboxMessage> arrayList = new ArrayList<>();
        synchronized (this.coreState.getCTLockManager().getInboxControllerLock()) {
            try {
                if (this.coreState.getControllerManager().getCTInboxController() != null) {
                    Iterator<CTMessageDAO> it = this.coreState.getControllerManager().getCTInboxController().getUnreadMessages().iterator();
                    while (it.hasNext()) {
                        arrayList.add(new CTInboxMessage(it.next().toJSON()));
                    }
                    return arrayList;
                }
                getConfigLogger().debug(getAccountId(), "Notification Inbox not initialized");
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getUserAppLaunchCount() {
        if (!getConfig().isPersonalizationEnabled()) {
            return -1;
        }
        return this.coreState.getLocalDataStore().readUserEventLogCount(Constants.APP_LAUNCHED_EVENT);
    }

    public UserEventLog getUserEventLog(String str) {
        if (!getConfig().isPersonalizationEnabled()) {
            return null;
        }
        return this.coreState.getLocalDataStore().readUserEventLog(str);
    }

    public int getUserEventLogCount(String str) {
        if (!getConfig().isPersonalizationEnabled()) {
            return -1;
        }
        return this.coreState.getLocalDataStore().readUserEventLogCount(str);
    }

    public Map<String, UserEventLog> getUserEventLogHistory() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (getConfig().isPersonalizationEnabled()) {
            for (UserEventLog userEventLog : this.coreState.getLocalDataStore().readUserEventLogs()) {
                linkedHashMap.put(userEventLog.getEventName(), userEventLog);
            }
        }
        return linkedHashMap;
    }

    public long getUserLastVisitTs() {
        if (!getConfig().isPersonalizationEnabled()) {
            return -1L;
        }
        return this.coreState.getSessionManager().getUserLastVisitTs();
    }

    public <T> Var<T> getVariable(String str) {
        if (str == null) {
            return null;
        }
        return this.coreState.getVarCache().getVariable(str);
    }

    public Object getVariableValue(String str) {
        if (str == null) {
            return null;
        }
        return this.coreState.getVarCache().getMergedValue(str);
    }

    public void incrementValue(String str, Number number) {
        this.coreState.getAnalyticsManager().incrementValue(str, number);
    }

    public void initializeInbox() {
        this.coreState.getControllerManager().initializeInbox();
    }

    public boolean isPushPermissionGranted() {
        return this.coreState.getInAppController().isPushPermissionGranted();
    }

    public void markReadInboxMessage(CTInboxMessage cTInboxMessage) {
        if (this.coreState.getControllerManager().getCTInboxController() != null) {
            this.coreState.getControllerManager().getCTInboxController().markReadInboxMessage(cTInboxMessage);
        } else {
            getConfigLogger().debug(getAccountId(), "Notification Inbox not initialized");
        }
    }

    public void markReadInboxMessagesForIDs(ArrayList<String> arrayList) {
        if (this.coreState.getControllerManager().getCTInboxController() != null) {
            this.coreState.getControllerManager().getCTInboxController().markReadInboxMessagesForIDs(arrayList);
        } else {
            getConfigLogger().debug(getAccountId(), "Notification Inbox not initialized");
        }
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxActivity.InboxActivityListener
    public void messageDidClick(CTInboxActivity cTInboxActivity, int i4, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> hashMap, int i5) {
        this.coreState.getAnalyticsManager().pushInboxMessageStateEvent(true, cTInboxMessage, bundle);
        Logger.v("clicked inbox notification.");
        WeakReference<InboxMessageListener> weakReference = this.inboxMessageListener;
        if (weakReference != null && weakReference.get() != null) {
            this.inboxMessageListener.get().onInboxItemClicked(cTInboxMessage, i4, i5);
        }
        if (hashMap != null && !hashMap.isEmpty()) {
            Logger.v("clicked button of an inbox notification.");
            WeakReference<InboxMessageButtonListener> weakReference2 = this.inboxMessageButtonListener;
            if (weakReference2 != null && weakReference2.get() != null) {
                this.inboxMessageButtonListener.get().onInboxButtonClick(hashMap);
            }
        }
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxActivity.InboxActivityListener
    public void messageDidShow(CTInboxActivity cTInboxActivity, CTInboxMessage cTInboxMessage, Bundle bundle) {
        this.coreState.getExecutors().postAsyncSafelyTask().execute("handleMessageDidShow", new B2.e(this, cTInboxMessage, bundle, 3));
    }

    public void onUserLogin(Map<String, Object> map, String str) {
        this.coreState.getLoginController().onUserLogin(map, str);
    }

    public void onVariablesChangedAndNoDownloadsPending(VariablesChangedCallback variablesChangedCallback) {
        this.coreState.getCTVariables().onVariablesChangedAndNoDownloadsPending(variablesChangedCallback);
    }

    public void onceVariablesChangedAndNoDownloadsPending(VariablesChangedCallback variablesChangedCallback) {
        this.coreState.getCTVariables().onceVariablesChangedAndNoDownloadsPending(variablesChangedCallback);
    }

    public void parseVariables(Object... objArr) {
        this.coreState.getParser().parseVariables(objArr);
    }

    public void parseVariablesForClasses(Class<?>... clsArr) {
        this.coreState.getParser().parseVariablesForClasses(clsArr);
    }

    @Deprecated
    public CTProductConfigController productConfig() {
        if (getConfig().isAnalyticsOnly()) {
            getConfig().getLogger().debug(getAccountId(), "Product config is not supported with analytics only configuration");
        }
        return this.coreState.getCtProductConfigController(this.context);
    }

    public void promptForPushPermission(boolean z2) {
        this.coreState.getInAppController().promptPermission(z2);
    }

    public void promptPushPrimer(JSONObject jSONObject) {
        this.coreState.getInAppController().promptPushPrimer(jSONObject);
    }

    public void pushChargedEvent(HashMap<String, Object> hashMap, ArrayList<HashMap<String, Object>> arrayList) {
        this.coreState.getAnalyticsManager().pushChargedEvent(hashMap, arrayList);
    }

    public void pushDeepLink(Uri uri) {
        this.coreState.getAnalyticsManager().pushDeepLink(uri, false);
    }

    public void pushDisplayUnitClickedEventForID(String str) {
        this.coreState.getAnalyticsManager().pushDisplayUnitClickedEventForID(str);
    }

    public void pushDisplayUnitViewedEventForID(String str) {
        this.coreState.getAnalyticsManager().pushDisplayUnitViewedEventForID(str);
    }

    public void pushError(String str, int i4) {
        this.coreState.getAnalyticsManager().pushError(str, i4);
    }

    public void pushEvent(String str) {
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        pushEvent(str, null);
    }

    public void pushFcmRegistrationId(String str, boolean z2) {
        this.coreState.getPushProviders().handleToken(str, PushConstants.FCM, z2);
    }

    public void pushGeoFenceError(int i4, String str) {
        this.coreState.getValidationResultStack().pushValidationResult(new ValidationResult(i4, str));
    }

    public Future<?> pushGeoFenceExitedEvent(JSONObject jSONObject) {
        return this.coreState.getAnalyticsManager().raiseEventForGeofences(Constants.GEOFENCE_EXITED_EVENT_NAME, jSONObject);
    }

    public Future<?> pushGeofenceEnteredEvent(JSONObject jSONObject) {
        return this.coreState.getAnalyticsManager().raiseEventForGeofences(Constants.GEOFENCE_ENTERED_EVENT_NAME, jSONObject);
    }

    public void pushInboxNotificationClickedEvent(String str) {
        Logger.v("CleverTapAPI:pushInboxNotificationClickedEvent() called with: messageId = [" + str + Constants.AES_SUFFIX);
        this.coreState.getAnalyticsManager().pushInboxMessageStateEvent(true, getInboxMessageForId(str), null);
    }

    public void pushInboxNotificationViewedEvent(String str) {
        Logger.v("CleverTapAPI:pushInboxNotificationViewedEvent() called with: messageId = [" + str + Constants.AES_SUFFIX);
        this.coreState.getAnalyticsManager().pushInboxMessageStateEvent(false, getInboxMessageForId(str), null);
    }

    public void pushInstallReferrer(String str) {
        this.coreState.getAnalyticsManager().pushInstallReferrer(str);
    }

    public void pushNotificationClickedEvent(Bundle bundle) {
        this.coreState.getAnalyticsManager().pushNotificationClickedEvent(bundle);
    }

    public void pushNotificationViewedEvent(Bundle bundle) {
        this.coreState.getAnalyticsManager().pushNotificationViewedEvent(bundle);
    }

    public void pushProfile(Map<String, Object> map) {
        this.coreState.getAnalyticsManager().pushProfile(map);
    }

    public void pushRegistrationToken(String str, PushType pushType, boolean z2) {
        this.coreState.getPushProviders().handleToken(str, pushType, z2);
    }

    public Future<?> pushSignedCallEvent(String str, JSONObject jSONObject) {
        return this.coreState.getAnalyticsManager().raiseEventForSignedCall(str, jSONObject);
    }

    public void recordScreen(String str) {
        String screenName = this.coreState.getCoreMetaData().getScreenName();
        if (str != null) {
            if (screenName == null || screenName.isEmpty() || !screenName.equals(str)) {
                getConfigLogger().debug(getAccountId(), "Screen changed to ".concat(str));
                this.coreState.getCoreMetaData().setCurrentScreenName(str);
                this.coreState.getAnalyticsManager().recordPageEventWithExtras(null);
            }
        }
    }

    public void registerPushPermissionNotificationResponseListener(PushPermissionResponseListener pushPermissionResponseListener) {
        this.coreState.getCallbackManager().registerPushPermissionResponseListener(pushPermissionResponseListener);
    }

    public void removeAllOneTimeVariablesChangedCallbacks() {
        this.coreState.getCTVariables().removeAllOneTimeVariablesChangedCallbacks();
    }

    public void removeAllVariablesChangedCallbacks() {
        this.coreState.getCTVariables().removeAllVariablesChangedCallbacks();
    }

    public void removeCleverTapIDListener(OnInitCleverTapIDListener onInitCleverTapIDListener) {
        CoreState coreState = this.coreState;
        if (coreState != null && coreState.getCallbackManager() != null) {
            this.coreState.getCallbackManager().removeOnInitCleverTapIDListener(onInitCleverTapIDListener);
        }
    }

    public void removeMultiValueForKey(String str, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            removeMultiValuesForKey(str, new ArrayList<>(Collections.singletonList(str2)));
        } else {
            this.coreState.getAnalyticsManager()._generateEmptyMultiValueError(str);
        }
    }

    public void removeMultiValuesForKey(String str, ArrayList<String> arrayList) {
        this.coreState.getAnalyticsManager().removeMultiValuesForKey(str, arrayList);
    }

    public void removeOneTimeVariablesChangedCallback(VariablesChangedCallback variablesChangedCallback) {
        this.coreState.getCTVariables().removeOneTimeVariablesChangedHandler(variablesChangedCallback);
    }

    public void removeValueForKey(String str) {
        this.coreState.getAnalyticsManager().removeValueForKey(str);
    }

    public void removeVariablesChangedCallback(VariablesChangedCallback variablesChangedCallback) {
        this.coreState.getCTVariables().removeVariablesChangedCallback(variablesChangedCallback);
    }

    public Future<?> renderPushNotification(INotificationRenderer iNotificationRenderer, Context context, Bundle bundle) {
        CleverTapInstanceConfig config = this.coreState.getConfig();
        try {
            return this.coreState.getExecutors().postAsyncSafelyTask().submit("CleverTapAPI#renderPushNotification", new g(this, iNotificationRenderer, bundle, context));
        } catch (Throwable th) {
            config.getLogger().debug(config.getAccountId(), "Failed to process renderPushNotification()", th);
            return null;
        }
    }

    public void renderPushNotificationOnCallerThread(INotificationRenderer iNotificationRenderer, Context context, Bundle bundle) {
        CleverTapInstanceConfig config = this.coreState.getConfig();
        try {
            synchronized (this.coreState.getPushProviders().getPushRenderingLock()) {
                try {
                    config.getLogger().verbose(config.getAccountId(), "rendering push on caller thread with id = " + Thread.currentThread().getId());
                    this.coreState.getPushProviders().setPushNotificationRenderer(iNotificationRenderer);
                    if (bundle != null && bundle.containsKey(Constants.PT_NOTIF_ID)) {
                        this.coreState.getPushProviders()._createNotification(context, bundle, bundle.getInt(Constants.PT_NOTIF_ID));
                    } else {
                        this.coreState.getPushProviders()._createNotification(context, bundle, Constants.EMPTY_NOTIFICATION_ID);
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            config.getLogger().debug(config.getAccountId(), "Failed to process renderPushNotification()", th);
        }
    }

    public void resumeInAppNotifications() {
        if (!this.coreState.getConfig().isAnalyticsOnly()) {
            getConfigLogger().debug(getAccountId(), "Resuming InApp Notifications...");
            this.coreState.getInAppController().resumeInApps();
        } else {
            getConfigLogger().debug(getAccountId(), "CleverTap instance is set for Analytics only! Cannot resume InApp Notifications.");
        }
    }

    @Deprecated
    public void setCTFeatureFlagsListener(CTFeatureFlagsListener cTFeatureFlagsListener) {
        this.coreState.getCallbackManager().setFeatureFlagListener(cTFeatureFlagsListener);
    }

    public void setCTInboxMessageListener(InboxMessageListener inboxMessageListener) {
        this.inboxMessageListener = new WeakReference<>(inboxMessageListener);
    }

    public void setCTNotificationInboxListener(CTInboxListener cTInboxListener) {
        this.coreState.getCallbackManager().setInboxListener(cTInboxListener);
    }

    @Deprecated
    public void setCTProductConfigListener(CTProductConfigListener cTProductConfigListener) {
        this.coreState.getCallbackManager().setProductConfigListener(cTProductConfigListener);
    }

    public void setCTPushAmpListener(CTPushAmpListener cTPushAmpListener) {
        this.coreState.getCallbackManager().setPushAmpListener(cTPushAmpListener);
    }

    public void setCTPushNotificationListener(CTPushNotificationListener cTPushNotificationListener) {
        this.coreState.getCallbackManager().setPushNotificationListener(cTPushNotificationListener);
    }

    public void setCoreState(CoreState coreState) {
        this.coreState = coreState;
    }

    public void setCustomSdkVersion(String str, int i4) {
        this.coreState.getCoreMetaData().setCustomSdkVersion(str, i4);
    }

    public void setDevicePushTokenRefreshListener(DevicePushTokenRefreshListener devicePushTokenRefreshListener) {
        this.coreState.getPushProviders().setDevicePushTokenRefreshListener(devicePushTokenRefreshListener);
    }

    public void setDisplayUnitListener(DisplayUnitListener displayUnitListener) {
        this.coreState.getCallbackManager().setDisplayUnitListener(displayUnitListener);
    }

    public void setGeofenceCallback(GeofenceCallback geofenceCallback) {
        this.coreState.getCallbackManager().setGeofenceCallback(geofenceCallback);
    }

    public void setInAppNotificationButtonListener(InAppNotificationButtonListener inAppNotificationButtonListener) {
        this.coreState.getCallbackManager().setInAppNotificationButtonListener(inAppNotificationButtonListener);
    }

    public void setInAppNotificationListener(InAppNotificationListener inAppNotificationListener) {
        this.coreState.getCallbackManager().setInAppNotificationListener(inAppNotificationListener);
    }

    public void setInboxMessageButtonListener(InboxMessageButtonListener inboxMessageButtonListener) {
        this.inboxMessageButtonListener = new WeakReference<>(inboxMessageButtonListener);
    }

    public void setLibrary(String str) {
        if (this.coreState.getDeviceInfo() != null) {
            this.coreState.getDeviceInfo().setLibrary(str);
        }
    }

    public void setLocale(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.i("Empty Locale provided for setLocale, not setting it");
        } else {
            this.coreState.getDeviceInfo().setCustomLocale(str);
        }
    }

    public void setLocation(Location location) {
        this.coreState.getLocationManager()._setLocation(location);
    }

    public Future<?> setLocationForGeofences(Location location, int i4) {
        this.coreState.getCoreMetaData().setLocationForGeofence(true);
        this.coreState.getCoreMetaData().setGeofenceSDKVersion(i4);
        return this.coreState.getLocationManager()._setLocation(location);
    }

    public void setMultiValuesForKey(String str, ArrayList<String> arrayList) {
        this.coreState.getAnalyticsManager().setMultiValuesForKey(str, arrayList);
    }

    public void setOffline(boolean z2) {
        this.coreState.getCoreMetaData().setOffline(z2);
        if (z2) {
            getConfigLogger().debug(getAccountId(), "CleverTap Instance has been set to offline, won't send events queue");
        } else {
            getConfigLogger().debug(getAccountId(), "CleverTap Instance has been set to online, sending events queue");
            flush();
        }
    }

    public void setOptOut(boolean z2) {
        setOptOut(z2, !z2);
    }

    public void setRequestDevicePushTokenListener(RequestDevicePushTokenListener requestDevicePushTokenListener) {
        try {
            Logger.v(PushConstants.LOG_TAG, "FCMRequesting FCM token using googleservices.json");
            FirebaseMessaging.charlie().echo().bravo(new G6.e() { // from class: com.clevertap.android.sdk.CleverTapAPI.2
                final /* synthetic */ RequestDevicePushTokenListener val$requestTokenListener;

                public AnonymousClass2(RequestDevicePushTokenListener requestDevicePushTokenListener2) {
                    r2 = requestDevicePushTokenListener2;
                }

                @Override // G6.e
                public void onComplete(Task task) {
                    String str = null;
                    if (!task.juliet()) {
                        Logger.v(PushConstants.LOG_TAG, "FCMFCM token using googleservices.json failed", task.golf());
                        r2.onDevicePushToken(null, PushConstants.FCM);
                        return;
                    }
                    if (task.hotel() != null) {
                        str = (String) task.hotel();
                    }
                    Logger.v(PushConstants.LOG_TAG, "FCMFCM token using googleservices.json - " + str);
                    r2.onDevicePushToken(str, PushConstants.FCM);
                }
            });
        } catch (Throwable th) {
            Logger.v(PushConstants.LOG_TAG, "FCMError requesting FCM token", th);
            requestDevicePushTokenListener2.onDevicePushToken(null, PushConstants.FCM);
        }
    }

    public void setSCDomainListener(SCDomainListener sCDomainListener) {
        String domain;
        this.coreState.getCallbackManager().setSCDomainListener(sCDomainListener);
        if (this.coreState.getNetworkManager() != null && (domain = this.coreState.getNetworkManager().getDomain(EventGroup.REGULAR)) != null) {
            sCDomainListener.onSCDomainAvailable(Utils.getSCDomain(domain));
        }
    }

    public void setSyncListener(SyncListener syncListener) {
        this.coreState.getCallbackManager().setSyncListener(syncListener);
    }

    public void showAppInbox(CTInboxStyleConfig cTInboxStyleConfig) {
        synchronized (this.coreState.getCTLockManager().getInboxControllerLock()) {
            try {
                if (this.coreState.getControllerManager().getCTInboxController() == null) {
                    getConfigLogger().debug(getAccountId(), "Notification Inbox not initialized");
                    return;
                }
                CTInboxStyleConfig cTInboxStyleConfig2 = new CTInboxStyleConfig(cTInboxStyleConfig);
                Intent intent = new Intent(this.context, (Class<?>) CTInboxActivity.class);
                intent.putExtra("styleConfig", cTInboxStyleConfig2);
                Bundle bundle = new Bundle();
                bundle.putParcelable(Constants.KEY_CONFIG, getConfig());
                intent.putExtra("configBundle", bundle);
                try {
                    Activity currentActivity = CoreMetaData.getCurrentActivity();
                    if (currentActivity != null) {
                        currentActivity.startActivity(intent);
                        Logger.d("Displaying Notification Inbox");
                        return;
                    }
                    throw new IllegalStateException("Current activity reference not found");
                } catch (Throwable th) {
                    Logger.v("Please verify the integration of your app. It is not setup to support Notification Inbox yet.", th);
                }
            } finally {
            }
        }
    }

    public void suspendInAppNotifications() {
        if (!this.coreState.getConfig().isAnalyticsOnly()) {
            getConfigLogger().debug(getAccountId(), "Suspending InApp Notifications...");
            getConfigLogger().debug(getAccountId(), "Please Note - InApp Notifications will be suspended till resumeInAppNotifications() is not called again");
            this.coreState.getInAppController().suspendInApps();
            return;
        }
        getConfigLogger().debug(getAccountId(), "CleverTap instance is set for Analytics only! Cannot suspend InApp Notifications.");
    }

    public void syncRegisteredInAppTemplates() {
        if (!isDevelopmentMode()) {
            getConfigLogger().debug("CustomTemplates", "Your app is NOT in development mode, templates will not be synced");
            return;
        }
        CoreState coreState = this.coreState;
        if (coreState == null) {
            getConfigLogger().debug("CustomTemplates", "coreState is null, templates cannot be synced");
            return;
        }
        if (coreState.getNetworkManager() == null) {
            getConfigLogger().debug("CustomTemplates", "networkManager is null, templates cannot be synced");
        } else {
            if (this.coreState.getTemplatesManager() == null) {
                getConfigLogger().debug("CustomTemplates", "templateManager is null, templates cannot be synced");
                return;
            }
            final TemplatesManager templatesManager = this.coreState.getTemplatesManager();
            final NetworkManager networkManager = this.coreState.getNetworkManager();
            getCleverTapID(new OnInitCleverTapIDListener() { // from class: com.clevertap.android.sdk.q
                @Override // com.clevertap.android.sdk.interfaces.OnInitCleverTapIDListener
                public final void onInitCleverTapID(String str) {
                    CleverTapAPI.this.lambda$syncRegisteredInAppTemplates$7(networkManager, templatesManager, str);
                }
            });
        }
    }

    public void syncVariables() {
        if (isDevelopmentMode()) {
            Logger.v("variables", "syncVariables: waiting for id to be available");
            getCleverTapID(new OnInitCleverTapIDListener() { // from class: com.clevertap.android.sdk.i
                @Override // com.clevertap.android.sdk.interfaces.OnInitCleverTapIDListener
                public final void onInitCleverTapID(String str) {
                    CleverTapAPI.this.lambda$syncVariables$18(str);
                }
            });
        } else {
            Logger.v("variables", "Your app is NOT in development mode, variables data will not be sent to server");
        }
    }

    public void unregisterPushPermissionNotificationResponseListener(PushPermissionResponseListener pushPermissionResponseListener) {
        this.coreState.getCallbackManager().unregisterPushPermissionResponseListener(pushPermissionResponseListener);
    }

    public CleverTapAPI(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, CoreState coreState, Clock clock) {
        this.context = context;
        this.coreState = coreState;
        clevertapClock = clock;
        getConfigLogger().verbose(cleverTapInstanceConfig.getAccountId() + ":async_deviceID", "CoreState is set");
        asyncStartup();
        Logger.i("CleverTap SDK initialized with accountId: " + cleverTapInstanceConfig.getAccountId() + " accountToken: " + cleverTapInstanceConfig.getAccountToken() + " accountRegion: " + cleverTapInstanceConfig.getAccountRegion());
    }

    public static void changeCredentials(String str, String str2, String str3) {
        if (defaultConfig != null) {
            Logger.i("CleverTap SDK already initialized with accountID:" + defaultConfig.getAccountId() + " and token:" + defaultConfig.getAccountToken() + ". Cannot change credentials to " + str + " and " + str2);
            return;
        }
        ManifestInfo.changeCredentials(str, str2, str3);
    }

    private static CleverTapAPI createInstanceIfAvailable(Context context, String str, String str2) {
        try {
            if (str == null) {
                try {
                    return getDefaultInstance(context, str2);
                } catch (Throwable th) {
                    Logger.v("Error creating shared Instance: ", th.getCause());
                    return null;
                }
            }
            String string = StorageHelper.getString(context, "instance:".concat(str), "");
            if (!string.isEmpty()) {
                CleverTapInstanceConfig createInstance = CleverTapInstanceConfig.createInstance(string);
                Logger.v("Inflated Instance Config: ".concat(string));
                if (createInstance != null) {
                    return instanceWithConfig(context, createInstance, str2);
                }
                return null;
            }
            try {
                CleverTapAPI defaultInstance = getDefaultInstance(context);
                if (defaultInstance != null) {
                    if (defaultInstance.coreState.getConfig().getAccountId().equals(str)) {
                        return defaultInstance;
                    }
                }
                return null;
            } catch (Throwable th2) {
                Logger.v("Error creating shared Instance: ", th2.getCause());
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static CleverTapAPI instanceWithConfig(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (cleverTapInstanceConfig == null) {
            Logger.v("CleverTapInstanceConfig cannot be null");
            return null;
        }
        if (instances == null) {
            instances = new HashMap<>();
        }
        CleverTapAPI cleverTapAPI = instances.get(cleverTapInstanceConfig.getAccountId());
        if (cleverTapAPI == null) {
            cleverTapAPI = new CleverTapAPI(context, cleverTapInstanceConfig, str);
            instances.put(cleverTapInstanceConfig.getAccountId(), cleverTapAPI);
        } else if (cleverTapAPI.getConfig().getEnableCustomCleverTapId() && Utils.validateCTID(str) && cleverTapAPI.isErrorDeviceId()) {
            cleverTapAPI.coreState.getLoginController().asyncProfileSwitchUser(null, null, str);
        }
        Logger.v(cleverTapInstanceConfig.getAccountId() + ":async_deviceID", "CleverTapAPI instance = " + cleverTapAPI);
        return cleverTapAPI;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:9|(2:10|11)|(7:57|58|14|15|16|(7:20|(1:22)|35|(2:32|33)|25|(2:28|29)|27)|(5:39|40|(4:43|(3:45|46|47)(1:49)|48|41)|50|51)(1:38))|13|14|15|16|(8:18|20|(0)|35|(0)|25|(0)|27)|(0)|39|40|(1:41)|50|51) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (com.clevertap.android.sdk.Constants.WZRK_FROM.equals(r4.get(com.clevertap.android.sdk.Constants.WZRK_FROM_KEY)) != false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #2 {all -> 0x0084, blocks: (B:16:0x0039, B:18:0x0043, B:20:0x0049, B:22:0x004f), top: B:15:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:33:0x005f, B:25:0x0076, B:28:0x007c), top: B:32:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:40:0x0089, B:41:0x0093, B:43:0x0099, B:46:0x00a9), top: B:39:0x0089 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void onActivityCreated(Activity activity, String str) {
        Uri uri;
        String str2;
        boolean z2;
        Iterator<String> it;
        Bundle bundle = null;
        if (instances == null) {
            createInstanceIfAvailable(activity.getApplicationContext(), null, str);
        }
        if (instances == null) {
            Logger.v("Instances is null in onActivityCreated!");
            return;
        }
        boolean z10 = true;
        try {
            uri = activity.getIntent().getData();
        } catch (Throwable unused) {
            uri = null;
        }
        try {
            if (uri != null) {
                try {
                    str2 = UriHelper.getAllKeyValuePairs(uri.toString(), true).getString(Constants.WZRK_ACCT_ID_KEY);
                } catch (Throwable unused2) {
                }
                z2 = false;
                bundle = activity.getIntent().getExtras();
                if (bundle != null && !bundle.isEmpty()) {
                    if (bundle.containsKey(Constants.WZRK_FROM_KEY)) {
                    }
                    z10 = false;
                    if (z10) {
                        try {
                            Logger.v("ActivityLifecycleCallback: Notification Clicked already processed for " + bundle + ", dropping duplicate.");
                        } catch (Throwable unused3) {
                        }
                    }
                    if (bundle.containsKey(Constants.WZRK_ACCT_ID_KEY)) {
                        str2 = (String) bundle.get(Constants.WZRK_ACCT_ID_KEY);
                    }
                    z2 = z10;
                }
                if (z2 || uri != null) {
                    it = instances.keySet().iterator();
                    while (it.hasNext()) {
                        CleverTapAPI cleverTapAPI = instances.get(it.next());
                        if (cleverTapAPI != null) {
                            cleverTapAPI.coreState.getActivityLifeCycleManager().onActivityCreated(bundle, uri, str2);
                        }
                    }
                    return;
                }
                return;
            }
            it = instances.keySet().iterator();
            while (it.hasNext()) {
            }
            return;
        } catch (Throwable th) {
            Logger.v("Throwable - " + th.getLocalizedMessage());
            return;
        }
        str2 = null;
        z2 = false;
        bundle = activity.getIntent().getExtras();
        if (bundle != null) {
            if (bundle.containsKey(Constants.WZRK_FROM_KEY)) {
            }
            z10 = false;
            if (z10) {
            }
            if (bundle.containsKey(Constants.WZRK_ACCT_ID_KEY)) {
            }
            z2 = z10;
        }
        if (z2) {
        }
    }

    public static void onActivityResumed(Activity activity, String str) {
        if (instances == null) {
            createInstanceIfAvailable(activity.getApplicationContext(), null, str);
        }
        CoreMetaData.setAppForeground(true);
        if (instances == null) {
            Logger.v("Instances is null in onActivityResumed!");
            return;
        }
        String currentActivityName = CoreMetaData.getCurrentActivityName();
        CoreMetaData.setCurrentActivity(activity);
        if (currentActivityName == null || !currentActivityName.equals(activity.getLocalClassName())) {
            CoreMetaData.incrementActivityCount();
        }
        if (CoreMetaData.getInitialAppEnteredForegroundTime() <= 0) {
            CoreMetaData.setInitialAppEnteredForegroundTime(clevertapClock.currentTimeSecondsInt());
        }
        Iterator<String> it = instances.keySet().iterator();
        while (it.hasNext()) {
            CleverTapAPI cleverTapAPI = instances.get(it.next());
            if (cleverTapAPI != null) {
                try {
                    cleverTapAPI.coreState.getActivityLifeCycleManager().activityResumed(activity);
                } catch (Throwable th) {
                    Logger.v("Throwable - " + th.getLocalizedMessage());
                }
            }
        }
    }

    public static void setDebugLevel(LogLevel logLevel) {
        debugLevel = logLevel.intValue();
    }

    public void fetchVariables(FetchVariablesCallback fetchVariablesCallback) {
        if (this.coreState.getConfig().isAnalyticsOnly()) {
            return;
        }
        Logger.v("variables", "Fetching  variables");
        if (fetchVariablesCallback != null) {
            this.coreState.getCallbackManager().setFetchVariablesCallback(fetchVariablesCallback);
        }
        this.coreState.getAnalyticsManager().sendFetchEvent(getFetchRequestAsJson(4));
    }

    public void getCleverTapID(OnInitCleverTapIDListener onInitCleverTapIDListener) {
        this.coreState.getExecutors().ioTask().execute("getCleverTapID", new c(4, this, onInitCleverTapIDListener));
    }

    public boolean isDevelopmentMode() {
        Context context = this.context;
        return context != null && isDevelopmentMode(context);
    }

    public void onUserLogin(Map<String, Object> map) {
        onUserLogin(map, null);
    }

    public synchronized void pushInstallReferrer(String str, String str2, String str3) {
        this.coreState.getAnalyticsManager().pushInstallReferrer(str, str2, str3);
    }

    public void setOptOut(final boolean z2, final boolean z10) {
        this.coreState.getExecutors().postAsyncSafelyTask().execute("setOptOut", new Callable() { // from class: com.clevertap.android.sdk.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$setOptOut$13;
                lambda$setOptOut$13 = CleverTapAPI.this.lambda$setOptOut$13(z2, z10);
                return lambda$setOptOut$13;
            }
        });
    }

    public static synchronized void registerCustomInAppTemplates(String str, TemplatePresenter templatePresenter, FunctionPresenter functionPresenter) {
        synchronized (CleverTapAPI.class) {
            TemplatesManager.register(new JsonTemplatesProducer(str, templatePresenter, functionPresenter));
        }
    }

    public void pushEvent(String str, Map<String, Object> map) {
        this.coreState.getAnalyticsManager().pushEvent(str, map);
    }

    public void deleteInboxMessage(String str) {
        deleteInboxMessage(getInboxMessageForId(str));
    }

    public void markReadInboxMessage(String str) {
        markReadInboxMessage(getInboxMessageForId(str));
    }

    public static CleverTapAPI getDefaultInstance(Context context) {
        return getDefaultInstance(context, null);
    }

    public static void changeCredentials(String str, String str2, String str3, String str4) {
        if (defaultConfig != null) {
            StringBuilder sb2 = new StringBuilder("CleverTap SDK already initialized with accountID:");
            sb2.append(defaultConfig.getAccountId());
            sb2.append(", token:");
            sb2.append(defaultConfig.getAccountToken());
            sb2.append(", proxyDomain: ");
            sb2.append(defaultConfig.getProxyDomain());
            sb2.append(" and spikyDomain: ");
            sb2.append(defaultConfig.getSpikyProxyDomain());
            sb2.append(". Cannot change credentials to accountID: ");
            sb2.append(str);
            sb2.append(", token: ");
            Q0.c.azure(sb2, str2, ", proxyDomain: ", str3, "and spikyProxyDomain: ");
            sb2.append(str4);
            Logger.i(sb2.toString());
            return;
        }
        ManifestInfo.changeCredentials(str, str2, str3, str4);
    }

    public static void createNotificationChannel(Context context, String str, CharSequence charSequence, String str2, int i4, String str3, boolean z2) {
        CleverTapAPI defaultInstanceOrFirstOther = getDefaultInstanceOrFirstOther(context);
        if (defaultInstanceOrFirstOther == null) {
            Logger.v("No CleverTap Instance found in CleverTapAPI#createNotificatonChannel");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                defaultInstanceOrFirstOther.getCoreState().getExecutors().postAsyncSafelyTask().execute("creatingNotificationChannel", new j(context, str, charSequence, i4, str2, str3, z2, defaultInstanceOrFirstOther));
            }
        } catch (Throwable th) {
            defaultInstanceOrFirstOther.getConfigLogger().verbose(defaultInstanceOrFirstOther.getAccountId(), "Failure creating Notification Channel", th);
        }
    }

    public static void createNotification(Context context, Bundle bundle) {
        createNotification(context, bundle, Constants.EMPTY_NOTIFICATION_ID);
    }

    public static void createNotificationChannel(Context context, String str, CharSequence charSequence, String str2, int i4, boolean z2, String str3) {
        CleverTapAPI defaultInstanceOrFirstOther = getDefaultInstanceOrFirstOther(context);
        if (defaultInstanceOrFirstOther == null) {
            Logger.v("No CleverTap Instance found in CleverTapAPI#createNotificatonChannel");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                defaultInstanceOrFirstOther.getCoreState().getExecutors().postAsyncSafelyTask().execute("createNotificationChannel", new j(context, str3, defaultInstanceOrFirstOther, str, charSequence, i4, str2, z2));
            }
        } catch (Throwable th) {
            defaultInstanceOrFirstOther.getConfigLogger().verbose(defaultInstanceOrFirstOther.getAccountId(), "Failure creating Notification Channel", th);
        }
    }

    public void showAppInbox() {
        showAppInbox(new CTInboxStyleConfig());
    }

    public static void changeCredentials(String str, String str2, String str3, String str4, String str5) {
        if (defaultConfig != null) {
            StringBuilder sb2 = new StringBuilder("CleverTap SDK already initialized with accountID:");
            sb2.append(defaultConfig.getAccountId());
            sb2.append(", token:");
            sb2.append(defaultConfig.getAccountToken());
            sb2.append(", proxyDomain: ");
            sb2.append(defaultConfig.getProxyDomain());
            sb2.append(", spikyDomain: ");
            sb2.append(defaultConfig.getSpikyProxyDomain());
            sb2.append(", handshakeDomain: ");
            sb2.append(defaultConfig.getCustomHandshakeDomain());
            sb2.append(". Cannot change credentials to accountID: ");
            sb2.append(str);
            sb2.append(", token: ");
            Q0.c.azure(sb2, str2, ", proxyDomain: ", str3, ", spikyProxyDomain: ");
            sb2.append(str4);
            sb2.append("and customHandshakeDomain: ");
            sb2.append(str5);
            Logger.i(sb2.toString());
            return;
        }
        ManifestInfo.changeCredentials(str, str2, str3, str4, str5);
    }

    public static void createNotificationChannel(final Context context, final String str, final CharSequence charSequence, final String str2, final int i4, final String str3, final boolean z2, final String str4) {
        final CleverTapAPI defaultInstanceOrFirstOther = getDefaultInstanceOrFirstOther(context);
        if (defaultInstanceOrFirstOther == null) {
            Logger.v("No CleverTap Instance found in CleverTapAPI#createNotificatonChannel");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                defaultInstanceOrFirstOther.getCoreState().getExecutors().postAsyncSafelyTask().execute("creatingNotificationChannel", new Callable() { // from class: com.clevertap.android.sdk.n
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Void lambda$createNotificationChannel$2;
                        lambda$createNotificationChannel$2 = CleverTapAPI.lambda$createNotificationChannel$2(context, str4, defaultInstanceOrFirstOther, str, charSequence, i4, str2, str3, z2);
                        return lambda$createNotificationChannel$2;
                    }
                });
            }
        } catch (Throwable th) {
            defaultInstanceOrFirstOther.getConfigLogger().verbose(defaultInstanceOrFirstOther.getAccountId(), "Failure creating Notification Channel", th);
        }
    }
}
