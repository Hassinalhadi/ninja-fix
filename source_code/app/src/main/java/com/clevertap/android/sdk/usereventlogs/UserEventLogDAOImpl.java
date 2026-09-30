package com.clevertap.android.sdk.usereventlogs;

import android.content.ContentValues;
import android.database.Cursor;
import av.q;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.db.DBAdapter;
import com.clevertap.android.sdk.db.DatabaseHelper;
import com.clevertap.android.sdk.db.Table;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2716m6;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0017J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0017J*\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00150\u0014H\u0017J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0017J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0017J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0017J \u0010\u001b\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0019H\u0017J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e2\u0006\u0010\f\u001a\u00020\rH\u0017J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eH\u0017J\u0018\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/clevertap/android/sdk/usereventlogs/UserEventLogDAOImpl;", "Lcom/clevertap/android/sdk/usereventlogs/UserEventLogDAO;", "db", "Lcom/clevertap/android/sdk/db/DatabaseHelper;", "logger", "Lcom/clevertap/android/sdk/Logger;", "table", "Lcom/clevertap/android/sdk/db/Table;", "<init>", "(Lcom/clevertap/android/sdk/db/DatabaseHelper;Lcom/clevertap/android/sdk/Logger;Lcom/clevertap/android/sdk/db/Table;)V", "insertEvent", "", Column.DEVICE_ID, "", "eventName", Column.NORMALIZED_EVENT_NAME, "updateEventByDeviceIdAndNormalizedEventName", "", "upsertEventsByDeviceIdAndNormalizedEventName", "setOfActualAndNormalizedEventNamePair", "", "Lkotlin/Pair;", "readEventByDeviceIdAndNormalizedEventName", "Lcom/clevertap/android/sdk/usereventlogs/UserEventLog;", "readEventCountByDeviceIdAndNormalizedEventName", "", "eventExistsByDeviceIdAndNormalizedEventName", "eventExistsByDeviceIdAndNormalizedEventNameAndCount", Column.COUNT, "allEventsByDeviceID", "", "allEvents", "cleanUpExtraEvents", "threshold", "numberOfRowsToCleanup", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserEventLogDAOImpl implements UserEventLogDAO {

    @NotNull
    private final DatabaseHelper db;

    @NotNull
    private final Logger logger;

    @NotNull
    private final Table table;

    public UserEventLogDAOImpl(@NotNull DatabaseHelper db2, @NotNull Logger logger, @NotNull Table table) {
        Intrinsics.echo(db2, "db");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(table, "table");
        this.db = db2;
        this.logger = logger;
        this.table = table;
    }

    @Override // com.clevertap.android.sdk.usereventlogs.UserEventLogDAO
    @NotNull
    public List<UserEventLog> allEvents() {
        String tableName = this.table.getTableName();
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = this.db.getReadableDatabase().query(tableName, null, null, null, null, null, "lastTs ASC");
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        String string = query.getString(query.getColumnIndexOrThrow("eventName"));
                        Intrinsics.delta(string, "getString(...)");
                        String string2 = query.getString(query.getColumnIndexOrThrow(Column.NORMALIZED_EVENT_NAME));
                        Intrinsics.delta(string2, "getString(...)");
                        long j5 = query.getLong(query.getColumnIndexOrThrow(Column.FIRST_TS));
                        long j6 = query.getLong(query.getColumnIndexOrThrow(Column.LAST_TS));
                        int i4 = query.getInt(query.getColumnIndexOrThrow(Column.COUNT));
                        String string3 = query.getString(query.getColumnIndexOrThrow(Column.DEVICE_ID));
                        Intrinsics.delta(string3, "getString(...)");
                        arrayList.add(new UserEventLog(string, string2, j5, j6, i4, string3));
                    } finally {
                    }
                }
                query.close();
                return arrayList;
            }
            return CollectionsKt.emptyList();
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
            return CollectionsKt.emptyList();
        }
    }

    @Override // com.clevertap.android.sdk.usereventlogs.UserEventLogDAO
    @NotNull
    public List<UserEventLog> allEventsByDeviceID(@NotNull String deviceID) {
        Intrinsics.echo(deviceID, "deviceID");
        String tableName = this.table.getTableName();
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = this.db.getReadableDatabase().query(tableName, null, "deviceID = ?", new String[]{deviceID}, null, null, "lastTs ASC", null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        String string = query.getString(query.getColumnIndexOrThrow("eventName"));
                        Intrinsics.delta(string, "getString(...)");
                        String string2 = query.getString(query.getColumnIndexOrThrow(Column.NORMALIZED_EVENT_NAME));
                        Intrinsics.delta(string2, "getString(...)");
                        long j5 = query.getLong(query.getColumnIndexOrThrow(Column.FIRST_TS));
                        long j6 = query.getLong(query.getColumnIndexOrThrow(Column.LAST_TS));
                        int i4 = query.getInt(query.getColumnIndexOrThrow(Column.COUNT));
                        String string3 = query.getString(query.getColumnIndexOrThrow(Column.DEVICE_ID));
                        Intrinsics.delta(string3, "getString(...)");
                        arrayList.add(new UserEventLog(string, string2, j5, j6, i4, string3));
                    } finally {
                    }
                }
                query.close();
                return arrayList;
            }
            return CollectionsKt.emptyList();
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
            return CollectionsKt.emptyList();
        }
    }

    @Override // com.clevertap.android.sdk.usereventlogs.UserEventLogDAO
    public boolean cleanUpExtraEvents(int threshold, int numberOfRowsToCleanup) {
        if (threshold <= 0) {
            this.logger.verbose("Invalid threshold value: " + threshold + ". Threshold should be greater than 0");
            return false;
        }
        if (numberOfRowsToCleanup < 0) {
            this.logger.verbose("Invalid numberOfRowsToCleanup value: " + numberOfRowsToCleanup + ". Should be greater than or equal to 0");
            return false;
        }
        if (numberOfRowsToCleanup >= threshold) {
            this.logger.verbose("Invalid numberOfRowsToCleanup value: " + numberOfRowsToCleanup + ". Should be less than threshold: " + threshold);
            return false;
        }
        String tableName = this.table.getTableName();
        int i4 = threshold - numberOfRowsToCleanup;
        try {
            this.db.getWritableDatabase().execSQL(n.charlie("\n            DELETE FROM " + tableName + "\n            WHERE (normalizedEventName, deviceID) IN (\n                SELECT normalizedEventName, deviceID\n                FROM " + tableName + "\n                ORDER BY lastTs ASC \n                LIMIT (\n                SELECT CASE \n                    WHEN COUNT(*) > ? THEN COUNT(*) - ?\n                    ELSE 0\n                END \n                FROM " + tableName + "\n                )\n            );\n        "), new Integer[]{Integer.valueOf(threshold), Integer.valueOf(i4)});
            this.logger.verbose("If row count is above " + threshold + " then only keep " + i4 + " rows in " + tableName);
            return true;
        } catch (Exception e) {
            this.logger.verbose("Error cleaning up extra events in " + tableName + '.', e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r5.getInt(r5.getColumnIndexOrThrow("eventExists")) == 1) goto L14;
     */
    @Override // com.clevertap.android.sdk.usereventlogs.UserEventLogDAO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean eventExistsByDeviceIdAndNormalizedEventName(@NotNull String deviceID, @NotNull String normalizedEventName) {
        boolean z2;
        Intrinsics.echo(deviceID, "deviceID");
        Intrinsics.echo(normalizedEventName, "normalizedEventName");
        String tableName = this.table.getTableName();
        try {
            Cursor rawQuery = this.db.getReadableDatabase().rawQuery(n.charlie("\n            SELECT EXISTS(\n                SELECT 1 \n                FROM " + tableName + " \n                WHERE deviceID = ? AND normalizedEventName = ?\n            ) AS eventExists;\n        "), new String[]{deviceID, normalizedEventName});
            if (rawQuery == null) {
                return false;
            }
            try {
                if (rawQuery.moveToFirst()) {
                    z2 = true;
                }
                z2 = false;
                rawQuery.close();
                return z2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2716m6.alpha(rawQuery, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r4.getInt(r4.getColumnIndexOrThrow("eventExists")) == 1) goto L14;
     */
    @Override // com.clevertap.android.sdk.usereventlogs.UserEventLogDAO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean eventExistsByDeviceIdAndNormalizedEventNameAndCount(@NotNull String deviceID, @NotNull String normalizedEventName, int count) {
        boolean z2;
        Intrinsics.echo(deviceID, "deviceID");
        Intrinsics.echo(normalizedEventName, "normalizedEventName");
        String tableName = this.table.getTableName();
        try {
            Cursor rawQuery = this.db.getReadableDatabase().rawQuery(n.charlie("\n            SELECT EXISTS(\n                SELECT 1 \n                FROM " + tableName + " \n                WHERE deviceID = ? AND normalizedEventName = ? AND count = ?\n                ) AS eventExists;\n        "), new String[]{deviceID, normalizedEventName, String.valueOf(count)});
            if (rawQuery == null) {
                return false;
            }
            try {
                if (rawQuery.moveToFirst()) {
                    z2 = true;
                }
                z2 = false;
                rawQuery.close();
                return z2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2716m6.alpha(rawQuery, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
            return false;
        }
    }

    @Override // com.clevertap.android.sdk.usereventlogs.UserEventLogDAO
    public long insertEvent(@NotNull String deviceID, @NotNull String eventName, @NotNull String normalizedEventName) {
        Intrinsics.echo(deviceID, "deviceID");
        Intrinsics.echo(eventName, "eventName");
        Intrinsics.echo(normalizedEventName, "normalizedEventName");
        if (!this.db.belowMemThreshold()) {
            this.logger.verbose(DBAdapter.NOT_ENOUGH_SPACE_LOG);
            return -2L;
        }
        String tableName = this.table.getTableName();
        Logger logger = this.logger;
        StringBuilder india = q.india("Inserting event ", eventName, " with deviceID = ", deviceID, " in ");
        india.append(tableName);
        logger.verbose(india.toString());
        long nowInMillis = Utils.getNowInMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventName", eventName);
        contentValues.put(Column.NORMALIZED_EVENT_NAME, normalizedEventName);
        contentValues.put(Column.FIRST_TS, Long.valueOf(nowInMillis));
        contentValues.put(Column.LAST_TS, Long.valueOf(nowInMillis));
        contentValues.put(Column.COUNT, (Integer) 1);
        contentValues.put(Column.DEVICE_ID, deviceID);
        try {
            return this.db.getWritableDatabase().insertWithOnConflict(tableName, null, contentValues, 5);
        } catch (Exception e) {
            this.logger.verbose("Error adding row to table " + tableName + " Recreating DB. Exception: " + e);
            this.db.deleteDatabase();
            return -1L;
        }
    }

    @Override // com.clevertap.android.sdk.usereventlogs.UserEventLogDAO
    @Nullable
    public UserEventLog readEventByDeviceIdAndNormalizedEventName(@NotNull String deviceID, @NotNull String normalizedEventName) {
        UserEventLog userEventLog;
        Intrinsics.echo(deviceID, "deviceID");
        Intrinsics.echo(normalizedEventName, "normalizedEventName");
        String tableName = this.table.getTableName();
        try {
            Cursor query = this.db.getReadableDatabase().query(tableName, null, "deviceID = ? AND normalizedEventName = ?", new String[]{deviceID, normalizedEventName}, null, null, null, null);
            if (query == null) {
                return null;
            }
            try {
                if (query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("eventName"));
                    Intrinsics.delta(string, "getString(...)");
                    String string2 = query.getString(query.getColumnIndexOrThrow(Column.NORMALIZED_EVENT_NAME));
                    Intrinsics.delta(string2, "getString(...)");
                    long j5 = query.getLong(query.getColumnIndexOrThrow(Column.FIRST_TS));
                    long j6 = query.getLong(query.getColumnIndexOrThrow(Column.LAST_TS));
                    int i4 = query.getInt(query.getColumnIndexOrThrow(Column.COUNT));
                    String string3 = query.getString(query.getColumnIndexOrThrow(Column.DEVICE_ID));
                    Intrinsics.delta(string3, "getString(...)");
                    userEventLog = new UserEventLog(string, string2, j5, j6, i4, string3);
                } else {
                    userEventLog = null;
                }
                query.close();
                return userEventLog;
            } finally {
            }
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
            return null;
        }
    }

    @Override // com.clevertap.android.sdk.usereventlogs.UserEventLogDAO
    public int readEventCountByDeviceIdAndNormalizedEventName(@NotNull String deviceID, @NotNull String normalizedEventName) {
        int i4;
        Intrinsics.echo(deviceID, "deviceID");
        Intrinsics.echo(normalizedEventName, "normalizedEventName");
        String tableName = this.table.getTableName();
        try {
            Cursor query = this.db.getReadableDatabase().query(tableName, new String[]{Column.COUNT}, "deviceID = ? AND normalizedEventName = ?", new String[]{deviceID, normalizedEventName}, null, null, null, null);
            if (query == null) {
                return -1;
            }
            try {
                if (query.moveToFirst()) {
                    i4 = query.getInt(query.getColumnIndexOrThrow(Column.COUNT));
                } else {
                    i4 = 0;
                }
                query.close();
                return i4;
            } finally {
            }
        } catch (Exception e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
            return -1;
        }
    }

    @Override // com.clevertap.android.sdk.usereventlogs.UserEventLogDAO
    public boolean updateEventByDeviceIdAndNormalizedEventName(@NotNull String deviceID, @NotNull String normalizedEventName) {
        Intrinsics.echo(deviceID, "deviceID");
        Intrinsics.echo(normalizedEventName, "normalizedEventName");
        String tableName = this.table.getTableName();
        long nowInMillis = Utils.getNowInMillis();
        try {
            String charlie = n.charlie("\n            UPDATE " + tableName + " \n            SET \n                count = count + 1,\n                lastTs = ?\n            WHERE deviceID = ? \n            AND normalizedEventName = ?;\n        ");
            this.logger.verbose("Updating event " + normalizedEventName + " with deviceID = " + deviceID + " in " + tableName);
            this.db.getWritableDatabase().execSQL(charlie, new Object[]{Long.valueOf(nowInMillis), deviceID, normalizedEventName});
            return true;
        } catch (Exception e) {
            this.logger.verbose("Could not update event in database " + tableName + '.', e);
            return false;
        }
    }

    @Override // com.clevertap.android.sdk.usereventlogs.UserEventLogDAO
    public boolean upsertEventsByDeviceIdAndNormalizedEventName(@NotNull String deviceID, @NotNull Set<Pair<String, String>> setOfActualAndNormalizedEventNamePair) {
        Intrinsics.echo(deviceID, "deviceID");
        Intrinsics.echo(setOfActualAndNormalizedEventNamePair, "setOfActualAndNormalizedEventNamePair");
        String tableName = this.table.getTableName();
        this.logger.verbose("UserEventLog: upsert EventLog for bulk events");
        try {
            this.db.getWritableDatabase().beginTransaction();
            Iterator<T> it = setOfActualAndNormalizedEventNamePair.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (eventExistsByDeviceIdAndNormalizedEventName(deviceID, (String) pair.getSecond())) {
                    this.logger.verbose("UserEventLog: Updating EventLog for event " + pair);
                    updateEventByDeviceIdAndNormalizedEventName(deviceID, (String) pair.getSecond());
                } else {
                    this.logger.verbose("UserEventLog: Inserting EventLog for event " + pair);
                    insertEvent(deviceID, (String) pair.getFirst(), (String) pair.getSecond());
                }
            }
            this.db.getWritableDatabase().setTransactionSuccessful();
            this.db.getWritableDatabase().endTransaction();
            return true;
        } catch (Exception e) {
            this.logger.verbose("Failed to perform bulk upsert on table " + tableName, e);
            try {
                this.db.getWritableDatabase().endTransaction();
                return false;
            } catch (Exception e4) {
                this.logger.verbose("Failed to end transaction on table " + tableName, e4);
                return false;
            }
        }
    }
}
