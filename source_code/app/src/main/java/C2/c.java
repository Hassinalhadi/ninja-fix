package C2;

import A2.s;
import A2.z;
import B2.f;
import B2.h;
import F2.j;
import F2.n;
import H2.l;
import J2.e;
import J2.p;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import s6.P5;
import vf.I;

/* loaded from: classes3.dex */
public final class c implements h, j, B2.c {

    /* renamed from: h, reason: collision with root package name */
    public static final String f777h = z.golf("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final e f778a;
    public final Context alpha;

    /* renamed from: b, reason: collision with root package name */
    public final A2.a f779b;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f781d;
    public final n e;

    /* renamed from: f, reason: collision with root package name */
    public final L2.a f782f;

    /* renamed from: g, reason: collision with root package name */
    public final d f783g;
    public final a red;
    public boolean silver;
    public final f yellow;
    public final HashMap purple = new HashMap();
    public final Object teal = new Object();
    public final J2.c white = new J2.c(new A2.h(1));

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f780c = new HashMap();

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, C2.d] */
    public c(Context context, A2.a aVar, l lVar, f fVar, e eVar, L2.a aVar2) {
        this.alpha = context;
        B2.b runnableScheduler = aVar.golf;
        this.red = new a(this, runnableScheduler, aVar.delta);
        Intrinsics.echo(runnableScheduler, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        ?? obj = new Object();
        obj.purple = runnableScheduler;
        obj.red = eVar;
        obj.alpha = millis;
        obj.silver = new Object();
        obj.teal = new LinkedHashMap();
        this.f783g = obj;
        this.f782f = aVar2;
        this.e = new n(lVar);
        this.f779b = aVar;
        this.yellow = fVar;
        this.f778a = eVar;
    }

    @Override // B2.h
    public final void alpha(p... pVarArr) {
        if (this.f781d == null) {
            this.f781d = Boolean.valueOf(K2.h.alpha(this.alpha, this.f779b));
        }
        if (!this.f781d.booleanValue()) {
            z.echo().foxtrot(f777h, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.silver) {
            this.yellow.alpha(this);
            this.silver = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            if (!this.white.kilo(P5.bravo(pVar))) {
                long max = Math.max(pVar.alpha(), golf(pVar));
                this.f779b.delta.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (pVar.bravo == 1) {
                    if (currentTimeMillis < max) {
                        a aVar = this.red;
                        if (aVar != null) {
                            HashMap hashMap = aVar.delta;
                            Runnable runnable = (Runnable) hashMap.remove(pVar.alpha);
                            B2.b bVar = aVar.bravo;
                            if (runnable != null) {
                                bVar.alpha.removeCallbacks(runnable);
                            }
                            com.google.common.util.concurrent.d dVar = new com.google.common.util.concurrent.d(1, aVar, pVar, false);
                            hashMap.put(pVar.alpha, dVar);
                            aVar.charlie.getClass();
                            bVar.alpha.postDelayed(dVar, max - System.currentTimeMillis());
                        }
                    } else if (pVar.charlie()) {
                        A2.d dVar2 = pVar.juliet;
                        int i4 = Build.VERSION.SDK_INT;
                        if (dVar2.delta) {
                            z.echo().alpha(f777h, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (i4 >= 24 && dVar2.alpha()) {
                            z.echo().alpha(f777h, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.alpha);
                        }
                    } else if (!this.white.kilo(P5.bravo(pVar))) {
                        z.echo().alpha(f777h, "Starting work for " + pVar.alpha);
                        J2.c cVar = this.white;
                        cVar.getClass();
                        B2.l beige = cVar.beige(P5.bravo(pVar));
                        this.f783g.charlie(beige);
                        e eVar = this.f778a;
                        eVar.getClass();
                        ((L2.c) ((L2.a) eVar.red)).alpha(new s(eVar, beige, null, 6));
                    }
                }
            }
        }
        synchronized (this.teal) {
            try {
                if (!hashSet.isEmpty()) {
                    z.echo().alpha(f777h, "Starting tracking for " + TextUtils.join(Constants.SEPARATOR_COMMA, hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        p pVar2 = (p) it.next();
                        J2.j bravo = P5.bravo(pVar2);
                        if (!this.purple.containsKey(bravo)) {
                            this.purple.put(bravo, F2.p.alpha(this.e, pVar2, ((L2.c) this.f782f).bravo, this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B2.h
    public final boolean bravo() {
        return false;
    }

    @Override // B2.c
    public final void charlie(J2.j jVar, boolean z2) {
        B2.l zulu = this.white.zulu(jVar);
        if (zulu != null) {
            this.f783g.alpha(zulu);
        }
        foxtrot(jVar);
        if (!z2) {
            synchronized (this.teal) {
                this.f780c.remove(jVar);
            }
        }
    }

    @Override // B2.h
    public final void delta(String str) {
        Runnable runnable;
        if (this.f781d == null) {
            this.f781d = Boolean.valueOf(K2.h.alpha(this.alpha, this.f779b));
        }
        boolean booleanValue = this.f781d.booleanValue();
        String str2 = f777h;
        if (!booleanValue) {
            z.echo().foxtrot(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.silver) {
            this.yellow.alpha(this);
            this.silver = true;
        }
        z.echo().alpha(str2, "Cancelling work ID " + str);
        a aVar = this.red;
        if (aVar != null && (runnable = (Runnable) aVar.delta.remove(str)) != null) {
            aVar.bravo.alpha.removeCallbacks(runnable);
        }
        for (B2.l lVar : this.white.amber(str)) {
            this.f783g.alpha(lVar);
            e eVar = this.f778a;
            eVar.getClass();
            eVar.L(lVar, -512);
        }
    }

    @Override // F2.j
    public final void echo(p pVar, F2.c cVar) {
        J2.j bravo = P5.bravo(pVar);
        boolean z2 = cVar instanceof F2.a;
        e eVar = this.f778a;
        d dVar = this.f783g;
        String str = f777h;
        J2.c cVar2 = this.white;
        if (z2) {
            if (!cVar2.kilo(bravo)) {
                z.echo().alpha(str, "Constraints met: Scheduling work ID " + bravo);
                B2.l beige = cVar2.beige(bravo);
                dVar.charlie(beige);
                eVar.getClass();
                ((L2.c) ((L2.a) eVar.red)).alpha(new s(eVar, beige, null, 6));
                return;
            }
            return;
        }
        z.echo().alpha(str, "Constraints not met: Cancelling work ID " + bravo);
        B2.l zulu = cVar2.zulu(bravo);
        if (zulu != null) {
            dVar.alpha(zulu);
            int i4 = ((F2.b) cVar).alpha;
            eVar.getClass();
            eVar.L(zulu, i4);
        }
    }

    public final void foxtrot(J2.j jVar) {
        I i4;
        synchronized (this.teal) {
            i4 = (I) this.purple.remove(jVar);
        }
        if (i4 != null) {
            z.echo().alpha(f777h, "Stopping tracking for " + jVar);
            i4.foxtrot(null);
        }
    }

    public final long golf(p pVar) {
        long max;
        synchronized (this.teal) {
            try {
                J2.j bravo = P5.bravo(pVar);
                b bVar = (b) this.f780c.get(bravo);
                if (bVar == null) {
                    int i4 = pVar.kilo;
                    this.f779b.delta.getClass();
                    bVar = new b(i4, System.currentTimeMillis());
                    this.f780c.put(bravo, bVar);
                }
                max = (Math.max((pVar.kilo - bVar.alpha) - 5, 0) * OkHttpConstants.READ_TIMEOUT_MS) + bVar.bravo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return max;
    }
}
