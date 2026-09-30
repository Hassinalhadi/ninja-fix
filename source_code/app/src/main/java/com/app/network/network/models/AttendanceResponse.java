package com.app.network.network.models;

import P8.c;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/app/network/network/models/AttendanceResponse;", "", Constants.KEY_ID, "", "expiresAt", "", "<init>", "(JLjava/lang/String;)V", "getId", "()J", "getExpiresAt", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AttendanceResponse {

    @c("expiresAt")
    @NotNull
    private final String expiresAt;

    @c(Constants.KEY_ID)
    private final long id;

    public AttendanceResponse(long j5, @NotNull String expiresAt) {
        Intrinsics.echo(expiresAt, "expiresAt");
        this.id = j5;
        this.expiresAt = expiresAt;
    }

    public static /* synthetic */ AttendanceResponse copy$default(AttendanceResponse attendanceResponse, long j5, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = attendanceResponse.id;
        }
        if ((i4 & 2) != 0) {
            str = attendanceResponse.expiresAt;
        }
        return attendanceResponse.copy(j5, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    @NotNull
    public final AttendanceResponse copy(long id2, @NotNull String expiresAt) {
        Intrinsics.echo(expiresAt, "expiresAt");
        return new AttendanceResponse(id2, expiresAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttendanceResponse)) {
            return false;
        }
        AttendanceResponse attendanceResponse = (AttendanceResponse) other;
        return this.id == attendanceResponse.id && Intrinsics.areEqual(this.expiresAt, attendanceResponse.expiresAt);
    }

    @NotNull
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        long j5 = this.id;
        return this.expiresAt.hashCode() + (((int) (j5 ^ (j5 >>> 32))) * 31);
    }

    @NotNull
    public String toString() {
        return "AttendanceResponse(id=" + this.id + ", expiresAt=" + this.expiresAt + ")";
    }
}
