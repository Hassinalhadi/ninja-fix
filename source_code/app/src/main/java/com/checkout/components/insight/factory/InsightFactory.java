package com.checkout.components.insight.factory;

import android.content.Context;
import com.checkout.components.insight.di.LoggerModule;
import com.checkout.components.insight.di.NetworkModule;
import com.checkout.components.insight.di.b;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.insight.PaymentSessionDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/insight/factory/InsightFactory;", "", "<init>", "()V", "createLogger", "Lcom/checkout/components/interfaces/insight/Logger;", "publicKey", "", "mobileSessionId", "context", "Landroid/content/Context;", "paymentSessionDetails", "Lcom/checkout/components/interfaces/insight/PaymentSessionDetails;", "environment", "Lcom/checkout/components/interfaces/Environment;", "analyticsDisabled", "", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InsightFactory {
    public final Logger createLogger(String publicKey, String mobileSessionId, Context context, PaymentSessionDetails paymentSessionDetails, Environment environment, boolean analyticsDisabled) {
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(mobileSessionId, "mobileSessionId");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(paymentSessionDetails, "paymentSessionDetails");
        Intrinsics.echo(environment, "environment");
        return new b(new LoggerModule(), new NetworkModule(), publicKey, mobileSessionId, paymentSessionDetails, context, environment, Boolean.valueOf(analyticsDisabled)).getLogger();
    }
}
