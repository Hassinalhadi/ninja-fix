package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/app/network/network/models/AttendanceRegistryRequest;", "", "attendanceKey", "", "channel", "Lcom/app/network/network/models/PlatformAreaAttendanceChannelEnum;", "<init>", "(Ljava/lang/String;Lcom/app/network/network/models/PlatformAreaAttendanceChannelEnum;)V", "getAttendanceKey", "()Ljava/lang/String;", "getChannel", "()Lcom/app/network/network/models/PlatformAreaAttendanceChannelEnum;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AttendanceRegistryRequest {

    @NotNull
    private final String attendanceKey;

    @NotNull
    private final PlatformAreaAttendanceChannelEnum channel;

    public AttendanceRegistryRequest(@NotNull String attendanceKey, @NotNull PlatformAreaAttendanceChannelEnum channel) {
        Intrinsics.echo(attendanceKey, "attendanceKey");
        Intrinsics.echo(channel, "channel");
        this.attendanceKey = attendanceKey;
        this.channel = channel;
    }

    public static /* synthetic */ AttendanceRegistryRequest copy$default(AttendanceRegistryRequest attendanceRegistryRequest, String str, PlatformAreaAttendanceChannelEnum platformAreaAttendanceChannelEnum, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = attendanceRegistryRequest.attendanceKey;
        }
        if ((i4 & 2) != 0) {
            platformAreaAttendanceChannelEnum = attendanceRegistryRequest.channel;
        }
        return attendanceRegistryRequest.copy(str, platformAreaAttendanceChannelEnum);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAttendanceKey() {
        return this.attendanceKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PlatformAreaAttendanceChannelEnum getChannel() {
        return this.channel;
    }

    @NotNull
    public final AttendanceRegistryRequest copy(@NotNull String attendanceKey, @NotNull PlatformAreaAttendanceChannelEnum channel) {
        Intrinsics.echo(attendanceKey, "attendanceKey");
        Intrinsics.echo(channel, "channel");
        return new AttendanceRegistryRequest(attendanceKey, channel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttendanceRegistryRequest)) {
            return false;
        }
        AttendanceRegistryRequest attendanceRegistryRequest = (AttendanceRegistryRequest) other;
        return Intrinsics.areEqual(this.attendanceKey, attendanceRegistryRequest.attendanceKey) && this.channel == attendanceRegistryRequest.channel;
    }

    @NotNull
    public final String getAttendanceKey() {
        return this.attendanceKey;
    }

    @NotNull
    public final PlatformAreaAttendanceChannelEnum getChannel() {
        return this.channel;
    }

    public int hashCode() {
        return this.channel.hashCode() + (this.attendanceKey.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AttendanceRegistryRequest(attendanceKey=" + this.attendanceKey + ", channel=" + this.channel + ")";
    }
}
