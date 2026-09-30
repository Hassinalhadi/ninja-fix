package com.checkout.components.insight.di;

import android.content.Context;
import com.checkout.components.insight.di.LoggerComponent;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.insight.PaymentSessionDetails;

/* loaded from: classes3.dex */
public final class a implements LoggerComponent.Factory {
    @Override // com.checkout.components.insight.di.LoggerComponent.Factory
    public final LoggerComponent create(String str, String str2, PaymentSessionDetails paymentSessionDetails, Context context, Environment environment, boolean z2) {
        str.getClass();
        str2.getClass();
        paymentSessionDetails.getClass();
        context.getClass();
        environment.getClass();
        return new b(new LoggerModule(), new NetworkModule(), str, str2, paymentSessionDetails, context, environment, Boolean.valueOf(z2));
    }
}
