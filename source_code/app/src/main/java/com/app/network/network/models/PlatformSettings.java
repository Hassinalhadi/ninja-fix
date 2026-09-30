package com.app.network.network.models;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/app/network/network/models/PlatformSettings;", "Ljava/io/Serializable;", "<init>", "()V", "captainReceiptRequired", "", "getCaptainReceiptRequired", "()Ljava/lang/Boolean;", "setCaptainReceiptRequired", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "pickupTaskConfirmationImageRequired", "getPickupTaskConfirmationImageRequired", "setPickupTaskConfirmationImageRequired", "deliveryTaskConfirmationImageRequired", "getDeliveryTaskConfirmationImageRequired", "setDeliveryTaskConfirmationImageRequired", "checkOrderTaskItems", "getCheckOrderTaskItems", "setCheckOrderTaskItems", "checkOrderHandshakeItems", "getCheckOrderHandshakeItems", "setCheckOrderHandshakeItems", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatformSettings implements Serializable {

    @Nullable
    private Boolean captainReceiptRequired;

    @Nullable
    private Boolean checkOrderHandshakeItems;

    @Nullable
    private Boolean checkOrderTaskItems;

    @Nullable
    private Boolean deliveryTaskConfirmationImageRequired;

    @Nullable
    private Boolean pickupTaskConfirmationImageRequired;

    @Nullable
    public final Boolean getCaptainReceiptRequired() {
        return this.captainReceiptRequired;
    }

    @Nullable
    public final Boolean getCheckOrderHandshakeItems() {
        return this.checkOrderHandshakeItems;
    }

    @Nullable
    public final Boolean getCheckOrderTaskItems() {
        return this.checkOrderTaskItems;
    }

    @Nullable
    public final Boolean getDeliveryTaskConfirmationImageRequired() {
        return this.deliveryTaskConfirmationImageRequired;
    }

    @Nullable
    public final Boolean getPickupTaskConfirmationImageRequired() {
        return this.pickupTaskConfirmationImageRequired;
    }

    public final void setCaptainReceiptRequired(@Nullable Boolean bool) {
        this.captainReceiptRequired = bool;
    }

    public final void setCheckOrderHandshakeItems(@Nullable Boolean bool) {
        this.checkOrderHandshakeItems = bool;
    }

    public final void setCheckOrderTaskItems(@Nullable Boolean bool) {
        this.checkOrderTaskItems = bool;
    }

    public final void setDeliveryTaskConfirmationImageRequired(@Nullable Boolean bool) {
        this.deliveryTaskConfirmationImageRequired = bool;
    }

    public final void setPickupTaskConfirmationImageRequired(@Nullable Boolean bool) {
        this.pickupTaskConfirmationImageRequired = bool;
    }
}
