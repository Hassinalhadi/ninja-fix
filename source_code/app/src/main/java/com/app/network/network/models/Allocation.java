package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\rR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\u001e\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/app/network/network/models/Allocation;", "", "<init>", "()V", "order", "Lcom/app/network/network/models/Order;", "getOrder", "()Lcom/app/network/network/models/Order;", "setOrder", "(Lcom/app/network/network/models/Order;)V", "earnings", "", "getEarnings", "()Ljava/lang/Double;", "setEarnings", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "pickupDistanceInKm", "getPickupDistanceInKm", "deliveryDistanceInKm", "getDeliveryDistanceInKm", "distanceInKm", "getDistanceInKm", "setDistanceInKm", "tripCount", "", "getTripCount", "()Ljava/lang/Integer;", "setTripCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", Constants.KEY_ID, "getId", "setId", "showAllocationWindow", "", "getShowAllocationWindow", "()Ljava/lang/Boolean;", "setShowAllocationWindow", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Allocation {

    @Nullable
    private Date createdAt;

    @Nullable
    private final Double deliveryDistanceInKm;

    @Nullable
    private Double distanceInKm;

    @Nullable
    private Double earnings;

    @Nullable
    private Integer id;

    @Nullable
    private Order order;

    @Nullable
    private final Double pickupDistanceInKm;

    @Nullable
    private Boolean showAllocationWindow;

    @Nullable
    private Integer tripCount;

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Double getDeliveryDistanceInKm() {
        return this.deliveryDistanceInKm;
    }

    @Nullable
    public final Double getDistanceInKm() {
        return this.distanceInKm;
    }

    @Nullable
    public final Double getEarnings() {
        return this.earnings;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Order getOrder() {
        return this.order;
    }

    @Nullable
    public final Double getPickupDistanceInKm() {
        return this.pickupDistanceInKm;
    }

    @Nullable
    public final Boolean getShowAllocationWindow() {
        return this.showAllocationWindow;
    }

    @Nullable
    public final Integer getTripCount() {
        return this.tripCount;
    }

    public final void setCreatedAt(@Nullable Date date) {
        this.createdAt = date;
    }

    public final void setDistanceInKm(@Nullable Double d4) {
        this.distanceInKm = d4;
    }

    public final void setEarnings(@Nullable Double d4) {
        this.earnings = d4;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setOrder(@Nullable Order order) {
        this.order = order;
    }

    public final void setShowAllocationWindow(@Nullable Boolean bool) {
        this.showAllocationWindow = bool;
    }

    public final void setTripCount(@Nullable Integer num) {
        this.tripCount = num;
    }
}
