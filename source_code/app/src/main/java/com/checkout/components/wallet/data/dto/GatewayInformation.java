package com.checkout.components.wallet.data.dto;

import av.q;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/wallet/data/dto/GatewayInformation;", "", "", "gateway", "gatewayMerchantId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/wallet/data/dto/GatewayInformation;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getGateway", "b", "getGatewayMerchantId", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GatewayInformation {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String gateway;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String gatewayMerchantId;

    public GatewayInformation(String gateway, String gatewayMerchantId) {
        Intrinsics.echo(gateway, "gateway");
        Intrinsics.echo(gatewayMerchantId, "gatewayMerchantId");
        this.gateway = gateway;
        this.gatewayMerchantId = gatewayMerchantId;
    }

    public static /* synthetic */ GatewayInformation copy$default(GatewayInformation gatewayInformation, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = gatewayInformation.gateway;
        }
        if ((i4 & 2) != 0) {
            str2 = gatewayInformation.gatewayMerchantId;
        }
        return gatewayInformation.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGateway() {
        return this.gateway;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGatewayMerchantId() {
        return this.gatewayMerchantId;
    }

    public final GatewayInformation copy(String gateway, String gatewayMerchantId) {
        Intrinsics.echo(gateway, "gateway");
        Intrinsics.echo(gatewayMerchantId, "gatewayMerchantId");
        return new GatewayInformation(gateway, gatewayMerchantId);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GatewayInformation)) {
            return false;
        }
        GatewayInformation gatewayInformation = (GatewayInformation) other;
        return Intrinsics.areEqual(this.gateway, gatewayInformation.gateway) && Intrinsics.areEqual(this.gatewayMerchantId, gatewayInformation.gatewayMerchantId);
    }

    public final String getGateway() {
        return this.gateway;
    }

    public final String getGatewayMerchantId() {
        return this.gatewayMerchantId;
    }

    public final int hashCode() {
        return this.gatewayMerchantId.hashCode() + (this.gateway.hashCode() * 31);
    }

    public final String toString() {
        return q.golf("GatewayInformation(gateway=", this.gateway, ", gatewayMerchantId=", this.gatewayMerchantId, ")");
    }
}
