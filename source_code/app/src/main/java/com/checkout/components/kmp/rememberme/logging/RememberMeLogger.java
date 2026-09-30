package com.checkout.components.kmp.rememberme.logging;

import R4.a;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J,\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/checkout/components/kmp/rememberme/logging/RememberMeLogger;", "", "logInfo", "", Constants.KEY_MESSAGE, "", "messageToLog", "name", "logWarning", "logError", "stackTrace", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RememberMeLogger {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void logInfo(@NotNull RememberMeLogger rememberMeLogger, @NotNull String messageToLog, @NotNull String name, @NotNull String message) {
            Intrinsics.echo(messageToLog, "messageToLog");
            Intrinsics.echo(name, "name");
            Intrinsics.echo(message, "message");
            a.alpha(rememberMeLogger, messageToLog, name, message);
        }

        @Deprecated
        public static void logWarning(@NotNull RememberMeLogger rememberMeLogger, @NotNull String messageToLog, @NotNull String name, @NotNull String message) {
            Intrinsics.echo(messageToLog, "messageToLog");
            Intrinsics.echo(name, "name");
            Intrinsics.echo(message, "message");
            a.bravo(rememberMeLogger, messageToLog, name, message);
        }
    }

    void logError(@NotNull String messageToLog, @NotNull String name, @NotNull String message, @Nullable String stackTrace);

    void logInfo(@NotNull String message);

    void logInfo(@NotNull String messageToLog, @NotNull String name, @NotNull String message);

    void logWarning(@NotNull String message);

    void logWarning(@NotNull String messageToLog, @NotNull String name, @NotNull String message);
}
