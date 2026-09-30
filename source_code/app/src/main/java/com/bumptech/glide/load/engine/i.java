package com.bumptech.glide.load.engine;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.P0;
import ao.ad;
import com.google.maps.android.BuildConfig;
import id.C1915c;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class i implements d, Runnable, Comparable, Z3.b {

    /* renamed from: a, reason: collision with root package name */
    public com.bumptech.glide.f f3566a;

    /* renamed from: b, reason: collision with root package name */
    public E3.f f3567b;

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.g f3568c;

    /* renamed from: d, reason: collision with root package name */
    public q f3569d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f3570f;

    /* renamed from: g, reason: collision with root package name */
    public k f3571g;

    /* renamed from: h, reason: collision with root package name */
    public E3.i f3572h;

    /* renamed from: i, reason: collision with root package name */
    public p f3573i;

    /* renamed from: j, reason: collision with root package name */
    public int f3574j;

    /* renamed from: k, reason: collision with root package name */
    public long f3575k;

    /* renamed from: l, reason: collision with root package name */
    public Object f3576l;

    /* renamed from: m, reason: collision with root package name */
    public Thread f3577m;

    /* renamed from: n, reason: collision with root package name */
    public E3.f f3578n;

    /* renamed from: o, reason: collision with root package name */
    public E3.f f3579o;

    /* renamed from: p, reason: collision with root package name */
    public Object f3580p;

    /* renamed from: q, reason: collision with root package name */
    public E3.a f3581q;

    /* renamed from: r, reason: collision with root package name */
    public com.bumptech.glide.load.data.e f3582r;

    /* renamed from: s, reason: collision with root package name */
    public volatile e f3583s;
    public final com.google.android.gms.common.f silver;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f3584t;
    public final J2.t teal;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f3585u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3586v;

    /* renamed from: w, reason: collision with root package name */
    public int f3587w;

    /* renamed from: x, reason: collision with root package name */
    public int f3588x;
    public final f alpha = new f();
    public final ArrayList purple = new ArrayList();
    public final Z3.e red = new Object();
    public final h white = new h(0, false);
    public final W7.a yellow = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [Z3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, W7.a] */
    public i(com.google.android.gms.common.f fVar, J2.t tVar) {
        this.silver = fVar;
        this.teal = tVar;
    }

    @Override // com.bumptech.glide.load.engine.d
    public final void alpha(E3.f fVar, Exception exc, com.bumptech.glide.load.data.e eVar, E3.a aVar) {
        eVar.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(fVar, aVar, eVar.alpha());
        this.purple.add(glideException);
        if (Thread.currentThread() != this.f3577m) {
            oscar(2);
        } else {
            papa();
        }
    }

    @Override // com.bumptech.glide.load.engine.d
    public final void bravo(E3.f fVar, Object obj, com.bumptech.glide.load.data.e eVar, E3.a aVar, E3.f fVar2) {
        this.f3578n = fVar;
        this.f3580p = obj;
        this.f3582r = eVar;
        this.f3581q = aVar;
        this.f3579o = fVar2;
        boolean z2 = false;
        if (fVar != this.alpha.alpha().get(0)) {
            z2 = true;
        }
        this.f3586v = z2;
        if (Thread.currentThread() != this.f3577m) {
            oscar(3);
        } else {
            foxtrot();
        }
    }

    @Override // Z3.b
    public final Z3.e charlie() {
        return this.red;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        int ordinal = this.f3568c.ordinal() - iVar.f3568c.ordinal();
        if (ordinal == 0) {
            return this.f3574j - iVar.f3574j;
        }
        return ordinal;
    }

    public final w delta(com.bumptech.glide.load.data.e eVar, Object obj, E3.a aVar) {
        if (obj == null) {
            return null;
        }
        try {
            int i4 = Y3.h.bravo;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            w echo = echo(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                india("Decoded result " + echo, elapsedRealtimeNanos, null);
            }
            return echo;
        } finally {
            eVar.cleanup();
        }
    }

    public final w echo(Object obj, E3.a aVar) {
        boolean z2;
        Class<?> cls = obj.getClass();
        f fVar = this.alpha;
        u charlie = fVar.charlie(cls);
        E3.i iVar = this.f3572h;
        if (Build.VERSION.SDK_INT >= 26) {
            if (aVar != E3.a.silver && !fVar.romeo) {
                z2 = false;
            } else {
                z2 = true;
            }
            E3.h hVar = com.bumptech.glide.load.resource.bitmap.o.india;
            Boolean bool = (Boolean) iVar.charlie(hVar);
            if (bool == null || (bool.booleanValue() && !z2)) {
                iVar = new E3.i();
                E3.i iVar2 = this.f3572h;
                Y3.c cVar = iVar.bravo;
                cVar.golf(iVar2.bravo);
                cVar.put(hVar, Boolean.valueOf(z2));
            }
        }
        E3.i iVar3 = iVar;
        com.bumptech.glide.load.data.g hotel = this.f3566a.bravo().hotel(obj);
        try {
            return charlie.alpha(this.e, this.f3570f, iVar3, hotel, new g(this, aVar));
        } finally {
            hotel.cleanup();
        }
    }

    public final void foxtrot() {
        w wVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            india("Retrieved data", this.f3575k, "data: " + this.f3580p + ", cache key: " + this.f3578n + ", fetcher: " + this.f3582r);
        }
        v vVar = null;
        try {
            wVar = delta(this.f3582r, this.f3580p, this.f3581q);
        } catch (GlideException e) {
            e.setLoggingDetails(this.f3579o, this.f3581q);
            this.purple.add(e);
            wVar = null;
        }
        if (wVar != null) {
            E3.a aVar = this.f3581q;
            boolean z2 = this.f3586v;
            if (wVar instanceof t) {
                ((t) wVar).alpha();
            }
            boolean z10 = true;
            if (((v) this.white.silver) != null) {
                vVar = (v) v.teal.charlie();
                vVar.silver = false;
                vVar.red = true;
                vVar.purple = wVar;
                wVar = vVar;
            }
            romeo();
            p pVar = this.f3573i;
            synchronized (pVar) {
                pVar.f3595g = wVar;
                pVar.f3596h = aVar;
                pVar.f3603o = z2;
            }
            pVar.hotel();
            this.f3587w = 5;
            try {
                h hVar = this.white;
                if (((v) hVar.silver) == null) {
                    z10 = false;
                }
                if (z10) {
                    com.google.android.gms.common.f fVar = this.silver;
                    E3.i iVar = this.f3572h;
                    hVar.getClass();
                    try {
                        fVar.alpha().hotel((E3.f) hVar.purple, new C1915c((E3.l) hVar.red, (v) hVar.silver, iVar, 27));
                        ((v) hVar.silver).alpha();
                    } catch (Throwable th) {
                        ((v) hVar.silver).alpha();
                        throw th;
                    }
                }
                kilo();
                return;
            } finally {
                if (vVar != null) {
                    vVar.alpha();
                }
            }
        }
        papa();
    }

    public final e golf() {
        int mike = av.q.mike(this.f3587w);
        f fVar = this.alpha;
        if (mike != 1) {
            if (mike != 2) {
                if (mike != 3) {
                    if (mike == 5) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: ".concat(ad.ivory(this.f3587w)));
                }
                return new aa(fVar, this);
            }
            return new b(fVar.alpha(), fVar, this);
        }
        return new x(fVar, this);
    }

    public final int hotel(int i4) {
        boolean z2;
        boolean z10;
        int mike = av.q.mike(i4);
        if (mike != 0) {
            if (mike != 1) {
                if (mike != 2) {
                    if (mike != 3 && mike != 5) {
                        throw new IllegalArgumentException("Unrecognized stage: ".concat(ad.ivory(i4)));
                    }
                    return 6;
                }
                return 4;
            }
            switch (this.f3571g.alpha) {
                case 0:
                    z10 = false;
                    break;
                case 1:
                default:
                    z10 = true;
                    break;
            }
            if (z10) {
                return 3;
            }
            return hotel(3);
        }
        switch (this.f3571g.alpha) {
            case 0:
            case 1:
                z2 = false;
                break;
            default:
                z2 = true;
                break;
        }
        if (z2) {
            return 2;
        }
        return hotel(2);
    }

    public final void india(String str, long j5, String str2) {
        String str3;
        StringBuilder beige = ad.beige(str, " in ");
        beige.append(Y3.h.alpha(j5));
        beige.append(", load key: ");
        beige.append(this.f3569d);
        if (str2 != null) {
            str3 = ", ".concat(str2);
        } else {
            str3 = "";
        }
        beige.append(str3);
        beige.append(", thread: ");
        beige.append(Thread.currentThread().getName());
        Log.v("DecodeJob", beige.toString());
    }

    public final void juliet() {
        romeo();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.purple));
        p pVar = this.f3573i;
        synchronized (pVar) {
            pVar.f3598j = glideException;
        }
        pVar.golf();
        lima();
    }

    public final void kilo() {
        boolean alpha;
        W7.a aVar = this.yellow;
        synchronized (aVar) {
            aVar.bravo = true;
            alpha = aVar.alpha();
        }
        if (alpha) {
            november();
        }
    }

    public final void lima() {
        boolean alpha;
        W7.a aVar = this.yellow;
        synchronized (aVar) {
            aVar.charlie = true;
            alpha = aVar.alpha();
        }
        if (alpha) {
            november();
        }
    }

    public final void mike() {
        boolean alpha;
        W7.a aVar = this.yellow;
        synchronized (aVar) {
            aVar.alpha = true;
            alpha = aVar.alpha();
        }
        if (alpha) {
            november();
        }
    }

    public final void november() {
        W7.a aVar = this.yellow;
        synchronized (aVar) {
            aVar.bravo = false;
            aVar.alpha = false;
            aVar.charlie = false;
        }
        h hVar = this.white;
        hVar.purple = null;
        hVar.red = null;
        hVar.silver = null;
        f fVar = this.alpha;
        fVar.charlie = null;
        fVar.delta = null;
        fVar.november = null;
        fVar.golf = null;
        fVar.kilo = null;
        fVar.india = null;
        fVar.oscar = null;
        fVar.juliet = null;
        fVar.papa = null;
        fVar.alpha.clear();
        fVar.lima = false;
        fVar.bravo.clear();
        fVar.mike = false;
        this.f3584t = false;
        this.f3566a = null;
        this.f3567b = null;
        this.f3572h = null;
        this.f3568c = null;
        this.f3569d = null;
        this.f3573i = null;
        this.f3587w = 0;
        this.f3583s = null;
        this.f3577m = null;
        this.f3578n = null;
        this.f3580p = null;
        this.f3581q = null;
        this.f3582r = null;
        this.f3575k = 0L;
        this.f3585u = false;
        this.f3576l = null;
        this.purple.clear();
        this.teal.alpha(this);
    }

    public final void oscar(int i4) {
        I3.e eVar;
        this.f3588x = i4;
        p pVar = this.f3573i;
        if (pVar.f3594f) {
            eVar = pVar.f3591b;
        } else {
            eVar = pVar.f3590a;
        }
        eVar.execute(this);
    }

    public final void papa() {
        this.f3577m = Thread.currentThread();
        int i4 = Y3.h.bravo;
        this.f3575k = SystemClock.elapsedRealtimeNanos();
        boolean z2 = false;
        while (!this.f3585u && this.f3583s != null && !(z2 = this.f3583s.charlie())) {
            this.f3587w = hotel(this.f3587w);
            this.f3583s = golf();
            if (this.f3587w == 4) {
                oscar(2);
                return;
            }
        }
        if ((this.f3587w == 6 || this.f3585u) && !z2) {
            juliet();
        }
    }

    public final void quebec() {
        String str;
        int mike = av.q.mike(this.f3588x);
        if (mike != 0) {
            if (mike != 1) {
                if (mike == 2) {
                    foxtrot();
                    return;
                }
                int i4 = this.f3588x;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            str = BuildConfig.TRAVIS;
                        } else {
                            str = "DECODE_DATA";
                        }
                    } else {
                        str = "SWITCH_TO_SOURCE_SERVICE";
                    }
                } else {
                    str = "INITIALIZE";
                }
                throw new IllegalStateException("Unrecognized run reason: ".concat(str));
            }
            papa();
            return;
        }
        this.f3587w = hotel(1);
        this.f3583s = golf();
        papa();
    }

    public final void romeo() {
        Throwable th;
        this.red.alpha();
        if (this.f3584t) {
            if (this.purple.isEmpty()) {
                th = null;
            } else {
                th = (Throwable) P0.amber(1, this.purple);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f3584t = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.f3582r;
        try {
            try {
                if (this.f3585u) {
                    juliet();
                    if (eVar != null) {
                        eVar.cleanup();
                        return;
                    }
                    return;
                }
                quebec();
                if (eVar != null) {
                    eVar.cleanup();
                }
            } catch (Throwable th) {
                if (eVar != null) {
                    eVar.cleanup();
                }
                throw th;
            }
        } catch (CallbackException e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f3585u + ", stage: " + ad.ivory(this.f3587w), th2);
            }
            if (this.f3587w != 5) {
                this.purple.add(th2);
                juliet();
            }
            if (!this.f3585u) {
                throw th2;
            }
            throw th2;
        }
    }
}
