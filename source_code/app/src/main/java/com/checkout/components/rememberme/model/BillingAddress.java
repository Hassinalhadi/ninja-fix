package com.checkout.components.rememberme.model;

import av.q;
import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0011¨\u0006*"}, d2 = {"Lcom/checkout/components/rememberme/model/BillingAddress;", "", "", "firstName", "lastName", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "phone", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "component4", "()Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;)Lcom/checkout/components/rememberme/model/BillingAddress;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFirstName", "getFirstName$annotations", "()V", "b", "getLastName", "getLastName$annotations", "c", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "getPhone", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "getAddress", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BillingAddress {
    public static final int $stable = BillingAddressNetworkEntity.$stable | PhoneNetworkEntity.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PhoneNetworkEntity phone;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final BillingAddressNetworkEntity address;

    public BillingAddress(@Json(name = "first_name") @Nullable String str, @Json(name = "last_name") @Nullable String str2, @Nullable PhoneNetworkEntity phoneNetworkEntity, @Nullable BillingAddressNetworkEntity billingAddressNetworkEntity) {
        this.firstName = str;
        this.lastName = str2;
        this.phone = phoneNetworkEntity;
        this.address = billingAddressNetworkEntity;
    }

    public static /* synthetic */ BillingAddress copy$default(BillingAddress billingAddress, String str, String str2, PhoneNetworkEntity phoneNetworkEntity, BillingAddressNetworkEntity billingAddressNetworkEntity, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = billingAddress.firstName;
        }
        if ((i4 & 2) != 0) {
            str2 = billingAddress.lastName;
        }
        if ((i4 & 4) != 0) {
            phoneNetworkEntity = billingAddress.phone;
        }
        if ((i4 & 8) != 0) {
            billingAddressNetworkEntity = billingAddress.address;
        }
        return billingAddress.copy(str, str2, phoneNetworkEntity, billingAddressNetworkEntity);
    }

    @Json(name = "first_name")
    public static /* synthetic */ void getFirstName$annotations() {
    }

    @Json(name = "last_name")
    public static /* synthetic */ void getLastName$annotations() {
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final BillingAddressNetworkEntity getAddress() {
        return this.address;
    }

    @NotNull
    public final BillingAddress copy(@Json(name = "first_name") @Nullable String firstName, @Json(name = "last_name") @Nullable String lastName, @Nullable PhoneNetworkEntity phone, @Nullable BillingAddressNetworkEntity address) {
        return new BillingAddress(firstName, lastName, phone, address);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingAddress)) {
            return false;
        }
        BillingAddress billingAddress = (BillingAddress) other;
        return Intrinsics.areEqual(this.firstName, billingAddress.firstName) && Intrinsics.areEqual(this.lastName, billingAddress.lastName) && Intrinsics.areEqual(this.phone, billingAddress.phone) && Intrinsics.areEqual(this.address, billingAddress.address);
    }

    @Nullable
    public final BillingAddressNetworkEntity getAddress() {
        return this.address;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    public final int hashCode() {
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        int hashCode3 = (hashCode2 + (phoneNetworkEntity == null ? 0 : phoneNetworkEntity.hashCode())) * 31;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.address;
        return hashCode3 + (billingAddressNetworkEntity != null ? billingAddressNetworkEntity.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.address;
        StringBuilder india = q.india("BillingAddress(firstName=", str, ", lastName=", str2, ", phone=");
        india.append(phoneNetworkEntity);
        india.append(", address=");
        india.append(billingAddressNetworkEntity);
        india.append(")");
        return india.toString();
    }
}
