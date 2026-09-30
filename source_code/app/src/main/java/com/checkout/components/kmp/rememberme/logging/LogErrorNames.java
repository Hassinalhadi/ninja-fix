package com.checkout.components.kmp.rememberme.logging;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/checkout/components/kmp/rememberme/logging/LogErrorNames;", "", "<init>", "()V", LogErrorNames.REMEMBER_ME_CREATE_HINT_FAILED, "", LogErrorNames.REMEMBER_ME_CHALLENGE_CREATE_FAILED, LogErrorNames.REMEMBER_ME_RESPOND_CHALLENGE_FAILED, "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogErrorNames {
    public static final int $stable = 0;

    @NotNull
    public static final LogErrorNames INSTANCE = new LogErrorNames();

    @NotNull
    public static final String REMEMBER_ME_CHALLENGE_CREATE_FAILED = "REMEMBER_ME_CHALLENGE_CREATE_FAILED";

    @NotNull
    public static final String REMEMBER_ME_CREATE_HINT_FAILED = "REMEMBER_ME_CREATE_HINT_FAILED";

    @NotNull
    public static final String REMEMBER_ME_RESPOND_CHALLENGE_FAILED = "REMEMBER_ME_RESPOND_CHALLENGE_FAILED";

    private LogErrorNames() {
    }
}
