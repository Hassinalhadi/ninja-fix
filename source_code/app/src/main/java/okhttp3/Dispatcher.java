package okhttp3;

import ao.ad;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.c;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0019\u0010\u001e\u001a\u00020\u001f2\n\u0010 \u001a\u00060\u001aR\u00020\u001bH\u0000¢\u0006\u0002\b!J\u0016\u0010\"\u001a\b\u0018\u00010\u001aR\u00020\u001b2\u0006\u0010#\u001a\u00020$H\u0002J\u0006\u0010%\u001a\u00020\u001fJ\b\u0010&\u001a\u00020'H\u0002J\u0015\u0010(\u001a\u00020'2\u0006\u0010 \u001a\u00020\u001bH\u0000¢\u0006\u0002\b)J\u0019\u0010*\u001a\u00020\u001f2\n\u0010 \u001a\u00060\u001aR\u00020\u001bH\u0000¢\u0006\u0002\b+J\u0015\u0010*\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0000¢\u0006\u0002\b+J)\u0010*\u001a\u00020\u001f\"\u0004\b\u0000\u0010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u0002H,0.2\u0006\u0010 \u001a\u0002H,H\u0002¢\u0006\u0002\u0010/J\f\u00100\u001a\b\u0012\u0004\u0012\u00020201J\f\u00103\u001a\b\u0012\u0004\u0012\u00020201J\u0006\u00104\u001a\u00020\bJ\u0006\u00105\u001a\u00020\bJ\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b6R$\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0017R\u0018\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u001aR\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\f\u0012\b\u0012\u00060\u001aR\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lokhttp3/Dispatcher;", "", "<init>", "()V", "executorService", "Ljava/util/concurrent/ExecutorService;", "(Ljava/util/concurrent/ExecutorService;)V", "maxRequests", "", "getMaxRequests", "()I", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "idleCallback", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "executorServiceOrNull", "()Ljava/util/concurrent/ExecutorService;", "readyAsyncCalls", "Ljava/util/ArrayDeque;", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "runningAsyncCalls", "runningSyncCalls", "enqueue", "", "call", "enqueue$okhttp", "findExistingCallWithHost", "host", "", "cancelAll", "promoteAndExecute", "", "executed", "executed$okhttp", "finished", "finished$okhttp", "T", "calls", "Ljava/util/Deque;", "(Ljava/util/Deque;Ljava/lang/Object;)V", "queuedCalls", "", "Lokhttp3/Call;", "runningCalls", "queuedCallsCount", "runningCallsCount", "-deprecated_executorService", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Dispatcher {

    @Nullable
    private ExecutorService executorServiceOrNull;

    @Nullable
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;

    @NotNull
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;

    @NotNull
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;

    @NotNull
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String host) {
        Iterator<RealCall.AsyncCall> it = this.runningAsyncCalls.iterator();
        Intrinsics.delta(it, "iterator(...)");
        while (it.hasNext()) {
            RealCall.AsyncCall next = it.next();
            if (Intrinsics.areEqual(next.getHost(), host)) {
                return next;
            }
        }
        Iterator<RealCall.AsyncCall> it2 = this.readyAsyncCalls.iterator();
        Intrinsics.delta(it2, "iterator(...)");
        while (it2.hasNext()) {
            RealCall.AsyncCall next2 = it2.next();
            if (Intrinsics.areEqual(next2.getHost(), host)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void finished(Deque<T> calls, T call) {
        Runnable runnable;
        synchronized (this) {
            if (calls.remove(call)) {
                runnable = this.idleCallback;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!promoteAndExecute() && runnable != null) {
            runnable.run();
        }
    }

    private final boolean promoteAndExecute() {
        int i4;
        boolean z2;
        _UtilJvmKt.assertLockNotHeld(this);
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
                Intrinsics.delta(it, "iterator(...)");
                while (it.hasNext()) {
                    RealCall.AsyncCall next = it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    }
                    if (next.getCallsPerHost().get() < this.maxRequestsPerHost) {
                        it.remove();
                        next.getCallsPerHost().incrementAndGet();
                        Intrinsics.checkNotNull(next);
                        arrayList.add(next);
                        this.runningAsyncCalls.add(next);
                    }
                }
                i4 = 0;
                if (runningCallsCount() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executorService().isShutdown()) {
            int size = arrayList.size();
            while (i4 < size) {
                RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) arrayList.get(i4);
                asyncCall.getCallsPerHost().decrementAndGet();
                synchronized (this) {
                    this.runningAsyncCalls.remove(asyncCall);
                }
                RealCall.AsyncCall.failRejected$okhttp$default(asyncCall, null, 1, null);
                i4++;
            }
            Runnable runnable = this.idleCallback;
            if (runnable != null) {
                runnable.run();
                return z2;
            }
        } else {
            int size2 = arrayList.size();
            while (i4 < size2) {
                ((RealCall.AsyncCall) arrayList.get(i4)).executeOn(executorService());
                i4++;
            }
        }
        return z2;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m253deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        try {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            Intrinsics.delta(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().getThis$0().cancel();
            }
            Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
            Intrinsics.delta(it2, "iterator(...)");
            while (it2.hasNext()) {
                it2.next().getThis$0().cancel();
            }
            Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
            Intrinsics.delta(it3, "iterator(...)");
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void enqueue$okhttp(@NotNull RealCall.AsyncCall call) {
        RealCall.AsyncCall findExistingCallWithHost;
        Intrinsics.echo(call, "call");
        synchronized (this) {
            this.readyAsyncCalls.add(call);
            if (!call.getThis$0().getForWebSocket() && (findExistingCallWithHost = findExistingCallWithHost(call.getHost())) != null) {
                call.reuseCallsPerHostFrom(findExistingCallWithHost);
            }
        }
        promoteAndExecute();
    }

    public final synchronized boolean executed$okhttp(@NotNull RealCall call) {
        Intrinsics.echo(call, "call");
        return this.runningSyncCalls.add(call);
    }

    @NotNull
    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        try {
            if (this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, LottieConstants.IterateForever, 60L, TimeUnit.SECONDS, new SynchronousQueue(), _UtilJvmKt.threadFactory(_UtilJvmKt.okHttpName + " Dispatcher", false));
            }
            executorService = this.executorServiceOrNull;
            Intrinsics.checkNotNull(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void finished$okhttp(@NotNull RealCall.AsyncCall call) {
        Intrinsics.echo(call, "call");
        call.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, call);
    }

    @Nullable
    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    @NotNull
    public final synchronized List<Call> queuedCalls() {
        int collectionSizeOrDefault;
        List<Call> unmodifiableList;
        try {
            ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayDeque, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealCall.AsyncCall) it.next()).getThis$0());
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.delta(unmodifiableList, "unmodifiableList(...)");
        } catch (Throwable th) {
            throw th;
        }
        return unmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    @NotNull
    public final synchronized List<Call> runningCalls() {
        int collectionSizeOrDefault;
        List<Call> unmodifiableList;
        try {
            ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
            ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayDeque2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealCall.AsyncCall) it.next()).getThis$0());
            }
            unmodifiableList = Collections.unmodifiableList(CollectionsKt.a(arrayDeque, arrayList));
            Intrinsics.delta(unmodifiableList, "unmodifiableList(...)");
        } catch (Throwable th) {
            throw th;
        }
        return unmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(@Nullable Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i4) {
        if (i4 >= 1) {
            synchronized (this) {
                this.maxRequests = i4;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(ad.zulu(i4, "max < 1: ").toString());
    }

    public final void setMaxRequestsPerHost(int i4) {
        if (i4 >= 1) {
            synchronized (this) {
                this.maxRequestsPerHost = i4;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(ad.zulu(i4, "max < 1: ").toString());
    }

    public final void finished$okhttp(@NotNull RealCall call) {
        Intrinsics.echo(call, "call");
        finished(this.runningSyncCalls, call);
    }

    public Dispatcher(@Nullable ExecutorService executorService) {
        this();
        this.executorServiceOrNull = executorService;
    }
}
