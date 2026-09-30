package com.clevertap.android.sdk.db;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/clevertap/android/sdk/db/Column;", "", "<init>", "()V", "ID", "", "DATA", "CREATED_AT", "IS_READ", "EXPIRES", "TAGS", "USER_ID", "CAMPAIGN", "WZRKPARAMS", "DEVICE_ID", "EVENT_NAME", "NORMALIZED_EVENT_NAME", "FIRST_TS", "LAST_TS", "COUNT", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Column {

    @NotNull
    public static final String CAMPAIGN = "campaignId";

    @NotNull
    public static final String COUNT = "count";

    @NotNull
    public static final String CREATED_AT = "created_at";

    @NotNull
    public static final String DATA = "data";

    @NotNull
    public static final String DEVICE_ID = "deviceID";

    @NotNull
    public static final String EVENT_NAME = "eventName";

    @NotNull
    public static final String EXPIRES = "expires";

    @NotNull
    public static final String FIRST_TS = "firstTs";

    @NotNull
    public static final String ID = "_id";

    @NotNull
    public static final Column INSTANCE = new Column();

    @NotNull
    public static final String IS_READ = "isRead";

    @NotNull
    public static final String LAST_TS = "lastTs";

    @NotNull
    public static final String NORMALIZED_EVENT_NAME = "normalizedEventName";

    @NotNull
    public static final String TAGS = "tags";

    @NotNull
    public static final String USER_ID = "messageUser";

    @NotNull
    public static final String WZRKPARAMS = "wzrkParams";

    private Column() {
    }
}
