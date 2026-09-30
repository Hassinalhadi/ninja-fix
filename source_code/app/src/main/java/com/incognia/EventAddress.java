package com.incognia;

import android.location.Address;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB\u0095\u0001\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0016J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009e\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018¨\u0006<"}, d2 = {"Lcom/incognia/EventAddress;", "", "addressLine", "", "(Ljava/lang/String;)V", "latitude", "", "longitude", "(DD)V", "address", "Landroid/location/Address;", "(Landroid/location/Address;)V", "locale", "Ljava/util/Locale;", "countryCode", "countryName", "state", "city", "neighborhood", CTVariableUtils.NUMBER, "street", "postalCode", "(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getAddressLine", "()Ljava/lang/String;", "getCity", "getCountryCode", "getCountryName", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLocale", "()Ljava/util/Locale;", "getLongitude", "getNeighborhood", "getNumber", "getPostalCode", "getState", "getStreet", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/incognia/EventAddress;", "equals", "", "other", "hashCode", "", "toString", "Builder", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EventAddress {
    private final String addressLine;
    private final String city;
    private final String countryCode;
    private final String countryName;
    private final Double latitude;
    private final Locale locale;
    private final Double longitude;
    private final String neighborhood;
    private final String number;
    private final String postalCode;
    private final String state;
    private final String street;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0015J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0015J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/incognia/EventAddress$Builder;", "", "()V", "addressLine", "", "city", "countryCode", "countryName", "latitude", "", "Ljava/lang/Double;", "locale", "Ljava/util/Locale;", "longitude", "neighborhood", CTVariableUtils.NUMBER, "postalCode", "state", "street", "build", "Lcom/incognia/EventAddress;", "(Ljava/lang/Double;)Lcom/incognia/EventAddress$Builder;", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {
        private String addressLine;
        private String city;
        private String countryCode;
        private String countryName;
        private Double latitude;
        private Locale locale;
        private Double longitude;
        private String neighborhood;
        private String number;
        private String postalCode;
        private String state;
        private String street;

        public final Builder addressLine(String addressLine) {
            this.addressLine = addressLine;
            return this;
        }

        public final EventAddress build() {
            return new EventAddress(this.locale, this.countryCode, this.countryName, this.state, this.city, this.neighborhood, this.number, this.street, this.postalCode, this.addressLine, this.latitude, this.longitude);
        }

        public final Builder city(String city) {
            this.city = city;
            return this;
        }

        public final Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public final Builder countryName(String countryName) {
            this.countryName = countryName;
            return this;
        }

        public final Builder latitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public final Builder locale(Locale locale) {
            this.locale = locale;
            return this;
        }

        public final Builder longitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public final Builder neighborhood(String neighborhood) {
            this.neighborhood = neighborhood;
            return this;
        }

        public final Builder number(String number) {
            this.number = number;
            return this;
        }

        public final Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public final Builder state(String state) {
            this.state = state;
            return this;
        }

        public final Builder street(String street) {
            this.street = street;
            return this;
        }
    }

    public EventAddress() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ EventAddress copy$default(EventAddress eventAddress, Locale locale, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d4, Double d9, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            locale = eventAddress.locale;
        }
        if ((i4 & 2) != 0) {
            str = eventAddress.countryCode;
        }
        if ((i4 & 4) != 0) {
            str2 = eventAddress.countryName;
        }
        if ((i4 & 8) != 0) {
            str3 = eventAddress.state;
        }
        if ((i4 & 16) != 0) {
            str4 = eventAddress.city;
        }
        if ((i4 & 32) != 0) {
            str5 = eventAddress.neighborhood;
        }
        if ((i4 & 64) != 0) {
            str6 = eventAddress.number;
        }
        if ((i4 & 128) != 0) {
            str7 = eventAddress.street;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            str8 = eventAddress.postalCode;
        }
        if ((i4 & 512) != 0) {
            str9 = eventAddress.addressLine;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            d4 = eventAddress.latitude;
        }
        if ((i4 & 2048) != 0) {
            d9 = eventAddress.longitude;
        }
        Double d10 = d4;
        Double d11 = d9;
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        return eventAddress.copy(locale, str, str2, str3, str14, str15, str12, str13, str10, str11, d10, d11);
    }

    /* renamed from: component1, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAddressLine() {
        return this.addressLine;
    }

    /* renamed from: component11, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component12, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component6, reason: from getter */
    public final String getNeighborhood() {
        return this.neighborhood;
    }

    /* renamed from: component7, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    public final EventAddress copy(Locale locale, String countryCode, String countryName, String state, String city, String neighborhood, String number, String street, String postalCode, String addressLine, Double latitude, Double longitude) {
        return new EventAddress(locale, countryCode, countryName, state, city, neighborhood, number, street, postalCode, addressLine, latitude, longitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventAddress)) {
            return false;
        }
        EventAddress eventAddress = (EventAddress) other;
        return Intrinsics.areEqual(this.locale, eventAddress.locale) && Intrinsics.areEqual(this.countryCode, eventAddress.countryCode) && Intrinsics.areEqual(this.countryName, eventAddress.countryName) && Intrinsics.areEqual(this.state, eventAddress.state) && Intrinsics.areEqual(this.city, eventAddress.city) && Intrinsics.areEqual(this.neighborhood, eventAddress.neighborhood) && Intrinsics.areEqual(this.number, eventAddress.number) && Intrinsics.areEqual(this.street, eventAddress.street) && Intrinsics.areEqual(this.postalCode, eventAddress.postalCode) && Intrinsics.areEqual(this.addressLine, eventAddress.addressLine) && Intrinsics.areEqual(this.latitude, eventAddress.latitude) && Intrinsics.areEqual(this.longitude, eventAddress.longitude);
    }

    public final String getAddressLine() {
        return this.addressLine;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getNeighborhood() {
        return this.neighborhood;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        Locale locale = this.locale;
        int hashCode = (locale == null ? 0 : locale.hashCode()) * 31;
        String str = this.countryCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countryName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.neighborhood;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.number;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.street;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.postalCode;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressLine;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Double d4 = this.latitude;
        int hashCode11 = (hashCode10 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d9 = this.longitude;
        return hashCode11 + (d9 != null ? d9.hashCode() : 0);
    }

    public String toString() {
        return "EventAddress(locale=" + this.locale + ", countryCode=" + this.countryCode + ", countryName=" + this.countryName + ", state=" + this.state + ", city=" + this.city + ", neighborhood=" + this.neighborhood + ", number=" + this.number + ", street=" + this.street + ", postalCode=" + this.postalCode + ", addressLine=" + this.addressLine + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }

    public EventAddress(Locale locale, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d4, Double d9) {
        this.locale = locale;
        this.countryCode = str;
        this.countryName = str2;
        this.state = str3;
        this.city = str4;
        this.neighborhood = str5;
        this.number = str6;
        this.street = str7;
        this.postalCode = str8;
        this.addressLine = str9;
        this.latitude = d4;
        this.longitude = d9;
    }

    public /* synthetic */ EventAddress(Locale locale, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d4, Double d9, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : locale, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : str3, (i4 & 16) != 0 ? null : str4, (i4 & 32) != 0 ? null : str5, (i4 & 64) != 0 ? null : str6, (i4 & 128) != 0 ? null : str7, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : str8, (i4 & 512) != 0 ? null : str9, (i4 & Barcode.FORMAT_UPC_E) != 0 ? null : d4, (i4 & 2048) != 0 ? null : d9);
    }

    public EventAddress(String str) {
        this(Locale.getDefault(), null, null, null, null, null, null, null, null, str, null, null, 3582, null);
    }

    public EventAddress(double d4, double d9) {
        this(null, null, null, null, null, null, null, null, null, null, Double.valueOf(d4), Double.valueOf(d9), 511, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EventAddress(Address address) {
        this(r0 == null ? Locale.getDefault() : r0, address.getCountryCode(), address.getCountryName(), address.getAdminArea(), address.getLocality(), address.getSubLocality(), address.getSubThoroughfare(), address.getThoroughfare(), address.getPostalCode(), address.getAddressLine(0), Double.valueOf(address.getLatitude()), Double.valueOf(address.getLongitude()));
        Locale locale = address.getLocale();
    }
}
