package com.incognia;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00019B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0097\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017¨\u0006:"}, d2 = {"Lcom/incognia/PaymentEvent;", "", "accountId", "", "externalId", "location", "Lcom/incognia/EventLocation;", "addresses", "", "Lcom/incognia/PaymentAddress;", "paymentValue", "Lcom/incognia/PaymentValue;", "paymentCoupon", "Lcom/incognia/PaymentCoupon;", "paymentMethods", "Lcom/incognia/PaymentMethod;", "storeId", "tag", "properties", "Lcom/incognia/EventProperties;", "status", "(Ljava/lang/String;Ljava/lang/String;Lcom/incognia/EventLocation;Ljava/util/List;Lcom/incognia/PaymentValue;Lcom/incognia/PaymentCoupon;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/incognia/EventProperties;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getAddresses", "()Ljava/util/List;", "getExternalId", "getLocation", "()Lcom/incognia/EventLocation;", "getPaymentCoupon", "()Lcom/incognia/PaymentCoupon;", "getPaymentMethods", "getPaymentValue", "()Lcom/incognia/PaymentValue;", "getProperties", "()Lcom/incognia/EventProperties;", "getStatus", "getStoreId", "getTag", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Builder", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PaymentEvent {
    private final String accountId;
    private final List<PaymentAddress> addresses;
    private final String externalId;
    private final EventLocation location;
    private final PaymentCoupon paymentCoupon;
    private final List<PaymentMethod> paymentMethods;
    private final PaymentValue paymentValue;
    private final EventProperties properties;
    private final String status;
    private final String storeId;
    private final String tag;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0016\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\r\u001a\u00020\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/incognia/PaymentEvent$Builder;", "", "()V", "accountId", "", "addresses", "", "Lcom/incognia/PaymentAddress;", "externalId", "location", "Lcom/incognia/EventLocation;", "paymentCoupon", "Lcom/incognia/PaymentCoupon;", "paymentMethods", "Lcom/incognia/PaymentMethod;", "paymentValue", "Lcom/incognia/PaymentValue;", "properties", "Lcom/incognia/EventProperties;", "status", "storeId", "tag", "build", "Lcom/incognia/PaymentEvent;", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {
        private String accountId = "";
        private List<PaymentAddress> addresses;
        private String externalId;
        private EventLocation location;
        private PaymentCoupon paymentCoupon;
        private List<PaymentMethod> paymentMethods;
        private PaymentValue paymentValue;
        private EventProperties properties;
        private String status;
        private String storeId;
        private String tag;

        public final Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public final Builder addresses(List<PaymentAddress> addresses) {
            this.addresses = addresses;
            return this;
        }

        public final PaymentEvent build() {
            return new PaymentEvent(this.accountId, this.externalId, this.location, this.addresses, this.paymentValue, this.paymentCoupon, this.paymentMethods, this.storeId, this.tag, this.properties, this.status);
        }

        public final Builder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public final Builder location(EventLocation location) {
            this.location = location;
            return this;
        }

        public final Builder paymentCoupon(PaymentCoupon paymentCoupon) {
            this.paymentCoupon = paymentCoupon;
            return this;
        }

        public final Builder paymentMethods(List<PaymentMethod> paymentMethods) {
            this.paymentMethods = paymentMethods;
            return this;
        }

        public final Builder paymentValue(PaymentValue paymentValue) {
            this.paymentValue = paymentValue;
            return this;
        }

        public final Builder properties(EventProperties properties) {
            this.properties = properties;
            return this;
        }

        public final Builder status(String status) {
            this.status = status;
            return this;
        }

        public final Builder storeId(String storeId) {
            this.storeId = storeId;
            return this;
        }

        public final Builder tag(String tag) {
            this.tag = tag;
            return this;
        }
    }

    public PaymentEvent(String str, String str2, EventLocation eventLocation, List<PaymentAddress> list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List<PaymentMethod> list2, String str3, String str4, EventProperties eventProperties, String str5) {
        this.accountId = str;
        this.externalId = str2;
        this.location = eventLocation;
        this.addresses = list;
        this.paymentValue = paymentValue;
        this.paymentCoupon = paymentCoupon;
        this.paymentMethods = list2;
        this.storeId = str3;
        this.tag = str4;
        this.properties = eventProperties;
        this.status = str5;
    }

    public static /* synthetic */ PaymentEvent copy$default(PaymentEvent paymentEvent, String str, String str2, EventLocation eventLocation, List list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List list2, String str3, String str4, EventProperties eventProperties, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = paymentEvent.accountId;
        }
        if ((i4 & 2) != 0) {
            str2 = paymentEvent.externalId;
        }
        if ((i4 & 4) != 0) {
            eventLocation = paymentEvent.location;
        }
        if ((i4 & 8) != 0) {
            list = paymentEvent.addresses;
        }
        if ((i4 & 16) != 0) {
            paymentValue = paymentEvent.paymentValue;
        }
        if ((i4 & 32) != 0) {
            paymentCoupon = paymentEvent.paymentCoupon;
        }
        if ((i4 & 64) != 0) {
            list2 = paymentEvent.paymentMethods;
        }
        if ((i4 & 128) != 0) {
            str3 = paymentEvent.storeId;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            str4 = paymentEvent.tag;
        }
        if ((i4 & 512) != 0) {
            eventProperties = paymentEvent.properties;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            str5 = paymentEvent.status;
        }
        EventProperties eventProperties2 = eventProperties;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        PaymentCoupon paymentCoupon2 = paymentCoupon;
        List list3 = list2;
        PaymentValue paymentValue2 = paymentValue;
        EventLocation eventLocation2 = eventLocation;
        return paymentEvent.copy(str, str2, eventLocation2, list, paymentValue2, paymentCoupon2, list3, str7, str8, eventProperties2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* renamed from: component10, reason: from getter */
    public final EventProperties getProperties() {
        return this.properties;
    }

    /* renamed from: component11, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    /* renamed from: component3, reason: from getter */
    public final EventLocation getLocation() {
        return this.location;
    }

    public final List<PaymentAddress> component4() {
        return this.addresses;
    }

    /* renamed from: component5, reason: from getter */
    public final PaymentValue getPaymentValue() {
        return this.paymentValue;
    }

    /* renamed from: component6, reason: from getter */
    public final PaymentCoupon getPaymentCoupon() {
        return this.paymentCoupon;
    }

    public final List<PaymentMethod> component7() {
        return this.paymentMethods;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public final PaymentEvent copy(String accountId, String externalId, EventLocation location, List<PaymentAddress> addresses, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List<PaymentMethod> paymentMethods, String storeId, String tag, EventProperties properties, String status) {
        return new PaymentEvent(accountId, externalId, location, addresses, paymentValue, paymentCoupon, paymentMethods, storeId, tag, properties, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentEvent)) {
            return false;
        }
        PaymentEvent paymentEvent = (PaymentEvent) other;
        return Intrinsics.areEqual(this.accountId, paymentEvent.accountId) && Intrinsics.areEqual(this.externalId, paymentEvent.externalId) && Intrinsics.areEqual(this.location, paymentEvent.location) && Intrinsics.areEqual(this.addresses, paymentEvent.addresses) && Intrinsics.areEqual(this.paymentValue, paymentEvent.paymentValue) && Intrinsics.areEqual(this.paymentCoupon, paymentEvent.paymentCoupon) && Intrinsics.areEqual(this.paymentMethods, paymentEvent.paymentMethods) && Intrinsics.areEqual(this.storeId, paymentEvent.storeId) && Intrinsics.areEqual(this.tag, paymentEvent.tag) && Intrinsics.areEqual(this.properties, paymentEvent.properties) && Intrinsics.areEqual(this.status, paymentEvent.status);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final List<PaymentAddress> getAddresses() {
        return this.addresses;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final EventLocation getLocation() {
        return this.location;
    }

    public final PaymentCoupon getPaymentCoupon() {
        return this.paymentCoupon;
    }

    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final PaymentValue getPaymentValue() {
        return this.paymentValue;
    }

    public final EventProperties getProperties() {
        return this.properties;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStoreId() {
        return this.storeId;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        int hashCode = this.accountId.hashCode() * 31;
        String str = this.externalId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EventLocation eventLocation = this.location;
        int hashCode3 = (hashCode2 + (eventLocation == null ? 0 : eventLocation.hashCode())) * 31;
        List<PaymentAddress> list = this.addresses;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        PaymentValue paymentValue = this.paymentValue;
        int hashCode5 = (hashCode4 + (paymentValue == null ? 0 : paymentValue.hashCode())) * 31;
        PaymentCoupon paymentCoupon = this.paymentCoupon;
        int hashCode6 = (hashCode5 + (paymentCoupon == null ? 0 : paymentCoupon.hashCode())) * 31;
        List<PaymentMethod> list2 = this.paymentMethods;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.storeId;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EventProperties eventProperties = this.properties;
        int hashCode10 = (hashCode9 + (eventProperties == null ? 0 : eventProperties.hashCode())) * 31;
        String str4 = this.status;
        return hashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentEvent(accountId=");
        sb2.append(this.accountId);
        sb2.append(", externalId=");
        sb2.append(this.externalId);
        sb2.append(", location=");
        sb2.append(this.location);
        sb2.append(", addresses=");
        sb2.append(this.addresses);
        sb2.append(", paymentValue=");
        sb2.append(this.paymentValue);
        sb2.append(", paymentCoupon=");
        sb2.append(this.paymentCoupon);
        sb2.append(", paymentMethods=");
        sb2.append(this.paymentMethods);
        sb2.append(", storeId=");
        sb2.append(this.storeId);
        sb2.append(", tag=");
        sb2.append(this.tag);
        sb2.append(", properties=");
        sb2.append(this.properties);
        sb2.append(", status=");
        return P0.fuchsia(sb2, this.status, ')');
    }

    public /* synthetic */ PaymentEvent(String str, String str2, EventLocation eventLocation, List list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List list2, String str3, String str4, EventProperties eventProperties, String str5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : eventLocation, (i4 & 8) != 0 ? null : list, (i4 & 16) != 0 ? null : paymentValue, (i4 & 32) != 0 ? null : paymentCoupon, (i4 & 64) != 0 ? null : list2, (i4 & 128) != 0 ? null : str3, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : str4, (i4 & 512) != 0 ? null : eventProperties, (i4 & Barcode.FORMAT_UPC_E) != 0 ? null : str5);
    }
}
