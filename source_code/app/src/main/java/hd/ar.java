package hd;

import java.net.SocketTimeoutException;
import kotlin.jvm.internal.Intrinsics;
import od.C2227d;
import s6.AbstractC2742p5;
import s6.E0;

/* loaded from: classes2.dex */
public abstract class ar {
    public static final rg.b alpha = E0.bravo("io.ktor.client.plugins.HttpTimeout");

    static {
        AbstractC2742p5.alpha("HttpTimeout", ap.alpha, new l(6));
    }

    public static final SocketTimeoutException alpha(C2227d request, Throwable th) {
        Object obj;
        Intrinsics.echo(request, "request");
        StringBuilder sb2 = new StringBuilder("Socket timeout has expired [url=");
        sb2.append(request.alpha);
        sb2.append(", socket_timeout=");
        ao aoVar = (ao) request.alpha();
        if (aoVar == null || (obj = aoVar.charlie) == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append("] ms");
        String message = sb2.toString();
        Intrinsics.echo(message, "message");
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(message);
        socketTimeoutException.initCause(th);
        return socketTimeoutException;
    }
}
