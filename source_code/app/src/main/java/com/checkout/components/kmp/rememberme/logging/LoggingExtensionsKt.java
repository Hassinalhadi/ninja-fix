package com.checkout.components.kmp.rememberme.logging;

import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2689j6;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"formatStackTraceWithServerCode", "", RedirectCustomTabEventLogger.RESULT_ERROR, "", "serverStatusCode", "", "(Ljava/lang/Throwable;Ljava/lang/Integer;)Ljava/lang/String;", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggingExtensionsKt {
    @NotNull
    public static final String formatStackTraceWithServerCode(@NotNull Throwable error, @Nullable Integer num) {
        Intrinsics.echo(error, "error");
        if (num == null) {
            return "message=".concat(AbstractC2689j6.echo(error));
        }
        return "httpStatus=" + num + ", message=" + AbstractC2689j6.echo(error);
    }
}
