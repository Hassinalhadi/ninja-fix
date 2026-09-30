package okhttp3;

import Xd.m;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.ConnectionListener;
import okhttp3.internal.connection.ConnectionUser;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.FastFallbackExchangeFinder;
import okhttp3.internal.connection.ForceConnectRoutePlanner;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RealRoutePlanner;
import okhttp3.internal.connection.RouteDatabase;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u008b\u0001\b\u0010\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u0004\u0010\u001aB1\b\u0010\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0004\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\u001cB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u001dJ\u0006\u0010 \u001a\u00020\u0007J\u0006\u0010!\u001a\u00020\u0007J\u0006\u0010$\u001a\u00020%R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lokhttp3/ConnectionPool;", "", "delegate", "Lokhttp3/internal/connection/RealConnectionPool;", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;)V", "maxIdleConnections", "", "keepAliveDuration", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "connectionListener", "Lokhttp3/internal/connection/ConnectionListener;", "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", "retryOnConnectionFailure", "", "fastFallback", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "(IJLjava/util/concurrent/TimeUnit;Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/ConnectionListener;IIIIIZZLokhttp3/internal/connection/RouteDatabase;)V", "(IJLjava/util/concurrent/TimeUnit;Lokhttp3/internal/connection/ConnectionListener;)V", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "getDelegate$okhttp", "()Lokhttp3/internal/connection/RealConnectionPool;", "idleConnectionCount", "connectionCount", "getConnectionListener$okhttp", "()Lokhttp3/internal/connection/ConnectionListener;", "evictAll", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectionPool {

    @NotNull
    private final RealConnectionPool delegate;

    public ConnectionPool(@NotNull RealConnectionPool delegate) {
        Intrinsics.echo(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExchangeFinder _init_$lambda$0(TaskRunner taskRunner, int i4, int i5, int i10, int i11, int i12, boolean z2, boolean z10, RouteDatabase routeDatabase, RealConnectionPool pool, Address address, ConnectionUser user) {
        Intrinsics.echo(pool, "pool");
        Intrinsics.echo(address, "address");
        Intrinsics.echo(user, "user");
        return new FastFallbackExchangeFinder(new ForceConnectRoutePlanner(new RealRoutePlanner(taskRunner, pool, i4, i5, i10, i11, i12, z2, z10, address, routeDatabase, user)), taskRunner);
    }

    public final int connectionCount() {
        return this.delegate.connectionCount();
    }

    public final void evictAll() {
        this.delegate.evictAll();
    }

    @NotNull
    public final ConnectionListener getConnectionListener$okhttp() {
        return this.delegate.getConnectionListener();
    }

    @NotNull
    /* renamed from: getDelegate$okhttp, reason: from getter */
    public final RealConnectionPool getDelegate() {
        return this.delegate;
    }

    public final int idleConnectionCount() {
        return this.delegate.idleConnectionCount();
    }

    public /* synthetic */ ConnectionPool(int i4, long j5, TimeUnit timeUnit, TaskRunner taskRunner, ConnectionListener connectionListener, int i5, int i10, int i11, int i12, int i13, boolean z2, boolean z10, RouteDatabase routeDatabase, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 5 : i4, (i14 & 2) != 0 ? 5L : j5, (i14 & 4) != 0 ? TimeUnit.MINUTES : timeUnit, (i14 & 8) != 0 ? TaskRunner.INSTANCE : taskRunner, (i14 & 16) != 0 ? ConnectionListener.INSTANCE.getNONE() : connectionListener, (i14 & 32) != 0 ? 10000 : i5, (i14 & 64) != 0 ? 10000 : i10, (i14 & 128) != 0 ? 10000 : i11, (i14 & Barcode.FORMAT_QR_CODE) != 0 ? 10000 : i12, (i14 & 512) == 0 ? i13 : 10000, (i14 & Barcode.FORMAT_UPC_E) != 0 ? true : z2, (i14 & 2048) == 0 ? z10 : true, (i14 & 4096) != 0 ? new RouteDatabase() : routeDatabase);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i4, long j5, @NotNull TimeUnit timeUnit, @NotNull final TaskRunner taskRunner, @NotNull ConnectionListener connectionListener, final int i5, final int i10, final int i11, final int i12, final int i13, final boolean z2, final boolean z10, @NotNull final RouteDatabase routeDatabase) {
        this(new RealConnectionPool(taskRunner, i4, j5, timeUnit, connectionListener, new m() { // from class: okhttp3.a
            @Override // Xd.m
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ExchangeFinder _init_$lambda$0;
                TaskRunner taskRunner2 = TaskRunner.this;
                RouteDatabase routeDatabase2 = routeDatabase;
                _init_$lambda$0 = ConnectionPool._init_$lambda$0(taskRunner2, i5, i10, i11, i12, i13, z2, z10, routeDatabase2, (RealConnectionPool) obj, (Address) obj2, (ConnectionUser) obj3);
                return _init_$lambda$0;
            }
        }));
        Intrinsics.echo(timeUnit, "timeUnit");
        Intrinsics.echo(taskRunner, "taskRunner");
        Intrinsics.echo(connectionListener, "connectionListener");
        Intrinsics.echo(routeDatabase, "routeDatabase");
    }

    public /* synthetic */ ConnectionPool(int i4, long j5, TimeUnit timeUnit, ConnectionListener connectionListener, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 5 : i4, (i5 & 2) != 0 ? 5L : j5, (i5 & 4) != 0 ? TimeUnit.MINUTES : timeUnit, (i5 & 8) != 0 ? ConnectionListener.INSTANCE.getNONE() : connectionListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i4, long j5, @NotNull TimeUnit timeUnit, @NotNull ConnectionListener connectionListener) {
        this(i4, j5, timeUnit, TaskRunner.INSTANCE, connectionListener, 0, 0, 0, 0, 0, false, false, null, 8160, null);
        Intrinsics.echo(timeUnit, "timeUnit");
        Intrinsics.echo(connectionListener, "connectionListener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i4, long j5, @NotNull TimeUnit timeUnit) {
        this(i4, j5, timeUnit, TaskRunner.INSTANCE, ConnectionListener.INSTANCE.getNONE(), 0, 0, 0, 0, 0, false, false, null, 8160, null);
        Intrinsics.echo(timeUnit, "timeUnit");
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
