package com.checkout.components.interfaces.model.contact;

import Q0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018JV\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010\u000eJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010\u0018¨\u00064"}, d2 = {"Lcom/checkout/components/interfaces/model/contact/Address;", "Landroid/os/Parcelable;", "Lcom/checkout/components/interfaces/model/contact/Country;", "country", "", "addressLine1", "addressLine2", "state", "city", "zip", "<init>", "(Lcom/checkout/components/interfaces/model/contact/Country;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/checkout/components/interfaces/model/contact/Country;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/model/contact/Country;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/contact/Address;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/contact/Country;", "getCountry", "b", "Ljava/lang/String;", "getAddressLine1", "c", "getAddressLine2", Constants.INAPP_DATA_TAG, "getState", "e", "getCity", "f", "getZip", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class Address implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Address> CREATOR = new Creator();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Country country;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String addressLine1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String addressLine2;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String state;

    /* renamed from: e, reason: from kotlin metadata */
    private final String city;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String zip;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Address> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Address createFromParcel(Parcel parcel) {
            Intrinsics.echo(parcel, "parcel");
            return new Address(Country.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Address[] newArray(int i4) {
            return new Address[i4];
        }

        @Override // android.os.Parcelable.Creator
        public final Address[] newArray(int i4) {
            return new Address[i4];
        }
    }

    public Address(@NotNull Country country, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Intrinsics.echo(country, "country");
        this.country = country;
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.state = str3;
        this.city = str4;
        this.zip = str5;
    }

    public static Address copy$default(Address address, Country country, String str, String str2, String str3, String str4, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            country = address.country;
        }
        if ((i4 & 2) != 0) {
            str = address.addressLine1;
        }
        if ((i4 & 4) != 0) {
            str2 = address.addressLine2;
        }
        if ((i4 & 8) != 0) {
            str3 = address.state;
        }
        if ((i4 & 16) != 0) {
            str4 = address.city;
        }
        if ((i4 & 32) != 0) {
            str5 = address.zip;
        }
        String str6 = str5;
        address.getClass();
        Intrinsics.echo(country, "country");
        String str7 = str4;
        String str8 = str2;
        return new Address(country, str, str8, str3, str7, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    @NotNull
    public final Address copy(@NotNull Country country, @Nullable String addressLine1, @Nullable String addressLine2, @Nullable String state, @Nullable String city, @Nullable String zip) {
        Intrinsics.echo(country, "country");
        return new Address(country, addressLine1, addressLine2, state, city, zip);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address address = (Address) other;
        return this.country == address.country && Intrinsics.areEqual(this.addressLine1, address.addressLine1) && Intrinsics.areEqual(this.addressLine2, address.addressLine2) && Intrinsics.areEqual(this.state, address.state) && Intrinsics.areEqual(this.city, address.city) && Intrinsics.areEqual(this.zip, address.zip);
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

    @NotNull
    public final Country getCountry() {
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
        int hashCode = this.country.hashCode() * 31;
        String str = this.addressLine1;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressLine2;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.zip;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        Country country = this.country;
        String str = this.addressLine1;
        String str2 = this.addressLine2;
        String str3 = this.state;
        String str4 = this.city;
        String str5 = this.zip;
        StringBuilder sb2 = new StringBuilder("Address(country=");
        sb2.append(country);
        sb2.append(", addressLine1=");
        sb2.append(str);
        sb2.append(", addressLine2=");
        c.azure(sb2, str2, ", state=", str3, ", city=");
        return j.lima(sb2, str4, ", zip=", str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.echo(dest, "dest");
        Country country = this.country;
        country.getClass();
        dest.writeString(country.name());
        dest.writeString(this.addressLine1);
        dest.writeString(this.addressLine2);
        dest.writeString(this.state);
        dest.writeString(this.city);
        dest.writeString(this.zip);
    }
}
