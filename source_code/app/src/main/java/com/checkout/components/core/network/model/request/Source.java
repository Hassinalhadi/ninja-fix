package com.checkout.components.core.network.model.request;

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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010\rR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010\u001e\u001a\u0004\b%\u0010\u000f¨\u0006'"}, d2 = {"Lcom/checkout/components/core/network/model/request/Source;", "", "", "token", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "billingAddress", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "phone", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "component3", "()Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;)Lcom/checkout/components/core/network/model/request/Source;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getToken", "getToken$annotations", "()V", "b", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "getBillingAddress", "getBillingAddress$annotations", "c", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "getPhone", "getPhone$annotations", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Source {
    public static final int $stable = PhoneNetworkEntity.$stable | BillingAddressNetworkEntity.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String token;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BillingAddressNetworkEntity billingAddress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PhoneNetworkEntity phone;

    public Source(@Json(name = "token") @NotNull String token, @Json(name = "billing_address") @Nullable BillingAddressNetworkEntity billingAddressNetworkEntity, @Json(name = "phone") @Nullable PhoneNetworkEntity phoneNetworkEntity) {
        Intrinsics.echo(token, "token");
        this.token = token;
        this.billingAddress = billingAddressNetworkEntity;
        this.phone = phoneNetworkEntity;
    }

    public static /* synthetic */ Source copy$default(Source source, String str, BillingAddressNetworkEntity billingAddressNetworkEntity, PhoneNetworkEntity phoneNetworkEntity, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = source.token;
        }
        if ((i4 & 2) != 0) {
            billingAddressNetworkEntity = source.billingAddress;
        }
        if ((i4 & 4) != 0) {
            phoneNetworkEntity = source.phone;
        }
        return source.copy(str, billingAddressNetworkEntity, phoneNetworkEntity);
    }

    @Json(name = "billing_address")
    public static /* synthetic */ void getBillingAddress$annotations() {
    }

    @Json(name = "phone")
    public static /* synthetic */ void getPhone$annotations() {
    }

    @Json(name = "token")
    public static /* synthetic */ void getToken$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final BillingAddressNetworkEntity getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    @NotNull
    public final Source copy(@Json(name = "token") @NotNull String token, @Json(name = "billing_address") @Nullable BillingAddressNetworkEntity billingAddress, @Json(name = "phone") @Nullable PhoneNetworkEntity phone) {
        Intrinsics.echo(token, "token");
        return new Source(token, billingAddress, phone);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Source)) {
            return false;
        }
        Source source = (Source) other;
        return Intrinsics.areEqual(this.token, source.token) && Intrinsics.areEqual(this.billingAddress, source.billingAddress) && Intrinsics.areEqual(this.phone, source.phone);
    }

    @Nullable
    public final BillingAddressNetworkEntity getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.billingAddress;
        int hashCode2 = (hashCode + (billingAddressNetworkEntity == null ? 0 : billingAddressNetworkEntity.hashCode())) * 31;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        return hashCode2 + (phoneNetworkEntity != null ? phoneNetworkEntity.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "Source(token=" + this.token + ", billingAddress=" + this.billingAddress + ", phone=" + this.phone + ")";
    }

    public /* synthetic */ Source(String str, BillingAddressNetworkEntity billingAddressNetworkEntity, PhoneNetworkEntity phoneNetworkEntity, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : billingAddressNetworkEntity, (i4 & 4) != 0 ? null : phoneNetworkEntity);
    }
}
