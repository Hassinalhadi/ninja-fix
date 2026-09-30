package com.clevertap.android.sdk.db;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"CREATE_EVENTS_TABLE", "", "CREATE_USER_EVENT_LOGS_TABLE", "CREATE_PROFILE_EVENTS_TABLE", "CREATE_INBOX_MESSAGES_TABLE", "INBOX_MESSAGES_COMP_ID_USERID_INDEX", "EVENTS_TIME_INDEX", "PROFILE_EVENTS_TIME_INDEX", "CREATE_PUSH_NOTIFICATIONS_TABLE", "PUSH_NOTIFICATIONS_TIME_INDEX", "CREATE_UNINSTALL_TS_TABLE", "UNINSTALL_TS_INDEX", "CREATE_NOTIFICATION_VIEWED_TABLE", "NOTIFICATION_VIEWED_INDEX", "DROP_TABLE_UNINSTALL_TS", "DROP_TABLE_INBOX_MESSAGES", "DROP_TABLE_PUSH_NOTIFICATION_VIEWED", "CREATE_USER_PROFILES_TABLE", "CREATE_TEMP_USER_PROFILES_TABLE", "DROP_USER_PROFILES_TABLE", "RENAME_USER_PROFILES_TABLE", "clevertap-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CtDatabaseKt {

    @NotNull
    private static final String CREATE_EVENTS_TABLE;

    @NotNull
    private static final String CREATE_INBOX_MESSAGES_TABLE;

    @NotNull
    private static final String CREATE_NOTIFICATION_VIEWED_TABLE;

    @NotNull
    private static final String CREATE_PROFILE_EVENTS_TABLE;

    @NotNull
    private static final String CREATE_PUSH_NOTIFICATIONS_TABLE;

    @NotNull
    private static final String CREATE_TEMP_USER_PROFILES_TABLE;

    @NotNull
    private static final String CREATE_UNINSTALL_TS_TABLE;

    @NotNull
    private static final String CREATE_USER_EVENT_LOGS_TABLE;

    @NotNull
    private static final String CREATE_USER_PROFILES_TABLE;

    @NotNull
    private static final String DROP_TABLE_INBOX_MESSAGES;

    @NotNull
    private static final String DROP_TABLE_PUSH_NOTIFICATION_VIEWED;

    @NotNull
    private static final String DROP_TABLE_UNINSTALL_TS;

    @NotNull
    private static final String DROP_USER_PROFILES_TABLE;

    @NotNull
    private static final String EVENTS_TIME_INDEX;

    @NotNull
    private static final String INBOX_MESSAGES_COMP_ID_USERID_INDEX;

    @NotNull
    private static final String NOTIFICATION_VIEWED_INDEX;

    @NotNull
    private static final String PROFILE_EVENTS_TIME_INDEX;

    @NotNull
    private static final String PUSH_NOTIFICATIONS_TIME_INDEX;

    @NotNull
    private static final String RENAME_USER_PROFILES_TABLE;

    @NotNull
    private static final String UNINSTALL_TS_INDEX;

    static {
        StringBuilder sb2 = new StringBuilder("\n    CREATE TABLE ");
        Table table = Table.EVENTS;
        sb2.append(table.getTableName());
        sb2.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        data STRING NOT NULL,\n        created_at INTEGER NOT NULL\n    );\n");
        CREATE_EVENTS_TABLE = sb2.toString();
        CREATE_USER_EVENT_LOGS_TABLE = "\n    CREATE TABLE " + Table.USER_EVENT_LOGS_TABLE.getTableName() + " (\n        deviceID STRING NOT NULL,\n        eventName STRING NOT NULL,\n        normalizedEventName STRING NOT NULL,\n        firstTs INTEGER NOT NULL,\n        lastTs INTEGER NOT NULL,\n        count INTEGER NOT NULL,\n        PRIMARY KEY (deviceID, normalizedEventName)\n    );\n";
        StringBuilder sb3 = new StringBuilder("\n    CREATE TABLE ");
        Table table2 = Table.PROFILE_EVENTS;
        sb3.append(table2.getTableName());
        sb3.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        data STRING NOT NULL,\n        created_at INTEGER NOT NULL\n    );\n");
        CREATE_PROFILE_EVENTS_TABLE = sb3.toString();
        StringBuilder sb4 = new StringBuilder(" \n    CREATE TABLE ");
        Table table3 = Table.INBOX_MESSAGES;
        sb4.append(table3.getTableName());
        sb4.append(" (\n        _id STRING NOT NULL,\n        data TEXT NOT NULL,\n        wzrkParams TEXT NOT NULL,\n        campaignId STRING NOT NULL,\n        tags TEXT NOT NULL,\n        isRead INTEGER NOT NULL DEFAULT 0,\n        expires INTEGER NOT NULL,\n        created_at INTEGER NOT NULL,\n        messageUser STRING NOT NULL\n    );\n");
        CREATE_INBOX_MESSAGES_TABLE = sb4.toString();
        INBOX_MESSAGES_COMP_ID_USERID_INDEX = "\n    CREATE UNIQUE INDEX IF NOT EXISTS userid_id_idx ON " + table3.getTableName() + " (\n        messageUser,\n        _id\n    );\n";
        EVENTS_TIME_INDEX = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + table.getTableName() + " (created_at);\n";
        PROFILE_EVENTS_TIME_INDEX = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + table2.getTableName() + " ( created_at);\n";
        StringBuilder sb5 = new StringBuilder("\n    CREATE TABLE ");
        Table table4 = Table.PUSH_NOTIFICATIONS;
        sb5.append(table4.getTableName());
        sb5.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        data STRING NOT NULL,\n        created_at INTEGER NOT NULL,\n        isRead INTEGER NOT NULL\n    );\n");
        CREATE_PUSH_NOTIFICATIONS_TABLE = sb5.toString();
        PUSH_NOTIFICATIONS_TIME_INDEX = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + table4.getTableName() + " (created_at);\n";
        StringBuilder sb6 = new StringBuilder("\n    CREATE TABLE ");
        Table table5 = Table.UNINSTALL_TS;
        sb6.append(table5.getTableName());
        sb6.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        created_at INTEGER NOT NULL\n    );\n");
        CREATE_UNINSTALL_TS_TABLE = sb6.toString();
        UNINSTALL_TS_INDEX = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + table5.getTableName() + " (created_at);\n";
        StringBuilder sb7 = new StringBuilder("\n    CREATE TABLE ");
        Table table6 = Table.PUSH_NOTIFICATION_VIEWED;
        sb7.append(table6.getTableName());
        sb7.append(" (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        data STRING NOT NULL,\n        created_at INTEGER NOT NULL\n    );\n");
        CREATE_NOTIFICATION_VIEWED_TABLE = sb7.toString();
        NOTIFICATION_VIEWED_INDEX = "\n    CREATE INDEX IF NOT EXISTS time_idx ON " + table6.getTableName() + " (created_at);\n";
        StringBuilder sb8 = new StringBuilder("DROP TABLE IF EXISTS ");
        sb8.append(table5.getTableName());
        DROP_TABLE_UNINSTALL_TS = sb8.toString();
        DROP_TABLE_INBOX_MESSAGES = "DROP TABLE IF EXISTS " + table3.getTableName();
        DROP_TABLE_PUSH_NOTIFICATION_VIEWED = "DROP TABLE IF EXISTS " + table6.getTableName();
        StringBuilder sb9 = new StringBuilder("\n    CREATE TABLE ");
        Table table7 = Table.USER_PROFILES;
        sb9.append(table7.getTableName());
        sb9.append(" (\n        deviceID STRING NOT NULL,\n        _id STRING NOT NULL,\n        data STRING NOT NULL,\n        PRIMARY KEY (_id, deviceID)\n    );\n");
        CREATE_USER_PROFILES_TABLE = sb9.toString();
        CREATE_TEMP_USER_PROFILES_TABLE = "\n    CREATE TABLE temp_" + table7.getTableName() + " (\n        _id STRING NOT NULL,\n        deviceID STRING NOT NULL,\n        data STRING NOT NULL,\n        PRIMARY KEY (_id, deviceID)\n    );\n";
        DROP_USER_PROFILES_TABLE = "\n    DROP TABLE " + table7.getTableName() + ";\n";
        RENAME_USER_PROFILES_TABLE = "\n    ALTER TABLE temp_" + table7.getTableName() + " RENAME TO " + table7.getTableName() + ";\n";
    }
}
