package com.checkout.components.card.operations.tokenisation.network.model;

import av.q;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001f\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0013¨\u0006/"}, d2 = {"Lcom/checkout/components/card/operations/tokenisation/network/model/Shipping;", "", "", "firstName", "lastName", "companyName", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "phone", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "component5", "()Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;)Lcom/checkout/components/card/operations/tokenisation/network/model/Shipping;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFirstName", "getFirstName$annotations", "()V", "b", "getLastName", "getLastName$annotations", "c", "getCompanyName", "getCompanyName$annotations", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "getPhone", "e", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "getAddress", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Shipping {
    public static final int $stable = BillingAddressNetworkEntity.$stable | PhoneNetworkEntity.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String companyName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final PhoneNetworkEntity phone;

    /* renamed from: e, reason: from kotlin metadata */
    private final BillingAddressNetworkEntity address;

    public Shipping(@Json(name = "first_name") @Nullable String str, @Json(name = "last_name") @Nullable String str2, @Json(name = "company_name") @Nullable String str3, @Nullable PhoneNetworkEntity phoneNetworkEntity, @Nullable BillingAddressNetworkEntity billingAddressNetworkEntity) {
        this.firstName = str;
        this.lastName = str2;
        this.companyName = str3;
        this.phone = phoneNetworkEntity;
        this.address = billingAddressNetworkEntity;
    }

    public static /* synthetic */ Shipping copy$default(Shipping shipping, String str, String str2, String str3, PhoneNetworkEntity phoneNetworkEntity, BillingAddressNetworkEntity billingAddressNetworkEntity, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = shipping.firstName;
        }
        if ((i4 & 2) != 0) {
            str2 = shipping.lastName;
        }
        if ((i4 & 4) != 0) {
            str3 = shipping.companyName;
        }
        if ((i4 & 8) != 0) {
            phoneNetworkEntity = shipping.phone;
        }
        if ((i4 & 16) != 0) {
            billingAddressNetworkEntity = shipping.address;
        }
        BillingAddressNetworkEntity billingAddressNetworkEntity2 = billingAddressNetworkEntity;
        String str4 = str3;
        return shipping.copy(str, str2, str4, phoneNetworkEntity, billingAddressNetworkEntity2);
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
    public final String getCompanyName() {
        return this.companyName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final BillingAddressNetworkEntity getAddress() {
        return this.address;
    }

    @NotNull
    public final Shipping copy(@Json(name = "first_name") @Nullable String firstName, @Json(name = "last_name") @Nullable String lastName, @Json(name = "company_name") @Nullable String companyName, @Nullable PhoneNetworkEntity phone, @Nullable BillingAddressNetworkEntity address) {
        return new Shipping(firstName, lastName, companyName, phone, address);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shipping)) {
            return false;
        }
        Shipping shipping = (Shipping) other;
        return Intrinsics.areEqual(this.firstName, shipping.firstName) && Intrinsics.areEqual(this.lastName, shipping.lastName) && Intrinsics.areEqual(this.companyName, shipping.companyName) && Intrinsics.areEqual(this.phone, shipping.phone) && Intrinsics.areEqual(this.address, shipping.address);
    }

    @Nullable
    public final BillingAddressNetworkEntity getAddress() {
        return this.address;
    }

    @Nullable
    public final String getCompanyName() {
        return this.companyName;
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
        String str3 = this.companyName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        int hashCode4 = (hashCode3 + (phoneNetworkEntity == null ? 0 : phoneNetworkEntity.hashCode())) * 31;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.address;
        return hashCode4 + (billingAddressNetworkEntity != null ? billingAddressNetworkEntity.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.companyName;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.address;
        StringBuilder india = q.india("Shipping(firstName=", str, ", lastName=", str2, ", companyName=");
        india.append(str3);
        india.append(", phone=");
        india.append(phoneNetworkEntity);
        india.append(", address=");
        india.append(billingAddressNetworkEntity);
        india.append(")");
        return india.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Shipping(String str, String str2, String str3, PhoneNetworkEntity phoneNetworkEntity, BillingAddressNetworkEntity billingAddressNetworkEntity, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, r5, r6, r7);
        BillingAddressNetworkEntity billingAddressNetworkEntity2;
        PhoneNetworkEntity phoneNetworkEntity2;
        String str4;
        str = (i4 & 1) != 0 ? null : str;
        str2 = (i4 & 2) != 0 ? null : str2;
        if ((i4 & 4) != 0) {
            billingAddressNetworkEntity2 = billingAddressNetworkEntity;
            phoneNetworkEntity2 = phoneNetworkEntity;
            str4 = null;
        } else {
            billingAddressNetworkEntity2 = billingAddressNetworkEntity;
            phoneNetworkEntity2 = phoneNetworkEntity;
            str4 = str3;
        }
    }
}
