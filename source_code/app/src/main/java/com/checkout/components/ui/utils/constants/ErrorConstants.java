package com.checkout.components.ui.utils.constants;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/checkout/components/ui/utils/constants/ErrorConstants;", "", "<init>", "()V", Constants.KEY_COLOR, "", "getColor", "()J", "FONT_SIZE", "", "INTEGRATION_ERROR_TO_LOG", "", "INTERNAL_ERROR_TO_LOG", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorConstants {
    public static final int $stable = 0;
    public static final int FONT_SIZE = 12;

    @NotNull
    public static final String INTEGRATION_ERROR_TO_LOG = "integration_error";

    @NotNull
    public static final String INTERNAL_ERROR_TO_LOG = "internal_error";

    @NotNull
    public static final ErrorConstants INSTANCE = new ErrorConstants();
    private static final long color = 4289538110L;

    private ErrorConstants() {
    }

    public final long getColor() {
        return color;
    }
}
