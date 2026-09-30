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
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\u0017\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u001cH\u0016J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u001cH\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u001cH\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u001cH\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016J\n\u0010'\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020*H\u0016J\u001e\u0010+\u001a\u00020\u00052\u0006\u0010)\u001a\u00020*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0016J\u0010\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u000201H\u0016J\u001e\u00102\u001a\u00020\u00052\u0006\u00100\u001a\u0002012\f\u00103\u001a\b\u0012\u0004\u0012\u0002040-H\u0016¨\u00065"}, d2 = {"Lokhttp3/internal/connection/PoolConnectionUser;", "Lokhttp3/internal/connection/ConnectionUser;", "<init>", "()V", "addPlanToCancel", "", "connectPlan", "Lokhttp3/internal/connection/ConnectPlan;", "removePlanToCancel", "updateRouteDatabaseAfterSuccess", "route", "Lokhttp3/Route;", "connectStart", "secureConnectStart", "secureConnectEnd", "handshake", "Lokhttp3/Handshake;", "callConnectEnd", "protocol", "Lokhttp3/Protocol;", "connectionConnectEnd", "connection", "Lokhttp3/Connection;", "connectFailed", "e", "Ljava/io/IOException;", "connectionAcquired", "acquireConnectionNoEvents", "Lokhttp3/internal/connection/RealConnection;", "releaseConnectionNoEvents", "Ljava/net/Socket;", "connectionReleased", "connectionConnectionAcquired", "connectionConnectionReleased", "connectionConnectionClosed", "noNewExchanges", "doExtensiveHealthChecks", "", "isCanceled", "candidateConnection", "proxySelectStart", Constants.KEY_URL, "Lokhttp3/HttpUrl;", "proxySelectEnd", "proxies", "", "Ljava/net/Proxy;", "dnsStart", "socketHost", "", "dnsEnd", "result", "Ljava/net/InetAddress;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PoolConnectionUser implements ConnectionUser {

    @NotNull
    public static final PoolConnectionUser INSTANCE = new PoolConnectionUser();

    private PoolConnectionUser() {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void acquireConnectionNoEvents(@NotNull RealConnection connection) {
        Intrinsics.echo(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void addPlanToCancel(@NotNull ConnectPlan connectPlan) {
        Intrinsics.echo(connectPlan, "connectPlan");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void callConnectEnd(@NotNull Route route, @Nullable Protocol protocol) {
        Intrinsics.echo(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    @Nullable
    public RealConnection candidateConnection() {
        return null;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectFailed(@NotNull Route route, @Nullable Protocol protocol, @NotNull IOException e) {
        Intrinsics.echo(route, "route");
        Intrinsics.echo(e, "e");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectStart(@NotNull Route route) {
        Intrinsics.echo(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectionAcquired(@NotNull Connection connection) {
        Intrinsics.echo(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectionConnectEnd(@NotNull Connection connection, @NotNull Route route) {
        Intrinsics.echo(connection, "connection");
        Intrinsics.echo(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectionConnectionAcquired(@NotNull RealConnection connection) {
        Intrinsics.echo(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectionConnectionClosed(@NotNull RealConnection connection) {
        Intrinsics.echo(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectionConnectionReleased(@NotNull RealConnection connection) {
        Intrinsics.echo(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void connectionReleased(@NotNull Connection connection) {
        Intrinsics.echo(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void dnsEnd(@NotNull String socketHost, @NotNull List<? extends InetAddress> result) {
        Intrinsics.echo(socketHost, "socketHost");
        Intrinsics.echo(result, "result");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void dnsStart(@NotNull String socketHost) {
        Intrinsics.echo(socketHost, "socketHost");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public boolean doExtensiveHealthChecks() {
        return false;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public boolean isCanceled() {
        return false;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void noNewExchanges(@NotNull RealConnection connection) {
        Intrinsics.echo(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void proxySelectEnd(@NotNull HttpUrl url, @NotNull List<? extends Proxy> proxies) {
        Intrinsics.echo(url, "url");
        Intrinsics.echo(proxies, "proxies");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void proxySelectStart(@NotNull HttpUrl url) {
        Intrinsics.echo(url, "url");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    @Nullable
    public Socket releaseConnectionNoEvents() {
        return null;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void removePlanToCancel(@NotNull ConnectPlan connectPlan) {
        Intrinsics.echo(connectPlan, "connectPlan");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void secureConnectEnd(@Nullable Handshake handshake) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void secureConnectStart() {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public void updateRouteDatabaseAfterSuccess(@NotNull Route route) {
        Intrinsics.echo(route, "route");
    }
}
