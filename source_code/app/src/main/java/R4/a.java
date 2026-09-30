package R4;

import com.checkout.components.kmp.rememberme.logging.RememberMeLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static void alpha(RememberMeLogger rememberMeLogger, String messageToLog, String name, String message) {
        Intrinsics.echo(messageToLog, "messageToLog");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(message, "message");
        rememberMeLogger.logInfo(messageToLog);
    }

    public static void bravo(RememberMeLogger rememberMeLogger, String messageToLog, String name, String message) {
        Intrinsics.echo(messageToLog, "messageToLog");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(message, "message");
        rememberMeLogger.logWarning(messageToLog);
    }

    public static /* synthetic */ void echo(RememberMeLogger rememberMeLogger, String str, String str2, String str3, String str4, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 8) != 0) {
                str4 = null;
            }
            rememberMeLogger.logError(str, str2, str3, str4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logError");
    }
}
