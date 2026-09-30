package Tf;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class g extends as {

    @NotNull
    private static final c Companion = new Object();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @NotNull
    private static final Condition condition;

    @Nullable
    private static g head;

    @NotNull
    private static final ReentrantLock lock;

    @Nullable
    private g next;
    private int state;
    private long timeoutAt;

    /* JADX WARN: Type inference failed for: r0v0, types: [Tf.c, java.lang.Object] */
    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.delta(newCondition, "newCondition(...)");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final /* synthetic */ c access$getCompanion$p() {
        return Companion;
    }

    public static final /* synthetic */ g access$getHead$cp() {
        return head;
    }

    public static final /* synthetic */ ReentrantLock access$getLock$cp() {
        return lock;
    }

    public static final long access$remainingNanos(g gVar, long j5) {
        return gVar.timeoutAt - j5;
    }

    public static final /* synthetic */ void access$setHead$cp(g gVar) {
        head = gVar;
    }

    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException iOException) {
        return newTimeoutException(iOException);
    }

    @Override // Tf.as
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                c.bravo(Companion, this);
                this.state = 3;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos == 0 && !hasDeadline) {
            return;
        }
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 0) {
                this.state = 1;
                c.alpha(Companion, this, timeoutNanos, hasDeadline);
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i4 = this.state;
            boolean z2 = false;
            this.state = 0;
            if (i4 == 1) {
                c.bravo(Companion, this);
                return false;
            }
            if (i4 == 2) {
                z2 = true;
            }
            return z2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @NotNull
    public final ao sink(@NotNull ao sink) {
        Intrinsics.echo(sink, "sink");
        return new e(this, sink);
    }

    @NotNull
    public final ap source(@NotNull ap source) {
        Intrinsics.echo(source, "source");
        return new f(this, source);
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(@NotNull Function0<? extends T> block) {
        Intrinsics.echo(block, "block");
        enter();
        try {
            T invoke = block.invoke();
            if (!exit()) {
                return invoke;
            }
            throw access$newTimeoutException(null);
        } catch (IOException e) {
            if (!exit()) {
                throw e;
            }
            throw access$newTimeoutException(e);
        } finally {
            exit();
        }
    }
}
