package E8;

import F8.m;
import F8.o;
import F8.p;
import J2.l;
import android.app.Application;
import android.content.Context;
import androidx.appcompat.widget.P0;
import av.q;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import i8.InterfaceC1904b;
import j8.InterfaceC1947d;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import s6.V4;

/* loaded from: classes2.dex */
public final class j implements H8.a {
    public static final Random juliet = new Random();
    public static final HashMap kilo = new HashMap();
    public final Context bravo;
    public final ScheduledExecutorService charlie;
    public final B7.g delta;
    public final InterfaceC1947d echo;
    public final C7.b foxtrot;
    public final InterfaceC1904b golf;
    public final String hotel;
    public final HashMap alpha = new HashMap();
    public final HashMap india = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [T5.c, java.lang.Object] */
    public j(Context context, ScheduledExecutorService scheduledExecutorService, B7.g gVar, InterfaceC1947d interfaceC1947d, C7.b bVar, InterfaceC1904b interfaceC1904b) {
        this.bravo = context;
        this.charlie = scheduledExecutorService;
        this.delta = gVar;
        this.echo = interfaceC1947d;
        this.foxtrot = bVar;
        this.golf = interfaceC1904b;
        gVar.alpha();
        this.hotel = gVar.charlie.bravo;
        AtomicReference atomicReference = i.alpha;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = i.alpha;
        if (atomicReference2.get() == null) {
            ?? obj = new Object();
            while (true) {
                if (atomicReference2.compareAndSet(null, obj)) {
                    T5.d.bravo(application);
                    T5.d.teal.alpha(obj);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        V4.charlie(scheduledExecutorService, new g(0, this));
    }

    public final synchronized b alpha(B7.g gVar, String str, InterfaceC1947d interfaceC1947d, C7.b bVar, Executor executor, F8.e eVar, F8.e eVar2, F8.e eVar3, F8.j jVar, F8.k kVar, o oVar, com.google.firebase.messaging.o oVar2) {
        String str2;
        C7.b bVar2;
        try {
            if (!this.alpha.containsKey(str)) {
                Context context = this.bravo;
                if (str.equals("firebase")) {
                    try {
                        gVar.alpha();
                        if (gVar.bravo.equals("[DEFAULT]")) {
                            bVar2 = bVar;
                            str2 = str;
                            b bVar3 = new b(context, bVar2, executor, eVar, eVar2, eVar3, jVar, kVar, oVar, echo(gVar, interfaceC1947d, jVar, eVar2, this.bravo, str, oVar), oVar2);
                            eVar2.bravo();
                            eVar3.bravo();
                            eVar.bravo();
                            this.alpha.put(str2, bVar3);
                            kilo.put(str2, bVar3);
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                bVar2 = null;
                str2 = str;
                b bVar32 = new b(context, bVar2, executor, eVar, eVar2, eVar3, jVar, kVar, oVar, echo(gVar, interfaceC1947d, jVar, eVar2, this.bravo, str, oVar), oVar2);
                eVar2.bravo();
                eVar3.bravo();
                eVar.bravo();
                this.alpha.put(str2, bVar32);
                kilo.put(str2, bVar32);
            } else {
                str2 = str;
            }
            return (b) this.alpha.get(str2);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0065 A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #2 {all -> 0x006e, blocks: (B:21:0x0054, B:23:0x005c, B:7:0x0065), top: B:20:0x0054 }] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, com.google.firebase.messaging.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized b bravo(String str) {
        Throwable th;
        w.o oVar;
        try {
            try {
                F8.e charlie = charlie(str, "fetch");
                F8.e charlie2 = charlie(str, "activate");
                F8.e charlie3 = charlie(str, "defaults");
                o oVar2 = new o(this.bravo.getSharedPreferences("frc_" + this.hotel + "_" + str + "_settings", 0));
                F8.k kVar = new F8.k(this.charlie, charlie2, charlie3);
                B7.g gVar = this.delta;
                InterfaceC1904b interfaceC1904b = this.golf;
                gVar.alpha();
                if (gVar.bravo.equals("[DEFAULT]")) {
                    try {
                        if (str.equals("firebase")) {
                            oVar = new w.o(interfaceC1904b);
                            if (oVar != null) {
                                kVar.alpha(new f(oVar));
                            }
                            w.o oVar3 = new w.o(7, false);
                            oVar3.purple = charlie2;
                            oVar3.red = charlie3;
                            ?? obj = new Object();
                            obj.delta = Collections.newSetFromMap(new ConcurrentHashMap());
                            obj.alpha = charlie2;
                            obj.bravo = oVar3;
                            ScheduledExecutorService scheduledExecutorService = this.charlie;
                            obj.charlie = scheduledExecutorService;
                            return alpha(this.delta, str, this.echo, this.foxtrot, scheduledExecutorService, charlie, charlie2, charlie3, delta(str, charlie, oVar2), kVar, oVar2, obj);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                oVar = null;
                if (oVar != null) {
                }
                w.o oVar32 = new w.o(7, false);
                oVar32.purple = charlie2;
                oVar32.red = charlie3;
                ?? obj2 = new Object();
                obj2.delta = Collections.newSetFromMap(new ConcurrentHashMap());
                obj2.alpha = charlie2;
                obj2.bravo = oVar32;
                ScheduledExecutorService scheduledExecutorService2 = this.charlie;
                obj2.charlie = scheduledExecutorService2;
                return alpha(this.delta, str, this.echo, this.foxtrot, scheduledExecutorService2, charlie, charlie2, charlie3, delta(str, charlie, oVar2), kVar, oVar2, obj2);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final F8.e charlie(String str, String str2) {
        p pVar;
        String gold = P0.gold(q.india("frc_", this.hotel, "_", str, "_"), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.charlie;
        Context context = this.bravo;
        HashMap hashMap = p.charlie;
        synchronized (p.class) {
            try {
                HashMap hashMap2 = p.charlie;
                if (!hashMap2.containsKey(gold)) {
                    hashMap2.put(gold, new p(context, gold));
                }
                pVar = (p) hashMap2.get(gold);
            } catch (Throwable th) {
                throw th;
            }
        }
        return F8.e.delta(scheduledExecutorService, pVar);
    }

    public final synchronized F8.j delta(String str, F8.e eVar, o oVar) {
        InterfaceC1947d interfaceC1947d;
        InterfaceC1904b hVar;
        InterfaceC1904b interfaceC1904b;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str2;
        B7.g gVar;
        try {
            interfaceC1947d = this.echo;
            B7.g gVar2 = this.delta;
            gVar2.alpha();
            if (gVar2.bravo.equals("[DEFAULT]")) {
                hVar = this.golf;
            } else {
                hVar = new h(0);
            }
            interfaceC1904b = hVar;
            scheduledExecutorService = this.charlie;
            random = juliet;
            B7.g gVar3 = this.delta;
            gVar3.alpha();
            str2 = gVar3.charlie.alpha;
            gVar = this.delta;
            gVar.alpha();
        } catch (Throwable th) {
            throw th;
        }
        return new F8.j(interfaceC1947d, interfaceC1904b, scheduledExecutorService, random, eVar, new ConfigFetchHttpClient(this.bravo, gVar.charlie.bravo, str2, str, oVar.alpha.getLong("fetch_timeout_in_seconds", 60L), oVar.alpha.getLong("fetch_timeout_in_seconds", 60L)), oVar, this.india);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [J2.l, java.lang.Object] */
    public final synchronized l echo(B7.g gVar, InterfaceC1947d interfaceC1947d, F8.j jVar, F8.e eVar, Context context, String str, o oVar) {
        ?? obj;
        ScheduledExecutorService scheduledExecutorService = this.charlie;
        obj = new Object();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        obj.alpha = linkedHashSet;
        obj.purple = new m(gVar, interfaceC1947d, jVar, eVar, context, str, linkedHashSet, oVar, scheduledExecutorService);
        return obj;
    }
}
