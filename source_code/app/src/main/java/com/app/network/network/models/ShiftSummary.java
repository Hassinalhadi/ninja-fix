package com.app.network.network.models;

import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0003fghB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010`\u001a\u00020\u0015J\u0006\u0010a\u001a\u00020\u0015J\u0006\u0010b\u001a\u00020\u0015J\u0006\u0010c\u001a\u00020\u0015J\u0006\u0010d\u001a\u00020\u0015J\u0006\u0010e\u001a\u00020\u0015R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001e\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001e\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u0010\u0019R\u001c\u00108\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0017\"\u0004\b:\u0010\u0019R\u001c\u0010;\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0017\"\u0004\b=\u0010\u0019R\u001c\u0010>\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0017\"\u0004\b@\u0010\u0019R\u001c\u0010A\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0017\"\u0004\bC\u0010\u0019R\u001c\u0010D\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0017\"\u0004\bF\u0010\u0019R\u001c\u0010G\u001a\u0004\u0018\u00010HX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010M\u001a\u0004\u0018\u00010HX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LR\u001c\u0010P\u001a\u0004\u0018\u00010HX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010J\"\u0004\bR\u0010LR\u001e\u0010S\u001a\u0004\u0018\u00010TX\u0086\u000e¢\u0006\u0010\n\u0002\u0010Y\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010Z\u001a\u0004\u0018\u00010HX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010J\"\u0004\b\\\u0010LR\u001c\u0010]\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0017\"\u0004\b_\u0010\u0019¨\u0006i"}, d2 = {"Lcom/app/network/network/models/ShiftSummary;", "Ljava/io/Serializable;", "<init>", "()V", "totalSlackTimeInSeconds", "", "getTotalSlackTimeInSeconds", "()Ljava/lang/Integer;", "setTotalSlackTimeInSeconds", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "totalBusyTimeInSeconds", "getTotalBusyTimeInSeconds", "setTotalBusyTimeInSeconds", "totalDeliveredOrders", "getTotalDeliveredOrders", "setTotalDeliveredOrders", "totalDeliveredOrdersOnTime", "getTotalDeliveredOrdersOnTime", "setTotalDeliveredOrdersOnTime", "ordersOnTimePercentage", "", "getOrdersOnTimePercentage", "()Ljava/lang/String;", "setOrdersOnTimePercentage", "(Ljava/lang/String;)V", "slackTimeInHours", "getSlackTimeInHours", "setSlackTimeInHours", "busyTimeInHours", "getBusyTimeInHours", "setBusyTimeInHours", "activeTimeInHours", "getActiveTimeInHours", "setActiveTimeInHours", "totalDisconnectedTimeInSeconds", "getTotalDisconnectedTimeInSeconds", "setTotalDisconnectedTimeInSeconds", "totalRoamingFreelyTimeInSeconds", "getTotalRoamingFreelyTimeInSeconds", "setTotalRoamingFreelyTimeInSeconds", "shift", "Lcom/app/network/network/models/ShiftSummary$Shift;", "getShift", "()Lcom/app/network/network/models/ShiftSummary$Shift;", "setShift", "(Lcom/app/network/network/models/ShiftSummary$Shift;)V", "walletTransaction", "Lcom/app/network/network/models/ShiftSummary$WalletTransaction;", "getWalletTransaction", "()Lcom/app/network/network/models/ShiftSummary$WalletTransaction;", "setWalletTransaction", "(Lcom/app/network/network/models/ShiftSummary$WalletTransaction;)V", "pickupCounts", "getPickupCounts", "setPickupCounts", "pickupOnTimePercentage", "getPickupOnTimePercentage", "setPickupOnTimePercentage", "deliveryCounts", "getDeliveryCounts", "setDeliveryCounts", "deliveryOnTimePercentage", "getDeliveryOnTimePercentage", "setDeliveryOnTimePercentage", "returningCounts", "getReturningCounts", "setReturningCounts", "returningOnTimePercentage", "getReturningOnTimePercentage", "setReturningOnTimePercentage", "shiftStartedAt", "Ljava/util/Date;", "getShiftStartedAt", "()Ljava/util/Date;", "setShiftStartedAt", "(Ljava/util/Date;)V", "firstInAreaAt", "getFirstInAreaAt", "setFirstInAreaAt", "createdAt", "getCreatedAt", "setCreatedAt", "totalCollectedCash", "", "getTotalCollectedCash", "()Ljava/lang/Double;", "setTotalCollectedCash", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "shiftCompletedAt", "getShiftCompletedAt", "setShiftCompletedAt", "status", "getStatus", "setStatus", "getBranchName", "getZoneName", "getEarnings", "getTotalDisconnectedTimeInMinutes", "getTotalRoamingTimeInMinutes", "getDelayInMinutes", "Shift", "Branch", "WalletTransaction", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShiftSummary implements Serializable {

    @Nullable
    private String activeTimeInHours;

    @Nullable
    private String busyTimeInHours;

    @Nullable
    private Date createdAt;

    @Nullable
    private String deliveryCounts;

    @Nullable
    private String deliveryOnTimePercentage;

    @Nullable
    private Date firstInAreaAt;

    @Nullable
    private String ordersOnTimePercentage;

    @Nullable
    private String pickupCounts;

    @Nullable
    private String pickupOnTimePercentage;

    @Nullable
    private String returningCounts;

    @Nullable
    private String returningOnTimePercentage;

    @Nullable
    private Shift shift;

    @Nullable
    private Date shiftCompletedAt;

    @Nullable
    private Date shiftStartedAt;

    @Nullable
    private String slackTimeInHours;

    @Nullable
    private String status;

    @Nullable
    private Integer totalBusyTimeInSeconds;

    @Nullable
    private Double totalCollectedCash;

    @Nullable
    private Integer totalDeliveredOrders;

    @Nullable
    private Integer totalDeliveredOrdersOnTime;

    @Nullable
    private Integer totalDisconnectedTimeInSeconds;

    @Nullable
    private Integer totalRoamingFreelyTimeInSeconds;

    @Nullable
    private Integer totalSlackTimeInSeconds;

    @Nullable
    private WalletTransaction walletTransaction;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/app/network/network/models/ShiftSummary$Branch;", "Ljava/io/Serializable;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Branch implements Serializable {

        @Nullable
        private String name;

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/app/network/network/models/ShiftSummary$Shift;", "Ljava/io/Serializable;", "<init>", "()V", "branch", "Lcom/app/network/network/models/ShiftSummary$Branch;", "getBranch", "()Lcom/app/network/network/models/ShiftSummary$Branch;", "setBranch", "(Lcom/app/network/network/models/ShiftSummary$Branch;)V", "zone", "Lcom/app/network/network/models/Zone;", "getZone", "()Lcom/app/network/network/models/Zone;", "setZone", "(Lcom/app/network/network/models/Zone;)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Shift implements Serializable {

        @Nullable
        private Branch branch;

        @Nullable
        private Zone zone;

        @Nullable
        public final Branch getBranch() {
            return this.branch;
        }

        @Nullable
        public final Zone getZone() {
            return this.zone;
        }

        public final void setBranch(@Nullable Branch branch) {
            this.branch = branch;
        }

        public final void setZone(@Nullable Zone zone) {
            this.zone = zone;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/app/network/network/models/ShiftSummary$WalletTransaction;", "Ljava/io/Serializable;", "<init>", "()V", "amount", "", "getAmount", "()Ljava/lang/Double;", "setAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class WalletTransaction implements Serializable {

        @Nullable
        private Double amount;

        @Nullable
        public final Double getAmount() {
            return this.amount;
        }

        public final void setAmount(@Nullable Double d4) {
            this.amount = d4;
        }
    }

    @Nullable
    public final String getActiveTimeInHours() {
        return this.activeTimeInHours;
    }

    @NotNull
    public final String getBranchName() {
        Branch branch;
        String name;
        Shift shift = this.shift;
        if (shift != null && (branch = shift.getBranch()) != null && (name = branch.getName()) != null) {
            return name;
        }
        return "-";
    }

    @Nullable
    public final String getBusyTimeInHours() {
        return this.busyTimeInHours;
    }

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getDelayInMinutes() {
        Date date = this.firstInAreaAt;
        if (date == null) {
            date = new Date();
        }
        long time = date.getTime();
        Date date2 = this.shiftStartedAt;
        if (date2 == null) {
            date2 = new Date();
        }
        return String.valueOf(((time - date2.getTime()) / 1000) / 60);
    }

    @Nullable
    public final String getDeliveryCounts() {
        return this.deliveryCounts;
    }

    @Nullable
    public final String getDeliveryOnTimePercentage() {
        return this.deliveryOnTimePercentage;
    }

    @NotNull
    public final String getEarnings() {
        Double d4;
        WalletTransaction walletTransaction = this.walletTransaction;
        if (walletTransaction != null) {
            d4 = walletTransaction.getAmount();
        } else {
            d4 = null;
        }
        if (d4 == null) {
            return "-";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d4);
        return sb2.toString();
    }

    @Nullable
    public final Date getFirstInAreaAt() {
        return this.firstInAreaAt;
    }

    @Nullable
    public final String getOrdersOnTimePercentage() {
        return this.ordersOnTimePercentage;
    }

    @Nullable
    public final String getPickupCounts() {
        return this.pickupCounts;
    }

    @Nullable
    public final String getPickupOnTimePercentage() {
        return this.pickupOnTimePercentage;
    }

    @Nullable
    public final String getReturningCounts() {
        return this.returningCounts;
    }

    @Nullable
    public final String getReturningOnTimePercentage() {
        return this.returningOnTimePercentage;
    }

    @Nullable
    public final Shift getShift() {
        return this.shift;
    }

    @Nullable
    public final Date getShiftCompletedAt() {
        return this.shiftCompletedAt;
    }

    @Nullable
    public final Date getShiftStartedAt() {
        return this.shiftStartedAt;
    }

    @Nullable
    public final String getSlackTimeInHours() {
        return this.slackTimeInHours;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getTotalBusyTimeInSeconds() {
        return this.totalBusyTimeInSeconds;
    }

    @Nullable
    public final Double getTotalCollectedCash() {
        return this.totalCollectedCash;
    }

    @Nullable
    public final Integer getTotalDeliveredOrders() {
        return this.totalDeliveredOrders;
    }

    @Nullable
    public final Integer getTotalDeliveredOrdersOnTime() {
        return this.totalDeliveredOrdersOnTime;
    }

    @NotNull
    public final String getTotalDisconnectedTimeInMinutes() {
        int i4;
        Integer num = this.totalDisconnectedTimeInSeconds;
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        return String.valueOf(i4 / 60);
    }

    @Nullable
    public final Integer getTotalDisconnectedTimeInSeconds() {
        return this.totalDisconnectedTimeInSeconds;
    }

    @Nullable
    public final Integer getTotalRoamingFreelyTimeInSeconds() {
        return this.totalRoamingFreelyTimeInSeconds;
    }

    @NotNull
    public final String getTotalRoamingTimeInMinutes() {
        int i4;
        Integer num = this.totalRoamingFreelyTimeInSeconds;
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        return String.valueOf(i4 / 60);
    }

    @Nullable
    public final Integer getTotalSlackTimeInSeconds() {
        return this.totalSlackTimeInSeconds;
    }

    @Nullable
    public final WalletTransaction getWalletTransaction() {
        return this.walletTransaction;
    }

    @NotNull
    public final String getZoneName() {
        Zone zone;
        String name;
        Shift shift = this.shift;
        if (shift != null && (zone = shift.getZone()) != null && (name = zone.getName()) != null) {
            return name;
        }
        return "-";
    }

    public final void setActiveTimeInHours(@Nullable String str) {
        this.activeTimeInHours = str;
    }

    public final void setBusyTimeInHours(@Nullable String str) {
        this.busyTimeInHours = str;
    }

    public final void setCreatedAt(@Nullable Date date) {
        this.createdAt = date;
    }

    public final void setDeliveryCounts(@Nullable String str) {
        this.deliveryCounts = str;
    }

    public final void setDeliveryOnTimePercentage(@Nullable String str) {
        this.deliveryOnTimePercentage = str;
    }

    public final void setFirstInAreaAt(@Nullable Date date) {
        this.firstInAreaAt = date;
    }

    public final void setOrdersOnTimePercentage(@Nullable String str) {
        this.ordersOnTimePercentage = str;
    }

    public final void setPickupCounts(@Nullable String str) {
        this.pickupCounts = str;
    }

    public final void setPickupOnTimePercentage(@Nullable String str) {
        this.pickupOnTimePercentage = str;
    }

    public final void setReturningCounts(@Nullable String str) {
        this.returningCounts = str;
    }

    public final void setReturningOnTimePercentage(@Nullable String str) {
        this.returningOnTimePercentage = str;
    }

    public final void setShift(@Nullable Shift shift) {
        this.shift = shift;
    }

    public final void setShiftCompletedAt(@Nullable Date date) {
        this.shiftCompletedAt = date;
    }

    public final void setShiftStartedAt(@Nullable Date date) {
        this.shiftStartedAt = date;
    }

    public final void setSlackTimeInHours(@Nullable String str) {
        this.slackTimeInHours = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setTotalBusyTimeInSeconds(@Nullable Integer num) {
        this.totalBusyTimeInSeconds = num;
    }

    public final void setTotalCollectedCash(@Nullable Double d4) {
        this.totalCollectedCash = d4;
    }

    public final void setTotalDeliveredOrders(@Nullable Integer num) {
        this.totalDeliveredOrders = num;
    }

    public final void setTotalDeliveredOrdersOnTime(@Nullable Integer num) {
        this.totalDeliveredOrdersOnTime = num;
    }

    public final void setTotalDisconnectedTimeInSeconds(@Nullable Integer num) {
        this.totalDisconnectedTimeInSeconds = num;
    }

    public final void setTotalRoamingFreelyTimeInSeconds(@Nullable Integer num) {
        this.totalRoamingFreelyTimeInSeconds = num;
    }

    public final void setTotalSlackTimeInSeconds(@Nullable Integer num) {
        this.totalSlackTimeInSeconds = num;
    }

    public final void setWalletTransaction(@Nullable WalletTransaction walletTransaction) {
        this.walletTransaction = walletTransaction;
    }
}
