package com.checkout.components.insight.di;

import android.content.Context;
import com.checkout.components.insight.LoggerManager;
import com.checkout.components.insight.usecase.SendLogsUseCase;
import com.checkout.components.interfaces.insight.PaymentSessionDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/insight/di/LoggerModule;", "", "<init>", "()V", "provideLoggerManager", "Lcom/checkout/components/insight/LoggerManager;", "publicKey", "", "mobileSessionId", "paymentSessionDetails", "Lcom/checkout/components/interfaces/insight/PaymentSessionDetails;", "context", "Landroid/content/Context;", "sendLogsUseCase", "Lcom/checkout/components/insight/usecase/SendLogsUseCase;", "analyticsDisabled", "", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggerModule {
    public final LoggerManager provideLoggerManager(String publicKey, String mobileSessionId, PaymentSessionDetails paymentSessionDetails, Context context, SendLogsUseCase sendLogsUseCase, boolean analyticsDisabled) {
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(mobileSessionId, "mobileSessionId");
        Intrinsics.echo(paymentSessionDetails, "paymentSessionDetails");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(sendLogsUseCase, "sendLogsUseCase");
        return new LoggerManager(publicKey, mobileSessionId, paymentSessionDetails, context, sendLogsUseCase, analyticsDisabled, false, null, null, 448, null);
    }
}
