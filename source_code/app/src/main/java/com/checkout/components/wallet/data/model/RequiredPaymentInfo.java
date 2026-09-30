package com.checkout.components.wallet.data.model;

import androidx.appcompat.widget.P0;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.paymentsession.CardParameters;
import com.checkout.components.interfaces.model.paymentsession.Merchant;
import com.checkout.components.interfaces.model.paymentsession.PaymentMethod;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import com.checkout.components.interfaces.model.paymentsession.TransactionInfo;
import com.checkout.components.wallet.ErrorMessages;
import com.checkout.components.wallet.common.CurrencyExtensionsKt;
import com.checkout.components.wallet.wrapper.GooglePayFlowCoordinator;
import com.clevertap.android.sdk.Constants;
import java.math.BigDecimal;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0001.B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010\u000e¨\u0006/"}, d2 = {"Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;", "", "", "publicKey", "Ljava/math/BigDecimal;", "amount", "Lcom/checkout/components/interfaces/model/paymentsession/Merchant;", "merchant", "Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;", "cardParameters", "currency", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/checkout/components/interfaces/model/paymentsession/Merchant;Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/math/BigDecimal;", "component3", "()Lcom/checkout/components/interfaces/model/paymentsession/Merchant;", "component4", "()Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;", "component5", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/checkout/components/interfaces/model/paymentsession/Merchant;Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;Ljava/lang/String;)Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPublicKey", "b", "Ljava/math/BigDecimal;", "getAmount", "c", "Lcom/checkout/components/interfaces/model/paymentsession/Merchant;", "getMerchant", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;", "getCardParameters", "e", "getCurrency", "Companion", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequiredPaymentInfo {
    public static final int $stable = 8;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final String publicKey;

    /* renamed from: b, reason: from kotlin metadata */
    private final BigDecimal amount;

    /* renamed from: c, reason: from kotlin metadata */
    private final Merchant merchant;

    /* renamed from: d */
    private final CardParameters cardParameters;

    /* renamed from: e, reason: from kotlin metadata */
    private final String currency;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001J?\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo$Companion;", "", "", "publicKey", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "paymentSession", "Lcom/checkout/components/wallet/wrapper/GooglePayFlowCoordinator;", "coordinator", "Lkotlin/Function1;", "", "onError", "Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;", "validateAndCreate$wallet_standardRelease", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;Lcom/checkout/components/wallet/wrapper/GooglePayFlowCoordinator;Lkotlin/jvm/functions/Function1;)Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;", "validateAndCreate", "FIELD_PAYMENT_METHOD", "Ljava/lang/String;", "FIELD_TRANSACTION_INFO", "FIELD_CARD_PARAMETERS", "FIELD_MERCHANT", "GOOGLE_PAY_FLOW_COORDINATOR", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final RequiredPaymentInfo validateAndCreate$wallet_standardRelease(String publicKey, PaymentSession paymentSession, GooglePayFlowCoordinator coordinator, Function1<? super String, Unit> onError) {
            Object obj;
            Intrinsics.echo(publicKey, "publicKey");
            Intrinsics.echo(paymentSession, "paymentSession");
            Intrinsics.echo(onError, "onError");
            Iterator<T> it = paymentSession.getPaymentMethods().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((PaymentMethod) obj).getType(), PaymentMethodName.INSTANCE.getGooglePay().getValue())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            if (paymentMethod == null) {
                onError.invoke(ErrorMessages.INSTANCE.createRequiredInfoErrorMessage("paymentMethod"));
                return null;
            }
            TransactionInfo transactionInfo = paymentMethod.getTransactionInfo();
            if (transactionInfo == null) {
                onError.invoke(ErrorMessages.INSTANCE.createRequiredInfoErrorMessage("transactionInfo"));
                return null;
            }
            CardParameters cardParameters = paymentMethod.getCardParameters();
            if (cardParameters == null) {
                onError.invoke(ErrorMessages.INSTANCE.createRequiredInfoErrorMessage("cardParameters"));
                return null;
            }
            Merchant merchant = paymentMethod.getMerchant();
            if (merchant == null) {
                onError.invoke(ErrorMessages.INSTANCE.createRequiredInfoErrorMessage("merchant"));
                return null;
            }
            if (coordinator == null) {
                onError.invoke(ErrorMessages.INSTANCE.createRequiredInfoErrorMessage("GooglePayFlowCoordinator"));
                return null;
            }
            String totalPrice = transactionInfo.getTotalPrice();
            if (CurrencyExtensionsKt.isInvalidAmount(totalPrice)) {
                onError.invoke(ErrorMessages.INSTANCE.createInvalidTotalPriceFormatErrorMessage(totalPrice));
                return null;
            }
            return new RequiredPaymentInfo(publicKey, new BigDecimal(totalPrice), merchant, cardParameters, transactionInfo.getCurrencyCode());
        }
    }

    public RequiredPaymentInfo(String publicKey, BigDecimal amount, Merchant merchant, CardParameters cardParameters, String currency) {
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(amount, "amount");
        Intrinsics.echo(merchant, "merchant");
        Intrinsics.echo(cardParameters, "cardParameters");
        Intrinsics.echo(currency, "currency");
        this.publicKey = publicKey;
        this.amount = amount;
        this.merchant = merchant;
        this.cardParameters = cardParameters;
        this.currency = currency;
    }

    public static /* synthetic */ RequiredPaymentInfo copy$default(RequiredPaymentInfo requiredPaymentInfo, String str, BigDecimal bigDecimal, Merchant merchant, CardParameters cardParameters, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = requiredPaymentInfo.publicKey;
        }
        if ((i4 & 2) != 0) {
            bigDecimal = requiredPaymentInfo.amount;
        }
        if ((i4 & 4) != 0) {
            merchant = requiredPaymentInfo.merchant;
        }
        if ((i4 & 8) != 0) {
            cardParameters = requiredPaymentInfo.cardParameters;
        }
        if ((i4 & 16) != 0) {
            str2 = requiredPaymentInfo.currency;
        }
        String str3 = str2;
        Merchant merchant2 = merchant;
        return requiredPaymentInfo.copy(str, bigDecimal, merchant2, cardParameters, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final Merchant getMerchant() {
        return this.merchant;
    }

    /* renamed from: component4, reason: from getter */
    public final CardParameters getCardParameters() {
        return this.cardParameters;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final RequiredPaymentInfo copy(String publicKey, BigDecimal amount, Merchant merchant, CardParameters cardParameters, String currency) {
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(amount, "amount");
        Intrinsics.echo(merchant, "merchant");
        Intrinsics.echo(cardParameters, "cardParameters");
        Intrinsics.echo(currency, "currency");
        return new RequiredPaymentInfo(publicKey, amount, merchant, cardParameters, currency);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequiredPaymentInfo)) {
            return false;
        }
        RequiredPaymentInfo requiredPaymentInfo = (RequiredPaymentInfo) other;
        return Intrinsics.areEqual(this.publicKey, requiredPaymentInfo.publicKey) && Intrinsics.areEqual(this.amount, requiredPaymentInfo.amount) && Intrinsics.areEqual(this.merchant, requiredPaymentInfo.merchant) && Intrinsics.areEqual(this.cardParameters, requiredPaymentInfo.cardParameters) && Intrinsics.areEqual(this.currency, requiredPaymentInfo.currency);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final CardParameters getCardParameters() {
        return this.cardParameters;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Merchant getMerchant() {
        return this.merchant;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final int hashCode() {
        return this.currency.hashCode() + ((this.cardParameters.hashCode() + ((this.merchant.hashCode() + ((this.amount.hashCode() + (this.publicKey.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.publicKey;
        BigDecimal bigDecimal = this.amount;
        Merchant merchant = this.merchant;
        CardParameters cardParameters = this.cardParameters;
        String str2 = this.currency;
        StringBuilder sb2 = new StringBuilder("RequiredPaymentInfo(publicKey=");
        sb2.append(str);
        sb2.append(", amount=");
        sb2.append(bigDecimal);
        sb2.append(", merchant=");
        sb2.append(merchant);
        sb2.append(", cardParameters=");
        sb2.append(cardParameters);
        sb2.append(", currency=");
        return P0.gold(sb2, str2, ")");
    }
}
