package com.checkout.components.card.operations.network.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/checkout/components/card/operations/network/utils/OkHttpConstants;", "", "", "CALL_TIMEOUT_MS", "J", "CONNECTION_TIMEOUT_MS", "READ_TIMEOUT_MS", "", "HEADER_AUTHORIZATION", "Ljava/lang/String;", "HEADER_AUTHORIZATION_PREFIX_VALUE", "HEADER_CONSUMER_AUTHORIZATION", "HEADER_SERVICE_NAME", "HEADER_SERVICE_VERSION", "CONSUMER_HEADER_TOKEN_REFERENCE", "LOGGING_INTERCEPTOR_TAG", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OkHttpConstants {
    public static final int $stable = 0;
    public static final long CALL_TIMEOUT_MS = 10000;
    public static final long CONNECTION_TIMEOUT_MS = 10000;

    @NotNull
    public static final String CONSUMER_HEADER_TOKEN_REFERENCE = "X-Tokenizationreference";

    @NotNull
    public static final String HEADER_AUTHORIZATION = "Authorization";

    @NotNull
    public static final String HEADER_AUTHORIZATION_PREFIX_VALUE = "Bearer";

    @NotNull
    public static final String HEADER_CONSUMER_AUTHORIZATION = "X-ConsumerAuthorization";

    @NotNull
    public static final String HEADER_SERVICE_NAME = "Cko-Service-Name";

    @NotNull
    public static final String HEADER_SERVICE_VERSION = "Cko-Service-Version";

    @NotNull
    public static final OkHttpConstants INSTANCE = new OkHttpConstants();

    @NotNull
    public static final String LOGGING_INTERCEPTOR_TAG = "[okHttp]";
    public static final long READ_TIMEOUT_MS = 30000;

    private OkHttpConstants() {
    }
}
