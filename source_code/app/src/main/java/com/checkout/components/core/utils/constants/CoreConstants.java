package com.checkout.components.core.utils.constants;

import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.redirecthandler.RedirectDelegate;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/core/utils/constants/CoreConstants;", "", "", "PAYMENT_SESSION_USE_CASE", "Ljava/lang/String;", "SCHEMA_VERSION_MISMATCH", "NULL_RESPONSE_BODY", "SERVER_ERROR", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "a", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "getTabbyPaymentMethod", "()Lcom/checkout/components/interfaces/model/PaymentMethodName;", "tabbyPaymentMethod", "b", "getTamaraPaymentMethod", "tamaraPaymentMethod", "Lkotlin/text/Regex;", "c", "Lkotlin/text/Regex;", "getWHITESPACE_REGEX", "()Lkotlin/text/Regex;", "WHITESPACE_REGEX", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoreConstants {

    @NotNull
    public static final String NULL_RESPONSE_BODY = "nullResponseBody";

    @NotNull
    public static final String PAYMENT_SESSION_USE_CASE = "PaymentSessionUseCase";

    @NotNull
    public static final String SCHEMA_VERSION_MISMATCH = "schemaVersionMismatch";

    @NotNull
    public static final String SERVER_ERROR = "serverError";

    @NotNull
    public static final CoreConstants INSTANCE = new CoreConstants();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final PaymentMethodName tabbyPaymentMethod = new PaymentMethodName("tabby");

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final PaymentMethodName tamaraPaymentMethod = new PaymentMethodName(RedirectDelegate.COMPONENT_NAME_TAMARA);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Regex WHITESPACE_REGEX = new Regex("\\s+");
    public static final int $stable = 8;

    private CoreConstants() {
    }

    @NotNull
    public final PaymentMethodName getTabbyPaymentMethod() {
        return tabbyPaymentMethod;
    }

    @NotNull
    public final PaymentMethodName getTamaraPaymentMethod() {
        return tamaraPaymentMethod;
    }

    @NotNull
    public final Regex getWHITESPACE_REGEX() {
        return WHITESPACE_REGEX;
    }
}
