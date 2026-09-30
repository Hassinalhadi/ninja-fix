package V7;

import B5.d;
import B5.g;
import E5.r;
import G6.h;
import J2.l;
import O7.aa;
import android.os.SystemClock;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class c {
    public final double alpha;
    public final double bravo;
    public final long charlie;
    public final long delta;
    public final int echo;
    public final ArrayBlockingQueue foxtrot;
    public final ThreadPoolExecutor golf;
    public final r hotel;
    public final l india;
    public int juliet;
    public long kilo;

    public c(r rVar, W7.b bVar, l lVar) {
        double d4 = bVar.delta;
        this.alpha = d4;
        this.bravo = bVar.echo;
        this.charlie = bVar.foxtrot * 1000;
        this.hotel = rVar;
        this.india = lVar;
        this.delta = SystemClock.elapsedRealtime();
        int i4 = (int) d4;
        this.echo = i4;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i4);
        this.foxtrot = arrayBlockingQueue;
        this.golf = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.juliet = 0;
        this.kilo = 0L;
    }

    public final int alpha() {
        int max;
        if (this.kilo == 0) {
            this.kilo = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.kilo) / this.charlie);
        if (this.foxtrot.size() == this.echo) {
            max = Math.min(100, this.juliet + currentTimeMillis);
        } else {
            max = Math.max(0, this.juliet - currentTimeMillis);
        }
        if (this.juliet != max) {
            this.juliet = max;
            this.kilo = System.currentTimeMillis();
        }
        return max;
    }

    public final void bravo(final O7.a aVar, final h hVar) {
        final boolean z2;
        String str = "Sending report through Google DataTransport: " + aVar.bravo;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.delta < Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.hotel.alpha(new B5.a(aVar.alpha, d.red, null), new g() { // from class: V7.b
            @Override // B5.g
            public final void echo(Exception exc) {
                c cVar = c.this;
                cVar.getClass();
                h hVar2 = hVar;
                if (exc != null) {
                    hVar2.charlie(exc);
                    return;
                }
                if (z2) {
                    boolean z10 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new A8.g(18, cVar, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = aa.alpha;
                    boolean z11 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long nanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z10) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                nanos = nanoTime - System.nanoTime();
                                z11 = true;
                            }
                        }
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = z11;
                    }
                }
                hVar2.delta(aVar);
            }
        });
    }
}
