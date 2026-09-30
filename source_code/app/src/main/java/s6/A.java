package s6;

import com.clevertap.android.sdk.Constants;
import com.google.maps.android.BuildConfig;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class A extends M implements J {
    public static final boolean silver;
    public static final I teal;
    public static final t6.X1 white;
    public static final Object yellow;
    public volatile Object alpha;
    public volatile as purple;
    public volatile az red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [t6.X1] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    static {
        boolean z2;
        Throwable th;
        Throwable th2;
        ?? atVar;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        silver = z2;
        teal = new I(A.class);
        try {
            th = null;
            th2 = null;
            atVar = new Object();
        } catch (Error | Exception e) {
            try {
                th2 = e;
                atVar = new at(AtomicReferenceFieldUpdater.newUpdater(az.class, Thread.class, "alpha"), AtomicReferenceFieldUpdater.newUpdater(az.class, az.class, "bravo"), AtomicReferenceFieldUpdater.newUpdater(A.class, az.class, "red"), AtomicReferenceFieldUpdater.newUpdater(A.class, as.class, "purple"), AtomicReferenceFieldUpdater.newUpdater(A.class, Object.class, "alpha"));
                th = null;
            } catch (Error | Exception e4) {
                th = e4;
                th2 = e;
                atVar = new Object();
            }
        }
        white = atVar;
        if (th != null) {
            I i4 = teal;
            Logger alpha = i4.alpha();
            Level level = Level.SEVERE;
            alpha.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            i4.alpha().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        yellow = new Object();
    }

    public static Object charlie(J j5) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = j5.get();
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

    public static void echo(A a6) {
        for (az charlie = white.charlie(a6); charlie != null; charlie = charlie.bravo) {
            Thread thread = charlie.alpha;
            if (thread != null) {
                charlie.alpha = null;
                LockSupport.unpark(thread);
            }
        }
        a6.bravo();
        as bravo = white.bravo(a6);
        as asVar = null;
        while (bravo != null) {
            as asVar2 = bravo.charlie;
            bravo.charlie = asVar;
            asVar = bravo;
            bravo = asVar2;
        }
        while (asVar != null) {
            Runnable runnable = asVar.alpha;
            as asVar3 = asVar.charlie;
            Objects.requireNonNull(runnable);
            if (!(runnable instanceof au)) {
                D d4 = asVar.bravo;
                Objects.requireNonNull(d4);
                golf(runnable, d4);
                asVar = asVar3;
            } else {
                throw null;
            }
        }
    }

    public static void golf(Runnable runnable, D d4) {
        try {
            d4.getClass();
            runnable.run();
        } catch (Exception e) {
            teal.alpha().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", av.q.foxtrot("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(d4)), (Throwable) e);
        }
    }

    public static final Object india(Object obj) {
        if (!(obj instanceof aq)) {
            if (!(obj instanceof ar)) {
                if (obj == yellow) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((ar) obj).alpha);
        }
        RuntimeException runtimeException = ((aq) obj).bravo;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(runtimeException);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String alpha() {
        if (this instanceof ScheduledFuture) {
            return com.google.android.material.datepicker.j.kilo("remaining delay=[", ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), " ms]");
        }
        return null;
    }

    public void bravo() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        boolean z10;
        aq aqVar;
        aq aqVar2;
        Object obj = this.alpha;
        boolean z11 = obj instanceof au;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 | z10) {
            if (silver) {
                aqVar2 = new aq(z2, new CancellationException("Future.cancel() was called."));
            } else {
                if (z2) {
                    aqVar = aq.charlie;
                } else {
                    aqVar = aq.delta;
                }
                aqVar2 = aqVar;
                Objects.requireNonNull(aqVar2);
            }
            while (!white.golf(this, obj, aqVar2)) {
                obj = this.alpha;
                if (!(obj instanceof au)) {
                }
            }
            echo(this);
            if (!(obj instanceof au)) {
                return true;
            }
            ((au) obj).getClass();
            throw null;
        }
        return false;
    }

    public final void delta(StringBuilder sb2) {
        try {
            Object charlie = charlie(this);
            sb2.append("SUCCESS, result=[");
            if (charlie == null) {
                sb2.append(BuildConfig.TRAVIS);
            } else if (charlie == this) {
                sb2.append("this future");
            } else {
                sb2.append(charlie.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(charlie)));
            }
            sb2.append(Constants.AES_SUFFIX);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e.getCause());
            sb2.append(Constants.AES_SUFFIX);
        } catch (Exception e4) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e4.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.alpha;
            if ((obj2 != null) & (!(obj2 instanceof au))) {
                return india(obj2);
            }
            az azVar = this.red;
            az azVar2 = az.charlie;
            if (azVar != azVar2) {
                az azVar3 = new az();
                do {
                    t6.X1 x12 = white;
                    x12.delta(azVar3, azVar);
                    if (x12.hotel(this, azVar, azVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.alpha;
                            } else {
                                hotel(azVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof au))));
                        return india(obj);
                    }
                    azVar = this.red;
                } while (azVar != azVar2);
            }
            Object obj3 = this.alpha;
            Objects.requireNonNull(obj3);
            return india(obj3);
        }
        throw new InterruptedException();
    }

    public final void hotel(az azVar) {
        azVar.alpha = null;
        while (true) {
            az azVar2 = this.red;
            if (azVar2 != az.charlie) {
                az azVar3 = null;
                while (azVar2 != null) {
                    az azVar4 = azVar2.bravo;
                    if (azVar2.alpha != null) {
                        azVar3 = azVar2;
                    } else if (azVar3 != null) {
                        azVar3.bravo = azVar4;
                        if (azVar3.alpha == null) {
                            break;
                        }
                    } else if (!white.hotel(this, azVar2, azVar4)) {
                        break;
                    }
                    azVar2 = azVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.alpha instanceof aq;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z2;
        Object obj = this.alpha;
        boolean z10 = obj instanceof au;
        if (obj != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 & (!z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
        boolean z2;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.alpha instanceof aq) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            delta(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.alpha;
            if (obj instanceof au) {
                sb2.append(", setFuture=[");
                ((au) obj).getClass();
                try {
                    sb2.append((Object) null);
                } catch (Exception | StackOverflowError e) {
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e.getClass());
                }
                sb2.append(Constants.AES_SUFFIX);
            } else {
                try {
                    concat = alpha();
                } catch (Exception | StackOverflowError e4) {
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(e4.getClass()));
                }
                if (concat != null) {
                    if (!concat.isEmpty()) {
                        z2 = false;
                        if (z2) {
                            concat = null;
                        }
                        if (concat != null) {
                            sb2.append(", info=[");
                            sb2.append(concat);
                            sb2.append(Constants.AES_SUFFIX);
                        }
                    }
                }
                z2 = true;
                if (z2) {
                }
                if (concat != null) {
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                delta(sb2);
            }
        }
        sb2.append(Constants.AES_SUFFIX);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        boolean z2;
        long j6;
        long nanos = timeUnit.toNanos(j5);
        if (!Thread.interrupted()) {
            Object obj = this.alpha;
            if ((obj != null) & (!(obj instanceof au))) {
                return india(obj);
            }
            long j7 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                az azVar = this.red;
                az azVar2 = az.charlie;
                if (azVar != azVar2) {
                    az azVar3 = new az();
                    z2 = true;
                    while (true) {
                        t6.X1 x12 = white;
                        x12.delta(azVar3, azVar);
                        if (x12.hotel(this, azVar, azVar3)) {
                            j6 = j7;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.alpha;
                                    if ((obj2 != null) & (!(obj2 instanceof au))) {
                                        return india(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    hotel(azVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            hotel(azVar3);
                        } else {
                            long j10 = j7;
                            azVar = this.red;
                            if (azVar == azVar2) {
                                break;
                            }
                            j7 = j10;
                        }
                    }
                }
                Object obj3 = this.alpha;
                Objects.requireNonNull(obj3);
                return india(obj3);
            }
            z2 = true;
            j6 = 0;
            while (nanos > j6) {
                Object obj4 = this.alpha;
                if ((obj4 != null ? z2 : false) & (!(obj4 instanceof au))) {
                    return india(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String a6 = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j6) {
                String concat = str.concat(" (plus ");
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                if (convert != j6 && nanos2 <= 1000) {
                    z2 = false;
                }
                if (convert > j6) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z2) {
                        str2 = str2.concat(Constants.SEPARATOR_COMMA);
                    }
                    concat = str2.concat(" ");
                }
                if (z2) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(ao.ad.amber(str, " for ", a6));
        }
        throw new InterruptedException();
    }
}
