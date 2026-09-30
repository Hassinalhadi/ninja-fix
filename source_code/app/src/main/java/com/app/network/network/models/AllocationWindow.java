package com.app.network.network.models;

import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/app/network/network/models/AllocationWindow;", "Ljava/io/Serializable;", "<init>", "()V", "assignedAt", "Ljava/util/Date;", "getAssignedAt", "()Ljava/util/Date;", "setAssignedAt", "(Ljava/util/Date;)V", "captainId", "", "getCaptainId", "()Ljava/lang/Integer;", "setCaptainId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AllocationWindow implements Serializable {

    @Nullable
    private Date assignedAt;

    @Nullable
    private Integer captainId;

    @Nullable
    public final Date getAssignedAt() {
        return this.assignedAt;
    }

    @Nullable
    public final Integer getCaptainId() {
        return this.captainId;
    }

    public final void setAssignedAt(@Nullable Date date) {
        this.assignedAt = date;
    }

    public final void setCaptainId(@Nullable Integer num) {
        this.captainId = num;
    }
}
