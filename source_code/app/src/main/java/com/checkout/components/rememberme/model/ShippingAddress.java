package com.checkout.components.rememberme.model;

import Q0.c;
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
import pe.AbstractC2327c;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JX\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010$\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0010R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010$\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010$\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0017R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b8\u0010)\u001a\u0004\b\f\u0010\u0019¨\u00069"}, d2 = {"Lcom/checkout/components/rememberme/model/ShippingAddress;", "", "", Constants.KEY_ID, "firstName", "lastName", "companyName", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "phone", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "address", "", "isDefaultShippingAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "component6", "()Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "component7", "()Z", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Z)Lcom/checkout/components/rememberme/model/ShippingAddress;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getFirstName", "getFirstName$annotations", "()V", "c", "getLastName", "getLastName$annotations", Constants.INAPP_DATA_TAG, "getCompanyName", "getCompanyName$annotations", "e", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "getPhone", "f", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "getAddress", "g", "Z", "isDefaultShippingAddress$annotations", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShippingAddress {
    public static final int $stable = BillingAddressNetworkEntity.$stable | PhoneNetworkEntity.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String firstName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String lastName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String companyName;

    /* renamed from: e, reason: from kotlin metadata */
    private final PhoneNetworkEntity phone;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final BillingAddressNetworkEntity address;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultShippingAddress;

    public ShippingAddress(@NotNull String id2, @Json(name = "first_name") @NotNull String firstName, @Json(name = "last_name") @NotNull String lastName, @Json(name = "company_name") @Nullable String str, @NotNull PhoneNetworkEntity phone, @NotNull BillingAddressNetworkEntity address, @Json(name = "is_default_shipping_address") boolean z2) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(firstName, "firstName");
        Intrinsics.echo(lastName, "lastName");
        Intrinsics.echo(phone, "phone");
        Intrinsics.echo(address, "address");
        this.id = id2;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = str;
        this.phone = phone;
        this.address = address;
        this.isDefaultShippingAddress = z2;
    }

    public static /* synthetic */ ShippingAddress copy$default(ShippingAddress shippingAddress, String str, String str2, String str3, String str4, PhoneNetworkEntity phoneNetworkEntity, BillingAddressNetworkEntity billingAddressNetworkEntity, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = shippingAddress.id;
        }
        if ((i4 & 2) != 0) {
            str2 = shippingAddress.firstName;
        }
        if ((i4 & 4) != 0) {
            str3 = shippingAddress.lastName;
        }
        if ((i4 & 8) != 0) {
            str4 = shippingAddress.companyName;
        }
        if ((i4 & 16) != 0) {
            phoneNetworkEntity = shippingAddress.phone;
        }
        if ((i4 & 32) != 0) {
            billingAddressNetworkEntity = shippingAddress.address;
        }
        if ((i4 & 64) != 0) {
            z2 = shippingAddress.isDefaultShippingAddress;
        }
        BillingAddressNetworkEntity billingAddressNetworkEntity2 = billingAddressNetworkEntity;
        boolean z10 = z2;
        PhoneNetworkEntity phoneNetworkEntity2 = phoneNetworkEntity;
        String str5 = str3;
        return shippingAddress.copy(str, str2, str5, str4, phoneNetworkEntity2, billingAddressNetworkEntity2, z10);
    }

    @Json(name = "company_name")
    public static /* synthetic */ void getCompanyName$annotations() {
    }

    @Json(name = "first_name")
    public static /* synthetic */ void getFirstName$annotations() {
    }

    @Json(name = "last_name")
    public static /* synthetic */ void getLastName$annotations() {
    }

    @Json(name = "is_default_shipping_address")
    public static /* synthetic */ void isDefaultShippingAddress$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BillingAddressNetworkEntity getAddress() {
        return this.address;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsDefaultShippingAddress() {
        return this.isDefaultShippingAddress;
    }

    @NotNull
    public final ShippingAddress copy(@NotNull String id2, @Json(name = "first_name") @NotNull String firstName, @Json(name = "last_name") @NotNull String lastName, @Json(name = "company_name") @Nullable String companyName, @NotNull PhoneNetworkEntity phone, @NotNull BillingAddressNetworkEntity address, @Json(name = "is_default_shipping_address") boolean isDefaultShippingAddress) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(firstName, "firstName");
        Intrinsics.echo(lastName, "lastName");
        Intrinsics.echo(phone, "phone");
        Intrinsics.echo(address, "address");
        return new ShippingAddress(id2, firstName, lastName, companyName, phone, address, isDefaultShippingAddress);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShippingAddress)) {
            return false;
        }
        ShippingAddress shippingAddress = (ShippingAddress) other;
        return Intrinsics.areEqual(this.id, shippingAddress.id) && Intrinsics.areEqual(this.firstName, shippingAddress.firstName) && Intrinsics.areEqual(this.lastName, shippingAddress.lastName) && Intrinsics.areEqual(this.companyName, shippingAddress.companyName) && Intrinsics.areEqual(this.phone, shippingAddress.phone) && Intrinsics.areEqual(this.address, shippingAddress.address) && this.isDefaultShippingAddress == shippingAddress.isDefaultShippingAddress;
    }

    @NotNull
    public final BillingAddressNetworkEntity getAddress() {
        return this.address;
    }

    @Nullable
    public final String getCompanyName() {
        return this.companyName;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    public final int hashCode() {
        int hashCode;
        int i4;
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra(this.id.hashCode() * 31, 31, this.firstName), 31, this.lastName);
        String str = this.companyName;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (this.address.hashCode() + ((this.phone.hashCode() + ((sierra + hashCode) * 31)) * 31)) * 31;
        if (this.isDefaultShippingAddress) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return i4 + hashCode2;
    }

    public final boolean isDefaultShippingAddress() {
        return this.isDefaultShippingAddress;
    }

    @NotNull
    public final String toString() {
        String str = this.id;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.companyName;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.address;
        boolean z2 = this.isDefaultShippingAddress;
        StringBuilder india = q.india("ShippingAddress(id=", str, ", firstName=", str2, ", lastName=");
        c.azure(india, str3, ", companyName=", str4, ", phone=");
        india.append(phoneNetworkEntity);
        india.append(", address=");
        india.append(billingAddressNetworkEntity);
        india.append(", isDefaultShippingAddress=");
        return c.romeo(india, z2, ")");
    }
}
