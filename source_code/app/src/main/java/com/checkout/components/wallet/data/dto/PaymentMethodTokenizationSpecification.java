package com.checkout.components.wallet.data.dto;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/checkout/components/wallet/data/dto/PaymentMethodTokenizationSpecification;", "", "", Constants.KEY_TYPE, "Lcom/checkout/components/wallet/data/dto/PaymentMethodGatewayParameters;", "parameters", "<init>", "(Ljava/lang/String;Lcom/checkout/components/wallet/data/dto/PaymentMethodGatewayParameters;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/wallet/data/dto/PaymentMethodGatewayParameters;", Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/checkout/components/wallet/data/dto/PaymentMethodGatewayParameters;)Lcom/checkout/components/wallet/data/dto/PaymentMethodTokenizationSpecification;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "Lcom/checkout/components/wallet/data/dto/PaymentMethodGatewayParameters;", "getParameters", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethodTokenizationSpecification {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final PaymentMethodGatewayParameters parameters;

    public PaymentMethodTokenizationSpecification(String type, PaymentMethodGatewayParameters parameters) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(parameters, "parameters");
        this.type = type;
        this.parameters = parameters;
    }

    public static /* synthetic */ PaymentMethodTokenizationSpecification copy$default(PaymentMethodTokenizationSpecification paymentMethodTokenizationSpecification, String str, PaymentMethodGatewayParameters paymentMethodGatewayParameters, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = paymentMethodTokenizationSpecification.type;
        }
        if ((i4 & 2) != 0) {
            paymentMethodGatewayParameters = paymentMethodTokenizationSpecification.parameters;
        }
        return paymentMethodTokenizationSpecification.copy(str, paymentMethodGatewayParameters);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentMethodGatewayParameters getParameters() {
        return this.parameters;
    }

    public final PaymentMethodTokenizationSpecification copy(String type, PaymentMethodGatewayParameters parameters) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(parameters, "parameters");
        return new PaymentMethodTokenizationSpecification(type, parameters);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodTokenizationSpecification)) {
            return false;
        }
        PaymentMethodTokenizationSpecification paymentMethodTokenizationSpecification = (PaymentMethodTokenizationSpecification) other;
        return Intrinsics.areEqual(this.type, paymentMethodTokenizationSpecification.type) && Intrinsics.areEqual(this.parameters, paymentMethodTokenizationSpecification.parameters);
    }

    public final PaymentMethodGatewayParameters getParameters() {
        return this.parameters;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.parameters.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentMethodTokenizationSpecification(type=" + this.type + ", parameters=" + this.parameters + ")";
    }
}
