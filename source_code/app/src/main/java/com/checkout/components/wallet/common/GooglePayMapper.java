package com.checkout.components.wallet.common;

import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.model.paymentsession.CardParameters;
import com.checkout.components.wallet.data.dto.BillingAddressParameters;
import com.checkout.components.wallet.data.dto.CardPaymentMethod;
import com.checkout.components.wallet.data.dto.Format;
import com.checkout.components.wallet.data.dto.GatewayInformation;
import com.checkout.components.wallet.data.dto.MerchantInfo;
import com.checkout.components.wallet.data.dto.PaymentDataRequest;
import com.checkout.components.wallet.data.dto.PaymentMethod;
import com.checkout.components.wallet.data.dto.PaymentMethodCardParameters;
import com.checkout.components.wallet.data.dto.PaymentMethodGatewayParameters;
import com.checkout.components.wallet.data.dto.PaymentMethodTokenizationSpecification;
import com.checkout.components.wallet.data.dto.TokenizationSpecification;
import com.checkout.components.wallet.data.dto.TotalPriceStatus;
import com.checkout.components.wallet.data.dto.TransactionInfo;
import com.checkout.components.wallet.data.model.RequiredPaymentInfo;
import com.squareup.moshi.Moshi;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ab;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/wallet/common/GooglePayMapper;", "", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;", "Lcom/checkout/components/interfaces/model/paymentsession/GetCardParameters;", "cardParameters", "", "publicKey", "", "supportedCardSchemes", "Lcom/checkout/components/interfaces/model/CardTypeName;", "supportedCardTypes", "toAllowedPaymentMethodsJsonString", "(Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;", "Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;", "paymentInfo", "toJson", "(Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;", "createIsReadyToPayRequestJson", "Companion", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePayMapper {
    public static final int $stable = 8;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final Moshi f6455a;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/checkout/components/wallet/common/GooglePayMapper$Companion;", "", "Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;", "paymentInfo", "", "", "supportedCardSchemes", "Lcom/checkout/components/interfaces/model/CardTypeName;", "supportedCardTypes", "Lcom/checkout/components/wallet/data/dto/CardPaymentMethod;", "createCardPaymentMethod", "(Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;Ljava/util/List;Ljava/util/List;)Lcom/checkout/components/wallet/data/dto/CardPaymentMethod;", "CARD_PAYMENT_METHOD_TYPE", "Ljava/lang/String;", "TOKENIZATION_SPECIFICATION_TYPE", "GATEWAY_INFORMATION", "API_VERSION", "API_VERSION_MINOR", "ALLOWED_PAYMENT_METHODS", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
        
            if (r12 == null) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CardPaymentMethod createCardPaymentMethod(RequiredPaymentInfo paymentInfo, List<String> supportedCardSchemes, List<? extends CardTypeName> supportedCardTypes) {
            boolean z2;
            Intrinsics.echo(paymentInfo, "paymentInfo");
            CardParameters cardParameters = paymentInfo.getCardParameters();
            TokenizationSpecification tokenizationSpecification = new TokenizationSpecification("PAYMENT_GATEWAY", new GatewayInformation("checkoutltd", paymentInfo.getPublicKey()));
            List<String> allowedAuthMethods = cardParameters.getAllowedAuthMethods();
            if (supportedCardSchemes != null) {
                if (supportedCardSchemes.isEmpty()) {
                    supportedCardSchemes = null;
                }
            }
            supportedCardSchemes = cardParameters.getAllowedCardNetworks();
            List<String> list = supportedCardSchemes;
            BillingAddressParameters billingAddressParameters = new BillingAddressParameters(Format.FULL);
            boolean z10 = true;
            if (supportedCardTypes != null) {
                z2 = supportedCardTypes.contains(CardTypeName.Credit.INSTANCE);
            } else {
                z2 = true;
            }
            if (supportedCardTypes != null) {
                z10 = supportedCardTypes.contains(CardTypeName.Prepaid.INSTANCE);
            }
            return new CardPaymentMethod("CARD", tokenizationSpecification, new com.checkout.components.wallet.data.dto.CardParameters(allowedAuthMethods, list, z10, z2, true, billingAddressParameters));
        }
    }

    public GooglePayMapper(Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        this.f6455a = moshi;
    }

    public final String createIsReadyToPayRequestJson(RequiredPaymentInfo paymentInfo, List<String> supportedCardSchemes, List<? extends CardTypeName> supportedCardTypes) {
        Intrinsics.echo(paymentInfo, "paymentInfo");
        String json = this.f6455a.adapter(Map.class).toJson(y.sierra(new Pair("apiVersion", 2), new Pair("apiVersionMinor", 0), new Pair("allowedPaymentMethods", ab.juliet(INSTANCE.createCardPaymentMethod(paymentInfo, supportedCardSchemes, supportedCardTypes)))));
        Intrinsics.delta(json, "toJson(...)");
        return json;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r5 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toAllowedPaymentMethodsJsonString(CardParameters cardParameters, String publicKey, List<String> supportedCardSchemes, List<? extends CardTypeName> supportedCardTypes) {
        boolean z2;
        Intrinsics.echo(cardParameters, "cardParameters");
        Intrinsics.echo(publicKey, "publicKey");
        List<String> allowedAuthMethods = cardParameters.getAllowedAuthMethods();
        if (supportedCardSchemes != null) {
            if (supportedCardSchemes.isEmpty()) {
                supportedCardSchemes = null;
            }
        }
        supportedCardSchemes = cardParameters.getAllowedCardNetworks();
        boolean z10 = true;
        if (supportedCardTypes != null) {
            z2 = supportedCardTypes.contains(CardTypeName.Prepaid.INSTANCE);
        } else {
            z2 = true;
        }
        if (supportedCardTypes != null) {
            z10 = supportedCardTypes.contains(CardTypeName.Credit.INSTANCE);
        }
        String json = this.f6455a.adapter(List.class).toJson(ab.juliet(new PaymentMethod("CARD", new PaymentMethodCardParameters(allowedAuthMethods, supportedCardSchemes, z2, z10), new PaymentMethodTokenizationSpecification("PAYMENT_GATEWAY", new PaymentMethodGatewayParameters("checkoutltd", publicKey)))));
        Intrinsics.delta(json, "toJson(...)");
        return json;
    }

    public final String toJson(RequiredPaymentInfo paymentInfo, List<String> supportedCardSchemes, List<? extends CardTypeName> supportedCardTypes) {
        Intrinsics.echo(paymentInfo, "paymentInfo");
        CardPaymentMethod createCardPaymentMethod = INSTANCE.createCardPaymentMethod(paymentInfo, supportedCardSchemes, supportedCardTypes);
        MerchantInfo merchantInfo = new MerchantInfo(paymentInfo.getMerchant().getName());
        List juliet = ab.juliet(createCardPaymentMethod);
        String bigDecimal = paymentInfo.getAmount().toString();
        Intrinsics.delta(bigDecimal, "toString(...)");
        String json = this.f6455a.adapter(PaymentDataRequest.class).toJson(new PaymentDataRequest(2, 0, juliet, new TransactionInfo(bigDecimal, TotalPriceStatus.FINAL, paymentInfo.getCurrency()), merchantInfo));
        Intrinsics.delta(json, "toJson(...)");
        return json;
    }
}
