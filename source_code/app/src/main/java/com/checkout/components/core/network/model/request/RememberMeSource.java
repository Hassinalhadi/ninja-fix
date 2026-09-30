package com.checkout.components.core.network.model.request;

import androidx.appcompat.widget.P0;
import av.q;
import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001e\u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\rR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0012R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\u001e\u0012\u0004\b-\u0010#\u001a\u0004\b,\u0010\r¨\u0006."}, d2 = {"Lcom/checkout/components/core/network/model/request/RememberMeSource;", "", "", "token", "tokenReference", "", "storeForFutureUse", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "billingAddress", "cvvToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "component5", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;ZLcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Ljava/lang/String;)Lcom/checkout/components/core/network/model/request/RememberMeSource;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getToken", "b", "getTokenReference", "getTokenReference$annotations", "()V", "c", "Z", "getStoreForFutureUse", "getStoreForFutureUse$annotations", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "getBillingAddress", "e", "getCvvToken", "getCvvToken$annotations", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RememberMeSource {
    public static final int $stable = BillingAddressNetworkEntity.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String token;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String tokenReference;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean storeForFutureUse;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final BillingAddressNetworkEntity billingAddress;

    /* renamed from: e, reason: from kotlin metadata */
    private final String cvvToken;

    public RememberMeSource(@NotNull String token, @Json(name = "token_reference") @NotNull String tokenReference, @Json(name = "store_for_future_use") boolean z2, @Nullable BillingAddressNetworkEntity billingAddressNetworkEntity, @Json(name = "cvv") @Nullable String str) {
        Intrinsics.echo(token, "token");
        Intrinsics.echo(tokenReference, "tokenReference");
        this.token = token;
        this.tokenReference = tokenReference;
        this.storeForFutureUse = z2;
        this.billingAddress = billingAddressNetworkEntity;
        this.cvvToken = str;
    }

    public static /* synthetic */ RememberMeSource copy$default(RememberMeSource rememberMeSource, String str, String str2, boolean z2, BillingAddressNetworkEntity billingAddressNetworkEntity, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = rememberMeSource.token;
        }
        if ((i4 & 2) != 0) {
            str2 = rememberMeSource.tokenReference;
        }
        if ((i4 & 4) != 0) {
            z2 = rememberMeSource.storeForFutureUse;
        }
        if ((i4 & 8) != 0) {
            billingAddressNetworkEntity = rememberMeSource.billingAddress;
        }
        if ((i4 & 16) != 0) {
            str3 = rememberMeSource.cvvToken;
        }
        String str4 = str3;
        boolean z10 = z2;
        return rememberMeSource.copy(str, str2, z10, billingAddressNetworkEntity, str4);
    }

    @Json(name = com.checkout.components.rememberme.utils.Constants.CVV_TYPE)
    public static /* synthetic */ void getCvvToken$annotations() {
    }

    @Json(name = "store_for_future_use")
    public static /* synthetic */ void getStoreForFutureUse$annotations() {
    }

    @Json(name = "token_reference")
    public static /* synthetic */ void getTokenReference$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTokenReference() {
        return this.tokenReference;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getStoreForFutureUse() {
        return this.storeForFutureUse;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final BillingAddressNetworkEntity getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getCvvToken() {
        return this.cvvToken;
    }

    @NotNull
    public final RememberMeSource copy(@NotNull String token, @Json(name = "token_reference") @NotNull String tokenReference, @Json(name = "store_for_future_use") boolean storeForFutureUse, @Nullable BillingAddressNetworkEntity billingAddress, @Json(name = "cvv") @Nullable String cvvToken) {
        Intrinsics.echo(token, "token");
        Intrinsics.echo(tokenReference, "tokenReference");
        return new RememberMeSource(token, tokenReference, storeForFutureUse, billingAddress, cvvToken);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RememberMeSource)) {
            return false;
        }
        RememberMeSource rememberMeSource = (RememberMeSource) other;
        return Intrinsics.areEqual(this.token, rememberMeSource.token) && Intrinsics.areEqual(this.tokenReference, rememberMeSource.tokenReference) && this.storeForFutureUse == rememberMeSource.storeForFutureUse && Intrinsics.areEqual(this.billingAddress, rememberMeSource.billingAddress) && Intrinsics.areEqual(this.cvvToken, rememberMeSource.cvvToken);
    }

    @Nullable
    public final BillingAddressNetworkEntity getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    public final String getCvvToken() {
        return this.cvvToken;
    }

    public final boolean getStoreForFutureUse() {
        return this.storeForFutureUse;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getTokenReference() {
        return this.tokenReference;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        int sierra = AbstractC2327c.sierra(this.token.hashCode() * 31, 31, this.tokenReference);
        if (this.storeForFutureUse) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i5 = (i4 + sierra) * 31;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.billingAddress;
        int i10 = 0;
        if (billingAddressNetworkEntity == null) {
            hashCode = 0;
        } else {
            hashCode = billingAddressNetworkEntity.hashCode();
        }
        int i11 = (i5 + hashCode) * 31;
        String str = this.cvvToken;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }

    @NotNull
    public final String toString() {
        String str = this.token;
        String str2 = this.tokenReference;
        boolean z2 = this.storeForFutureUse;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.billingAddress;
        String str3 = this.cvvToken;
        StringBuilder india = q.india("RememberMeSource(token=", str, ", tokenReference=", str2, ", storeForFutureUse=");
        india.append(z2);
        india.append(", billingAddress=");
        india.append(billingAddressNetworkEntity);
        india.append(", cvvToken=");
        return P0.gold(india, str3, ")");
    }

    public /* synthetic */ RememberMeSource(String str, String str2, boolean z2, BillingAddressNetworkEntity billingAddressNetworkEntity, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z2, (i4 & 8) != 0 ? null : billingAddressNetworkEntity, (i4 & 16) != 0 ? null : str3);
    }
}
