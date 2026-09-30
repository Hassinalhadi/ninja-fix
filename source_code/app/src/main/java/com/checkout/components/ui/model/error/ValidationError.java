package com.checkout.components.ui.model.error;

import com.checkout.components.interfaces.error.model.OperationsError;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/checkout/components/ui/model/error/ValidationError;", "Lcom/checkout/components/interfaces/error/model/OperationsError;", "errorCode", "", Constants.KEY_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ValidationError extends OperationsError {

    @NotNull
    public static final String BLANK_CARDHOLDER_NAME = "ValidationError:1000";

    @NotNull
    public static final String CARD_NOT_SUPPORTED = "ValidationError:1005";

    @NotNull
    public static final String CVV_INVALID_LENGTH = "ValidationError:1003";

    @NotNull
    public static final String EXPIRY_DATE_IN_PAST = "ValidationError:1002";

    @NotNull
    public static final String INVALID_CARD_NUMBER = "ValidationError:1004";

    @NotNull
    public static final String INVALID_EXPIRY_DATE = "ValidationError:1001";
    public static final int $stable = OperationsError.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidationError(@NotNull String errorCode, @NotNull String message) {
        super(errorCode, message);
        Intrinsics.echo(errorCode, "errorCode");
        Intrinsics.echo(message, "message");
    }
}
