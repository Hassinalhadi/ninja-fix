package com.checkout.components.card.operations.network.error;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/card/operations/network/error/ErrorMessages;", "", "", "INTERNAL_ERROR_ON_TOKEN_REQUEST", "Ljava/lang/String;", "TOKEN_REQUEST_FAILED", "NETWORK_REQUEST_ERROR", "ON_TOKENIZED_CALLBACK_NULL", "CARD_FIELDS_INVALID", "CARD_METADATA_ERROR_MESSAGE", "CARD_METADATA_SERVER_FAILURE_MESSAGE", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorMessages {
    public static final int $stable = 0;

    @NotNull
    public static final String CARD_FIELDS_INVALID = "One or more card fields are invalid";

    @NotNull
    public static final String CARD_METADATA_ERROR_MESSAGE = "Card metadata request failed due to unexpected error";

    @NotNull
    public static final String CARD_METADATA_SERVER_FAILURE_MESSAGE = "Card metadata request failed due to server error";

    @NotNull
    public static final ErrorMessages INSTANCE = new ErrorMessages();

    @NotNull
    public static final String INTERNAL_ERROR_ON_TOKEN_REQUEST = "Internal error occurred during token parsing";

    @NotNull
    public static final String NETWORK_REQUEST_ERROR = "Error while making a network request to tokenise card";

    @NotNull
    public static final String ON_TOKENIZED_CALLBACK_NULL = "onTokenized is required for tokenize()";

    @NotNull
    public static final String TOKEN_REQUEST_FAILED = "Card tokenization request is unsuccessful";

    private ErrorMessages() {
    }
}
