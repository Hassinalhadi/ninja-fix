package com.checkout.components.interfaces.model;

import Q0.c;
import av.q;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\f¨\u0006)"}, d2 = {"Lcom/checkout/components/interfaces/model/BillingAddress;", "", "", "addressLine1", "addressLine2", "city", "state", "zip", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/BillingAddress;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAddressLine1", "b", "getAddressLine2", "c", "getCity", Constants.INAPP_DATA_TAG, "getState", "e", "getZip", "f", "getCountry", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class BillingAddress {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String addressLine1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String addressLine2;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String city;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String state;

    /* renamed from: e, reason: from kotlin metadata */
    private final String zip;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String country;

    public BillingAddress() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static BillingAddress copy$default(BillingAddress billingAddress, String str, String str2, String str3, String str4, String str5, String str6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = billingAddress.addressLine1;
        }
        if ((i4 & 2) != 0) {
            str2 = billingAddress.addressLine2;
        }
        if ((i4 & 4) != 0) {
            str3 = billingAddress.city;
        }
        if ((i4 & 8) != 0) {
            str4 = billingAddress.state;
        }
        if ((i4 & 16) != 0) {
            str5 = billingAddress.zip;
        }
        if ((i4 & 32) != 0) {
            str6 = billingAddress.country;
        }
        String str7 = str6;
        billingAddress.getClass();
        String str8 = str5;
        String str9 = str3;
        return new BillingAddress(str, str2, str9, str4, str8, str7);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final BillingAddress copy(@Nullable String addressLine1, @Nullable String addressLine2, @Nullable String city, @Nullable String state, @Nullable String zip, @Nullable String country) {
        return new BillingAddress(addressLine1, addressLine2, city, state, zip, country);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingAddress)) {
            return false;
        }
        BillingAddress billingAddress = (BillingAddress) other;
        return Intrinsics.areEqual(this.addressLine1, billingAddress.addressLine1) && Intrinsics.areEqual(this.addressLine2, billingAddress.addressLine2) && Intrinsics.areEqual(this.city, billingAddress.city) && Intrinsics.areEqual(this.state, billingAddress.state) && Intrinsics.areEqual(this.zip, billingAddress.zip) && Intrinsics.areEqual(this.country, billingAddress.country);
    }

    @Nullable
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    @Nullable
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getZip() {
        return this.zip;
    }

    public final int hashCode() {
        String str = this.addressLine1;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressLine2;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.state;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.zip;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.country;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        String str = this.addressLine1;
        String str2 = this.addressLine2;
        String str3 = this.city;
        String str4 = this.state;
        String str5 = this.zip;
        String str6 = this.country;
        StringBuilder india = q.india("BillingAddress(addressLine1=", str, ", addressLine2=", str2, ", city=");
        c.azure(india, str3, ", state=", str4, ", zip=");
        return j.lima(india, str5, ", country=", str6, ")");
    }

    public BillingAddress(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.city = str3;
        this.state = str4;
        this.zip = str5;
        this.country = str6;
    }

    public /* synthetic */ BillingAddress(String str, String str2, String str3, String str4, String str5, String str6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5, (i4 & 32) != 0 ? null : str6);
    }
}
