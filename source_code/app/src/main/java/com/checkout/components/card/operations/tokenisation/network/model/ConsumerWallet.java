package com.checkout.components.card.operations.tokenisation.network.model;

import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;", "", "", "setAsDefaultPaymentMethod", "Lcom/checkout/components/card/operations/tokenisation/network/model/Shipping;", "shipping", "<init>", "(ZLcom/checkout/components/card/operations/tokenisation/network/model/Shipping;)V", "component1", "()Z", "component2", "()Lcom/checkout/components/card/operations/tokenisation/network/model/Shipping;", Constants.COPY_TYPE, "(ZLcom/checkout/components/card/operations/tokenisation/network/model/Shipping;)Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getSetAsDefaultPaymentMethod", "getSetAsDefaultPaymentMethod$annotations", "()V", "b", "Lcom/checkout/components/card/operations/tokenisation/network/model/Shipping;", "getShipping", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ConsumerWallet {
    public static final int $stable = BillingAddressNetworkEntity.$stable | PhoneNetworkEntity.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean setAsDefaultPaymentMethod;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Shipping shipping;

    public ConsumerWallet(@Json(name = "set_as_default_payment_method") boolean z2, @Nullable Shipping shipping) {
        this.setAsDefaultPaymentMethod = z2;
        this.shipping = shipping;
    }

    public static /* synthetic */ ConsumerWallet copy$default(ConsumerWallet consumerWallet, boolean z2, Shipping shipping, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = consumerWallet.setAsDefaultPaymentMethod;
        }
        if ((i4 & 2) != 0) {
            shipping = consumerWallet.shipping;
        }
        return consumerWallet.copy(z2, shipping);
    }

    @Json(name = "set_as_default_payment_method")
    public static /* synthetic */ void getSetAsDefaultPaymentMethod$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSetAsDefaultPaymentMethod() {
        return this.setAsDefaultPaymentMethod;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Shipping getShipping() {
        return this.shipping;
    }

    @NotNull
    public final ConsumerWallet copy(@Json(name = "set_as_default_payment_method") boolean setAsDefaultPaymentMethod, @Nullable Shipping shipping) {
        return new ConsumerWallet(setAsDefaultPaymentMethod, shipping);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumerWallet)) {
            return false;
        }
        ConsumerWallet consumerWallet = (ConsumerWallet) other;
        return this.setAsDefaultPaymentMethod == consumerWallet.setAsDefaultPaymentMethod && Intrinsics.areEqual(this.shipping, consumerWallet.shipping);
    }

    public final boolean getSetAsDefaultPaymentMethod() {
        return this.setAsDefaultPaymentMethod;
    }

    @Nullable
    public final Shipping getShipping() {
        return this.shipping;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        if (this.setAsDefaultPaymentMethod) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i5 = i4 * 31;
        Shipping shipping = this.shipping;
        if (shipping == null) {
            hashCode = 0;
        } else {
            hashCode = shipping.hashCode();
        }
        return i5 + hashCode;
    }

    @NotNull
    public final String toString() {
        return "ConsumerWallet(setAsDefaultPaymentMethod=" + this.setAsDefaultPaymentMethod + ", shipping=" + this.shipping + ")";
    }

    public /* synthetic */ ConsumerWallet(boolean z2, Shipping shipping, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, (i4 & 2) != 0 ? null : shipping);
    }
}
