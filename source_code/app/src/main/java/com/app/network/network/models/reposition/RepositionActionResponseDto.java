package com.app.network.network.models.reposition;

import P8.c;
import androidx.annotation.Keep;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/app/network/network/models/reposition/RepositionActionResponseDto;", "", Constants.KEY_ID, "", "repositionRequestId", "orderId", "status", "", "<init>", "(JJJLjava/lang/String;)V", "getId", "()J", "getRepositionRequestId", "getOrderId", "getStatus", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RepositionActionResponseDto {

    @c(Constants.KEY_ID)
    private final long id;

    @c("orderId")
    private final long orderId;

    @c("repositionRequestId")
    private final long repositionRequestId;

    @c("status")
    @NotNull
    private final String status;

    public RepositionActionResponseDto(long j5, long j6, long j7, @NotNull String status) {
        Intrinsics.echo(status, "status");
        this.id = j5;
        this.repositionRequestId = j6;
        this.orderId = j7;
        this.status = status;
    }

    public static /* synthetic */ RepositionActionResponseDto copy$default(RepositionActionResponseDto repositionActionResponseDto, long j5, long j6, long j7, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = repositionActionResponseDto.id;
        }
        long j10 = j5;
        if ((i4 & 2) != 0) {
            j6 = repositionActionResponseDto.repositionRequestId;
        }
        long j11 = j6;
        if ((i4 & 4) != 0) {
            j7 = repositionActionResponseDto.orderId;
        }
        long j12 = j7;
        if ((i4 & 8) != 0) {
            str = repositionActionResponseDto.status;
        }
        return repositionActionResponseDto.copy(j10, j11, j12, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getRepositionRequestId() {
        return this.repositionRequestId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final RepositionActionResponseDto copy(long id2, long repositionRequestId, long orderId, @NotNull String status) {
        Intrinsics.echo(status, "status");
        return new RepositionActionResponseDto(id2, repositionRequestId, orderId, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepositionActionResponseDto)) {
            return false;
        }
        RepositionActionResponseDto repositionActionResponseDto = (RepositionActionResponseDto) other;
        return this.id == repositionActionResponseDto.id && this.repositionRequestId == repositionActionResponseDto.repositionRequestId && this.orderId == repositionActionResponseDto.orderId && Intrinsics.areEqual(this.status, repositionActionResponseDto.status);
    }

    public final long getId() {
        return this.id;
    }

    public final long getOrderId() {
        return this.orderId;
    }

    public final long getRepositionRequestId() {
        return this.repositionRequestId;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        long j5 = this.id;
        long j6 = this.repositionRequestId;
        int i4 = ((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.orderId;
        return this.status.hashCode() + ((i4 + ((int) ((j7 >>> 32) ^ j7))) * 31);
    }

    @NotNull
    public String toString() {
        long j5 = this.id;
        long j6 = this.repositionRequestId;
        long j7 = this.orderId;
        String str = this.status;
        StringBuilder uniform = Q0.c.uniform("RepositionActionResponseDto(id=", j5, ", repositionRequestId=");
        uniform.append(j6);
        Q0.c.amber(uniform, ", orderId=", j7, ", status=");
        return P0.gold(uniform, str, ")");
    }
}
