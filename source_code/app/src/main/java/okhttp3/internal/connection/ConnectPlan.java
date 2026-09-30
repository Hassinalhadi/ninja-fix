package okhttp3.internal.connection;

import Tf.as;
import Tf.b;
import Tf.l;
import Tf.m;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.n;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionSpec;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u0001nB\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010-J\u000f\u00100\u001a\u00020+H\u0000¢\u0006\u0004\b/\u0010-J%\u00104\u001a\u00020\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u00020%0\u00152\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b2\u00103J'\u00106\u001a\u0004\u0018\u00010\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u00020%0\u00152\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b5\u00103J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J!\u0010>\u001a\u00020 2\u0006\u0010;\u001a\u00020:2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020 H\u0016¢\u0006\u0004\b@\u0010\"J\u000f\u0010A\u001a\u00020 H\u0016¢\u0006\u0004\bA\u0010\"J\u000f\u0010B\u001a\u00020\u0001H\u0016¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020 ¢\u0006\u0004\bD\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010ER\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010FR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010GR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010GR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010GR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010HR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010IR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010JR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bL\u0010MR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010\u0017\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010GR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010QR\u001a\u0010\u001a\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010G\u001a\u0004\bR\u0010SR\u001a\u0010\u001b\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010H\u001a\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010HR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR$\u0010Z\u001a\u0004\u0018\u00010W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010Y\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010k\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010U¨\u0006o"}, d2 = {"Lokhttp3/internal/connection/ConnectPlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "", "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", "", "retryOnConnectionFailure", "Lokhttp3/internal/connection/ConnectionUser;", "user", "Lokhttp3/internal/connection/RealRoutePlanner;", "routePlanner", "Lokhttp3/Route;", "route", "", "routes", "attempt", "Lokhttp3/Request;", "tunnelRequest", "connectionSpecIndex", "isTlsFallback", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZLokhttp3/internal/connection/ConnectionUser;Lokhttp3/internal/connection/RealRoutePlanner;Lokhttp3/Route;Ljava/util/List;ILokhttp3/Request;IZ)V", Constants.COPY_TYPE, "(ILokhttp3/Request;IZ)Lokhttp3/internal/connection/ConnectPlan;", "", "connectSocket", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "Lokhttp3/ConnectionSpec;", "connectionSpec", "connectTls", "(Ljavax/net/ssl/SSLSocket;Lokhttp3/ConnectionSpec;)V", "createTunnel", "()Lokhttp3/Request;", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTcp", "()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTlsEtc", "connectTunnel$okhttp", "connectTunnel", "connectionSpecs", "planWithCurrentOrInitialConnectionSpec$okhttp", "(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/connection/ConnectPlan;", "planWithCurrentOrInitialConnectionSpec", "nextConnectionSpec$okhttp", "nextConnectionSpec", "Lokhttp3/internal/connection/RealConnection;", "handleSuccess", "()Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/connection/RealCall;", "call", "Ljava/io/IOException;", "e", "trackFailure", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "noNewExchanges", "cancel", "retry", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "closeQuietly", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/connection/RealConnectionPool;", "I", "Z", "Lokhttp3/internal/connection/ConnectionUser;", "Lokhttp3/internal/connection/RealRoutePlanner;", "Lokhttp3/Route;", "getRoute", "()Lokhttp3/Route;", "Ljava/util/List;", "getRoutes$okhttp", "()Ljava/util/List;", "Lokhttp3/Request;", "getConnectionSpecIndex$okhttp", "()I", "isTlsFallback$okhttp", "()Z", "canceled", "Ljava/net/Socket;", "rawSocket", "Ljava/net/Socket;", "socket", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Handshake;", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "LTf/m;", "source", "LTf/m;", "LTf/l;", "sink", "LTf/l;", "connection", "Lokhttp3/internal/connection/RealConnection;", "isReady", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectPlan implements RoutePlanner.Plan, ExchangeCodec.Carrier {
    private static final int MAX_TUNNEL_ATTEMPTS = 21;

    @NotNull
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private final int attempt;
    private volatile boolean canceled;

    @Nullable
    private RealConnection connection;

    @NotNull
    private final RealConnectionPool connectionPool;
    private final int connectionSpecIndex;

    @Nullable
    private Handshake handshake;
    private final boolean isTlsFallback;
    private final int pingIntervalMillis;

    @Nullable
    private Protocol protocol;

    @Nullable
    private Socket rawSocket;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;

    @NotNull
    private final Route route;

    @NotNull
    private final RealRoutePlanner routePlanner;

    @Nullable
    private final List<Route> routes;
    private l sink;

    @Nullable
    private Socket socket;
    private final int socketConnectTimeoutMillis;
    private final int socketReadTimeoutMillis;
    private m source;

    @NotNull
    private final TaskRunner taskRunner;

    @Nullable
    private final Request tunnelRequest;

    @NotNull
    private final ConnectionUser user;
    private final int writeTimeoutMillis;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConnectPlan(@NotNull TaskRunner taskRunner, @NotNull RealConnectionPool connectionPool, int i4, int i5, int i10, int i11, int i12, boolean z2, @NotNull ConnectionUser user, @NotNull RealRoutePlanner routePlanner, @NotNull Route route, @Nullable List<Route> list, int i13, @Nullable Request request, int i14, boolean z10) {
        Intrinsics.echo(taskRunner, "taskRunner");
        Intrinsics.echo(connectionPool, "connectionPool");
        Intrinsics.echo(user, "user");
        Intrinsics.echo(routePlanner, "routePlanner");
        Intrinsics.echo(route, "route");
        this.taskRunner = taskRunner;
        this.connectionPool = connectionPool;
        this.readTimeoutMillis = i4;
        this.writeTimeoutMillis = i5;
        this.socketConnectTimeoutMillis = i10;
        this.socketReadTimeoutMillis = i11;
        this.pingIntervalMillis = i12;
        this.retryOnConnectionFailure = z2;
        this.user = user;
        this.routePlanner = routePlanner;
        this.route = route;
        this.routes = list;
        this.attempt = i13;
        this.tunnelRequest = request;
        this.connectionSpecIndex = i14;
        this.isTlsFallback = z10;
    }

    private final void connectSocket() throws IOException {
        int i4;
        Socket createSocket;
        Proxy.Type type = getRoute().proxy().type();
        if (type == null) {
            i4 = -1;
        } else {
            i4 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i4 != 1 && i4 != 2) {
            createSocket = new Socket(getRoute().proxy());
        } else {
            createSocket = getRoute().address().socketFactory().createSocket();
            Intrinsics.checkNotNull(createSocket);
        }
        this.rawSocket = createSocket;
        if (!this.canceled) {
            createSocket.setSoTimeout(this.socketReadTimeoutMillis);
            try {
                Platform.INSTANCE.get().connectSocket(createSocket, getRoute().socketAddress(), this.socketConnectTimeoutMillis);
                try {
                    this.source = b.charlie(b.kilo(createSocket));
                    this.sink = b.bravo(b.india(createSocket));
                    return;
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(e.getMessage(), NPE_THROW_WITH_NULL)) {
                        return;
                    } else {
                        throw new IOException(e);
                    }
                }
            } catch (ConnectException e4) {
                ConnectException connectException = new ConnectException("Failed to connect to " + getRoute().socketAddress());
                connectException.initCause(e4);
                throw connectException;
            }
        }
        throw new IOException("canceled");
    }

    private final void connectTls(SSLSocket sslSocket, ConnectionSpec connectionSpec) throws IOException {
        String str;
        Protocol protocol;
        Address address = getRoute().address();
        try {
            if (connectionSpec.supportsTlsExtensions()) {
                Platform.INSTANCE.get().configureTlsExtensions(sslSocket, address.url().host(), address.protocols());
            }
            sslSocket.startHandshake();
            SSLSession session = sslSocket.getSession();
            Handshake.Companion companion = Handshake.INSTANCE;
            Intrinsics.checkNotNull(session);
            Handshake handshake = companion.get(session);
            HostnameVerifier hostnameVerifier = address.hostnameVerifier();
            Intrinsics.checkNotNull(hostnameVerifier);
            if (!hostnameVerifier.verify(address.url().host(), session)) {
                List<Certificate> peerCertificates = handshake.peerCertificates();
                if (!peerCertificates.isEmpty()) {
                    Certificate certificate = peerCertificates.get(0);
                    Intrinsics.charlie(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    throw new SSLPeerUnverifiedException(n.delta("\n            |Hostname " + address.url().host() + " not verified:\n            |    certificate: " + CertificatePinner.INSTANCE.pin(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n            "));
                }
                throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
            }
            CertificatePinner certificatePinner = address.certificatePinner();
            Intrinsics.checkNotNull(certificatePinner);
            Handshake handshake2 = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new Ac.l(certificatePinner, handshake, address, 18));
            this.handshake = handshake2;
            certificatePinner.check$okhttp(address.url().host(), new kotlin.collections.n(10, handshake2));
            if (connectionSpec.supportsTlsExtensions()) {
                str = Platform.INSTANCE.get().getSelectedProtocol(sslSocket);
            } else {
                str = null;
            }
            this.socket = sslSocket;
            this.source = b.charlie(b.kilo(sslSocket));
            this.sink = b.bravo(b.india(sslSocket));
            if (str != null) {
                protocol = Protocol.INSTANCE.get(str);
            } else {
                protocol = Protocol.HTTP_1_1;
            }
            this.protocol = protocol;
            Platform.INSTANCE.get().afterHandshake(sslSocket);
        } catch (Throwable th) {
            Platform.INSTANCE.get().afterHandshake(sslSocket);
            _UtilJvmKt.closeQuietly(sslSocket);
            throw th;
        }
    }

    public static final List connectTls$lambda$4(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        CertificateChainCleaner certificateChainCleaner = certificatePinner.getCertificateChainCleaner();
        Intrinsics.checkNotNull(certificateChainCleaner);
        return certificateChainCleaner.clean(handshake.peerCertificates(), address.url().host());
    }

    public static final List connectTls$lambda$6(Handshake handshake) {
        int collectionSizeOrDefault;
        List<Certificate> peerCertificates = handshake.peerCertificates();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(peerCertificates, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Certificate certificate : peerCertificates) {
            Intrinsics.charlie(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    private final ConnectPlan copy(int i4, Request request, int i5, boolean z2) {
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.user, this.routePlanner, getRoute(), this.routes, i4, request, i5, z2);
    }

    public static /* synthetic */ ConnectPlan copy$default(ConnectPlan connectPlan, int i4, Request request, int i5, boolean z2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = connectPlan.attempt;
        }
        if ((i10 & 2) != 0) {
            request = connectPlan.tunnelRequest;
        }
        if ((i10 & 4) != 0) {
            i5 = connectPlan.connectionSpecIndex;
        }
        if ((i10 & 8) != 0) {
            z2 = connectPlan.isTlsFallback;
        }
        return connectPlan.copy(i4, request, i5, z2);
    }

    private final Request createTunnel() throws IOException {
        Request request = this.tunnelRequest;
        Intrinsics.checkNotNull(request);
        String str = "CONNECT " + _UtilJvmKt.toHostHeader(getRoute().address().url(), true) + " HTTP/1.1";
        while (true) {
            m mVar = this.source;
            if (mVar != null) {
                l lVar = this.sink;
                if (lVar != null) {
                    Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, mVar, lVar);
                    m mVar2 = this.source;
                    if (mVar2 != null) {
                        as timeout = mVar2.getTimeout();
                        long j5 = this.readTimeoutMillis;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        timeout.timeout(j5, timeUnit);
                        l lVar2 = this.sink;
                        if (lVar2 != null) {
                            lVar2.timeout().timeout(this.writeTimeoutMillis, timeUnit);
                            http1ExchangeCodec.writeRequest(request.headers(), str);
                            http1ExchangeCodec.finishRequest();
                            Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
                            Intrinsics.checkNotNull(readResponseHeaders);
                            Response build = readResponseHeaders.request(request).build();
                            http1ExchangeCodec.skipConnectBody(build);
                            int code = build.code();
                            if (code == 200) {
                                return null;
                            }
                            if (code == 407) {
                                Request authenticate = getRoute().address().proxyAuthenticator().authenticate(getRoute(), build);
                                if (authenticate != null) {
                                    if (Constants.KEY_HIDE_CLOSE.equalsIgnoreCase(Response.header$default(build, "Connection", null, 2, null))) {
                                        return authenticate;
                                    }
                                    request = authenticate;
                                } else {
                                    throw new IOException("Failed to authenticate with proxy");
                                }
                            } else {
                                throw new IOException("Unexpected response code for CONNECT: " + build.code());
                            }
                        } else {
                            Intrinsics.lima("sink");
                            throw null;
                        }
                    } else {
                        Intrinsics.lima("source");
                        throw null;
                    }
                } else {
                    Intrinsics.lima("sink");
                    throw null;
                }
            } else {
                Intrinsics.lima("source");
                throw null;
            }
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    /* renamed from: cancel */
    public void mo355cancel() {
        this.canceled = true;
        Socket socket = this.rawSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    public final void closeQuietly() {
        Socket socket = this.socket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @NotNull
    /* renamed from: connectTcp */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RoutePlanner.ConnectResult getResult() {
        ConnectPlan connectPlan;
        Socket socket;
        Socket socket2;
        if (this.rawSocket == null) {
            this.user.addPlanToCancel(this);
            boolean z2 = false;
            try {
                this.user.connectStart(getRoute());
                connectSocket();
                z2 = true;
                connectPlan = this;
                try {
                    try {
                        RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(connectPlan, null, null, 6, null);
                        connectPlan.user.removePlanToCancel(this);
                        return connectResult;
                    } catch (IOException e) {
                        e = e;
                        IOException iOException = e;
                        if (getRoute().address().proxy() == null && getRoute().proxy().type() != Proxy.Type.DIRECT) {
                            getRoute().address().proxySelector().connectFailed(getRoute().address().url().uri(), getRoute().proxy().address(), iOException);
                        }
                        connectPlan.user.connectFailed(getRoute(), null, iOException);
                        ConnectPlan connectPlan2 = connectPlan;
                        try {
                            RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(connectPlan2, null, iOException, 2, null);
                            connectPlan.user.removePlanToCancel(this);
                            if (!z2 && (socket2 = connectPlan.rawSocket) != null) {
                                _UtilJvmKt.closeQuietly(socket2);
                            }
                            return connectResult2;
                        } catch (Throwable th) {
                            th = th;
                            connectPlan = connectPlan2;
                            connectPlan.user.removePlanToCancel(this);
                            if (!z2) {
                                _UtilJvmKt.closeQuietly(socket);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    connectPlan.user.removePlanToCancel(this);
                    if (!z2 && (socket = connectPlan.rawSocket) != null) {
                        _UtilJvmKt.closeQuietly(socket);
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                connectPlan = this;
            } catch (Throwable th3) {
                th = th3;
                connectPlan = this;
                connectPlan.user.removePlanToCancel(this);
                if (!z2) {
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("TCP already connected");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @NotNull
    /* renamed from: connectTlsEtc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RoutePlanner.ConnectResult mo360connectTlsEtc() {
        ConnectPlan connectPlan;
        ConnectPlan connectPlan2;
        Socket socket = this.rawSocket;
        if (socket != null) {
            if (!getIsReady()) {
                List<ConnectionSpec> connectionSpecs = getRoute().address().connectionSpecs();
                this.user.addPlanToCancel(this);
                ConnectPlan connectPlan3 = null;
                boolean z2 = false;
                try {
                    try {
                        if (this.tunnelRequest != null) {
                            RoutePlanner.ConnectResult connectTunnel$okhttp = connectTunnel$okhttp();
                            if (connectTunnel$okhttp.getNextPlan() != null || connectTunnel$okhttp.getThrowable() != null) {
                                this.user.removePlanToCancel(this);
                                Socket socket2 = this.socket;
                                if (socket2 != null) {
                                    _UtilJvmKt.closeQuietly(socket2);
                                }
                                _UtilJvmKt.closeQuietly(socket);
                                return connectTunnel$okhttp;
                            }
                        }
                        if (getRoute().address().sslSocketFactory() != null) {
                            m mVar = this.source;
                            if (mVar != null) {
                                if (mVar.delta().hotel()) {
                                    l lVar = this.sink;
                                    if (lVar != null) {
                                        if (lVar.delta().hotel()) {
                                            this.user.secureConnectStart();
                                            Socket createSocket = getRoute().address().sslSocketFactory().createSocket(socket, getRoute().address().url().host(), getRoute().address().url().port(), true);
                                            Intrinsics.charlie(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                                            ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp = planWithCurrentOrInitialConnectionSpec$okhttp(connectionSpecs, sSLSocket);
                                            ConnectionSpec connectionSpec = connectionSpecs.get(planWithCurrentOrInitialConnectionSpec$okhttp.connectionSpecIndex);
                                            connectPlan = planWithCurrentOrInitialConnectionSpec$okhttp.nextConnectionSpec$okhttp(connectionSpecs, sSLSocket);
                                            try {
                                                connectionSpec.apply$okhttp(sSLSocket, planWithCurrentOrInitialConnectionSpec$okhttp.isTlsFallback);
                                                connectTls(sSLSocket, connectionSpec);
                                                this.user.secureConnectEnd(this.handshake);
                                                connectPlan2 = connectPlan;
                                            } catch (IOException e) {
                                                e = e;
                                                this.user.connectFailed(getRoute(), null, e);
                                                if (this.retryOnConnectionFailure && RetryTlsHandshakeKt.retryTlsHandshake(e)) {
                                                    connectPlan3 = connectPlan;
                                                }
                                                RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, connectPlan3, e);
                                                this.user.removePlanToCancel(this);
                                                if (!z2) {
                                                    Socket socket3 = this.socket;
                                                    if (socket3 != null) {
                                                        _UtilJvmKt.closeQuietly(socket3);
                                                    }
                                                    _UtilJvmKt.closeQuietly(socket);
                                                }
                                                return connectResult;
                                            }
                                        }
                                    } else {
                                        Intrinsics.lima("sink");
                                        throw null;
                                    }
                                }
                                throw new IOException("TLS tunnel buffered too many bytes!");
                            }
                            Intrinsics.lima("source");
                            throw null;
                        }
                        this.socket = socket;
                        List<Protocol> protocols = getRoute().address().protocols();
                        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                        if (!protocols.contains(protocol)) {
                            protocol = Protocol.HTTP_1_1;
                        }
                        this.protocol = protocol;
                        connectPlan2 = null;
                        try {
                            TaskRunner taskRunner = this.taskRunner;
                            RealConnectionPool realConnectionPool = this.connectionPool;
                            Route route = getRoute();
                            Socket socket4 = this.socket;
                            Intrinsics.checkNotNull(socket4);
                            Handshake handshake = this.handshake;
                            Protocol protocol2 = this.protocol;
                            Intrinsics.checkNotNull(protocol2);
                            m mVar2 = this.source;
                            if (mVar2 != null) {
                                l lVar2 = this.sink;
                                if (lVar2 != null) {
                                    RealConnection realConnection = new RealConnection(taskRunner, realConnectionPool, route, socket, socket4, handshake, protocol2, mVar2, lVar2, this.pingIntervalMillis, this.connectionPool.getConnectionListener());
                                    this.connection = realConnection;
                                    realConnection.start();
                                    this.user.callConnectEnd(getRoute(), this.protocol);
                                    try {
                                        RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, null, 6, null);
                                        this.user.removePlanToCancel(this);
                                        return connectResult2;
                                    } catch (IOException e4) {
                                        e = e4;
                                        connectPlan = connectPlan2;
                                        z2 = true;
                                        this.user.connectFailed(getRoute(), null, e);
                                        if (this.retryOnConnectionFailure) {
                                            connectPlan3 = connectPlan;
                                        }
                                        RoutePlanner.ConnectResult connectResult3 = new RoutePlanner.ConnectResult(this, connectPlan3, e);
                                        this.user.removePlanToCancel(this);
                                        if (!z2) {
                                        }
                                        return connectResult3;
                                    } catch (Throwable th) {
                                        th = th;
                                        z2 = true;
                                        this.user.removePlanToCancel(this);
                                        if (!z2) {
                                            Socket socket5 = this.socket;
                                            if (socket5 != null) {
                                                _UtilJvmKt.closeQuietly(socket5);
                                            }
                                            _UtilJvmKt.closeQuietly(socket);
                                        }
                                        throw th;
                                    }
                                }
                                Intrinsics.lima("sink");
                                throw null;
                            }
                            Intrinsics.lima("source");
                            throw null;
                        } catch (IOException e5) {
                            e = e5;
                            connectPlan = connectPlan2;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        connectPlan = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("already connected");
            }
        } else {
            throw new IllegalArgumentException("TCP not connected");
        }
    }

    @NotNull
    public final RoutePlanner.ConnectResult connectTunnel$okhttp() throws IOException {
        Request createTunnel = createTunnel();
        if (createTunnel == null) {
            return new RoutePlanner.ConnectResult(this, null, null, 6, null);
        }
        Socket socket = this.rawSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
        int i4 = this.attempt + 1;
        if (i4 < 21) {
            this.user.callConnectEnd(getRoute(), null);
            return new RoutePlanner.ConnectResult(this, copy$default(this, i4, createTunnel, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.user.connectFailed(getRoute(), null, protocolException);
        return new RoutePlanner.ConnectResult(this, null, protocolException, 2, null);
    }

    /* renamed from: getConnectionSpecIndex$okhttp, reason: from getter */
    public final int getConnectionSpecIndex() {
        return this.connectionSpecIndex;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    @NotNull
    public Route getRoute() {
        return this.route;
    }

    @Nullable
    public final List<Route> getRoutes$okhttp() {
        return this.routes;
    }

    @Nullable
    /* renamed from: getSocket$okhttp, reason: from getter */
    public final Socket getSocket() {
        return this.socket;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @NotNull
    /* renamed from: handleSuccess */
    public RealConnection mo356handleSuccess() {
        this.user.updateRouteDatabaseAfterSuccess(getRoute());
        RealConnection realConnection = this.connection;
        Intrinsics.checkNotNull(realConnection);
        this.user.connectionConnectEnd(realConnection, getRoute());
        ReusePlan planReusePooledConnection$okhttp = this.routePlanner.planReusePooledConnection$okhttp(this, this.routes);
        if (planReusePooledConnection$okhttp != null) {
            return planReusePooledConnection$okhttp.getConnection();
        }
        synchronized (realConnection) {
            this.connectionPool.put(realConnection);
            this.user.acquireConnectionNoEvents(realConnection);
        }
        this.user.connectionAcquired(realConnection);
        this.user.connectionConnectionAcquired(realConnection);
        return realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: isReady */
    public boolean getIsReady() {
        if (this.protocol != null) {
            return true;
        }
        return false;
    }

    /* renamed from: isTlsFallback$okhttp, reason: from getter */
    public final boolean getIsTlsFallback() {
        return this.isTlsFallback;
    }

    @Nullable
    public final ConnectPlan nextConnectionSpec$okhttp(@NotNull List<ConnectionSpec> connectionSpecs, @NotNull SSLSocket sslSocket) {
        Intrinsics.echo(connectionSpecs, "connectionSpecs");
        Intrinsics.echo(sslSocket, "sslSocket");
        boolean z2 = true;
        int i4 = this.connectionSpecIndex + 1;
        int size = connectionSpecs.size();
        for (int i5 = i4; i5 < size; i5++) {
            if (connectionSpecs.get(i5).isCompatible(sslSocket)) {
                if (this.connectionSpecIndex == -1) {
                    z2 = false;
                }
                return copy$default(this, 0, null, i5, z2, 3, null);
            }
        }
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void noNewExchanges() {
    }

    @NotNull
    public final ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp(@NotNull List<ConnectionSpec> connectionSpecs, @NotNull SSLSocket sslSocket) throws IOException {
        Intrinsics.echo(connectionSpecs, "connectionSpecs");
        Intrinsics.echo(sslSocket, "sslSocket");
        if (this.connectionSpecIndex != -1) {
            return this;
        }
        ConnectPlan nextConnectionSpec$okhttp = nextConnectionSpec$okhttp(connectionSpecs, sslSocket);
        if (nextConnectionSpec$okhttp != null) {
            return nextConnectionSpec$okhttp;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.isTlsFallback);
        sb2.append(", modes=");
        sb2.append(connectionSpecs);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        Intrinsics.delta(arrays, "toString(...)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @NotNull
    /* renamed from: retry */
    public RoutePlanner.Plan mo357retry() {
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.user, this.routePlanner, getRoute(), this.routes, this.attempt, this.tunnelRequest, this.connectionSpecIndex, this.isTlsFallback);
    }

    public final void setSocket$okhttp(@Nullable Socket socket) {
        this.socket = socket;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void trackFailure(@NotNull RealCall call, @Nullable IOException e) {
        Intrinsics.echo(call, "call");
    }
}
