package com.checkout.components.interfaces.model;

import av.q;
import com.checkout.components.interfaces.b;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJT\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u000e¨\u0006/"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTokenDetails;", "", "", "token", "bin", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "billingAddress", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "phone", "preferredScheme", "tokenReference", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "component4", "()Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/CardTokenDetails;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getToken", "b", "getBin", "c", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "getBillingAddress", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "getPhone", "e", "getPreferredScheme", "f", "getTokenReference", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardTokenDetails {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String token;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String bin;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final BillingAddressNetworkEntity billingAddress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final PhoneNetworkEntity phone;

    /* renamed from: e, reason: from kotlin metadata */
    private final String preferredScheme;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String tokenReference;

    public CardTokenDetails(@NotNull String token, @NotNull String bin, @Nullable BillingAddressNetworkEntity billingAddressNetworkEntity, @Nullable PhoneNetworkEntity phoneNetworkEntity, @Nullable String str, @Nullable String str2) {
        Intrinsics.echo(token, "token");
        Intrinsics.echo(bin, "bin");
        this.token = token;
        this.bin = bin;
        this.billingAddress = billingAddressNetworkEntity;
        this.phone = phoneNetworkEntity;
        this.preferredScheme = str;
        this.tokenReference = str2;
    }

    public static /* synthetic */ CardTokenDetails copy$default(CardTokenDetails cardTokenDetails, String str, String str2, BillingAddressNetworkEntity billingAddressNetworkEntity, PhoneNetworkEntity phoneNetworkEntity, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = cardTokenDetails.token;
        }
        if ((i4 & 2) != 0) {
            str2 = cardTokenDetails.bin;
        }
        if ((i4 & 4) != 0) {
            billingAddressNetworkEntity = cardTokenDetails.billingAddress;
        }
        if ((i4 & 8) != 0) {
            phoneNetworkEntity = cardTokenDetails.phone;
        }
        if ((i4 & 16) != 0) {
            str3 = cardTokenDetails.preferredScheme;
        }
        if ((i4 & 32) != 0) {
            str4 = cardTokenDetails.tokenReference;
        }
        String str5 = str3;
        String str6 = str4;
        return cardTokenDetails.copy(str, str2, billingAddressNetworkEntity, phoneNetworkEntity, str5, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final BillingAddressNetworkEntity getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPreferredScheme() {
        return this.preferredScheme;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getTokenReference() {
        return this.tokenReference;
    }

    @NotNull
    public final CardTokenDetails copy(@NotNull String token, @NotNull String bin, @Nullable BillingAddressNetworkEntity billingAddress, @Nullable PhoneNetworkEntity phone, @Nullable String preferredScheme, @Nullable String tokenReference) {
        Intrinsics.echo(token, "token");
        Intrinsics.echo(bin, "bin");
        return new CardTokenDetails(token, bin, billingAddress, phone, preferredScheme, tokenReference);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardTokenDetails)) {
            return false;
        }
        CardTokenDetails cardTokenDetails = (CardTokenDetails) other;
        return Intrinsics.areEqual(this.token, cardTokenDetails.token) && Intrinsics.areEqual(this.bin, cardTokenDetails.bin) && Intrinsics.areEqual(this.billingAddress, cardTokenDetails.billingAddress) && Intrinsics.areEqual(this.phone, cardTokenDetails.phone) && Intrinsics.areEqual(this.preferredScheme, cardTokenDetails.preferredScheme) && Intrinsics.areEqual(this.tokenReference, cardTokenDetails.tokenReference);
    }

    @Nullable
    public final BillingAddressNetworkEntity getBillingAddress() {
        return this.billingAddress;
    }

    @NotNull
    public final String getBin() {
        return this.bin;
    }

    @Nullable
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getPreferredScheme() {
        return this.preferredScheme;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getTokenReference() {
        return this.tokenReference;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int a6 = b.a(this.bin, this.token.hashCode() * 31, 31);
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.billingAddress;
        int i4 = 0;
        if (billingAddressNetworkEntity == null) {
            hashCode = 0;
        } else {
            hashCode = billingAddressNetworkEntity.hashCode();
        }
        int i5 = (a6 + hashCode) * 31;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        if (phoneNetworkEntity == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = phoneNetworkEntity.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str = this.preferredScheme;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.tokenReference;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i11 + i4;
    }

    @NotNull
    public final String toString() {
        String str = this.token;
        String str2 = this.bin;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.billingAddress;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        String str3 = this.preferredScheme;
        String str4 = this.tokenReference;
        StringBuilder india = q.india("CardTokenDetails(token=", str, ", bin=", str2, ", billingAddress=");
        india.append(billingAddressNetworkEntity);
        india.append(", phone=");
        india.append(phoneNetworkEntity);
        india.append(", preferredScheme=");
        return j.lima(india, str3, ", tokenReference=", str4, ")");
    }

    public /* synthetic */ CardTokenDetails(String str, String str2, BillingAddressNetworkEntity billingAddressNetworkEntity, PhoneNetworkEntity phoneNetworkEntity, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i4 & 4) != 0 ? null : billingAddressNetworkEntity, (i4 & 8) != 0 ? null : phoneNetworkEntity, (i4 & 16) != 0 ? null : str3, (i4 & 32) != 0 ? null : str4);
    }
}
