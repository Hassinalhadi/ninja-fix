package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.measurement.zzdj;
import com.zendesk.service.HttpConstants;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.measurement.internal.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1480y0 extends AbstractC1481z {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f7689a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C1474v0 f7690b;

    /* renamed from: c, reason: collision with root package name */
    public C1474v0 f7691c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7692d;
    public final Object e;
    public volatile C1474v0 red;
    public volatile C1474v0 silver;
    public C1474v0 teal;
    public final ConcurrentHashMap white;
    public zzdj yellow;

    public C1480y0(G g2) {
        super(g2);
        this.e = new Object();
        this.white = new ConcurrentHashMap();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1481z
    public final boolean Z() {
        return false;
    }

    public final void a0(String str, C1474v0 c1474v0, boolean z2) {
        C1474v0 c1474v02;
        C1474v0 c1474v03;
        String str2;
        if (this.red == null) {
            c1474v02 = this.silver;
        } else {
            c1474v02 = this.red;
        }
        C1474v0 c1474v04 = c1474v02;
        if (c1474v0.bravo == null) {
            if (str != null) {
                str2 = e0(str);
            } else {
                str2 = null;
            }
            c1474v03 = new C1474v0(c1474v0.alpha, str2, c1474v0.charlie, c1474v0.echo, c1474v0.foxtrot);
        } else {
            c1474v03 = c1474v0;
        }
        this.silver = this.red;
        this.red = c1474v03;
        G g2 = (G) this.alpha;
        g2.f7511g.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        E e = g2.f7508c;
        G.foxtrot(e);
        e.g0(new RunnableC1476w0(this, c1474v03, c1474v04, elapsedRealtime, z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(C1474v0 c1474v0, C1474v0 c1474v02, long j5, boolean z2, Bundle bundle) {
        boolean z10;
        boolean z11;
        Bundle bundle2;
        long j6;
        String str;
        long j7;
        W();
        boolean z12 = false;
        if (c1474v02 != null) {
            if (c1474v02.charlie == c1474v0.charlie && Objects.equals(c1474v02.bravo, c1474v0.bravo) && Objects.equals(c1474v02.alpha, c1474v0.alpha)) {
                z10 = false;
                if (z2 && this.teal != null) {
                    z12 = true;
                }
                z11 = c1474v0.echo;
                G g2 = (G) this.alpha;
                if (z10) {
                    if (bundle != null) {
                        bundle2 = new Bundle(bundle);
                    } else {
                        bundle2 = new Bundle();
                    }
                    Bundle bundle3 = bundle2;
                    d1.m0(c1474v0, bundle3, true);
                    if (c1474v02 != null) {
                        String str2 = c1474v02.alpha;
                        if (str2 != null) {
                            bundle3.putString("_pn", str2);
                        }
                        String str3 = c1474v02.bravo;
                        if (str3 != null) {
                            bundle3.putString("_pc", str3);
                        }
                        bundle3.putLong("_pi", c1474v02.charlie);
                    }
                    if (z12) {
                        O0 o02 = g2.f7509d;
                        G.echo(o02);
                        bz.m0 m0Var = o02.white;
                        j6 = 0;
                        long j10 = j5 - m0Var.purple;
                        m0Var.purple = j5;
                        if (j10 > 0) {
                            d1 d1Var = g2.e;
                            G.delta(d1Var);
                            d1Var.k0(bundle3, j10);
                        }
                    } else {
                        j6 = 0;
                    }
                    if (!g2.yellow.k0()) {
                        bundle3.putLong("_mst", 1L);
                    }
                    if (true != z11) {
                        str = "auto";
                    } else {
                        str = "app";
                    }
                    String str4 = str;
                    g2.f7511g.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (z11) {
                        long j11 = c1474v0.foxtrot;
                        if (j11 != j6) {
                            j7 = j11;
                            C1459n0 c1459n0 = g2.f7513i;
                            G.echo(c1459n0);
                            c1459n0.i0(j7, bundle3, str4, "_vs");
                        }
                    }
                    j7 = currentTimeMillis;
                    C1459n0 c1459n02 = g2.f7513i;
                    G.echo(c1459n02);
                    c1459n02.i0(j7, bundle3, str4, "_vs");
                }
                if (z12) {
                    c0(this.teal, true, j5);
                }
                this.teal = c1474v0;
                if (z11) {
                    this.f7691c = c1474v0;
                }
                H0 mike = g2.mike();
                mike.W();
                mike.X();
                mike.n0(new s6.E(13, mike, c1474v0, false));
            }
        }
        z10 = true;
        if (z2) {
            z12 = true;
        }
        z11 = c1474v0.echo;
        G g22 = (G) this.alpha;
        if (z10) {
        }
        if (z12) {
        }
        this.teal = c1474v0;
        if (z11) {
        }
        H0 mike2 = g22.mike();
        mike2.W();
        mike2.X();
        mike2.n0(new s6.E(13, mike2, c1474v0, false));
    }

    public final void c0(C1474v0 c1474v0, boolean z2, long j5) {
        boolean z10;
        G g2 = (G) this.alpha;
        C1464q c1464q = g2.f7514j;
        G.charlie(c1464q);
        g2.f7511g.getClass();
        c1464q.Z(SystemClock.elapsedRealtime());
        if (c1474v0 != null && c1474v0.delta) {
            z10 = true;
        } else {
            z10 = false;
        }
        O0 o02 = g2.f7509d;
        G.echo(o02);
        if (o02.white.echo(j5, z10, z2) && c1474v0 != null) {
            c1474v0.delta = false;
        }
    }

    public final C1474v0 d0(boolean z2) {
        X();
        W();
        if (!z2) {
            return this.teal;
        }
        C1474v0 c1474v0 = this.teal;
        if (c1474v0 != null) {
            return c1474v0;
        }
        return this.f7691c;
    }

    public final String e0(String str) {
        String str2;
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        G g2 = (G) this.alpha;
        g2.yellow.getClass();
        if (length2 > 500) {
            g2.yellow.getClass();
            return str2.substring(0, HttpConstants.HTTP_INTERNAL_ERROR);
        }
        return str2;
    }

    public final void f0(zzdj zzdjVar, Bundle bundle) {
        Bundle bundle2;
        if (((G) this.alpha).yellow.k0() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.white.put(Integer.valueOf(zzdjVar.alpha), new C1474v0(bundle2.getString("name"), bundle2.getLong(Constants.KEY_ID), bundle2.getString("referrer_name")));
        }
    }

    public final C1474v0 g0(zzdj zzdjVar) {
        V5.x.hotel(zzdjVar);
        Integer valueOf = Integer.valueOf(zzdjVar.alpha);
        ConcurrentHashMap concurrentHashMap = this.white;
        C1474v0 c1474v0 = (C1474v0) concurrentHashMap.get(valueOf);
        if (c1474v0 == null) {
            String e02 = e0(zzdjVar.purple);
            d1 d1Var = ((G) this.alpha).e;
            G.delta(d1Var);
            C1474v0 c1474v02 = new C1474v0(null, d1Var.h1(), e02);
            concurrentHashMap.put(valueOf, c1474v02);
            c1474v0 = c1474v02;
        }
        if (this.f7690b != null) {
            return this.f7690b;
        }
        return c1474v0;
    }
}
