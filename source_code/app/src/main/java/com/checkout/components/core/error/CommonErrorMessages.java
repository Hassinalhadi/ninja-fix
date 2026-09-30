package com.checkout.components.core.error;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\bÁ\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/checkout/components/core/error/CommonErrorMessages;", "", "", "localVersion", "responseVersion", "buildUnmatchedSchemaVersionErrorMessage", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ERROR_MESSAGE_PUBLIC_KEY", "Ljava/lang/String;", "ERROR_MESSAGE_PAYMENT_SESSION_NULL", "ERROR_MESSAGE_INVALID_ID", "ERROR_MESSAGE_INVALID_SECRET", "CARD_PAYMENT_NOT_SUPPORTED", "UPDATE_NOT_SUPPORTED", "ERROR_MESSAGE_NETWORK_REQUEST_UNSUCCESSFUL", "ERROR_MESSAGE_PAYMENT_SESSION_REQUEST_ERROR", "ERROR_MESSAGE_NULL_RESPONSE", "ERROR_MESSAGE_GOOGLE_PAY_PAYMENT_DATA", "ERROR_MESSAGE_PAYMENT_DECLINED", "ERROR_MESSAGE_AUTHENTICATION_CANCELLED", "ERROR_MESSAGE_AUTHENTICATION_DISMISSED", "ERROR_MESSAGE_NO_ACTIVITY_CONTEXT", "RISK_SDK_INSTANCE_NULL_ERROR", "RISK_SDK_ERROR_PUBLISHING_DATA_DETAILS", "RISK_SDK_FAILED_ON_INITIALISATION", "REMEMBER_ME_UNAVAILABLE_ON_CONFIGURATION_PROVIDED", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommonErrorMessages {
    public static final int $stable = 0;

    @NotNull
    public static final String CARD_PAYMENT_NOT_SUPPORTED = "tokenize() is supported only when card payment is supported";

    @NotNull
    public static final String ERROR_MESSAGE_AUTHENTICATION_CANCELLED = "Payment authentication cancelled by user";

    @NotNull
    public static final String ERROR_MESSAGE_AUTHENTICATION_DISMISSED = "Payment authentication challenge dismissed";

    @NotNull
    public static final String ERROR_MESSAGE_GOOGLE_PAY_PAYMENT_DATA = "Invalid Google Pay payment data";

    @NotNull
    public static final String ERROR_MESSAGE_INVALID_ID = "PaymentSessionResponse 'id' cannot be blank.";

    @NotNull
    public static final String ERROR_MESSAGE_INVALID_SECRET = "PaymentSessionResponse 'secret' cannot be blank.";

    @NotNull
    public static final String ERROR_MESSAGE_NETWORK_REQUEST_UNSUCCESSFUL = "Network request is unsuccessful";

    @NotNull
    public static final String ERROR_MESSAGE_NO_ACTIVITY_CONTEXT = "3DS challenge requires an Activity context. Ensure the SDK is initialised with an Activity or a context that wraps an Activity (e.g. Fragment's requireContext()), not Application or Service context.";

    @NotNull
    public static final String ERROR_MESSAGE_NULL_RESPONSE = "Success response is null, can not be parsed";

    @NotNull
    public static final String ERROR_MESSAGE_PAYMENT_DECLINED = "The payment request was declined";

    @NotNull
    public static final String ERROR_MESSAGE_PAYMENT_SESSION_NULL = "PaymentSessionResponse cannot be blank.";

    @NotNull
    public static final String ERROR_MESSAGE_PAYMENT_SESSION_REQUEST_ERROR = "Error while making a network request to payment session";

    @NotNull
    public static final String ERROR_MESSAGE_PUBLIC_KEY = "PublicKey cannot be blank.";

    @NotNull
    public static final CommonErrorMessages INSTANCE = new CommonErrorMessages();

    @NotNull
    public static final String REMEMBER_ME_UNAVAILABLE_ON_CONFIGURATION_PROVIDED = "Remember Me configuration is injected but the payment session doesn't have Remember Me enabled";

    @NotNull
    public static final String RISK_SDK_ERROR_PUBLISHING_DATA_DETAILS = "Risk SDK failed to publish data due to an unexpected error or timeout issue exceeding 5000 ms";

    @NotNull
    public static final String RISK_SDK_FAILED_ON_INITIALISATION = "Risk SDK initialisation failed";

    @NotNull
    public static final String RISK_SDK_INSTANCE_NULL_ERROR = "Risk.getInstance() returned null";

    @NotNull
    public static final String UPDATE_NOT_SUPPORTED = "update() is supported only for Google pay component";

    private CommonErrorMessages() {
    }

    @NotNull
    public final String buildUnmatchedSchemaVersionErrorMessage(@NotNull String localVersion, @NotNull String responseVersion) {
        Intrinsics.echo(localVersion, "localVersion");
        Intrinsics.echo(responseVersion, "responseVersion");
        return "CKO version does not match: SDK is on version " + localVersion + " and response is on version " + responseVersion;
    }
}
