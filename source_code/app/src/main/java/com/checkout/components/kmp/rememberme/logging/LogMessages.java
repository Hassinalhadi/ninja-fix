package com.checkout.components.kmp.rememberme.logging;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/checkout/components/kmp/rememberme/logging/LogMessages;", "", "<init>", "()V", "INVALID_EMAIL_FORMAT", "", "CREATE_HINT_REQUEST_FAILED", "CREATE_CHALLENGE_REQUEST_FAILED", "RESPOND_CHALLENGE_REQUEST_FAILED", "UNKNOWN_ERROR", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogMessages {
    public static final int $stable = 0;

    @NotNull
    public static final String CREATE_CHALLENGE_REQUEST_FAILED = "Create challenge request failed";

    @NotNull
    public static final String CREATE_HINT_REQUEST_FAILED = "Create hint request failed";

    @NotNull
    public static final LogMessages INSTANCE = new LogMessages();

    @NotNull
    public static final String INVALID_EMAIL_FORMAT = "Invalid email format";

    @NotNull
    public static final String RESPOND_CHALLENGE_REQUEST_FAILED = "Respond challenge request failed";

    @NotNull
    public static final String UNKNOWN_ERROR = "Unknown error";

    private LogMessages() {
    }
}
