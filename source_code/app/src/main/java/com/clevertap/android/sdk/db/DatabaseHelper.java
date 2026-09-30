package com.clevertap.android.sdk.db;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import av.q;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.StorageHelper;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import s6.AbstractC2716m6;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B+\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\b\u0010\u001f\u001a\u00020 H\u0007J\u0006\u0010!\u001a\u00020\u0013J\u0018\u0010\"\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0007H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/clevertap/android/sdk/db/DatabaseHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "dbName", "", "logger", "Lcom/clevertap/android/sdk/Logger;", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/lang/String;Lcom/clevertap/android/sdk/Logger;)V", "getContext", "()Landroid/content/Context;", "getConfig", "()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "databaseFile", "Ljava/io/File;", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "", "newVersion", "getDeviceIdForAccountIdFromPrefs", "accountId", "migrateUserProfilesTable", "migrateDataString", "dataString", "belowMemThreshold", "", "deleteDatabase", "executeStatement", "statement", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 5;
    private static final int DB_LIMIT = 20971520;

    @NotNull
    private final CleverTapInstanceConfig config;

    @NotNull
    private final Context context;

    @NotNull
    private final File databaseFile;

    @NotNull
    private final Logger logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseHelper(@NotNull Context context, @NotNull CleverTapInstanceConfig config, @Nullable String str, @NotNull Logger logger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 5);
        Intrinsics.echo(context, "context");
        Intrinsics.echo(config, "config");
        Intrinsics.echo(logger, "logger");
        this.context = context;
        this.config = config;
        this.logger = logger;
        this.databaseFile = context.getDatabasePath(str);
    }

    private final void executeStatement(SQLiteDatabase db2, String statement) {
        SQLiteStatement compileStatement = db2.compileStatement(statement);
        this.logger.verbose("Executing - " + statement);
        compileStatement.execute();
    }

    private final String getDeviceIdForAccountIdFromPrefs(String accountId) {
        String echo = q.echo("deviceId:", accountId);
        String echo2 = q.echo("fallbackId:", accountId);
        String string = StorageHelper.getString(this.context, echo, null);
        if (string == null) {
            if (this.config.isDefaultInstance()) {
                String string2 = StorageHelper.getString(this.context, echo, null);
                Intrinsics.delta(string2, "getString(...)");
                return string2;
            }
            String string3 = StorageHelper.getString(this.context, echo2, "");
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        return string;
    }

    private final String migrateDataString(String dataString) {
        try {
            JSONObject jSONObject = new JSONObject(dataString);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if ((obj instanceof String) && r.quebec((String) obj, Constants.DATE_PREFIX, false)) {
                    long parseLong = Long.parseLong(StringsKt.lime((String) obj, Constants.DATE_PREFIX));
                    Long valueOf = Long.valueOf(parseLong);
                    jSONObject.put(next, parseLong);
                    obj = valueOf;
                }
                if (obj instanceof JSONObject) {
                    if (((JSONObject) obj).has(Constants.COMMAND_SET)) {
                        jSONObject.put(next, ((JSONObject) obj).getJSONArray(Constants.COMMAND_SET));
                    } else if (((JSONObject) obj).has(Constants.COMMAND_ADD)) {
                        jSONObject.put(next, ((JSONObject) obj).getJSONArray(Constants.COMMAND_ADD));
                    }
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            this.logger.verbose("Error while migrating data column for userProfiles table for data = " + dataString, e);
            return dataString;
        }
    }

    private final void migrateUserProfilesTable(SQLiteDatabase db2) {
        String str;
        String str2;
        String str3;
        str = CtDatabaseKt.CREATE_TEMP_USER_PROFILES_TABLE;
        executeStatement(db2, str);
        String accountId = this.config.getAccountId();
        Intrinsics.delta(accountId, "getAccountId(...)");
        String deviceIdForAccountIdFromPrefs = getDeviceIdForAccountIdFromPrefs(accountId);
        StringBuilder sb2 = new StringBuilder("SELECT _id, data FROM ");
        Table table = Table.USER_PROFILES;
        sb2.append(table.getTableName());
        sb2.append(';');
        Cursor rawQuery = db2.rawQuery(sb2.toString(), null);
        Intrinsics.delta(rawQuery, "rawQuery(...)");
        try {
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow(Column.ID));
                String string2 = rawQuery.getString(rawQuery.getColumnIndexOrThrow(Column.DATA));
                Intrinsics.checkNotNull(string2);
                executeStatement(db2, "INSERT INTO temp_" + table.getTableName() + " (_id, deviceID, data)\n                                 VALUES ('" + string + "', '" + deviceIdForAccountIdFromPrefs + "', '" + migrateDataString(string2) + "');");
            }
            rawQuery.close();
            str2 = CtDatabaseKt.DROP_USER_PROFILES_TABLE;
            executeStatement(db2, str2);
            str3 = CtDatabaseKt.RENAME_USER_PROFILES_TABLE;
            executeStatement(db2, str3);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2716m6.alpha(rawQuery, th);
                throw th2;
            }
        }
    }

    @SuppressLint({"UsableSpace"})
    public final boolean belowMemThreshold() {
        if (!this.databaseFile.exists() || Math.max(this.databaseFile.getUsableSpace(), 20971520L) >= this.databaseFile.length()) {
            return true;
        }
        return false;
    }

    public final void deleteDatabase() {
        close();
        if (!this.databaseFile.delete()) {
            this.logger.debug("Could not delete database");
        }
    }

    @NotNull
    public final CleverTapInstanceConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase db2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Intrinsics.echo(db2, "db");
        this.logger.verbose("Creating CleverTap DB");
        str = CtDatabaseKt.CREATE_EVENTS_TABLE;
        executeStatement(db2, str);
        str2 = CtDatabaseKt.CREATE_USER_EVENT_LOGS_TABLE;
        executeStatement(db2, str2);
        str3 = CtDatabaseKt.CREATE_PROFILE_EVENTS_TABLE;
        executeStatement(db2, str3);
        str4 = CtDatabaseKt.CREATE_USER_PROFILES_TABLE;
        executeStatement(db2, str4);
        str5 = CtDatabaseKt.CREATE_INBOX_MESSAGES_TABLE;
        executeStatement(db2, str5);
        str6 = CtDatabaseKt.CREATE_PUSH_NOTIFICATIONS_TABLE;
        executeStatement(db2, str6);
        str7 = CtDatabaseKt.CREATE_UNINSTALL_TS_TABLE;
        executeStatement(db2, str7);
        str8 = CtDatabaseKt.CREATE_NOTIFICATION_VIEWED_TABLE;
        executeStatement(db2, str8);
        str9 = CtDatabaseKt.EVENTS_TIME_INDEX;
        executeStatement(db2, str9);
        str10 = CtDatabaseKt.PROFILE_EVENTS_TIME_INDEX;
        executeStatement(db2, str10);
        str11 = CtDatabaseKt.UNINSTALL_TS_INDEX;
        executeStatement(db2, str11);
        str12 = CtDatabaseKt.PUSH_NOTIFICATIONS_TIME_INDEX;
        executeStatement(db2, str12);
        str13 = CtDatabaseKt.INBOX_MESSAGES_COMP_ID_USERID_INDEX;
        executeStatement(db2, str13);
        str14 = CtDatabaseKt.NOTIFICATION_VIEWED_INDEX;
        executeStatement(db2, str14);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase db2, int oldVersion, int newVersion) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Intrinsics.echo(db2, "db");
        this.logger.verbose("Upgrading CleverTap DB to version " + newVersion);
        if (oldVersion == 1) {
            str = CtDatabaseKt.DROP_TABLE_UNINSTALL_TS;
            executeStatement(db2, str);
            str2 = CtDatabaseKt.DROP_TABLE_INBOX_MESSAGES;
            executeStatement(db2, str2);
            str3 = CtDatabaseKt.DROP_TABLE_PUSH_NOTIFICATION_VIEWED;
            executeStatement(db2, str3);
            str4 = CtDatabaseKt.CREATE_INBOX_MESSAGES_TABLE;
            executeStatement(db2, str4);
            str5 = CtDatabaseKt.CREATE_PUSH_NOTIFICATIONS_TABLE;
            executeStatement(db2, str5);
            str6 = CtDatabaseKt.CREATE_UNINSTALL_TS_TABLE;
            executeStatement(db2, str6);
            str7 = CtDatabaseKt.CREATE_NOTIFICATION_VIEWED_TABLE;
            executeStatement(db2, str7);
            str8 = CtDatabaseKt.UNINSTALL_TS_INDEX;
            executeStatement(db2, str8);
            str9 = CtDatabaseKt.PUSH_NOTIFICATIONS_TIME_INDEX;
            executeStatement(db2, str9);
            str10 = CtDatabaseKt.INBOX_MESSAGES_COMP_ID_USERID_INDEX;
            executeStatement(db2, str10);
            str11 = CtDatabaseKt.NOTIFICATION_VIEWED_INDEX;
            executeStatement(db2, str11);
            migrateUserProfilesTable(db2);
        } else if (oldVersion == 2) {
            str13 = CtDatabaseKt.DROP_TABLE_PUSH_NOTIFICATION_VIEWED;
            executeStatement(db2, str13);
            str14 = CtDatabaseKt.CREATE_NOTIFICATION_VIEWED_TABLE;
            executeStatement(db2, str14);
            str15 = CtDatabaseKt.NOTIFICATION_VIEWED_INDEX;
            executeStatement(db2, str15);
            migrateUserProfilesTable(db2);
        } else if (oldVersion == 3) {
            migrateUserProfilesTable(db2);
        }
        if (oldVersion < 5) {
            str12 = CtDatabaseKt.CREATE_USER_EVENT_LOGS_TABLE;
            executeStatement(db2, str12);
        }
    }
}
