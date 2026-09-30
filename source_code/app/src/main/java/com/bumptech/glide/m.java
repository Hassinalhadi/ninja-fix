package com.bumptech.glide;

import R3.s;
import R3.t;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import g1.AbstractC1735d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class m implements ComponentCallbacks2, R3.i {

    /* renamed from: d, reason: collision with root package name */
    public static final U3.g f3607d;
    public static final U3.g e;

    /* renamed from: a, reason: collision with root package name */
    public final R3.b f3608a;
    public final b alpha;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f3609b;

    /* renamed from: c, reason: collision with root package name */
    public U3.g f3610c;
    public final Context purple;
    public final R3.g red;
    public final s silver;
    public final R3.m teal;
    public final t white;
    public final F6.b yellow;

    static {
        U3.g gVar = (U3.g) new U3.a().delta(Bitmap.class);
        gVar.f2124h = true;
        f3607d = gVar;
        U3.g gVar2 = (U3.g) new U3.a().delta(P3.c.class);
        gVar2.f2124h = true;
        e = gVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6, types: [R3.b, R3.i] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [R3.g] */
    public m(b bVar, R3.g gVar, R3.m mVar, Context context) {
        boolean z2;
        ?? r02;
        String str;
        s sVar = new s(2);
        U8.a aVar = bVar.white;
        this.white = new t();
        F6.b bVar2 = new F6.b(17, this);
        this.yellow = bVar2;
        this.alpha = bVar;
        this.red = gVar;
        this.teal = mVar;
        this.silver = sVar;
        this.purple = context;
        Context applicationContext = context.getApplicationContext();
        l lVar = new l(this, sVar);
        aVar.getClass();
        if (AbstractC1735d.alpha(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z2) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z2) {
            r02 = new R3.c(applicationContext, lVar);
        } else {
            r02 = new Object();
        }
        this.f3608a = r02;
        synchronized (bVar.yellow) {
            if (!bVar.yellow.contains(this)) {
                bVar.yellow.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
        char[] cArr = Y3.l.alpha;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            Y3.l.foxtrot().post(bVar2);
        } else {
            gVar.alpha(this);
        }
        gVar.alpha(r02);
        this.f3609b = new CopyOnWriteArrayList(bVar.red.echo);
        tango(bVar.red.alpha());
    }

    @Override // R3.i
    public final synchronized void alpha() {
        this.white.alpha();
        romeo();
    }

    @Override // R3.i
    public final synchronized void bravo() {
        this.white.bravo();
        oscar();
        s sVar = this.silver;
        Iterator it = Y3.l.echo((Set) sVar.red).iterator();
        while (it.hasNext()) {
            sVar.charlie((U3.c) it.next());
        }
        ((HashSet) sVar.silver).clear();
        this.red.charlie(this);
        this.red.charlie(this.f3608a);
        Y3.l.foxtrot().removeCallbacks(this.yellow);
        this.alpha.delta(this);
    }

    @Override // R3.i
    public final synchronized void charlie() {
        sierra();
        this.white.charlie();
    }

    public final j foxtrot() {
        return new j(this.alpha, this, Bitmap.class, this.purple).alpha(f3607d);
    }

    public final j hotel() {
        return new j(this.alpha, this, P3.c.class, this.purple).alpha(e);
    }

    public final void india(V3.e eVar) {
        if (eVar != null) {
            boolean uniform = uniform(eVar);
            U3.c lima = eVar.lima();
            if (!uniform) {
                b bVar = this.alpha;
                synchronized (bVar.yellow) {
                    try {
                        Iterator it = bVar.yellow.iterator();
                        while (it.hasNext()) {
                            if (((m) it.next()).uniform(eVar)) {
                                return;
                            }
                        }
                        if (lima != null) {
                            eVar.echo(null);
                            lima.clear();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
    }

    public final synchronized void oscar() {
        try {
            Iterator it = Y3.l.echo(this.white.alpha).iterator();
            while (it.hasNext()) {
                india((V3.e) it.next());
            }
            this.white.alpha.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final j papa(Integer num) {
        return new j(this.alpha, this, Drawable.class, this.purple).bronze(num);
    }

    public final j quebec(String str) {
        return new j(this.alpha, this, Drawable.class, this.purple).crimson(str);
    }

    public final synchronized void romeo() {
        s sVar = this.silver;
        sVar.purple = true;
        Iterator it = Y3.l.echo((Set) sVar.red).iterator();
        while (it.hasNext()) {
            U3.c cVar = (U3.c) it.next();
            if (cVar.isRunning()) {
                cVar.pause();
                ((HashSet) sVar.silver).add(cVar);
            }
        }
    }

    public final synchronized void sierra() {
        s sVar = this.silver;
        sVar.purple = false;
        Iterator it = Y3.l.echo((Set) sVar.red).iterator();
        while (it.hasNext()) {
            U3.c cVar = (U3.c) it.next();
            if (!cVar.isComplete() && !cVar.isRunning()) {
                cVar.india();
            }
        }
        ((HashSet) sVar.silver).clear();
    }

    public final synchronized void tango(U3.g gVar) {
        U3.g gVar2 = (U3.g) gVar.clone();
        if (gVar2.f2124h && !gVar2.f2126j) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        gVar2.f2126j = true;
        gVar2.f2124h = true;
        this.f3610c = gVar2;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.silver + ", treeNode=" + this.teal + "}";
    }

    public final synchronized boolean uniform(V3.e eVar) {
        U3.c lima = eVar.lima();
        if (lima == null) {
            return true;
        }
        if (this.silver.charlie(lima)) {
            this.white.alpha.remove(eVar);
            eVar.echo(null);
            return true;
        }
        return false;
    }
}
