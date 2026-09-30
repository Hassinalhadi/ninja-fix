package com.clevertap.android.sdk;

import R7.U;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import b3.AbstractC0715a;
import com.clevertap.android.sdk.ActivityLifeCycleManager;
import com.clevertap.android.sdk.events.BaseEventQueueManager;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.pushnotification.PushProviders;
import com.clevertap.android.sdk.task.CTExecutors;
import com.clevertap.android.sdk.task.OnSuccessListener;
import com.clevertap.android.sdk.task.Task;
import com.clevertap.android.sdk.utils.Clock;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class ActivityLifeCycleManager {
    private final AnalyticsManager analyticsManager;
    private final BaseEventQueueManager baseEventQueueManager;
    private final BaseCallbackManager callbackManager;
    private final Clock clock;
    private final CleverTapInstanceConfig config;
    private final Context context;
    private final CoreMetaData coreMetaData;
    private final CTExecutors executors;
    private final InAppController inAppController;
    private final PushProviders pushProviders;
    private final SessionManager sessionManager;

    /* renamed from: com.clevertap.android.sdk.ActivityLifeCycleManager$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Callable<Void> {
        public AnonymousClass1() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (!ActivityLifeCycleManager.this.coreMetaData.inCurrentSession()) {
                return null;
            }
            try {
                StorageHelper.putInt(ActivityLifeCycleManager.this.context, StorageHelper.storageKeyWithSuffix(ActivityLifeCycleManager.this.config, Constants.LAST_SESSION_EPOCH), currentTimeMillis);
                ActivityLifeCycleManager.this.config.getLogger().verbose(ActivityLifeCycleManager.this.config.getAccountId(), "Updated session time: " + currentTimeMillis);
                return null;
            } catch (Throwable th) {
                ActivityLifeCycleManager.this.config.getLogger().verbose(ActivityLifeCycleManager.this.config.getAccountId(), "Failed to update session time time: " + th.getMessage());
                return null;
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.ActivityLifeCycleManager$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements Callable<Void> {
        public AnonymousClass2() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            if (ActivityLifeCycleManager.this.coreMetaData.isInstallReferrerDataSent() || !ActivityLifeCycleManager.this.coreMetaData.isFirstSession()) {
                return null;
            }
            ActivityLifeCycleManager.this.handleInstallReferrerOnFirstInstall();
            return null;
        }
    }

    /* renamed from: com.clevertap.android.sdk.ActivityLifeCycleManager$3 */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 implements b3.d {
        final /* synthetic */ AbstractC0715a val$referrerClient;

        public AnonymousClass3(AbstractC0715a abstractC0715a) {
            this.val$referrerClient = abstractC0715a;
        }

        public void lambda$onInstallReferrerSetupFinished$0(AbstractC0715a abstractC0715a, b3.e eVar) {
            try {
                Bundle bundle = eVar.alpha;
                String string = bundle.getString("install_referrer");
                ActivityLifeCycleManager.this.coreMetaData.setReferrerClickTime(bundle.getLong("referrer_click_timestamp_seconds"));
                ActivityLifeCycleManager.this.coreMetaData.setAppInstallTime(bundle.getLong("install_begin_timestamp_seconds"));
                ActivityLifeCycleManager.this.analyticsManager.pushInstallReferrer(string);
                ActivityLifeCycleManager.this.coreMetaData.setInstallReferrerDataSent(true);
                ActivityLifeCycleManager.this.config.getLogger().debug(ActivityLifeCycleManager.this.config.getAccountId(), "Install Referrer data set [Referrer URL-" + string + Constants.AES_SUFFIX);
            } catch (NullPointerException e) {
                ActivityLifeCycleManager.this.config.getLogger().debug(ActivityLifeCycleManager.this.config.getAccountId(), "Install referrer client null pointer exception caused by Google Play Install Referrer library - " + e.getMessage());
                b3.c cVar = (b3.c) abstractC0715a;
                cVar.alpha = 3;
                if (cVar.delta != null) {
                    U.bravo("Unbinding from service.");
                    cVar.bravo.unbindService(cVar.delta);
                    cVar.delta = null;
                }
                cVar.charlie = null;
                ActivityLifeCycleManager.this.coreMetaData.setInstallReferrerDataSent(false);
            }
        }

        public b3.e lambda$onInstallReferrerSetupFinished$1(AbstractC0715a abstractC0715a) throws Exception {
            try {
                return abstractC0715a.alpha();
            } catch (RemoteException e) {
                ActivityLifeCycleManager.this.config.getLogger().debug(ActivityLifeCycleManager.this.config.getAccountId(), "Remote exception caused by Google Play Install Referrer library - " + e.getMessage());
                b3.c cVar = (b3.c) abstractC0715a;
                cVar.alpha = 3;
                if (cVar.delta != null) {
                    U.bravo("Unbinding from service.");
                    cVar.bravo.unbindService(cVar.delta);
                    cVar.delta = null;
                }
                cVar.charlie = null;
                ActivityLifeCycleManager.this.coreMetaData.setInstallReferrerDataSent(false);
                return null;
            }
        }

        @Override // b3.d
        public void onInstallReferrerServiceDisconnected() {
            if (!ActivityLifeCycleManager.this.coreMetaData.isInstallReferrerDataSent()) {
                ActivityLifeCycleManager.this.handleInstallReferrerOnFirstInstall();
            }
        }

        @Override // b3.d
        public void onInstallReferrerSetupFinished(int i4) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        return;
                    }
                    ActivityLifeCycleManager.this.config.getLogger().debug(ActivityLifeCycleManager.this.config.getAccountId(), "Install Referrer data not set, API not supported by Play Store on device");
                    return;
                }
                ActivityLifeCycleManager.this.config.getLogger().debug(ActivityLifeCycleManager.this.config.getAccountId(), "Install Referrer data not set, connection to Play Store unavailable");
                return;
            }
            Task postAsyncSafelyTask = ActivityLifeCycleManager.this.executors.postAsyncSafelyTask();
            final AbstractC0715a abstractC0715a = this.val$referrerClient;
            postAsyncSafelyTask.addOnSuccessListener(new OnSuccessListener() { // from class: com.clevertap.android.sdk.b
                @Override // com.clevertap.android.sdk.task.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ActivityLifeCycleManager.AnonymousClass3.this.lambda$onInstallReferrerSetupFinished$0(abstractC0715a, (b3.e) obj);
                }
            });
            postAsyncSafelyTask.execute("ActivityLifeCycleManager#getInstallReferrer", new c(0, this, this.val$referrerClient));
        }
    }

    public ActivityLifeCycleManager(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, AnalyticsManager analyticsManager, CoreMetaData coreMetaData, SessionManager sessionManager, PushProviders pushProviders, BaseCallbackManager baseCallbackManager, InAppController inAppController, BaseEventQueueManager baseEventQueueManager, CTExecutors cTExecutors, Clock clock) {
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.analyticsManager = analyticsManager;
        this.coreMetaData = coreMetaData;
        this.sessionManager = sessionManager;
        this.pushProviders = pushProviders;
        this.callbackManager = baseCallbackManager;
        this.inAppController = inAppController;
        this.baseEventQueueManager = baseEventQueueManager;
        this.executors = cTExecutors;
        this.clock = clock;
    }

    public void handleInstallReferrerOnFirstInstall() {
        this.config.getLogger().verbose(this.config.getAccountId(), "Starting to handle install referrer");
        try {
            Context context = this.context;
            if (context != null) {
                b3.c cVar = new b3.c(context);
                cVar.bravo(new AnonymousClass3(cVar));
                return;
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        } catch (Throwable th) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Google Play Install Referrer's InstallReferrerClient Class not found - " + th.getLocalizedMessage() + " \n Please add implementation 'com.android.installreferrer:installreferrer:2.1' to your build.gradle");
        }
    }

    public /* synthetic */ Void lambda$activityResumed$0() throws Exception {
        Utils.cleanupOldGIFs(this.context, this.config, this.clock);
        return null;
    }

    public void activityPaused() {
        CoreMetaData.setAppForeground(false);
        this.sessionManager.setAppLastSeen(System.currentTimeMillis());
        this.config.getLogger().verbose(this.config.getAccountId(), "App in background");
        this.executors.postAsyncSafelyTask().execute("activityPaused", new Callable<Void>() { // from class: com.clevertap.android.sdk.ActivityLifeCycleManager.1
            public AnonymousClass1() {
            }

            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (!ActivityLifeCycleManager.this.coreMetaData.inCurrentSession()) {
                    return null;
                }
                try {
                    StorageHelper.putInt(ActivityLifeCycleManager.this.context, StorageHelper.storageKeyWithSuffix(ActivityLifeCycleManager.this.config, Constants.LAST_SESSION_EPOCH), currentTimeMillis);
                    ActivityLifeCycleManager.this.config.getLogger().verbose(ActivityLifeCycleManager.this.config.getAccountId(), "Updated session time: " + currentTimeMillis);
                    return null;
                } catch (Throwable th) {
                    ActivityLifeCycleManager.this.config.getLogger().verbose(ActivityLifeCycleManager.this.config.getAccountId(), "Failed to update session time time: " + th.getMessage());
                    return null;
                }
            }
        });
    }

    public void activityResumed(Activity activity) {
        this.config.getLogger().verbose(this.config.getAccountId(), "App in foreground");
        this.sessionManager.checkTimeoutSession();
        if (!this.coreMetaData.isAppLaunchPushed()) {
            this.analyticsManager.pushAppLaunchedEvent();
            this.analyticsManager.fetchFeatureFlags();
            this.pushProviders.onTokenRefresh();
            this.executors.postAsyncSafelyTask().execute("HandlingInstallReferrer", new Callable<Void>() { // from class: com.clevertap.android.sdk.ActivityLifeCycleManager.2
                public AnonymousClass2() {
                }

                @Override // java.util.concurrent.Callable
                public Void call() {
                    if (ActivityLifeCycleManager.this.coreMetaData.isInstallReferrerDataSent() || !ActivityLifeCycleManager.this.coreMetaData.isFirstSession()) {
                        return null;
                    }
                    ActivityLifeCycleManager.this.handleInstallReferrerOnFirstInstall();
                    return null;
                }
            });
            this.executors.ioTask().execute("CleanUpOldGIFs", new a(0, this));
            try {
                if (this.callbackManager.getGeofenceCallback() != null) {
                    this.callbackManager.getGeofenceCallback().triggerLocation();
                }
            } catch (IllegalStateException e) {
                this.config.getLogger().verbose(this.config.getAccountId(), e.getLocalizedMessage());
            } catch (Exception unused) {
                this.config.getLogger().verbose(this.config.getAccountId(), "Failed to trigger location");
            }
        }
        this.baseEventQueueManager.pushInitialEventsAsync();
        this.inAppController.showNotificationIfAvailable();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityCreated(Bundle bundle, Uri uri, String str) {
        if (str == null) {
            try {
                if (!this.config.isDefaultInstance()) {
                }
                if (bundle != null && !bundle.isEmpty() && bundle.containsKey("wzrk_pn")) {
                    this.analyticsManager.pushNotificationClickedEvent(bundle);
                }
                if (uri == null) {
                    try {
                        this.analyticsManager.pushDeepLink(uri, false);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            } catch (Throwable th) {
                Logger.v("Throwable - " + th.getLocalizedMessage());
                return;
            }
        }
        if (!this.config.getAccountId().equals(str)) {
            return;
        }
        if (bundle != null) {
            this.analyticsManager.pushNotificationClickedEvent(bundle);
        }
        if (uri == null) {
        }
    }
}
