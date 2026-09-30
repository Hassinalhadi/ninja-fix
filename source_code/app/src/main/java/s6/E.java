package s6;

import android.app.Application;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import b3.ServiceConnectionC0716b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.C1459n0;
import com.google.android.gms.measurement.internal.C1474v0;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzqb;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.maps.android.BuildConfig;
import f1.C1684d;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import vf.C3207k;

/* loaded from: classes2.dex */
public final class E implements Runnable {
    public final /* synthetic */ int alpha;
    public Object purple;
    public final Object red;

    public /* synthetic */ E(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    private final void alpha() {
        synchronized (((G6.n) this.red).red) {
            try {
                OnFailureListener onFailureListener = (OnFailureListener) ((G6.n) this.red).silver;
                if (onFailureListener != null) {
                    Exception golf = ((Task) this.purple).golf();
                    V5.x.hotel(golf);
                    onFailureListener.onFailure(golf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void bravo() {
        try {
            echo();
        } catch (Error e) {
            synchronized (((J7.j) this.red).purple) {
                ((J7.j) this.red).red = 1;
                throw e;
            }
        }
    }

    private final void charlie() {
        S5.i iVar = (S5.i) this.purple;
        IBinder iBinder = (IBinder) this.red;
        synchronized (iVar) {
            if (iBinder == null) {
                iVar.alpha(0, "Null service connection");
                return;
            }
            try {
                iVar.charlie = new J2.c(iBinder);
                iVar.alpha = 2;
                ((ScheduledExecutorService) iVar.foxtrot.red).execute(new S5.h(iVar, 0));
            } catch (RemoteException e) {
                iVar.alpha(0, e.getMessage());
            }
        }
    }

    private final void delta() {
        com.google.android.gms.measurement.internal.G0 g02 = (com.google.android.gms.measurement.internal.G0) this.red;
        synchronized (g02) {
            try {
                g02.alpha = false;
                com.google.android.gms.measurement.internal.H0 h02 = g02.charlie;
                if (!h02.g0()) {
                    com.google.android.gms.measurement.internal.ar arVar = ((com.google.android.gms.measurement.internal.G) h02.alpha).f7507b;
                    com.google.android.gms.measurement.internal.G.foxtrot(arVar);
                    arVar.f7636g.alpha("Connected to service");
                    com.google.android.gms.measurement.internal.ae aeVar = (com.google.android.gms.measurement.internal.ae) this.purple;
                    h02.W();
                    h02.silver = aeVar;
                    h02.m0();
                    h02.l0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.purple).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.purple = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        J7.j.white.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.purple), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void echo() {
        boolean z2 = false;
        boolean z10 = false;
        while (true) {
            try {
                synchronized (((J7.j) this.red).purple) {
                    if (!z2) {
                        J7.j jVar = (J7.j) this.red;
                        if (jVar.red != 4) {
                            jVar.silver++;
                            jVar.red = 4;
                            z2 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((J7.j) this.red).purple.poll();
                    this.purple = runnable;
                    if (runnable == null) {
                        ((J7.j) this.red).red = 1;
                    }
                }
                if (!z10) {
                    return;
                }
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = null;
        switch (this.alpha) {
            case 0:
                Object obj = ((L) this.purple).alpha;
                if (obj instanceof ar) {
                    th = ((ar) obj).alpha;
                }
                if (th == null) {
                    try {
                        L l10 = (L) this.purple;
                        if (l10.isDone()) {
                            boolean z2 = false;
                            while (true) {
                                try {
                                    Object obj2 = l10.get();
                                    if (z2) {
                                        Thread.currentThread().interrupt();
                                    }
                                    Z7 z72 = (Z7) this.red;
                                    Float f5 = (Float) obj2;
                                    if (f5.floatValue() >= 1.0f) {
                                        a8 a8Var = z72.echo;
                                        float floatValue = f5.floatValue();
                                        synchronized (a8Var.charlie) {
                                            a8Var.juliet = floatValue;
                                            a8Var.golf(false);
                                        }
                                        z72.echo.foxtrot(z72.alpha, z72.bravo, f5.floatValue(), z72.charlie);
                                    }
                                    z72.echo.bravo.set(false);
                                    return;
                                } catch (InterruptedException unused) {
                                    z2 = true;
                                } catch (Throwable th2) {
                                    if (z2) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th2;
                                }
                            }
                        } else {
                            throw new IllegalStateException(t6.af.bravo("Future was expected to be done: %s", l10));
                        }
                    } catch (ExecutionException e) {
                        ((Z7) this.red).alpha(e.getCause());
                        return;
                    } catch (Throwable th3) {
                        ((Z7) this.red).alpha(th3);
                        return;
                    }
                } else {
                    ((Z7) this.red).alpha(th);
                    return;
                }
            case 1:
                if (((G6.q) ((Task) this.purple)).delta) {
                    ((G6.m) this.red).silver.quebec();
                    return;
                }
                try {
                    ((G6.m) this.red).silver.papa(((G6.m) this.red).red.ivory((Task) this.purple));
                    return;
                } catch (RuntimeExecutionException e4) {
                    if (e4.getCause() instanceof Exception) {
                        ((G6.m) this.red).silver.oscar((Exception) e4.getCause());
                        return;
                    } else {
                        ((G6.m) this.red).silver.oscar(e4);
                        return;
                    }
                } catch (Exception e5) {
                    ((G6.m) this.red).silver.oscar(e5);
                    return;
                }
            case 2:
                alpha();
                return;
            case 3:
                G6.q qVar = (G6.q) this.purple;
                try {
                    qVar.papa(((Callable) this.red).call());
                    return;
                } catch (Exception e10) {
                    qVar.oscar(e10);
                    return;
                } catch (Throwable th4) {
                    qVar.oscar(new RuntimeException(th4));
                    return;
                }
            case 4:
                bravo();
                return;
            case 5:
                charlie();
                return;
            case 6:
                K1.f fVar = (K1.f) this.purple;
                T5.j jVar = (T5.j) this.red;
                Object obj3 = fVar.alpha;
                if (obj3 != null) {
                    jVar.juliet(obj3);
                    return;
                }
                return;
            case 7:
                com.google.common.util.concurrent.e eVar = (com.google.common.util.concurrent.e) this.purple;
                boolean isCancelled = eVar.isCancelled();
                C3207k c3207k = (C3207k) this.red;
                if (isCancelled) {
                    c3207k.delta(null);
                    return;
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    c3207k.resumeWith(Result.m206constructorimpl(V0.g.golf(eVar)));
                    return;
                } catch (ExecutionException e11) {
                    Throwable cause = e11.getCause();
                    if (cause != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(cause)));
                        return;
                    } else {
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
                        Intrinsics.kilo(kotlinNullPointerException, Intrinsics.class.getName());
                        throw kotlinNullPointerException;
                    }
                }
            case 8:
                ServiceConnectionC0716b serviceConnectionC0716b = (ServiceConnectionC0716b) this.red;
                com.google.android.gms.measurement.internal.G g2 = ((com.google.android.gms.measurement.internal.ay) serviceConnectionC0716b.charlie).bravo;
                com.google.android.gms.measurement.internal.E e12 = g2.f7508c;
                com.google.android.gms.measurement.internal.G.foxtrot(e12);
                e12.W();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", (String) serviceConnectionC0716b.bravo);
                try {
                    com.google.android.gms.internal.measurement.ab abVar = (com.google.android.gms.internal.measurement.ab) ((com.google.android.gms.internal.measurement.ad) this.purple);
                    Parcel ivory = abVar.ivory();
                    com.google.android.gms.internal.measurement.aa.charlie(ivory, bundle);
                    Parcel jade = abVar.jade(ivory, 1);
                    Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.aa.alpha(jade, Bundle.CREATOR);
                    jade.recycle();
                    if (bundle2 == null) {
                        com.google.android.gms.measurement.internal.ar arVar = g2.f7507b;
                        com.google.android.gms.measurement.internal.G.foxtrot(arVar);
                        arVar.white.alpha("Install Referrer Service returned a null response");
                    }
                } catch (Exception e13) {
                    com.google.android.gms.measurement.internal.ar arVar2 = g2.f7507b;
                    com.google.android.gms.measurement.internal.G.foxtrot(arVar2);
                    arVar2.white.bravo(e13.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                com.google.android.gms.measurement.internal.E e14 = g2.f7508c;
                com.google.android.gms.measurement.internal.G.foxtrot(e14);
                e14.W();
                throw new IllegalStateException("Unexpected call on client side");
            case 9:
                com.google.android.gms.measurement.internal.H0 mike = ((AppMeasurementDynamiteService) this.red).golf.mike();
                mike.W();
                mike.X();
                mike.n0(new D2.d(mike, mike.k0(false), (com.google.android.gms.internal.measurement.ao) this.purple, 11, false));
                return;
            case 10:
                C1459n0 c1459n0 = (C1459n0) this.red;
                c1459n0.W();
                c1459n0.X();
                Bundle bundle3 = (Bundle) this.purple;
                String string = bundle3.getString("name");
                V5.x.echo(string);
                com.google.android.gms.measurement.internal.G g5 = (com.google.android.gms.measurement.internal.G) c1459n0.alpha;
                if (!g5.alpha()) {
                    com.google.android.gms.measurement.internal.ar arVar3 = g5.f7507b;
                    com.google.android.gms.measurement.internal.G.foxtrot(arVar3);
                    arVar3.f7636g.alpha("Conditional property not cleared since app measurement is disabled");
                    return;
                } else {
                    zzqb zzqbVar = new zzqb(0L, null, string, "");
                    try {
                        com.google.android.gms.measurement.internal.d1 d1Var = g5.e;
                        com.google.android.gms.measurement.internal.G.delta(d1Var);
                        bundle3.getString("app_id");
                        g5.mike().e0(new zzai(bundle3.getString("app_id"), "", zzqbVar, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), d1Var.c0(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                        return;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
            case 11:
                ((C1459n0) this.red).s0((Boolean) this.purple, true);
                return;
            case 12:
                com.google.android.gms.measurement.internal.H0 h02 = (com.google.android.gms.measurement.internal.H0) this.red;
                com.google.android.gms.measurement.internal.ae aeVar = h02.silver;
                com.google.android.gms.measurement.internal.G g10 = (com.google.android.gms.measurement.internal.G) h02.alpha;
                if (aeVar == null) {
                    com.google.android.gms.measurement.internal.ar arVar4 = g10.f7507b;
                    com.google.android.gms.measurement.internal.G.foxtrot(arVar4);
                    arVar4.white.alpha("Failed to reset data on the service: not connected to service");
                    return;
                } else {
                    try {
                        aeVar.foxtrot((zzr) this.purple);
                    } catch (RemoteException e15) {
                        com.google.android.gms.measurement.internal.ar arVar5 = g10.f7507b;
                        com.google.android.gms.measurement.internal.G.foxtrot(arVar5);
                        arVar5.white.bravo(e15, "Failed to reset data on the service: remote exception");
                    }
                    h02.m0();
                    return;
                }
            case 13:
                com.google.android.gms.measurement.internal.H0 h03 = (com.google.android.gms.measurement.internal.H0) this.red;
                com.google.android.gms.measurement.internal.ae aeVar2 = h03.silver;
                com.google.android.gms.measurement.internal.G g11 = (com.google.android.gms.measurement.internal.G) h03.alpha;
                if (aeVar2 == null) {
                    com.google.android.gms.measurement.internal.ar arVar6 = g11.f7507b;
                    com.google.android.gms.measurement.internal.G.foxtrot(arVar6);
                    arVar6.white.alpha("Failed to send current screen to service");
                    return;
                }
                try {
                    C1474v0 c1474v0 = (C1474v0) this.purple;
                    if (c1474v0 == null) {
                        aeVar2.black(null, null, g11.alpha.getPackageName(), 0L);
                    } else {
                        aeVar2.black(c1474v0.alpha, c1474v0.bravo, g11.alpha.getPackageName(), c1474v0.charlie);
                    }
                    h03.m0();
                    return;
                } catch (RemoteException e16) {
                    com.google.android.gms.measurement.internal.ar arVar7 = ((com.google.android.gms.measurement.internal.G) h03.alpha).f7507b;
                    com.google.android.gms.measurement.internal.G.foxtrot(arVar7);
                    arVar7.white.bravo(e16, "Failed to send current screen to the service");
                    return;
                }
            case 14:
                delta();
                return;
            case 15:
                com.google.android.gms.measurement.internal.H0 h04 = ((com.google.android.gms.measurement.internal.G0) this.red).charlie;
                h04.silver = null;
                if (((com.google.android.gms.measurement.internal.G) h04.alpha).yellow.j0(null, com.google.android.gms.measurement.internal.ac.f7599h0) && ((ConnectionResult) this.purple).purple == 7777) {
                    if (h04.yellow == null) {
                        h04.yellow = Executors.newScheduledThreadPool(1);
                    }
                    h04.yellow.schedule(new F6.b(21, this), ((Long) com.google.android.gms.measurement.internal.ac.peach.alpha(null)).longValue(), TimeUnit.MILLISECONDS);
                    return;
                }
                h04.l0();
                return;
            case 16:
                com.google.android.gms.measurement.internal.Z0 z02 = (com.google.android.gms.measurement.internal.Z0) this.purple;
                z02.echo();
                z02.u().W();
                if (z02.f7545i == null) {
                    z02.f7545i = new ArrayList();
                }
                z02.f7545i.add((Runnable) this.red);
                z02.navy();
                return;
            case 17:
                ((com.google.mlkit.common.sdkinternal.k) this.purple).zzb((G6.h) this.red);
                return;
            case 18:
                ((Application) this.purple).unregisterActivityLifecycleCallbacks((C1684d) this.red);
                return;
            case 19:
                ((bj.d) this.purple).accept(this.red);
                return;
            default:
                Nd.c delta = J6.delta((vg.v) this.purple);
                Result.Companion companion3 = Result.INSTANCE;
                delta.resumeWith(Result.m206constructorimpl(ResultKt.createFailure((Throwable) this.red)));
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.alpha) {
            case 0:
                C2664h c2664h = new C2664h(E.class.getSimpleName());
                gd.a aVar = new gd.a(8);
                ((gd.a) c2664h.delta).red = aVar;
                c2664h.delta = aVar;
                aVar.purple = (Z7) this.red;
                return c2664h.toString();
            case 4:
                Runnable runnable = (Runnable) this.purple;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i4 = ((J7.j) this.red).red;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                str = BuildConfig.TRAVIS;
                            } else {
                                str = "RUNNING";
                            }
                        } else {
                            str = "QUEUED";
                        }
                    } else {
                        str = "QUEUING";
                    }
                } else {
                    str = "IDLE";
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ E(int i4, Object obj, Object obj2, boolean z2) {
        this.alpha = i4;
        this.red = obj;
        this.purple = obj2;
    }

    public E(ServiceConnectionC0716b serviceConnectionC0716b, com.google.android.gms.internal.measurement.ad adVar, ServiceConnectionC0716b serviceConnectionC0716b2) {
        this.alpha = 8;
        this.purple = adVar;
        this.red = serviceConnectionC0716b;
    }

    public E(J7.j jVar) {
        this.alpha = 4;
        this.red = jVar;
    }
}
