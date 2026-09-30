package B2;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class f {
    public static final String lima = A2.z.golf("Processor");
    public final Context bravo;
    public final A2.a charlie;
    public final L2.c delta;
    public final WorkDatabase echo;
    public final HashMap golf = new HashMap();
    public final HashMap foxtrot = new HashMap();
    public final HashSet india = new HashSet();
    public final ArrayList juliet = new ArrayList();
    public PowerManager.WakeLock alpha = null;
    public final Object kilo = new Object();
    public final HashMap hotel = new HashMap();

    public f(Context context, A2.a aVar, L2.c cVar, WorkDatabase workDatabase) {
        this.bravo = context;
        this.charlie = aVar;
        this.delta = cVar;
        this.echo = workDatabase;
    }

    public static boolean echo(String str, ao aoVar, int i4) {
        String str2 = lima;
        if (aoVar != null) {
            aoVar.november.whiskey(new WorkerStoppedException(i4));
            A2.z.echo().alpha(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        A2.z.echo().alpha(str2, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public final void alpha(c cVar) {
        synchronized (this.kilo) {
            this.juliet.add(cVar);
        }
    }

    public final ao bravo(String str) {
        boolean z2;
        ao aoVar = (ao) this.foxtrot.remove(str);
        if (aoVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            aoVar = (ao) this.golf.remove(str);
        }
        this.hotel.remove(str);
        if (z2) {
            synchronized (this.kilo) {
                try {
                    if (this.foxtrot.isEmpty()) {
                        Context context = this.bravo;
                        String str2 = I2.a.f1415c;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.bravo.startService(intent);
                        } catch (Throwable th) {
                            A2.z.echo().delta(lima, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.alpha;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.alpha = null;
                        }
                    }
                } finally {
                }
            }
        }
        return aoVar;
    }

    public final J2.p charlie(String str) {
        synchronized (this.kilo) {
            try {
                ao delta = delta(str);
                if (delta != null) {
                    return delta.alpha;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ao delta(String str) {
        ao aoVar = (ao) this.foxtrot.get(str);
        if (aoVar == null) {
            return (ao) this.golf.get(str);
        }
        return aoVar;
    }

    public final boolean foxtrot(String str) {
        boolean z2;
        synchronized (this.kilo) {
            if (delta(str) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final void golf(c cVar) {
        synchronized (this.kilo) {
            this.juliet.remove(cVar);
        }
    }

    public final void hotel(J2.j jVar) {
        L2.c cVar = this.delta;
        cVar.delta.execute(new A8.g(1, this, jVar));
    }

    public final boolean india(l lVar, J2.t tVar) {
        Throwable th;
        J2.j jVar = lVar.alpha;
        String str = jVar.alpha;
        ArrayList arrayList = new ArrayList();
        J2.p pVar = (J2.p) this.echo.november(new e(this, arrayList, str, 0));
        if (pVar == null) {
            A2.z.echo().hotel(lima, "Didn't find WorkSpec for id " + jVar);
            hotel(jVar);
            return false;
        }
        synchronized (this.kilo) {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
            try {
                if (foxtrot(str)) {
                    Set set = (Set) this.hotel.get(str);
                    if (((l) set.iterator().next()).alpha.bravo == jVar.bravo) {
                        set.add(lVar);
                        A2.z.echo().alpha(lima, "Work " + jVar + " is already enqueued for processing");
                    } else {
                        hotel(jVar);
                    }
                    return false;
                }
                if (pVar.tango != jVar.bravo) {
                    hotel(jVar);
                    return false;
                }
                ad adVar = new ad(this.bravo, this.charlie, this.delta, this, this.echo, pVar, arrayList);
                if (tVar != null) {
                    adVar.hotel = tVar;
                }
                ao aoVar = new ao(adVar);
                V0.k alpha = Y8.d.alpha(aoVar.echo.bravo.plus(vf.ad.delta()), new ak(aoVar, null));
                alpha.purple.foxtrot(new A2.s(this, alpha, aoVar, 5), this.delta.delta);
                this.golf.put(str, aoVar);
                HashSet hashSet = new HashSet();
                hashSet.add(lVar);
                this.hotel.put(str, hashSet);
                A2.z.echo().alpha(lima, f.class.getSimpleName() + ": processing " + jVar);
                return true;
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public final boolean juliet(l lVar, int i4) {
        String str = lVar.alpha.alpha;
        synchronized (this.kilo) {
            try {
                if (this.foxtrot.get(str) != null) {
                    A2.z.echo().alpha(lima, "Ignored stopWork. WorkerWrapper " + str + " is in foreground");
                    return false;
                }
                Set set = (Set) this.hotel.get(str);
                if (set != null && set.contains(lVar)) {
                    return echo(str, bravo(str), i4);
                }
                return false;
            } finally {
            }
        }
    }
}
