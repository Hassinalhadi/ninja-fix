package okhttp3.internal.connection;

import A0.z;
import Xd.m;
import androidx.appcompat.widget.P0;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001O\u0018\u0000 U2\u00020\u0001:\u0002VUBQ\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u0006*\u00020\u00062\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0004¢\u0006\u0004\b)\u0010(J?\u00101\u001a\u0004\u0018\u00010\u00192\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u000e2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-2\u0006\u00100\u001a\u00020\u001b¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0014¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\u001d\u0010=\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\r2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010?J\r\u0010@\u001a\u00020\u0014¢\u0006\u0004\b@\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010BR\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010ER,\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010FR\u001a\u0010G\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00190R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006W"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lokhttp3/internal/connection/ConnectionListener;", "connectionListener", "Lkotlin/Function3;", "Lokhttp3/Address;", "Lokhttp3/internal/connection/ConnectionUser;", "Lokhttp3/internal/connection/ExchangeFinder;", "exchangeFinderFactory", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;IJLjava/util/concurrent/TimeUnit;Lokhttp3/internal/connection/ConnectionListener;LXd/m;)V", "Lokhttp3/internal/connection/RealConnectionPool$AddressState;", "", "scheduleOpener", "(Lokhttp3/internal/connection/RealConnectionPool$AddressState;)V", "", "addressStates", "Lokhttp3/internal/connection/RealConnection;", "connection", "", "isEvictable", "(Ljava/util/Map;Lokhttp3/internal/connection/RealConnection;)Z", "now", "pruneAndGetAllocationCount", "(Lokhttp3/internal/connection/RealConnection;J)I", "state", "openConnections", "(Lokhttp3/internal/connection/RealConnectionPool$AddressState;)J", "amount", "jitterBy", "(JI)J", "idleConnectionCount", "()I", "connectionCount", "doExtensiveHealthChecks", "address", "connectionUser", "", "Lokhttp3/Route;", "routes", "requireMultiplexed", "callAcquirePooledConnection", "(ZLokhttp3/Address;Lokhttp3/internal/connection/ConnectionUser;Ljava/util/List;Z)Lokhttp3/internal/connection/RealConnection;", "put", "(Lokhttp3/internal/connection/RealConnection;)V", "connectionBecameIdle", "(Lokhttp3/internal/connection/RealConnection;)Z", "evictAll", "()V", "closeConnections", "(J)J", "Lokhttp3/internal/connection/AddressPolicy;", "policy", "setPolicy", "(Lokhttp3/Address;Lokhttp3/internal/connection/AddressPolicy;)V", "(Lokhttp3/Address;)V", "scheduleCloser", "Lokhttp3/internal/concurrent/TaskRunner;", "I", "Lokhttp3/internal/connection/ConnectionListener;", "getConnectionListener$okhttp", "()Lokhttp3/internal/connection/ConnectionListener;", "LXd/m;", "keepAliveDurationNs", "J", "getKeepAliveDurationNs$okhttp", "()J", "Ljava/util/Map;", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/connection/RealConnectionPool$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Companion", "AddressState", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealConnectionPool {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static AtomicReferenceFieldUpdater<RealConnectionPool, Map<?, ?>> addressStatesUpdater = AtomicReferenceFieldUpdater.newUpdater(RealConnectionPool.class, Map.class, "addressStates");

    @NotNull
    private volatile Map<Address, AddressState> addressStates;

    @NotNull
    private final TaskQueue cleanupQueue;

    @NotNull
    private final RealConnectionPool$cleanupTask$1 cleanupTask;

    @NotNull
    private final ConnectionListener connectionListener;

    @NotNull
    private final ConcurrentLinkedQueue<RealConnection> connections;

    @NotNull
    private final m exchangeFinderFactory;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    @NotNull
    private final TaskRunner taskRunner;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$AddressState;", "", "address", "Lokhttp3/Address;", "queue", "Lokhttp3/internal/concurrent/TaskQueue;", "policy", "Lokhttp3/internal/connection/AddressPolicy;", "<init>", "(Lokhttp3/Address;Lokhttp3/internal/concurrent/TaskQueue;Lokhttp3/internal/connection/AddressPolicy;)V", "getAddress", "()Lokhttp3/Address;", "getQueue", "()Lokhttp3/internal/concurrent/TaskQueue;", "getPolicy", "()Lokhttp3/internal/connection/AddressPolicy;", "setPolicy", "(Lokhttp3/internal/connection/AddressPolicy;)V", "concurrentCallCapacity", "", "getConcurrentCallCapacity", "()I", "setConcurrentCallCapacity", "(I)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class AddressState {

        @NotNull
        private final Address address;
        private int concurrentCallCapacity;

        @NotNull
        private AddressPolicy policy;

        @NotNull
        private final TaskQueue queue;

        public AddressState(@NotNull Address address, @NotNull TaskQueue queue, @NotNull AddressPolicy policy) {
            Intrinsics.echo(address, "address");
            Intrinsics.echo(queue, "queue");
            Intrinsics.echo(policy, "policy");
            this.address = address;
            this.queue = queue;
            this.policy = policy;
        }

        @NotNull
        public final Address getAddress() {
            return this.address;
        }

        public final int getConcurrentCallCapacity() {
            return this.concurrentCallCapacity;
        }

        @NotNull
        public final AddressPolicy getPolicy() {
            return this.policy;
        }

        @NotNull
        public final TaskQueue getQueue() {
            return this.queue;
        }

        public final void setConcurrentCallCapacity(int i4) {
            this.concurrentCallCapacity = i4;
        }

        public final void setPolicy(@NotNull AddressPolicy addressPolicy) {
            Intrinsics.echo(addressPolicy, "<set-?>");
            this.policy = addressPolicy;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007Rn\u0010\b\u001ab\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00050\u0005\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\u0002\b\u0003 \n*\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000b0\u000b \n*0\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00050\u0005\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\u0002\b\u0003 \n*\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000b0\u000b\u0018\u00010\t0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "<init>", "()V", "get", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/ConnectionPool;", "addressStatesUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "kotlin.jvm.PlatformType", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RealConnectionPool get(@NotNull ConnectionPool connectionPool) {
            Intrinsics.echo(connectionPool, "connectionPool");
            return connectionPool.getDelegate();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(@NotNull TaskRunner taskRunner, int i4, long j5, @NotNull TimeUnit timeUnit, @NotNull ConnectionListener connectionListener, @NotNull m exchangeFinderFactory) {
        Intrinsics.echo(taskRunner, "taskRunner");
        Intrinsics.echo(timeUnit, "timeUnit");
        Intrinsics.echo(connectionListener, "connectionListener");
        Intrinsics.echo(exchangeFinderFactory, "exchangeFinderFactory");
        this.taskRunner = taskRunner;
        this.maxIdleConnections = i4;
        this.connectionListener = connectionListener;
        this.exchangeFinderFactory = exchangeFinderFactory;
        this.keepAliveDurationNs = timeUnit.toNanos(j5);
        this.addressStates = t.alpha;
        this.cleanupQueue = taskRunner.newQueue();
        final String gold = P0.gold(new StringBuilder(), _UtilJvmKt.okHttpName, " ConnectionPool connection closer");
        this.cleanupTask = new Task(gold) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return RealConnectionPool.this.closeConnections(System.nanoTime());
            }
        };
        this.connections = new ConcurrentLinkedQueue<>();
        if (j5 > 0) {
        } else {
            throw new IllegalArgumentException(z.india(j5, "keepAliveDuration <= 0: ").toString());
        }
    }

    private final boolean isEvictable(Map<Address, AddressState> addressStates, RealConnection connection) {
        AddressState addressState = addressStates.get(connection.getRoute().address());
        if (addressState == null || addressState.getConcurrentCallCapacity() - connection.getAllocationLimit() >= addressState.getPolicy().minimumConcurrentCalls) {
            return true;
        }
        return false;
    }

    private final long jitterBy(long j5, int i4) {
        return j5 + ThreadLocalRandom.current().nextInt(i4 * (-1), i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long openConnections(AddressState state) {
        if (state.getPolicy().minimumConcurrentCalls == 0) {
            return -1L;
        }
        Iterator<RealConnection> it = this.connections.iterator();
        Intrinsics.delta(it, "iterator(...)");
        int i4 = 0;
        while (it.hasNext()) {
            RealConnection next = it.next();
            if (Intrinsics.areEqual(state.getAddress(), next.getRoute().address())) {
                Intrinsics.checkNotNull(next);
                synchronized (next) {
                    i4 += next.getAllocationLimit();
                }
                if (i4 >= state.getPolicy().minimumConcurrentCalls) {
                    return -1L;
                }
            }
        }
        try {
            RealConnection find = ((ExchangeFinder) this.exchangeFinderFactory.invoke(this, state.getAddress(), PoolConnectionUser.INSTANCE)).find();
            if (!this.connections.contains(find)) {
                synchronized (find) {
                    put(find);
                }
                return 0L;
            }
            return 0L;
        } catch (IOException unused) {
            return jitterBy(state.getPolicy().backoffDelayMillis, state.getPolicy().backoffJitterMillis) * 1000000;
        }
    }

    private final int pruneAndGetAllocationCount(RealConnection connection, long now) {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        List<Reference<RealCall>> calls = connection.getCalls();
        int i4 = 0;
        while (i4 < calls.size()) {
            Reference<RealCall> reference = calls.get(i4);
            if (reference.get() != null) {
                i4++;
            } else {
                Platform.INSTANCE.get().logCloseableLeak("A connection to " + connection.route().address().url() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).getCallStackTrace());
                calls.remove(i4);
                if (calls.isEmpty()) {
                    connection.setIdleAtNs(now - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return calls.size();
    }

    private final void scheduleOpener(final AddressState addressState) {
        TaskQueue queue = addressState.getQueue();
        final String gold = P0.gold(new StringBuilder(), _UtilJvmKt.okHttpName, " ConnectionPool connection opener");
        TaskQueue.schedule$default(queue, new Task(gold) { // from class: okhttp3.internal.connection.RealConnectionPool$scheduleOpener$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                long openConnections;
                openConnections = RealConnectionPool.this.openConnections(addressState);
                return openConnections;
            }
        }, 0L, 2, null);
    }

    @Nullable
    public final RealConnection callAcquirePooledConnection(boolean doExtensiveHealthChecks, @NotNull Address address, @NotNull ConnectionUser connectionUser, @Nullable List<Route> routes, boolean requireMultiplexed) {
        boolean z2;
        boolean noNewExchanges;
        Socket releaseConnectionNoEvents;
        Intrinsics.echo(address, "address");
        Intrinsics.echo(connectionUser, "connectionUser");
        Iterator<RealConnection> it = this.connections.iterator();
        Intrinsics.delta(it, "iterator(...)");
        while (it.hasNext()) {
            RealConnection next = it.next();
            Intrinsics.checkNotNull(next);
            synchronized (next) {
                z2 = false;
                if (requireMultiplexed) {
                    try {
                        if (!next.isMultiplexed$okhttp()) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (next.isEligible$okhttp(address, routes)) {
                    connectionUser.acquireConnectionNoEvents(next);
                    z2 = true;
                }
            }
            if (z2) {
                if (next.isHealthy(doExtensiveHealthChecks)) {
                    return next;
                }
                synchronized (next) {
                    noNewExchanges = next.getNoNewExchanges();
                    next.setNoNewExchanges(true);
                    releaseConnectionNoEvents = connectionUser.releaseConnectionNoEvents();
                }
                if (releaseConnectionNoEvents != null) {
                    _UtilJvmKt.closeQuietly(releaseConnectionNoEvents);
                    this.connectionListener.connectionClosed(next);
                } else if (!noNewExchanges) {
                    this.connectionListener.noNewExchanges(next);
                }
            }
        }
        return null;
    }

    public final long closeConnections(long now) {
        int i4;
        Map<Address, AddressState> map = this.addressStates;
        Iterator<AddressState> it = map.values().iterator();
        while (true) {
            i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            it.next().setConcurrentCallCapacity(0);
        }
        Iterator<RealConnection> it2 = this.connections.iterator();
        Intrinsics.delta(it2, "iterator(...)");
        while (it2.hasNext()) {
            RealConnection next = it2.next();
            AddressState addressState = map.get(next.getRoute().address());
            if (addressState != null) {
                Intrinsics.checkNotNull(next);
                synchronized (next) {
                    addressState.setConcurrentCallCapacity(addressState.getConcurrentCallCapacity() + next.getAllocationLimit());
                }
            }
        }
        long j5 = (now - this.keepAliveDurationNs) + 1;
        Iterator<RealConnection> it3 = this.connections.iterator();
        Intrinsics.delta(it3, "iterator(...)");
        RealConnection realConnection = null;
        RealConnection realConnection2 = null;
        RealConnection realConnection3 = null;
        long j6 = Long.MAX_VALUE;
        int i5 = 0;
        while (it3.hasNext()) {
            RealConnection next2 = it3.next();
            Intrinsics.checkNotNull(next2);
            synchronized (next2) {
                if (pruneAndGetAllocationCount(next2, now) > 0) {
                    i5++;
                } else {
                    long idleAtNs = next2.getIdleAtNs();
                    if (idleAtNs < j5) {
                        realConnection2 = next2;
                        j5 = idleAtNs;
                    }
                    if (isEvictable(map, next2)) {
                        i4++;
                        if (idleAtNs < j6) {
                            realConnection3 = next2;
                            j6 = idleAtNs;
                        }
                    }
                }
            }
        }
        if (realConnection2 != null) {
            realConnection = realConnection2;
        } else if (i4 > this.maxIdleConnections) {
            j5 = j6;
            realConnection = realConnection3;
        } else {
            j5 = -1;
        }
        if (realConnection != null) {
            synchronized (realConnection) {
                if (!realConnection.getCalls().isEmpty()) {
                    return 0L;
                }
                if (realConnection.getIdleAtNs() != j5) {
                    return 0L;
                }
                realConnection.setNoNewExchanges(true);
                this.connections.remove(realConnection);
                AddressState addressState2 = map.get(realConnection.getRoute().address());
                if (addressState2 != null) {
                    scheduleOpener(addressState2);
                }
                _UtilJvmKt.closeQuietly(realConnection.getSocket());
                this.connectionListener.connectionClosed(realConnection);
                if (this.connections.isEmpty()) {
                    this.cleanupQueue.cancelAll();
                }
                return 0L;
            }
        }
        if (realConnection3 != null) {
            return (j6 + this.keepAliveDurationNs) - now;
        }
        if (i5 <= 0) {
            return -1L;
        }
        return this.keepAliveDurationNs;
    }

    public final boolean connectionBecameIdle(@NotNull RealConnection connection) {
        Intrinsics.echo(connection, "connection");
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            scheduleCloser();
            return false;
        }
        connection.setNoNewExchanges(true);
        this.connections.remove(connection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
        scheduleOpener(connection.getRoute().address());
        return true;
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    public final void evictAll() {
        Socket socket;
        Iterator<RealConnection> it = this.connections.iterator();
        Intrinsics.delta(it, "iterator(...)");
        while (it.hasNext()) {
            RealConnection next = it.next();
            Intrinsics.checkNotNull(next);
            synchronized (next) {
                if (next.getCalls().isEmpty()) {
                    it.remove();
                    next.setNoNewExchanges(true);
                    socket = next.getSocket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                _UtilJvmKt.closeQuietly(socket);
                this.connectionListener.connectionClosed(next);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
        Iterator<AddressState> it2 = this.addressStates.values().iterator();
        while (it2.hasNext()) {
            scheduleOpener(it2.next());
        }
    }

    @NotNull
    /* renamed from: getConnectionListener$okhttp, reason: from getter */
    public final ConnectionListener getConnectionListener() {
        return this.connectionListener;
    }

    /* renamed from: getKeepAliveDurationNs$okhttp, reason: from getter */
    public final long getKeepAliveDurationNs() {
        return this.keepAliveDurationNs;
    }

    public final int idleConnectionCount() {
        boolean z2;
        boolean isEmpty;
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = this.connections;
        int i4 = 0;
        if (concurrentLinkedQueue != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && concurrentLinkedQueue.isEmpty()) {
            return 0;
        }
        for (RealConnection realConnection : concurrentLinkedQueue) {
            Intrinsics.checkNotNull(realConnection);
            synchronized (realConnection) {
                isEmpty = realConnection.getCalls().isEmpty();
            }
            if (isEmpty && (i4 = i4 + 1) < 0) {
                CollectionsKt.t();
                throw null;
            }
        }
        return i4;
    }

    public final void put(@NotNull RealConnection connection) {
        Intrinsics.echo(connection, "connection");
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        this.connections.add(connection);
        scheduleCloser();
    }

    public final void scheduleCloser() {
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }

    public final void setPolicy(@NotNull Address address, @NotNull AddressPolicy policy) {
        Map<Address, AddressState> map;
        int i4;
        AddressPolicy policy2;
        Intrinsics.echo(address, "address");
        Intrinsics.echo(policy, "policy");
        AddressState addressState = new AddressState(address, this.taskRunner.newQueue(), policy);
        loop0: while (true) {
            map = this.addressStates;
            Map<?, ?> victor = y.victor(map, new Pair(address, addressState));
            AtomicReferenceFieldUpdater<RealConnectionPool, Map<?, ?>> atomicReferenceFieldUpdater = addressStatesUpdater;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, map, victor)) {
                if (atomicReferenceFieldUpdater.get(this) != map) {
                    break;
                }
            }
        }
        AddressState addressState2 = map.get(address);
        if (addressState2 != null && (policy2 = addressState2.getPolicy()) != null) {
            i4 = policy2.minimumConcurrentCalls;
        } else {
            i4 = 0;
        }
        int i5 = policy.minimumConcurrentCalls - i4;
        if (i5 > 0) {
            scheduleOpener(addressState);
        } else if (i5 < 0) {
            scheduleCloser();
        }
    }

    public final void scheduleOpener(@NotNull Address address) {
        Intrinsics.echo(address, "address");
        AddressState addressState = this.addressStates.get(address);
        if (addressState != null) {
            scheduleOpener(addressState);
        }
    }
}
