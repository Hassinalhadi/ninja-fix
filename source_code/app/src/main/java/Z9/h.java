package Z9;

import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public abstract class h {
    public static final Set alpha = ArraysKt.g(new String[]{"SSLException", "SSLHandshakeException", "SocketException", "SocketTimeoutException", "EOFException", "UnknownHostException", "ConnectException", "GaiException"});
    public static final List bravo = CollectionsKt.listOf("connection reset", "broken pipe", "socket is closed", "connection closed", "connection abort", "read timed out", "network is unreachable", "software caused connection abort", "no address associated with hostname", "android_getaddrinfo", "eai_nodata", "eai_noname");
}
