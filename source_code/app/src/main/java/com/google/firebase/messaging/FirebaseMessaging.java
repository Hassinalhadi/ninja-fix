package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.lifecycle.RunnableC0643m;
import av.ah;
import av.ao;
import av.ax;
import com.clevertap.android.sdk.CallableC1002r;
import com.google.android.gms.measurement.internal.C1457m0;
import com.google.android.gms.tasks.Task;
import f6.ThreadFactoryC1693a;
import f8.InterfaceC1697c;
import i8.InterfaceC1904b;
import j8.InterfaceC1947d;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s6.AbstractC2629d0;
import s6.AbstractC2638e0;
import s6.AbstractC2647f0;
import s6.V4;

/* loaded from: classes2.dex */
public class FirebaseMessaging {
    public static ah kilo;
    public static ScheduledThreadPoolExecutor mike;
    public final B7.g alpha;
    public final Context bravo;
    public final ao charlie;
    public final i delta;
    public final C3.d echo;
    public final ScheduledThreadPoolExecutor foxtrot;
    public final ThreadPoolExecutor golf;
    public final S.j hotel;
    public boolean india;
    public static final long juliet = TimeUnit.HOURS.toSeconds(8);
    public static InterfaceC1904b lima = new E8.h(7);

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, S.j] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, av.ao] */
    public FirebaseMessaging(B7.g gVar, InterfaceC1904b interfaceC1904b, InterfaceC1904b interfaceC1904b2, InterfaceC1947d interfaceC1947d, InterfaceC1904b interfaceC1904b3, InterfaceC1697c interfaceC1697c) {
        final int i4 = 1;
        final int i5 = 0;
        gVar.alpha();
        Context context = gVar.alpha;
        ?? obj = new Object();
        obj.bravo = 0;
        obj.charlie = context;
        gVar.alpha();
        S5.a aVar = new S5.a(gVar.alpha);
        ?? obj2 = new Object();
        obj2.alpha = gVar;
        obj2.purple = obj;
        obj2.red = aVar;
        obj2.silver = interfaceC1904b;
        obj2.teal = interfaceC1904b2;
        obj2.white = interfaceC1947d;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC1693a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1693a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1693a("Firebase-Messaging-File-Io"));
        this.india = false;
        lima = interfaceC1904b3;
        this.alpha = gVar;
        this.echo = new C3.d(this, interfaceC1697c);
        gVar.alpha();
        Context context2 = gVar.alpha;
        this.bravo = context2;
        C1457m0 c1457m0 = new C1457m0();
        this.hotel = obj;
        this.charlie = obj2;
        this.delta = new i(newSingleThreadExecutor);
        this.foxtrot = scheduledThreadPoolExecutor;
        this.golf = threadPoolExecutor;
        gVar.alpha();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c1457m0);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.j
            public final /* synthetic */ FirebaseMessaging purple;

            {
                this.purple = this;
            }

            private final void alpha() {
                FirebaseMessaging firebaseMessaging = this.purple;
                if (firebaseMessaging.echo.hotel() && firebaseMessaging.kilo(firebaseMessaging.foxtrot())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.india) {
                            firebaseMessaging.juliet(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                G6.q delta;
                int i10;
                switch (i5) {
                    case 0:
                        alpha();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.purple;
                        Context context3 = firebaseMessaging.bravo;
                        AbstractC2638e0.alpha(context3);
                        boolean india = firebaseMessaging.india();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences alpha = AbstractC2647f0.alpha(context3);
                            if (!alpha.contains("proxy_retention") || alpha.getBoolean("proxy_retention", false) != india) {
                                S5.a aVar2 = (S5.a) firebaseMessaging.charlie.red;
                                if (aVar2.charlie.oscar() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", india);
                                    S5.k charlie = S5.k.charlie(aVar2.bravo);
                                    synchronized (charlie) {
                                        i10 = charlie.alpha;
                                        charlie.alpha = i10 + 1;
                                    }
                                    delta = charlie.echo(new S5.j(i10, 4, bundle, 0));
                                } else {
                                    delta = V4.delta(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                delta.echo(new ap.a(1), new ax(context3, india));
                            }
                        }
                        if (firebaseMessaging.india()) {
                            firebaseMessaging.golf();
                            return;
                        }
                        return;
                }
            }
        });
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1693a("Firebase-Messaging-Topics-Io"));
        int i10 = u.juliet;
        V4.charlie(scheduledThreadPoolExecutor2, new CallableC1002r(context2, scheduledThreadPoolExecutor2, this, obj, obj2, 1)).echo(scheduledThreadPoolExecutor, new k(this, i5));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.j
            public final /* synthetic */ FirebaseMessaging purple;

            {
                this.purple = this;
            }

            private final void alpha() {
                FirebaseMessaging firebaseMessaging = this.purple;
                if (firebaseMessaging.echo.hotel() && firebaseMessaging.kilo(firebaseMessaging.foxtrot())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.india) {
                            firebaseMessaging.juliet(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                G6.q delta;
                int i102;
                switch (i4) {
                    case 0:
                        alpha();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.purple;
                        Context context3 = firebaseMessaging.bravo;
                        AbstractC2638e0.alpha(context3);
                        boolean india = firebaseMessaging.india();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences alpha = AbstractC2647f0.alpha(context3);
                            if (!alpha.contains("proxy_retention") || alpha.getBoolean("proxy_retention", false) != india) {
                                S5.a aVar2 = (S5.a) firebaseMessaging.charlie.red;
                                if (aVar2.charlie.oscar() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", india);
                                    S5.k charlie = S5.k.charlie(aVar2.bravo);
                                    synchronized (charlie) {
                                        i102 = charlie.alpha;
                                        charlie.alpha = i102 + 1;
                                    }
                                    delta = charlie.echo(new S5.j(i102, 4, bundle, 0));
                                } else {
                                    delta = V4.delta(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                delta.echo(new ap.a(1), new ax(context3, india));
                            }
                        }
                        if (firebaseMessaging.india()) {
                            firebaseMessaging.golf();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void bravo(Runnable runnable, long j5) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (mike == null) {
                    mike = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1693a("TAG"));
                }
                mike.schedule(runnable, j5, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging charlie() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(B7.g.charlie());
        }
        return firebaseMessaging;
    }

    public static synchronized ah delta(Context context) {
        ah ahVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (kilo == null) {
                    kilo = new ah(context);
                }
                ahVar = kilo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ahVar;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(B7.g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.bravo(FirebaseMessaging.class);
            V5.x.india(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String alpha() {
        Task task;
        p foxtrot = foxtrot();
        if (!kilo(foxtrot)) {
            return foxtrot.alpha;
        }
        String delta = S.j.delta(this.alpha);
        i iVar = this.delta;
        synchronized (iVar) {
            task = (Task) ((bv.e) iVar.bravo).get(delta);
            if (task != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + delta);
                }
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + delta);
                }
                ao aoVar = this.charlie;
                task = aoVar.quebec(aoVar.fuchsia(S.j.delta((B7.g) aoVar.alpha), "*", new Bundle())).november(this.golf, new A2.p(this, delta, foxtrot, 16)).foxtrot((ExecutorService) iVar.alpha, new A2.ao(28, iVar, delta));
                ((bv.e) iVar.bravo).put(delta, task);
            }
        }
        try {
            return (String) V4.bravo(task);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final G6.q echo() {
        G6.h hVar = new G6.h();
        this.foxtrot.execute(new RunnableC0643m(17, this, hVar));
        return hVar.alpha;
    }

    public final p foxtrot() {
        String delta;
        p bravo;
        ah delta2 = delta(this.bravo);
        B7.g gVar = this.alpha;
        gVar.alpha();
        if ("[DEFAULT]".equals(gVar.bravo)) {
            delta = "";
        } else {
            delta = gVar.delta();
        }
        String delta3 = S.j.delta(this.alpha);
        synchronized (delta2) {
            bravo = p.bravo(((SharedPreferences) delta2.purple).getString(delta + "|T|" + delta3 + "|*", null));
        }
        return bravo;
    }

    public final void golf() {
        G6.q delta;
        int i4;
        S5.a aVar = (S5.a) this.charlie.red;
        if (aVar.charlie.oscar() >= 241100000) {
            S5.k charlie = S5.k.charlie(aVar.bravo);
            Bundle bundle = Bundle.EMPTY;
            synchronized (charlie) {
                i4 = charlie.alpha;
                charlie.alpha = i4 + 1;
            }
            delta = charlie.echo(new S5.j(i4, 5, bundle, 1)).mike(S5.f.red, S5.c.red);
        } else {
            delta = V4.delta(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        delta.echo(this.foxtrot, new k(this, 1));
    }

    public final synchronized void hotel(boolean z2) {
        this.india = z2;
    }

    public final boolean india() {
        boolean z2;
        boolean z10;
        String notificationDelegate;
        Context context = this.bravo;
        AbstractC2638e0.alpha(context);
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
                return false;
            }
        } else {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "GMS core is set for proxying");
                    }
                    if (this.alpha.bravo(F7.b.class) != null || (AbstractC2629d0.alpha() && lima != null)) {
                        return true;
                    }
                }
            } else {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
        }
        return false;
    }

    public final synchronized void juliet(long j5) {
        bravo(new r(this, Math.min(Math.max(30L, 2 * j5), juliet)), j5);
        this.india = true;
    }

    public final boolean kilo(p pVar) {
        if (pVar != null) {
            String bravo = this.hotel.bravo();
            if (System.currentTimeMillis() <= pVar.charlie + p.delta && bravo.equals(pVar.bravo)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
