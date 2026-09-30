package com.checkout.components.wallet.data.dto;

import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lcom/checkout/components/wallet/data/dto/CardPaymentMethod;", "", "", Constants.KEY_TYPE, "Lcom/checkout/components/wallet/data/dto/TokenizationSpecification;", "tokenizationSpecification", "Lcom/checkout/components/wallet/data/dto/CardParameters;", "parameters", "<init>", "(Ljava/lang/String;Lcom/checkout/components/wallet/data/dto/TokenizationSpecification;Lcom/checkout/components/wallet/data/dto/CardParameters;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/wallet/data/dto/TokenizationSpecification;", "component3", "()Lcom/checkout/components/wallet/data/dto/CardParameters;", Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/checkout/components/wallet/data/dto/TokenizationSpecification;Lcom/checkout/components/wallet/data/dto/CardParameters;)Lcom/checkout/components/wallet/data/dto/CardPaymentMethod;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "Lcom/checkout/components/wallet/data/dto/TokenizationSpecification;", "getTokenizationSpecification", "c", "Lcom/checkout/components/wallet/data/dto/CardParameters;", "getParameters", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardPaymentMethod {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TokenizationSpecification tokenizationSpecification;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CardParameters parameters;

    public CardPaymentMethod(String type, TokenizationSpecification tokenizationSpecification, CardParameters parameters) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(tokenizationSpecification, "tokenizationSpecification");
        Intrinsics.echo(parameters, "parameters");
        this.type = type;
        this.tokenizationSpecification = tokenizationSpecification;
        this.parameters = parameters;
    }

    public static /* synthetic */ CardPaymentMethod copy$default(CardPaymentMethod cardPaymentMethod, String str, TokenizationSpecification tokenizationSpecification, CardParameters cardParameters, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = cardPaymentMethod.type;
        }
        if ((i4 & 2) != 0) {
            tokenizationSpecification = cardPaymentMethod.tokenizationSpecification;
        }
        if ((i4 & 4) != 0) {
            cardParameters = cardPaymentMethod.parameters;
        }
        return cardPaymentMethod.copy(str, tokenizationSpecification, cardParameters);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final TokenizationSpecification getTokenizationSpecification() {
        return this.tokenizationSpecification;
    }

    /* renamed from: component3, reason: from getter */
    public final CardParameters getParameters() {
        return this.parameters;
    }

    public final CardPaymentMethod copy(String type, TokenizationSpecification tokenizationSpecification, CardParameters parameters) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(tokenizationSpecification, "tokenizationSpecification");
        Intrinsics.echo(parameters, "parameters");
        return new CardPaymentMethod(type, tokenizationSpecification, parameters);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardPaymentMethod)) {
            return false;
        }
        CardPaymentMethod cardPaymentMethod = (CardPaymentMethod) other;
        return Intrinsics.areEqual(this.type, cardPaymentMethod.type) && Intrinsics.areEqual(this.tokenizationSpecification, cardPaymentMethod.tokenizationSpecification) && Intrinsics.areEqual(this.parameters, cardPaymentMethod.parameters);
    }

    public final CardParameters getParameters() {
        return this.parameters;
    }

    public final TokenizationSpecification getTokenizationSpecification() {
        return this.tokenizationSpecification;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.parameters.hashCode() + ((this.tokenizationSpecification.hashCode() + (this.type.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CardPaymentMethod(type=" + this.type + ", tokenizationSpecification=" + this.tokenizationSpecification + ", parameters=" + this.parameters + ")";
    }
}
