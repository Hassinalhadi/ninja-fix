package F6;

import V5.x;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.stats.zzi;
import e6.C1629a;
import e6.d;
import e6.e;
import g6.C1754b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import u6.C3144a;

/* loaded from: classes2.dex */
public final class a {
    public static final long november = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService oscar = null;
    public static final Object papa = new Object();
    public final Object alpha;
    public final PowerManager.WakeLock bravo;
    public int charlie;
    public ScheduledFuture delta;
    public long echo;
    public final HashSet foxtrot;
    public boolean golf;
    public C3144a hotel;
    public final C1629a india;
    public final String juliet;
    public final HashMap kilo;
    public final AtomicInteger lima;
    public final ScheduledExecutorService mike;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.alpha = new Object();
        this.charlie = 0;
        this.foxtrot = new HashSet();
        this.golf = true;
        this.india = C1629a.alpha;
        this.kilo = new HashMap();
        this.lima = new AtomicInteger(0);
        x.foxtrot("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.hotel = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.juliet = str;
        } else {
            this.juliet = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.bravo = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (e.bravo(context)) {
                int i4 = d.alpha;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo bravo = C1754b.alpha(context).bravo(0, packageName);
                        if (bravo == null) {
                            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        } else {
                            int i5 = bravo.uid;
                            workSource = new WorkSource();
                            e.alpha(workSource, i5, packageName);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                    }
                }
                if (workSource != null) {
                    try {
                        this.bravo.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = oscar;
            if (scheduledExecutorService == null) {
                synchronized (papa) {
                    try {
                        scheduledExecutorService = oscar;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            oscar = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.mike = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void alpha(long j5) {
        this.lima.incrementAndGet();
        long j6 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, november), 1L);
        if (j5 > 0) {
            max = Math.min(j5, max);
        }
        synchronized (this.alpha) {
            try {
                if (!bravo()) {
                    this.hotel = C3144a.alpha;
                    this.bravo.acquire();
                    this.india.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.charlie++;
                if (this.golf) {
                    TextUtils.isEmpty(null);
                }
                c cVar = (c) this.kilo.get(null);
                c cVar2 = cVar;
                if (cVar == null) {
                    Object obj = new Object();
                    this.kilo.put(null, obj);
                    cVar2 = obj;
                }
                cVar2.alpha++;
                this.india.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j6 = elapsedRealtime + max;
                }
                if (j6 > this.echo) {
                    this.echo = j6;
                    ScheduledFuture scheduledFuture = this.delta;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.delta = this.mike.schedule(new b(0, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean bravo() {
        boolean z2;
        synchronized (this.alpha) {
            if (this.charlie > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final void charlie() {
        if (this.lima.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.juliet).concat(" release without a matched acquire!"));
        }
        synchronized (this.alpha) {
            try {
                if (this.golf) {
                    TextUtils.isEmpty(null);
                }
                if (this.kilo.containsKey(null)) {
                    c cVar = (c) this.kilo.get(null);
                    if (cVar != null) {
                        int i4 = cVar.alpha - 1;
                        cVar.alpha = i4;
                        if (i4 == 0) {
                            this.kilo.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.juliet).concat(" counter does not exist"));
                }
                echo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void delta() {
        HashSet hashSet = this.foxtrot;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            hashSet.clear();
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void echo() {
        synchronized (this.alpha) {
            try {
                if (!bravo()) {
                    return;
                }
                if (this.golf) {
                    int i4 = this.charlie - 1;
                    this.charlie = i4;
                    if (i4 > 0) {
                        return;
                    }
                } else {
                    this.charlie = 0;
                }
                delta();
                Iterator it = this.kilo.values().iterator();
                while (it.hasNext()) {
                    ((c) it.next()).alpha = 0;
                }
                this.kilo.clear();
                ScheduledFuture scheduledFuture = this.delta;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.delta = null;
                    this.echo = 0L;
                }
                if (this.bravo.isHeld()) {
                    try {
                        try {
                            this.bravo.release();
                            if (this.hotel != null) {
                                this.hotel = null;
                            }
                        } catch (RuntimeException e) {
                            if (e.getClass().equals(RuntimeException.class)) {
                                Log.e("WakeLock", String.valueOf(this.juliet).concat(" failed to release!"), e);
                                if (this.hotel != null) {
                                    this.hotel = null;
                                }
                            } else {
                                throw e;
                            }
                        }
                    } catch (Throwable th) {
                        if (this.hotel != null) {
                            this.hotel = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.juliet).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
