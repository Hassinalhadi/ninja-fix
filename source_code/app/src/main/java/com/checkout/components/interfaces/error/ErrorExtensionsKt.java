package com.checkout.components.interfaces.error;

import androidx.appcompat.widget.P0;
import ao.ad;
import com.checkout.components.core.common.Fixtures;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorDetails;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.ui.utils.constants.ErrorConstants;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001aE\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000e\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0002\u001a\u0012\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\b\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u0015*\u00020\u0002\u001a\n\u0010\u0017\u001a\u00020\u0015*\u00020\u0002\u001a\u0012\u0010\u0018\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\b\u001a\u0012\u0010\u001a\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\b\u001a\n\u0010\u001b\u001a\u00020\b*\u00020\u001c¨\u0006\u001d"}, d2 = {"toIntegrationErrorDetails", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Integration;", "Lcom/checkout/components/interfaces/insight/LogDetails;", "toInternalErrorDetails", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Internal;", "toRequestErrorDetails", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Request;", Fixtures.PAYMENT_ID, "", "requestErrorCodes", "", "requestId", "status", "", "(Lcom/checkout/components/interfaces/insight/LogDetails;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Request;", "toPaymentMethodErrorDetails", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$PaymentMethod;", "toPaymentMethodAttemptedError", "Lcom/checkout/components/interfaces/error/CheckoutError$PaymentMethod;", Constants.KEY_MESSAGE, "toComponentIsAvailableNotCheckedError", "Lcom/checkout/components/interfaces/error/CheckoutError$Integration;", "toMethodNotSupportedError", "toComponentNotSupportedError", "validationError", "Lcom/checkout/components/interfaces/error/CheckoutError$Validation;", "paymentMethodConfigurationError", "toLogMessage", "Lcom/checkout/components/interfaces/error/CheckoutError;", "interfaces_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorExtensionsKt {
    @NotNull
    public static final CheckoutError.PaymentMethod paymentMethodConfigurationError(@NotNull LogDetails logDetails, @NotNull String message) {
        Intrinsics.echo(logDetails, "<this>");
        Intrinsics.echo(message, "message");
        return new CheckoutError.PaymentMethod(message, CheckoutErrorCode.CONFIGURATION_INVALID, toPaymentMethodErrorDetails(logDetails));
    }

    @NotNull
    public static final CheckoutError.Integration toComponentIsAvailableNotCheckedError(@NotNull LogDetails logDetails) {
        Intrinsics.echo(logDetails, "<this>");
        return new CheckoutError.Integration("Use 'isAvailable' method to ensure that you can use component " + logDetails.getType(), CheckoutErrorCode.COMPONENT_IS_AVAILABLE_NOT_CHECKED, new CheckoutErrorDetails.Integration(logDetails.getMobileSessionId(), logDetails.getPaymentSessionId(), logDetails.getType()));
    }

    @NotNull
    public static final CheckoutError.Integration toComponentNotSupportedError(@NotNull LogDetails logDetails) {
        Intrinsics.echo(logDetails, "<this>");
        return new CheckoutError.Integration(ad.gray("Component ", logDetails.getType().getValue(), " is not supported"), CheckoutErrorCode.COMPONENT_NOT_SUPPORTED, new CheckoutErrorDetails.Integration(logDetails.getMobileSessionId(), logDetails.getPaymentSessionId(), logDetails.getType()));
    }

    @NotNull
    public static final CheckoutErrorDetails.Integration toIntegrationErrorDetails(@NotNull LogDetails logDetails) {
        Intrinsics.echo(logDetails, "<this>");
        return new CheckoutErrorDetails.Integration(logDetails.getMobileSessionId(), logDetails.getPaymentSessionId(), logDetails.getType());
    }

    @NotNull
    public static final CheckoutErrorDetails.Internal toInternalErrorDetails(@NotNull LogDetails logDetails) {
        Intrinsics.echo(logDetails, "<this>");
        return new CheckoutErrorDetails.Internal(logDetails.getMobileSessionId(), logDetails.getPaymentSessionId(), logDetails.getType());
    }

    @NotNull
    public static final String toLogMessage(@NotNull CheckoutError checkoutError) {
        Intrinsics.echo(checkoutError, "<this>");
        if (checkoutError instanceof CheckoutError.Integration) {
            return "integration_error";
        }
        if (checkoutError instanceof CheckoutError.Internal) {
            return ErrorConstants.INTERNAL_ERROR_TO_LOG;
        }
        if (checkoutError instanceof CheckoutError.PaymentMethod) {
            return "payment_method_error";
        }
        if (checkoutError instanceof CheckoutError.Request) {
            return "request_error";
        }
        if (checkoutError instanceof CheckoutError.Submit) {
            return "submit_error";
        }
        if (checkoutError instanceof CheckoutError.Validation) {
            return "validation_error";
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final CheckoutError.Integration toMethodNotSupportedError(@NotNull LogDetails logDetails) {
        Intrinsics.echo(logDetails, "<this>");
        return new CheckoutError.Integration(P0.crimson(logDetails.getType().getValue(), " does not support this method"), CheckoutErrorCode.METHOD_NOT_SUPPORTED, new CheckoutErrorDetails.Integration(logDetails.getMobileSessionId(), logDetails.getPaymentSessionId(), logDetails.getType()));
    }

    @NotNull
    public static final CheckoutError.PaymentMethod toPaymentMethodAttemptedError(@NotNull LogDetails logDetails, @NotNull String message) {
        Intrinsics.echo(logDetails, "<this>");
        Intrinsics.echo(message, "message");
        return new CheckoutError.PaymentMethod(message, CheckoutErrorCode.PAYMENT_METHOD_ATTEMPT_FAILED, toPaymentMethodErrorDetails(logDetails));
    }

    @NotNull
    public static final CheckoutErrorDetails.PaymentMethod toPaymentMethodErrorDetails(@NotNull LogDetails logDetails) {
        Intrinsics.echo(logDetails, "<this>");
        return new CheckoutErrorDetails.PaymentMethod(logDetails.getMobileSessionId(), logDetails.getPaymentSessionId(), logDetails.getType());
    }

    @NotNull
    public static final CheckoutErrorDetails.Request toRequestErrorDetails(@NotNull LogDetails logDetails, @Nullable String str, @Nullable List<String> list, @Nullable String str2, @Nullable Integer num) {
        Intrinsics.echo(logDetails, "<this>");
        return new CheckoutErrorDetails.Request(logDetails.getMobileSessionId(), logDetails.getPaymentSessionId(), logDetails.getType(), str, list, str2, num);
    }

    public static /* synthetic */ CheckoutErrorDetails.Request toRequestErrorDetails$default(LogDetails logDetails, String str, List list, String str2, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            list = null;
        }
        if ((i4 & 4) != 0) {
            str2 = null;
        }
        if ((i4 & 8) != 0) {
            num = null;
        }
        return toRequestErrorDetails(logDetails, str, list, str2, num);
    }

    @NotNull
    public static final CheckoutError.Validation validationError(@NotNull LogDetails logDetails, @NotNull String message) {
        Intrinsics.echo(logDetails, "<this>");
        Intrinsics.echo(message, "message");
        return new CheckoutError.Validation(message, CheckoutErrorCode.UPDATE_PARAMETER_INVALID, toPaymentMethodErrorDetails(logDetails));
    }
}
