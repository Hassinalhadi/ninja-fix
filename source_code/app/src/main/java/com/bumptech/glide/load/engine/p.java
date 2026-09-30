package com.bumptech.glide.load.engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class p implements Z3.b {

    /* renamed from: p, reason: collision with root package name */
    public static final g8.d f3589p = new g8.d(18);

    /* renamed from: a, reason: collision with root package name */
    public final I3.e f3590a;
    public final o alpha;

    /* renamed from: b, reason: collision with root package name */
    public final I3.e f3591b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f3592c;

    /* renamed from: d, reason: collision with root package name */
    public q f3593d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3594f;

    /* renamed from: g, reason: collision with root package name */
    public w f3595g;

    /* renamed from: h, reason: collision with root package name */
    public E3.a f3596h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3597i;

    /* renamed from: j, reason: collision with root package name */
    public GlideException f3598j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3599k;

    /* renamed from: l, reason: collision with root package name */
    public r f3600l;

    /* renamed from: m, reason: collision with root package name */
    public i f3601m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f3602n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3603o;
    public final Z3.e purple;
    public final l red;
    public final J2.t silver;
    public final g8.d teal;
    public final l white;
    public final I3.e yellow;

    /* JADX WARN: Type inference failed for: r0v1, types: [Z3.e, java.lang.Object] */
    public p(I3.e eVar, I3.e eVar2, I3.e eVar3, I3.e eVar4, l lVar, l lVar2, J2.t tVar) {
        g8.d dVar = f3589p;
        this.alpha = new o(new ArrayList(2));
        this.purple = new Object();
        this.f3592c = new AtomicInteger();
        this.yellow = eVar;
        this.f3590a = eVar2;
        this.f3591b = eVar4;
        this.white = lVar;
        this.red = lVar2;
        this.silver = tVar;
        this.teal = dVar;
    }

    public final synchronized void alpha(U3.h hVar, Executor executor) {
        try {
            this.purple.alpha();
            o oVar = this.alpha;
            oVar.getClass();
            oVar.alpha.add(new n(hVar, executor));
            if (this.f3597i) {
                echo(1);
                executor.execute(new m(this, hVar, 1));
            } else if (this.f3599k) {
                echo(1);
                executor.execute(new m(this, hVar, 0));
            } else {
                Y3.f.alpha("Cannot add callbacks to a cancelled EngineJob", !this.f3602n);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void bravo() {
        if (foxtrot()) {
            return;
        }
        this.f3602n = true;
        i iVar = this.f3601m;
        iVar.f3585u = true;
        e eVar = iVar.f3583s;
        if (eVar != null) {
            eVar.cancel();
        }
        l lVar = this.white;
        q qVar = this.f3593d;
        synchronized (lVar) {
            V8.c cVar = lVar.alpha;
            cVar.getClass();
            HashMap hashMap = cVar.alpha;
            if (equals(hashMap.get(qVar))) {
                hashMap.remove(qVar);
            }
        }
    }

    @Override // Z3.b
    public final Z3.e charlie() {
        return this.purple;
    }

    public final void delta() {
        boolean z2;
        r rVar;
        synchronized (this) {
            try {
                this.purple.alpha();
                Y3.f.alpha("Not yet complete!", foxtrot());
                int decrementAndGet = this.f3592c.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Y3.f.alpha("Can't decrement below 0", z2);
                if (decrementAndGet == 0) {
                    rVar = this.f3600l;
                    india();
                } else {
                    rVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (rVar != null) {
            rVar.charlie();
        }
    }

    public final synchronized void echo(int i4) {
        r rVar;
        Y3.f.alpha("Not yet complete!", foxtrot());
        if (this.f3592c.getAndAdd(i4) == 0 && (rVar = this.f3600l) != null) {
            rVar.alpha();
        }
    }

    public final boolean foxtrot() {
        if (!this.f3599k && !this.f3597i && !this.f3602n) {
            return false;
        }
        return true;
    }

    public final void golf() {
        synchronized (this) {
            try {
                this.purple.alpha();
                if (this.f3602n) {
                    india();
                    return;
                }
                if (!this.alpha.alpha.isEmpty()) {
                    if (!this.f3599k) {
                        this.f3599k = true;
                        q qVar = this.f3593d;
                        o oVar = this.alpha;
                        oVar.getClass();
                        ArrayList arrayList = new ArrayList(oVar.alpha);
                        echo(arrayList.size() + 1);
                        this.white.echo(this, qVar, null);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            n nVar = (n) it.next();
                            nVar.bravo.execute(new m(this, nVar.alpha, 0));
                        }
                        delta();
                        return;
                    }
                    throw new IllegalStateException("Already failed once");
                }
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void hotel() {
        synchronized (this) {
            try {
                this.purple.alpha();
                if (this.f3602n) {
                    this.f3595g.bravo();
                    india();
                    return;
                }
                if (!this.alpha.alpha.isEmpty()) {
                    if (!this.f3597i) {
                        g8.d dVar = this.teal;
                        w wVar = this.f3595g;
                        boolean z2 = this.e;
                        q qVar = this.f3593d;
                        l lVar = this.red;
                        dVar.getClass();
                        this.f3600l = new r(wVar, z2, true, qVar, lVar);
                        this.f3597i = true;
                        o oVar = this.alpha;
                        oVar.getClass();
                        ArrayList arrayList = new ArrayList(oVar.alpha);
                        echo(arrayList.size() + 1);
                        this.white.echo(this, this.f3593d, this.f3600l);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            n nVar = (n) it.next();
                            nVar.bravo.execute(new m(this, nVar.alpha, 1));
                        }
                        delta();
                        return;
                    }
                    throw new IllegalStateException("Already have resource");
                }
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void india() {
        if (this.f3593d != null) {
            this.alpha.alpha.clear();
            this.f3593d = null;
            this.f3600l = null;
            this.f3595g = null;
            this.f3599k = false;
            this.f3602n = false;
            this.f3597i = false;
            this.f3603o = false;
            this.f3601m.mike();
            this.f3601m = null;
            this.f3598j = null;
            this.f3596h = null;
            this.silver.alpha(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void juliet(U3.h hVar) {
        try {
            this.purple.alpha();
            o oVar = this.alpha;
            oVar.alpha.remove(new n(hVar, Y3.f.bravo));
            if (this.alpha.alpha.isEmpty()) {
                bravo();
                if (!this.f3597i) {
                    if (this.f3599k) {
                    }
                }
                if (this.f3592c.get() == 0) {
                    india();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void kilo(i iVar) {
        I3.e eVar;
        this.f3601m = iVar;
        int hotel = iVar.hotel(1);
        if (hotel != 2 && hotel != 3) {
            if (this.f3594f) {
                eVar = this.f3591b;
            } else {
                eVar = this.f3590a;
            }
            eVar.execute(iVar);
        }
        eVar = this.yellow;
        eVar.execute(iVar);
    }
}
