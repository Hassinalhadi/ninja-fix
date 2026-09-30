package com.checkout.components.rememberme.model;

import Q0.c;
import av.q;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b#\b\u0081\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0080\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0014J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010*\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u0014R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010*\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0019R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b;\u0010/\u001a\u0004\b:\u0010\u001bR \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u00109\u0012\u0004\b>\u0010/\u001a\u0004\b=\u0010\u001bR&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bB\u0010/\u001a\u0004\bA\u0010\u001eR&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010@\u0012\u0004\bE\u0010/\u001a\u0004\bD\u0010\u001e¨\u0006F"}, d2 = {"Lcom/checkout/components/rememberme/model/GetWalletResponse;", "", "", Constants.KEY_ID, "firstName", "lastName", "email", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "phone", "", "emailVerified", "phoneVerified", "", "Lcom/checkout/components/rememberme/model/PaymentMethod;", "paymentMethods", "Lcom/checkout/components/rememberme/model/ShippingAddress;", "shippingAddresses", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;ZZLjava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "component6", "()Z", "component7", "component8", "()Ljava/util/List;", "component9", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;ZZLjava/util/List;Ljava/util/List;)Lcom/checkout/components/rememberme/model/GetWalletResponse;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getFirstName", "getFirstName$annotations", "()V", "c", "getLastName", "getLastName$annotations", Constants.INAPP_DATA_TAG, "getEmail", "e", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "getPhone", "f", "Z", "getEmailVerified", "getEmailVerified$annotations", "g", "getPhoneVerified", "getPhoneVerified$annotations", "h", "Ljava/util/List;", "getPaymentMethods", "getPaymentMethods$annotations", "i", "getShippingAddresses", "getShippingAddresses$annotations", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetWalletResponse {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String firstName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String lastName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String email;

    /* renamed from: e, reason: from kotlin metadata */
    private final PhoneNetworkEntity phone;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean emailVerified;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean phoneVerified;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List paymentMethods;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List shippingAddresses;

    public GetWalletResponse(@Nullable String str, @Json(name = "first_name") @Nullable String str2, @Json(name = "last_name") @Nullable String str3, @Nullable String str4, @Nullable PhoneNetworkEntity phoneNetworkEntity, @Json(name = "email_verified") boolean z2, @Json(name = "phone_verified") boolean z10, @Json(name = "payment_methods") @NotNull List<PaymentMethod> paymentMethods, @Json(name = "shipping_addresses") @NotNull List<ShippingAddress> shippingAddresses) {
        Intrinsics.echo(paymentMethods, "paymentMethods");
        Intrinsics.echo(shippingAddresses, "shippingAddresses");
        this.id = str;
        this.firstName = str2;
        this.lastName = str3;
        this.email = str4;
        this.phone = phoneNetworkEntity;
        this.emailVerified = z2;
        this.phoneVerified = z10;
        this.paymentMethods = paymentMethods;
        this.shippingAddresses = shippingAddresses;
    }

    public static /* synthetic */ GetWalletResponse copy$default(GetWalletResponse getWalletResponse, String str, String str2, String str3, String str4, PhoneNetworkEntity phoneNetworkEntity, boolean z2, boolean z10, List list, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = getWalletResponse.id;
        }
        if ((i4 & 2) != 0) {
            str2 = getWalletResponse.firstName;
        }
        if ((i4 & 4) != 0) {
            str3 = getWalletResponse.lastName;
        }
        if ((i4 & 8) != 0) {
            str4 = getWalletResponse.email;
        }
        if ((i4 & 16) != 0) {
            phoneNetworkEntity = getWalletResponse.phone;
        }
        if ((i4 & 32) != 0) {
            z2 = getWalletResponse.emailVerified;
        }
        if ((i4 & 64) != 0) {
            z10 = getWalletResponse.phoneVerified;
        }
        if ((i4 & 128) != 0) {
            list = getWalletResponse.paymentMethods;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            list2 = getWalletResponse.shippingAddresses;
        }
        List list3 = list;
        List list4 = list2;
        boolean z11 = z2;
        boolean z12 = z10;
        PhoneNetworkEntity phoneNetworkEntity2 = phoneNetworkEntity;
        String str5 = str3;
        return getWalletResponse.copy(str, str2, str5, str4, phoneNetworkEntity2, z11, z12, list3, list4);
    }

    @Json(name = "email_verified")
    public static /* synthetic */ void getEmailVerified$annotations() {
    }

    @Json(name = "first_name")
    public static /* synthetic */ void getFirstName$annotations() {
    }

    @Json(name = "last_name")
    public static /* synthetic */ void getLastName$annotations() {
    }

    @Json(name = "payment_methods")
    public static /* synthetic */ void getPaymentMethods$annotations() {
    }

    @Json(name = "phone_verified")
    public static /* synthetic */ void getPhoneVerified$annotations() {
    }

    @Json(name = "shipping_addresses")
    public static /* synthetic */ void getShippingAddresses$annotations() {
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEmailVerified() {
        return this.emailVerified;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getPhoneVerified() {
        return this.phoneVerified;
    }

    @NotNull
    public final List<PaymentMethod> component8() {
        return this.paymentMethods;
    }

    @NotNull
    public final List<ShippingAddress> component9() {
        return this.shippingAddresses;
    }

    @NotNull
    public final GetWalletResponse copy(@Nullable String id2, @Json(name = "first_name") @Nullable String firstName, @Json(name = "last_name") @Nullable String lastName, @Nullable String email, @Nullable PhoneNetworkEntity phone, @Json(name = "email_verified") boolean emailVerified, @Json(name = "phone_verified") boolean phoneVerified, @Json(name = "payment_methods") @NotNull List<PaymentMethod> paymentMethods, @Json(name = "shipping_addresses") @NotNull List<ShippingAddress> shippingAddresses) {
        Intrinsics.echo(paymentMethods, "paymentMethods");
        Intrinsics.echo(shippingAddresses, "shippingAddresses");
        return new GetWalletResponse(id2, firstName, lastName, email, phone, emailVerified, phoneVerified, paymentMethods, shippingAddresses);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetWalletResponse)) {
            return false;
        }
        GetWalletResponse getWalletResponse = (GetWalletResponse) other;
        return Intrinsics.areEqual(this.id, getWalletResponse.id) && Intrinsics.areEqual(this.firstName, getWalletResponse.firstName) && Intrinsics.areEqual(this.lastName, getWalletResponse.lastName) && Intrinsics.areEqual(this.email, getWalletResponse.email) && Intrinsics.areEqual(this.phone, getWalletResponse.phone) && this.emailVerified == getWalletResponse.emailVerified && this.phoneVerified == getWalletResponse.phoneVerified && Intrinsics.areEqual(this.paymentMethods, getWalletResponse.paymentMethods) && Intrinsics.areEqual(this.shippingAddresses, getWalletResponse.shippingAddresses);
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    public final boolean getEmailVerified() {
        return this.emailVerified;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    @Nullable
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    public final boolean getPhoneVerified() {
        return this.phoneVerified;
    }

    @NotNull
    public final List<ShippingAddress> getShippingAddresses() {
        return this.shippingAddresses;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i4;
        String str = this.id;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.firstName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.lastName;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.email;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        if (phoneNetworkEntity != null) {
            i5 = phoneNetworkEntity.hashCode();
        }
        int i14 = (i13 + i5) * 31;
        int i15 = 1237;
        if (this.emailVerified) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i16 = (i4 + i14) * 31;
        if (this.phoneVerified) {
            i15 = 1231;
        }
        return this.shippingAddresses.hashCode() + j.golf((i15 + i16) * 31, 31, this.paymentMethods);
    }

    @NotNull
    public final String toString() {
        String str = this.id;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.email;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        boolean z2 = this.emailVerified;
        boolean z10 = this.phoneVerified;
        List list = this.paymentMethods;
        List list2 = this.shippingAddresses;
        StringBuilder india = q.india("GetWalletResponse(id=", str, ", firstName=", str2, ", lastName=");
        c.azure(india, str3, ", email=", str4, ", phone=");
        india.append(phoneNetworkEntity);
        india.append(", emailVerified=");
        india.append(z2);
        india.append(", phoneVerified=");
        india.append(z10);
        india.append(", paymentMethods=");
        india.append(list);
        india.append(", shippingAddresses=");
        india.append(list2);
        india.append(")");
        return india.toString();
    }
}
