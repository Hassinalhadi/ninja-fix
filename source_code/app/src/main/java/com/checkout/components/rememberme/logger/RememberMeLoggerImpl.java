package com.checkout.components.rememberme.logger;

import N4.a;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.kmp.rememberme.logging.RememberMeLogger;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ1\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/rememberme/logger/RememberMeLoggerImpl;", "Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "<init>", "(Lcom/checkout/components/interfaces/insight/Logger;)V", "", Constants.KEY_MESSAGE, "", "logInfo", "(Ljava/lang/String;)V", "logWarning", "messageToLog", "name", "stackTrace", "logError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RememberMeLoggerImpl implements RememberMeLogger {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Logger f5994a;

    public RememberMeLoggerImpl(@NotNull Logger logger) {
        Intrinsics.echo(logger, "logger");
        this.f5994a = logger;
    }

    @Override // com.checkout.components.kmp.rememberme.logging.RememberMeLogger
    public final void logError(@NotNull String messageToLog, @NotNull String name, @NotNull String message, @Nullable String stackTrace) {
        Intrinsics.echo(messageToLog, "messageToLog");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(message, "message");
        a.bravo(this.f5994a, messageToLog, name, message, stackTrace, false, 16, null);
    }

    @Override // com.checkout.components.kmp.rememberme.logging.RememberMeLogger
    public final /* synthetic */ void logInfo(String str, String str2, String str3) {
        R4.a.alpha(this, str, str2, str3);
    }

    @Override // com.checkout.components.kmp.rememberme.logging.RememberMeLogger
    public final /* synthetic */ void logWarning(String str, String str2, String str3) {
        R4.a.bravo(this, str, str2, str3);
    }

    @Override // com.checkout.components.kmp.rememberme.logging.RememberMeLogger
    public final void logInfo(@NotNull String message) {
        Intrinsics.echo(message, "message");
        this.f5994a.logInfo(message);
    }

    @Override // com.checkout.components.kmp.rememberme.logging.RememberMeLogger
    public final void logWarning(@NotNull String message) {
        Intrinsics.echo(message, "message");
        this.f5994a.logWarning(message);
    }
}
