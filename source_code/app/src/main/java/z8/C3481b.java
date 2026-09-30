package z8;

import C8.j;
import C8.k;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u8.C3146a;

/* renamed from: z8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3481b {
    public static final C3146a golf = C3146a.delta();
    public static final long hotel = TimeUnit.SECONDS.toMicros(1);
    public ScheduledFuture echo = null;
    public long foxtrot = -1;
    public final ConcurrentLinkedQueue alpha = new ConcurrentLinkedQueue();
    public final ScheduledExecutorService bravo = Executors.newSingleThreadScheduledExecutor();
    public final String charlie = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    public final long delta = Os.sysconf(OsConstants._SC_CLK_TCK);

    public final synchronized void alpha(long j5, Timer timer) {
        this.foxtrot = j5;
        try {
            this.echo = this.bravo.scheduleAtFixedRate(new RunnableC3480a(this, timer, 0), 0L, j5, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            golf.foxtrot("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    public final k bravo(Timer timer) {
        long j5 = this.delta;
        C3146a c3146a = golf;
        if (timer != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.charlie));
                try {
                    long charlie = timer.charlie() + timer.alpha;
                    String[] split = bufferedReader.readLine().split(" ");
                    long parseLong = Long.parseLong(split[13]);
                    long parseLong2 = Long.parseLong(split[15]);
                    long parseLong3 = Long.parseLong(split[14]);
                    long parseLong4 = Long.parseLong(split[16]);
                    j victor = k.victor();
                    victor.india();
                    k.sierra((k) victor.purple, charlie);
                    double d4 = (parseLong3 + parseLong4) / j5;
                    long j6 = hotel;
                    long round = Math.round(d4 * j6);
                    victor.india();
                    k.uniform((k) victor.purple, round);
                    long round2 = Math.round(((parseLong + parseLong2) / j5) * j6);
                    victor.india();
                    k.tango((k) victor.purple, round2);
                    k kVar = (k) victor.golf();
                    bufferedReader.close();
                    return kVar;
                } finally {
                }
            } catch (IOException e) {
                c3146a.foxtrot("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
                return null;
            } catch (ArrayIndexOutOfBoundsException e4) {
                e = e4;
                c3146a.foxtrot("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
                return null;
            } catch (NullPointerException e5) {
                e = e5;
                c3146a.foxtrot("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
                return null;
            } catch (NumberFormatException e10) {
                e = e10;
                c3146a.foxtrot("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
                return null;
            }
        } else {
            return null;
        }
    }
}
