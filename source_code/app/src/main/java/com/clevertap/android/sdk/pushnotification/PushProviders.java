package com.clevertap.android.sdk.pushnotification;

import A2.ab;
import A2.ah;
import A2.d;
import B2.w;
import E8.g;
import J2.p;
import K2.e;
import Q0.c;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.AnalyticsManager;
import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ControllerManager;
import com.clevertap.android.sdk.DeviceInfo;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.ManifestInfo;
import com.clevertap.android.sdk.StorageHelper;
import com.clevertap.android.sdk.db.BaseDatabaseManager;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.db.DBAdapter;
import com.clevertap.android.sdk.interfaces.AudibleNotification;
import com.clevertap.android.sdk.pushnotification.amp.CTPushAmpWorker;
import com.clevertap.android.sdk.pushnotification.work.CTWorkManager;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import com.clevertap.android.sdk.validation.ValidationResult;
import com.clevertap.android.sdk.validation.ValidationResultFactory;
import com.clevertap.android.sdk.validation.ValidationResultStack;
import f1.s;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PushProviders implements CTPushProviderListener {
    private static final int DEFAULT_FLEX_INTERVAL = 5;
    private static final String PF_JOB_ID = "pfjobid";
    private static final String PF_WORK_ID = "pfworkid";
    private static final String PING_FREQUENCY = "pf";
    private static final int PING_FREQUENCY_VALUE = 240;
    private static final String TAG = "PushProviders";
    private static final String inputFormat = "HH:mm";
    private final AnalyticsManager analyticsManager;
    private final BaseDatabaseManager baseDatabaseManager;
    private final CleverTapInstanceConfig config;
    private final Context context;
    private final CTWorkManager ctWorkManager;
    private CleverTapAPI.DevicePushTokenRefreshListener tokenRefreshListener;
    private final ValidationResultStack validationResultStack;
    private final ArrayList<PushType> allEnabledPushTypes = new ArrayList<>();
    private final ArrayList<CTPushProvider> availableCTPushProviders = new ArrayList<>();
    private final ArrayList<PushType> nonEnabledPushTypes = new ArrayList<>();
    private INotificationRenderer iNotificationRenderer = new CoreNotificationRenderer();
    private final Object tokenLock = new Object();
    private final Object pushRenderingLock = new Object();

    private PushProviders(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, BaseDatabaseManager baseDatabaseManager, ValidationResultStack validationResultStack, AnalyticsManager analyticsManager, CTWorkManager cTWorkManager) {
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.baseDatabaseManager = baseDatabaseManager;
        this.validationResultStack = validationResultStack;
        this.analyticsManager = analyticsManager;
        this.ctWorkManager = cTWorkManager;
        initPushAmp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean alreadyHaveToken(String str, PushType pushType) {
        boolean z2;
        if (!TextUtils.isEmpty(str) && pushType != null && str.equalsIgnoreCase(getCachedToken(pushType))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (pushType != null) {
            this.config.log(PushConstants.LOG_TAG, pushType + "Token Already available value: " + z2);
        }
        return z2;
    }

    private void configurePushTypes() {
        Iterator<PushType> it = this.config.getPushTypes().iterator();
        while (it.hasNext()) {
            PushType next = it.next();
            String messagingSDKClassName = next.getMessagingSDKClassName();
            try {
                Class.forName(messagingSDKClassName);
                this.allEnabledPushTypes.add(next);
                this.config.log(PushConstants.LOG_TAG, "SDK Class Available :" + messagingSDKClassName);
            } catch (Exception e) {
                CleverTapInstanceConfig cleverTapInstanceConfig = this.config;
                StringBuilder victor = c.victor("SDK class Not available ", messagingSDKClassName, " Exception:");
                victor.append(e.getClass().getName());
                cleverTapInstanceConfig.log(PushConstants.LOG_TAG, victor.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createOrResetWorker(boolean z2) {
        Set set;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            this.config.getLogger().debug(this.config.getAccountId(), "Pushamp feature is not supported below Oreo");
            return;
        }
        String string = StorageHelper.getString(this.context, PF_WORK_ID, "");
        int pingFrequency = getPingFrequency(this.context);
        if (string.equals("") && pingFrequency <= 0) {
            this.config.getLogger().debug(this.config.getAccountId(), "Pushamp - There is no running work and nothing to create");
            return;
        }
        if (pingFrequency <= 0) {
            this.config.getLogger().debug(this.config.getAccountId(), "Pushamp - Cancelling worker as pingFrequency <=0 ");
            stopWorker();
            return;
        }
        try {
            Context context = this.context;
            Intrinsics.echo(context, "context");
            w golf = w.golf(context);
            if (string.equals("") || z2) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                e eVar = new e(null);
                if (i4 >= 24) {
                    set = CollectionsKt.D(linkedHashSet);
                } else {
                    set = u.alpha;
                }
                d dVar = new d(eVar, 2, false, false, true, false, -1L, -1L, set);
                TimeUnit repeatIntervalTimeUnit = TimeUnit.MINUTES;
                Intrinsics.echo(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
                ab abVar = new ab(1, CTPushAmpWorker.class);
                ((p) abVar.charlie).echo(repeatIntervalTimeUnit.toMillis(pingFrequency), repeatIntervalTimeUnit.toMillis(5L));
                ((p) abVar.charlie).juliet = dVar;
                ah ahVar = (ah) abVar.bravo();
                if (string.equals("")) {
                    string = this.config.getAccountId();
                }
                golf.echo(string, 3, ahVar);
                StorageHelper.putString(this.context, PF_WORK_ID, string);
                this.config.getLogger().debug(this.config.getAccountId(), "Pushamp - Finished scheduling periodic work request - " + string + " with repeatInterval- " + pingFrequency + " minutes");
            }
        } catch (Exception e) {
            this.config.getLogger().debug(this.config.getAccountId(), "Pushamp - Failed scheduling/cancelling periodic work request" + e);
        }
    }

    private List<CTPushProvider> createProviders() {
        ArrayList arrayList = new ArrayList();
        Iterator<PushType> it = this.allEnabledPushTypes.iterator();
        while (it.hasNext()) {
            CTPushProvider cTPushProviderFromPushType = getCTPushProviderFromPushType(it.next());
            if (cTPushProviderFromPushType != null) {
                arrayList.add(cTPushProviderFromPushType);
            }
        }
        return arrayList;
    }

    private void deviceTokenDidRefresh(String str, PushType pushType) {
        if (this.tokenRefreshListener != null) {
            this.config.getLogger().debug(this.config.getAccountId(), "Notifying devicePushTokenDidRefresh: " + str);
            this.tokenRefreshListener.devicePushTokenDidRefresh(str, pushType);
        }
    }

    private void findAvailableCTPushProviders() {
        List<CTPushProvider> createProviders = createProviders();
        if (createProviders.isEmpty()) {
            this.config.log(PushConstants.LOG_TAG, "No push providers found!. Make sure to install at least one push provider");
            return;
        }
        for (CTPushProvider cTPushProvider : createProviders) {
            if (!isValid(cTPushProvider)) {
                this.config.log(PushConstants.LOG_TAG, "Invalid Provider: " + cTPushProvider.getClass());
            } else if (!cTPushProvider.isSupported()) {
                this.config.log(PushConstants.LOG_TAG, "Unsupported Provider: " + cTPushProvider.getClass());
            } else if (cTPushProvider.isAvailable()) {
                this.config.log(PushConstants.LOG_TAG, "Available Provider: " + cTPushProvider.getClass());
                this.availableCTPushProviders.add(cTPushProvider);
            } else {
                this.config.log(PushConstants.LOG_TAG, "Unavailable Provider: " + cTPushProvider.getClass());
            }
        }
    }

    private void findNonEnabledPushTypes() {
        this.nonEnabledPushTypes.addAll(this.allEnabledPushTypes);
        Iterator<CTPushProvider> it = this.availableCTPushProviders.iterator();
        while (it.hasNext()) {
            this.nonEnabledPushTypes.remove(it.next().getPushType());
        }
    }

    private CTPushProvider getCTPushProviderFromPushType(PushType pushType) {
        CTPushProvider cTPushProvider;
        String ctProviderClassName = pushType.getCtProviderClassName();
        CTPushProvider cTPushProvider2 = null;
        try {
            try {
                try {
                    cTPushProvider = (CTPushProvider) Class.forName(ctProviderClassName).getConstructor(CTPushProviderListener.class, Context.class, CleverTapInstanceConfig.class).newInstance(this, this.context, this.config);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException unused2) {
        } catch (InstantiationException unused3) {
        }
        try {
            this.config.log(PushConstants.LOG_TAG, "Found provider:" + ctProviderClassName);
            return cTPushProvider;
        } catch (ClassNotFoundException unused4) {
            cTPushProvider2 = cTPushProvider;
            this.config.log(PushConstants.LOG_TAG, "Unable to create provider ClassNotFoundException" + ctProviderClassName);
            return cTPushProvider2;
        } catch (IllegalAccessException unused5) {
            cTPushProvider2 = cTPushProvider;
            this.config.log(PushConstants.LOG_TAG, "Unable to create provider IllegalAccessException" + ctProviderClassName);
            return cTPushProvider2;
        } catch (InstantiationException unused6) {
            cTPushProvider2 = cTPushProvider;
            this.config.log(PushConstants.LOG_TAG, "Unable to create provider InstantiationException" + ctProviderClassName);
            return cTPushProvider2;
        } catch (Exception e5) {
            e = e5;
            cTPushProvider2 = cTPushProvider;
            CleverTapInstanceConfig cleverTapInstanceConfig = this.config;
            StringBuilder victor = c.victor("Unable to create provider ", ctProviderClassName, " Exception:");
            victor.append(e.getClass().getName());
            cleverTapInstanceConfig.log(PushConstants.LOG_TAG, victor.toString());
            return cTPushProvider2;
        }
    }

    private int getPingFrequency(Context context) {
        return StorageHelper.getInt(context, PING_FREQUENCY, PING_FREQUENCY_VALUE);
    }

    private void init() {
        configurePushTypes();
        CTExecutorFactory.executors(this.config).postAsyncSafelyTask(TAG).execute("asyncFindAvailableCTPushProviders", new g(7, this));
    }

    private void initPushAmp() {
        CTExecutorFactory.executors(this.config).postAsyncSafelyTask(TAG).execute("createOrResetWorker", new Callable<Void>() { // from class: com.clevertap.android.sdk.pushnotification.PushProviders.4
            @Override // java.util.concurrent.Callable
            public Void call() {
                PushProviders pushProviders = PushProviders.this;
                pushProviders.stopJobScheduler(pushProviders.context);
                if (!PushProviders.this.config.isBackgroundSync() || PushProviders.this.config.isAnalyticsOnly()) {
                    PushProviders.this.config.getLogger().debug(PushProviders.this.config.getAccountId(), "Pushamp - Cancelling worker as background sync is disabled or config is analytics only");
                    PushProviders.this.stopWorker();
                    return null;
                }
                PushProviders.this.createOrResetWorker(false);
                return null;
            }
        });
    }

    private boolean isTimeBetweenDNDTime(Date date, Date date2, Date date3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date3);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(date2);
        if (date2.compareTo(date) < 0) {
            if (calendar2.compareTo(calendar3) < 0) {
                calendar2.add(5, 1);
            }
            calendar3.add(5, 1);
        }
        if (calendar2.compareTo(calendar) >= 0 && calendar2.compareTo(calendar3) < 0) {
            return true;
        }
        return false;
    }

    private boolean isValid(CTPushProvider cTPushProvider) {
        if (70500 < cTPushProvider.minSDKSupportVersionCode()) {
            this.config.log(PushConstants.LOG_TAG, "Provider: %s version %s does not match the SDK version %s. Make sure all CleverTap dependencies are the same version.");
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$init$0() throws Exception {
        findAvailableCTPushProviders();
        findNonEnabledPushTypes();
        return null;
    }

    public static PushProviders load(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, BaseDatabaseManager baseDatabaseManager, ValidationResultStack validationResultStack, AnalyticsManager analyticsManager, ControllerManager controllerManager, CTWorkManager cTWorkManager) {
        PushProviders pushProviders = new PushProviders(context, cleverTapInstanceConfig, baseDatabaseManager, validationResultStack, analyticsManager, cTWorkManager);
        pushProviders.init();
        controllerManager.setPushProviders(pushProviders);
        return pushProviders;
    }

    private Date parseTimeToDate(String str, SimpleDateFormat simpleDateFormat) {
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException unused) {
            return new Date(0L);
        }
    }

    private void pushDeviceTokenEvent(String str, boolean z2, PushType pushType) {
        String str2;
        if (pushType != null) {
            if (TextUtils.isEmpty(str)) {
                str = getCachedToken(pushType);
            }
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.tokenLock) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        if (z2) {
                            str2 = "register";
                        } else {
                            str2 = "unregister";
                        }
                        try {
                            jSONObject2.put(Constants.KEY_ACTION, str2);
                            jSONObject2.put(Constants.KEY_ID, str);
                            jSONObject2.put(Constants.KEY_TYPE, pushType.getType());
                            jSONObject.put(Column.DATA, jSONObject2);
                            this.config.getLogger().verbose(this.config.getAccountId(), pushType + str2 + " device token " + str);
                            this.analyticsManager.sendDataEvent(jSONObject);
                        } catch (Throwable th) {
                            this.config.getLogger().verbose(this.config.getAccountId(), pushType + str2 + " device token failed", th);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    private void refreshAllTokens() {
        CTExecutorFactory.executors(this.config).postAsyncSafelyTask(TAG).execute("PushProviders#refreshAllTokens", new Callable<Void>() { // from class: com.clevertap.android.sdk.pushnotification.PushProviders.5
            @Override // java.util.concurrent.Callable
            public Void call() {
                PushProviders.this.refreshAvailableCTProviderTokens();
                PushProviders.this.refreshNonEnabledProviderTokens();
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshAvailableCTProviderTokens() {
        Iterator<CTPushProvider> it = this.availableCTPushProviders.iterator();
        while (it.hasNext()) {
            CTPushProvider next = it.next();
            try {
                next.requestToken();
            } catch (Throwable th) {
                this.config.log(PushConstants.LOG_TAG, "Token Refresh error " + next, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshNonEnabledProviderTokens() {
        Iterator<PushType> it = this.nonEnabledPushTypes.iterator();
        while (it.hasNext()) {
            PushType next = it.next();
            try {
                pushDeviceTokenEvent(getCachedToken(next), true, next);
            } catch (Throwable th) {
                this.config.log(PushConstants.LOG_TAG, "Token Refresh error " + next, th);
            }
        }
    }

    private void registerToken(String str, PushType pushType) {
        pushDeviceTokenEvent(str, true, pushType);
        cacheToken(str, pushType);
    }

    private void setPingFrequency(Context context, int i4) {
        StorageHelper.putInt(context, PING_FREQUENCY, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public void stopJobScheduler(Context context) {
        int i4 = StorageHelper.getInt(context, PF_JOB_ID, -1);
        if (i4 != -1) {
            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(i4);
            StorageHelper.remove(context, PF_JOB_ID);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopWorker() {
        String string = StorageHelper.getString(this.context, PF_WORK_ID, "");
        if (!string.equals("")) {
            try {
                Context context = this.context;
                Intrinsics.echo(context, "context");
                w.golf(context).delta(string);
                StorageHelper.putString(this.context, PF_WORK_ID, "");
                this.config.getLogger().debug(this.config.getAccountId(), "Pushamp - Successfully cancelled work");
            } catch (Exception unused) {
                this.config.getLogger().debug(this.config.getAccountId(), "Pushamp - Failure while cancelling work");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void triggerNotification(Context context, Bundle bundle, int i4) {
        boolean z2;
        String str;
        int appIconAsIntId;
        ?? r12;
        s sVar;
        String notificationIcon;
        NotificationChannel notificationChannel;
        String str2;
        int i5;
        int i10;
        int i11 = i4;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            this.config.getLogger().debug(this.config.getAccountId(), "Unable to render notification, Notification Manager is null.");
            return;
        }
        String string = bundle.getString(Constants.WZRK_CHANNEL_ID, "");
        if (Build.VERSION.SDK_INT >= 26) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!string.isEmpty()) {
                notificationChannel = notificationManager.getNotificationChannel(string);
                if (notificationChannel != null) {
                    str2 = "";
                    i5 = -1;
                    if (i5 != -1) {
                        ValidationResult create = ValidationResultFactory.create(512, i5, str2);
                        this.config.getLogger().debug(this.config.getAccountId(), create.getErrorDesc());
                        this.validationResultStack.pushValidationResult(create);
                    }
                    str = CTXtensions.getOrCreateChannel(notificationManager, string, context);
                    if (str == null && !str.trim().isEmpty()) {
                        if (!CTXtensions.isNotificationChannelEnabled(context, str)) {
                            this.config.getLogger().verbose(this.config.getAccountId(), "Not rendering push notification as channel = " + str + " is blocked by user");
                            return;
                        }
                        this.config.getLogger().debug(this.config.getAccountId(), "Rendering Push on channel = ".concat(str));
                    } else {
                        this.config.getLogger().debug(this.config.getAccountId(), "Not rendering Push since channel id is null or blank.");
                        return;
                    }
                } else {
                    i10 = 9;
                    str2 = string;
                }
            } else {
                str2 = bundle.toString();
                i10 = 8;
            }
            i5 = i10;
            if (i5 != -1) {
            }
            str = CTXtensions.getOrCreateChannel(notificationManager, string, context);
            if (str == null) {
            }
            this.config.getLogger().debug(this.config.getAccountId(), "Not rendering Push since channel id is null or blank.");
            return;
        }
        str = null;
        try {
            notificationIcon = ManifestInfo.getInstance(context).getNotificationIcon();
        } catch (Throwable unused) {
            appIconAsIntId = DeviceInfo.getAppIconAsIntId(context);
        }
        if (notificationIcon != null) {
            appIconAsIntId = context.getResources().getIdentifier(notificationIcon, "drawable", context.getPackageName());
            if (appIconAsIntId == 0) {
                throw new IllegalArgumentException();
            }
            this.iNotificationRenderer.setSmallIcon(appIconAsIntId, context);
            String string2 = bundle.getString(Constants.NOTIF_PRIORITY);
            if (string2 != null) {
                r12 = string2.equals(Constants.PRIORITY_HIGH);
                if (string2.equals(Constants.PRIORITY_MAX)) {
                    r12 = 2;
                }
            } else {
                r12 = 0;
            }
            if (i11 == -1000) {
                try {
                    Object collapseKey = this.iNotificationRenderer.getCollapseKey(bundle);
                    if (collapseKey != null) {
                        if (collapseKey instanceof Number) {
                            i11 = ((Number) collapseKey).intValue();
                        } else if (collapseKey instanceof String) {
                            try {
                                i11 = Integer.parseInt(collapseKey.toString());
                                this.config.getLogger().verbose(this.config.getAccountId(), "Converting collapse_key: " + collapseKey + " to notificationId int: " + i11);
                            } catch (NumberFormatException unused2) {
                                i11 = collapseKey.toString().hashCode();
                                this.config.getLogger().verbose(this.config.getAccountId(), "Converting collapse_key: " + collapseKey + " to notificationId int: " + i11);
                            }
                        }
                        i11 = Math.abs(i11);
                        this.config.getLogger().debug(this.config.getAccountId(), "Creating the notification id: " + i11 + " from collapse_key: " + collapseKey);
                    }
                } catch (NumberFormatException unused3) {
                }
            } else {
                this.config.getLogger().debug(this.config.getAccountId(), "Have user provided notificationId: " + i11 + " won't use collapse_key (if any) as basis for notificationId");
            }
            if (i11 == -1000) {
                i11 = (int) (Math.random() * 100.0d);
                this.config.getLogger().debug(this.config.getAccountId(), "Setting random notificationId: " + i11);
            }
            int i12 = i11;
            if (z2) {
                sVar = new s(context, str);
                String string3 = bundle.getString(Constants.WZRK_BADGE_ICON, null);
                if (string3 != null) {
                    try {
                        int parseInt = Integer.parseInt(string3);
                        if (parseInt >= 0) {
                            sVar.victor = parseInt;
                        }
                    } catch (Throwable unused4) {
                    }
                }
                String string4 = bundle.getString(Constants.WZRK_BADGE_COUNT, null);
                if (string4 != null) {
                    try {
                        int parseInt2 = Integer.parseInt(string4);
                        if (parseInt2 >= 0) {
                            sVar.india = parseInt2;
                        }
                    } catch (Throwable unused5) {
                    }
                }
            } else {
                sVar = new s(context, null);
            }
            sVar.juliet = r12;
            INotificationRenderer iNotificationRenderer = this.iNotificationRenderer;
            if (iNotificationRenderer instanceof AudibleNotification) {
                sVar = ((AudibleNotification) iNotificationRenderer).setSound(context, bundle, sVar, this.config);
            }
            s renderNotification = this.iNotificationRenderer.renderNotification(bundle, context, sVar, this.config, i12);
            if (renderNotification != null) {
                Notification alpha = renderNotification.alpha();
                notificationManager.notify(i12, alpha);
                this.config.getLogger().debug(this.config.getAccountId(), "Rendered notification: " + alpha.toString());
                String string5 = bundle.getString(Constants.EXTRAS_FROM);
                if (string5 == null || !string5.equals("PTReceiver")) {
                    String string6 = bundle.getString("wzrk_ttl", ((System.currentTimeMillis() + Constants.DEFAULT_PUSH_TTL) / 1000) + "");
                    long parseLong = Long.parseLong(string6);
                    String string7 = bundle.getString(Constants.WZRK_PUSH_ID);
                    DBAdapter loadDBAdapter = this.baseDatabaseManager.loadDBAdapter(context);
                    this.config.getLogger().verbose("Storing Push Notification..." + string7 + " - with ttl - " + string6);
                    loadDBAdapter.storePushNotificationId(string7, parseLong);
                    if (!"true".equals(bundle.getString(Constants.WZRK_RNV, ""))) {
                        ValidationResult create2 = ValidationResultFactory.create(512, 10, bundle.toString());
                        this.config.getLogger().debug(create2.getErrorDesc());
                        this.validationResultStack.pushValidationResult(create2);
                        return;
                    }
                    long j5 = bundle.getLong(Constants.OMR_INVOKE_TIME_IN_MILLIS, -1L);
                    if (j5 >= 0) {
                        long currentTimeMillis = System.currentTimeMillis() - j5;
                        this.config.getLogger().verbose("Rendered Push Notification in " + currentTimeMillis + " millis");
                    }
                    this.ctWorkManager.init();
                    this.analyticsManager.pushNotificationViewedEvent(bundle);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void _createNotification(Context context, Bundle bundle, int i4) {
        if (bundle != null && bundle.get("wzrk_pn") != null) {
            if (this.config.isAnalyticsOnly()) {
                this.config.getLogger().debug(this.config.getAccountId(), "Instance is set for Analytics only, cannot create notification");
                return;
            }
            try {
                if (bundle.getString(Constants.WZRK_PUSH_SILENT, "").equalsIgnoreCase("true")) {
                    this.analyticsManager.pushNotificationViewedEvent(bundle);
                    return;
                }
                String string = bundle.getString(Constants.EXTRAS_FROM);
                if (string == null || !string.equals("PTReceiver")) {
                    this.config.getLogger().debug(this.config.getAccountId(), "Handling notification: " + bundle);
                    if (bundle.getString(Constants.WZRK_PUSH_ID) != null && this.baseDatabaseManager.loadDBAdapter(context).doesPushNotificationIdExist(bundle.getString(Constants.WZRK_PUSH_ID))) {
                        this.config.getLogger().debug(this.config.getAccountId(), "Push Notification already rendered, not showing again");
                        return;
                    }
                    String message = this.iNotificationRenderer.getMessage(bundle);
                    if (message == null) {
                        message = "";
                    }
                    if (message.isEmpty()) {
                        this.config.getLogger().verbose(this.config.getAccountId(), "Push notification message is empty, not rendering");
                        this.baseDatabaseManager.loadDBAdapter(context).storeUninstallTimestamp();
                        String string2 = bundle.getString(PING_FREQUENCY, "");
                        if (!TextUtils.isEmpty(string2)) {
                            updatePingFrequencyIfNeeded(context, Integer.parseInt(string2));
                            return;
                        }
                        return;
                    }
                }
                if (this.iNotificationRenderer.getTitle(bundle, context).isEmpty()) {
                    String str = context.getApplicationInfo().name;
                }
                triggerNotification(context, bundle, i4);
            } catch (Throwable th) {
                this.config.getLogger().debug(this.config.getAccountId(), "Couldn't render notification: ", th);
            }
        }
    }

    public void addPushService(PushType pushType) {
        this.allEnabledPushTypes.add(pushType);
    }

    public void cacheToken(final String str, final PushType pushType) {
        if (!TextUtils.isEmpty(str) && pushType != null) {
            try {
                CTExecutorFactory.executors(this.config).ioTask().execute("PushProviders#cacheToken", new Callable<Void>() { // from class: com.clevertap.android.sdk.pushnotification.PushProviders.1
                    @Override // java.util.concurrent.Callable
                    public Void call() {
                        if (PushProviders.this.alreadyHaveToken(str, pushType)) {
                            return null;
                        }
                        String tokenPrefKey = pushType.getTokenPrefKey();
                        if (TextUtils.isEmpty(tokenPrefKey)) {
                            return null;
                        }
                        StorageHelper.putStringImmediate(PushProviders.this.context, StorageHelper.storageKeyWithSuffix(PushProviders.this.config, tokenPrefKey), str);
                        PushProviders.this.config.log(PushConstants.LOG_TAG, pushType + "Cached New Token successfully " + str);
                        return null;
                    }
                });
            } catch (Throwable th) {
                this.config.log(PushConstants.LOG_TAG, pushType + "Unable to cache token " + str, th);
            }
        }
    }

    public void doTokenRefresh(String str, PushType pushType) {
        if (!TextUtils.isEmpty(str) && pushType != null) {
            handleToken(str, pushType, true);
        }
    }

    public void forcePushDeviceToken(boolean z2) {
        Iterator<PushType> it = this.allEnabledPushTypes.iterator();
        while (it.hasNext()) {
            pushDeviceTokenEvent(null, z2, it.next());
        }
    }

    public ArrayList<PushType> getAvailablePushTypes() {
        ArrayList<PushType> arrayList = new ArrayList<>();
        Iterator<CTPushProvider> it = this.availableCTPushProviders.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPushType());
        }
        return arrayList;
    }

    public String getCachedToken(PushType pushType) {
        if (pushType != null) {
            String tokenPrefKey = pushType.getTokenPrefKey();
            if (!TextUtils.isEmpty(tokenPrefKey)) {
                String stringFromPrefs = StorageHelper.getStringFromPrefs(this.context, this.config, tokenPrefKey, null);
                this.config.log(PushConstants.LOG_TAG, pushType + "getting Cached Token - " + stringFromPrefs);
                return stringFromPrefs;
            }
        }
        if (pushType != null) {
            this.config.log(PushConstants.LOG_TAG, pushType + " Unable to find cached Token for type ");
        }
        return null;
    }

    public CleverTapAPI.DevicePushTokenRefreshListener getDevicePushTokenRefreshListener() {
        return this.tokenRefreshListener;
    }

    public INotificationRenderer getPushNotificationRenderer() {
        return this.iNotificationRenderer;
    }

    public Object getPushRenderingLock() {
        return this.pushRenderingLock;
    }

    public void handleToken(String str, PushType pushType, boolean z2) {
        if (z2) {
            registerToken(str, pushType);
        } else {
            unregisterToken(str, pushType);
        }
    }

    public boolean isNotificationSupported() {
        Iterator<PushType> it = getAvailablePushTypes().iterator();
        while (it.hasNext()) {
            if (getCachedToken(it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.clevertap.android.sdk.pushnotification.CTPushProviderListener
    public void onNewToken(String str, PushType pushType) {
        if (!TextUtils.isEmpty(str)) {
            doTokenRefresh(str, pushType);
            deviceTokenDidRefresh(str, pushType);
        }
    }

    public void onTokenRefresh() {
        refreshAllTokens();
    }

    public void processCustomPushNotification(final Bundle bundle) {
        CTExecutorFactory.executors(this.config).postAsyncSafelyTask().execute("customHandlePushAmplification", new Callable<Void>() { // from class: com.clevertap.android.sdk.pushnotification.PushProviders.2
            @Override // java.util.concurrent.Callable
            public Void call() {
                String string = bundle.getString(Constants.NOTIF_MSG);
                if (string == null) {
                    string = "";
                }
                if (string.isEmpty()) {
                    PushProviders.this.config.getLogger().verbose(PushProviders.this.config.getAccountId(), "Push notification message is empty, not rendering");
                    PushProviders.this.baseDatabaseManager.loadDBAdapter(PushProviders.this.context).storeUninstallTimestamp();
                    String string2 = bundle.getString(PushProviders.PING_FREQUENCY, "");
                    if (TextUtils.isEmpty(string2)) {
                        return null;
                    }
                    PushProviders pushProviders = PushProviders.this;
                    pushProviders.updatePingFrequencyIfNeeded(pushProviders.context, Integer.parseInt(string2));
                    return null;
                }
                String string3 = bundle.getString(Constants.WZRK_PUSH_ID);
                String string4 = bundle.getString("wzrk_ttl", ((System.currentTimeMillis() + Constants.DEFAULT_PUSH_TTL) / 1000) + "");
                long parseLong = Long.parseLong(string4);
                DBAdapter loadDBAdapter = PushProviders.this.baseDatabaseManager.loadDBAdapter(PushProviders.this.context);
                PushProviders.this.config.getLogger().verbose("Storing Push Notification..." + string3 + " - with ttl - " + string4);
                loadDBAdapter.storePushNotificationId(string3, parseLong);
                return null;
            }
        });
    }

    public void runPushAmpWork(Context context) {
        Logger.v(this.config.getAccountId(), "Pushamp - Running work request");
        if (!isNotificationSupported()) {
            Logger.v(this.config.getAccountId(), "Pushamp - Token is not present, not running the work request");
            return;
        }
        Calendar calendar = Calendar.getInstance();
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(inputFormat, Locale.US);
        if (isTimeBetweenDNDTime(parseTimeToDate(Constants.DND_START, simpleDateFormat), parseTimeToDate(Constants.DND_STOP, simpleDateFormat), parseTimeToDate(i4 + ":" + i5, simpleDateFormat))) {
            Logger.v(this.config.getAccountId(), "Pushamp won't run in default DND hours");
            return;
        }
        long lastUninstallTimestamp = this.baseDatabaseManager.loadDBAdapter(context).getLastUninstallTimestamp();
        if (lastUninstallTimestamp == 0 || lastUninstallTimestamp > System.currentTimeMillis() - Constants.ONE_DAY_IN_MILLIS) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bk", 1);
                this.analyticsManager.sendPingEvent(jSONObject);
                Logger.v(this.config.getAccountId(), "Pushamp - Successfully completed work request");
            } catch (JSONException unused) {
                Logger.v("Pushamp - Unable to complete work request");
            }
        }
    }

    public void setDevicePushTokenRefreshListener(CleverTapAPI.DevicePushTokenRefreshListener devicePushTokenRefreshListener) {
        this.tokenRefreshListener = devicePushTokenRefreshListener;
    }

    public void setPushNotificationRenderer(INotificationRenderer iNotificationRenderer) {
        this.iNotificationRenderer = iNotificationRenderer;
    }

    public void unregisterToken(String str, PushType pushType) {
        pushDeviceTokenEvent(str, false, pushType);
    }

    public void updatePingFrequencyIfNeeded(Context context, int i4) {
        this.config.getLogger().verbose("Ping frequency received - " + i4);
        this.config.getLogger().verbose("Stored Ping Frequency - " + getPingFrequency(context));
        if (i4 != getPingFrequency(context)) {
            setPingFrequency(context, i4);
            if (this.config.isBackgroundSync() && !this.config.isAnalyticsOnly()) {
                CTExecutorFactory.executors(this.config).postAsyncSafelyTask(TAG).execute("createOrResetWorker", new Callable<Void>() { // from class: com.clevertap.android.sdk.pushnotification.PushProviders.3
                    @Override // java.util.concurrent.Callable
                    public Void call() {
                        PushProviders.this.createOrResetWorker(true);
                        return null;
                    }
                });
            }
        }
    }
}
