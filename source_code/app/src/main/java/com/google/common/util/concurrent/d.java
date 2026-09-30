package com.google.common.util.concurrent;

import A2.z;
import G6.g;
import G6.i;
import G6.n;
import J2.p;
import T5.ah;
import T5.ai;
import T5.aj;
import T5.r;
import V5.h;
import V5.x;
import Y3.l;
import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.StrictMode;
import android.util.Log;
import bd.ExecutorC0748a;
import com.bumptech.glide.load.resource.bitmap.u;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.android.gms.measurement.internal.AbstractC1452k;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.C1459n0;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.G0;
import com.google.android.gms.measurement.internal.H0;
import com.google.android.gms.measurement.internal.K0;
import com.google.android.gms.measurement.internal.Q;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.ae;
import com.google.android.gms.measurement.internal.ar;
import com.google.android.gms.measurement.internal.zzov;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.material.internal.s;
import com.google.android.play.core.integrity.k;
import com.google.mlkit.common.MlKitException;
import f1.C1684d;
import i1.AbstractC1881b;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import s6.Z;
import vf.C3194A;
import vf.C3207k;
import w.o;

/* loaded from: classes2.dex */
public final class d implements Runnable {
    public final /* synthetic */ int alpha;
    public final Object purple;
    public final Object red;

    public /* synthetic */ d(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    private final void alpha() {
        ScheduledExecutorService scheduledExecutorService;
        G0 g02 = (G0) this.red;
        synchronized (g02) {
            try {
                g02.alpha = false;
                H0 h02 = g02.charlie;
                if (!h02.g0()) {
                    ar arVar = ((G) h02.alpha).f7507b;
                    G.foxtrot(arVar);
                    arVar.f7635f.alpha("Connected to remote service");
                    ae aeVar = (ae) this.purple;
                    h02.W();
                    h02.silver = aeVar;
                    h02.m0();
                    h02.l0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        H0 h03 = ((G0) this.red).charlie;
        if (((G) h03.alpha).yellow.j0(null, ac.f7599h0) && (scheduledExecutorService = h03.yellow) != null) {
            scheduledExecutorService.shutdownNow();
            h03.yellow = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, T5.h] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, T5.h] */
    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        boolean z2 = false;
        switch (this.alpha) {
            case 0:
                J2.e eVar = (J2.e) this.red;
                try {
                    Z.alpha((e) this.purple);
                    C1459n0 c1459n0 = (C1459n0) eVar.red;
                    c1459n0.W();
                    eVar.N();
                    c1459n0.f7674b = false;
                    c1459n0.f7675c = 1;
                    ar arVar = ((G) c1459n0.alpha).f7507b;
                    G.foxtrot(arVar);
                    arVar.f7635f.bravo(((zzov) eVar.purple).alpha, "Successfully registered trigger URI");
                    c1459n0.k0();
                    return;
                } catch (Error e) {
                    e = e;
                    eVar.b(e);
                    return;
                } catch (RuntimeException e4) {
                    e = e4;
                    eVar.b(e);
                    return;
                } catch (ExecutionException e5) {
                    eVar.b(e5.getCause());
                    return;
                }
            case 1:
                z echo = z.echo();
                String str = C2.a.echo;
                StringBuilder sb2 = new StringBuilder("Scheduling work ");
                p pVar = (p) this.purple;
                sb2.append(pVar.alpha);
                echo.alpha(str, sb2.toString());
                ((C2.a) this.red).alpha.alpha(pVar);
                return;
            case 2:
                synchronized (((n) this.red).red) {
                    ((G6.e) ((n) this.red).silver).onComplete((Task) this.purple);
                }
                return;
            case 3:
                n nVar = (n) this.red;
                try {
                    Task then = ((g) nVar.red).then(((Task) this.purple).hotel());
                    if (then == null) {
                        nVar.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC0748a executorC0748a = i.bravo;
                    then.echo(executorC0748a, nVar);
                    then.delta(executorC0748a, nVar);
                    then.alpha(executorC0748a, nVar);
                    return;
                } catch (RuntimeExecutionException e10) {
                    if (e10.getCause() instanceof Exception) {
                        nVar.onFailure((Exception) e10.getCause());
                        return;
                    } else {
                        nVar.onFailure(e10);
                        return;
                    }
                } catch (CancellationException unused) {
                    nVar.alpha();
                    return;
                } catch (Exception e11) {
                    nVar.onFailure(e11);
                    return;
                }
            case 4:
                I3.c cVar = (I3.c) this.red;
                if (cVar.silver) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.purple).run();
                    return;
                } catch (Throwable th) {
                    cVar.red.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 5:
                u alpha = u.alpha();
                alpha.getClass();
                l.alpha();
                alpha.delta.set(true);
                ((R3.d) this.red).purple.purple = true;
                ((R3.d) this.red).alpha.getViewTreeObserver().removeOnDrawListener((R3.d) this.purple);
                ((R3.d) this.red).purple.alpha.clear();
                return;
            case 6:
                O7.u uVar = (O7.u) this.red;
                r rVar = (r) ((T5.e) uVar.foxtrot).juliet.get((T5.b) uVar.charlie);
                if (rVar != null) {
                    ConnectionResult connectionResult = (ConnectionResult) this.purple;
                    if (connectionResult.o()) {
                        uVar.alpha = true;
                        com.google.android.gms.common.api.c cVar2 = (com.google.android.gms.common.api.c) uVar.bravo;
                        if (cVar2.lima()) {
                            if (uVar.alpha && (hVar = (h) uVar.delta) != null) {
                                cVar2.kilo(hVar, (Set) uVar.echo);
                                return;
                            }
                            return;
                        }
                        try {
                            cVar2.kilo(null, cVar2.alpha());
                            return;
                        } catch (SecurityException e12) {
                            Log.e("GoogleApiManager", "Failed to get service from broker. ", e12);
                            cVar2.bravo("Failed to get service from broker.");
                            rVar.oscar(new ConnectionResult(10), null);
                            return;
                        }
                    }
                    rVar.oscar(connectionResult, null);
                    return;
                }
                return;
            case 7:
                if (((aj) this.red).purple) {
                    ConnectionResult connectionResult2 = ((ah) this.purple).bravo;
                    if (connectionResult2.purple != 0 && connectionResult2.red != null) {
                        aj ajVar = (aj) this.red;
                        ?? r4 = ajVar.alpha;
                        Activity alpha2 = ajVar.alpha();
                        PendingIntent pendingIntent = connectionResult2.red;
                        x.hotel(pendingIntent);
                        int i4 = ((ah) this.purple).alpha;
                        int i5 = GoogleApiActivity.purple;
                        Intent intent = new Intent(alpha2, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i4);
                        intent.putExtra("notify_manager", false);
                        r4.startActivityForResult(intent, 1);
                        return;
                    }
                    aj ajVar2 = (aj) this.red;
                    if (ajVar2.teal.getErrorResolutionIntent(ajVar2.alpha(), connectionResult2.purple, null) != null) {
                        aj ajVar3 = (aj) this.red;
                        ajVar3.teal.zag(ajVar3.alpha(), ajVar3.alpha, connectionResult2.purple, 2, (aj) this.red);
                        return;
                    } else {
                        if (connectionResult2.purple == 18) {
                            aj ajVar4 = (aj) this.red;
                            Dialog zab = ajVar4.teal.zab(ajVar4.alpha(), ajVar4);
                            aj ajVar5 = (aj) this.red;
                            ajVar5.teal.zac(ajVar5.alpha().getApplicationContext(), new ai(this, zab));
                            return;
                        }
                        aj ajVar6 = (aj) this.red;
                        int i10 = ((ah) this.purple).alpha;
                        ajVar6.red.set(null);
                        ajVar6.hotel(connectionResult2, i10);
                        return;
                    }
                }
                return;
            case 8:
                Q q4 = (Q) this.purple;
                q4.victor();
                if (r6.u.mike()) {
                    q4.u().g0(this);
                    return;
                }
                AbstractC1452k abstractC1452k = (AbstractC1452k) this.red;
                if (abstractC1452k.charlie != 0) {
                    z2 = true;
                }
                abstractC1452k.charlie = 0L;
                if (z2) {
                    abstractC1452k.bravo();
                    return;
                }
                return;
            case 9:
                G g2 = (G) ((C1459n0) this.purple).alpha;
                com.google.android.gms.measurement.internal.aj india = g2.india();
                String str2 = india.f7630k;
                String str3 = (String) this.red;
                if (str2 != null && !str2.equals(str3)) {
                    z2 = true;
                }
                india.f7630k = str3;
                if (z2) {
                    g2.india().e0();
                    return;
                }
                return;
            case 10:
                C1459n0 c1459n02 = ((AppMeasurementDynamiteService) this.red).golf.f7513i;
                G.echo(c1459n02);
                o oVar = (o) this.purple;
                c1459n02.W();
                c1459n02.X();
                o oVar2 = c1459n02.silver;
                if (oVar != oVar2) {
                    if (oVar2 == null) {
                        z2 = true;
                    }
                    x.juliet("EventInterceptor already set.", z2);
                }
                c1459n02.silver = oVar;
                return;
            case 11:
                alpha();
                return;
            case 12:
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((K0) ((Service) ((av.ah) this.purple).purple)).charlie((JobParameters) this.red);
                return;
            case 13:
                Callable callable = (Callable) this.purple;
                G6.h hVar2 = (G6.h) this.red;
                try {
                    hVar2.bravo(callable.call());
                    return;
                } catch (MlKitException e13) {
                    hVar2.alpha(e13);
                    return;
                } catch (Exception e14) {
                    hVar2.alpha(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e14));
                    return;
                }
            case 14:
                ((C1684d) this.purple).alpha = this.red;
                return;
            case 15:
                AbstractC1881b abstractC1881b = (AbstractC1881b) ((s) this.purple).purple;
                if (abstractC1881b != null) {
                    abstractC1881b.juliet((Typeface) this.red);
                    return;
                }
                return;
            default:
                ((C3207k) this.red).beige((C3194A) this.purple, Unit.INSTANCE);
                return;
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 0:
                C1298c c1298c = new C1298c(d.class.getSimpleName());
                k kVar = new k(8, false);
                ((k) c1298c.silver).red = kVar;
                c1298c.silver = kVar;
                kVar.purple = (J2.e) this.red;
                return c1298c.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(int i4, Object obj, Object obj2, boolean z2) {
        this.alpha = i4;
        this.red = obj;
        this.purple = obj2;
    }
}
