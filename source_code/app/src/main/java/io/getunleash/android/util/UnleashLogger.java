package io.getunleash.android.util;

import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J$\u0010\u0012\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J$\u0010\u0013\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J$\u0010\u0014\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J$\u0010\u0015\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lio/getunleash/android/util/UnleashLogger;", "", "<init>", "()V", "baseTag", "", "logLevel", "Lio/getunleash/android/util/LogLevel;", "getLogLevel", "()Lio/getunleash/android/util/LogLevel;", "setLogLevel", "(Lio/getunleash/android/util/LogLevel;)V", "e", "", "tag", Constants.KEY_MSG, "tr", "", Constants.INAPP_WINDOW, "i", Constants.INAPP_DATA_TAG, CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE, "enabled", "", Constants.INAPP_PRIORITY, "", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnleashLogger {

    @NotNull
    public static final UnleashLogger INSTANCE = new UnleashLogger();

    @NotNull
    private static String baseTag = "io.getunleash";

    @NotNull
    private static LogLevel logLevel = LogLevel.WARN;

    private UnleashLogger() {
    }

    public static /* synthetic */ void d$default(UnleashLogger unleashLogger, String str, String str2, Throwable th, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        unleashLogger.d(str, str2, th);
    }

    public static /* synthetic */ void e$default(UnleashLogger unleashLogger, String str, String str2, Throwable th, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        unleashLogger.e(str, str2, th);
    }

    private final boolean enabled(int priority) {
        if (logLevel != LogLevel.NONE && priority >= logLevel.getPriority()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void i$default(UnleashLogger unleashLogger, String str, String str2, Throwable th, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        unleashLogger.i(str, str2, th);
    }

    public static /* synthetic */ void v$default(UnleashLogger unleashLogger, String str, String str2, Throwable th, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        unleashLogger.v(str, str2, th);
    }

    public static /* synthetic */ void w$default(UnleashLogger unleashLogger, String str, String str2, Throwable th, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        unleashLogger.w(str, str2, th);
    }

    public final void d(@Nullable String tag, @NotNull String msg, @Nullable Throwable tr) {
        Intrinsics.echo(msg, "msg");
        if (!enabled(3)) {
            return;
        }
        Log.d(baseTag + '/' + tag, msg, tr);
    }

    public final void e(@Nullable String tag, @NotNull String msg, @Nullable Throwable tr) {
        Intrinsics.echo(msg, "msg");
        if (!enabled(6)) {
            return;
        }
        Log.e(baseTag + '/' + tag, msg, tr);
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return logLevel;
    }

    public final void i(@Nullable String tag, @NotNull String msg, @Nullable Throwable tr) {
        Intrinsics.echo(msg, "msg");
        if (!enabled(4)) {
            return;
        }
        Log.i(baseTag + '/' + tag, msg, tr);
    }

    public final void setLogLevel(@NotNull LogLevel logLevel2) {
        Intrinsics.echo(logLevel2, "<set-?>");
        logLevel = logLevel2;
    }

    public final void v(@Nullable String tag, @NotNull String msg, @Nullable Throwable tr) {
        Intrinsics.echo(msg, "msg");
        if (!enabled(2)) {
            return;
        }
        Log.v(baseTag + '/' + tag, msg, tr);
    }

    public final void w(@Nullable String tag, @NotNull String msg, @Nullable Throwable tr) {
        Intrinsics.echo(msg, "msg");
        if (!enabled(5)) {
            return;
        }
        Log.w(baseTag + '/' + tag, msg, tr);
    }
}
