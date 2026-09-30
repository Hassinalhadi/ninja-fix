package okhttp3.internal.connection;

import Tf.as;
import Tf.b;
import Tf.l;
import Tf.m;
import com.clevertap.android.sdk.Constants;
import io.reactivex.annotations.SchedulerSupport;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 \u0095\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0095\u0001Bc\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010\"\u001a\u00020\u001cH\u0000¢\u0006\u0004\b!\u0010\u001eJ\r\u0010#\u001a\u00020\u001c¢\u0006\u0004\b#\u0010\u001eJ'\u0010+\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010&H\u0000¢\u0006\u0004\b)\u0010*J\u001f\u00103\u001a\u0002002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00109\u001a\u0002062\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b7\u00108J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010:J\u000f\u0010;\u001a\u00020\u001cH\u0016¢\u0006\u0004\b;\u0010\u001eJ\u000f\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010<J\u0015\u0010>\u001a\u00020(2\u0006\u0010=\u001a\u00020(¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010H\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010JJ'\u0010P\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,2\u0006\u0010K\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0000¢\u0006\u0004\bN\u0010OJ!\u0010T\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020Q2\b\u0010S\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010VJ\u000f\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u001cH\u0002¢\u0006\u0004\bZ\u0010\u001eJ\u001d\u0010\\\u001a\u00020(2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0&H\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010`\u001a\u00020(2\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b`\u0010aJ\u001f\u0010b\u001a\u00020(2\u0006\u0010_\u001a\u00020^2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\bb\u0010cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010j\u001a\u0004\bk\u0010:R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010lR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010lR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010mR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010nR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010oR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010pR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010qR\u001a\u0010\u0019\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010r\u001a\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\"\u0010\u001d\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0016\u0010 \u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010wR#\u0010|\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b|\u0010q\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0081\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010qR\u0018\u0010\u0082\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010qR(\u0010\u0084\u0001\u001a\u00020\u00162\u0007\u0010\u0083\u0001\u001a\u00020\u00168\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010q\u001a\u0005\b\u0085\u0001\u0010~R*\u0010\u0088\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020Q0\u0087\u00010\u0086\u00018\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0094\u0001\u001a\u00020(8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010y¨\u0006\u0096\u0001"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/Route;", "route", "Ljava/net/Socket;", "rawSocket", "socket", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Protocol;", "protocol", "LTf/m;", "source", "LTf/l;", "sink", "", "pingIntervalMillis", "Lokhttp3/internal/connection/ConnectionListener;", "connectionListener", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;Ljava/net/Socket;Ljava/net/Socket;Lokhttp3/Handshake;Lokhttp3/Protocol;LTf/m;LTf/l;ILokhttp3/internal/connection/ConnectionListener;)V", "", "noNewExchanges", "()V", "noCoalescedConnections$okhttp", "noCoalescedConnections", "incrementSuccessCount$okhttp", "incrementSuccessCount", "start", "Lokhttp3/Address;", "address", "", "routes", "", "isEligible$okhttp", "(Lokhttp3/Address;Ljava/util/List;)Z", "isEligible", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "newCodec$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "newCodec", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams$okhttp", "(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "()Lokhttp3/Route;", "cancel", "()Ljava/net/Socket;", "doExtensiveChecks", "isHealthy", "(Z)Z", "Lokhttp3/internal/http2/Http2Stream;", "stream", "onStream", "(Lokhttp3/internal/http2/Http2Stream;)V", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V", "()Lokhttp3/Handshake;", "failedRoute", "Ljava/io/IOException;", "failure", "connectFailed$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/Route;Ljava/io/IOException;)V", "connectFailed", "Lokhttp3/internal/connection/RealCall;", "call", "e", "trackFailure", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "()Lokhttp3/Protocol;", "", "toString", "()Ljava/lang/String;", "startHttp2", "candidates", "routeMatchesAny", "(Ljava/util/List;)Z", "Lokhttp3/HttpUrl;", Constants.KEY_URL, "supportsUrl", "(Lokhttp3/HttpUrl;)Z", "certificateSupportHost", "(Lokhttp3/HttpUrl;Lokhttp3/Handshake;)Z", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner", "()Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/Route;", "getRoute", "Ljava/net/Socket;", "Lokhttp3/Handshake;", "Lokhttp3/Protocol;", "LTf/m;", "LTf/l;", "I", "Lokhttp3/internal/connection/ConnectionListener;", "getConnectionListener$okhttp", "()Lokhttp3/internal/connection/ConnectionListener;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "Z", "getNoNewExchanges", "()Z", "setNoNewExchanges", "(Z)V", "routeFailureCount", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "successCount", "refusedStreamCount", "value", "allocationLimit", "getAllocationLimit$okhttp", "", "Ljava/lang/ref/Reference;", "calls", "Ljava/util/List;", "getCalls", "()Ljava/util/List;", "", "idleAtNs", "J", "getIdleAtNs", "()J", "setIdleAtNs", "(J)V", "isMultiplexed$okhttp", "isMultiplexed", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection, ExchangeCodec.Carrier, Lockable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private int allocationLimit;

    @NotNull
    private final List<Reference<RealCall>> calls;

    @NotNull
    private final ConnectionListener connectionListener;

    @NotNull
    private final RealConnectionPool connectionPool;

    @Nullable
    private final Handshake handshake;

    @Nullable
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private final int pingIntervalMillis;

    @NotNull
    private final Protocol protocol;

    @NotNull
    private final Socket rawSocket;
    private int refusedStreamCount;

    @NotNull
    private final Route route;
    private int routeFailureCount;

    @NotNull
    private final l sink;

    @NotNull
    private final Socket socket;

    @NotNull
    private final m source;
    private int successCount;

    @NotNull
    private final TaskRunner taskRunner;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "<init>", "()V", "IDLE_CONNECTION_HEALTHY_NS", "", "newTestConnection", "Lokhttp3/internal/connection/RealConnection;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "socket", "Ljava/net/Socket;", "idleAtNs", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RealConnection newTestConnection(@NotNull TaskRunner taskRunner, @NotNull RealConnectionPool connectionPool, @NotNull Route route, @NotNull Socket socket, long idleAtNs) {
            Intrinsics.echo(taskRunner, "taskRunner");
            Intrinsics.echo(connectionPool, "connectionPool");
            Intrinsics.echo(route, "route");
            Intrinsics.echo(socket, "socket");
            RealConnection realConnection = new RealConnection(taskRunner, connectionPool, route, new Socket(), socket, null, Protocol.HTTP_2, b.charlie(new RealConnection$Companion$newTestConnection$result$1()), b.bravo(new RealConnection$Companion$newTestConnection$result$2()), 0, ConnectionListener.INSTANCE.getNONE());
            realConnection.setIdleAtNs(idleAtNs);
            return realConnection;
        }

        private Companion() {
        }
    }

    public RealConnection(@NotNull TaskRunner taskRunner, @NotNull RealConnectionPool connectionPool, @NotNull Route route, @NotNull Socket rawSocket, @NotNull Socket socket, @Nullable Handshake handshake, @NotNull Protocol protocol, @NotNull m source, @NotNull l sink, int i4, @NotNull ConnectionListener connectionListener) {
        Intrinsics.echo(taskRunner, "taskRunner");
        Intrinsics.echo(connectionPool, "connectionPool");
        Intrinsics.echo(route, "route");
        Intrinsics.echo(rawSocket, "rawSocket");
        Intrinsics.echo(socket, "socket");
        Intrinsics.echo(protocol, "protocol");
        Intrinsics.echo(source, "source");
        Intrinsics.echo(sink, "sink");
        Intrinsics.echo(connectionListener, "connectionListener");
        this.taskRunner = taskRunner;
        this.connectionPool = connectionPool;
        this.route = route;
        this.rawSocket = rawSocket;
        this.socket = socket;
        this.handshake = handshake;
        this.protocol = protocol;
        this.source = source;
        this.sink = sink;
        this.pingIntervalMillis = i4;
        this.connectionListener = connectionListener;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    private final boolean certificateSupportHost(HttpUrl url, Handshake handshake) {
        List<Certificate> peerCertificates = handshake.peerCertificates();
        if (!peerCertificates.isEmpty()) {
            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
            String host = url.host();
            Certificate certificate = peerCertificates.get(0);
            Intrinsics.charlie(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (okHostnameVerifier.verify(host, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final boolean routeMatchesAny(List<Route> candidates) {
        boolean z2;
        if (candidates != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !candidates.isEmpty()) {
            for (Route route : candidates) {
                Proxy.Type type = route.proxy().type();
                Proxy.Type type2 = Proxy.Type.DIRECT;
                if (type == type2 && getRoute().proxy().type() == type2 && Intrinsics.areEqual(getRoute().socketAddress(), route.socketAddress())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void startHttp2() throws IOException {
        FlowControlListener flowControlListener;
        this.socket.setSoTimeout(0);
        Object obj = this.connectionListener;
        if (obj instanceof FlowControlListener) {
            flowControlListener = (FlowControlListener) obj;
        } else {
            flowControlListener = null;
        }
        if (flowControlListener == null) {
            flowControlListener = FlowControlListener.None.INSTANCE;
        }
        Http2Connection build = new Http2Connection.Builder(true, this.taskRunner).socket(this.socket, getRoute().address().url().host(), this.source, this.sink).listener(this).pingIntervalMillis(this.pingIntervalMillis).flowControlListener(flowControlListener).build();
        this.http2Connection = build;
        this.allocationLimit = Http2Connection.INSTANCE.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(build, false, 1, null);
    }

    private final boolean supportsUrl(HttpUrl url) {
        Handshake handshake;
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        HttpUrl url2 = getRoute().address().url();
        if (url.port() != url2.port()) {
            return false;
        }
        if (Intrinsics.areEqual(url.host(), url2.host())) {
            return true;
        }
        if (this.noCoalescedConnections || (handshake = this.handshake) == null || !certificateSupportHost(url, handshake)) {
            return false;
        }
        return true;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    /* renamed from: cancel */
    public void mo355cancel() {
        _UtilJvmKt.closeQuietly(this.rawSocket);
    }

    public final void connectFailed$okhttp(@NotNull OkHttpClient client, @NotNull Route failedRoute, @NotNull IOException failure) {
        Intrinsics.echo(client, "client");
        Intrinsics.echo(failedRoute, "failedRoute");
        Intrinsics.echo(failure, "failure");
        if (failedRoute.proxy().type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.address();
            address.proxySelector().connectFailed(address.url().uri(), failedRoute.proxy().address(), failure);
        }
        client.getRouteDatabase().failed(failedRoute);
    }

    /* renamed from: getAllocationLimit$okhttp, reason: from getter */
    public final int getAllocationLimit() {
        return this.allocationLimit;
    }

    @NotNull
    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    @NotNull
    /* renamed from: getConnectionListener$okhttp, reason: from getter */
    public final ConnectionListener getConnectionListener() {
        return this.connectionListener;
    }

    @NotNull
    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    @NotNull
    public Route getRoute() {
        return this.route;
    }

    /* renamed from: getRouteFailureCount$okhttp, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    @NotNull
    public final TaskRunner getTaskRunner() {
        return this.taskRunner;
    }

    @Override // okhttp3.Connection
    @Nullable
    /* renamed from: handshake, reason: from getter */
    public Handshake getHandshake() {
        return this.handshake;
    }

    public final void incrementSuccessCount$okhttp() {
        synchronized (this) {
            this.successCount++;
        }
    }

    public final boolean isEligible$okhttp(@NotNull Address address, @Nullable List<Route> routes) {
        Intrinsics.echo(address, "address");
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !getRoute().address().equalsNonHost$okhttp(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.url().host(), route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || routes == null || !routeMatchesAny(routes) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            CertificatePinner certificatePinner = address.certificatePinner();
            Intrinsics.checkNotNull(certificatePinner);
            String host = address.url().host();
            Handshake handshake = getHandshake();
            Intrinsics.checkNotNull(handshake);
            certificatePinner.check(host, handshake.peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean isHealthy(boolean doExtensiveChecks) {
        long j5;
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        if (!this.rawSocket.isClosed() && !this.socket.isClosed() && !this.socket.isInputShutdown() && !this.socket.isOutputShutdown()) {
            Http2Connection http2Connection = this.http2Connection;
            if (http2Connection != null) {
                return http2Connection.isHealthy(nanoTime);
            }
            synchronized (this) {
                j5 = nanoTime - this.idleAtNs;
            }
            if (j5 >= IDLE_CONNECTION_HEALTHY_NS && doExtensiveChecks) {
                return _UtilJvmKt.isHealthy(this.socket, this.source);
            }
            return true;
        }
        return false;
    }

    public final boolean isMultiplexed$okhttp() {
        if (this.http2Connection != null) {
            return true;
        }
        return false;
    }

    @NotNull
    public final ExchangeCodec newCodec$okhttp(@NotNull OkHttpClient client, @NotNull RealInterceptorChain chain) throws SocketException {
        Intrinsics.echo(client, "client");
        Intrinsics.echo(chain, "chain");
        Socket socket = this.socket;
        m mVar = this.source;
        l lVar = this.sink;
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        socket.setSoTimeout(chain.readTimeoutMillis());
        as timeout = mVar.timeout();
        long readTimeoutMillis = chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis, timeUnit);
        lVar.timeout().timeout(chain.getWriteTimeoutMillis(), timeUnit);
        return new Http1ExchangeCodec(client, this, mVar, lVar);
    }

    @NotNull
    public final RealWebSocket.Streams newWebSocketStreams$okhttp(@NotNull final Exchange exchange) throws SocketException {
        Intrinsics.echo(exchange, "exchange");
        this.socket.setSoTimeout(0);
        noNewExchanges();
        final m mVar = this.source;
        final l lVar = this.sink;
        return new RealWebSocket.Streams(mVar, lVar) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // okhttp3.internal.ws.RealWebSocket.Streams
            public void cancel() {
                Exchange.this.cancel();
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                Exchange.this.bodyComplete(-1L, true, true, null);
            }
        };
    }

    public final void noCoalescedConnections$okhttp() {
        synchronized (this) {
            this.noCoalescedConnections = true;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void noNewExchanges() {
        synchronized (this) {
            this.noNewExchanges = true;
        }
        this.connectionListener.noNewExchanges(this);
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onSettings(@NotNull Http2Connection connection, @NotNull Settings settings) {
        Intrinsics.echo(connection, "connection");
        Intrinsics.echo(settings, "settings");
        synchronized (this) {
            try {
                int i4 = this.allocationLimit;
                int maxConcurrentStreams = settings.getMaxConcurrentStreams();
                this.allocationLimit = maxConcurrentStreams;
                if (maxConcurrentStreams < i4) {
                    this.connectionPool.scheduleOpener(getRoute().address());
                } else if (maxConcurrentStreams > i4) {
                    this.connectionPool.scheduleCloser();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(@NotNull Http2Stream stream) throws IOException {
        Intrinsics.echo(stream, "stream");
        stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.Connection
    @NotNull
    /* renamed from: protocol, reason: from getter */
    public Protocol getProtocol() {
        return this.protocol;
    }

    @Override // okhttp3.Connection
    @NotNull
    public Route route() {
        return getRoute();
    }

    public final void setIdleAtNs(long j5) {
        this.idleAtNs = j5;
    }

    public final void setNoNewExchanges(boolean z2) {
        this.noNewExchanges = z2;
    }

    public final void setRouteFailureCount$okhttp(int i4) {
        this.routeFailureCount = i4;
    }

    @Override // okhttp3.Connection
    @NotNull
    /* renamed from: socket, reason: from getter */
    public Socket getSocket() {
        return this.socket;
    }

    public final void start() throws IOException {
        this.idleAtNs = System.nanoTime();
        Protocol protocol = this.protocol;
        if (protocol != Protocol.HTTP_2 && protocol != Protocol.H2_PRIOR_KNOWLEDGE) {
            return;
        }
        startHttp2();
    }

    @NotNull
    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        sb2.append(getRoute().address().url().host());
        sb2.append(':');
        sb2.append(getRoute().address().url().port());
        sb2.append(", proxy=");
        sb2.append(getRoute().proxy());
        sb2.append(" hostAddress=");
        sb2.append(getRoute().socketAddress());
        sb2.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        if (handshake == null || (obj = handshake.cipherSuite()) == null) {
            obj = SchedulerSupport.NONE;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.protocol);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void trackFailure(@NotNull RealCall call, @Nullable IOException e) {
        boolean z2;
        Intrinsics.echo(call, "call");
        synchronized (this) {
            try {
                z2 = false;
                if (e instanceof StreamResetException) {
                    if (((StreamResetException) e).errorCode == ErrorCode.REFUSED_STREAM) {
                        int i4 = this.refusedStreamCount + 1;
                        this.refusedStreamCount = i4;
                        if (i4 > 1) {
                            z2 = !this.noNewExchanges;
                            this.noNewExchanges = true;
                            this.routeFailureCount++;
                        }
                    } else if (((StreamResetException) e).errorCode != ErrorCode.CANCEL || !call.getCanceled()) {
                        z2 = !this.noNewExchanges;
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (!isMultiplexed$okhttp() || (e instanceof ConnectionShutdownException)) {
                    z2 = !this.noNewExchanges;
                    this.noNewExchanges = true;
                    if (this.successCount == 0) {
                        if (e != null) {
                            connectFailed$okhttp(call.getClient(), getRoute(), e);
                        }
                        this.routeFailureCount++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.connectionListener.noNewExchanges(this);
        }
    }
}
