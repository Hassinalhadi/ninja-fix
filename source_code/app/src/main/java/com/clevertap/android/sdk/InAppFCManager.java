package com.clevertap.android.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import ao.ad;
import bz.h0;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.ImpressionManager;
import com.clevertap.android.sdk.inapp.SharedPreferencesMigration;
import com.clevertap.android.sdk.inapp.store.preference.InAppStore;
import com.clevertap.android.sdk.inapp.store.preference.LegacyInAppStore;
import com.clevertap.android.sdk.inapp.store.preference.StoreRegistry;
import com.clevertap.android.sdk.task.CTExecutors;
import com.clevertap.android.sdk.utils.Clock;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class InAppFCManager {
    private final Clock clock;
    private final CleverTapInstanceConfig config;
    private final Context context;
    private final SimpleDateFormat ddMMyyyy = new SimpleDateFormat("ddMMyyyy", Locale.US);
    private String deviceId;
    private final CTExecutors executors;
    private final ImpressionManager impressionManager;
    private final StoreRegistry storeRegistry;

    public InAppFCManager(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, StoreRegistry storeRegistry, ImpressionManager impressionManager, CTExecutors cTExecutors, Clock clock) {
        this.config = cleverTapInstanceConfig;
        this.context = context;
        this.deviceId = str;
        this.storeRegistry = storeRegistry;
        this.impressionManager = impressionManager;
        this.executors = cTExecutors;
        this.clock = clock;
        cTExecutors.postAsyncSafelyTask().execute("initInAppFCManager", new c(6, this, str));
    }

    public static /* synthetic */ Void alpha(InAppFCManager inAppFCManager, String str, Context context) {
        return inAppFCManager.lambda$didShow$1(str, context);
    }

    public static /* synthetic */ Boolean bravo(String str) {
        return lambda$migrateToNewPrefsKey$2(str);
    }

    private String getConfigAccountId() {
        return this.config.getAccountId();
    }

    private Logger getConfigLogger() {
        return this.config.getLogger();
    }

    private int[] getInAppCountsFromPersistentStore(String str) {
        String string = StorageHelper.getPreferences(this.context, storageKeyWithSuffix(getKeyWithDeviceId(Constants.KEY_COUNTS_PER_INAPP, this.deviceId))).getString(str, null);
        if (string == null) {
            return new int[]{0, 0};
        }
        try {
            String[] split = string.split(Constants.SEPARATOR_COMMA);
            if (split.length != 2) {
                return new int[]{0, 0};
            }
            return new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1])};
        } catch (Throwable unused) {
            return new int[]{0, 0};
        }
    }

    private int getIntFromPrefs(String str, int i4) {
        if (this.config.isDefaultInstance()) {
            int i5 = StorageHelper.getInt(this.context, storageKeyWithSuffix(str), Constants.EMPTY_NOTIFICATION_ID);
            if (i5 != -1000) {
                return i5;
            }
            return StorageHelper.getInt(this.context, str, i4);
        }
        return StorageHelper.getInt(this.context, storageKeyWithSuffix(str), i4);
    }

    private String getKeyWithDeviceId(String str, String str2) {
        return ad.amber(str, ":", str2);
    }

    private String getStringFromPrefs(String str, String str2) {
        if (this.config.isDefaultInstance()) {
            String string = StorageHelper.getString(this.context, storageKeyWithSuffix(str), str2);
            if (string != null) {
                return string;
            }
            return StorageHelper.getString(this.context, str, str2);
        }
        return StorageHelper.getString(this.context, storageKeyWithSuffix(str), str2);
    }

    private boolean hasDailyCapacityMaxedOut(CTInAppNotification cTInAppNotification) {
        String inAppID = getInAppID(cTInAppNotification);
        if (inAppID == null) {
            return false;
        }
        if (getIntFromPrefs(getKeyWithDeviceId(Constants.KEY_COUNTS_SHOWN_TODAY, this.deviceId), 0) >= getIntFromPrefs(getKeyWithDeviceId(Constants.KEY_MAX_PER_DAY, this.deviceId), 1)) {
            return true;
        }
        try {
            int totalDailyCount = cTInAppNotification.getTotalDailyCount();
            if (totalDailyCount == -1) {
                return false;
            }
            if (getInAppCountsFromPersistentStore(inAppID)[0] < totalDailyCount) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    private boolean hasLifetimeCapacityMaxedOut(CTInAppNotification cTInAppNotification) {
        String inAppID = getInAppID(cTInAppNotification);
        if (inAppID == null || cTInAppNotification.getTotalLifetimeCount() == -1) {
            return false;
        }
        try {
            if (getInAppCountsFromPersistentStore(inAppID)[1] < cTInAppNotification.getTotalLifetimeCount()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    private boolean hasSessionCapacityMaxedOut(CTInAppNotification cTInAppNotification) {
        int i4;
        String inAppID = getInAppID(cTInAppNotification);
        if (inAppID == null) {
            return false;
        }
        try {
            if (cTInAppNotification.getMaxPerSession() >= 0) {
                i4 = cTInAppNotification.getMaxPerSession();
            } else {
                i4 = 1000;
            }
            if (this.impressionManager.perSession(inAppID) >= i4) {
                return true;
            }
            if (this.impressionManager.getSessionImpressionsTotal() < getIntFromPrefs(getKeyWithDeviceId(Constants.INAPP_MAX_PER_SESSION_KEY, this.deviceId), 1)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    private void incrementInAppCountsInPersistentStore(String str) {
        int[] inAppCountsFromPersistentStore = getInAppCountsFromPersistentStore(str);
        inAppCountsFromPersistentStore[0] = inAppCountsFromPersistentStore[0] + 1;
        inAppCountsFromPersistentStore[1] = inAppCountsFromPersistentStore[1] + 1;
        SharedPreferences.Editor edit = StorageHelper.getPreferences(this.context, storageKeyWithSuffix(getKeyWithDeviceId(Constants.KEY_COUNTS_PER_INAPP, this.deviceId))).edit();
        edit.putString(str, inAppCountsFromPersistentStore[0] + Constants.SEPARATOR_COMMA + inAppCountsFromPersistentStore[1]);
        StorageHelper.persist(edit);
    }

    private void init(String str) {
        getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "InAppFCManager init() called");
        try {
            migrateToNewPrefsKey(str);
            String format = this.ddMMyyyy.format(this.clock.newDate());
            if (!format.equals(getStringFromPrefs(getKeyWithDeviceId("ict_date", str), "20140428"))) {
                StorageHelper.putString(this.context, storageKeyWithSuffix(getKeyWithDeviceId("ict_date", str)), format);
                StorageHelper.putInt(this.context, storageKeyWithSuffix(getKeyWithDeviceId(Constants.KEY_COUNTS_SHOWN_TODAY, str)), 0);
                SharedPreferences preferences = StorageHelper.getPreferences(this.context, storageKeyWithSuffix(getKeyWithDeviceId(Constants.KEY_COUNTS_PER_INAPP, str)));
                SharedPreferences.Editor edit = preferences.edit();
                Map<String, ?> all = preferences.getAll();
                for (String str2 : all.keySet()) {
                    Object obj = all.get(str2);
                    if (!(obj instanceof String)) {
                        edit.remove(str2);
                    } else {
                        String[] split = ((String) obj).split(Constants.SEPARATOR_COMMA);
                        if (split.length != 2) {
                            edit.remove(str2);
                        } else {
                            try {
                                edit.putString(str2, "0," + split[1]);
                            } catch (Throwable th) {
                                getConfigLogger().verbose(getConfigAccountId(), "Failed to reset todayCount for inapp " + str2, th);
                            }
                        }
                    }
                }
                StorageHelper.persist(edit);
            }
        } catch (Exception e) {
            getConfigLogger().verbose(getConfigAccountId(), "Failed to init inapp manager " + e.getLocalizedMessage());
        }
    }

    public /* synthetic */ Void lambda$didShow$1(String str, Context context) throws Exception {
        this.impressionManager.recordImpression(str);
        incrementInAppCountsInPersistentStore(str);
        StorageHelper.putInt(context, storageKeyWithSuffix(getKeyWithDeviceId(Constants.KEY_COUNTS_SHOWN_TODAY, this.deviceId)), getIntFromPrefs(getKeyWithDeviceId(Constants.KEY_COUNTS_SHOWN_TODAY, this.deviceId), 0) + 1);
        return null;
    }

    public static /* synthetic */ Boolean lambda$migrateToNewPrefsKey$2(String str) {
        boolean z2;
        if (str.split(Constants.SEPARATOR_COMMA).length == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public /* synthetic */ Void lambda$new$0(String str) throws Exception {
        init(str);
        return null;
    }

    private void migrateToNewPrefsKey(String str) {
        SharedPreferences preferences = StorageHelper.getPreferences(this.context, Constants.KEY_COUNTS_PER_INAPP);
        SharedPreferences preferences2 = StorageHelper.getPreferences(this.context, getKeyWithDeviceId(Constants.KEY_COUNTS_PER_INAPP, str));
        SharedPreferences preferences3 = StorageHelper.getPreferences(this.context, storageKeyWithSuffix(getKeyWithDeviceId(Constants.KEY_COUNTS_PER_INAPP, str)));
        h0 h0Var = new h0(19);
        if (CTXtensions.hasData(preferences2)) {
            Logger.d("migrating shared preference countsPerInApp from V2 to V3...");
            new SharedPreferencesMigration(preferences2, preferences3, String.class, h0Var).migrate();
            Logger.d("Finished migrating shared preference countsPerInApp from V2 to V3.");
        } else if (CTXtensions.hasData(preferences)) {
            Logger.d("migrating shared preference countsPerInApp from V1 to V3...");
            new SharedPreferencesMigration(preferences, preferences3, String.class, h0Var).migrate();
            Logger.d("Finished migrating shared preference countsPerInApp from V1 to V3.");
        }
        InAppStore inAppStore = this.storeRegistry.getInAppStore();
        LegacyInAppStore legacyInAppStore = this.storeRegistry.getLegacyInAppStore();
        if (inAppStore != null && legacyInAppStore != null) {
            JSONArray readInApps = legacyInAppStore.readInApps();
            if (readInApps.length() > 0) {
                Logger.d("migrating in-apps from account id to device id based preference.");
                inAppStore.storeServerSideInApps(readInApps);
                legacyInAppStore.removeInApps();
                Logger.d("Finished migrating in-apps from account id to device id based preference.");
            }
        }
        if (getStringFromPrefs(getKeyWithDeviceId("ict_date", str), null) == null && getStringFromPrefs("ict_date", null) != null) {
            Logger.v("Migrating InAppFC Prefs");
            StorageHelper.putString(this.context, storageKeyWithSuffix(getKeyWithDeviceId("ict_date", str)), getStringFromPrefs("ict_date", "20140428"));
            StorageHelper.putInt(this.context, storageKeyWithSuffix(getKeyWithDeviceId(Constants.KEY_COUNTS_SHOWN_TODAY, str)), getIntFromPrefs(storageKeyWithSuffix(Constants.KEY_COUNTS_SHOWN_TODAY), 0));
        }
    }

    private String storageKeyWithSuffix(String str) {
        StringBuilder beige = ad.beige(str, ":");
        beige.append(getConfigAccountId());
        return beige.toString();
    }

    public boolean canShow(CTInAppNotification cTInAppNotification, Xd.l lVar) {
        String inAppID;
        if (cTInAppNotification == null) {
            return false;
        }
        try {
            inAppID = getInAppID(cTInAppNotification);
        } catch (Throwable unused) {
        }
        if (inAppID == null) {
            return true;
        }
        if (((Boolean) lVar.invoke(cTInAppNotification.getJsonDescription(), inAppID)).booleanValue()) {
            return false;
        }
        if (cTInAppNotification.getIsExcludeFromCaps()) {
            return true;
        }
        if (!hasSessionCapacityMaxedOut(cTInAppNotification) && !hasLifetimeCapacityMaxedOut(cTInAppNotification)) {
            if (!hasDailyCapacityMaxedOut(cTInAppNotification)) {
                return true;
            }
        }
        return false;
    }

    public void changeUser(String str) {
        this.impressionManager.clearSessionData();
        this.deviceId = str;
        init(str);
    }

    public void didShow(Context context, CTInAppNotification cTInAppNotification) {
        String inAppID = getInAppID(cTInAppNotification);
        if (inAppID == null) {
            return;
        }
        this.executors.ioTask().execute("recordInAppImpressionsAndCounts", new B2.e((Object) this, inAppID, (Object) context, 4));
    }

    public String getInAppID(CTInAppNotification cTInAppNotification) {
        if (cTInAppNotification.getId() != null && !cTInAppNotification.getId().isEmpty()) {
            try {
                return cTInAppNotification.getId();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public JSONArray getInAppsCount(Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, ?> entry : StorageHelper.getPreferences(context, storageKeyWithSuffix(getKeyWithDeviceId(Constants.KEY_COUNTS_PER_INAPP, this.deviceId))).getAll().entrySet()) {
                if (entry.getValue() instanceof String) {
                    String[] split = ((String) entry.getValue()).split(Constants.SEPARATOR_COMMA);
                    if (split.length == 2) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(0, entry.getKey());
                        jSONArray2.put(1, Integer.parseInt(split[0]));
                        jSONArray2.put(2, Integer.parseInt(split[1]));
                        jSONArray.put(jSONArray2);
                    }
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            Logger.v("Failed to get in apps count", th);
            return null;
        }
    }

    public int getShownTodayCount() {
        return getIntFromPrefs(getKeyWithDeviceId(Constants.KEY_COUNTS_SHOWN_TODAY, this.deviceId), 0);
    }

    public void processResponse(Context context, JSONObject jSONObject) {
        try {
            if (jSONObject.has(Constants.INAPP_NOTIFS_STALE_KEY)) {
                JSONArray jSONArray = jSONObject.getJSONArray(Constants.INAPP_NOTIFS_STALE_KEY);
                SharedPreferences.Editor edit = StorageHelper.getPreferences(context, storageKeyWithSuffix(getKeyWithDeviceId(Constants.KEY_COUNTS_PER_INAPP, this.deviceId))).edit();
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    Object obj = jSONArray.get(i4);
                    if (obj instanceof Integer) {
                        edit.remove("" + obj);
                        Logger.d("Purged stale in-app - " + obj);
                    } else if (obj instanceof String) {
                        edit.remove((String) obj);
                        Logger.d("Purged stale in-app - " + obj);
                    }
                }
                StorageHelper.persist(edit);
            }
        } catch (Throwable th) {
            Logger.v("Failed to purge out stale targets", th);
        }
    }

    public synchronized void updateLimits(Context context, int i4, int i5) {
        StorageHelper.putInt(context, storageKeyWithSuffix(getKeyWithDeviceId(Constants.KEY_MAX_PER_DAY, this.deviceId)), i4);
        StorageHelper.putInt(context, storageKeyWithSuffix(getKeyWithDeviceId(Constants.INAPP_MAX_PER_SESSION_KEY, this.deviceId)), i5);
    }
}
