package com.checkout.components.wallet;

import com.checkout.components.wallet.data.model.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/wallet/ErrorMessages;", "", "", "infoName", "createRequiredInfoErrorMessage", "(Ljava/lang/String;)Ljava/lang/String;", "totalPrice", "createInvalidTotalPriceFormatErrorMessage", "", "amount", "Lcom/checkout/components/wallet/data/model/Currency;", "currency", "createUpdateDetailsParameterInvalidMessage", "(ILcom/checkout/components/wallet/data/model/Currency;)Ljava/lang/String;", "BUTTON_READY_CHECK_FAILED", "Ljava/lang/String;", "BUTTON_RENDER_FAILED", "PAYMENT_REQUEST_FAILED", "INVALID_CONTEXT_PROVIDED", "INVALID_CURRENCY", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorMessages {
    public static final int $stable = 0;
    public static final String BUTTON_READY_CHECK_FAILED = "Error while checking if the Google Pay button is ready";
    public static final String BUTTON_RENDER_FAILED = "Error while rendering Google Pay button";
    public static final ErrorMessages INSTANCE = new ErrorMessages();
    public static final String INVALID_CONTEXT_PROVIDED = "Context must implement ViewModelStoreOwner and ActivityResultRegistryOwner";
    public static final String INVALID_CURRENCY = "Currency is not provided in update details, missing from payment session, or not supported by the SDK";
    public static final String PAYMENT_REQUEST_FAILED = "Error while making the Google Pay payment request";

    private ErrorMessages() {
    }

    public final String createInvalidTotalPriceFormatErrorMessage(String totalPrice) {
        Intrinsics.echo(totalPrice, "totalPrice");
        return "Invalid total price format for GooglePay: ".concat(totalPrice);
    }

    public final String createRequiredInfoErrorMessage(String infoName) {
        Intrinsics.echo(infoName, "infoName");
        return "Required info " + infoName + " is null";
    }

    public final String createUpdateDetailsParameterInvalidMessage(int amount, Currency currency) {
        if (amount <= 0 && currency == null) {
            return "Invalid UpdateDetails: amount must be greater than 0 and currency is invalid.";
        }
        if (amount <= 0) {
            return "Invalid UpdateDetails: amount must be greater than 0.";
        }
        if (currency == Currency.UNKNOWN) {
            return "Invalid UpdateDetails: currency is invalid.";
        }
        return "Invalid UpdateDetails: unsupported currency and amount.";
    }
}
