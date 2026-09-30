package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001e\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/app/network/network/models/WithdrawHistory;", "Ljava/io/Serializable;", "<init>", "()V", "status", "Lcom/app/network/network/models/WithdrawStatus;", "getStatus", "()Lcom/app/network/network/models/WithdrawStatus;", "setStatus", "(Lcom/app/network/network/models/WithdrawStatus;)V", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "statusDisplayName", "", "getStatusDisplayName", "()Ljava/lang/String;", "setStatusDisplayName", "(Ljava/lang/String;)V", "statusColor", "getStatusColor", "setStatusColor", "refusalReason", "getRefusalReason", "setRefusalReason", "refusalReasonMessage", "getRefusalReasonMessage", "setRefusalReasonMessage", Constants.KEY_ID, "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WithdrawHistory implements Serializable {

    @Nullable
    private Date createdAt;

    @Nullable
    private Integer id;

    @Nullable
    private String refusalReason;

    @Nullable
    private String refusalReasonMessage;

    @Nullable
    private WithdrawStatus status;

    @Nullable
    private String statusColor;

    @Nullable
    private String statusDisplayName;

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getRefusalReason() {
        return this.refusalReason;
    }

    @Nullable
    public final String getRefusalReasonMessage() {
        return this.refusalReasonMessage;
    }

    @Nullable
    public final WithdrawStatus getStatus() {
        return this.status;
    }

    @Nullable
    public final String getStatusColor() {
        return this.statusColor;
    }

    @Nullable
    public final String getStatusDisplayName() {
        return this.statusDisplayName;
    }

    public final void setCreatedAt(@Nullable Date date) {
        this.createdAt = date;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setRefusalReason(@Nullable String str) {
        this.refusalReason = str;
    }

    public final void setRefusalReasonMessage(@Nullable String str) {
        this.refusalReasonMessage = str;
    }

    public final void setStatus(@Nullable WithdrawStatus withdrawStatus) {
        this.status = withdrawStatus;
    }

    public final void setStatusColor(@Nullable String str) {
        this.statusColor = str;
    }

    public final void setStatusDisplayName(@Nullable String str) {
        this.statusDisplayName = str;
    }
}
