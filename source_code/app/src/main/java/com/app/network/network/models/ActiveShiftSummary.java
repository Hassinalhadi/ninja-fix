package com.app.network.network.models;

import P8.c;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/app/network/network/models/ActiveShiftSummary;", "Ljava/io/Serializable;", "<init>", "()V", "shiftId", "", "getShiftId", "()Ljava/lang/Long;", "setShiftId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "shiftStatus", "", "getShiftStatus", "()Ljava/lang/String;", "setShiftStatus", "(Ljava/lang/String;)V", "shiftStartAt", "getShiftStartAt", "setShiftStartAt", "shiftFinishAt", "getShiftFinishAt", "setShiftFinishAt", "ordersDelivered", "", "getOrdersDelivered", "()Ljava/lang/Integer;", "setOrdersDelivered", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "earnedPoints", "getEarnedPoints", "setEarnedPoints", "progressPercentage", "", "getProgressPercentage", "()Ljava/lang/Double;", "setProgressPercentage", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActiveShiftSummary implements Serializable {

    @Nullable
    private Integer earnedPoints;

    @c(alternate = {"deliveredOrdersCount"}, value = "ordersDelivered")
    @Nullable
    private Integer ordersDelivered;

    @Nullable
    private Double progressPercentage;

    @Nullable
    private String shiftFinishAt;

    @Nullable
    private Long shiftId;

    @Nullable
    private String shiftStartAt;

    @c(alternate = {"status"}, value = "shiftStatus")
    @Nullable
    private String shiftStatus;

    @Nullable
    public final Integer getEarnedPoints() {
        return this.earnedPoints;
    }

    @Nullable
    public final Integer getOrdersDelivered() {
        return this.ordersDelivered;
    }

    @Nullable
    public final Double getProgressPercentage() {
        return this.progressPercentage;
    }

    @Nullable
    public final String getShiftFinishAt() {
        return this.shiftFinishAt;
    }

    @Nullable
    public final Long getShiftId() {
        return this.shiftId;
    }

    @Nullable
    public final String getShiftStartAt() {
        return this.shiftStartAt;
    }

    @Nullable
    public final String getShiftStatus() {
        return this.shiftStatus;
    }

    public final void setEarnedPoints(@Nullable Integer num) {
        this.earnedPoints = num;
    }

    public final void setOrdersDelivered(@Nullable Integer num) {
        this.ordersDelivered = num;
    }

    public final void setProgressPercentage(@Nullable Double d4) {
        this.progressPercentage = d4;
    }

    public final void setShiftFinishAt(@Nullable String str) {
        this.shiftFinishAt = str;
    }

    public final void setShiftId(@Nullable Long l10) {
        this.shiftId = l10;
    }

    public final void setShiftStartAt(@Nullable String str) {
        this.shiftStartAt = str;
    }

    public final void setShiftStatus(@Nullable String str) {
        this.shiftStatus = str;
    }
}
