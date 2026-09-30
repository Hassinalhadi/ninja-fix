package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import ao.ad;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.db.BaseDatabaseManager;
import com.clevertap.android.sdk.db.DBAdapter;
import com.clevertap.android.sdk.events.EventDetail;
import com.clevertap.android.sdk.usereventlogs.UserEventLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class LocalDataStore {
    private static long EXECUTOR_THREAD_ID;
    private final BaseDatabaseManager baseDatabaseManager;
    private final CleverTapInstanceConfig config;
    private final Context context;
    private final CryptHandler cryptHandler;
    private final DeviceInfo deviceInfo;
    private final HashMap<String, Object> PROFILE_FIELDS_IN_THIS_SESSION = new HashMap<>();
    private final String eventNamespace = "local_events";
    private final Set<String> userNormalizedEventLogKeys = Collections.synchronizedSet(new HashSet());
    private final Map<String, String> normalizedEventNames = new HashMap();
    private final ExecutorService es = Executors.newFixedThreadPool(1);

    public LocalDataStore(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, CryptHandler cryptHandler, DeviceInfo deviceInfo, BaseDatabaseManager baseDatabaseManager) {
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.cryptHandler = cryptHandler;
        this.deviceInfo = deviceInfo;
        this.baseDatabaseManager = baseDatabaseManager;
    }

    private void _removeProfileField(String str) {
        synchronized (this.PROFILE_FIELDS_IN_THIS_SESSION) {
            try {
                this.PROFILE_FIELDS_IN_THIS_SESSION.remove(str);
            } finally {
            }
        }
    }

    private void _setProfileField(String str, Object obj) {
        if (obj != null) {
            try {
                synchronized (this.PROFILE_FIELDS_IN_THIS_SESSION) {
                    this.PROFILE_FIELDS_IN_THIS_SESSION.put(str, obj);
                }
            } catch (Throwable th) {
                getConfigLogger().verbose(getConfigAccountId(), "Failed to set local profile value for key " + str, th);
            }
        }
    }

    private List<UserEventLog> allEventsByDeviceID(String str) {
        return this.baseDatabaseManager.loadDBAdapter(this.context).userEventLogDAO().allEventsByDeviceID(str);
    }

    @Deprecated(since = "7.1.0")
    private EventDetail decodeEventDetails(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        String[] split = str2.split("\\|");
        return new EventDetail(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), str);
    }

    @Deprecated(since = "7.1.0")
    private String encodeEventDetails(int i4, int i5, int i10) {
        return i10 + "|" + i4 + "|" + i5;
    }

    private boolean eventExistsByDeviceIdAndNormalizedEventName(String str, String str2) {
        boolean eventExistsByDeviceIdAndNormalizedEventName = this.baseDatabaseManager.loadDBAdapter(this.context).userEventLogDAO().eventExistsByDeviceIdAndNormalizedEventName(str, str2);
        getConfigLogger().verbose("eventExists = " + eventExistsByDeviceIdAndNormalizedEventName);
        return eventExistsByDeviceIdAndNormalizedEventName;
    }

    private boolean eventExistsByDeviceIdAndNormalizedEventNameAndCount(String str, String str2, int i4) {
        boolean eventExistsByDeviceIdAndNormalizedEventNameAndCount = this.baseDatabaseManager.loadDBAdapter(this.context).userEventLogDAO().eventExistsByDeviceIdAndNormalizedEventNameAndCount(str, str2, i4);
        getConfigLogger().verbose("eventExistsByDeviceIDAndCount = " + eventExistsByDeviceIdAndNormalizedEventNameAndCount);
        return eventExistsByDeviceIdAndNormalizedEventNameAndCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getConfigAccountId() {
        return this.config.getAccountId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Logger getConfigLogger() {
        return this.config.getLogger();
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

    private int getLocalCacheExpiryInterval(int i4) {
        return getIntFromPrefs("local_cache_expires_in", i4);
    }

    private String getOrPutNormalizedEventName(String str) {
        Map<String, String> map = this.normalizedEventNames;
        Intrinsics.echo(map, "<this>");
        String str2 = map.get(str);
        if (str2 == null) {
            str2 = Utils.getNormalizedName(str);
            map.put(str, str2);
        }
        return str2;
    }

    @Deprecated(since = "7.1.0")
    private String getStringFromPrefs(String str, String str2, String str3) {
        if (this.config.isDefaultInstance()) {
            String string = StorageHelper.getString(this.context, str3, storageKeyWithSuffix(str), str2);
            if (string != null) {
                return string;
            }
            return StorageHelper.getString(this.context, str3, str, str2);
        }
        return StorageHelper.getString(this.context, str3, storageKeyWithSuffix(str), str2);
    }

    private String getUserProfileID() {
        return this.config.getAccountId();
    }

    private long insertEvent(String str, String str2, String str3) {
        long insertEvent = this.baseDatabaseManager.loadDBAdapter(this.context).userEventLogDAO().insertEvent(str, str2, str3);
        getConfigLogger().verbose("inserted rowId = " + insertEvent);
        return insertEvent;
    }

    private boolean isPersonalisationEnabled() {
        return this.config.isPersonalizationEnabled();
    }

    private /* synthetic */ Pair lambda$persistUserEventLogsInBulk$0(String str) {
        return new Pair(str, getOrPutNormalizedEventName(str));
    }

    private void persistLocalProfileAsync() {
        final String accountId = this.config.getAccountId();
        postAsyncSafely("LocalDataStore#persistLocalProfileAsync", new Runnable() { // from class: com.clevertap.android.sdk.LocalDataStore.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (LocalDataStore.this.PROFILE_FIELDS_IN_THIS_SESSION) {
                    try {
                        HashMap hashMap = new HashMap(LocalDataStore.this.PROFILE_FIELDS_IN_THIS_SESSION);
                        Iterator<String> it = Constants.piiDBKeys.iterator();
                        boolean z2 = true;
                        while (it.hasNext()) {
                            String next = it.next();
                            if (hashMap.get(next) != null) {
                                Object obj = hashMap.get(next);
                                if (obj instanceof String) {
                                    String encrypt = LocalDataStore.this.cryptHandler.encrypt((String) obj, next, CryptHandler.EncryptionAlgorithm.AES_GCM);
                                    if (encrypt == null) {
                                        z2 = false;
                                    } else {
                                        hashMap.put(next, encrypt);
                                    }
                                }
                            }
                        }
                        JSONObject jSONObject = new JSONObject(hashMap);
                        if (!z2) {
                            LocalDataStore.this.cryptHandler.updateMigrationFailureCount(false);
                        }
                        long storeUserProfile = LocalDataStore.this.baseDatabaseManager.loadDBAdapter(LocalDataStore.this.context).storeUserProfile(accountId, LocalDataStore.this.deviceInfo.getDeviceID(), jSONObject);
                        LocalDataStore.this.getConfigLogger().verbose(LocalDataStore.this.getConfigAccountId(), "Persist Local Profile complete with status " + storeUserProfile + " for id " + accountId);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    private void postAsyncSafely(final String str, final Runnable runnable) {
        try {
            if (Thread.currentThread().getId() == EXECUTOR_THREAD_ID) {
                runnable.run();
            } else {
                this.es.submit(new Runnable() { // from class: com.clevertap.android.sdk.LocalDataStore.3
                    @Override // java.lang.Runnable
                    public void run() {
                        long unused = LocalDataStore.EXECUTOR_THREAD_ID = Thread.currentThread().getId();
                        try {
                            LocalDataStore.this.getConfigLogger().verbose(LocalDataStore.this.getConfigAccountId(), "Local Data Store Executor service: Starting task - " + str);
                            runnable.run();
                        } catch (Throwable th) {
                            LocalDataStore.this.getConfigLogger().verbose(LocalDataStore.this.getConfigAccountId(), "Executor service: Failed to complete the scheduled task", th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            getConfigLogger().verbose(getConfigAccountId(), "Failed to submit task to the executor service", th);
        }
    }

    private boolean profileValueIsEmpty(Object obj) {
        boolean z2;
        if (obj == null) {
            return true;
        }
        if ((obj instanceof String) && ((String) obj).trim().length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (obj instanceof JSONArray) {
            if (((JSONArray) obj).length() <= 0) {
                return true;
            }
            return false;
        }
        return z2;
    }

    private Boolean profileValuesAreEqual(Object obj, Object obj2) {
        return Boolean.valueOf(stringify(obj).equals(stringify(obj2)));
    }

    private UserEventLog readEventByDeviceIdAndNormalizedEventName(String str, String str2) {
        return this.baseDatabaseManager.loadDBAdapter(this.context).userEventLogDAO().readEventByDeviceIdAndNormalizedEventName(str, str2);
    }

    private int readEventCountByDeviceIdAndNormalizedEventName(String str, String str2) {
        return this.baseDatabaseManager.loadDBAdapter(this.context).userEventLogDAO().readEventCountByDeviceIdAndNormalizedEventName(str, str2);
    }

    private void resetLocalProfileSync() {
        synchronized (this.PROFILE_FIELDS_IN_THIS_SESSION) {
            this.PROFILE_FIELDS_IN_THIS_SESSION.clear();
        }
        inflateLocalProfileAsync(this.context);
    }

    private String storageKeyWithSuffix(String str) {
        StringBuilder beige = ad.beige(str, ":");
        beige.append(this.config.getAccountId());
        return beige.toString();
    }

    private String stringify(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    private boolean updateEventByDeviceIdAndNormalizedEventName(String str, String str2) {
        boolean updateEventByDeviceIdAndNormalizedEventName = this.baseDatabaseManager.loadDBAdapter(this.context).userEventLogDAO().updateEventByDeviceIdAndNormalizedEventName(str, str2);
        getConfigLogger().verbose("updatedEventByDeviceID = " + updateEventByDeviceIdAndNormalizedEventName);
        return updateEventByDeviceIdAndNormalizedEventName;
    }

    private boolean upsertUserEventLogsInBulk(Set<Pair<String, String>> set) {
        boolean upsertEventsByDeviceIdAndNormalizedEventName = this.baseDatabaseManager.loadDBAdapter(this.context).userEventLogDAO().upsertEventsByDeviceIdAndNormalizedEventName(this.deviceInfo.getDeviceID(), set);
        getConfigLogger().verbose("upsertEventByDeviceID = " + upsertEventsByDeviceIdAndNormalizedEventName);
        return upsertEventsByDeviceIdAndNormalizedEventName;
    }

    public void changeUser() {
        this.userNormalizedEventLogKeys.clear();
        resetLocalProfileSync();
    }

    public boolean cleanUpExtraEvents(int i4, int i5) {
        boolean cleanUpExtraEvents = this.baseDatabaseManager.loadDBAdapter(this.context).userEventLogDAO().cleanUpExtraEvents(i4, i5);
        getConfigLogger().verbose("cleanUpExtraEvents boolean= " + cleanUpExtraEvents);
        return cleanUpExtraEvents;
    }

    @Deprecated(since = "7.1.0")
    public EventDetail getEventDetail(String str) {
        String str2;
        try {
            if (!isPersonalisationEnabled()) {
                return null;
            }
            if (!this.config.isDefaultInstance()) {
                str2 = "local_events:" + this.config.getAccountId();
            } else {
                str2 = "local_events";
            }
            return decodeEventDetails(str, getStringFromPrefs(str, null, str2));
        } catch (Throwable th) {
            getConfigLogger().verbose(getConfigAccountId(), "Failed to retrieve local event detail", th);
            return null;
        }
    }

    @Deprecated(since = "7.1.0")
    public Map<String, EventDetail> getEventHistory(Context context) {
        String str;
        try {
            if (!this.config.isDefaultInstance()) {
                str = "local_events:" + this.config.getAccountId();
            } else {
                str = "local_events";
            }
            Map<String, ?> all = StorageHelper.getPreferences(context, str).getAll();
            HashMap hashMap = new HashMap();
            for (String str2 : all.keySet()) {
                hashMap.put(str2, decodeEventDetails(str2, all.get(str2).toString()));
            }
            return hashMap;
        } catch (Throwable th) {
            getConfigLogger().verbose(getConfigAccountId(), "Failed to retrieve local event history", th);
            return null;
        }
    }

    public Object getProfileProperty(String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.PROFILE_FIELDS_IN_THIS_SESSION) {
            try {
                Object obj = this.PROFILE_FIELDS_IN_THIS_SESSION.get(str);
                if ((obj instanceof String) && CryptHandler.isTextEncrypted((String) obj)) {
                    getConfigLogger().verbose(getConfigAccountId(), "Failed to retrieve local profile property because it wasn't decrypted");
                    return null;
                }
                return this.PROFILE_FIELDS_IN_THIS_SESSION.get(str);
            } catch (Throwable th) {
                getConfigLogger().verbose(getConfigAccountId(), "Failed to retrieve local profile property", th);
                return null;
            }
        }
    }

    public void inflateLocalProfileAsync(final Context context) {
        final String accountId = this.config.getAccountId();
        postAsyncSafely("LocalDataStore#inflateLocalProfileAsync", new Runnable() { // from class: com.clevertap.android.sdk.LocalDataStore.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject fetchUserProfileByAccountIdAndDeviceID;
                String decrypt;
                DBAdapter loadDBAdapter = LocalDataStore.this.baseDatabaseManager.loadDBAdapter(context);
                synchronized (LocalDataStore.this.PROFILE_FIELDS_IN_THIS_SESSION) {
                    try {
                        fetchUserProfileByAccountIdAndDeviceID = loadDBAdapter.fetchUserProfileByAccountIdAndDeviceID(accountId, LocalDataStore.this.deviceInfo.getDeviceID());
                    } catch (Throwable unused) {
                    }
                    if (fetchUserProfileByAccountIdAndDeviceID == null) {
                        return;
                    }
                    Iterator<String> keys = fetchUserProfileByAccountIdAndDeviceID.keys();
                    while (keys.hasNext()) {
                        try {
                            String next = keys.next();
                            Object obj = fetchUserProfileByAccountIdAndDeviceID.get(next);
                            if (obj instanceof JSONObject) {
                                LocalDataStore.this.PROFILE_FIELDS_IN_THIS_SESSION.put(next, fetchUserProfileByAccountIdAndDeviceID.getJSONObject(next));
                            } else if (obj instanceof JSONArray) {
                                LocalDataStore.this.PROFILE_FIELDS_IN_THIS_SESSION.put(next, fetchUserProfileByAccountIdAndDeviceID.getJSONArray(next));
                            } else {
                                if ((obj instanceof String) && (decrypt = LocalDataStore.this.cryptHandler.decrypt((String) obj, next, CryptHandler.EncryptionAlgorithm.AES_GCM)) != null) {
                                    obj = decrypt;
                                }
                                LocalDataStore.this.PROFILE_FIELDS_IN_THIS_SESSION.put(next, obj);
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                    LocalDataStore.this.getConfigLogger().verbose(LocalDataStore.this.getConfigAccountId(), "Local Data Store - Inflated local profile " + LocalDataStore.this.PROFILE_FIELDS_IN_THIS_SESSION);
                }
            }
        });
    }

    public boolean insertUserEventLog(String str) {
        if (insertEvent(this.deviceInfo.getDeviceID(), str, getOrPutNormalizedEventName(str)) >= 0) {
            return true;
        }
        return false;
    }

    public boolean isUserEventLogExists(String str) {
        return eventExistsByDeviceIdAndNormalizedEventName(this.deviceInfo.getDeviceID(), getOrPutNormalizedEventName(str));
    }

    public boolean isUserEventLogFirstTime(String str) {
        String orPutNormalizedEventName = getOrPutNormalizedEventName(str);
        if (this.userNormalizedEventLogKeys.contains(orPutNormalizedEventName)) {
            return false;
        }
        int readEventCountByDeviceIdAndNormalizedEventName = readEventCountByDeviceIdAndNormalizedEventName(this.deviceInfo.getDeviceID(), orPutNormalizedEventName);
        if (readEventCountByDeviceIdAndNormalizedEventName > 1) {
            this.userNormalizedEventLogKeys.add(orPutNormalizedEventName);
        }
        if (readEventCountByDeviceIdAndNormalizedEventName != 1) {
            return false;
        }
        return true;
    }

    @Deprecated(since = "7.1.0")
    public void persistEvent(Context context, JSONObject jSONObject, int i4) {
        if (jSONObject != null && i4 == 4) {
            try {
                persistEvent(context, jSONObject);
            } catch (Throwable th) {
                getConfigLogger().verbose(getConfigAccountId(), "Failed to sync with upstream", th);
            }
        }
    }

    public boolean persistUserEventLog(String str) {
        if (str == null) {
            return false;
        }
        Logger logger = this.config.getLogger();
        String accountId = this.config.getAccountId();
        try {
            logger.verbose(accountId, "UserEventLog: Persisting EventLog for event ".concat(str));
            if (isUserEventLogExists(str)) {
                logger.verbose(accountId, "UserEventLog: Updating EventLog for event ".concat(str));
                return updateUserEventLog(str);
            }
            logger.verbose(accountId, "UserEventLog: Inserting EventLog for event ".concat(str));
            return insertUserEventLog(str);
        } catch (Throwable th) {
            logger.verbose(accountId, "UserEventLog: Failed to insert user event log: for event".concat(str), th);
            return false;
        }
    }

    public boolean persistUserEventLogsInBulk(Set<String> set) {
        HashSet hashSet = new HashSet();
        Intrinsics.echo(set, "<this>");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(lambda$persistUserEventLogsInBulk$0((String) it.next()));
        }
        return upsertUserEventLogsInBulk(hashSet);
    }

    public List<UserEventLog> readEventLogsForAllUsers() {
        return this.baseDatabaseManager.loadDBAdapter(this.context).userEventLogDAO().allEvents();
    }

    public UserEventLog readUserEventLog(String str) {
        return readEventByDeviceIdAndNormalizedEventName(this.deviceInfo.getDeviceID(), getOrPutNormalizedEventName(str));
    }

    public int readUserEventLogCount(String str) {
        return readEventCountByDeviceIdAndNormalizedEventName(this.deviceInfo.getDeviceID(), getOrPutNormalizedEventName(str));
    }

    public List<UserEventLog> readUserEventLogs() {
        return allEventsByDeviceID(this.deviceInfo.getDeviceID());
    }

    public void setDataSyncFlag(JSONObject jSONObject) {
        try {
            if (!this.config.isPersonalizationEnabled()) {
                jSONObject.put("dsync", false);
                return;
            }
            String string = jSONObject.getString(Constants.KEY_TYPE);
            if (com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM.equals(string) && Constants.APP_LAUNCHED_EVENT.equals(jSONObject.getString(Constants.KEY_EVT_NAME))) {
                getConfigLogger().verbose(getConfigAccountId(), "Local cache needs to be updated (triggered by App Launched)");
                jSONObject.put("dsync", true);
                return;
            }
            if (Constants.PROFILE.equals(string)) {
                jSONObject.put("dsync", true);
                getConfigLogger().verbose(getConfigAccountId(), "Local cache needs to be updated (profile event)");
                return;
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (getIntFromPrefs("local_cache_last_update", currentTimeMillis) + getLocalCacheExpiryInterval(1200) < currentTimeMillis) {
                jSONObject.put("dsync", true);
                getConfigLogger().verbose(getConfigAccountId(), "Local cache needs to be updated");
            } else {
                jSONObject.put("dsync", false);
                getConfigLogger().verbose(getConfigAccountId(), "Local cache doesn't need to be updated");
            }
        } catch (Throwable th) {
            getConfigLogger().verbose(getConfigAccountId(), "Failed to sync with upstream", th);
        }
    }

    public void updateProfileFields(Map<String, Object> map) {
        if (map.isEmpty()) {
            return;
        }
        long nanoTime = System.nanoTime();
        persistUserEventLogsInBulk(map.keySet());
        this.config.getLogger().verbose(this.config.getAccountId(), Q0.c.mike(System.nanoTime() - nanoTime, " nano seconds", new StringBuilder("UserEventLog: persistUserEventLog execution time = ")));
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                _removeProfileField(key);
            }
            _setProfileField(key, value);
        }
        persistLocalProfileAsync();
    }

    public boolean updateUserEventLog(String str) {
        return updateEventByDeviceIdAndNormalizedEventName(this.deviceInfo.getDeviceID(), getOrPutNormalizedEventName(str));
    }

    @SuppressLint({"CommitPrefEdits"})
    @Deprecated(since = "7.1.0")
    private void persistEvent(Context context, JSONObject jSONObject) {
        String str;
        try {
            String string = jSONObject.getString(Constants.KEY_EVT_NAME);
            if (string == null) {
                return;
            }
            if (!this.config.isDefaultInstance()) {
                str = "local_events:" + this.config.getAccountId();
            } else {
                str = "local_events";
            }
            SharedPreferences preferences = StorageHelper.getPreferences(context, str);
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            EventDetail decodeEventDetails = decodeEventDetails(string, getStringFromPrefs(string, encodeEventDetails(currentTimeMillis, currentTimeMillis, 0), str));
            String encodeEventDetails = encodeEventDetails(decodeEventDetails.getFirstTime(), currentTimeMillis, decodeEventDetails.getCount() + 1);
            SharedPreferences.Editor edit = preferences.edit();
            edit.putString(storageKeyWithSuffix(string), encodeEventDetails);
            StorageHelper.persist(edit);
        } catch (Throwable th) {
            getConfigLogger().verbose(getConfigAccountId(), "Failed to persist event locally", th);
        }
    }
}
