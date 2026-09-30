package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.i1;
import ao.ad;
import av.ah;
import bd.ThreadFactoryC0751d;
import id.C1915c;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class l {
    public static final boolean hotel = Log.isLoggable("Engine", 2);
    public final V8.c alpha;
    public final r6.u bravo;
    public final H3.c charlie;
    public final i1 delta;
    public final Pf.j echo;
    public final B0.a foxtrot;
    public final J2.n golf;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, J2.n] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, androidx.appcompat.widget.i1] */
    public l(H3.c cVar, D8.c cVar2, I3.e eVar, I3.e eVar2, I3.e eVar3, I3.e eVar4) {
        this.charlie = cVar;
        com.google.android.gms.common.f fVar = new com.google.android.gms.common.f(cVar2);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0751d(1));
        ?? obj = new Object();
        obj.purple = new HashMap();
        obj.red = new ReferenceQueue();
        obj.alpha = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new F6.b(18, (Object) obj));
        this.golf = obj;
        synchronized (this) {
            synchronized (obj) {
                obj.silver = this;
            }
        }
        this.bravo = new r6.u(18);
        this.alpha = new V8.c(2);
        ?? obj2 = new Object();
        obj2.golf = Z3.d.alpha(150, new ah(15, (Object) obj2));
        obj2.bravo = eVar;
        obj2.alpha = eVar2;
        obj2.charlie = eVar3;
        obj2.delta = eVar4;
        obj2.echo = this;
        obj2.foxtrot = this;
        this.delta = obj2;
        this.foxtrot = new B0.a(fVar);
        this.echo = new Pf.j();
        cVar.delta = this;
    }

    public static void delta(String str, long j5, q qVar) {
        StringBuilder beige = ad.beige(str, " in ");
        beige.append(Y3.h.alpha(j5));
        beige.append("ms, key: ");
        beige.append(qVar);
        Log.v("Engine", beige.toString());
    }

    public static void golf(w wVar) {
        if (wVar instanceof r) {
            ((r) wVar).charlie();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final C1915c alpha(com.bumptech.glide.f fVar, Object obj, E3.f fVar2, int i4, int i5, Class cls, Class cls2, com.bumptech.glide.g gVar, k kVar, Y3.c cVar, boolean z2, boolean z10, E3.i iVar, boolean z11, boolean z12, U3.h hVar, Executor executor) {
        long j5;
        if (hotel) {
            int i10 = Y3.h.bravo;
            j5 = SystemClock.elapsedRealtimeNanos();
        } else {
            j5 = 0;
        }
        this.bravo.getClass();
        q qVar = new q(obj, fVar2, i4, i5, cVar, cls, cls2, iVar);
        synchronized (this) {
            try {
                r charlie = charlie(qVar, z11, j5);
                if (charlie == null) {
                    return hotel(fVar, obj, fVar2, i4, i5, cls, cls2, gVar, kVar, cVar, z2, z10, iVar, z11, z12, hVar, executor, qVar, j5);
                }
                hVar.hotel(charlie, E3.a.teal, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r bravo(q qVar) {
        r rVar;
        Object obj;
        l lVar;
        q qVar2;
        H3.c cVar = this.charlie;
        synchronized (cVar) {
            try {
                Y3.i iVar = (Y3.i) ((LinkedHashMap) cVar.charlie).remove(qVar);
                rVar = null;
                if (iVar == null) {
                    obj = null;
                } else {
                    cVar.bravo -= iVar.bravo;
                    obj = iVar.alpha;
                }
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                throw th;
            }
        }
        w wVar = (w) obj;
        if (wVar != null) {
            if (wVar instanceof r) {
                rVar = (r) wVar;
            } else {
                lVar = this;
                qVar2 = qVar;
                rVar = new r(wVar, true, true, qVar2, lVar);
                if (rVar != null) {
                    rVar.alpha();
                    lVar.golf.hotel(qVar2, rVar);
                }
                return rVar;
            }
        }
        lVar = this;
        qVar2 = qVar;
        if (rVar != null) {
        }
        return rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r charlie(q qVar, boolean z2, long j5) {
        r rVar;
        if (z2) {
            J2.n nVar = this.golf;
            synchronized (nVar) {
                a aVar = (a) ((HashMap) nVar.purple).get(qVar);
                if (aVar == null) {
                    rVar = null;
                } else {
                    rVar = (r) aVar.get();
                    if (rVar == null) {
                        nVar.india(aVar);
                    }
                }
            }
            if (rVar != null) {
                rVar.alpha();
            }
            if (rVar != null) {
                if (hotel) {
                    delta("Loaded resource from active resources", j5, qVar);
                }
                return rVar;
            }
            r bravo = bravo(qVar);
            if (bravo != null) {
                if (hotel) {
                    delta("Loaded resource from cache", j5, qVar);
                }
                return bravo;
            }
        }
        return null;
    }

    public final synchronized void echo(p pVar, q qVar, r rVar) {
        if (rVar != null) {
            try {
                if (rVar.alpha) {
                    this.golf.hotel(qVar, rVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        V8.c cVar = this.alpha;
        cVar.getClass();
        pVar.getClass();
        HashMap hashMap = cVar.alpha;
        if (pVar.equals(hashMap.get(qVar))) {
            hashMap.remove(qVar);
        }
    }

    public final void foxtrot(q qVar, r rVar) {
        J2.n nVar = this.golf;
        synchronized (nVar) {
            a aVar = (a) ((HashMap) nVar.purple).remove(qVar);
            if (aVar != null) {
                aVar.charlie = null;
                aVar.clear();
            }
        }
        if (rVar.alpha) {
        } else {
            this.echo.romeo(rVar, false);
        }
    }

    public final C1915c hotel(com.bumptech.glide.f fVar, Object obj, E3.f fVar2, int i4, int i5, Class cls, Class cls2, com.bumptech.glide.g gVar, k kVar, Y3.c cVar, boolean z2, boolean z10, E3.i iVar, boolean z11, boolean z12, U3.h hVar, Executor executor, q qVar, long j5) {
        p pVar = (p) this.alpha.alpha.get(qVar);
        if (pVar != null) {
            pVar.alpha(hVar, executor);
            if (hotel) {
                delta("Added to existing load", j5, qVar);
            }
            return new C1915c(this, hVar, pVar);
        }
        p pVar2 = (p) ((J2.t) this.delta.golf).charlie();
        synchronized (pVar2) {
            pVar2.f3593d = qVar;
            pVar2.e = z11;
            pVar2.f3594f = z12;
        }
        B0.a aVar = this.foxtrot;
        i iVar2 = (i) ((J2.t) aVar.delta).charlie();
        int i10 = aVar.bravo;
        aVar.bravo = i10 + 1;
        f fVar3 = iVar2.alpha;
        fVar3.charlie = fVar;
        fVar3.delta = obj;
        fVar3.november = fVar2;
        fVar3.echo = i4;
        fVar3.foxtrot = i5;
        fVar3.papa = kVar;
        fVar3.golf = cls;
        fVar3.hotel = iVar2.silver;
        fVar3.kilo = cls2;
        fVar3.oscar = gVar;
        fVar3.india = iVar;
        fVar3.juliet = cVar;
        fVar3.quebec = z2;
        fVar3.romeo = z10;
        iVar2.f3566a = fVar;
        iVar2.f3567b = fVar2;
        iVar2.f3568c = gVar;
        iVar2.f3569d = qVar;
        iVar2.e = i4;
        iVar2.f3570f = i5;
        iVar2.f3571g = kVar;
        iVar2.f3572h = iVar;
        iVar2.f3573i = pVar2;
        iVar2.f3574j = i10;
        iVar2.f3588x = 1;
        iVar2.f3576l = obj;
        V8.c cVar2 = this.alpha;
        cVar2.getClass();
        cVar2.alpha.put(qVar, pVar2);
        pVar2.alpha(hVar, executor);
        pVar2.kilo(iVar2);
        if (hotel) {
            delta("Started new load", j5, qVar);
        }
        return new C1915c(this, hVar, pVar2);
    }
}
