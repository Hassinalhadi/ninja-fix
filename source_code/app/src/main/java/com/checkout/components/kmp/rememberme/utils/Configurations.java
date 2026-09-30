package com.checkout.components.kmp.rememberme.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/Configurations;", "", "<init>", "()V", "CAG_BASE_URL_SBOX", "", "CAG_BASE_URL_PROD", "CONSUMER_API_BASE_URL_SBOX", "CONSUMER_API_BASE_URL_PROD", "CONSUMER_API_GET_HINT_PATH", "CONSUMER_API_CREATE_CHALLENGE_PATH", "HEADER_SERVICE_NAME", "HEADER_SERVICE_VERSION", "respondChallengePath", "challengeId", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Configurations {
    public static final int $stable = 0;

    @NotNull
    public static final String CAG_BASE_URL_PROD = "card-acquisition-gateway.checkout.com";

    @NotNull
    public static final String CAG_BASE_URL_SBOX = "card-acquisition-gateway.sandbox.checkout.com";

    @NotNull
    public static final String CONSUMER_API_BASE_URL_PROD = "devices.api.checkout.com";

    @NotNull
    public static final String CONSUMER_API_BASE_URL_SBOX = "devices.api.sandbox.checkout.com";

    @NotNull
    public static final String CONSUMER_API_CREATE_CHALLENGE_PATH = "authentication/challenges";

    @NotNull
    public static final String CONSUMER_API_GET_HINT_PATH = "authentication/hints";

    @NotNull
    public static final String HEADER_SERVICE_NAME = "Cko-Service-Name";

    @NotNull
    public static final String HEADER_SERVICE_VERSION = "Cko-Service-Version";

    @NotNull
    public static final Configurations INSTANCE = new Configurations();

    private Configurations() {
    }

    @NotNull
    public final String respondChallengePath(@NotNull String challengeId) {
        Intrinsics.echo(challengeId, "challengeId");
        return "authentication/challenges/" + challengeId + "/respond";
    }
}
