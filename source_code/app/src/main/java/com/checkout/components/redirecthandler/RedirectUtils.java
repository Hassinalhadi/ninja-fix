package com.checkout.components.redirecthandler;

import Lb.P;
import Xd.l;
import com.checkout.components.core.common.Fixtures;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.ErrorExtensionsKt;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.insight.ProductEventName;
import com.checkout.components.interfaces.insight.ProductEventProperties;
import com.checkout.components.redirecthandler.RedirectOutcome;
import com.checkout.components.redirecthandler.model.RedirectRequest;
import com.checkout.components.redirecthandler.model.RedirectResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/redirecthandler/RedirectUtils;", "", "<init>", "()V", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "component", "", Fixtures.PAYMENT_ID, "redirectUrl", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "componentCallback", "Lkotlin/Function1;", "Lcom/checkout/components/redirecthandler/RedirectOutcome;", "", "onRedirectCompleted", "actionType", "Lcom/checkout/components/redirecthandler/model/RedirectRequest;", "buildRedirectRequest$redirect_handler_standardRelease", "(Lcom/checkout/components/interfaces/api/PaymentMethodComponent;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/interfaces/component/ComponentCallback;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lcom/checkout/components/redirecthandler/model/RedirectRequest;", "buildRedirectRequest", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectUtils {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(LogDetails logDetails, Logger logger, RedirectUtils redirectUtils, String str, String str2, ComponentCallback componentCallback, PaymentMethodComponent paymentMethodComponent, Function1 function1, RedirectResult result, String errorStack) {
        String a6;
        Intrinsics.echo(result, "result");
        Intrinsics.echo(errorStack, "errorStack");
        String value = logDetails.getType().getValue();
        if (result instanceof RedirectResult.Success) {
            ProductEventName productEventName = ProductEventName.PaymentActionCompleted;
            redirectUtils.getClass();
            logger.sendProductEvent(productEventName, new ProductEventProperties(value, value, str2, null, str, RedirectEventValues.RESULT_SUCCEEDED, null, 72, null));
            l onSuccess = componentCallback.getOnSuccess();
            if (onSuccess != null) {
                onSuccess.invoke(paymentMethodComponent, str);
            }
            function1.invoke(RedirectOutcome.Success.INSTANCE);
        } else if (result instanceof RedirectResult.Failure) {
            ProductEventName productEventName2 = ProductEventName.PaymentActionCompleted;
            redirectUtils.getClass();
            logger.sendProductEvent(productEventName2, new ProductEventProperties(value, value, str2, null, str, RedirectEventValues.RESULT_FAILED, null, 72, null));
            CheckoutErrorCode checkoutErrorCode = CheckoutErrorCode.PAYMENT_REQUEST_DECLINED;
            RedirectResult.Failure failure = (RedirectResult.Failure) result;
            a6 = RedirectUtilsKt.a(failure);
            CheckoutError.PaymentMethod paymentMethod = new CheckoutError.PaymentMethod(a6, checkoutErrorCode, ErrorExtensionsKt.toPaymentMethodErrorDetails(logDetails));
            N4.a.alpha(logger, paymentMethod, errorStack, false, 4, null);
            l onError = componentCallback.getOnError();
            if (onError != null) {
                onError.invoke(paymentMethodComponent, paymentMethod);
            }
            function1.invoke(new RedirectOutcome.Failure(failure.getDeclineReason()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final RedirectRequest buildRedirectRequest$redirect_handler_standardRelease(@NotNull PaymentMethodComponent component, @NotNull String paymentId, @NotNull String redirectUrl, @NotNull Logger logger, @NotNull LogDetails logDetails, @NotNull ComponentCallback componentCallback, @NotNull Function1<? super RedirectOutcome, Unit> onRedirectCompleted, @NotNull String actionType) {
        Intrinsics.echo(component, "component");
        Intrinsics.echo(paymentId, "paymentId");
        Intrinsics.echo(redirectUrl, "redirectUrl");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(componentCallback, "componentCallback");
        Intrinsics.echo(onRedirectCompleted, "onRedirectCompleted");
        Intrinsics.echo(actionType, "actionType");
        return new RedirectRequest(redirectUrl, new P(logDetails, logger, this, paymentId, actionType, componentCallback, component, onRedirectCompleted));
    }
}
