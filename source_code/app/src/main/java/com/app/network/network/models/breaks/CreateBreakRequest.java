package com.app.network.network.models.breaks;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/app/network/network/models/breaks/CreateBreakRequest;", "Ljava/io/Serializable;", "shiftId", "", "durationMinutes", "", "<init>", "(JI)V", "getShiftId", "()J", "getDurationMinutes", "()I", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "toString", "", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreateBreakRequest implements Serializable {
    private final int durationMinutes;
    private final long shiftId;

    public CreateBreakRequest(long j5, int i4) {
        this.shiftId = j5;
        this.durationMinutes = i4;
    }

    public static /* synthetic */ CreateBreakRequest copy$default(CreateBreakRequest createBreakRequest, long j5, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = createBreakRequest.shiftId;
        }
        if ((i5 & 2) != 0) {
            i4 = createBreakRequest.durationMinutes;
        }
        return createBreakRequest.copy(j5, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getShiftId() {
        return this.shiftId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDurationMinutes() {
        return this.durationMinutes;
    }

    @NotNull
    public final CreateBreakRequest copy(long shiftId, int durationMinutes) {
        return new CreateBreakRequest(shiftId, durationMinutes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateBreakRequest)) {
            return false;
        }
        CreateBreakRequest createBreakRequest = (CreateBreakRequest) other;
        return this.shiftId == createBreakRequest.shiftId && this.durationMinutes == createBreakRequest.durationMinutes;
    }

    public final int getDurationMinutes() {
        return this.durationMinutes;
    }

    public final long getShiftId() {
        return this.shiftId;
    }

    public int hashCode() {
        long j5 = this.shiftId;
        return (((int) (j5 ^ (j5 >>> 32))) * 31) + this.durationMinutes;
    }

    @NotNull
    public String toString() {
        return "CreateBreakRequest(shiftId=" + this.shiftId + ", durationMinutes=" + this.durationMinutes + ")";
    }
}
