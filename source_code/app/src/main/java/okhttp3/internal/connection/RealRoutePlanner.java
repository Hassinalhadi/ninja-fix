package okhttp3.internal.connection;

import ao.ad;
import com.clevertap.android.sdk.Constants;
import com.zendesk.service.HttpConstants;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.ConnectionSpec;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010+\u001a\u00020(H\u0000¢\u0006\u0004\b)\u0010*J/\u00101\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010,\u001a\u0004\u0018\u00010(2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010-H\u0000¢\u0006\u0004\b/\u00100J)\u00104\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001a2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010-H\u0000¢\u0006\u0004\b2\u00103J\u0019\u00106\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010>R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010CR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR \u0010N\u001a\b\u0012\u0004\u0012\u00020%0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lokhttp3/internal/connection/RealRoutePlanner;", "Lokhttp3/internal/connection/RoutePlanner;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "", "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", "", "retryOnConnectionFailure", "fastFallback", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/ConnectionUser;", "connectionUser", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZZLokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/internal/connection/ConnectionUser;)V", "Lokhttp3/internal/connection/ReusePlan;", "planReuseCallConnection", "()Lokhttp3/internal/connection/ReusePlan;", "Lokhttp3/Route;", "route", "Lokhttp3/Request;", "createTunnelRequest", "(Lokhttp3/Route;)Lokhttp3/Request;", "Lokhttp3/internal/connection/RealConnection;", "connection", "retryRoute", "(Lokhttp3/internal/connection/RealConnection;)Lokhttp3/Route;", "isCanceled", "()Z", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "plan", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/connection/ConnectPlan;", "planConnect$okhttp", "()Lokhttp3/internal/connection/ConnectPlan;", "planConnect", "planToReplace", "", "routes", "planReusePooledConnection$okhttp", "(Lokhttp3/internal/connection/ConnectPlan;Ljava/util/List;)Lokhttp3/internal/connection/ReusePlan;", "planReusePooledConnection", "planConnectToRoute$okhttp", "(Lokhttp3/Route;Ljava/util/List;)Lokhttp3/internal/connection/ConnectPlan;", "planConnectToRoute", "failedConnection", "hasNext", "(Lokhttp3/internal/connection/RealConnection;)Z", "Lokhttp3/HttpUrl;", Constants.KEY_URL, "sameHostAndPort", "(Lokhttp3/HttpUrl;)Z", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/connection/RealConnectionPool;", "I", "Z", "Lokhttp3/Address;", "getAddress", "()Lokhttp3/Address;", "Lokhttp3/internal/connection/RouteDatabase;", "Lokhttp3/internal/connection/ConnectionUser;", "Lokhttp3/internal/connection/RouteSelector$Selection;", "routeSelection", "Lokhttp3/internal/connection/RouteSelector$Selection;", "Lokhttp3/internal/connection/RouteSelector;", "routeSelector", "Lokhttp3/internal/connection/RouteSelector;", "nextRouteToTry", "Lokhttp3/Route;", "Lkotlin/collections/l;", "deferredPlans", "Lkotlin/collections/l;", "getDeferredPlans", "()Lkotlin/collections/l;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealRoutePlanner implements RoutePlanner {

    @NotNull
    private final Address address;

    @NotNull
    private final RealConnectionPool connectionPool;

    @NotNull
    private final ConnectionUser connectionUser;

    @NotNull
    private final l deferredPlans;
    private final boolean fastFallback;

    @Nullable
    private Route nextRouteToTry;
    private final int pingIntervalMillis;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;

    @NotNull
    private final RouteDatabase routeDatabase;

    @Nullable
    private RouteSelector.Selection routeSelection;

    @Nullable
    private RouteSelector routeSelector;
    private final int socketConnectTimeoutMillis;
    private final int socketReadTimeoutMillis;

    @NotNull
    private final TaskRunner taskRunner;
    private final int writeTimeoutMillis;

    public RealRoutePlanner(@NotNull TaskRunner taskRunner, @NotNull RealConnectionPool connectionPool, int i4, int i5, int i10, int i11, int i12, boolean z2, boolean z10, @NotNull Address address, @NotNull RouteDatabase routeDatabase, @NotNull ConnectionUser connectionUser) {
        Intrinsics.echo(taskRunner, "taskRunner");
        Intrinsics.echo(connectionPool, "connectionPool");
        Intrinsics.echo(address, "address");
        Intrinsics.echo(routeDatabase, "routeDatabase");
        Intrinsics.echo(connectionUser, "connectionUser");
        this.taskRunner = taskRunner;
        this.connectionPool = connectionPool;
        this.readTimeoutMillis = i4;
        this.writeTimeoutMillis = i5;
        this.socketConnectTimeoutMillis = i10;
        this.socketReadTimeoutMillis = i11;
        this.pingIntervalMillis = i12;
        this.retryOnConnectionFailure = z2;
        this.fastFallback = z10;
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.connectionUser = connectionUser;
        this.deferredPlans = new l();
    }

    private final Request createTunnelRequest(Route route) throws IOException {
        Request build = new Request.Builder().url(route.address().url()).method("CONNECT", null).header("Host", _UtilJvmKt.toHostHeader(route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", _UtilCommonKt.USER_AGENT).build();
        Request authenticate = route.address().proxyAuthenticator().authenticate(route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(HttpConstants.HTTP_PROXY_AUTH).message("Preemptive Authenticate").sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        if (authenticate == null) {
            return build;
        }
        return authenticate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectPlan planConnectToRoute$okhttp$default(RealRoutePlanner realRoutePlanner, Route route, List list, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            list = null;
        }
        return realRoutePlanner.planConnectToRoute$okhttp(route, list);
    }

    private final ReusePlan planReuseCallConnection() {
        Socket releaseConnectionNoEvents;
        boolean z2;
        RealConnection candidateConnection = this.connectionUser.candidateConnection();
        if (candidateConnection == null) {
            return null;
        }
        boolean isHealthy = candidateConnection.isHealthy(this.connectionUser.doExtensiveHealthChecks());
        synchronized (candidateConnection) {
            try {
                if (!isHealthy) {
                    z2 = !candidateConnection.getNoNewExchanges();
                    candidateConnection.setNoNewExchanges(true);
                    releaseConnectionNoEvents = this.connectionUser.releaseConnectionNoEvents();
                } else {
                    if (!candidateConnection.getNoNewExchanges() && sameHostAndPort(candidateConnection.route().address().url())) {
                        z2 = false;
                        releaseConnectionNoEvents = null;
                    }
                    releaseConnectionNoEvents = this.connectionUser.releaseConnectionNoEvents();
                    z2 = false;
                }
            } finally {
            }
        }
        if (this.connectionUser.candidateConnection() != null) {
            if (releaseConnectionNoEvents == null) {
                return new ReusePlan(candidateConnection);
            }
            throw new IllegalStateException("Check failed.");
        }
        if (releaseConnectionNoEvents != null) {
            _UtilJvmKt.closeQuietly(releaseConnectionNoEvents);
        }
        this.connectionUser.connectionReleased(candidateConnection);
        this.connectionUser.connectionConnectionReleased(candidateConnection);
        if (releaseConnectionNoEvents != null) {
            this.connectionUser.connectionConnectionClosed(candidateConnection);
        } else if (z2) {
            this.connectionUser.noNewExchanges(candidateConnection);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReusePlan planReusePooledConnection$okhttp$default(RealRoutePlanner realRoutePlanner, ConnectPlan connectPlan, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            connectPlan = null;
        }
        if ((i4 & 2) != 0) {
            list = null;
        }
        return realRoutePlanner.planReusePooledConnection$okhttp(connectPlan, list);
    }

    private final Route retryRoute(RealConnection connection) {
        Route route;
        synchronized (connection) {
            route = null;
            if (connection.getRouteFailureCount() == 0 && connection.getNoNewExchanges() && _UtilJvmKt.canReuseConnectionFor(connection.route().address().url(), getAddress().url())) {
                route = connection.route();
            }
        }
        return route;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    @NotNull
    public Address getAddress() {
        return this.address;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    @NotNull
    public l getDeferredPlans() {
        return this.deferredPlans;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean hasNext(@Nullable RealConnection failedConnection) {
        RouteSelector routeSelector;
        Route retryRoute;
        if (!getDeferredPlans().isEmpty() || this.nextRouteToTry != null) {
            return true;
        }
        if (failedConnection != null && (retryRoute = retryRoute(failedConnection)) != null) {
            this.nextRouteToTry = retryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if ((selection != null && selection.hasNext()) || (routeSelector = this.routeSelector) == null) {
            return true;
        }
        return routeSelector.hasNext();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean isCanceled() {
        return this.connectionUser.isCanceled();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    @NotNull
    public RoutePlanner.Plan plan() throws IOException {
        ReusePlan planReuseCallConnection = planReuseCallConnection();
        if (planReuseCallConnection != null) {
            return planReuseCallConnection;
        }
        ReusePlan planReusePooledConnection$okhttp$default = planReusePooledConnection$okhttp$default(this, null, null, 3, null);
        if (planReusePooledConnection$okhttp$default != null) {
            return planReusePooledConnection$okhttp$default;
        }
        if (!getDeferredPlans().isEmpty()) {
            return (RoutePlanner.Plan) getDeferredPlans().removeFirst();
        }
        ConnectPlan planConnect$okhttp = planConnect$okhttp();
        ReusePlan planReusePooledConnection$okhttp = planReusePooledConnection$okhttp(planConnect$okhttp, planConnect$okhttp.getRoutes$okhttp());
        if (planReusePooledConnection$okhttp != null) {
            return planReusePooledConnection$okhttp;
        }
        return planConnect$okhttp;
    }

    @NotNull
    public final ConnectPlan planConnect$okhttp() throws IOException {
        Route route = this.nextRouteToTry;
        if (route != null) {
            this.nextRouteToTry = null;
            return planConnectToRoute$okhttp$default(this, route, null, 2, null);
        }
        RouteSelector.Selection selection = this.routeSelection;
        if (selection != null && selection.hasNext()) {
            return planConnectToRoute$okhttp$default(this, selection.next(), null, 2, null);
        }
        RouteSelector routeSelector = this.routeSelector;
        if (routeSelector == null) {
            routeSelector = new RouteSelector(getAddress(), this.routeDatabase, this.connectionUser, this.fastFallback);
            this.routeSelector = routeSelector;
        }
        if (routeSelector.hasNext()) {
            RouteSelector.Selection next = routeSelector.next();
            this.routeSelection = next;
            if (!isCanceled()) {
                return planConnectToRoute$okhttp(next.next(), next.getRoutes());
            }
            throw new IOException("Canceled");
        }
        throw new IOException("exhausted all routes");
    }

    @NotNull
    public final ConnectPlan planConnectToRoute$okhttp(@NotNull Route route, @Nullable List<Route> routes) throws IOException {
        Request request;
        Intrinsics.echo(route, "route");
        if (route.address().sslSocketFactory() == null) {
            if (route.address().connectionSpecs().contains(ConnectionSpec.CLEARTEXT)) {
                String host = route.address().url().host();
                if (!Platform.INSTANCE.get().isCleartextTrafficPermitted(host)) {
                    throw new UnknownServiceException(ad.gray("CLEARTEXT communication to ", host, " not permitted by network security policy"));
                }
            } else {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
        } else if (route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (route.requiresTunnel()) {
            request = createTunnelRequest(route);
        } else {
            request = null;
        }
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.connectionUser, this, route, routes, 0, request, -1, false);
    }

    @Nullable
    public final ReusePlan planReusePooledConnection$okhttp(@Nullable ConnectPlan planToReplace, @Nullable List<Route> routes) {
        boolean z2;
        RealConnectionPool realConnectionPool = this.connectionPool;
        boolean doExtensiveHealthChecks = this.connectionUser.doExtensiveHealthChecks();
        Address address = getAddress();
        ConnectionUser connectionUser = this.connectionUser;
        if (planToReplace != null && planToReplace.getIsReady()) {
            z2 = true;
        } else {
            z2 = false;
        }
        RealConnection callAcquirePooledConnection = realConnectionPool.callAcquirePooledConnection(doExtensiveHealthChecks, address, connectionUser, routes, z2);
        if (callAcquirePooledConnection == null) {
            return null;
        }
        if (planToReplace != null) {
            this.nextRouteToTry = planToReplace.getRoute();
            planToReplace.closeQuietly();
        }
        this.connectionUser.connectionAcquired(callAcquirePooledConnection);
        this.connectionUser.connectionConnectionAcquired(callAcquirePooledConnection);
        return new ReusePlan(callAcquirePooledConnection);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean sameHostAndPort(@NotNull HttpUrl url) {
        Intrinsics.echo(url, "url");
        HttpUrl url2 = getAddress().url();
        if (url.port() == url2.port() && Intrinsics.areEqual(url.host(), url2.host())) {
            return true;
        }
        return false;
    }
}
