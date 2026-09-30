package okhttp3.internal.connection;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal.http.RealInterceptorChain;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\"\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u0012\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020&H\u0016J\n\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010*\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020&H\u0016J\u0010\u0010+\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020&H\u0016J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020&H\u0016J\u0010\u0010-\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020&H\u0016J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020/H\u0016J\n\u00101\u001a\u0004\u0018\u00010&H\u0016J\u0010\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u000204H\u0016J\u001e\u00105\u001a\u00020\u000f2\u0006\u00103\u001a\u0002042\f\u00106\u001a\b\u0012\u0004\u0012\u00020807H\u0016J\u0010\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020;H\u0016J\u001e\u0010<\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020;2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>07H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006?"}, d2 = {"Lokhttp3/internal/connection/CallConnectionUser;", "Lokhttp3/internal/connection/ConnectionUser;", "call", "Lokhttp3/internal/connection/RealCall;", "poolConnectionListener", "Lokhttp3/internal/connection/ConnectionListener;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/ConnectionListener;Lokhttp3/internal/http/RealInterceptorChain;)V", "eventListener", "Lokhttp3/EventListener;", "getEventListener", "()Lokhttp3/EventListener;", "addPlanToCancel", "", "connectPlan", "Lokhttp3/internal/connection/ConnectPlan;", "removePlanToCancel", "updateRouteDatabaseAfterSuccess", "route", "Lokhttp3/Route;", "connectStart", "connectFailed", "protocol", "Lokhttp3/Protocol;", "e", "Ljava/io/IOException;", "secureConnectStart", "secureConnectEnd", "handshake", "Lokhttp3/Handshake;", "callConnectEnd", "connectionConnectEnd", "connection", "Lokhttp3/Connection;", "connectionAcquired", "acquireConnectionNoEvents", "Lokhttp3/internal/connection/RealConnection;", "releaseConnectionNoEvents", "Ljava/net/Socket;", "connectionReleased", "connectionConnectionAcquired", "connectionConnectionReleased", "connectionConnectionClosed", "noNewExchanges", "doExtensiveHealthChecks", "", "isCanceled", "candidateConnection", "proxySelectStart", Constants.KEY_URL, "Lokhttp3/HttpUrl;", "proxySelectEnd", "proxies", "", "Ljava/net/Proxy;", "dnsStart", "socketHost", "", "dnsEnd", "result", "Ljava/net/InetAddress;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CallConnectionUser implements ConnectionUser {

    @NotNull
    private final RealCall call;

    @NotNull
    private final RealInterceptorChain chain;

    @NotNull
    private final ConnectionListener poolConnectionListener;

    public CallConnectionUser(@NotNull RealCall call, @NotNull ConnectionListener poolConnectionListener, @NotNull RealInterceptorChain chain) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(poolConnectionListener, "poolConnectionListener");
        Intrinsics.echo(chain, "chain");
        this.call = call;
        this.poolConnectionListener = poolConnectionListener;
        this.chain = chain;
    }

    private final EventListener getEventListener() {
        return this.call.getEventListener();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void acquireConnectionNoEvents(@NotNull RealConnection connection) {
        Intrinsics.echo(connection, "connection");
        this.call.acquireConnectionNoEvents(connection);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void addPlanToCancel(@NotNull ConnectPlan connectPlan) {
        Intrinsics.echo(connectPlan, "connectPlan");
        this.call.getPlansToCancel$okhttp().add(connectPlan);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void callConnectEnd(@NotNull Route route, @Nullable Protocol protocol) {
        Intrinsics.echo(route, "route");
        getEventListener().connectEnd(this.call, route.socketAddress(), route.proxy(), protocol);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    @Nullable
    public RealConnection candidateConnection() {
        return this.call.getConnection();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectFailed(@NotNull Route route, @Nullable Protocol protocol, @NotNull IOException e) {
        Intrinsics.echo(route, "route");
        Intrinsics.echo(e, "e");
        getEventListener().connectFailed(this.call, route.socketAddress(), route.proxy(), null, e);
        this.poolConnectionListener.connectFailed(route, this.call, e);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectStart(@NotNull Route route) {
        Intrinsics.echo(route, "route");
        getEventListener().connectStart(this.call, route.socketAddress(), route.proxy());
        this.poolConnectionListener.connectStart(route, this.call);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectionAcquired(@NotNull Connection connection) {
        Intrinsics.echo(connection, "connection");
        getEventListener().connectionAcquired(this.call, connection);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectionConnectEnd(@NotNull Connection connection, @NotNull Route route) {
        Intrinsics.echo(connection, "connection");
        Intrinsics.echo(route, "route");
        this.poolConnectionListener.connectEnd(connection, route, this.call);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectionConnectionAcquired(@NotNull RealConnection connection) {
        Intrinsics.echo(connection, "connection");
        connection.getConnectionListener().connectionAcquired(connection, this.call);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectionConnectionClosed(@NotNull RealConnection connection) {
        Intrinsics.echo(connection, "connection");
        connection.getConnectionListener().connectionClosed(connection);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectionConnectionReleased(@NotNull RealConnection connection) {
        Intrinsics.echo(connection, "connection");
        connection.getConnectionListener().connectionReleased(connection, this.call);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectionReleased(@NotNull Connection connection) {
        Intrinsics.echo(connection, "connection");
        getEventListener().connectionReleased(this.call, connection);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void dnsEnd(@NotNull String socketHost, @NotNull List<? extends InetAddress> result) {
        Intrinsics.echo(socketHost, "socketHost");
        Intrinsics.echo(result, "result");
        getEventListener().dnsEnd(this.call, socketHost, result);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void dnsStart(@NotNull String socketHost) {
        Intrinsics.echo(socketHost, "socketHost");
        getEventListener().dnsStart(this.call, socketHost);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public boolean doExtensiveHealthChecks() {
        return !Intrinsics.areEqual(this.chain.getRequest().method(), "GET");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public boolean isCanceled() {
        return this.call.getCanceled();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void noNewExchanges(@NotNull RealConnection connection) {
        Intrinsics.echo(connection, "connection");
        connection.getConnectionListener().noNewExchanges(connection);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void proxySelectEnd(@NotNull HttpUrl url, @NotNull List<? extends Proxy> proxies) {
        Intrinsics.echo(url, "url");
        Intrinsics.echo(proxies, "proxies");
        getEventListener().proxySelectEnd(this.call, url, proxies);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void proxySelectStart(@NotNull HttpUrl url) {
        Intrinsics.echo(url, "url");
        getEventListener().proxySelectStart(this.call, url);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    @Nullable
    public Socket releaseConnectionNoEvents() {
        return this.call.releaseConnectionNoEvents$okhttp();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void removePlanToCancel(@NotNull ConnectPlan connectPlan) {
        Intrinsics.echo(connectPlan, "connectPlan");
        this.call.getPlansToCancel$okhttp().remove(connectPlan);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void secureConnectEnd(@Nullable Handshake handshake) {
        getEventListener().secureConnectEnd(this.call, handshake);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void secureConnectStart() {
        getEventListener().secureConnectStart(this.call);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void updateRouteDatabaseAfterSuccess(@NotNull Route route) {
        Intrinsics.echo(route, "route");
        this.call.getClient().getRouteDatabase().connected(route);
    }
}
