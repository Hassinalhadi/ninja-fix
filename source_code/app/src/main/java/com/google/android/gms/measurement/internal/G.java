package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC1325h1;
import com.google.android.gms.internal.measurement.C1290a1;
import com.google.android.gms.internal.measurement.C1320g1;
import com.google.android.gms.internal.measurement.J1;
import com.google.android.gms.internal.measurement.zzdh;
import e6.C1629a;
import g6.C1754b;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import r7.C2503e;

/* loaded from: classes2.dex */
public final class G implements Q {
    public static volatile G A;

    /* renamed from: a, reason: collision with root package name */
    public final ax f7506a;
    public final Context alpha;

    /* renamed from: b, reason: collision with root package name */
    public final ar f7507b;

    /* renamed from: c, reason: collision with root package name */
    public final E f7508c;

    /* renamed from: d, reason: collision with root package name */
    public final O0 f7509d;
    public final d1 e;

    /* renamed from: f, reason: collision with root package name */
    public final am f7510f;

    /* renamed from: g, reason: collision with root package name */
    public final C1629a f7511g;

    /* renamed from: h, reason: collision with root package name */
    public final C1480y0 f7512h;

    /* renamed from: i, reason: collision with root package name */
    public final C1459n0 f7513i;

    /* renamed from: j, reason: collision with root package name */
    public final C1464q f7514j;

    /* renamed from: k, reason: collision with root package name */
    public final C1466r0 f7515k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7516l;

    /* renamed from: m, reason: collision with root package name */
    public al f7517m;

    /* renamed from: n, reason: collision with root package name */
    public H0 f7518n;

    /* renamed from: o, reason: collision with root package name */
    public C1456m f7519o;

    /* renamed from: p, reason: collision with root package name */
    public aj f7520p;
    public final String purple;

    /* renamed from: q, reason: collision with root package name */
    public C1468s0 f7521q;
    public final String red;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f7523s;
    public final String silver;

    /* renamed from: t, reason: collision with root package name */
    public long f7524t;
    public final boolean teal;

    /* renamed from: u, reason: collision with root package name */
    public volatile Boolean f7525u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f7526v;

    /* renamed from: w, reason: collision with root package name */
    public int f7527w;
    public final r6.u white;

    /* renamed from: x, reason: collision with root package name */
    public int f7528x;
    public final C1440e yellow;

    /* renamed from: z, reason: collision with root package name */
    public final long f7530z;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7522r = false;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicInteger f7529y = new AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        throw r11;
     */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.google.android.gms.measurement.internal.e, G3.a] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.measurement.internal.r0, com.google.android.gms.measurement.internal.P] */
    /* JADX WARN: Type inference failed for: r6v4, types: [r7.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public G(Y y10) {
        long currentTimeMillis;
        C2503e c2503e;
        Context context = y10.alpha;
        r6.u uVar = new r6.u(19);
        this.white = uVar;
        W.kilo = uVar;
        this.alpha = context;
        this.purple = y10.bravo;
        this.red = y10.charlie;
        this.silver = y10.delta;
        this.teal = y10.hotel;
        this.f7525u = y10.echo;
        this.f7516l = y10.juliet;
        this.f7526v = true;
        if (C1320g1.hotel == null && context != null) {
            Object obj = C1320g1.golf;
            synchronized (obj) {
                try {
                    if (C1320g1.hotel == null) {
                        synchronized (obj) {
                            com.google.android.gms.internal.measurement.W0 w02 = C1320g1.hotel;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context;
                            }
                            if (w02 == null || w02.alpha != applicationContext) {
                                if (w02 != null) {
                                    com.google.android.gms.internal.measurement.X0.charlie();
                                    AbstractC1325h1.alpha();
                                    C1290a1.lima();
                                }
                                J1 j12 = new J1(applicationContext);
                                if (j12 instanceof Serializable) {
                                    c2503e = new C2503e(j12);
                                } else {
                                    ?? obj2 = new Object();
                                    obj2.alpha = j12;
                                    c2503e = obj2;
                                }
                                C1320g1.hotel = new com.google.android.gms.internal.measurement.W0(applicationContext, c2503e);
                                C1320g1.india.incrementAndGet();
                            }
                        }
                    }
                } finally {
                }
            }
        }
        this.f7511g = C1629a.alpha;
        Long l10 = y10.india;
        if (l10 != null) {
            currentTimeMillis = l10.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f7530z = currentTimeMillis;
        ?? aVar = new G3.a(this);
        aVar.silver = new u8.b(19);
        this.yellow = aVar;
        ax axVar = new ax(this);
        axVar.Z();
        this.f7506a = axVar;
        ar arVar = new ar(this);
        arVar.Z();
        this.f7507b = arVar;
        d1 d1Var = new d1(this);
        d1Var.Z();
        this.e = d1Var;
        this.f7510f = new am(new ay(this));
        this.f7514j = new C1464q(this);
        C1480y0 c1480y0 = new C1480y0(this);
        c1480y0.Y();
        this.f7512h = c1480y0;
        C1459n0 c1459n0 = new C1459n0(this);
        c1459n0.Y();
        this.f7513i = c1459n0;
        O0 o02 = new O0(this);
        o02.Y();
        this.f7509d = o02;
        ?? p4 = new P(this);
        p4.Z();
        this.f7515k = p4;
        E e = new E(this);
        e.Z();
        this.f7508c = e;
        zzdh zzdhVar = y10.golf;
        boolean z2 = zzdhVar == null || zzdhVar.purple == 0;
        if (context.getApplicationContext() instanceof Application) {
            echo(c1459n0);
            if (((G) c1459n0.alpha).alpha.getApplicationContext() instanceof Application) {
                Application application = (Application) ((G) c1459n0.alpha).alpha.getApplicationContext();
                if (c1459n0.red == null) {
                    c1459n0.red = new C1457m0(c1459n0);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(c1459n0.red);
                    application.registerActivityLifecycleCallbacks(c1459n0.red);
                    ar arVar2 = ((G) c1459n0.alpha).f7507b;
                    foxtrot(arVar2);
                    arVar2.f7636g.alpha("Registered activity lifecycle callback");
                }
            }
        } else {
            foxtrot(arVar);
            arVar.f7632b.alpha("Application context is not an Application");
        }
        e.g0(new be.g(9, this, y10, false));
    }

    public static final void charlie(AbstractC1479y abstractC1479y) {
        if (abstractC1479y != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void delta(G3.a aVar) {
        if (aVar != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void echo(AbstractC1481z abstractC1481z) {
        if (abstractC1481z != null) {
            if (abstractC1481z.purple) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC1481z.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    public static final void foxtrot(P p4) {
        if (p4 != null) {
            if (p4.purple) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(p4.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    public static G lima(Context context, zzdh zzdhVar, Long l10) {
        Bundle bundle;
        if (zzdhVar != null && (zzdhVar.teal == null || zzdhVar.white == null)) {
            zzdhVar = new zzdh(zzdhVar.alpha, zzdhVar.purple, zzdhVar.red, zzdhVar.silver, null, null, zzdhVar.yellow, null);
        }
        V5.x.hotel(context);
        V5.x.hotel(context.getApplicationContext());
        if (A == null) {
            synchronized (G.class) {
                try {
                    if (A == null) {
                        A = new G(new Y(context, zzdhVar, l10));
                    }
                } finally {
                }
            }
        } else if (zzdhVar != null && (bundle = zzdhVar.yellow) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            V5.x.hotel(A);
            A.f7525u = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        V5.x.hotel(A);
        return A;
    }

    public final boolean alpha() {
        if (golf() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.f7524t) > 1000) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean bravo() {
        boolean z2;
        if (this.f7522r) {
            E e = this.f7508c;
            foxtrot(e);
            e.W();
            Boolean bool = this.f7523s;
            C1629a c1629a = this.f7511g;
            if (bool != null && this.f7524t != 0) {
                if (!bool.booleanValue()) {
                    c1629a.getClass();
                }
                return this.f7523s.booleanValue();
            }
            c1629a.getClass();
            this.f7524t = SystemClock.elapsedRealtime();
            d1 d1Var = this.e;
            delta(d1Var);
            boolean L02 = d1Var.L0("android.permission.INTERNET");
            C1440e c1440e = this.yellow;
            boolean z10 = true;
            if (L02 && d1Var.L0("android.permission.ACCESS_NETWORK_STATE")) {
                Context context = this.alpha;
                if (C1754b.alpha(context).foxtrot() || c1440e.Z() || (d1.S0(context) && d1.U0(context))) {
                    z2 = true;
                    this.f7523s = Boolean.valueOf(z2);
                    if (z2) {
                        if (!d1Var.F0(india().d0(), india().b0()) && (c1440e.j0(null, ac.f7601i0) || TextUtils.isEmpty(india().b0()))) {
                            z10 = false;
                        }
                        this.f7523s = Boolean.valueOf(z10);
                    }
                    return this.f7523s.booleanValue();
                }
            }
            z2 = false;
            this.f7523s = Boolean.valueOf(z2);
            if (z2) {
            }
            return this.f7523s.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public final ar crimson() {
        ar arVar = this.f7507b;
        foxtrot(arVar);
        return arVar;
    }

    public final int golf() {
        Boolean bool;
        E e = this.f7508c;
        foxtrot(e);
        e.W();
        C1440e c1440e = this.yellow;
        if (c1440e.X()) {
            return 1;
        }
        foxtrot(e);
        e.W();
        if (this.f7526v) {
            ax axVar = this.f7506a;
            delta(axVar);
            axVar.W();
            if (axVar.b0().contains("measurement_enabled")) {
                bool = Boolean.valueOf(axVar.b0().getBoolean("measurement_enabled", true));
            } else {
                bool = null;
            }
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return 3;
                }
                return 0;
            }
            r6.u uVar = ((G) c1440e.alpha).white;
            Boolean h02 = c1440e.h0("firebase_analytics_collection_enabled");
            if (h02 != null) {
                if (!h02.booleanValue()) {
                    return 4;
                }
                return 0;
            }
            if (this.f7525u != null && !this.f7525u.booleanValue()) {
                return 7;
            }
            return 0;
        }
        return 8;
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public final Context green() {
        return this.alpha;
    }

    public final C1456m hotel() {
        foxtrot(this.f7519o);
        return this.f7519o;
    }

    public final aj india() {
        echo(this.f7520p);
        return this.f7520p;
    }

    public final al juliet() {
        echo(this.f7517m);
        return this.f7517m;
    }

    public final am kilo() {
        return this.f7510f;
    }

    public final H0 mike() {
        echo(this.f7518n);
        return this.f7518n;
    }

    public final String november() {
        if (this.yellow.j0(null, ac.f7601i0)) {
            return null;
        }
        return this.purple;
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public final C1629a pink() {
        return this.f7511g;
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public final E u() {
        E e = this.f7508c;
        foxtrot(e);
        return e;
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public final r6.u victor() {
        return this.white;
    }
}
