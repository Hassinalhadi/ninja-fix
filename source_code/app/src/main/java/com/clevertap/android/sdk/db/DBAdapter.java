package com.clevertap.android.sdk.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inbox.CTMessageDAO;
import com.clevertap.android.sdk.usereventlogs.UserEventLogDAO;
import com.clevertap.android.sdk.usereventlogs.UserEventLogDAOImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s6.AbstractC2716m6;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u0000 N2\u00020\u0001:\u0001NB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007J$\u0010\u0016\u001a\u00020\u00112\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0014J\u0013\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001c¢\u0006\u0002\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020 0\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0014J\u001c\u0010\"\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u00142\b\u0010#\u001a\u0004\u0018\u00010\u0014J\u0006\u0010$\u001a\u00020%J%\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0)j\b\u0012\u0004\u0012\u00020(`'2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010*J\u001c\u0010+\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007J$\u0010,\u001a\u00020\u00112\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007J\u0010\u0010-\u001a\u00020.2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014J\u0006\u0010/\u001a\u00020.J$\u00100\u001a\u00020%2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010#\u001a\u0004\u0018\u00010\u00142\u0006\u00101\u001a\u00020 H\u0007J\u0016\u00102\u001a\u00020.2\f\u00103\u001a\b\u0012\u0004\u0012\u00020(0\u0018H\u0007J\u0006\u00104\u001a\u00020.J\u0018\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u000208H\u0007J\u0018\u00109\u001a\u00020.2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010:\u001a\u00020%J\u000e\u0010;\u001a\u00020.2\u0006\u00107\u001a\u000208J\u0018\u0010<\u001a\u0004\u0018\u00010 2\u0006\u00107\u001a\u0002082\u0006\u0010=\u001a\u00020>J\u001d\u0010?\u001a\u00020.2\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001cH\u0007¢\u0006\u0002\u0010AJ\u0018\u0010B\u001a\u00020%2\u0006\u00101\u001a\u00020 2\u0006\u00107\u001a\u000208H\u0007J\u000e\u0010C\u001a\u00020.2\u0006\u00107\u001a\u000208J\b\u0010D\u001a\u00020\tH\u0007J\b\u0010E\u001a\u00020\u0011H\u0003J\u0018\u0010F\u001a\u00020.2\u0006\u00107\u001a\u0002082\u0006\u0010G\u001a\u00020%H\u0002J\r\u0010H\u001a\u00020.H\u0001¢\u0006\u0002\bIJ\u0010\u0010J\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010K\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010L\u001a\u00020\u00142\u0006\u0010M\u001a\u00020>H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/clevertap/android/sdk/db/DBAdapter;", "", "context", "Landroid/content/Context;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "userEventLogDao", "Lcom/clevertap/android/sdk/usereventlogs/UserEventLogDAO;", "logger", "Lcom/clevertap/android/sdk/Logger;", "kotlin.jvm.PlatformType", "Lcom/clevertap/android/sdk/Logger;", "dbHelper", "Lcom/clevertap/android/sdk/db/DatabaseHelper;", "rtlDirtyFlag", "", "deleteMessageForId", "messageId", "", "userId", "deleteMessagesForIDs", "messageIDs", "", "doesPushNotificationIdExist", Constants.KEY_ID, "fetchPushNotificationIds", "", "()[Ljava/lang/String;", "fetchUserProfilesByAccountId", "", "Lorg/json/JSONObject;", "accountId", "fetchUserProfileByAccountIdAndDeviceID", Constants.DEVICE_ID_TAG, "getLastUninstallTimestamp", "", "getMessages", "Lkotlin/collections/ArrayList;", "Lcom/clevertap/android/sdk/inbox/CTMessageDAO;", "Ljava/util/ArrayList;", "(Ljava/lang/String;)Ljava/util/ArrayList;", "markReadMessageForId", "markReadMessagesForIds", "removeUserProfilesForAccountId", "", "storeUninstallTimestamp", "storeUserProfile", "obj", "upsertMessages", "inboxMessages", "cleanUpPushNotifications", "cleanupEventsFromLastId", "lastId", "table", "Lcom/clevertap/android/sdk/db/Table;", "storePushNotificationId", "ttl", "cleanupStaleEvents", "fetchEvents", Constants.KEY_LIMIT, "", "updatePushNotificationIds", "ids", "([Ljava/lang/String;)V", "storeObject", "removeEvents", "userEventLogDAO", "belowMemThreshold", "cleanInternal", "expiration", "deleteDB", "deleteDB$clevertap_core_release", "fetchPushNotificationId", "getDatabaseName", "getTemplateMarkersList", Column.COUNT, "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DBAdapter {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DATABASE_NAME = "clevertap";
    private static final long DATA_EXPIRATION = 432000000;
    public static final long DB_OUT_OF_MEMORY_ERROR = -2;
    private static final long DB_UNDEFINED_CODE = -3;
    public static final long DB_UPDATE_ERROR = -1;

    @NotNull
    public static final String NOT_ENOUGH_SPACE_LOG = "There is not enough space left on the device to store data, data discarded";

    @NotNull
    private final DatabaseHelper dbHelper;
    private final Logger logger;
    private boolean rtlDirtyFlag;

    @Nullable
    private volatile UserEventLogDAO userEventLogDao;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/clevertap/android/sdk/db/DBAdapter$Companion;", "", "<init>", "()V", "DATA_EXPIRATION", "", "DB_UPDATE_ERROR", "DB_OUT_OF_MEMORY_ERROR", "DB_UNDEFINED_CODE", "getDB_UNDEFINED_CODE$annotations", "DATABASE_NAME", "", "NOT_ENOUGH_SPACE_LOG", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getDB_UNDEFINED_CODE$annotations() {
        }

        private Companion() {
        }
    }

    public DBAdapter(@NotNull Context context, @NotNull CleverTapInstanceConfig config) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(config, "config");
        Logger logger = config.getLogger();
        this.logger = logger;
        String databaseName = getDatabaseName(config);
        Intrinsics.delta(logger, "logger");
        this.dbHelper = new DatabaseHelper(context, config, databaseName, logger);
        this.rtlDirtyFlag = true;
    }

    private final boolean belowMemThreshold() {
        return this.dbHelper.belowMemThreshold();
    }

    private final void cleanInternal(Table table, long expiration) {
        long currentTimeMillis = (System.currentTimeMillis() - expiration) / 1000;
        String tableName = table.getTableName();
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, "created_at <= " + currentTimeMillis, null);
        } catch (SQLiteException e) {
            this.logger.verbose("Error removing stale event records from " + tableName + ". Recreating DB.", e);
            deleteDB$clevertap_core_release();
        }
    }

    private final String fetchPushNotificationId(String id2) {
        Exception exc;
        String tableName = Table.PUSH_NOTIFICATIONS.getTableName();
        String str = "";
        try {
            Cursor query = this.dbHelper.getReadableDatabase().query(tableName, null, "data =?", new String[]{id2}, null, null, null);
            if (query == null) {
                return "";
            }
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow(Column.DATA));
                }
                this.logger.verbose("Fetching PID for check - " + str);
                query.close();
                return str;
            } catch (Throwable th) {
                String str2 = str;
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        AbstractC2716m6.alpha(query, th);
                        throw th2;
                    } catch (Exception e) {
                        exc = e;
                        str = str2;
                        this.logger.verbose("Could not fetch records out of database " + tableName + '.', exc);
                        return str;
                    }
                }
            }
        } catch (Exception e4) {
            exc = e4;
        }
    }

    private final String getDatabaseName(CleverTapInstanceConfig config) {
        if (config.isDefaultInstance()) {
            return DATABASE_NAME;
        }
        return "clevertap_" + config.getAccountId();
    }

    private final String getTemplateMarkersList(int count) {
        StringBuilder sb2 = new StringBuilder();
        if (count > 0) {
            sb2.append("?");
            int i4 = count - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                sb2.append(", ?");
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }

    public final synchronized void cleanUpPushNotifications() {
        cleanInternal(Table.PUSH_NOTIFICATIONS, 0L);
    }

    public final synchronized void cleanupEventsFromLastId(@NotNull String lastId, @NotNull Table table) {
        Intrinsics.echo(lastId, "lastId");
        Intrinsics.echo(table, "table");
        String tableName = table.getTableName();
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, "_id <= ?", new String[]{lastId});
        } catch (SQLiteException unused) {
            this.logger.verbose("Error removing sent data from table " + tableName + " Recreating DB");
            deleteDB$clevertap_core_release();
        }
    }

    public final synchronized void cleanupStaleEvents(@NotNull Table table) {
        Intrinsics.echo(table, "table");
        cleanInternal(table, DATA_EXPIRATION);
    }

    public final void deleteDB$clevertap_core_release() {
        this.dbHelper.deleteDatabase();
    }

    public final synchronized boolean deleteMessageForId(@Nullable String messageId, @Nullable String userId) {
        boolean z2 = false;
        if (messageId == null || userId == null) {
            return false;
        }
        String tableName = Table.INBOX_MESSAGES.getTableName();
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, "_id = ? AND messageUser = ?", new String[]{messageId, userId});
            z2 = true;
        } catch (SQLiteException e) {
            this.logger.verbose("Error removing stale records from " + tableName, e);
        }
        return z2;
    }

    public final synchronized boolean deleteMessagesForIDs(@Nullable List<String> messageIDs, @Nullable String userId) {
        boolean z2 = false;
        if (messageIDs == null || userId == null) {
            return false;
        }
        String tableName = Table.INBOX_MESSAGES.getTableName();
        String templateMarkersList = getTemplateMarkersList(messageIDs.size());
        ArrayList B = CollectionsKt.B(messageIDs);
        B.add(userId);
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, "_id IN (" + templateMarkersList + ") AND messageUser = ?", (String[]) B.toArray(new String[0]));
            z2 = true;
        } catch (SQLiteException e) {
            this.logger.verbose("Error removing stale records from " + tableName, e);
        }
        return z2;
    }

    public final synchronized boolean doesPushNotificationIdExist(@NotNull String id2) {
        Intrinsics.echo(id2, "id");
        return Intrinsics.areEqual(id2, fetchPushNotificationId(id2));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized JSONObject fetchEvents(@NotNull Table table, int limit) {
        JSONObject jSONObject;
        String str;
        Cursor query;
        Intrinsics.echo(table, "table");
        String tableName = table.getTableName();
        JSONArray jSONArray = new JSONArray();
        jSONObject = null;
        try {
            query = this.dbHelper.getReadableDatabase().query(tableName, null, null, null, null, null, "created_at ASC", String.valueOf(limit));
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
        }
        if (query != null) {
            str = null;
            while (query.moveToNext()) {
                try {
                    if (query.isLast()) {
                        str = query.getString(query.getColumnIndexOrThrow(Column.ID));
                    }
                    try {
                        jSONArray.put(new JSONObject(query.getString(query.getColumnIndexOrThrow(Column.DATA))));
                    } catch (JSONException unused) {
                    }
                } finally {
                }
            }
            query.close();
            if (str != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(str, jSONArray);
                    jSONObject = jSONObject2;
                } catch (JSONException unused2) {
                }
            }
        }
        str = null;
        if (str != null) {
        }
        return jSONObject;
    }

    @NotNull
    public final synchronized String[] fetchPushNotificationIds() {
        if (!this.rtlDirtyFlag) {
            return new String[0];
        }
        String tableName = Table.PUSH_NOTIFICATIONS.getTableName();
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = this.dbHelper.getReadableDatabase().query(tableName, null, "isRead = 0", null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        int columnIndex = query.getColumnIndex(Column.DATA);
                        if (columnIndex >= 0) {
                            String string = query.getString(columnIndex);
                            this.logger.verbose("Fetching PID - " + string);
                            arrayList.add(string);
                        }
                    } finally {
                    }
                }
                query.close();
            }
        } catch (SQLiteException e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized JSONObject fetchUserProfileByAccountIdAndDeviceID(@Nullable String accountId, @Nullable String deviceId) {
        SQLiteException sQLiteException;
        String str;
        int columnIndex;
        JSONObject jSONObject = null;
        if (accountId == null || deviceId == null) {
            return null;
        }
        String tableName = Table.USER_PROFILES.getTableName();
        try {
            Cursor query = this.dbHelper.getReadableDatabase().query(tableName, null, "_id = ? AND deviceID = ?", new String[]{accountId, deviceId}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst() && (columnIndex = query.getColumnIndex(Column.DATA)) >= 0) {
                        str = query.getString(columnIndex);
                    } else {
                        str = null;
                    }
                    try {
                        query.close();
                    } catch (SQLiteException e) {
                        sQLiteException = e;
                        this.logger.verbose("Could not fetch records out of database " + tableName + '.', sQLiteException);
                        if (str != null) {
                        }
                        return jSONObject;
                    }
                } finally {
                }
            } else {
                str = null;
            }
        } catch (SQLiteException e4) {
            sQLiteException = e4;
            str = null;
        }
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    @NotNull
    public final synchronized Map<String, JSONObject> fetchUserProfilesByAccountId(@Nullable String accountId) {
        if (accountId == null) {
            return t.alpha;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String tableName = Table.USER_PROFILES.getTableName();
        try {
            Cursor query = this.dbHelper.getReadableDatabase().query(tableName, null, "_id = ?", new String[]{accountId}, null, null, null);
            if (query != null) {
                try {
                    int columnIndex = query.getColumnIndex(Column.DATA);
                    int columnIndex2 = query.getColumnIndex(Column.DEVICE_ID);
                    if (columnIndex >= 0) {
                        while (query.moveToNext()) {
                            String string = query.getString(columnIndex);
                            String string2 = query.getString(columnIndex2);
                            if (string != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(string);
                                    Intrinsics.checkNotNull(string2);
                                    linkedHashMap.put(string2, jSONObject);
                                } catch (JSONException e) {
                                    this.logger.verbose("Error parsing JSON for profile", e);
                                }
                            }
                        }
                    }
                    query.close();
                } finally {
                }
            }
        } catch (SQLiteException e4) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e4);
        }
        return linkedHashMap;
    }

    public final synchronized long getLastUninstallTimestamp() {
        long j5;
        String tableName = Table.UNINSTALL_TS.getTableName();
        j5 = 0;
        try {
            Cursor query = this.dbHelper.getReadableDatabase().query(tableName, null, null, null, null, null, "created_at DESC", "1");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        j5 = query.getLong(query.getColumnIndexOrThrow(Column.CREATED_AT));
                    }
                    query.close();
                } finally {
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
        }
        return j5;
    }

    @NotNull
    public final synchronized ArrayList<CTMessageDAO> getMessages(@NotNull String userId) {
        ArrayList<CTMessageDAO> arrayList;
        Intrinsics.echo(userId, "userId");
        String tableName = Table.INBOX_MESSAGES.getTableName();
        arrayList = new ArrayList<>();
        try {
            Cursor query = this.dbHelper.getReadableDatabase().query(tableName, null, "messageUser = ?", new String[]{userId}, null, null, "created_at DESC");
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        CTMessageDAO cTMessageDAO = new CTMessageDAO();
                        cTMessageDAO.setId(query.getString(query.getColumnIndexOrThrow(Column.ID)));
                        cTMessageDAO.setJsonData(new JSONObject(query.getString(query.getColumnIndexOrThrow(Column.DATA))));
                        cTMessageDAO.setWzrkParams(new JSONObject(query.getString(query.getColumnIndexOrThrow("wzrkParams"))));
                        cTMessageDAO.setDate(query.getLong(query.getColumnIndexOrThrow(Column.CREATED_AT)));
                        cTMessageDAO.setExpires(query.getLong(query.getColumnIndexOrThrow(Column.EXPIRES)));
                        cTMessageDAO.setRead(query.getInt(query.getColumnIndexOrThrow("isRead")));
                        cTMessageDAO.setUserId(query.getString(query.getColumnIndexOrThrow(Column.USER_ID)));
                        cTMessageDAO.setTags(query.getString(query.getColumnIndexOrThrow("tags")));
                        cTMessageDAO.setCampaignId(query.getString(query.getColumnIndexOrThrow(Column.CAMPAIGN)));
                        arrayList.add(cTMessageDAO);
                    } finally {
                    }
                }
                query.close();
            }
        } catch (Exception e) {
            this.logger.verbose("Error retrieving records from " + tableName, e);
        }
        return arrayList;
    }

    public final synchronized boolean markReadMessageForId(@Nullable String messageId, @Nullable String userId) {
        boolean z2 = false;
        if (messageId == null || userId == null) {
            return false;
        }
        Table table = Table.INBOX_MESSAGES;
        String tableName = table.getTableName();
        ContentValues contentValues = new ContentValues();
        contentValues.put("isRead", (Integer) 1);
        try {
            this.dbHelper.getWritableDatabase().update(table.getTableName(), contentValues, "_id = ? AND messageUser = ?", new String[]{messageId, userId});
            z2 = true;
        } catch (SQLiteException e) {
            this.logger.verbose("Error removing stale records from " + tableName, e);
        }
        return z2;
    }

    public final synchronized boolean markReadMessagesForIds(@Nullable List<String> messageIDs, @Nullable String userId) {
        boolean z2 = false;
        if (messageIDs == null || userId == null) {
            return false;
        }
        Table table = Table.INBOX_MESSAGES;
        String tableName = table.getTableName();
        String templateMarkersList = getTemplateMarkersList(messageIDs.size());
        ArrayList B = CollectionsKt.B(messageIDs);
        B.add(userId);
        ContentValues contentValues = new ContentValues();
        contentValues.put("isRead", (Integer) 1);
        try {
            this.dbHelper.getWritableDatabase().update(table.getTableName(), contentValues, "_id IN (" + templateMarkersList + ") AND messageUser = ?", (String[]) B.toArray(new String[0]));
            z2 = true;
        } catch (SQLiteException e) {
            this.logger.verbose("Error removing stale records from " + tableName, e);
        }
        return z2;
    }

    public final synchronized void removeEvents(@NotNull Table table) {
        Intrinsics.echo(table, "table");
        String tableName = table.getTableName();
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, null, null);
        } catch (SQLiteException unused) {
            this.logger.verbose("Error removing all events from table " + tableName + " Recreating DB");
            deleteDB$clevertap_core_release();
        }
    }

    public final synchronized void removeUserProfilesForAccountId(@Nullable String id2) {
        if (id2 == null) {
            return;
        }
        String tableName = Table.USER_PROFILES.getTableName();
        try {
            this.dbHelper.getWritableDatabase().delete(tableName, "_id = ?", new String[]{id2});
        } catch (SQLiteException unused) {
            this.logger.verbose("Error removing user profile from " + tableName + " Recreating DB");
            deleteDB$clevertap_core_release();
        }
    }

    public final synchronized long storeObject(@NotNull JSONObject obj, @NotNull Table table) {
        long j5;
        Intrinsics.echo(obj, "obj");
        Intrinsics.echo(table, "table");
        if (!belowMemThreshold()) {
            this.logger.verbose(NOT_ENOUGH_SPACE_LOG);
            return -2L;
        }
        String tableName = table.getTableName();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Column.DATA, obj.toString());
        contentValues.put(Column.CREATED_AT, Long.valueOf(System.currentTimeMillis()));
        try {
            this.dbHelper.getWritableDatabase().insert(tableName, null, contentValues);
            j5 = this.dbHelper.getWritableDatabase().compileStatement("SELECT COUNT(*) FROM " + tableName).simpleQueryForLong();
        } catch (SQLiteException unused) {
            this.logger.verbose("Error adding data to table " + tableName + " Recreating DB");
            deleteDB$clevertap_core_release();
            j5 = -1;
        }
        return j5;
    }

    public final synchronized void storePushNotificationId(@Nullable String id2, long ttl) {
        if (id2 == null) {
            return;
        }
        if (!belowMemThreshold()) {
            this.logger.verbose(NOT_ENOUGH_SPACE_LOG);
            return;
        }
        String tableName = Table.PUSH_NOTIFICATIONS.getTableName();
        if (ttl <= 0) {
            ttl = System.currentTimeMillis() + Constants.DEFAULT_PUSH_TTL;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(Column.DATA, id2);
        contentValues.put(Column.CREATED_AT, Long.valueOf(ttl));
        contentValues.put("isRead", (Integer) 0);
        try {
            this.dbHelper.getWritableDatabase().insert(tableName, null, contentValues);
            this.rtlDirtyFlag = true;
            this.logger.verbose("Stored PN - " + id2 + " with TTL - " + ttl);
        } catch (SQLiteException unused) {
            this.logger.verbose("Error adding data to table " + tableName + " Recreating DB");
            deleteDB$clevertap_core_release();
        }
    }

    public final synchronized void storeUninstallTimestamp() {
        if (!belowMemThreshold()) {
            this.logger.verbose(NOT_ENOUGH_SPACE_LOG);
            return;
        }
        String tableName = Table.UNINSTALL_TS.getTableName();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Column.CREATED_AT, Long.valueOf(System.currentTimeMillis()));
        try {
            this.dbHelper.getWritableDatabase().insert(tableName, null, contentValues);
        } catch (SQLiteException unused) {
            this.logger.verbose("Error adding data to table " + tableName + " Recreating DB");
            deleteDB$clevertap_core_release();
        }
    }

    public final synchronized long storeUserProfile(@Nullable String id2, @Nullable String deviceId, @NotNull JSONObject obj) {
        Intrinsics.echo(obj, "obj");
        long j5 = -1;
        if (id2 != null && deviceId != null) {
            if (!belowMemThreshold()) {
                this.logger.verbose(NOT_ENOUGH_SPACE_LOG);
                return -2L;
            }
            String tableName = Table.USER_PROFILES.getTableName();
            this.logger.verbose("Inserting or updating userProfile for accountID = " + id2 + " + deviceID = " + deviceId);
            ContentValues contentValues = new ContentValues();
            contentValues.put(Column.DATA, obj.toString());
            contentValues.put(Column.ID, id2);
            contentValues.put(Column.DEVICE_ID, deviceId);
            try {
                j5 = this.dbHelper.getWritableDatabase().insertWithOnConflict(tableName, null, contentValues, 5);
            } catch (SQLiteException unused) {
                this.logger.verbose("Error adding data to table " + tableName + " Recreating DB");
                deleteDB$clevertap_core_release();
            }
            return j5;
        }
        return -1L;
    }

    public final synchronized void updatePushNotificationIds(@NotNull String[] ids) {
        Intrinsics.echo(ids, "ids");
        if (ids.length == 0) {
            return;
        }
        if (!belowMemThreshold()) {
            this.logger.verbose(NOT_ENOUGH_SPACE_LOG);
            return;
        }
        String tableName = Table.PUSH_NOTIFICATIONS.getTableName();
        ContentValues contentValues = new ContentValues();
        contentValues.put("isRead", (Integer) 1);
        String templateMarkersList = getTemplateMarkersList(ids.length);
        try {
            this.dbHelper.getWritableDatabase().update(tableName, contentValues, "data IN (" + templateMarkersList + ')', ids);
            this.rtlDirtyFlag = false;
        } catch (SQLiteException unused) {
            this.logger.verbose("Error adding data to table " + tableName + " Recreating DB");
            deleteDB$clevertap_core_release();
        }
    }

    public final synchronized void upsertMessages(@NotNull List<? extends CTMessageDAO> inboxMessages) {
        Intrinsics.echo(inboxMessages, "inboxMessages");
        if (!belowMemThreshold()) {
            this.logger.verbose(NOT_ENOUGH_SPACE_LOG);
            return;
        }
        for (CTMessageDAO cTMessageDAO : inboxMessages) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(Column.ID, cTMessageDAO.getId());
            contentValues.put(Column.DATA, cTMessageDAO.getJsonData().toString());
            contentValues.put("wzrkParams", cTMessageDAO.getWzrkParams().toString());
            contentValues.put(Column.CAMPAIGN, cTMessageDAO.getCampaignId());
            contentValues.put("tags", cTMessageDAO.getTags());
            contentValues.put("isRead", Integer.valueOf(cTMessageDAO.isRead()));
            contentValues.put(Column.EXPIRES, Long.valueOf(cTMessageDAO.getExpires()));
            contentValues.put(Column.CREATED_AT, Long.valueOf(cTMessageDAO.getDate()));
            contentValues.put(Column.USER_ID, cTMessageDAO.getUserId());
            try {
                this.dbHelper.getWritableDatabase().insertWithOnConflict(Table.INBOX_MESSAGES.getTableName(), null, contentValues, 5);
            } catch (SQLiteException unused) {
                this.logger.verbose("Error adding data to table " + Table.INBOX_MESSAGES.getTableName());
            }
        }
    }

    @NotNull
    public final UserEventLogDAO userEventLogDAO() {
        UserEventLogDAO userEventLogDAO;
        UserEventLogDAO userEventLogDAO2 = this.userEventLogDao;
        if (userEventLogDAO2 == null) {
            synchronized (this) {
                userEventLogDAO = this.userEventLogDao;
                if (userEventLogDAO == null) {
                    DatabaseHelper databaseHelper = this.dbHelper;
                    Logger logger = this.logger;
                    Intrinsics.delta(logger, "logger");
                    userEventLogDAO = new UserEventLogDAOImpl(databaseHelper, logger, Table.USER_EVENT_LOGS_TABLE);
                    this.userEventLogDao = userEventLogDAO;
                }
            }
            return userEventLogDAO;
        }
        return userEventLogDAO2;
    }
}
