package com.clevertap.android.sdk.usereventlogs;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/clevertap/android/sdk/usereventlogs/UserEventLog;", "", "eventName", "", Column.NORMALIZED_EVENT_NAME, Column.FIRST_TS, "", Column.LAST_TS, "countOfEvents", "", Column.DEVICE_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "getNormalizedEventName", "getFirstTs", "()J", "getLastTs", "getCountOfEvents", "()I", "getDeviceID", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UserEventLog {
    private final int countOfEvents;

    @NotNull
    private final String deviceID;

    @NotNull
    private final String eventName;
    private final long firstTs;
    private final long lastTs;

    @NotNull
    private final String normalizedEventName;

    public UserEventLog(@NotNull String eventName, @NotNull String normalizedEventName, long j5, long j6, int i4, @NotNull String deviceID) {
        Intrinsics.echo(eventName, "eventName");
        Intrinsics.echo(normalizedEventName, "normalizedEventName");
        Intrinsics.echo(deviceID, "deviceID");
        this.eventName = eventName;
        this.normalizedEventName = normalizedEventName;
        this.firstTs = j5;
        this.lastTs = j6;
        this.countOfEvents = i4;
        this.deviceID = deviceID;
    }

    public static /* synthetic */ UserEventLog copy$default(UserEventLog userEventLog, String str, String str2, long j5, long j6, int i4, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = userEventLog.eventName;
        }
        if ((i5 & 2) != 0) {
            str2 = userEventLog.normalizedEventName;
        }
        if ((i5 & 4) != 0) {
            j5 = userEventLog.firstTs;
        }
        if ((i5 & 8) != 0) {
            j6 = userEventLog.lastTs;
        }
        if ((i5 & 16) != 0) {
            i4 = userEventLog.countOfEvents;
        }
        if ((i5 & 32) != 0) {
            str3 = userEventLog.deviceID;
        }
        long j7 = j6;
        long j10 = j5;
        return userEventLog.copy(str, str2, j10, j7, i4, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNormalizedEventName() {
        return this.normalizedEventName;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFirstTs() {
        return this.firstTs;
    }

    /* renamed from: component4, reason: from getter */
    public final long getLastTs() {
        return this.lastTs;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCountOfEvents() {
        return this.countOfEvents;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getDeviceID() {
        return this.deviceID;
    }

    @NotNull
    public final UserEventLog copy(@NotNull String eventName, @NotNull String normalizedEventName, long firstTs, long lastTs, int countOfEvents, @NotNull String deviceID) {
        Intrinsics.echo(eventName, "eventName");
        Intrinsics.echo(normalizedEventName, "normalizedEventName");
        Intrinsics.echo(deviceID, "deviceID");
        return new UserEventLog(eventName, normalizedEventName, firstTs, lastTs, countOfEvents, deviceID);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserEventLog)) {
            return false;
        }
        UserEventLog userEventLog = (UserEventLog) other;
        return Intrinsics.areEqual(this.eventName, userEventLog.eventName) && Intrinsics.areEqual(this.normalizedEventName, userEventLog.normalizedEventName) && this.firstTs == userEventLog.firstTs && this.lastTs == userEventLog.lastTs && this.countOfEvents == userEventLog.countOfEvents && Intrinsics.areEqual(this.deviceID, userEventLog.deviceID);
    }

    public final int getCountOfEvents() {
        return this.countOfEvents;
    }

    @NotNull
    public final String getDeviceID() {
        return this.deviceID;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public final long getFirstTs() {
        return this.firstTs;
    }

    public final long getLastTs() {
        return this.lastTs;
    }

    @NotNull
    public final String getNormalizedEventName() {
        return this.normalizedEventName;
    }

    public int hashCode() {
        int sierra = AbstractC2327c.sierra(this.eventName.hashCode() * 31, 31, this.normalizedEventName);
        long j5 = this.firstTs;
        int i4 = (sierra + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.lastTs;
        return this.deviceID.hashCode() + ((((i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.countOfEvents) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserEventLog(eventName=");
        sb2.append(this.eventName);
        sb2.append(", normalizedEventName=");
        sb2.append(this.normalizedEventName);
        sb2.append(", firstTs=");
        sb2.append(this.firstTs);
        sb2.append(", lastTs=");
        sb2.append(this.lastTs);
        sb2.append(", countOfEvents=");
        sb2.append(this.countOfEvents);
        sb2.append(", deviceID=");
        return P0.fuchsia(sb2, this.deviceID, ')');
    }
}
