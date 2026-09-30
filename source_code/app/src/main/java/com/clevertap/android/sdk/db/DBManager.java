package com.clevertap.android.sdk.db;

import android.content.Context;
import b.c0;
import com.clevertap.android.sdk.CTLockManager;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.network.IJRepo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J*\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016J*\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016J \u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0017J\u0018\u0010#\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0017J\"\u0010$\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010&\u001a\u00020\nH\u0002J\u0010\u0010'\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010(\u001a\u00020\nH\u0002J \u0010)\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/clevertap/android/sdk/db/DBManager;", "Lcom/clevertap/android/sdk/db/BaseDatabaseManager;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "ctLockManager", "Lcom/clevertap/android/sdk/CTLockManager;", "ijRepo", "Lcom/clevertap/android/sdk/network/IJRepo;", "clearFirstRequestTs", "Lkotlin/Function0;", "", "clearLastRequestTs", "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lcom/clevertap/android/sdk/CTLockManager;Lcom/clevertap/android/sdk/network/IJRepo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "dbAdapter", "Lcom/clevertap/android/sdk/db/DBAdapter;", "loadDBAdapter", "context", "Landroid/content/Context;", "clearQueues", "getQueuedEvents", "Lcom/clevertap/android/sdk/db/QueueData;", "batchSize", "", "previousQueue", "eventGroup", "Lcom/clevertap/android/sdk/events/EventGroup;", "getQueuedDBEvents", "getQueue", "table", "Lcom/clevertap/android/sdk/db/Table;", "queueEventToDB", com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, "Lorg/json/JSONObject;", Constants.KEY_TYPE, "queuePushNotificationViewedEventToDB", "getPushNotificationViewedQueuedEvents", "clearIJ", "clearLastRequestTimestamp", "clearUserContext", "clearFirstRequestTimestamp", "queueEventForTable", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DBManager implements BaseDatabaseManager {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int USER_EVENT_LOG_ROWS_PER_USER = 2304;
    private static final int USER_EVENT_LOG_ROWS_THRESHOLD = 11520;

    @NotNull
    private final Function0<Unit> clearFirstRequestTs;

    @NotNull
    private final Function0<Unit> clearLastRequestTs;

    @NotNull
    private final CleverTapInstanceConfig config;

    @NotNull
    private final CTLockManager ctLockManager;

    @Nullable
    private DBAdapter dbAdapter;

    @NotNull
    private final IJRepo ijRepo;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/clevertap/android/sdk/db/DBManager$Companion;", "", "<init>", "()V", "USER_EVENT_LOG_ROWS_PER_USER", "", "USER_EVENT_LOG_ROWS_THRESHOLD", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DBManager(@NotNull CleverTapInstanceConfig config, @NotNull CTLockManager ctLockManager, @NotNull IJRepo ijRepo, @NotNull Function0<Unit> clearFirstRequestTs, @NotNull Function0<Unit> clearLastRequestTs) {
        Intrinsics.echo(config, "config");
        Intrinsics.echo(ctLockManager, "ctLockManager");
        Intrinsics.echo(ijRepo, "ijRepo");
        Intrinsics.echo(clearFirstRequestTs, "clearFirstRequestTs");
        Intrinsics.echo(clearLastRequestTs, "clearLastRequestTs");
        this.config = config;
        this.ctLockManager = ctLockManager;
        this.ijRepo = ijRepo;
        this.clearFirstRequestTs = clearFirstRequestTs;
        this.clearLastRequestTs = clearLastRequestTs;
    }

    public static /* synthetic */ Unit alpha() {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit bravo() {
        return Unit.INSTANCE;
    }

    private final void clearFirstRequestTimestamp() {
        this.clearFirstRequestTs.invoke();
    }

    private final void clearIJ(Context context) {
        this.ijRepo.clearIJ(context);
    }

    private final void clearLastRequestTimestamp() {
        this.clearLastRequestTs.invoke();
    }

    private final void clearUserContext(Context context) {
        clearIJ(context);
        clearFirstRequestTimestamp();
        clearLastRequestTimestamp();
    }

    private final void queueEventForTable(Context context, JSONObject r92, Table table) {
        Object eventLock = this.ctLockManager.getEventLock();
        Intrinsics.delta(eventLock, "getEventLock(...)");
        synchronized (eventLock) {
            if (loadDBAdapter(context).storeObject(r92, table) > 0) {
                this.config.getLogger().debug(this.config.getAccountId(), "Queued event: " + r92);
                this.config.getLogger().verbose(this.config.getAccountId(), "Queued event to DB table " + table + ": " + r92);
            }
        }
    }

    @Override // com.clevertap.android.sdk.db.BaseDatabaseManager
    public void clearQueues(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        Object eventLock = this.ctLockManager.getEventLock();
        Intrinsics.delta(eventLock, "getEventLock(...)");
        synchronized (eventLock) {
            DBAdapter loadDBAdapter = loadDBAdapter(context);
            loadDBAdapter.removeEvents(Table.EVENTS);
            loadDBAdapter.removeEvents(Table.PROFILE_EVENTS);
            clearUserContext(context);
        }
    }

    @Override // com.clevertap.android.sdk.db.BaseDatabaseManager
    @NotNull
    public QueueData getPushNotificationViewedQueuedEvents(@NotNull Context context, int batchSize, @Nullable QueueData previousQueue) {
        Intrinsics.echo(context, "context");
        return getQueue(context, Table.PUSH_NOTIFICATION_VIEWED, batchSize, previousQueue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r1 = r6.getLastId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        r3.cleanupEventsFromLastId(r1, r6.getTable());
     */
    @Override // com.clevertap.android.sdk.db.BaseDatabaseManager
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QueueData getQueue(@NotNull Context context, @NotNull Table table, int batchSize, @Nullable QueueData previousQueue) {
        QueueData queueData;
        Table table2;
        Intrinsics.echo(context, "context");
        Intrinsics.echo(table, "table");
        Object eventLock = this.ctLockManager.getEventLock();
        Intrinsics.delta(eventLock, "getEventLock(...)");
        synchronized (eventLock) {
            try {
                DBAdapter loadDBAdapter = loadDBAdapter(context);
                if (previousQueue != null && (table2 = previousQueue.getTable()) != null) {
                    table = table2;
                }
                JSONObject fetchEvents = loadDBAdapter.fetchEvents(table, batchSize);
                queueData = new QueueData(table);
                queueData.setDataFromDbObject(fetchEvents);
            } catch (Throwable th) {
                throw th;
            }
        }
        return queueData;
    }

    @Override // com.clevertap.android.sdk.db.BaseDatabaseManager
    @NotNull
    public QueueData getQueuedDBEvents(@NotNull Context context, int batchSize, @Nullable QueueData previousQueue) {
        QueueData queue;
        Intrinsics.echo(context, "context");
        Object eventLock = this.ctLockManager.getEventLock();
        Intrinsics.delta(eventLock, "getEventLock(...)");
        synchronized (eventLock) {
            Table table = Table.EVENTS;
            queue = getQueue(context, table, batchSize, previousQueue);
            if (queue.isEmpty() && queue.getTable() == table) {
                queue = getQueue(context, Table.PROFILE_EVENTS, batchSize, null);
            }
        }
        return queue;
    }

    @Override // com.clevertap.android.sdk.db.BaseDatabaseManager
    @NotNull
    public QueueData getQueuedEvents(@NotNull Context context, int batchSize, @Nullable QueueData previousQueue, @NotNull EventGroup eventGroup) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(eventGroup, "eventGroup");
        if (eventGroup == EventGroup.PUSH_NOTIFICATION_VIEWED) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Returning Queued Notification Viewed events");
            return getPushNotificationViewedQueuedEvents(context, batchSize, previousQueue);
        }
        this.config.getLogger().verbose(this.config.getAccountId(), "Returning Queued events");
        return getQueuedDBEvents(context, batchSize, previousQueue);
    }

    @Override // com.clevertap.android.sdk.db.BaseDatabaseManager
    @NotNull
    public synchronized DBAdapter loadDBAdapter(@NotNull Context context) {
        DBAdapter dBAdapter;
        Intrinsics.echo(context, "context");
        dBAdapter = this.dbAdapter;
        if (dBAdapter == null) {
            dBAdapter = new DBAdapter(context, this.config);
            this.dbAdapter = dBAdapter;
            dBAdapter.cleanupStaleEvents(Table.EVENTS);
            dBAdapter.cleanupStaleEvents(Table.PROFILE_EVENTS);
            dBAdapter.cleanupStaleEvents(Table.PUSH_NOTIFICATION_VIEWED);
            dBAdapter.cleanUpPushNotifications();
            dBAdapter.userEventLogDAO().cleanUpExtraEvents(USER_EVENT_LOG_ROWS_THRESHOLD, USER_EVENT_LOG_ROWS_PER_USER);
        }
        return dBAdapter;
    }

    @Override // com.clevertap.android.sdk.db.BaseDatabaseManager
    public void queueEventToDB(@NotNull Context context, @NotNull JSONObject r32, int r4) {
        Table table;
        Intrinsics.echo(context, "context");
        Intrinsics.echo(r32, "event");
        if (r4 == 3) {
            table = Table.PROFILE_EVENTS;
        } else {
            table = Table.EVENTS;
        }
        queueEventForTable(context, r32, table);
    }

    @Override // com.clevertap.android.sdk.db.BaseDatabaseManager
    public void queuePushNotificationViewedEventToDB(@NotNull Context context, @NotNull JSONObject r32) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(r32, "event");
        queueEventForTable(context, r32, Table.PUSH_NOTIFICATION_VIEWED);
    }

    public /* synthetic */ DBManager(CleverTapInstanceConfig cleverTapInstanceConfig, CTLockManager cTLockManager, IJRepo iJRepo, Function0 function0, Function0 function02, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(cleverTapInstanceConfig, cTLockManager, iJRepo, (i4 & 8) != 0 ? new c0(21) : function0, (i4 & 16) != 0 ? new c0(22) : function02);
    }
}
