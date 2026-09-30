package com.checkout.components.interfaces.insight;

import Nd.c;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J3\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u000bJ-\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0015J!\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/insight/Logger;", "", "", com.clevertap.android.sdk.Constants.KEY_MESSAGE, "", "logInfo", "(Ljava/lang/String;)V", "logWarning", "messageToLog", "name", "stackTrace", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/checkout/components/interfaces/error/CheckoutError;", RedirectCustomTabEventLogger.RESULT_ERROR, "errorStack", "", "throwInDebug", "logError", "(Lcom/checkout/components/interfaces/error/CheckoutError;Ljava/lang/String;Z)V", "logErrorAndAwait", "(Lcom/checkout/components/interfaces/error/CheckoutError;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/checkout/components/interfaces/insight/ProductEventName;", com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, "Lcom/checkout/components/interfaces/insight/ProductEventProperties;", "properties", "sendProductEvent", "(Lcom/checkout/components/interfaces/insight/ProductEventName;Lcom/checkout/components/interfaces/insight/ProductEventProperties;)V", "getMobileSessionId", "()Ljava/lang/String;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Logger {
    @NotNull
    /* renamed from: getMobileSessionId */
    String getF5107b();

    void logError(@NotNull CheckoutError error, @Nullable String errorStack, boolean throwInDebug);

    void logError(@NotNull String messageToLog, @NotNull String name, @NotNull String message, @Nullable String stackTrace, boolean throwInDebug);

    @Nullable
    Object logErrorAndAwait(@NotNull CheckoutError checkoutError, @Nullable String str, @NotNull c<? super Unit> cVar);

    void logInfo(@NotNull String message);

    void logWarning(@NotNull String message);

    void logWarning(@NotNull String messageToLog, @NotNull String name, @NotNull String message, @Nullable String stackTrace);

    void sendProductEvent(@NotNull ProductEventName event, @NotNull ProductEventProperties properties);
}
