package V0;

import androidx.appcompat.widget.P0;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import t6.AbstractC2998h;

/* loaded from: classes3.dex */
public abstract class g implements com.google.common.util.concurrent.e {
    public static final boolean silver = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger teal = Logger.getLogger(g.class.getName());
    public static final AbstractC2998h white;
    public static final Object yellow;
    public volatile Object alpha;
    public volatile c purple;
    public volatile f red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [t6.h] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    static {
        ?? r4;
        try {
            th = null;
            r4 = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "alpha"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "bravo"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "red"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "purple"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "alpha"));
        } catch (Throwable th) {
            th = th;
            r4 = new Object();
        }
        white = r4;
        if (th != null) {
            teal.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        yellow = new Object();
    }

    public static void charlie(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.red;
        } while (!white.charlie(gVar, fVar, f.charlie));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.alpha;
            if (thread != null) {
                fVar.alpha = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.bravo;
        }
        gVar.bravo();
        do {
            cVar2 = gVar.purple;
        } while (!white.alpha(gVar, cVar2, c.delta));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.charlie;
            cVar.charlie = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.charlie;
            delta(cVar3.alpha, cVar3.bravo);
            cVar3 = cVar4;
        }
    }

    public static void delta(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            teal.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object echo(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof b)) {
                if (obj == yellow) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((b) obj).alpha);
        }
        CancellationException cancellationException = ((a) obj).bravo;
        CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
        cancellationException2.initCause(cancellationException);
        throw cancellationException2;
    }

    public static Object golf(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void alpha(StringBuilder sb2) {
        String valueOf;
        try {
            Object golf = golf(this);
            sb2.append("SUCCESS, result=[");
            if (golf == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(golf);
            }
            sb2.append(valueOf);
            sb2.append(Constants.AES_SUFFIX);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e4.getCause());
            sb2.append(Constants.AES_SUFFIX);
        }
    }

    public void bravo() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        a aVar;
        Object obj = this.alpha;
        if (obj == null) {
            if (silver) {
                aVar = new a(z2, new CancellationException("Future.cancel() was called."));
            } else if (z2) {
                aVar = a.charlie;
            } else {
                aVar = a.delta;
            }
            if (white.bravo(this, obj, aVar)) {
                charlie(this);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.common.util.concurrent.e
    public final void foxtrot(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.purple;
        c cVar2 = c.delta;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.charlie = cVar;
                if (white.alpha(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.purple;
                }
            } while (cVar != cVar2);
        }
        delta(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j5);
        if (!Thread.interrupted()) {
            Object obj = this.alpha;
            if (obj != null) {
                return echo(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                f fVar = this.red;
                f fVar2 = f.charlie;
                if (fVar != fVar2) {
                    f fVar3 = new f();
                    do {
                        AbstractC2998h abstractC2998h = white;
                        abstractC2998h.delta(fVar3, fVar);
                        if (abstractC2998h.charlie(this, fVar, fVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.alpha;
                                    if (obj2 != null) {
                                        return echo(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    india(fVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            india(fVar3);
                        } else {
                            fVar = this.red;
                        }
                    } while (fVar != fVar2);
                }
                return echo(this.alpha);
            }
            while (nanos > 0) {
                Object obj3 = this.alpha;
                if (obj3 != null) {
                    return echo(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String gVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            StringBuilder uniform = Q0.c.uniform("Waited ", j5, " ");
            uniform.append(timeUnit.toString().toLowerCase(locale));
            String sb2 = uniform.toString();
            if (nanos + 1000 < 0) {
                String crimson = P0.crimson(sb2, " (plus ");
                long j6 = -nanos;
                long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
                long nanos2 = j6 - timeUnit.toNanos(convert);
                boolean z2 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str = crimson + convert + " " + lowerCase;
                    if (z2) {
                        str = P0.crimson(str, Constants.SEPARATOR_COMMA);
                    }
                    crimson = P0.crimson(str, " ");
                }
                if (z2) {
                    crimson = crimson + nanos2 + " nanoseconds ";
                }
                sb2 = P0.crimson(crimson, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(P0.crimson(sb2, " but future completed as timeout expired"));
            }
            throw new TimeoutException(ad.amber(sb2, " for ", gVar));
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String hotel() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void india(f fVar) {
        fVar.alpha = null;
        while (true) {
            f fVar2 = this.red;
            if (fVar2 != f.charlie) {
                f fVar3 = null;
                while (fVar2 != null) {
                    f fVar4 = fVar2.bravo;
                    if (fVar2.alpha != null) {
                        fVar3 = fVar2;
                    } else if (fVar3 != null) {
                        fVar3.bravo = fVar4;
                        if (fVar3.alpha == null) {
                            break;
                        }
                    } else if (!white.charlie(this, fVar2, fVar4)) {
                        break;
                    }
                    fVar2 = fVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.alpha instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.alpha != null) {
            return true;
        }
        return false;
    }

    public boolean juliet(Object obj) {
        if (obj == null) {
            obj = yellow;
        }
        if (white.bravo(this, null, obj)) {
            charlie(this);
            return true;
        }
        return false;
    }

    public boolean kilo(Throwable th) {
        th.getClass();
        if (white.bravo(this, null, new b(th))) {
            charlie(this);
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.alpha instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            alpha(sb2);
        } else {
            try {
                str = hotel();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append(Constants.AES_SUFFIX);
            } else if (isDone()) {
                alpha(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append(Constants.AES_SUFFIX);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.alpha;
            if (obj2 != null) {
                return echo(obj2);
            }
            f fVar = this.red;
            f fVar2 = f.charlie;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC2998h abstractC2998h = white;
                    abstractC2998h.delta(fVar3, fVar);
                    if (abstractC2998h.charlie(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.alpha;
                            } else {
                                india(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return echo(obj);
                    }
                    fVar = this.red;
                } while (fVar != fVar2);
            }
            return echo(this.alpha);
        }
        throw new InterruptedException();
    }
}
