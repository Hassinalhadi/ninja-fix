package com.clevertap.android.sdk.db;

import android.content.Context;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.leanplum.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eH&J\"\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tH&J*\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tH&J \u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH&J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H&J\"\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tH&¨\u0006\u0019"}, d2 = {"Lcom/clevertap/android/sdk/db/BaseDatabaseManager;", "", "loadDBAdapter", "Lcom/clevertap/android/sdk/db/DBAdapter;", "context", "Landroid/content/Context;", "clearQueues", "", "getQueuedEvents", "Lcom/clevertap/android/sdk/db/QueueData;", "batchSize", "", "previousQueue", "eventGroup", "Lcom/clevertap/android/sdk/events/EventGroup;", "getQueuedDBEvents", "getQueue", "table", "Lcom/clevertap/android/sdk/db/Table;", "queueEventToDB", Constants.CHARGED_EVENT_PARAM, "Lorg/json/JSONObject;", com.clevertap.android.sdk.Constants.KEY_TYPE, "queuePushNotificationViewedEventToDB", "getPushNotificationViewedQueuedEvents", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BaseDatabaseManager {
    void clearQueues(@NotNull Context context);

    @NotNull
    QueueData getPushNotificationViewedQueuedEvents(@NotNull Context context, int batchSize, @Nullable QueueData previousQueue);

    @NotNull
    QueueData getQueue(@NotNull Context context, @NotNull Table table, int batchSize, @Nullable QueueData previousQueue);

    @NotNull
    QueueData getQueuedDBEvents(@NotNull Context context, int batchSize, @Nullable QueueData previousQueue);

    @NotNull
    QueueData getQueuedEvents(@NotNull Context context, int batchSize, @Nullable QueueData previousQueue, @NotNull EventGroup eventGroup);

    @NotNull
    DBAdapter loadDBAdapter(@NotNull Context context);

    void queueEventToDB(@NotNull Context context, @NotNull JSONObject event, int type);

    void queuePushNotificationViewedEventToDB(@NotNull Context context, @NotNull JSONObject event);
}
