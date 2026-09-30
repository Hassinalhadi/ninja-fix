package com.checkout.components.core.common;

import Nd.c;
import com.checkout.components.core.mapper.DesignTokensToCoreComposeStyleMapper;
import com.checkout.components.core.ui.model.ComposeStyle;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetailsImpl;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.insight.ProductEventName;
import com.checkout.components.interfaces.insight.ProductEventProperties;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.paymentsession.PaymentMethod;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/checkout/components/core/common/Fixtures;", "", "", "PAYMENT_ID", "Ljava/lang/String;", "CHALLENGE_URL", "Lcom/checkout/components/interfaces/insight/LogDetailsImpl;", "a", "Lcom/checkout/components/interfaces/insight/LogDetailsImpl;", "getLOG_DETAILS$core_standardRelease", "()Lcom/checkout/components/interfaces/insight/LogDetailsImpl;", "LOG_DETAILS", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "b", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "getDUMMY_PAYMENT_SESSION$core_standardRelease", "()Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "DUMMY_PAYMENT_SESSION", "Lcom/checkout/components/interfaces/insight/Logger;", "c", "Lcom/checkout/components/interfaces/insight/Logger;", "getDUMMY_LOGGER$core_standardRelease", "()Lcom/checkout/components/interfaces/insight/Logger;", "DUMMY_LOGGER", "Lcom/checkout/components/core/ui/model/ComposeStyle;", com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "Lcom/checkout/components/core/ui/model/ComposeStyle;", "getComposeStyle$core_standardRelease", "()Lcom/checkout/components/core/ui/model/ComposeStyle;", "composeStyle", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Fixtures {

    @NotNull
    public static final String CHALLENGE_URL = "challengeUrl";

    @NotNull
    public static final String PAYMENT_ID = "paymentId";

    @NotNull
    public static final Fixtures INSTANCE = new Fixtures();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final LogDetailsImpl LOG_DETAILS = new LogDetailsImpl("MOBILE_SESSION_ID", "PAYMENT_SESSION_ID", PaymentMethodName.INSTANCE.getCard());

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final PaymentSession DUMMY_PAYMENT_SESSION = new PaymentSession(com.clevertap.android.sdk.Constants.KEY_ID, "entityId", "processingChannelId", 123, "en-GB", "pounds", ab.juliet(new PaymentMethod(com.clevertap.android.sdk.Constants.KEY_TYPE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070, null)), ab.juliet("flag"), null, null, null);

    /* renamed from: c, reason: collision with root package name */
    private static final Fixtures$DUMMY_LOGGER$1 f4664c = new Logger() { // from class: com.checkout.components.core.common.Fixtures$DUMMY_LOGGER$1
        @Override // com.checkout.components.interfaces.insight.Logger
        /* renamed from: getMobileSessionId */
        public final String getF5107b() {
            return "";
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final void logError(CheckoutError error, String errorStack, boolean throwInDebug) {
            Intrinsics.echo(error, "error");
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final Object logErrorAndAwait(CheckoutError checkoutError, String str, c<? super Unit> cVar) {
            return Unit.INSTANCE;
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final void logInfo(String message) {
            Intrinsics.echo(message, "message");
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final void logWarning(String message) {
            Intrinsics.echo(message, "message");
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final void sendProductEvent(ProductEventName event, ProductEventProperties properties) {
            Intrinsics.echo(event, "event");
            Intrinsics.echo(properties, "properties");
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final void logError(String messageToLog, String name, String message, String stackTrace, boolean throwInDebug) {
            Intrinsics.echo(messageToLog, "messageToLog");
            Intrinsics.echo(name, "name");
            Intrinsics.echo(message, "message");
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final void logWarning(String messageToLog, String name, String message, String stackTrace) {
            Intrinsics.echo(messageToLog, "messageToLog");
            Intrinsics.echo(name, "name");
            Intrinsics.echo(message, "message");
        }
    };

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final ComposeStyle composeStyle = new DesignTokensToCoreComposeStyleMapper().map((DesignTokens) null);
    public static final int $stable = 8;

    private Fixtures() {
    }

    @NotNull
    public final ComposeStyle getComposeStyle$core_standardRelease() {
        return composeStyle;
    }

    @NotNull
    public final Logger getDUMMY_LOGGER$core_standardRelease() {
        return f4664c;
    }

    @NotNull
    public final PaymentSession getDUMMY_PAYMENT_SESSION$core_standardRelease() {
        return DUMMY_PAYMENT_SESSION;
    }

    @NotNull
    public final LogDetailsImpl getLOG_DETAILS$core_standardRelease() {
        return LOG_DETAILS;
    }
}
