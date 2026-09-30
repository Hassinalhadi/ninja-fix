package com.checkout.components.interfaces.insight;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/checkout/components/interfaces/insight/Constants;", "", "<init>", "()V", "LOGS_ENABLED", "", "FORCE_LOGS_ENABLED", "PAY_BUTTON_NAME", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Constants {
    public static final int $stable = 0;

    @NotNull
    public static final String FORCE_LOGS_ENABLED = "force_logs_enabled";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String LOGS_ENABLED = "logs_observability_enabled";

    @NotNull
    public static final String PAY_BUTTON_NAME = "pay_button";

    private Constants() {
    }
}
