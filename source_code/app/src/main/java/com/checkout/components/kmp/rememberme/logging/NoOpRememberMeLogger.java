package com.checkout.components.kmp.rememberme.logging;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J*\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/checkout/components/kmp/rememberme/logging/NoOpRememberMeLogger;", "Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "<init>", "()V", "logInfo", "", Constants.KEY_MESSAGE, "", "messageToLog", "name", "logWarning", "logError", "stackTrace", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoOpRememberMeLogger implements RememberMeLogger {
    public static final int $stable = 0;

    @NotNull
    public static final NoOpRememberMeLogger INSTANCE = new NoOpRememberMeLogger();

    private NoOpRememberMeLogger() {
    }

    @Override // com.checkout.components.kmp.rememberme.logging.RememberMeLogger
    public void logError(@NotNull String messageToLog, @NotNull String name, @NotNull String message, @Nullable String stackTrace) {
        Intrinsics.echo(messageToLog, "messageToLog");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(message, "message");
    }

    @Override // com.checkout.components.kmp.rememberme.logging.RememberMeLogger
    public void logInfo(@NotNull String message) {
        Intrinsics.echo(message, "message");
    }

    @Override // com.checkout.components.kmp.rememberme.logging.RememberMeLogger
    public void logWarning(@NotNull String message) {
        Intrinsics.echo(message, "message");
    }

    @Override // com.checkout.components.kmp.rememberme.logging.RememberMeLogger
    public void logInfo(@NotNull String messageToLog, @NotNull String name, @NotNull String message) {
        Intrinsics.echo(messageToLog, "messageToLog");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(message, "message");
    }

    @Override // com.checkout.components.kmp.rememberme.logging.RememberMeLogger
    public void logWarning(@NotNull String messageToLog, @NotNull String name, @NotNull String message) {
        Intrinsics.echo(messageToLog, "messageToLog");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(message, "message");
    }
}
