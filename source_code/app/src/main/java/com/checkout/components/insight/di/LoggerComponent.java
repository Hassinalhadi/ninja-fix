package com.checkout.components.insight.di;

import android.content.Context;
import com.checkout.components.insight.LoggerManager;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.insight.PaymentSessionDetails;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/checkout/components/insight/di/LoggerComponent;", "", "getLogger", "Lcom/checkout/components/insight/LoggerManager;", "Factory", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LoggerComponent {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001JD\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/insight/di/LoggerComponent$Factory;", "", "create", "Lcom/checkout/components/insight/di/LoggerComponent;", "publicKey", "", "mobileSessionId", "paymentSessionDetails", "Lcom/checkout/components/interfaces/insight/PaymentSessionDetails;", "context", "Landroid/content/Context;", "environment", "Lcom/checkout/components/interfaces/Environment;", "analyticsDisabled", "", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Factory {
        LoggerComponent create(String publicKey, String mobileSessionId, PaymentSessionDetails paymentSessionDetails, Context context, Environment environment, boolean analyticsDisabled);
    }

    LoggerManager getLogger();
}
